package top.yangwulang.platform.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Ltop/yangwulang/platform/config/DynamicDataSourceConfiguration;", "", "()V", "context", "Lorg/springframework/beans/factory/support/DefaultListableBeanFactory;", "getContext", "()Lorg/springframework/beans/factory/support/DefaultListableBeanFactory;", "setContext", "(Lorg/springframework/beans/factory/support/DefaultListableBeanFactory;)V", "dynamicDataSource", "Ltop/yangwulang/platform/utils/DataSourceHolder;", "dynamicDataSourceProperties", "Ltop/yangwulang/platform/properties/DynamicDataSourceProperties;", "free-platform-framework"})
@org.springframework.boot.context.properties.EnableConfigurationProperties(value = {top.yangwulang.platform.properties.DynamicDataSourceProperties.class})
@org.springframework.context.annotation.Configuration
public class DynamicDataSourceConfiguration {
    @org.springframework.beans.factory.annotation.Autowired
    public org.springframework.beans.factory.support.DefaultListableBeanFactory context;
    
    public DynamicDataSourceConfiguration() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.springframework.beans.factory.support.DefaultListableBeanFactory getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    org.springframework.beans.factory.support.DefaultListableBeanFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public top.yangwulang.platform.utils.DataSourceHolder dynamicDataSource(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.properties.DynamicDataSourceProperties dynamicDataSourceProperties) {
        return null;
    }
}