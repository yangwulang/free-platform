package top.yangwulang.platform.controller.sys

import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tags(value = [Tag(name = "系统模块"), Tag(name = "工作台")])
@RequestMapping("\${adminPath}/sys/workPlace")
class WorkPlaceController {

}