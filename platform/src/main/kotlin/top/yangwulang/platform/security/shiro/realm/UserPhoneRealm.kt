package top.yangwulang.platform.security.shiro.realm

import org.apache.shiro.authc.AuthenticationInfo
import org.apache.shiro.authc.AuthenticationToken
import org.apache.shiro.authz.AuthorizationInfo
import org.apache.shiro.realm.AuthorizingRealm
import org.apache.shiro.subject.PrincipalCollection

class UserPhoneRealm : AuthorizingRealm() {
    override fun doGetAuthenticationInfo(p0: AuthenticationToken?): AuthenticationInfo {
        TODO("Not yet implemented")
    }

    override fun doGetAuthorizationInfo(p0: PrincipalCollection?): AuthorizationInfo {
        TODO("Not yet implemented")
    }
}