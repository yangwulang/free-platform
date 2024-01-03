package top.yangwulang.platform.config;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import org.babyfish.jimmer.jackson.ImmutableModule;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.spring.cache.CaffeineBinder;
import org.babyfish.jimmer.spring.cache.RedisCaches;
import org.babyfish.jimmer.spring.cache.RedisHashBinder;
import org.babyfish.jimmer.spring.cache.RedisValueBinder;
import org.babyfish.jimmer.sql.cache.Cache;
import org.babyfish.jimmer.sql.cache.CacheFactory;
import org.babyfish.jimmer.sql.cache.chain.ChainCacheBuilder;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import top.yangwulang.platform.entity.TenantTypeBase;

import java.time.Duration;
import java.util.List;

/**
 * @author yangwulang
 */
@Configuration
public class JimmerConfiguration {
    /**
     * jimmer转化mapper对象
     */
    public static final ObjectMapper JIMMER_OBJECT_MAPPER = new ObjectMapper()
            .registerModule(new ImmutableModule())
            .activateDefaultTyping(
                    LaissezFaireSubTypeValidator.instance,
                    ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT,
                    JsonTypeInfo.As.WRAPPER_ARRAY
            );




    @Bean
    public CacheFactory cacheFactory(
            RedisConnectionFactory connectionFactory
    ) {
        RedisTemplate<String, byte[]> redisTemplate = RedisCaches.cacheRedisTemplate(connectionFactory);
        return new CacheFactory() {

            // Id -> Object
            @Override
            public Cache<?, ?> createObjectCache(ImmutableType type) {
                return new ChainCacheBuilder<>()
                        .add(new CaffeineBinder<>(512, Duration.ofSeconds(1)))
                        .add(new RedisValueBinder<>(redisTemplate, JIMMER_OBJECT_MAPPER, type, Duration.ofMinutes(10)))
                        .build();
            }

            // Id -> TargetId, for one-to-one/many-to-one
            @Override
            public Cache<?, ?> createAssociatedIdCache(@NotNull ImmutableProp prop) {
                return createPropCache(
                        TenantTypeBase.class.isAssignableFrom(prop.getTargetType().getJavaClass()),
                        prop,
                        redisTemplate,
                        JIMMER_OBJECT_MAPPER,
                        Duration.ofMinutes(5)
                );
            }

            // Id -> TargetId list, for one-to-many/many-to-many
            @Override
            public Cache<?, List<?>> createAssociatedIdListCache(@NotNull ImmutableProp prop) {
                return createPropCache(
                        TenantTypeBase.class.isAssignableFrom(prop.getTargetType().getJavaClass()),
                        prop,
                        redisTemplate,
                        JIMMER_OBJECT_MAPPER,
                        Duration.ofMinutes(5)
                );
            }

            // Id -> computed value, for transient properties with resolver
            @Override
            public Cache<?, ?> createResolverCache(@NotNull ImmutableProp prop) {
                return createPropCache(
                        // TODO: prop.equals(BookStoreProps.AVG_PRICE.unwrap()) ||
                        //  prop.equals(BookStoreProps.NEWEST_BOOKS.unwrap()),原来是这样的，这里强制使用此方式，后续再改
                        false,
                        prop,
                        redisTemplate,
                        JIMMER_OBJECT_MAPPER,
                        Duration.ofHours(1)
                );
            }
        };
    }

    private static <K, V> Cache<K, V> createPropCache(
            boolean isMultiView,
            ImmutableProp prop,
            RedisTemplate<String, byte[]> redisTemplate,
            ObjectMapper objectMapper,
            Duration redisDuration
    ) {
        if (isMultiView) {
            return new ChainCacheBuilder<K, V>()
                    .add(new RedisHashBinder<>(redisTemplate, objectMapper, prop, redisDuration))
                    .build();
        }

        return new ChainCacheBuilder<K, V>()
                .add(new CaffeineBinder<>(512, Duration.ofSeconds(1)))
                .add(new RedisValueBinder<>(redisTemplate, objectMapper, prop, redisDuration))
                .build();
    }

}
