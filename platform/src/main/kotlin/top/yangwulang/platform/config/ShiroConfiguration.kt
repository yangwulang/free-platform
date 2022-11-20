package top.yangwulang.platform.config

import org.apache.shiro.session.mgt.SessionManager
import org.apache.shiro.spring.LifecycleBeanPostProcessor
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor
import org.apache.shiro.spring.web.ShiroFilterFactoryBean
import org.apache.shiro.web.mgt.DefaultWebSecurityManager
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import top.yangwulang.platform.security.shiro.manager.TokenSessionManager
import top.yangwulang.platform.security.shiro.realm.TokenRealm


@Configuration
class ShiroConfiguration {
    @Bean
    fun sessionManager(): SessionManager {
        return TokenSessionManager()
    }

    @Bean
    fun tokenRealm(): TokenRealm {
        return TokenRealm()
    }

    @Bean(name = ["shiroFilterFactoryBean"])
    fun shiroFilterFactoryBean(securityManager: DefaultWebSecurityManager?): ShiroFilterFactoryBean? {
        val shiroFilterFactoryBean = ShiroFilterFactoryBean()
        shiroFilterFactoryBean.securityManager = securityManager
        return shiroFilterFactoryBean
    }

    @Bean(name = ["securityManager"])
    fun defaultWebSecurityManager(): DefaultWebSecurityManager {
        val defaultWebSecurityManager = DefaultWebSecurityManager()
        defaultWebSecurityManager.setRealm(tokenRealm())
        defaultWebSecurityManager.sessionManager = sessionManager()
        return defaultWebSecurityManager
    }


    @Bean(name = ["lifecycleBeanPostProcessor"])
    fun lifecycleBeanPostProcessor(): LifecycleBeanPostProcessor? {
        return LifecycleBeanPostProcessor()
    }

    @Bean
    fun authorizationAttributeSourceAdvisor(securityManager: DefaultWebSecurityManager?): AuthorizationAttributeSourceAdvisor? {
        val authorizationAttributeSourceAdvisor = AuthorizationAttributeSourceAdvisor()
        authorizationAttributeSourceAdvisor.securityManager = securityManager
        return authorizationAttributeSourceAdvisor
    }

    @Bean
    fun advisorAutoProxyCreator(): DefaultAdvisorAutoProxyCreator? {
        val advisorAutoProxyCreator = DefaultAdvisorAutoProxyCreator()
        advisorAutoProxyCreator.isProxyTargetClass = true
        return advisorAutoProxyCreator
    }

}