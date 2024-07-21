package top.yangwulang.platform.services.impl;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;
import top.yangwulang.platform.config.fileupload.FileUploadProperties;
import top.yangwulang.platform.entity.sys.Credentials;
import top.yangwulang.platform.exception.ServiceException;
import top.yangwulang.platform.services.OssFileUploadService;
import top.yangwulang.platform.utils.FileUtils;

import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * 本地文件上传服务层
 *
 * @author yangwulang
 */
@Slf4j
public class LocalFileUploadServiceImpl implements OssFileUploadService {
    private final FileUploadProperties properties;

    public LocalFileUploadServiceImpl(FileUploadProperties properties) {
        this.properties = properties;
    }

    @Override
    public boolean bucketExists(String bucketName) {
        return false;
    }

    @Override
    public void makeBucket(String bucketName) {
        log.info("地址 {}", properties.getUrl());
    }

    @Override
    public void putObject(String bucketName, String objectName, String filename) {
        log.info("地址 {}", properties.getUrl());

    }

    @Override
    public void putObject(String bucketName, String objectName, InputStream stream, String contentType) {
        log.info("地址 {}", properties.getUrl());

    }

    @Override
    public void putObject(String bucketName, MultipartFile multipartFile, String filename) throws Throwable {
        File writeFile = FileUtils.touch(properties.getUrl() + "\\" + bucketName + "\\" + filename);
        try (FileOutputStream fileOutputStream = new FileOutputStream(writeFile)) {
            IOUtils.write(multipartFile.getBytes(), fileOutputStream);
        }
    }

    @Override
    public boolean removeObject(String bucketName, String filePath) {
        log.info("地址 {}", properties.getUrl());

        return false;
    }

    @Override
    public boolean downloadFile(String bucketName, String filePath, String originalName, HttpServletResponse response) {
        log.info("地址 {}", properties.getUrl());
        try {
            File file = new File(properties.getUrl() + "\\" + bucketName + "\\" + filePath);
            if (!ObjectUtils.isEmpty(originalName)) {
                response.setHeader(
                        "Content-Disposition", "attachment;filename=" +
                                URLEncoder.encode(originalName, StandardCharsets.UTF_8)
                );
            } else {
                String filename = new String(filePath.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
                response.setHeader("Content-Disposition", "attachment;filename=" + filename);
            }
            ServletOutputStream servletOutputStream = response.getOutputStream();
            byte[] bytes = Files.readAllBytes(file.toPath());
            IOUtils.write(bytes, servletOutputStream);
            servletOutputStream.flush();
            servletOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public String getObjectUrl(String bucketName, String objectName) {
        log.info("地址 {}", properties.getUrl());

        return null;
    }

    @Override
    public Credentials credentials() {
        throw new ServiceException("文件上传模式不正确，如果需要使用sts方式请使用oss模式上传文件");
    }
}
