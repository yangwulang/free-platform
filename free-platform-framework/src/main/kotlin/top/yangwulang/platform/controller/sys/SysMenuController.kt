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
import top.yangwulang.platform.entity.sys.SysMenu
import top.yangwulang.platform.services.HttpPage
import top.yangwulang.platform.services.sys.SysMenuService
import javax.servlet.http.HttpServletRequest

@RestController
@Api(tags = ["系统模块模块", "菜单管理"])
@RequestMapping("\${adminPath}/sys/menu")
class SysMenuController {

    @Autowired
    lateinit var sysMenuService: SysMenuService

    @GetMapping("/{id}")
    @ApiOperation(value = "获取菜单详情")
    @ApiImplicitParams(
        value = [
            ApiImplicitParam(name = "id", value = "菜单id", required = true)
        ]
    )
    fun get(@PathVariable("id") id: String): SysMenu? {
        return sysMenuService.findById(id)
    }

    @PostMapping
    @ApiOperation(value = "获取字典数据")
    fun page(
        @RequestBody sysMenu: SysMenu,
        httpServletRequest: HttpServletRequest
    ): Page<SysMenu> {
        val httpPage = HttpPage(httpServletRequest)
        return sysMenuService
            .findPage(sysMenu, PageRequest.of(httpPage.getPositionNum(), httpPage.pageSize))
    }


    @PutMapping
    @ApiOperation(value = "保存菜单")
    fun add(@RequestBody @Validated sysMenu: SysMenu): SysMenu {
        return sysMenuService.save(sysMenu)
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除菜单")
    @ApiImplicitParam(name = "id", value = "字典数据id", required = true)
    fun delete(@PathVariable("id") id: String) {
        sysMenuService.delete(id)
    }

}