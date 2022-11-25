package top.yangwulang.platform.security.shiro.manager

import org.apache.commons.lang3.StringUtils
import org.apache.shiro.web.servlet.ShiroHttpServletRequest
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager
import org.apache.shiro.web.util.WebUtils
import java.io.Serializable
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse


class TokenSessionManager : DefaultWebSessionManager() {

    override fun getSessionId(request: ServletRequest?, response: ServletResponse?): Serializable? {
        val tokenName = "token";
        val toHttp = WebUtils.toHttp(request)
        var token: String?

        token = toHttp.getHeader(tokenName)

        if (token == null) {
            token = toHttp.getParameter(tokenName)
        }

        if (StringUtils.isNotEmpty(token)) {
            request?.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE, "Stateless request")
            request?.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID, token);
            request?.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_IS_VALID, true);
        }
        return super.getSessionId(request, response)
    }
}