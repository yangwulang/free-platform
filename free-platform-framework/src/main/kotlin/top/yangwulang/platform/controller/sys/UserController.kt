package top.yangwulang.platform.controller.sys

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.Parameters
import io.swagger.v3.oas.annotations.enums.ParameterIn
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import jakarta.servlet.http.HttpServletRequest
import org.apache.commons.lang3.StringUtils
import org.babyfish.jimmer.View
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.PageHttpRequest
import top.yangwulang.platform.entity.Result
import top.yangwulang.platform.entity.sys.Role
import top.yangwulang.platform.entity.sys.UserTable
import top.yangwulang.platform.entity.sys.dto.UserGetView
import top.yangwulang.platform.entity.sys.dto.UserListInput
import top.yangwulang.platform.entity.sys.dto.UserListView
import top.yangwulang.platform.entity.sys.dto.UserRoleMenuView
import top.yangwulang.platform.entity.sys.input.user.UserSaveInput
import top.yangwulang.platform.exception.ServiceException
import top.yangwulang.platform.services.UserService


/**
 * @author yangwulang
 */
@RestController
@Tags(value = [Tag(name = "系统模块"), Tag(name = "用户管理")])
@RequestMapping("\${adminPath}/sys/user")
class UserController {
    @Autowired
    lateinit var userService: UserService

    @GetMapping("/{id}")
    @Operation(summary = "获取用户信息")
    @Parameters(Parameter(name = "id", description = "类型主键", required = true, `in` = ParameterIn.PATH))
    fun get(@PathVariable("id") id: String?): UserGetView? {
        return userService.repository().sql().findById(UserGetView::class.java, id)
    }

    @GetMapping("/roles/{userId}")
    @Operation(summary = "获取用户信息所有拥有的角色")
    @Parameters(Parameter(name = "userId", description = "用户主键", required = true, `in` = ParameterIn.PATH))
    fun getRolesByUserId(@PathVariable("userId") userId: String): List<View<Role>> {
        return userService.repository().sql().findById(UserRoleMenuView::class.java, userId)?.roles ?: listOf()
    }

    @GetMapping("/active/{userId}")
    @Operation(summary = "激活用户")
    @Parameters(Parameter(name = "userId", description = "用户id", required = true))
    fun activeUser(@PathVariable("userId") userId: String?) {
        userService.activeUser(userId)
    }

    @PostMapping
    @Operation(summary = "获取用户列表")
    fun listData(request: HttpServletRequest?, @RequestBody user: UserListInput): Page<UserListView> {
        val repository = userService.repository()
        val table = UserTable.`$`
        return repository
            .pager(PageHttpRequest.of(request).toPage())
            .execute(
                repository.sql().createQuery(table)
                    .whereIf(StringUtils.isNotEmpty(user.userName), table.userName().ilike(user.userName))
                    .select(table.fetch(UserListView::class.java))
            )
    }

    @PutMapping
    @Operation(summary = "修改或新增用户")
    fun save(@RequestBody @Validated user: UserSaveInput) {
        if (StringUtils.isEmpty(user.userCode)) {
            throw ServiceException("系统无法新增，只能编辑，新增请通过注册");
        }
        userService.findById(user.userCode)
            .orElseThrow { ServiceException("用户不存在") }
            .apply {
                if (!this.loginCode().equals(user.loginCode)) {
                    throw ServiceException("登录账号无法修改!")
                }
            }
        userService.save(user)
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除用户信息")
    @Parameters(Parameter(name = "id", description = "主键", required = true, `in` = ParameterIn.PATH))
    fun delete(@PathVariable("id") id: String): Result<Void> {
        userService.deleteById(id)
        return Result<Void>().success("删除成功")
    }

    @PutMapping("/resetPassword/{id}")
    @Operation(summary = "管理员重置用户密码")
    fun adminResetPassword(@PathVariable("id") id: String) : Result<Void>{
        userService.adminResetPassword(id);
        return Result<Void>().success("重置成功")
    }

}
