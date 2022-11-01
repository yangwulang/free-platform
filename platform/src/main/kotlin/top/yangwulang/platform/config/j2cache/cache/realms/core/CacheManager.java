package top.yangwulang.platform.config.j2cache.cache.realms.core;

import net.oschina.j2cache.CacheException;

import java.util.Set;

/**
 * @author yangwulang
 */
public interface CacheManager {
    /**
     * 获取缓存
     * @param cacheName 缓存名
     * @param <K> key
     * @param <V> value
     * @return 缓存对象
     * @throws CacheException e
     */
    <K, V> Cache<K, V> getCache(String cacheName) throws CacheException;

    /**
     * 清除对应缓存名字的缓存信息
     * @param cacheName 缓存名
     */
    void clear(String cacheName);

    /**
     * 返回所有缓存名称
     * @return 缓存名称
     */
    Set<String> cacheNames();
}
