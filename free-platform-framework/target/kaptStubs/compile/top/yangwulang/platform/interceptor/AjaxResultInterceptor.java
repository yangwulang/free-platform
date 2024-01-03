package top.yangwulang.platform.interceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000f"}, d2 = {"Ltop/yangwulang/platform/interceptor/AjaxResultInterceptor;", "Lorg/springframework/web/servlet/AsyncHandlerInterceptor;", "()V", "postHandle", "", "request", "Ljakarta/servlet/http/HttpServletRequest;", "response", "Ljakarta/servlet/http/HttpServletResponse;", "handler", "", "modelAndView", "Lorg/springframework/web/servlet/ModelAndView;", "preHandle", "", "free-platform-framework"})
public final class AjaxResultInterceptor implements org.springframework.web.servlet.AsyncHandlerInterceptor {
    
    public AjaxResultInterceptor() {
        super();
    }
    
    @java.lang.Override
    public boolean preHandle(@org.jetbrains.annotations.NotNull
    jakarta.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull
    jakarta.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull
    java.lang.Object handler) {
        return false;
    }
    
    @java.lang.Override
    public void postHandle(@org.jetbrains.annotations.NotNull
    jakarta.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull
    jakarta.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull
    java.lang.Object handler, @org.jetbrains.annotations.Nullable
    org.springframework.web.servlet.ModelAndView modelAndView) {
    }
}