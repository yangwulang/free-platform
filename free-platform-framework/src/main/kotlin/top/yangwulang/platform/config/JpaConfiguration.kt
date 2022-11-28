package top.yangwulang.platform.config

import org.apache.shiro.SecurityUtils
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.AuditorAware
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.JpaVendorAdapter
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.orm.jpa.vendor.Database
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter
import org.springframework.transaction.PlatformTransactionManager
import java.util.*
import javax.persistence.EntityManagerFactory
import javax.sql.DataSource


@Configuration
//@EnableJpaRepositories("top.yangwulang.platform.repository")
/*@EntityScan(value = [
    "top.yangwulang.platform.entity.book"
])*/
@EnableJpaAuditing
class JpaConfiguration {


    /*@Bean
    @ConditionalOnMissingBean
    fun jpaVendorAdapter(): JpaVendorAdapter? {
        val jpaVendorAdapter = HibernateJpaVendorAdapter()
        // 设置数据库类型（可使用org.springframework.orm.jpa.vendor包下的Database枚举类）
        jpaVendorAdapter.setDatabase(Database.MYSQL)
        val map = jpaVendorAdapter.getJpaPropertyMap()
        map.put("hibernate.format_sql", true)
        map.put("hibernate.use_sql_comments", true)
        // 设置打印sql语句
        jpaVendorAdapter.setShowSql(true)
        // 设置不生成ddl语句
        jpaVendorAdapter.setGenerateDdl(false)
        // 设置hibernate方言
        jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect")
        return jpaVendorAdapter
    }*/

    @Bean
    fun entityManagerFactory(
        dataSource: DataSource,
        jpaVendorAdapter: JpaVendorAdapter
    ): LocalContainerEntityManagerFactoryBean {
        val entityManagerFactoryBean = LocalContainerEntityManagerFactoryBean()
        entityManagerFactoryBean.dataSource = dataSource
        entityManagerFactoryBean.jpaVendorAdapter = jpaVendorAdapter
        entityManagerFactoryBean.setPackagesToScan("top.yangwulang.platform.entity")
        return entityManagerFactoryBean
    }


    /**
     * 配置jpa事务管理器
     */
    @Bean
    fun transactionManager(entityManagerFactory: EntityManagerFactory?): PlatformTransactionManager? {
        val transactionManager = JpaTransactionManager()
        // 配置实体管理器工厂
        transactionManager.entityManagerFactory = entityManagerFactory
        return transactionManager
    }

    @Bean
    fun auditor() : AuditorAware<String> {
        // jpa审计bean，当有@CreateBy标注时会调用当前bean的getCurrentAuditor方法获得登录的用户信息
        return UserAuditor()
    }

    inner class UserAuditor : AuditorAware<String> {
        override fun getCurrentAuditor(): Optional<String> {
            // 获取当前登录的用户信息
            val primaryPrincipal = SecurityUtils.getSubject().principals?.primaryPrincipal
            return if (primaryPrincipal != null) {
                Optional.ofNullable(primaryPrincipal as String)
            } else {
                Optional.empty()
            }
        }

    }

}