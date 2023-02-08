package top.yangwulang.platform.controller.sys;


import io.minio.MinioClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.yangwulang.platform.services.FileUploadService;
import top.yangwulang.platform.services.impl.MinioClientOption;
import top.yangwulang.platform.services.impl.MinioFileUploadServiceImpl;

@RestController
@RequestMapping("/file/upload")
@Slf4j
public class FileUploadController {

    private FileUploadService fileUploadService = new MinioFileUploadServiceImpl(
            new MinioClientOption(
                    new MinioClient.Builder()
                            .endpoint("http://127.0.0.1:9000")
                            .credentials("HYOGVdMehzmtn5H5", "BnBpbcXz8VBfAPu8ZmTBFUBnqclxCDif")
                            .build()
            )
    );

    @PostMapping("/uploadFile")
    public String uploadFile(MultipartFile file) {
        fileUploadService.putObject(file, file.getOriginalFilename());
        return fileUploadService.getObjectUrl(file.getOriginalFilename());
    }
}
