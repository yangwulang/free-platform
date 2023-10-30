package top.yangwulang.platform.controller.sys;

import cn.hutool.system.SystemUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 关于系统各种信息模块
 *
 * @author yangwulang
 */
@RestController
@RequestMapping("${adminPath}/sys/system")
@Tags({
        @Tag(name = "系统模块"),
        @Tag(name = "系统信息")
})
public class SystemController {

    @GetMapping
    public void systemInfo() {
        SystemUtil.dumpSystemInfo();
    }
}
