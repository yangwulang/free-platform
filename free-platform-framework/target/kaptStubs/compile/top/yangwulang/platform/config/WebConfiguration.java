package top.yangwulang.platform.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Ltop/yangwulang/platform/config/WebConfiguration;", "Lorg/springframework/web/servlet/config/annotation/WebMvcConfigurer;", "()V", "adminPath", "", "getAdminPath", "()Ljava/lang/String;", "setAdminPath", "(Ljava/lang/String;)V", "addCorsMappings", "", "registry", "Lorg/springframework/web/servlet/config/annotation/CorsRegistry;", "addInterceptors", "Lorg/springframework/web/servlet/config/annotation/InterceptorRegistry;", "mappingJackson2HttpMessageConverter", "Lorg/springframework/http/converter/json/MappingJackson2HttpMessageConverter;", "free-platform-framework"})
@org.springframework.context.annotation.Configuration
public class WebConfiguration implements org.springframework.web.servlet.config.annotation.WebMvcConfigurer {
    @org.springframework.beans.factory.annotation.Value(value = "${adminPath:/api}")
    public java.lang.String adminPath;
    
    public WebConfiguration() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdminPath() {
        return null;
    }
    
    public final void setAdminPath(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    public void addInterceptors(@org.jetbrains.annotations.NotNull
    org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
    }
    
    @java.lang.Override
    public void addCorsMappings(@org.jetbrains.annotations.NotNull
    org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
    }
    
    @org.jetbrains.annotations.Nullable
    @org.springframework.context.annotation.Bean
    public org.springframework.http.converter.json.MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        return null;
    }
}