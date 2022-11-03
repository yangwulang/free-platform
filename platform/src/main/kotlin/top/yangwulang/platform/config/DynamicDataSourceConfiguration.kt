package top.yangwulang.platform.config

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder
import org.apache.commons.lang3.StringUtils
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import top.yangwulang.platform.properties.DynamicDataSourceProperties
import top.yangwulang.platform.utils.DataSourceHolder
import javax.sql.DataSource


@Configuration
@EnableConfigurationProperties(DynamicDataSourceProperties::class)
class DynamicDataSourceConfiguration {
    @Bean
    fun dynamicDataSource(dynamicDataSourceProperties: DynamicDataSourceProperties): DataSourceHolder {
        val dataSourceHandler = DataSourceHolder()
        val dataSourceMap = HashMap<String, DataSource>()
        dynamicDataSourceProperties.dataSourceNames.forEach {
            val properties = dynamicDataSourceProperties.properties
            if (StringUtils.isNoneBlank(it) && properties != null) {
                val dataSource = DruidDataSourceBuilder.create().build()
                dataSource.url = properties["url"]
                dataSource.username = properties["username"]
                dataSource.password = properties["password"]
                dataSource.driverClassName = properties["driverClassName"]
                dataSource.isAsyncInit = properties["isAsyncInit"].let { isAsyncInit ->
                    isAsyncInit?.toBoolean() ?: false
                }
                dataSource.minIdle = properties["minIdle"].let { minIdle ->
                    minIdle?.toInt() ?: 3
                }
                dataSource.init()
                dataSourceMap[it] = dataSource
            }
        }
        dataSourceHandler.setTargetDataSources(dataSourceMap.toMap())
        val dataSource = DruidDataSourceBuilder.create().build()
        dataSource.url = dynamicDataSourceProperties.url
        dataSource.username = dynamicDataSourceProperties.username
        dataSource.password = dynamicDataSourceProperties.password
        dataSource.driverClassName = dynamicDataSourceProperties.driverClassName
        dataSource.init()
        dataSourceHandler.setDefaultTargetDataSource(dataSource)
        return dataSourceHandler;
    }
}