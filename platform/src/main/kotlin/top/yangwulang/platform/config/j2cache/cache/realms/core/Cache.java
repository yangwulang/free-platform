package top.yangwulang.platform.config.j2cache.cache.realms.core;


import net.oschina.j2cache.CacheException;

import java.util.Collection;
import java.util.Set;

/**
 * @author yangwulang
 */
public interface Cache<K, V> {
    /**
     * 获取缓存数据
     *
     * @param key key
     * @return 缓存数据
     * @throws Exception 异常
     */

    V get(K key) throws CacheException;


    V put(K key, V value) throws CacheException;

    V remove(K key) throws CacheException;

    void clear() throws CacheException;

    int size();

    Set<K> keys();

    Collection<V> values();

    V put(K key, V value, long timeOut);
}
