package top.yangwulang.platform.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangwulang
 */
@Configuration
public class BookOpenApi {

    @Value("${adminPath:/api}")
    private String adminPath;

    @Bean
    public GroupedOpenApi defaultBookOpenApi() {
        return GroupedOpenApi
                .builder()
                .group("书籍模块")
                .pathsToMatch(adminPath + "/book/**")
//                .packagesToScan("top.yangwulang.platform.controller.book")
                .build();
    }
}
