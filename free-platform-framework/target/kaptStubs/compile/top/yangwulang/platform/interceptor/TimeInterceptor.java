package top.yangwulang.platform.interceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Ltop/yangwulang/platform/interceptor/TimeInterceptor;", "Lorg/springframework/web/servlet/AsyncHandlerInterceptor;", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "<set-?>", "", "startTime", "getStartTime", "()J", "setStartTime", "(J)V", "startTime$delegate", "Lkotlin/properties/ReadWriteProperty;", "postHandle", "", "request", "Ljakarta/servlet/http/HttpServletRequest;", "response", "Ljakarta/servlet/http/HttpServletResponse;", "handler", "", "modelAndView", "Lorg/springframework/web/servlet/ModelAndView;", "preHandle", "", "free-platform-framework"})
public final class TimeInterceptor implements org.springframework.web.servlet.AsyncHandlerInterceptor {
    private final org.slf4j.Logger logger = null;
    private final kotlin.properties.ReadWriteProperty startTime$delegate = null;
    
    public TimeInterceptor() {
        super();
    }
    
    private final long getStartTime() {
        return 0L;
    }
    
    private final void setStartTime(long p0) {
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