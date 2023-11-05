package top.yangwulang.platform.controller.sys;

import cn.dev33.satoken.annotation.SaCheckPermission;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yangwulang.platform.entity.PageHttpRequest;
import top.yangwulang.platform.entity.sys.FileUpload;
import top.yangwulang.platform.entity.sys.FileUploadFetcher;
import top.yangwulang.platform.services.FileUploadService;

/**
 * @author yangwulang
 */
@RestController
@RequestMapping("${adminPath}/file")
@Slf4j
@RequiredArgsConstructor
@Tags({
        @Tag(name = "系统管理"),
        @Tag(name = "附件管理"),
})
public class FileUploadAdminController {
    @Autowired
    private FileUploadService fileUploadService;

    private final FileUploadFetcher simple = FileUploadFetcher.$
            .allScalarFields();

    @SaCheckPermission(value = "sys:fileUpload:view")
    @PostMapping("/list")
    @Operation(summary = "获取上传的文件列表")
    public Page<FileUpload> listData(HttpServletRequest httpServletRequest) {
        return fileUploadService.repository().findAll(
                PageHttpRequest.of(httpServletRequest).toPage(),
                simple
        );
    }
}
