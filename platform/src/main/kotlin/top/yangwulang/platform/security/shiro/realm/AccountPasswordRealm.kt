package top.yangwulang.platform.security.shiro.realm

import org.apache.commons.lang3.StringUtils
import org.apache.shiro.authc.*
import org.apache.shiro.authz.AuthorizationInfo
import org.apache.shiro.authz.SimpleAuthorizationInfo
import org.apache.shiro.realm.AuthorizingRealm
import org.apache.shiro.subject.PrincipalCollection
import org.springframework.beans.factory.annotation.Autowired
import top.yangwulang.platform.entity.sys.SysUser
import top.yangwulang.platform.services.sys.SysRoleService
import top.yangwulang.platform.services.sys.SysUserService


class AccountPasswordRealm : AuthorizingRealm() {

    @Autowired
    lateinit var sysUserService: SysUserService

    @Autowired
    lateinit var sysRoleService: SysRoleService


    override fun doGetAuthenticationInfo(authenticationToken: AuthenticationToken?): AuthenticationInfo {
        val token = authenticationToken as UsernamePasswordToken
        val username = token.username
        val user: SysUser = sysUserService.findByUserName(username)
            ?: throw UnknownAccountException("doGetAuthenticationInfo() has an UnknownAccountException: $username")


        val passwordInToken = String(token.password)
        val passwordInDb: String? = user.password
        if (!StringUtils.equals(passwordInDb, passwordInToken)) {
            throw IncorrectCredentialsException("doGetAuthenticationInfo() has an IncorrectCredentialsException: $username")
        }
        return SimpleAuthenticationInfo(username, passwordInToken, name)

    }

    override fun doGetAuthorizationInfo(principalCollection: PrincipalCollection?): AuthorizationInfo {
        val username = super.getAvailablePrincipal(principalCollection) as String
        val authorizationInfo = SimpleAuthorizationInfo()
        val roles: Set<String> = sysRoleService.findRoleListByUsername(username)
        authorizationInfo.roles = roles
        roles.forEach {
            val permissions: Set<String> = sysRoleService.findPermissionsByRole(it)
            authorizationInfo.addStringPermissions(permissions)
        }
        return authorizationInfo
    }

    override fun supports(token: AuthenticationToken?): Boolean {
        return token is UsernamePasswordToken
    }
}