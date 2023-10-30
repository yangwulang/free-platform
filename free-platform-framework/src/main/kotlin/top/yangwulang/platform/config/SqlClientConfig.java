package top.yangwulang.platform.config;

import org.babyfish.jimmer.sql.JSqlClient;
import org.babyfish.jimmer.sql.event.TriggerType;
import org.babyfish.jimmer.sql.runtime.Customizer;
import org.babyfish.jimmer.sql.runtime.Executor;
import org.babyfish.jimmer.sql.runtime.Initializer;
import org.springframework.stereotype.Component;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.event.DictEventListener;
import top.yangwulang.platform.utils.SnowflakeKey;

/**
 * @author yangwulang
 */
@Component
public class SqlClientConfig implements Customizer, Initializer {
    @Override
    public void customize(JSqlClient.Builder builder) {
        builder.setIdGenerator(new SnowflakeKey())
                .setTriggerType(TriggerType.TRANSACTION_ONLY)
                .setExecutor(Executor.log());
    }

    @Override
    public void initialize(JSqlClient sqlClient) {
        sqlClient.getTriggers().addEntityListener(DictData.class, new DictEventListener());
    }


    /*@Bean
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
*/
/*    @Bean
    public UserIdGenerator idGenerator() {
        return new SnowflakeKey();
    }*/
}
