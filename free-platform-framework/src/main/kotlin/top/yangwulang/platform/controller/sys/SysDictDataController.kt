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
import top.yangwulang.platform.entity.sys.SysDictData
import top.yangwulang.platform.services.HttpPage
import top.yangwulang.platform.services.sys.SysDictDataService
import javax.servlet.http.HttpServletRequest


@RestController
@Api(tags = ["系统模块模块", "字典数据管理"])
@RequestMapping("\${adminPath}/sys/dictData")
class SysDictDataController {

    @Autowired
    private lateinit var sysDictDataService: SysDictDataService

    @GetMapping("/{id}")
    @ApiOperation(value = "获取字典数据")
    @ApiImplicitParams(
        value = [
            ApiImplicitParam(name = "id", value = "字典数据id", required = true)
        ]
    )
    fun get(@PathVariable("id") id: String): SysDictData? {
        return sysDictDataService.findById(id)
    }

    @PostMapping
    @ApiOperation(value = "获取字典数据")
    fun page(
        @RequestBody sysDictData: SysDictData,
        httpServletRequest: HttpServletRequest
    ): Page<SysDictData> {
        val httpPage = HttpPage(httpServletRequest)
        return sysDictDataService
            .findPage(sysDictData, PageRequest.of(httpPage.getPositionNum(), httpPage.pageSize))
    }


    @PutMapping
    @ApiOperation(value = "保存字典类型")
    fun add(@RequestBody @Validated sysDictData: SysDictData): SysDictData {
        return sysDictDataService.save(sysDictData)
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除字典数据")
    @ApiImplicitParam(name = "id", value = "字典数据id", required = true)
    fun delete(@PathVariable("id") id: String) {
        sysDictDataService.delete(id)
    }


}