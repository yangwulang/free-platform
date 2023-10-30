package top.yangwulang.platform.controller.sys;


import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.yangwulang.platform.entity.sys.FileEntity;
import top.yangwulang.platform.entity.sys.FileEntityFetcher;
import top.yangwulang.platform.entity.sys.FileUpload;
import top.yangwulang.platform.entity.sys.FileUploadFetcher;
import top.yangwulang.platform.exception.FileUploadError;
import top.yangwulang.platform.exception.ServiceException;
import top.yangwulang.platform.services.FileUploadService;

import java.util.function.Supplier;

/**
 * @author yangwulang
 */
@RestController
@RequestMapping("/file/upload")
@Slf4j
@RequiredArgsConstructor
@Tags({
        @Tag(name = "系统管理"),
        @Tag(name = "附件上传"),
})
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/uploadFile")
    @ResponseBody()
    public FileUpload uploadFile(MultipartFile file, @Parameter String bizType) {
        try {
            return fileUploadService.putObject(file, file.getOriginalFilename(), bizType);
        } catch (Throwable e) {
            log.error("文件上传失败", e);
            throw new ServiceException(FileUploadError.UPLOAD_FILE_FAIL);
        }
    }

    @GetMapping("/downloadFile/{fileUploadId}")
    public void downloadFile(@PathVariable String fileUploadId, HttpServletResponse response) {
        FileUpload fileUpload = fileUploadService.findNullable(fileUploadId, FileUploadFetcher.$.allScalarFields()
                .fileEntity(FileEntityFetcher.$.allScalarFields()));
        if (fileUpload == null) {
            throw new ServiceException(FileUploadError.FILE_NOT_FOUND);
        }
        FileEntity fileEntity = fileUpload.fileEntity();
        String filePath = fileEntity.filePath();
        downloadFileByPath(filePath, response);
    }

    @GetMapping("/downloadFile")
    public void downloadFileByPaths(@Parameter String fileUploadPath, HttpServletResponse response) {
        downloadFileByPath(fileUploadPath, response);
    }

    private void downloadFileByPath(String fileUploadPath, HttpServletResponse response) {
        String[] split = fileUploadPath.split("\\\\");
        if (split.length == 0) {
            throw new ServiceException(FileUploadError.FILE_NOT_FOUND);
        }
        String bucket = split[1];
        StringBuilder pathBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i > 1) {
                pathBuilder.append(split[i]);
            }
            if (i != split.length - 1) {
                pathBuilder.append("\\");
            }
        }
        fileUploadService.downloadFile(bucket, pathBuilder.toString(), split[split.length - 1], response);
    }
}
