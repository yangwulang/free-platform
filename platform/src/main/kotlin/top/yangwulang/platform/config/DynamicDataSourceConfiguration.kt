package top.yangwulang.platform.config

import com.alibaba.druid.pool.DruidDataSource
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import top.yangwulang.platform.utils.DataSourceHolder
import javax.sql.DataSource


@Configuration
class DynamicDataSourceConfiguration {


    /*@Bean(name = ["master"], initMethod = "init")
    @ConfigurationProperties("spring.datasource.druid.master")
    fun mysql(): DruidDataSource? {
        return DruidDataSourceBuilder.create().build()
    }

    @Bean(name = ["slave"], initMethod = "init")
    @ConfigurationProperties("spring.datasource.druid.slave")
    fun erpmaster(): DruidDataSource? {
        return DruidDataSourceBuilder.create().build()
    }

    @Bean
    fun dynamicDataSource(
        @Qualifier("master") master: DataSource,
        @Qualifier("slave") slave: DataSource
    ): DataSourceHolder {
        val dataSourceHandler = DataSourceHolder()
        dataSourceHandler.setTargetDataSources(mapOf("master" to master, "slave" to slave))
        dataSourceHandler.setDefaultTargetDataSource(master)
        return dataSourceHandler;
    }*/
}