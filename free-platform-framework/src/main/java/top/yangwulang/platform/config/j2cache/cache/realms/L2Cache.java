package top.yangwulang.platform.config.j2cache.cache.realms;
/*

import net.oschina.j2cache.CacheChannel;
import net.oschina.j2cache.CacheException;
import net.oschina.j2cache.CacheProviderHolder;
import org.apache.commons.lang3.StringUtils;
import top.yangwulang.platform.utils.ObjectUtils;

import java.util.*;

*/
/**
 * @author yangwulang
 *//*

public class L2Cache<K, V> extends L1Cache<K, V> {
    private final CacheChannel channel;
    private final String cacheName;

    public L2Cache(String cacheName, CacheChannel channel, CacheProviderHolder cacheProviderHolder) {
        super(cacheName, channel, cacheProviderHolder);
        this.cacheName = cacheName;
        this.channel = channel;
    }

    @Override
    public V put(K key, V value) throws CacheException {
        this.channel.set(this.cacheName, ObjectUtils.toString(key), value);
        return value;
    }

    @Override
    public V get(K key) throws CacheException {
        try {
            return (V) this.channel.get(this.cacheName, ObjectUtils.toString(key), true).getValue();
        } catch (Exception e) {
            if (!e.getMessage().contains("unable to find class for code")) {
                e.printStackTrace();
            }
            this.remove(key);
            return null;
        }
    }

    @Override
    public void clear() throws CacheException {
        this.channel.clear(this.cacheName);
    }

    @Override
    public int size() {
        return this.channel.keys(this.cacheName).size();
    }

    @Override
    public Set<K> keys() {
        Set kSet = new HashSet<>();
        String keys = ":" + this.cacheName + ":";
        this.channel.keys(this.cacheName).forEach(s -> {
            if (StringUtils.contains(s, keys)) {
                s = StringUtils.substringAfter(s, keys);
            }
            kSet.add(s);
        });
        return kSet;
    }

    @Override
    public Collection<V> values() {
        Collection values = new ArrayList();
        Set keys = this.keys();
        Map map = this.channel.get(this.cacheName, keys);
        if (map != null) {
            map.forEach((o, o2) -> values.add(o2));
        }
        return values;
    }

    @Override
    public V put(K key, V value, long timeToLiveInSeconds) {
        this.channel.set(this.cacheName, ObjectUtils.toString(key), value, timeToLiveInSeconds);
        return value;
    }

    @Override
    public String toString() {
        return "J2Cache[" + this.cacheName + "]";
    }

    @Override
    public V remove(K key) throws CacheException {
//        V v = this.get(key);
        this.channel.evict(this.cacheName, ObjectUtils.toString(key));
        return null;
    }
}
*/
