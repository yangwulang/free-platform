package top.yangwulang.platform.controller.sys;

import java.lang.System;

/**
 * @author yangwulang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0014H\u0007J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0007J\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010!\u001a\u00020\"H\u0007J\"\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010%\u001a\u00020&H\u0007J\u0012\u0010\'\u001a\u00020(2\b\b\u0001\u0010)\u001a\u00020*H\u0007J\u001c\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u00192\b\u0010-\u001a\u0004\u0018\u00010\u0019H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006."}, d2 = {"Ltop/yangwulang/platform/controller/sys/RoleController;", "", "()V", "roleService", "Ltop/yangwulang/platform/services/RoleService;", "getRoleService", "()Ltop/yangwulang/platform/services/RoleService;", "setRoleService", "(Ltop/yangwulang/platform/services/RoleService;)V", "userService", "Ltop/yangwulang/platform/services/UserService;", "getUserService", "()Ltop/yangwulang/platform/services/UserService;", "setUserService", "(Ltop/yangwulang/platform/services/UserService;)V", "bindUserRole", "", "qo", "Ltop/yangwulang/platform/entity/sys/input/role/BindUserRoleQo;", "bindUserRoleBatch", "Ltop/yangwulang/platform/entity/sys/input/role/BindUserRoleBatchQo;", "delete", "Ltop/yangwulang/platform/entity/Result;", "Ljava/lang/Void;", "id", "", "get", "Ltop/yangwulang/platform/entity/sys/dto/RoleGetView;", "listData", "Lorg/springframework/data/domain/Page;", "Ltop/yangwulang/platform/entity/sys/dto/RoleListView;", "request", "Ljakarta/servlet/http/HttpServletRequest;", "specification", "Ltop/yangwulang/platform/entity/sys/dto/RoleListSpecification;", "listUserData", "Ltop/yangwulang/platform/entity/sys/dto/UserListView;", "allocationUserQo", "Ltop/yangwulang/platform/entity/sys/input/role/AllocationUserQo;", "save", "Ltop/yangwulang/platform/entity/sys/Role;", "roleInput", "Ltop/yangwulang/platform/entity/sys/input/RoleInput;", "unBindUserRole", "userId", "roleId", "free-platform-framework"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${adminPath}/sys/role"})
@io.swagger.v3.oas.annotations.tags.Tags(value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "\u7cfb\u7edf\u6a21\u5757"), @io.swagger.v3.oas.annotations.tags.Tag(name = "\u89d2\u8272\u7ba1\u7406")})
@org.springframework.web.bind.annotation.RestController
public final class RoleController {
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.RoleService roleService;
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.UserService userService;
    
    public RoleController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.RoleService getRoleService() {
        return null;
    }
    
    public final void setRoleService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.RoleService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.UserService getUserService() {
        return null;
    }
    
    public final void setUserService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.UserService p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u89d2\u8272\u4fe1\u606f")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public final top.yangwulang.platform.entity.sys.dto.RoleGetView get(@org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u89d2\u8272\u5217\u8868")
    @org.springframework.web.bind.annotation.PostMapping
    public final org.springframework.data.domain.Page<top.yangwulang.platform.entity.sys.dto.RoleListView> listData(@org.jetbrains.annotations.Nullable
    jakarta.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.dto.RoleListSpecification specification) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u89d2\u8272\u6388\u6743\u7684\u7528\u6237")
    @org.springframework.web.bind.annotation.PostMapping(value = {"/allocationUser"})
    public final org.springframework.data.domain.Page<top.yangwulang.platform.entity.sys.dto.UserListView> listUserData(@org.jetbrains.annotations.Nullable
    jakarta.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.input.role.AllocationUserQo allocationUserQo) {
        return null;
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\u89e3\u9664\u89d2\u8272\u6388\u6743")
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/unBindUserRole"})
    public final void unBindUserRole(@org.jetbrains.annotations.Nullable
    java.lang.String userId, @org.jetbrains.annotations.Nullable
    java.lang.String roleId) {
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\u6388\u6743\u7528\u6237\u89d2\u8272")
    @org.springframework.web.bind.annotation.PutMapping(value = {"/bindUserRole"})
    public final void bindUserRole(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.input.role.BindUserRoleQo qo) {
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\u6279\u91cf\u6388\u6743\u7528\u6237\u89d2\u8272")
    @org.springframework.web.bind.annotation.PostMapping(value = {"/bindUserRoleBatch"})
    public final void bindUserRoleBatch(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.input.role.BindUserRoleBatchQo qo) {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u4fdd\u5b58\u6216\u4fee\u6539\u89d2\u8272\u4fe1\u606f")
    @org.springframework.web.bind.annotation.PutMapping
    public final top.yangwulang.platform.entity.sys.Role save(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.input.RoleInput roleInput) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u5220\u9664\u89d2\u8272\u4fe1\u606f")
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    public final top.yangwulang.platform.entity.Result<java.lang.Void> delete(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
}