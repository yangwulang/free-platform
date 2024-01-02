package top.yangwulang.platform.exception;

import java.lang.System;

/**
 * @author yangwulang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0006B\u0011\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fB\u0011\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\rB+\b\u0014\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ltop/yangwulang/platform/exception/ServiceException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "exceptionSerializable", "Ltop/yangwulang/platform/exception/ServiceExceptionSerializable;", "(Ltop/yangwulang/platform/exception/ServiceExceptionSerializable;)V", "()V", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "enableSuppression", "", "writableStackTrace", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "code", "getCode", "()Ljava/lang/String;", "free-platform-framework"})
public class ServiceException extends java.lang.RuntimeException {
    private top.yangwulang.platform.exception.ServiceExceptionSerializable exceptionSerializable;
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCode() {
        return null;
    }
    
    public ServiceException(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.exception.ServiceExceptionSerializable exceptionSerializable) {
        super();
    }
    
    public ServiceException() {
        super();
    }
    
    public ServiceException(@org.jetbrains.annotations.Nullable
    java.lang.String message) {
        super();
    }
    
    public ServiceException(@org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.Nullable
    java.lang.Throwable cause) {
        super();
    }
    
    public ServiceException(@org.jetbrains.annotations.Nullable
    java.lang.Throwable cause) {
        super();
    }
    
    protected ServiceException(@org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.Nullable
    java.lang.Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super();
    }
}