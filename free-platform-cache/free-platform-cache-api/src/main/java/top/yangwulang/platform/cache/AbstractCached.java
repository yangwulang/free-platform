package top.yangwulang.platform.cache;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public abstract class AbstractCached implements Command {

    protected Mode mode;
    public AbstractCached() {
    }

    public AbstractCached(Mode mode) {
        this.mode = mode;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    protected void check() {
        if (this.mode == null) {
            throw new CacheException("cached mode can not be null");
        }
    }

    @Override
    public final boolean execute(Context context) throws Exception {
        if (!(context instanceof CacheContextBase)) {
            throw new CacheException("context 非 CacheContextBase的子类");
        }
        this.check();
        return this.execute((CacheContextBase) context);
    }

    protected abstract boolean execute(CacheContextBase context) throws Exception;
}
