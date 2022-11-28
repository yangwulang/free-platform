package top.yangwulang.platform.controller.sys

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiImplicitParams
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.sys.SysDictType
import top.yangwulang.platform.services.HttpPage
import top.yangwulang.platform.services.sys.SysDictTypeService
import javax.servlet.http.HttpServletRequest


@RestController
@Api(tags = ["系统模块模块", "字典类型管理"])
@RequestMapping("\${adminPath}/sys/dictType")
class SysDictTypeController {


    @Autowired
    private lateinit var sysDictTypeService: SysDictTypeService

    @GetMapping("/{id}")
    @ApiOperation(value = "获取字典类型")
    @ApiImplicitParams(
        value = [
            ApiImplicitParam(name = "id", value = "字典类型", required = true)
        ]
    )
    fun get(@PathVariable("id") id: String): SysDictType? {
        return sysDictTypeService.findById(id)
    }

    @PostMapping
    @ApiOperation(value = "获取字典类型")
    fun page(
        @RequestBody sysDictType: SysDictType,
        httpServletRequest: HttpServletRequest
    ): Page<SysDictType> {
        val httpPage = HttpPage(httpServletRequest)
        return sysDictTypeService
            .findPage(sysDictType, PageRequest.of(httpPage.getPositionNum(), httpPage.pageSize))
    }


    @PutMapping
    @ApiOperation(value = "保存字典类型")
    fun add(@RequestBody @Validated sysDictType: SysDictType): SysDictType {
        return sysDictTypeService.save(sysDictType)
    }


}