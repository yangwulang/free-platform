package top.yangwulang.platform.config.fileupload;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ltop/yangwulang/platform/config/fileupload/FileUploadConfiguration;", "", "()V", "fileUploadProperties", "Ltop/yangwulang/platform/config/fileupload/FileUploadProperties;", "buildAutoFileUploadService", "Ltop/yangwulang/platform/services/OssFileUploadService;", "buildLocalFileUploadService", "buildMinioFileUploadService", "ossFileUploadService", "free-platform-framework"})
@org.springframework.boot.context.properties.EnableConfigurationProperties(value = {top.yangwulang.platform.config.fileupload.FileUploadProperties.class})
@org.springframework.context.annotation.Configuration
public class FileUploadConfiguration {
    @org.springframework.beans.factory.annotation.Autowired
    private top.yangwulang.platform.config.fileupload.FileUploadProperties fileUploadProperties;
    
    public FileUploadConfiguration() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
    @org.springframework.context.annotation.Bean
    public top.yangwulang.platform.services.OssFileUploadService ossFileUploadService() {
        return null;
    }
    
    private final top.yangwulang.platform.services.OssFileUploadService buildAutoFileUploadService() {
        return null;
    }
    
    private final top.yangwulang.platform.services.OssFileUploadService buildLocalFileUploadService() {
        return null;
    }
    
    private final top.yangwulang.platform.services.OssFileUploadService buildMinioFileUploadService() {
        return null;
    }
}