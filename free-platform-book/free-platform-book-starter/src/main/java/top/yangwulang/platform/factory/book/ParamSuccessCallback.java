package top.yangwulang.platform.factory.book;

/**
 * 携带参数的okhttp成功回调对象，此对象构造可传递一个参数，此参数可在异步线程中取到
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
