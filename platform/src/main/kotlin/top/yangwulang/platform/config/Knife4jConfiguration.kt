package top.yangwulang.platform.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class Knife4jConfiguration {

    @Bean
    fun docketBean(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .apiInfo(
                ApiInfoBuilder()
                    .description("# Knife4j RESTful APIs")
                    .termsOfServiceUrl("https://doc.xiaominfo.com/")
                    .contact(Contact("xiaoymin@foxmail.com", "", ""))
                    .version("1.0.0")
                    .build()
            )
            .groupName("小说服务")
            .select()
            .apis(RequestHandlerSelectors.basePackage("top.yangwulang.platform.controller"))
            .paths(PathSelectors.any())
            .build()
    }

}