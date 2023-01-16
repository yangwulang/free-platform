package top.yangwulang.platform.config;

import org.babyfish.jimmer.spring.repository.SpringConnectionManager;
import org.babyfish.jimmer.sql.JSqlClient;
import org.babyfish.jimmer.sql.runtime.ConnectionManager;
import org.babyfish.jimmer.sql.runtime.EntityManager;
import org.babyfish.jimmer.sql.runtime.Executor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author yangwulang
 */
@Configuration
public class SqlClientConfig {

    @Bean
    public JSqlClient sqlClient(
            DataSource dataSource,
            EntityManager entityManager,
            @Autowired(required = false) Executor executor
    ) {
        return JSqlClient
                .newBuilder()
                .setEntityManager(entityManager)
                .setExecutor(Executor.log(executor))
                .setConnectionManager(new SpringConnectionManager(dataSource))
                .build();
    }

}
