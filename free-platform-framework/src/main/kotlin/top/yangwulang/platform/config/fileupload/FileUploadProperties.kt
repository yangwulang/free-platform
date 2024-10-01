package top.yangwulang.platform.config.fileupload

import org.springframework.boot.context.properties.ConfigurationProperties
import top.yangwulang.platform.utils.FileUtils

@ConfigurationProperties(prefix = "file")
data class FileUploadProperties constructor(
    /**
     * 是否开启文件上传
     */
    var isEnable: Boolean = false,

    /**
     * 文件上传模型
     */
    var mode: FileUploadMode = FileUploadMode.AUTO,

    /**
     * 访问钥匙,model为local不需要
     */
    var accessKey: String? = null,

    /**
     * 密钥,model为local不需要
     */
    var secretKey: String? = null,

    /**
     * oss地址，如果mode为local,那么此处一定为绝对路径
     */
    @JvmField
    var url: String = FileUtils.defaultUploadLocalPath(),

    /**
     * 桶名称，如果mode为local,那么地址中就会自动进行隔离
     */
    var bucketName: String = "default"
)
