package top.yangwulang.platform.controller.sys

import cn.dev33.satoken.stp.SaTokenInfo
import cn.dev33.satoken.stp.StpUtil
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.DeviceType
import top.yangwulang.platform.entity.Result
import top.yangwulang.platform.entity.sys.dto.LoginUserInfoView
import top.yangwulang.platform.entity.sys.dto.UserSaveInput
import top.yangwulang.platform.entity.sys.input.LoginInput
import top.yangwulang.platform.services.UserService
import top.yangwulang.platform.utils.UserUtils


/**
 * @author yangwulang
 */
@RestController
@RequestMapping
@Tags(Tag(name = "系统模块"), Tag(name = "登录控制器"))
open class LoginController {
    @Autowired
    lateinit var userService: UserService
    private val log: Logger = LoggerFactory.getLogger(LoginController::class.java)

    @PostMapping("/login")
    @Operation(summary = "登录接口")
    fun login(@RequestBody loginInput: LoginInput): Result<Map<String, Any>> {
        try {
            UserUtils.loginUserCache().use { cache ->
                val user = userService.repository()
                    .findByLoginAndPassword(loginInput.loginCode, userService.encryptPassword(loginInput.password))
                if (user != null) {
                    val loginInfo: MutableMap<String, Any> = HashMap(2)
                    StpUtil.login(user.userCode(), DeviceType.WEB.name)
                    loginInfo["userInfo"] = LoginUserInfoView(user).apply {
                        permission = userService.getPermissionString(user.userCode())
                    }
                    loginInfo["loginInfo"] = StpUtil.getTokenInfo()
                    cache.put(StpUtil.getTokenInfo().getLoginId() as String, user)
                    return Result<Map<String, Any>>().success("登录成功", loginInfo)
                }
            }
        } catch (e: Exception) {
            log.error("登陆异常", e)
        }
        return Result<Map<String, Any>>().failed("用户名或密码错误")
    }

    @GetMapping("/tokenInfo")
    @Operation(summary = "查询当前登录信息")
    fun tokenInfo(): SaTokenInfo {
        return StpUtil.getTokenInfo()
    }

    @GetMapping("/loginUserInfo")
    @Operation(summary = "查询当前登录的用户信息")
    fun loginUserInfo(): LoginUserInfoView? {
        return userService
            .repository()
            .sql()
            .findById(LoginUserInfoView::class.java, StpUtil.getLoginIdAsString())
    }

    @PostMapping("/logout")
    @Operation(summary = "退出登录")
    fun loginOut() {
        StpUtil.logout()
    }

    @Operation(summary = "注册用户")
    @PutMapping("/register")
    fun registerUser(@RequestBody user: UserSaveInput?): Result<Any> {
        userService.registerUser(user)
        return Result<Any>().success("注册成功")
    }
}
