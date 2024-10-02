package top.yangwulang.platform.controller.sys;


import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.dromara.x.file.storage.core.FileInfo;
import org.dromara.x.file.storage.core.FileStorageService;
import org.dromara.x.file.storage.core.constant.Constant;
import org.dromara.x.file.storage.core.platform.FileStorage;
import org.dromara.x.file.storage.core.presigned.GeneratePresignedUrlPretreatment;
import org.dromara.x.file.storage.core.presigned.GeneratePresignedUrlResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.yangwulang.platform.entity.Tables;
import top.yangwulang.platform.entity.sys.*;
import top.yangwulang.platform.entity.sys.dto.FileUploadView;
import top.yangwulang.platform.exception.FileUploadError;
import top.yangwulang.platform.exception.ServiceException;
import top.yangwulang.platform.services.FileUploadService;

import java.util.Date;
import java.util.List;
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

    @Autowired
    private FileStorageService fileStorageService;


    @Operation(summary = "上传文件此接口为post接口，但是可以接收get请求的参数{bizType}")
    @PostMapping("/uploadFile")
    @ResponseBody()
    public FileUploadView uploadFile(MultipartFile file, @Parameter String bizType) {
        try {
            return new FileUploadView(fileUploadService.putObject(FileUploadService.DEFAULT_BUCKET_NAME, file, file.getOriginalFilename(), bizType));
        } catch (Throwable e) {
            log.error("文件上传失败", e);
            throw new ServiceException(FileUploadError.UPLOAD_FILE_FAIL);
        }
    }

    @Operation(summary = "通过bizType和bizKey查找上传的文件")
    @GetMapping("/findUploadFileByBizType/{bizType}/{bizKey}")
    public List<FileUploadView> findUploadFileByBizType(
            @PathVariable("bizType") String bizType,
            @PathVariable("bizKey") String bizKey
    ) {
        return fileUploadService.repository()
                .sql()
                .createQuery(Tables.FILE_UPLOAD_TABLE)
                .where(
                        Predicate.and(
                                Tables.FILE_UPLOAD_TABLE.bizType().eq(bizType),
                                Tables.FILE_UPLOAD_TABLE.bizKey().eq(bizKey)
                        )
                ).select(Tables.FILE_UPLOAD_TABLE.fetch(FileUploadView.class))
                .execute();
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

    @GetMapping("/genUrl")
    @Operation(summary = "获取链接")
    @ResponseBody
    public Credentials genUrl() {
        return fileUploadService.credentials();
    }
}
