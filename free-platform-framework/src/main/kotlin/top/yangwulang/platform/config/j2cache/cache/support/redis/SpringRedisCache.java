package top.yangwulang.platform.config.j2cache.cache.support.redis;
/*

import net.oschina.j2cache.Level2Cache;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.*;
import java.util.stream.Collectors;

*/
/**
 * @author yangwulang
 *//*

public class SpringRedisCache implements Level2Cache {
    private final String region;
    private final RedisTemplate<String, Object> redisTemplate;
    private final String namespace;

    @Override
    public void setBytes(Map<String, byte[]> bytes) {
        bytes.forEach(this::setBytes);
    }

    @Override
    public void setBytes(String key, byte[] bytes) {
        SpringRedisCache that = this;
        this.redisTemplate.opsForHash().getOperations().execute((RedisCallback<byte[]>) connection -> {
            connection.set(that.region.getBytes(), bytes);
            connection.hSet(that.region.getBytes(), key.getBytes(), bytes);
            return null;
        });
    }

    @Override
    public Collection<String> keys() {
        Set<Object> keys = this.redisTemplate.opsForHash().keys(this.region);
        return keys.stream().map((Object key) -> (String) key).collect(Collectors.toList());
    }

    @Override
    public boolean exists(String key) {
        return this.redisTemplate.opsForHash().hasKey(this.region, key);
    }

    @Override
    public void clear() {
        this.redisTemplate.delete(this.region);
    }

    @Override
    public void put(String key, Object value, long timeToLiveInSeconds) {
        this.redisTemplate.opsForHash().put(this.region, key, value);
    }

    @Override
    public void put(String key, Object value) {
        this.redisTemplate.opsForHash().put(this.region, key, value);
    }

    @Override
    public byte[] getBytes(String key) {
        SpringRedisCache that = this;
        return this.redisTemplate.opsForHash().getOperations().execute((RedisCallback<byte[]>) connection -> connection.hGet(that.region.getBytes(), key.getBytes()));
    }

    @Override
    public void evict(String... keys) {
        for (String key : keys) {
            if (!Objects.equals(key, "null")) {
                HashOperations<String, Object, Object> stringObjectObjectHashOperations = this.redisTemplate.opsForHash();
                stringObjectObjectHashOperations.delete(this.region, key);
            } else {
                this.redisTemplate.delete(this.region);
            }
        }

    }

    @Override
    public List<byte[]> getBytes(Collection<String> keys) {
        SpringRedisCache that = this;
        return (List<byte[]>) this.redisTemplate.opsForHash().getOperations().execute((RedisCallback<Object>) connection -> {
            byte[][] bytes = keys.stream().map(String::getBytes).toArray(byte[][]::new);
            return connection.hMGet(that.region.getBytes(), bytes);
        });
    }

    public SpringRedisCache(String namespace, String region, RedisTemplate<String, Object> redisTemplate) {
        if (region == null || region.isEmpty()) {
            region = "_";
        }

        this.namespace = namespace;
        this.redisTemplate = redisTemplate;
        this.region = this.buildRegion(region);
    }

    private String buildRegion(String region) {
        if (this.namespace != null && !this.namespace.isEmpty()) {
            region = this.namespace + ":" + region;
        }
        return region;
    }
}*/
