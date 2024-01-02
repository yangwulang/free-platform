package top.yangwulang.platform.handler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003JH\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0016\u001a\u00060\u001cj\u0002`\u001dH\u0007J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\t2\u0012\u0010 \u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000e0\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Ltop/yangwulang/platform/handler/GlobalControllerExceptionHandler;", "Lorg/springframework/web/servlet/mvc/method/annotation/ResponseBodyAdvice;", "", "()V", "logger", "Lorg/slf4j/Logger;", "beforeBodyWrite", "body", "returnType", "Lorg/springframework/core/MethodParameter;", "selectedContentType", "Lorg/springframework/http/MediaType;", "selectedConverterType", "Ljava/lang/Class;", "Lorg/springframework/http/converter/HttpMessageConverter;", "request", "Lorg/springframework/http/server/ServerHttpRequest;", "response", "Lorg/springframework/http/server/ServerHttpResponse;", "onMethodArgumentNotValidException", "Ltop/yangwulang/platform/entity/Result;", "", "exception", "Lorg/springframework/web/bind/MethodArgumentNotValidException;", "onServiceException", "serviceException", "Ltop/yangwulang/platform/exception/ServiceException;", "onServiceGException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "supports", "", "converterType", "free-platform-framework"})
@org.springframework.web.bind.annotation.RestControllerAdvice
public final class GlobalControllerExceptionHandler implements org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice<java.lang.Object> {
    private final org.slf4j.Logger logger = null;
    
    public GlobalControllerExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {top.yangwulang.platform.exception.ServiceException.class})
    public final top.yangwulang.platform.entity.Result<kotlin.Unit> onServiceException(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.exception.ServiceException serviceException) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {java.lang.Exception.class})
    public final top.yangwulang.platform.entity.Result<kotlin.Unit> onServiceGException(@org.jetbrains.annotations.NotNull
    java.lang.Exception exception) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {org.springframework.web.bind.MethodArgumentNotValidException.class})
    public final top.yangwulang.platform.entity.Result<kotlin.Unit> onMethodArgumentNotValidException(@org.jetbrains.annotations.NotNull
    org.springframework.web.bind.MethodArgumentNotValidException exception) {
        return null;
    }
    
    @java.lang.Override
    public boolean supports(@org.jetbrains.annotations.NotNull
    org.springframework.core.MethodParameter returnType, @org.jetbrains.annotations.NotNull
    java.lang.Class<? extends org.springframework.http.converter.HttpMessageConverter<?>> converterType) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object beforeBodyWrite(@org.jetbrains.annotations.Nullable
    java.lang.Object body, @org.jetbrains.annotations.NotNull
    org.springframework.core.MethodParameter returnType, @org.jetbrains.annotations.NotNull
    org.springframework.http.MediaType selectedContentType, @org.jetbrains.annotations.NotNull
    java.lang.Class<? extends org.springframework.http.converter.HttpMessageConverter<?>> selectedConverterType, @org.jetbrains.annotations.NotNull
    org.springframework.http.server.ServerHttpRequest request, @org.jetbrains.annotations.NotNull
    org.springframework.http.server.ServerHttpResponse response) {
        return null;
    }
}