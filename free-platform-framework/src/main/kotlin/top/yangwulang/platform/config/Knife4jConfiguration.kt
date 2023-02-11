package top.yangwulang.platform.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class Knife4jConfiguration {

    @Value("\${adminPath:/api}")
    private lateinit var adminPath: String;

    @Bean
    open fun systemApi(): GroupedOpenApi {
        return GroupedOpenApi
            .builder()
            .group("系统模块")
            .pathsToMatch("${adminPath}/sys/**")
            .build()
    }

    @Bean
    open fun customOpenApi(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("平台")
                    .version("")
            )
    }

}