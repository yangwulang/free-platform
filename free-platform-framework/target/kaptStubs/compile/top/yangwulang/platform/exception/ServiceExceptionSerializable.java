package top.yangwulang.platform.exception;

import java.lang.System;

/**
 * 服务层异常处理，此接口实现类可以是枚举，
 * 可以配合{@link top.yangwulang.platform.exception.ServiceException}使用
 *
 * @author yangwulang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\u0005"}, d2 = {"Ltop/yangwulang/platform/exception/ServiceExceptionSerializable;", "", "code", "", "message", "free-platform-framework"})
public abstract interface ServiceExceptionSerializable {
    
    /**
     * 编码
     */
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String code();
    
    /**
     * 消息
     */
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String message();
}