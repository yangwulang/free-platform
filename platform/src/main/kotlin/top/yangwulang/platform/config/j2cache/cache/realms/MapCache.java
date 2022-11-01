package top.yangwulang.platform.config.j2cache.cache.realms;

import net.oschina.j2cache.CacheException;
import top.yangwulang.platform.config.j2cache.cache.realms.core.Cache;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * @author yangwulang
 */
public class MapCache<K, V> implements Cache<K, Object> {
    private final Map<K, Object> map;
    private final String name;

    public MapCache(String name, Map<K, Object> backingMap) {
        if (name == null) {
            throw new IllegalArgumentException("Cache name cannot be null.");
        } else if (backingMap == null) {
            throw new IllegalArgumentException("Backing map cannot be null.");
        } else {
            this.name = name;
            this.map = backingMap;
        }
    }

    @Override
    public Object get(K key) throws CacheException {
        return this.map.get(key);
    }
    @Override
    public Object put(K key, Object value) throws CacheException {
        return this.map.put(key, value);
    }
    @Override
    public Object remove(K key) throws CacheException {
        return this.map.remove(key);
    }
    @Override
    public void clear() throws CacheException {
        this.map.clear();
    }
    @Override
    public int size() {
        return this.map.size();
    }
    @Override
    public Set<K> keys() {
        Set<K> keys = this.map.keySet();
        return !keys.isEmpty() ? Collections.unmodifiableSet(keys) : Collections.emptySet();
    }
    @Override
    public Collection<Object> values() {
        Collection<Object> values = this.map.values();
        return !values.isEmpty() ? Collections.unmodifiableCollection(values) : Collections.emptyList();
    }

    @Override
    public Object put(K key, Object value, long timeOut) {
        return null;
    }

    @Override
    public String toString() {
        return "MapCache '" + this.name + "' (" + this.map.size() + " entries)";
    }
}
