package top.yangwulang.platform.config;

import java.lang.System;

/**
 * @author yangwulang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\b\u0001\u0010\u0006\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0018\u00010\u0007H\u0017J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0018\b\u0001\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0018\u00010\u0007H\u0017\u00a8\u0006\f"}, d2 = {"Ltop/yangwulang/platform/config/DataScopeConfiguration;", "", "()V", "areaDataScopeManager", "Ltop/yangwulang/platform/security/datascope/DataScopeManager;", "Ltop/yangwulang/platform/entity/sys/AreaTable;", "chains", "", "Ltop/yangwulang/platform/security/datascope/DataScopeChain;", "userDataScopeManager", "Ltop/yangwulang/platform/entity/sys/UserTable;", "userDataScopeChain", "free-platform-framework"})
@org.springframework.context.annotation.Configuration
public class DataScopeConfiguration {
    
    public DataScopeConfiguration() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public top.yangwulang.platform.security.datascope.DataScopeManager<top.yangwulang.platform.entity.sys.UserTable> userDataScopeManager(@org.jetbrains.annotations.Nullable
    @org.springframework.beans.factory.annotation.Autowired(required = false)
    java.util.List<? extends top.yangwulang.platform.security.datascope.DataScopeChain<top.yangwulang.platform.entity.sys.UserTable>> userDataScopeChain) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public top.yangwulang.platform.security.datascope.DataScopeManager<top.yangwulang.platform.entity.sys.AreaTable> areaDataScopeManager(@org.jetbrains.annotations.Nullable
    @org.springframework.beans.factory.annotation.Autowired(required = false)
    java.util.List<? extends top.yangwulang.platform.security.datascope.DataScopeChain<top.yangwulang.platform.entity.sys.AreaTable>> chains) {
        return null;
    }
}