package top.yangwulang.platform.exception

/**
 * 服务层异常处理，此接口实现类可以是枚举，
 * 可以配合{@link top.yangwulang.platform.exception.ServiceException}使用
 *
 * @author yangwulang
 */
interface ServiceExceptionSerializable {
    /**
     * 编码
     */
    fun code(): String?

    /**
     * 消息
     */
    fun message(): String?
}