package top.yangwulang.platform.config

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import top.yangwulang.platform.utils.ResourceUtils
import java.util.Properties

/**
 * 系统自定义属性配置对象
 */
@Configuration
open class PropertySourcesConfiguration {

    /**
     * 合并yml,properties对象到spring容器中,加载config路径下的platform-xxx.(properties|yml)文件，并且与系统中的进行合并
     */
    @Bean
    open fun margProperties(): PropertySourcesPlaceholderConfigurer {
        val resolver = PropertySourcesPlaceholderConfigurer()
        val resources = ResourceUtils
            .getResources("classpath*:/config/platform-*.*")
            .filter { it.exists() && it != null }
        val parentProperties = Properties()
        resources
            .filter { it.filename!!.endsWith(".properties") }
            .map {
                val properties = Properties()
                properties.load(it.inputStream)
                properties
            }
            .forEach {
                parentProperties.putAll(it)
            }
        resources
            .filter { it.filename!!.endsWith(".yml") }
            .mapNotNull {
                val yaml = YamlPropertiesFactoryBean()
                yaml.setResources(it)
                yaml.`object`
            }.forEach {
                parentProperties.putAll(it)
            }
        resolver.setProperties(parentProperties)
        return resolver
    }
}