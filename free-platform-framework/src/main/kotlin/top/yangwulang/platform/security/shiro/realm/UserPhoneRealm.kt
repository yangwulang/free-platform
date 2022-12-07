package top.yangwulang.platform.security.shiro.realm

import org.apache.shiro.authc.AuthenticationInfo
import org.apache.shiro.authc.AuthenticationToken
import org.apache.shiro.authc.SimpleAuthenticationInfo
import org.apache.shiro.authz.AuthorizationInfo
import org.apache.shiro.authz.SimpleAuthorizationInfo
import org.apache.shiro.realm.AuthorizingRealm
import org.apache.shiro.subject.PrincipalCollection
import top.yangwulang.platform.security.shiro.token.UserPhoneToken

class UserPhoneRealm : AuthorizingRealm() {
    override fun doGetAuthenticationInfo(p0: AuthenticationToken?): AuthenticationInfo {
        return SimpleAuthenticationInfo(p0, "phone-test", "phone")
    }

    override fun doGetAuthorizationInfo(principalCollection: PrincipalCollection?): AuthorizationInfo {
        return SimpleAuthorizationInfo()
    }

    override fun supports(token: AuthenticationToken?): Boolean {
        return token is UserPhoneToken
    }
}