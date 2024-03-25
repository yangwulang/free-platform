package top.yangwulang.platform.config

import com.alibaba.druid.pool.xa.DruidXADataSource
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder
import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.ListableBeanFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.support.DefaultListableBeanFactory
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.annotation.EnableTransactionManagement
import org.springframework.transaction.jta.JtaTransactionManager
import top.yangwulang.platform.properties.DynamicDataSourceProperties
import top.yangwulang.platform.utils.DataSourceHolder
import javax.sql.DataSource


@Configuration
@EnableTransactionManagement
@EnableConfigurationProperties(DynamicDataSourceProperties::class)
open class DynamicDataSourceConfiguration {
    @Autowired
    lateinit var context: DefaultListableBeanFactory

    @Bean
    open fun dynamicDataSource(dynamicDataSourceProperties: DynamicDataSourceProperties): DataSourceHolder {
        val dataSourceHandler = DataSourceHolder()
        val dataSourceMap = HashMap<String, DataSource>()
        dynamicDataSourceProperties.dataSourceNames?.forEach {
            val properties = dynamicDataSourceProperties.properties
            if (StringUtils.isNoneBlank(it) && properties != null) {

                if (dynamicDataSourceProperties.distributed) {
                    DruidXADataSource().apply {
                        driverClassName
                    }
                } else {
                    DruidDataSourceBuilder.create().build()
                }.apply {
                    url = properties["url"]
                    username = properties["username"]
                    password = properties["password"]
                    driverClassName = properties["driverClassName"]
                    isAsyncInit = properties["isAsyncInit"].let { isAsyncInit ->
                        isAsyncInit?.toBoolean() ?: false
                    }
                    minIdle = properties["minIdle"].let { minIdle ->
                        minIdle?.toInt() ?: 3
                    }
                    this.init()
                    dataSourceMap[it] = this
                }
            }
        }


        dataSourceHandler.setTargetDataSources(dataSourceMap.toMap())
        dataSourceMap["default"] = if (dynamicDataSourceProperties.distributed) {
            DruidXADataSource()
        } else {
            DruidDataSourceBuilder.create().build()
        }.apply {
            url = dynamicDataSourceProperties.url
            username = dynamicDataSourceProperties.username
            password = dynamicDataSourceProperties.password
            driverClassName = dynamicDataSourceProperties.driverClassName
            this.init()
        }
        dataSourceHandler.setDefaultTargetDataSource(dataSourceMap["default"]!!)
        return dataSourceHandler;
    }
}