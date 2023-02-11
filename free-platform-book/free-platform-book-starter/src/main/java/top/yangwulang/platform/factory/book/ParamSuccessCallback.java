package top.yangwulang.platform.factory.book;

/**
 * @author yangwulang
 */
public abstract class ParamSuccessCallback<T> extends AbstractSuccessCallback {
    private final T param;

    public ParamSuccessCallback(T param) {
        this.param = param;
    }

    public T getParam() {
        return param;
    }

}
