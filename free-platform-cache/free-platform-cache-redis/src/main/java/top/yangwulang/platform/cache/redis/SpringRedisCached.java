package top.yangwulang.platform.cache.redis;

import top.yangwulang.platform.cache.AbstractCached;
import top.yangwulang.platform.cache.CacheContextBase;
import top.yangwulang.platform.cache.Mode;

public class SpringRedisCached extends AbstractCached {
    public SpringRedisCached() {
    }

    public SpringRedisCached(Mode mode) {
        super(mode);
    }

    @Override
    protected boolean execute(CacheContextBase context) throws Exception {
        // false是不递交给下一个节点
        if (super.getMode() == Mode.INTELLIGENCE) {

        } else {

        }
        return false;
    }
}
