package top.yangwulang.platform.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import top.yangwulang.platform.interceptor.AjaxResultInterceptor
import java.text.SimpleDateFormat


@Configuration
class WebConfiguration : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(AjaxResultInterceptor())
    }

    @Bean
    fun mappingJackson2HttpMessageConverter(): MappingJackson2HttpMessageConverter? {
        val converter = MappingJackson2HttpMessageConverter()
        val mapper: ObjectMapper = converter.objectMapper
        val hibernate5Module = Hibernate5Module()
        mapper.registerModule(hibernate5Module)
        mapper.dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return converter
    }

}