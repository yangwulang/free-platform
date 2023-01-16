package top.yangwulang.platform.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.babyfish.jimmer.jackson.ImmutableModule
//import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import top.yangwulang.platform.interceptor.AjaxResultInterceptor
import top.yangwulang.platform.interceptor.TimeInterceptor
import java.text.SimpleDateFormat


@Configuration
open class WebConfiguration : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(TimeInterceptor())
        registry.addInterceptor(AjaxResultInterceptor())
    }

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOriginPatterns("*")
            // 是否允许证书（cookies）
            .allowCredentials(true)
            // 设置允许的方法
            .allowedMethods("*")
    }

    @Bean
    open fun mappingJackson2HttpMessageConverter(): MappingJackson2HttpMessageConverter? {
        val converter = MappingJackson2HttpMessageConverter()
        val mapper: ObjectMapper = converter.objectMapper
        mapper.registerModule(ImmutableModule())
//        val hibernate5Module = Hibernate5Module()
//        mapper.registerModule(hibernate5Module)
        mapper.dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return converter
    }

}