package top.yangwulang.platform.interceptor

import org.slf4j.LoggerFactory
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import kotlin.properties.Delegates

class TimeInterceptor : HandlerInterceptorAdapter() {
    private val logger = LoggerFactory.getLogger(TimeInterceptor::class.java)

    private var startTime by Delegates.notNull<Long>()

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        startTime = System.currentTimeMillis()
        logger.info("================ ${request.requestURI}开始 ================")
        return super.preHandle(request, response, handler)
    }

    override fun postHandle(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
        modelAndView: ModelAndView?
    ) {
        super.postHandle(request, response, handler, modelAndView)
        logger.info("${request.requestURI} 响应耗时 : ${System.currentTimeMillis() - startTime} ms")
        logger.info("================ ${request.requestURI}结束 ================")
    }

}