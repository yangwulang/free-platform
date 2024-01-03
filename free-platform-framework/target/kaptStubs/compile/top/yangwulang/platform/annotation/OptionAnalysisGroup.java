package top.yangwulang.platform.annotation;

import java.lang.System;

/**
 * 操作分析组
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004R\u0017\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Ltop/yangwulang/platform/annotation/OptionAnalysisGroup;", "", "analysis", "", "Ltop/yangwulang/platform/annotation/OptionAnalysis;", "()[Ltop/yangwulang/platform/annotation/OptionAnalysis;", "free-platform-framework"})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
public abstract @interface OptionAnalysisGroup {
    
    public abstract top.yangwulang.platform.annotation.OptionAnalysis[] analysis();
}