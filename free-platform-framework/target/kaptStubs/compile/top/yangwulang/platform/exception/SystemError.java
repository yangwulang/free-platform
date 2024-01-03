package top.yangwulang.platform.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Ltop/yangwulang/platform/exception/SystemError;", "", "Ltop/yangwulang/platform/exception/ServiceExceptionSerializable;", "code", "", "message", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "UN_KNOWN_ACCOUNT", "INCORRECT_ACCOUNT_PASSWORD", "NOT_HIVE_AUTH", "USER_NOT_FOUND", "LOGIN_CODE_EXISTS", "CANT_DELETE_SUPER_ADMIN", "free-platform-framework"})
public enum SystemError implements top.yangwulang.platform.exception.ServiceExceptionSerializable {
    /*public static final*/ UN_KNOWN_ACCOUNT /* = new UN_KNOWN_ACCOUNT(null, null) */,
    /*public static final*/ INCORRECT_ACCOUNT_PASSWORD /* = new INCORRECT_ACCOUNT_PASSWORD(null, null) */,
    /*public static final*/ NOT_HIVE_AUTH /* = new NOT_HIVE_AUTH(null, null) */,
    /*public static final*/ USER_NOT_FOUND /* = new USER_NOT_FOUND(null, null) */,
    /*public static final*/ LOGIN_CODE_EXISTS /* = new LOGIN_CODE_EXISTS(null, null) */,
    /*public static final*/ CANT_DELETE_SUPER_ADMIN /* = new CANT_DELETE_SUPER_ADMIN(null, null) */;
    private final java.lang.String code = null;
    private final java.lang.String message = null;
    
    SystemError(java.lang.String code, java.lang.String message) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String code() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String message() {
        return null;
    }
}