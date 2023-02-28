package top.yangwulang.platform.config;

import org.babyfish.jimmer.spring.repository.SpringConnectionManager;
import org.babyfish.jimmer.spring.repository.SpringTransientResolverProvider;
import org.babyfish.jimmer.sql.JSqlClient;
import org.babyfish.jimmer.sql.runtime.EntityManager;
import org.babyfish.jimmer.sql.runtime.Executor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.yangwulang.platform.jimmer.interceptor.BaseEntityInterceptor;
import top.yangwulang.platform.jimmer.interceptor.DataTypeBaseInterceptor;
import top.yangwulang.platform.utils.SnowflakeKey;

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
            @Autowired(required = false) Executor executor,
            @Autowired(required = false) ApplicationContext context
    ) {
        return JSqlClient
                .newBuilder()
                .setEntityManager(entityManager)
                .addDraftInterceptor(new DataTypeBaseInterceptor())
                .addDraftInterceptor(new BaseEntityInterceptor())
                .setIdGenerator(new SnowflakeKey())
                .setExecutor(Executor.log(executor))
                .setConnectionManager(new SpringConnectionManager(dataSource))
                .setTransientResolverProvider(new SpringTransientResolverProvider(context))
                .build();
    }

}
