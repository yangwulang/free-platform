package top.yangwulang.platform.exception

enum class FileUploadError(
    private val code: String,
    private val message: String
) : ServiceExceptionSerializable {
    NOT_ENABLE_UPLOAD_FILE("55000", "未开启文件上传!"),
    UPLOAD_FILE_FAIL("55001", "文件上传失败!"),
    FILE_NOT_FOUND("55002", "文件不存在!")
    ;

    override fun code(): String? {
        return code;
    }

    override fun message(): String? {
        return message
    }
}