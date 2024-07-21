package top.yangwulang.platform.services.impl;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;
import top.yangwulang.platform.entity.sys.Credentials;
import top.yangwulang.platform.entity.sys.FileUpload;
import top.yangwulang.platform.repository.sys.FileUploadRepository;
import top.yangwulang.platform.services.OssFileUploadService;

import java.io.InputStream;

public class MinioFileUploadServiceImpl
        implements OssFileUploadService {

    protected final MinioClientOption option;


    public MinioFileUploadServiceImpl(MinioClientOption option) {
        this.option = option;
    }

    @Override
    public boolean bucketExists(String bucketName) {
        return option.bucketExists(bucketName);
    }

    @Override
    public void makeBucket(String bucketName) {
        option.makeBucket(bucketName);
    }

    @Override
    public void putObject(String bucketName, String objectName, String filename) {
        option.putObject(bucketName, objectName, filename);
    }

    @Override
    public void putObject(String bucketName, String objectName, InputStream stream, String contentType) {
        option.putObject(bucketName, objectName, stream, contentType);
    }

    @Override
    public void putObject(String bucketName, MultipartFile multipartFile, String filename) {
        if (!this.bucketExists(bucketName)) {
            this.makeBucket(bucketName);
        }
        option.putObject(bucketName, multipartFile, filename);
    }

    @Override
    public boolean removeObject(String bucketName, String filePath) {
        return option.removeObject(bucketName, filePath);
    }

    @Override
    public boolean downloadFile(String bucketName, String filePath, String originalName, HttpServletResponse response) {
        return option.downloadFile(bucketName, filePath, originalName, response);
    }

    @Override
    public String getObjectUrl(String bucketName, String objectName) {
        return option.getObjectUrl(bucketName, objectName);
    }

    @Override
    public Credentials credentials() {
        io.minio.credentials.Credentials minioCred = option.genCredentials();
        return new Credentials(
                minioCred.accessKey(),
                minioCred.secretKey(),
                minioCred.sessionToken(),
                null
        );
    }
}
