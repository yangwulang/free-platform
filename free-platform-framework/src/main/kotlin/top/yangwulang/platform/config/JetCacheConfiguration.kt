package top.yangwulang.platform.config

import com.alicp.jetcache.CacheValueHolder
import com.alicp.jetcache.anno.SerialPolicy
import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation
import com.alicp.jetcache.anno.config.EnableMethodCache
import com.fasterxml.jackson.databind.ObjectMapper
import org.babyfish.jimmer.jackson.ImmutableModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Function

@Configuration
@EnableMethodCache(basePackages = ["top.yangwulang.platform"])
@EnableCreateCacheAnnotation
open class JetCacheConfiguration {
    /*fun cacheManager() : CacheManager {
        return
    }*/

    /**
     * 注入jimmer对应jetcache的序列化器，此处会将对象写成json字符串放到redis中.
     * 此处需要在spring中进行配置valueEncoder: bean:jimmerSerialPolicy才生效
     *
     */
/*    @Bean
    open fun jimmerSerialPolicy(): SerialPolicy {
        return SerialPolicyJimmer()
    }*/

    /**
     * jetcache中序列化策略
     */
    class SerialPolicyJimmer : SerialPolicy {
        override fun encoder(): Function<Any, ByteArray> {
            return Function<Any, ByteArray> { JimmerConfiguration.JIMMER_OBJECT_MAPPER.writeValueAsBytes(it) }
        }

        override fun decoder(): Function<ByteArray, Any> {
            return Function<ByteArray, Any> { JimmerConfiguration.JIMMER_OBJECT_MAPPER.readValue(it, CacheValueHolder::class.java) }
        }

    }
}