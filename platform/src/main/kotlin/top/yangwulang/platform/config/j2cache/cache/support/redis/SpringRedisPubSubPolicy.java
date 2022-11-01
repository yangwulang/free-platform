package top.yangwulang.platform.config.j2cache.cache.support.redis;

import cn.hutool.extra.spring.SpringUtil;
import net.oschina.j2cache.CacheProviderHolder;
import net.oschina.j2cache.Command;
import net.oschina.j2cache.J2CacheConfig;
import net.oschina.j2cache.cluster.ClusterPolicy;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import top.yangwulang.platform.config.j2cache.cache.J2CacheProperties;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Properties;

/**
 * @author yangwulang
 */
public class SpringRedisPubSubPolicy implements ClusterPolicy {
    private CacheProviderHolder holder;
    private static boolean l2CacheOpen = true;
    private RedisTemplate<String, Object> redisTemplate;
    private final int LOCAL_COMMAND_ID = Command.genRandomSrc();
    private String channel = "j2cache_channel";
    private static String cacheCleanMode = "passive";
    private static boolean isActive;


    @Override
    public void connect(Properties props, CacheProviderHolder holder) {
        this.holder = holder;
//        if (!Global.TRUE.equals(Global.getProperty("spring.cache.isClusterMode", Global.FALSE))) {
//            l2CacheOpen = false;
//        } else {
        J2CacheProperties bean = SpringUtil.getBean(J2CacheProperties.class);
        if (!bean.isClusterMode()) {
            l2CacheOpen = false;
        } else {
            J2CacheConfig j2CacheConfig = SpringUtil.getBean(J2CacheConfig.class);
            this.redisTemplate = SpringUtil.getBean("j2CacheRedisTemplate");
            String channel = j2CacheConfig.getL2CacheProperties().getProperty("channel");
            if (channel != null && !channel.isEmpty()) {
                this.channel = channel;
            }

            RedisMessageListenerContainer redisMessageListenerContainer = SpringUtil.getBean("j2CacheRedisMessageListenerContainer");
            String l2Namespace = j2CacheConfig.getL2CacheProperties().getProperty("namespace");
            String l2Database = j2CacheConfig.getL2CacheProperties().getProperty("database");
            String namespaceKey = "__keyevent@" + (l2Namespace != null && !"".equals(l2Namespace) ? l2Namespace : "0") + "__:expired";
            String databaseKey = "__keyevent@" + (l2Database != null && !"".equals(l2Database) ? l2Database : "0") + "__:del";

            ArrayList<PatternTopic> patternTopics = new ArrayList<>();
            patternTopics.add(new PatternTopic(namespaceKey));
            patternTopics.add(new PatternTopic(databaseKey));
            String cacheClearMode = props.getProperty("cache_clean_mode");
            if (StringUtils.isNotBlank(cacheClearMode)) {
                cacheCleanMode = cacheClearMode;
            }

            if ("active".equals(cacheCleanMode)) {
                isActive = true;
                (new ConfigureNotifyKeyspaceEventsAction()).config(Objects.requireNonNull(redisMessageListenerContainer.getConnectionFactory()).getConnection());
                redisMessageListenerContainer.addMessageListener(new SpringRedisActiveMessageListener(this, l2Namespace), patternTopics);
            } else if ("blend".equals(cacheCleanMode)) {
                (new ConfigureNotifyKeyspaceEventsAction()).config(Objects.requireNonNull(redisMessageListenerContainer.getConnectionFactory()).getConnection());
                redisMessageListenerContainer.addMessageListener(new SpringRedisActiveMessageListener(this, this.channel), patternTopics);
                redisMessageListenerContainer.addMessageListener(new SpringRedisMessageListener(this, this.channel), new PatternTopic(this.channel));
            } else {
                redisMessageListenerContainer.addMessageListener(new SpringRedisMessageListener(this, this.channel), new PatternTopic(this.channel));
            }
        }
    }

    @Override
    public void evict(String region, String... keys) {
        this.holder.getLevel1Cache(region).evict(keys);
    }

    @Override
    public void clear(String region) {
        this.holder.getLevel1Cache(region).clear();
    }

    @Override
    public boolean isLocalCommand(Command cmd) {
        return cmd.getSrc() == this.LOCAL_COMMAND_ID;
    }

    static {
        isActive = false;
    }

    @Override
    public void publish(Command cmd) {
        if (!isActive && l2CacheOpen) {
            cmd.setSrc(this.LOCAL_COMMAND_ID);
            this.redisTemplate.convertAndSend(this.channel, cmd.json());
        }

    }

    @Override
    public void disconnect() {
        if (!isActive && l2CacheOpen) {
            Command a = new Command();
            a.setSrc(this.LOCAL_COMMAND_ID);
            a.setOperator(4);
            this.redisTemplate.convertAndSend(this.channel, a.json());
        }

    }
}