package top.yangwulang.platform.controller.sys

import org.apache.shiro.SecurityUtils
import org.apache.shiro.authc.AuthenticationException
import org.apache.shiro.authc.UnknownAccountException
import org.apache.shiro.authc.UsernamePasswordToken
import org.apache.shiro.authz.AuthorizationException
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.yangwulang.platform.exception.ServiceException
import top.yangwulang.platform.exception.SystemError


@RestController
@RequestMapping
class LoginController {


    @PostMapping("/login")
    fun userNamePasswordLogin(
        @RequestParam username: String,
        @RequestParam password: String
    ) {
        val usernamePasswordToken = UsernamePasswordToken(username, password)
        val subject = SecurityUtils.getSubject()
        try {
            subject.login(usernamePasswordToken)
            //TODO: 如果这里登录成功则将其信息写入到缓存中
        } catch (e: UnknownAccountException) {
            throw ServiceException(SystemError.UnknownAccount)
        } catch (e: AuthenticationException) {
            throw ServiceException(SystemError.INCORRECT_ACCOUNT_PASSWORD)
        } catch (e: AuthorizationException) {
            throw ServiceException(SystemError.NOT_HIVE_AUTH)
        }

    }

}