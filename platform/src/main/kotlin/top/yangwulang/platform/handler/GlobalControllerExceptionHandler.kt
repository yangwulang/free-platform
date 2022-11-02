package top.yangwulang.platform.handler

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.commons.lang3.StringUtils
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.core.MethodParameter
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice
import top.yangwulang.platform.annotation.NotWarpResult
import top.yangwulang.platform.entity.Result
import top.yangwulang.platform.exception.ServiceException

@RestControllerAdvice
class GlobalControllerExceptionHandler : ResponseBodyAdvice<Any> {
    private val logger: Logger = LoggerFactory.getLogger(GlobalControllerExceptionHandler::class.java)


    @ExceptionHandler(ServiceException::class)
    fun onServiceException(serviceException: ServiceException): Result<Unit> {
        val result = Result<Unit>()
        result.failed(serviceException.message)
        if (StringUtils.isNotBlank(serviceException.code)) {
            result.code = serviceException.code
        }
        return result
    }

    override fun supports(returnType: MethodParameter, converterType: Class<out HttpMessageConverter<*>>): Boolean {
        return !(returnType.parameterType == Result::class.java || returnType.hasMethodAnnotation(NotWarpResult::class.java))
    }

    override fun beforeBodyWrite(
        body: Any?,
        returnType: MethodParameter,
        selectedContentType: MediaType,
        selectedConverterType: Class<out HttpMessageConverter<*>>,
        request: ServerHttpRequest,
        response: ServerHttpResponse
    ): Any? {
        var isCloudRequest = false
        val cloudHeader = request.headers["server-remote"]
        if (cloudHeader != null && cloudHeader[0] != null) {
            // 如果在请求的头部中携带 server-remote 并且为 true的话，返回不包装的值
            isCloudRequest = try {
                cloudHeader[0]!!.toBoolean()
            } catch (e: Exception) {
                false
            }
        }
        if (request.uri.path.contains("swagger-resources")) {
            // knife4j默认为Cloud请求
            isCloudRequest = true
        }
        return if (isCloudRequest) {
            // 如果是cloud请求，不包装body
            body
        } else {
            // 如果不是cloud请求，则对请求结果进行包装
            val result = Result<Any>()
            if (returnType.parameterType == String::class.java) {
                val objectMapper = ObjectMapper()
                try {
                    objectMapper.writeValueAsString(result.success(body))
                } catch (e: JsonProcessingException) {
                    logger.error("转换响应体出错 body：$body", e)
                    objectMapper.writeValueAsString(result.failed(e.message))
                }
            } else {
                result.success(body)
            }
        }
    }


}