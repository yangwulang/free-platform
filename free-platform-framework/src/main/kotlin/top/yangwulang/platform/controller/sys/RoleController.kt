package top.yangwulang.platform.controller.sys

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import jakarta.servlet.http.HttpServletRequest
import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.PageHttpRequest
import top.yangwulang.platform.entity.Result
import top.yangwulang.platform.entity.sys.*
import top.yangwulang.platform.entity.sys.dto.RoleGetView
import top.yangwulang.platform.entity.sys.dto.RoleListInput
import top.yangwulang.platform.entity.sys.dto.RoleListView
import top.yangwulang.platform.entity.sys.dto.UserListView
import top.yangwulang.platform.entity.sys.input.RoleInput
import top.yangwulang.platform.entity.sys.input.role.AllocationUserQo
import top.yangwulang.platform.entity.sys.input.role.BindUserRoleBatchQo
import top.yangwulang.platform.entity.sys.input.role.BindUserRoleQo
import top.yangwulang.platform.exception.ServiceException
import top.yangwulang.platform.services.RoleService
import top.yangwulang.platform.services.UserService

/**
 * @author yangwulang
 */
@RestController
@Tags(value = [Tag(name = "系统模块"), Tag(name = "角色管理")])
@RequestMapping("\${adminPath}/sys/role")
class RoleController {
    @Autowired
    lateinit var roleService: RoleService

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/{id}")
    @Operation(summary = "获取角色信息")
    fun get(@PathVariable("id") id: String?): RoleGetView? {
        return roleService.repository().sql().findById(RoleGetView::class.java, id)
    }

    @PostMapping
    @Operation(summary = "获取角色列表")
    fun listData(request: HttpServletRequest?, @RequestBody input: RoleListInput): Page<RoleListView> {
        val repository = roleService.repository()
        val table = RoleTable.`$`
        return repository
            .pager(PageHttpRequest.of(request).toPage())
            .execute(
                repository.sql()
                    .createQuery(table)
                    .whereIf(StringUtils.isNotEmpty(input.roleName), table.roleName().like(input.roleName))
                    .whereIf(StringUtils.isNotEmpty(input.roleType), table.roleType().eq(input.roleType))
                    .whereIf(StringUtils.isNotEmpty(input.userType), table.userType().eq(input.userType))
                    .select(table.fetch(RoleListView::class.java))
            )
    }

    @PostMapping("/allocationUser")
    @Operation(summary = "获取角色授权的用户")
    fun listUserData(
        request: HttpServletRequest?,
        @RequestBody allocationUserQo: AllocationUserQo
    ): Page<UserListView> {
        if (allocationUserQo.roleId.isEmpty()) {
            throw ServiceException("角色id不能为空")
        }
        val table = UserTable.`$`
        return userService
            .pager(PageHttpRequest.of(request).toPage())
            .execute(
                userService.repository().sql()
                    .createQuery(table)
                    .where(UserTableEx.`$`.roles().id().eq(allocationUserQo.roleId))
                    .select(
                        table.fetch(UserListView::class.java)
                    )
            )
    }

    @DeleteMapping("/unBindUserRole")
    @Operation(summary = "解除角色授权")
    fun unBindUserRole(userId: String?, roleId: String?) {
        roleService.unBindUserRole(userId, roleId)
    }

    @PutMapping("/bindUserRole")
    @Operation(summary = "授权用户角色")
    fun bindUserRole(@RequestBody qo: BindUserRoleQo) {
        roleService.bindUserRole(qo.userId, qo.roleId)
    }

    @PostMapping("/bindUserRoleBatch")
    @Operation(summary = "批量授权用户角色")
    fun bindUserRoleBatch(@RequestBody qo: BindUserRoleBatchQo) {
        roleService.bindUserRoleBatch(qo.userId, qo.roleId)
    }

    @PutMapping
    @Operation(summary = "保存或修改角色信息")
    fun save(@RequestBody roleInput: RoleInput): Role {
        return roleService.save(roleInput)
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除角色信息")
    fun delete(@PathVariable("id") id: String): Result<Void> {
        roleService.deleteById(id)
        return Result<Void>().success("删除成功")
    }
}
