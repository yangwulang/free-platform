package top.yangwulang.platform.cache;

import org.apache.commons.chain.impl.ContextBase;

public class CacheContextBase extends ContextBase {

    public static final String CACHE_KEY = "CacheContextBaseKEY";

    public CacheObject<?, ?> put(CacheObject<?, ?> value) {
        return (CacheObject<?, ?>) this.put(CACHE_KEY, value);
    }

    public CacheObject<?, ?> get() {
        return (CacheObject<?, ?>) this.get(CACHE_KEY);
    }
}
