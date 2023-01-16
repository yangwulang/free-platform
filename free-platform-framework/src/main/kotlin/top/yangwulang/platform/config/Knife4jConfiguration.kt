package top.yangwulang.platform.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.parameters.HeaderParameter
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class Knife4jConfiguration {

    @Bean
    open fun systemApi(): GroupedOpenApi {
        return GroupedOpenApi
            .builder()
            .group("系统模块")
            .pathsToMatch("top.yangwulang.platform.controller.sys")
/*            .addOperationCustomizer({operation, handlerMehtod ->
                operation.addParametersItem(HeaderParameter())
            })*/
            .packagesToScan("/**")
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