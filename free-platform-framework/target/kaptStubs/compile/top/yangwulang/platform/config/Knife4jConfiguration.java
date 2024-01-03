package top.yangwulang.platform.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\bH\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ltop/yangwulang/platform/config/Knife4jConfiguration;", "", "()V", "adminPath", "", "customOpenApi", "Lio/swagger/v3/oas/models/OpenAPI;", "systemApi", "Lorg/springdoc/core/models/GroupedOpenApi;", "free-platform-framework"})
@org.springframework.context.annotation.Configuration
public class Knife4jConfiguration {
    @org.springframework.beans.factory.annotation.Value(value = "${adminPath:/api}")
    private java.lang.String adminPath;
    
    public Knife4jConfiguration() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springdoc.core.models.GroupedOpenApi systemApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public io.swagger.v3.oas.models.OpenAPI customOpenApi() {
        return null;
    }
}