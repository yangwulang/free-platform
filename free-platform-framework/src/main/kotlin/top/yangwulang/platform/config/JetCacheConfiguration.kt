package top.yangwulang.platform.config

import com.alicp.jetcache.CacheManager
import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation
import com.alicp.jetcache.anno.config.EnableMethodCache
import org.springframework.context.annotation.Configuration

@Configuration
@EnableMethodCache(basePackages = ["top.yangwulang.platform"])
@EnableCreateCacheAnnotation
open class JetCacheConfiguration {
    /*fun cacheManager() : CacheManager {
        return
    }*/
}