package top.yangwulang.platform.config.j2cache.cache.support.redis;

import cn.hutool.extra.spring.SpringUtil;
import net.oschina.j2cache.*;
import org.springframework.data.redis.core.RedisTemplate;
import top.yangwulang.platform.config.j2cache.cache.J2CacheProperties;

import java.util.Collection;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yangwulang
 */
public class SpringRedisProvider implements CacheProvider {
    private String namespace;
    private RedisTemplate<String, Object> redisTemplate;
    private String storage;
    protected ConcurrentHashMap<String, Cache> caches = new ConcurrentHashMap<>();

    @Override
    public void start(Properties props) {
        this.namespace = props.getProperty("namespace");
        this.storage = props.getProperty("storage");
//        if (Global.TRUE.equals(Global.getProperty("spring.cache.isClusterMode", Global.FALSE))) {
        J2CacheProperties bean = SpringUtil.getBean(J2CacheProperties.class);
        if (bean.isClusterMode()) {
            this.redisTemplate = SpringUtil.getBean("j2CacheRedisTemplate");
        }
//        }
    }

    @Override
    public void stop() {
    }

    @Override
    public String name() {
        return "redis";
    }

    @Override
    public int level() {
        return 2;
    }

    @Override
    public Collection<CacheChannel.Region> regions() {
        return Collections.emptyList();
    }

    @Override
    public Cache buildCache(String region, long timeToLiveInSeconds, CacheExpiredListener listener) {
        return this.buildCache(region, listener);
    }


    @Override
    public Cache buildCache(String region, CacheExpiredListener listener) {
//        if (!Global.TRUE.equals(Global.getProperty("spring.cache.isClusterMode", Global.FALSE))) {
//            return new NullCache();
//        } else {
        J2CacheProperties bean = SpringUtil.getBean(J2CacheProperties.class);
        if (!bean.isClusterMode()) {
            return new NullCache();
        }
        Cache cache = this.caches.get(region);
        if (cache == null) {
            synchronized (SpringRedisProvider.class) {
                if ((cache = this.caches.get(region)) == null) {
                    if ("hash".equalsIgnoreCase(this.storage)) {
                        cache = new SpringRedisCache(this.namespace, region, this.redisTemplate);
                    } else {
                        cache = new SpringRedisGenericCache(this.namespace, region, this.redisTemplate);
                    }

                    this.caches.put(region, cache);
                }
                return cache;
            }
        } else {
            return cache;
        }
//        }
    }
}
