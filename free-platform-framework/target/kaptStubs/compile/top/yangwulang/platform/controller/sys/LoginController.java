package top.yangwulang.platform.controller.sys;

import java.lang.System;

/**
 * @author yangwulang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r0\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Ltop/yangwulang/platform/controller/sys/LoginController;", "", "()V", "log", "Lorg/slf4j/Logger;", "userService", "Ltop/yangwulang/platform/services/UserService;", "getUserService", "()Ltop/yangwulang/platform/services/UserService;", "setUserService", "(Ltop/yangwulang/platform/services/UserService;)V", "login", "Ltop/yangwulang/platform/entity/Result;", "", "", "loginInput", "Ltop/yangwulang/platform/entity/sys/input/LoginInput;", "loginOut", "", "loginUserInfo", "Ltop/yangwulang/platform/entity/sys/dto/LoginUserInfoView;", "registerUser", "user", "Ltop/yangwulang/platform/entity/sys/input/user/UserSaveInput;", "tokenInfo", "Lcn/dev33/satoken/stp/SaTokenInfo;", "free-platform-framework"})
@io.swagger.v3.oas.annotations.tags.Tags(value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "\u7cfb\u7edf\u6a21\u5757"), @io.swagger.v3.oas.annotations.tags.Tag(name = "\u767b\u5f55\u63a7\u5236\u5668")})
@org.springframework.web.bind.annotation.RequestMapping
@org.springframework.web.bind.annotation.RestController
public class LoginController {
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.UserService userService;
    private final org.slf4j.Logger log = null;
    
    public LoginController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.UserService getUserService() {
        return null;
    }
    
    public final void setUserService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.UserService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u767b\u5f55\u63a5\u53e3")
    @org.springframework.web.bind.annotation.PostMapping(value = {"/login"})
    public final top.yangwulang.platform.entity.Result<java.util.Map<java.lang.String, java.lang.Object>> login(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.input.LoginInput loginInput) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u67e5\u8be2\u5f53\u524d\u767b\u5f55\u4fe1\u606f")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/tokenInfo"})
    public final cn.dev33.satoken.stp.SaTokenInfo tokenInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.Operation(summary = "\u67e5\u8be2\u5f53\u524d\u767b\u5f55\u7684\u7528\u6237\u4fe1\u606f")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/loginUserInfo"})
    public final top.yangwulang.platform.entity.sys.dto.LoginUserInfoView loginUserInfo() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/logout"})
    public final void loginOut() {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PutMapping(value = {"/register"})
    @io.swagger.v3.oas.annotations.Operation(summary = "\u6ce8\u518c\u7528\u6237")
    public final top.yangwulang.platform.entity.Result<java.lang.Object> registerUser(@org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.input.user.UserSaveInput user) {
        return null;
    }
}