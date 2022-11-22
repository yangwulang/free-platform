package top.yangwulang.platform.security.shiro

import org.apache.shiro.authc.AuthenticationToken
import org.apache.shiro.web.filter.authc.AuthenticatingFilter
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

class TokenFilter: AuthenticatingFilter() {
    override fun onAccessDenied(p0: ServletRequest?, p1: ServletResponse?): Boolean {
        TODO("Not yet implemented")
    }

    override fun createToken(p0: ServletRequest?, p1: ServletResponse?): AuthenticationToken {
        TODO("Not yet implemented")
    }
}