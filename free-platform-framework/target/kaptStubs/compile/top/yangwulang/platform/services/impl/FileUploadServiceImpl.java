package top.yangwulang.platform.services.impl;

import java.lang.System;

/**
 * @author yangwulang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00012\u00020\u0005B#\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J(\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016J(\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0017J\u0018\u0010$\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u001bH\u0002R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006&"}, d2 = {"Ltop/yangwulang/platform/services/impl/FileUploadServiceImpl;", "Ltop/yangwulang/platform/services/impl/BaseServiceImpl;", "Ltop/yangwulang/platform/entity/sys/FileUpload;", "", "Ltop/yangwulang/platform/repository/sys/FileUploadRepository;", "Ltop/yangwulang/platform/services/FileUploadService;", "repository", "ossFileUploadService", "Ltop/yangwulang/platform/services/OssFileUploadService;", "properties", "Ltop/yangwulang/platform/config/fileupload/FileUploadProperties;", "(Ltop/yangwulang/platform/repository/sys/FileUploadRepository;Ltop/yangwulang/platform/services/OssFileUploadService;Ltop/yangwulang/platform/config/fileupload/FileUploadProperties;)V", "getOssFileUploadService", "()Ltop/yangwulang/platform/services/OssFileUploadService;", "getProperties", "()Ltop/yangwulang/platform/config/fileupload/FileUploadProperties;", "bucketExists", "", "bucketName", "downloadFile", "filePath", "originalName", "response", "Ljakarta/servlet/http/HttpServletResponse;", "getObjectUrl", "objectName", "makeBucket", "", "putObject", "stream", "Ljava/io/InputStream;", "contentType", "filename", "multipartFile", "Lorg/springframework/web/multipart/MultipartFile;", "bizType", "removeObject", "uploadValid", "free-platform-framework"})
@org.springframework.stereotype.Service
public class FileUploadServiceImpl extends top.yangwulang.platform.services.impl.BaseServiceImpl<top.yangwulang.platform.entity.sys.FileUpload, java.lang.String, top.yangwulang.platform.repository.sys.FileUploadRepository> implements top.yangwulang.platform.services.FileUploadService {
    @org.jetbrains.annotations.NotNull
    private final top.yangwulang.platform.services.OssFileUploadService ossFileUploadService = null;
    @org.jetbrains.annotations.NotNull
    private final top.yangwulang.platform.config.fileupload.FileUploadProperties properties = null;
    
    public FileUploadServiceImpl(@org.jetbrains.annotations.Nullable
    @org.springframework.beans.factory.annotation.Autowired
    top.yangwulang.platform.repository.sys.FileUploadRepository repository, @org.jetbrains.annotations.NotNull
    @org.springframework.beans.factory.annotation.Autowired
    top.yangwulang.platform.services.OssFileUploadService ossFileUploadService, @org.jetbrains.annotations.NotNull
    top.yangwulang.platform.config.fileupload.FileUploadProperties properties) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final top.yangwulang.platform.services.OssFileUploadService getOssFileUploadService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final top.yangwulang.platform.config.fileupload.FileUploadProperties getProperties() {
        return null;
    }
    
    @java.lang.Override
    public boolean bucketExists(@org.jetbrains.annotations.NotNull
    java.lang.String bucketName) {
        return false;
    }
    
    @java.lang.Override
    public void makeBucket(@org.jetbrains.annotations.NotNull
    java.lang.String bucketName) {
    }
    
    @java.lang.Override
    public void putObject(@org.jetbrains.annotations.NotNull
    java.lang.String bucketName, @org.jetbrains.annotations.NotNull
    java.lang.String objectName, @org.jetbrains.annotations.NotNull
    java.lang.String filename) {
    }
    
    @java.lang.Override
    public void putObject(@org.jetbrains.annotations.NotNull
    java.lang.String bucketName, @org.jetbrains.annotations.NotNull
    java.lang.String objectName, @org.jetbrains.annotations.NotNull
    java.io.InputStream stream, @org.jetbrains.annotations.NotNull
    java.lang.String contentType) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.transaction.annotation.Transactional(rollbackFor = {java.lang.Exception.class})
    public top.yangwulang.platform.entity.sys.FileUpload putObject(@org.jetbrains.annotations.NotNull
    java.lang.String bucketName, @org.jetbrains.annotations.NotNull
    org.springframework.web.multipart.MultipartFile multipartFile, @org.jetbrains.annotations.NotNull
    java.lang.String filename, @org.jetbrains.annotations.NotNull
    java.lang.String bizType) {
        return null;
    }
    
    @java.lang.Override
    public boolean removeObject(@org.jetbrains.annotations.NotNull
    java.lang.String bucketName, @org.jetbrains.annotations.NotNull
    java.lang.String filePath) {
        return false;
    }
    
    @java.lang.Override
    public boolean downloadFile(@org.jetbrains.annotations.NotNull
    java.lang.String bucketName, @org.jetbrains.annotations.NotNull
    java.lang.String filePath, @org.jetbrains.annotations.NotNull
    java.lang.String originalName, @org.jetbrains.annotations.NotNull
    jakarta.servlet.http.HttpServletResponse response) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getObjectUrl(@org.jetbrains.annotations.NotNull
    java.lang.String bucketName, @org.jetbrains.annotations.NotNull
    java.lang.String objectName) {
        return null;
    }
    
    /**
     * 上传校验
     */
    private final void uploadValid() {
    }
}