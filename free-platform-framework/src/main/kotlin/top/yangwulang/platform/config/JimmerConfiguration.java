package top.yangwulang.platform.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.babyfish.jimmer.jackson.ImmutableModule;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.sql.cache.AbstractCacheFactory;
import org.babyfish.jimmer.sql.cache.CacheCreator;
import org.babyfish.jimmer.sql.cache.redis.spring.RedisCacheCreator;
import org.babyfish.jimmer.sql.cache.redis.spring.RedisHashBinder;
import org.babyfish.jimmer.sql.cache.redis.spring.RedisValueBinder;
import org.babyfish.jimmer.sql.cache.Cache;
import org.babyfish.jimmer.sql.cache.CacheFactory;
import org.babyfish.jimmer.sql.cache.caffeine.CaffeineHashBinder;
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
            .registerModule(new JavaTimeModule())
            .registerModule(new ImmutableModule());


    /*@Bean
    public CacheFactory cacheFactory(
            RedisConnectionFactory connectionFactory
    ) {
        CacheCreator creator = new RedisCacheCreator(connectionFactory, JIMMER_OBJECT_MAPPER)
                .withLocalCache(100, Duration.ofMinutes(5))
                .withRemoteDuration(Duration.ofHours(1));
        return new AbstractCacheFactory() {
            @Override
            public Cache<?, ?> createObjectCache(ImmutableType type) {
                return creator.createForObject(type);
            }

            @Override
            public Cache<?, ?> createAssociatedIdCache(ImmutableProp prop) {
                return creator.createForProp(prop, getFilterState().isAffected(prop.getTargetType()));
            }

            @Override
            public Cache<?, List<?>> createAssociatedIdListCache(ImmutableProp prop) {
                return creator.createForProp(prop, getFilterState().isAffected(prop.getTargetType()));
            }

            @Override
            public Cache<?, ?> createResolverCache(ImmutableProp prop) {
                return creator.createForProp(prop, true);
            }
        };
    }*/


}
