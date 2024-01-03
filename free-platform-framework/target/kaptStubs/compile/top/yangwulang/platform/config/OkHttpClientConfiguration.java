package top.yangwulang.platform.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0017R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Ltop/yangwulang/platform/config/OkHttpClientConfiguration;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "okhttpClient", "Lokhttp3/OkHttpClient;", "free-platform-framework"})
@org.springframework.context.annotation.Configuration
public class OkHttpClientConfiguration {
    @org.jetbrains.annotations.NotNull
    private final org.slf4j.Logger logger = null;
    
    public OkHttpClientConfiguration() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.slf4j.Logger getLogger() {
        return null;
    }
    
    /**
     * 注入okhttp的client，全局
     */
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public okhttp3.OkHttpClient okhttpClient() {
        return null;
    }
}