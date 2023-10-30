package top.yangwulang.platform.controller.sys

import cn.hutool.core.lang.tree.Tree
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import org.apache.commons.lang3.StringUtils
import org.babyfish.jimmer.client.NotApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.Result
import top.yangwulang.platform.entity.sys.Menu
import top.yangwulang.platform.entity.sys.MenuTable
import top.yangwulang.platform.entity.sys.dto.MenuGetView
import top.yangwulang.platform.entity.sys.dto.MenuListInput
import top.yangwulang.platform.entity.sys.dto.MenuListView
import top.yangwulang.platform.entity.sys.input.menu.MenuSaveInput
import top.yangwulang.platform.entity.sys.vo.RoleMenuVo
import top.yangwulang.platform.services.MenuService

/**
 * @author yangwulang
 */
@RestController
@Tags(value = [Tag(name = "系统模块"), Tag(name = "菜单管理")])
@RequestMapping("\${adminPath}/sys/menu")
class MenuController {

    @Autowired
    lateinit var menuService: MenuService

    @PostMapping
    @Operation(summary = "获取菜单列表")
    fun listData(@RequestBody input: MenuListInput): List<MenuListView> {
        val table = MenuTable.`$`
        return menuService.repository().sql()
            .createQuery(table)
            .where(table.parent().isNull())
            .whereIf(StringUtils.isNotEmpty(input.menuName), table.menuName().like(input.menuName))
            .whereIf(StringUtils.isNotEmpty(input.menuType), table.menuName().eq(input.menuType))
            .whereIf(StringUtils.isNotEmpty(input.parentId), table.parent().id().eq(input.parentId))
            .select(table.fetch(MenuListView::class.java))
            .execute()
    }

    @GetMapping("/{id}")
    @Operation(summary = "获取菜单详情")
    fun get(@PathVariable(value = "id") id: String?): MenuGetView? {
        return menuService.repository().sql().findById(MenuGetView::class.java, id)
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除菜单")
    fun delete(@PathVariable(value = "id") id: String) : Result<Void>{
        menuService.deleteById(id)
        return Result<Void>().success("删除成功")
    }

    @PutMapping
    @Operation(summary = "修改或新增菜单")
    fun save(@RequestBody menu: MenuSaveInput): Menu {
        return menuService.save(menu)
    }

    @NotApi
    @GetMapping("/findByUserId")
    @Operation(summary = "查询用户下所拥有的菜单")
    fun findByUserId(userId: String?): List<Tree<String>> {
        return menuService.findByUserIdTree(userId)
    }

    @NotApi
    @GetMapping("/findByRoleId")
    @Operation(summary = "查询角色下所有的菜单")
    fun findByRoleId(roleId: String?): List<Tree<String>> {
        return menuService.findByRoleIdTree(roleId)
    }

    @GetMapping("/findRoleMenuIdsByRoleId")
    @Operation(summary = "获取角色所选取的菜单")
    fun findRoleMenuIdsByRoleId(roleId: String?): RoleMenuVo {
        val menuIds = menuService.findByRoleId(roleId).map { it.id() }
        return RoleMenuVo(roleId, menuIds)
    }

    @PutMapping("/bandRoleMenu")
    @Operation(summary = "绑定角色和菜单关系")
    fun bandRoleMenu(roleMenuVo: RoleMenuVo) {
        menuService.bandRoleMenu(roleMenuVo.roleCode, roleMenuVo.menuIds)
    }
}
