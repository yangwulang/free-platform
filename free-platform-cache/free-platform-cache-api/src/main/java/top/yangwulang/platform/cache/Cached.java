package top.yangwulang.platform.cache;

import org.apache.commons.chain.impl.ChainBase;

public class Cached<K, V> extends ChainBase {

    public boolean cache(K key, V value) {
        CacheContextBase cacheContextBase = new CacheContextBase();
        cacheContextBase.put(new CacheObject<>(key, value));
        try {
            return this.execute(cacheContextBase);
        } catch (Exception e) {
            throw new CacheException(e);
        }
    }

}
