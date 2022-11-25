package top.yangwulang.platform.exception

/**
 * @author yangwulang
 */
open class ServiceException : RuntimeException {
    private var exceptionSerializable: ServiceExceptionSerializable? = null
    // 错误码，如果没有传入接口实现，默认是500
    val code: String?
        get() = if (exceptionSerializable == null) "500" else exceptionSerializable!!.code()

    constructor(exceptionSerializable: ServiceExceptionSerializable) : this(exceptionSerializable.message()) {
        this.exceptionSerializable = exceptionSerializable
    }

    constructor() : super() {}
    constructor(message: String?) : super(message) {}
    constructor(message: String?, cause: Throwable?) : super(message, cause) {}
    constructor(cause: Throwable?) : super(cause) {}
    protected constructor(
        message: String?,
        cause: Throwable?,
        enableSuppression: Boolean,
        writableStackTrace: Boolean
    ) : super(message, cause, enableSuppression, writableStackTrace) {
    }
}