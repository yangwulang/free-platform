package top.yangwulang.platform.services.impl;

import cn.hutool.crypto.digest.MD5;
import jakarta.servlet.http.HttpServletResponse;
import org.babyfish.jimmer.spring.repository.parser.PropPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import top.yangwulang.platform.config.fileupload.FileUploadProperties;
import top.yangwulang.platform.entity.Objects;
import top.yangwulang.platform.entity.sys.Credentials;
import top.yangwulang.platform.entity.sys.FileEntity;
import top.yangwulang.platform.entity.sys.FileUpload;
import top.yangwulang.platform.exception.FileUploadError;
import top.yangwulang.platform.exception.ServiceException;
import top.yangwulang.platform.repository.sys.FileUploadRepository;
import top.yangwulang.platform.services.FileUploadService;
import top.yangwulang.platform.services.OssFileUploadService;

import java.io.InputStream;

/**
 * @author yangwulang
 */
@Service
public class FileUploadServiceImpl
        extends BaseServiceImpl<FileUpload, String, FileUploadRepository>
        implements FileUploadService {


    protected final OssFileUploadService ossFileUploadService;
    protected final FileUploadProperties properties;

    public FileUploadServiceImpl(@Autowired FileUploadRepository repository,
                                 @Autowired OssFileUploadService ossFileUploadService,
                                 @Autowired FileUploadProperties properties) {
        super(repository);
        this.ossFileUploadService = ossFileUploadService;
        this.properties = properties;
    }

    @Override
    public boolean bucketExists(String bucketName) {
        uploadValid();
        return ossFileUploadService.bucketExists(bucketName);
    }

    @Override
    public void makeBucket(String bucketName) {
        uploadValid();
        ossFileUploadService.makeBucket(bucketName);
    }

    @Override
    public void putObject(String bucketName, String objectName, String filename) {
        uploadValid();
        ossFileUploadService.putObject(bucketName, objectName, filename);
    }

    @Override
    public void putObject(String bucketName, String objectName, InputStream stream, String contentType) {
        uploadValid();
        ossFileUploadService.putObject(bucketName, objectName, stream, contentType);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public FileUpload putObject(String bucketName, MultipartFile multipartFile, String filename, String bizType) throws Throwable {
        uploadValid();
        // TODO: 此处需要修改流程，此MD5需由前端生成
        String md5 = MD5.create().digestHex(multipartFile.getBytes());
        FileEntity fileEntity = Objects.createFileEntity(it ->
                it.setFileMd5(md5)
                        .setFilePath("\\" + bucketName + "\\" + filename)
                        .setFileContentType("1")
        );

        FileUpload fileUpload = this.save(Objects.createFileUpload(it ->
                it.setFileEntity(fileEntity)
                        .setFileName(filename)
                        .setFileType(FileUpload.FILE_TYPE_FILE)
                        .setBizType(bizType)
        ));
        ossFileUploadService.putObject(bucketName, multipartFile, filename);
        return fileUpload;
    }

    @Override
    public boolean removeObject(String bucketName, String filePath) {
        uploadValid();
        return ossFileUploadService.removeObject(bucketName, filePath);
    }

    @Override
    public boolean downloadFile(String bucketName, String filePath, String originalName, HttpServletResponse response) {
        uploadValid();
        return ossFileUploadService.downloadFile(bucketName, filePath, originalName, response);
    }

    @Override
    public String getObjectUrl(String bucketName, String objectName) {
        uploadValid();
        return ossFileUploadService.getObjectUrl(bucketName, objectName);
    }

    @Override
    public Credentials credentials() {
        return ossFileUploadService.credentials();
    }


    /**
     * 上传校验
     */
    private void uploadValid() {
        if (!properties.isEnable()) {
            throw new ServiceException(FileUploadError.NOT_ENABLE_UPLOAD_FILE);
        }
    }
}
