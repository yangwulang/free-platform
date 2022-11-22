package top.yangwulang.platform.config

import org.apache.shiro.authc.AbstractAuthenticator
import org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy
import org.apache.shiro.session.mgt.SessionManager
import org.apache.shiro.spring.LifecycleBeanPostProcessor
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor
import org.apache.shiro.spring.web.ShiroFilterFactoryBean
import org.apache.shiro.web.mgt.DefaultWebSecurityManager
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import top.yangwulang.platform.security.shiro.MyCustomModularRealmAuthenticator
import top.yangwulang.platform.security.shiro.manager.TokenSessionManager
import top.yangwulang.platform.security.shiro.realm.AccountPasswordRealm
import top.yangwulang.platform.security.shiro.realm.UserPhoneRealm


@Configuration
class ShiroConfiguration {
    @Bean
    fun sessionManager(): SessionManager {
        return TokenSessionManager()
    }

    @Bean
    fun accountPasswordRealm(): AccountPasswordRealm {
        return AccountPasswordRealm()
    }

    @Bean
    fun userPhoneRealm() : UserPhoneRealm {
        return UserPhoneRealm()
    }

    @Bean(name = ["shiroFilterFactoryBean"])
    fun shiroFilterFactoryBean(securityManager: DefaultWebSecurityManager?): ShiroFilterFactoryBean? {
        val shiroFilterFactoryBean = ShiroFilterFactoryBean()
        shiroFilterFactoryBean.securityManager = securityManager
//        shiroFilterFactoryBean.filters = mapOf(Pair("authc", AuthcShiroFilter()))
        shiroFilterFactoryBean.filterChainDefinitionMap = mapOf(
            Pair("/common/**", "anon"),
            Pair("/static/**", "anon"),
            Pair("/login", "anon"),
            Pair("/loginOut", "anon")
        )
        shiroFilterFactoryBean.unauthorizedUrl = "redirect:/into/login"
        return shiroFilterFactoryBean
    }

    @Bean(name = ["securityManager"])
    fun defaultWebSecurityManager(): DefaultWebSecurityManager {
        val defaultWebSecurityManager = DefaultWebSecurityManager()
        defaultWebSecurityManager.realms = listOf(
            accountPasswordRealm(),
            userPhoneRealm()
        )
        defaultWebSecurityManager.sessionManager = sessionManager()
        defaultWebSecurityManager.authenticator = myCustomModuleRealmAuthor()
        return defaultWebSecurityManager
    }

    @Bean
    fun myCustomModuleRealmAuthor() : AbstractAuthenticator {
        val myCustomModularRealmAuthenticator = MyCustomModularRealmAuthenticator()
        myCustomModularRealmAuthenticator.setRealms(listOf(
            accountPasswordRealm(),
            userPhoneRealm()
        ))
        myCustomModularRealmAuthenticator.authenticationStrategy = AtLeastOneSuccessfulStrategy()
        return myCustomModularRealmAuthenticator
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