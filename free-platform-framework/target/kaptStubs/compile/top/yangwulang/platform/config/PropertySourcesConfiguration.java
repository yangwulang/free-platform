package top.yangwulang.platform.config;

import java.lang.System;

/**
 * 系统自定义属性配置对象
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017\u00a8\u0006\u0005"}, d2 = {"Ltop/yangwulang/platform/config/PropertySourcesConfiguration;", "", "()V", "margProperties", "Lorg/springframework/context/support/PropertySourcesPlaceholderConfigurer;", "free-platform-framework"})
@org.springframework.context.annotation.Configuration
public class PropertySourcesConfiguration {
    
    public PropertySourcesConfiguration() {
        super();
    }
    
    /**
     * 合并yml,properties对象到spring容器中,加载config路径下的platform-xxx.(properties|yml)文件，并且与系统中的进行合并
     */
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.context.support.PropertySourcesPlaceholderConfigurer margProperties() {
        return null;
    }
}