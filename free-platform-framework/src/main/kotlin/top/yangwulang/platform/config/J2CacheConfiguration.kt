package top.yangwulang.platform.config

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import top.yangwulang.platform.config.j2cache.cache.J2CacheProperties

@Configuration
@EnableConfigurationProperties(J2CacheProperties::class)
class J2CacheConfiguration {
}