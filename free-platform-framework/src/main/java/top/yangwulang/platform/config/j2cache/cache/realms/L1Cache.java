package top.yangwulang.platform.config.j2cache.cache.realms;
/*

import net.oschina.j2cache.CacheChannel;
import net.oschina.j2cache.CacheException;
import net.oschina.j2cache.CacheProviderHolder;
import net.oschina.j2cache.Level1Cache;
import org.apache.commons.lang3.StringUtils;
import top.yangwulang.platform.config.j2cache.cache.realms.core.Cache;
import top.yangwulang.platform.utils.ObjectUtils;

import java.util.*;

*/
/**
 * @author 10214
 *//*

public class L1Cache<K, V> implements Cache<K, V> {
    private final String cacheName;
    private final CacheProviderHolder cacheProviderHolder;

    public L1Cache(String cacheName, CacheChannel channel, CacheProviderHolder cacheProviderHolder) {
        this.cacheName = cacheName;
        this.cacheProviderHolder = cacheProviderHolder;
    }

    @Override
    public V get(K key) throws CacheException {
        return null;
    }

    @Override
    public V put(K key, V value) throws CacheException {
        Level1Cache level1Cache = this.cacheProviderHolder.getLevel1Cache(this.cacheName);
        String name = level1Cache.getClass().getName();
        if (StringUtils.containsAny(name, "caffeine", "ehcache")) {
            level1Cache.put(ObjectUtils.toString(key), value);
        }
        return value;
    }

    @Override
    public V remove(K key) throws CacheException {
        Level1Cache level1Cache = this.cacheProviderHolder.getLevel1Cache(this.cacheName);
        Object o = level1Cache.get(ObjectUtils.toString(key));
        level1Cache.evict(ObjectUtils.toString(key));
        return (V) o;
    }

    @Override
    public void clear() throws CacheException {
        this.cacheProviderHolder.getLevel1Cache(this.cacheName).clear();
    }

    @Override
    public int size() {
        return this.cacheProviderHolder.getLevel1Cache(this.cacheName).keys().size();
    }

    @Override
    public Set<K> keys() {
        return (Set<K>) this.cacheProviderHolder.getLevel1Cache(this.cacheName).keys();
    }

    @Override
    public Collection<V> values() {
        List<V> values = new ArrayList<>();
        Collection keys = this.keys();
        Level1Cache level1Cache = this.cacheProviderHolder.getLevel1Cache(this.cacheName);
        Map<K, V> map = level1Cache.get(keys);
        if (map != null) {
            map.forEach((o, o2) -> values.add(o2));
        }
        return values;
    }

    @Override
    public V put(K key, V value, long timeToLiveInSeconds) {
        Level1Cache level1Cache = this.cacheProviderHolder.getLevel1Cache(this.cacheName, timeToLiveInSeconds);
        String name = level1Cache.getClass().getName();
        if (StringUtils.containsAny(name, "caffeine", "ehcache")) {
            level1Cache.put(ObjectUtils.toString(key), value);
        }
        return null;
    }

    @Override
    public String toString() {
        return "J1Cache [" + cacheName + "]";
    }
}
*/
