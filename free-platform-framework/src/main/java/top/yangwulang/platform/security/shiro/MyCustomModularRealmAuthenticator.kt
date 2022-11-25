package top.yangwulang.platform.security.shiro

import org.apache.shiro.authc.AuthenticationInfo
import org.apache.shiro.authc.AuthenticationToken
import org.apache.shiro.authc.pam.ModularRealmAuthenticator
import org.apache.shiro.realm.Realm


class MyCustomModularRealmAuthenticator : ModularRealmAuthenticator() {
    override fun doMultiRealmAuthentication(
        realms: Collection<Realm?>,
        token: AuthenticationToken?
    ): AuthenticationInfo? {
        val authenticationStrategy = authenticationStrategy
        var authenticationInfo: AuthenticationInfo? = authenticationStrategy.beforeAllAttempts(realms, token)
        realms.forEach {
            authenticationInfo = authenticationStrategy.beforeAttempt(it, token, authenticationInfo)
            if (it!!.supports(token)) {
                var info: AuthenticationInfo? = null
                val t: Throwable? = null
                info = it.getAuthenticationInfo(token)
                authenticationInfo = authenticationStrategy.afterAttempt(it, token, info, authenticationInfo, t)
            }
        }
        authenticationInfo = authenticationStrategy.afterAllAttempts(token, authenticationInfo)
        return authenticationInfo
    }
}