package top.yangwulang.platform.exception

enum class SystemError(
    private val code: String,
    private val message: String
) : ServiceExceptionSerializable {
    UnknownAccount("50001", "用户名不存在!"),
    INCORRECT_ACCOUNT_PASSWORD("50002", "账号或密码错误!"),
    NOT_HIVE_AUTH("50003", "没有权限!")
    ;

    override fun code(): String? {
        return code;
    }

    override fun message(): String? {
        return message
    }
}