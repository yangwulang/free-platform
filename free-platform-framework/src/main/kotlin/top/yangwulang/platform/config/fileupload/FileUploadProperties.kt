package top.yangwulang.platform.config.fileupload;

import org.springframework.boot.context.properties.ConfigurationProperties;
import top.yangwulang.platform.utils.FileUtils;

@ConfigurationProperties(prefix = "file")
public class FileUploadProperties {
    /**
     * 是否开启文件上传
     */
    private boolean enable = false;
    /**
     * 文件上传模型
     */
    private FileUploadMode mode = FileUploadMode.AUTO;
    /**
     * 访问钥匙,model为local不需要
     */
    private String accessKey;
    /**
     * 密钥,model为local不需要
     */
    private String secretKey;
    /**
     * oss地址，如果mode为local,那么此处一定为绝对路径
     */
    private String url = FileUtils.defaultUploadLocalPath();
    /**
     * 桶名称，如果mode为local,那么地址中就会自动进行隔离
     */
    private String bucketName = "default";

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public FileUploadMode getMode() {
        return mode;
    }

    public void setMode(FileUploadMode mode) {
        this.mode = mode;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}
