package top.yangwulang.platform.controller.sys;

import java.lang.System;

/**
 * @author yangwulang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\fH\u0007J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\fH\u0007J\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u0007J\u0012\u0010\u001f\u001a\u00020\n2\b\b\u0001\u0010\u001d\u001a\u00020 H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006!"}, d2 = {"Ltop/yangwulang/platform/controller/sys/UserController;", "", "()V", "userService", "Ltop/yangwulang/platform/services/UserService;", "getUserService", "()Ltop/yangwulang/platform/services/UserService;", "setUserService", "(Ltop/yangwulang/platform/services/UserService;)V", "activeUser", "", "userId", "", "adminResetPassword", "Ltop/yangwulang/platform/entity/Result;", "Ljava/lang/Void;", "id", "delete", "get", "Ltop/yangwulang/platform/entity/sys/dto/UserGetView;", "getRolesByUserId", "", "Lorg/babyfish/jimmer/View;", "Ltop/yangwulang/platform/entity/sys/Role;", "listData", "Lorg/springframework/data/domain/Page;", "Ltop/yangwulang/platform/entity/sys/dto/UserListView;", "request", "Ljakarta/servlet/http/HttpServletRequest;", "user", "Ltop/yangwulang/platform/entity/sys/dto/UserListInput;", "save", "Ltop/yangwulang/platform/entity/sys/input/user/UserSaveInput;", "free-platform-framework"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${adminPath}/sys/user"})
@io.swagger.v3.oas.annotations.tags.Tags(value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "\u7cfb\u7edf\u6a21\u5757"), @io.swagger.v3.oas.annotations.tags.Tag(name = "\u7528\u6237\u7ba1\u7406")})
@org.springframework.web.bind.annotation.RestController
public final class UserController {
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.UserService userService;
    
    public UserController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.UserService getUserService() {
        return null;
    }
    
    public final void setUserService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.UserService p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.Parameters(value = {@io.swagger.v3.oas.annotations.Parameter(required = true, in = io.swagger.v3.oas.annotations.enums.ParameterIn.PATH, name = "id", description = "\u7c7b\u578b\u4e3b\u952e")})
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u7528\u6237\u4fe1\u606f")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public final top.yangwulang.platform.entity.sys.dto.UserGetView get(@org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Parameters(value = {@io.swagger.v3.oas.annotations.Parameter(required = true, in = io.swagger.v3.oas.annotations.enums.ParameterIn.PATH, name = "userId", description = "\u7528\u6237\u4e3b\u952e")})
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u7528\u6237\u4fe1\u606f\u6240\u6709\u62e5\u6709\u7684\u89d2\u8272")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/roles/{userId}"})
    public final java.util.List<org.babyfish.jimmer.View<top.yangwulang.platform.entity.sys.Role>> getRolesByUserId(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "userId")
    java.lang.String userId) {
        return null;
    }
    
    @io.swagger.v3.oas.annotations.Parameters(value = {@io.swagger.v3.oas.annotations.Parameter(required = true, name = "userId", description = "\u7528\u6237id")})
    @io.swagger.v3.oas.annotations.Operation(summary = "\u6fc0\u6d3b\u7528\u6237")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/active/{userId}"})
    public final void activeUser(@org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.PathVariable(value = "userId")
    java.lang.String userId) {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u7528\u6237\u5217\u8868")
    @org.springframework.web.bind.annotation.PostMapping
    public final org.springframework.data.domain.Page<top.yangwulang.platform.entity.sys.dto.UserListView> listData(@org.jetbrains.annotations.Nullable
    jakarta.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.dto.UserListInput user) {
        return null;
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\u4fee\u6539\u6216\u65b0\u589e\u7528\u6237")
    @org.springframework.web.bind.annotation.PutMapping
    public final void save(@org.jetbrains.annotations.NotNull
    @org.springframework.validation.annotation.Validated
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.input.user.UserSaveInput user) {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Parameters(value = {@io.swagger.v3.oas.annotations.Parameter(required = true, in = io.swagger.v3.oas.annotations.enums.ParameterIn.PATH, name = "id", description = "\u4e3b\u952e")})
    @io.swagger.v3.oas.annotations.Operation(summary = "\u5220\u9664\u7528\u6237\u4fe1\u606f")
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    public final top.yangwulang.platform.entity.Result<java.lang.Void> delete(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u7ba1\u7406\u5458\u91cd\u7f6e\u7528\u6237\u5bc6\u7801")
    @org.springframework.web.bind.annotation.PutMapping(value = {"/resetPassword/{id}"})
    public final top.yangwulang.platform.entity.Result<java.lang.Void> adminResetPassword(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
}