package top.yangwulang.platform.config;

import org.babyfish.jimmer.sql.runtime.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.yangwulang.platform.entity.sys.JimmerModule;

/**
 * @author yangwulang
 */
@Configuration
public class JimmerConfiguration {


    @Bean
    public EntityManager entityManager() {
        return JimmerModule.ENTITY_MANAGER;
    }


}
