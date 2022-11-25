package top.yangwulang.platform.config.j2cache.cache.support.redis;
/*

import net.oschina.j2cache.Level2Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

*/
/**
 * @author yangwulang
 *//*

public class SpringRedisGenericCache implements Level2Cache {
    private final RedisTemplate<String, Object> redisTemplate;
    private final String namespace;
    private final String region;
    private static final Logger log = LoggerFactory.getLogger(SpringRedisGenericCache.class);

    @Override
    public void setBytes(String key, byte[] bytes) {
        this.redisTemplate.execute((RedisConnection connection) -> {
            connection.set(this.regionBytes(key), bytes);
            return null;
        });
    }

    @Override
    public void clear() {
        this.keys().forEach((a) -> {
            this.redisTemplate.delete(this.region + ":" + a);
        });
    }

    @Override
    public void setBytes(Map<String, byte[]> bytes, long timeToLiveInSeconds) {
        bytes.forEach((String key, byte[] byteArr) -> {
            this.setBytes(key, byteArr, timeToLiveInSeconds);
        });
    }

    private String buildRegion(String namespace) {
        if (this.namespace != null && !this.namespace.isEmpty()) {
            namespace = this.namespace + ":" + namespace;
        }
        return namespace;
    }

    private byte[] regionBytes(String a) {
        try {
            return (this.region + ":" + a).getBytes(StandardCharsets.UTF_8);
        } catch (Exception var4) {
            var4.printStackTrace();
            return (this.region + ":" + a).getBytes();
        }
    }

    @Override
    public void setBytes(Map<String, byte[]> bytes) {
        bytes.forEach(this::setBytes);
    }

    public SpringRedisGenericCache(String namespace, String region, RedisTemplate<String, Object> redisTemplate) {
        if (region == null || region.isEmpty()) {
            region = "_";
        }

        this.namespace = namespace;
        this.redisTemplate = redisTemplate;
        this.region = this.buildRegion(region);
    }

    @Override
    public void evict(String... keys) {
        for (String key : keys) {
            this.redisTemplate.execute((RedisConnection connection) -> {
                byte[][] byteArr = new byte[1][];
                byteArr[0] = this.regionBytes(key);
                return connection.del(byteArr);
            });
        }
    }

    @Override
    public boolean exists(String key) {
        return Boolean.TRUE.equals(this.redisTemplate.execute((RedisConnection connection) -> connection.exists(this.regionBytes(key))));
    }

    @Override
    public byte[] getBytes(String key) {
        return this.redisTemplate.execute((RedisConnection connection) -> connection.get(this.regionBytes(key)));
    }

    @Override
    public Collection<String> keys() {
        SpringRedisGenericCache that = this;
        return Objects.requireNonNull(this.redisTemplate.keys(this.region + ":*"))
                .stream()
                .map((a) -> a.substring(that.region.length() + 1))
                .collect(Collectors.toSet());
    }

    @Override
    public void setBytes(String key, byte[] bytes, long timeToLiveInSeconds) {
        if (timeToLiveInSeconds <= 0L) {
            log.debug(String.format("Invalid timeToLiveInSeconds value : %d , skipped it.", timeToLiveInSeconds));
            this.setBytes(key, bytes);
        } else {
            this.redisTemplate.execute((RedisConnection connection) -> {
                connection.setEx(this.regionBytes(key), timeToLiveInSeconds, bytes);
                return null;
            });
        }
    }

    @Override
    public List<byte[]> getBytes(Collection<String> keys) {
        SpringRedisGenericCache that = this;
        return this.redisTemplate.execute((RedisConnection connection) -> {
            byte[][] bytes = keys.stream().map(that::regionBytes).toArray(byte[][]::new);
            return connection.mGet(bytes);
        });
    }
}*/
