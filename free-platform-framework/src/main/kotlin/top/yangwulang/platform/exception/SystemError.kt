package top.yangwulang.platform.exception

enum class SystemError(
    private val code: String,
    private val message: String
) : ServiceExceptionSerializable {
    UN_KNOWN_ACCOUNT("50001", "用户名不存在!"),
    INCORRECT_ACCOUNT_PASSWORD("50002", "账号或密码错误!"),
    NOT_HIVE_AUTH("50003", "没有权限!"),
    USER_NOT_FOUND("50004", "用户不存在!"),
    LOGIN_CODE_EXISTS("51000", "用户登陆码已存在"),
    CANT_DELETE_SUPER_ADMIN("51001", "不能删除超级管理员,请先降级!")
    ;

    override fun code(): String? {
        return code;
    }

    override fun message(): String? {
        return message
    }
}