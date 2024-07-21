package top.yangwulang.platform.services;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;
import top.yangwulang.platform.entity.sys.Credentials;
import top.yangwulang.platform.entity.sys.FileUpload;
import top.yangwulang.platform.repository.sys.FileUploadRepository;

import java.io.FileNotFoundException;
import java.io.InputStream;

public interface OssFileUploadService {
    String DEFAULT_BUCKET_NAME = "default";

    boolean bucketExists(String bucketName);

    void makeBucket(String bucketName);

    void putObject(String bucketName, String objectName, String filename);

    default void putObject(String objectName, String filename) {
        this.putObject(DEFAULT_BUCKET_NAME, objectName, filename);
    }

    void putObject(String bucketName, String objectName, InputStream stream, String contentType);

    default void putObject(String objectName, InputStream stream, String contentType) {
        this.putObject(DEFAULT_BUCKET_NAME, objectName, stream, contentType);
    }

    void putObject(String bucketName, MultipartFile multipartFile, String filename) throws Throwable;

    default void putObject(MultipartFile multipartFile, String filename) throws Throwable{
        this.putObject(DEFAULT_BUCKET_NAME, multipartFile, filename);
    }

    boolean removeObject(String bucketName, String filePath);

    default boolean removeObject(String filePath) {
        return this.removeObject(DEFAULT_BUCKET_NAME, filePath);
    }

    boolean downloadFile(String bucketName, String filePath, String originalName, HttpServletResponse response);

    default boolean downloadFile(String filePath, String originalName, HttpServletResponse response) {
        return this.downloadFile(DEFAULT_BUCKET_NAME, filePath, originalName, response);
    }

    String getObjectUrl(String bucketName, String objectName);

    default String getObjectUrl(String objectName) {
        return this.getObjectUrl(DEFAULT_BUCKET_NAME, objectName);
    }

    Credentials credentials();
}
