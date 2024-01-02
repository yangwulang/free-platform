package top.yangwulang.platform.controller.sys;

import java.lang.System;

/**
 * @author yangwulang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0007J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00140\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0007J\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u0007J\u0012\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010!\u001a\u00020\"H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006#"}, d2 = {"Ltop/yangwulang/platform/controller/sys/MenuController;", "", "()V", "menuService", "Ltop/yangwulang/platform/services/MenuService;", "getMenuService", "()Ltop/yangwulang/platform/services/MenuService;", "setMenuService", "(Ltop/yangwulang/platform/services/MenuService;)V", "bandRoleMenu", "", "roleMenuVo", "Ltop/yangwulang/platform/entity/sys/vo/RoleMenuVo;", "delete", "Ltop/yangwulang/platform/entity/Result;", "Ljava/lang/Void;", "id", "", "findByRoleId", "", "Lcn/hutool/core/lang/tree/Tree;", "roleId", "findByUserId", "userId", "findRoleMenuIdsByRoleId", "get", "Ltop/yangwulang/platform/entity/sys/dto/MenuGetView;", "listData", "Ltop/yangwulang/platform/entity/sys/dto/MenuListView;", "input", "Ltop/yangwulang/platform/entity/sys/dto/MenuListInput;", "save", "Ltop/yangwulang/platform/entity/sys/Menu;", "menu", "Ltop/yangwulang/platform/entity/sys/input/menu/MenuSaveInput;", "free-platform-framework"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${adminPath}/sys/menu"})
@io.swagger.v3.oas.annotations.tags.Tags(value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "\u7cfb\u7edf\u6a21\u5757"), @io.swagger.v3.oas.annotations.tags.Tag(name = "\u83dc\u5355\u7ba1\u7406")})
@org.springframework.web.bind.annotation.RestController
public final class MenuController {
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.MenuService menuService;
    
    public MenuController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.MenuService getMenuService() {
        return null;
    }
    
    public final void setMenuService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.MenuService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u83dc\u5355\u5217\u8868")
    @org.springframework.web.bind.annotation.PostMapping
    public final java.util.List<top.yangwulang.platform.entity.sys.dto.MenuListView> listData(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.dto.MenuListInput input) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u83dc\u5355\u8be6\u60c5")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public final top.yangwulang.platform.entity.sys.dto.MenuGetView get(@org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u5220\u9664\u83dc\u5355")
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    public final top.yangwulang.platform.entity.Result<java.lang.Void> delete(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u4fee\u6539\u6216\u65b0\u589e\u83dc\u5355")
    @org.springframework.web.bind.annotation.PutMapping
    public final top.yangwulang.platform.entity.sys.Menu save(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.input.menu.MenuSaveInput menu) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u67e5\u8be2\u7528\u6237\u4e0b\u6240\u62e5\u6709\u7684\u83dc\u5355")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/findByUserId"})
    @org.babyfish.jimmer.client.NotApi
    public final java.util.List<cn.hutool.core.lang.tree.Tree<java.lang.String>> findByUserId(@org.jetbrains.annotations.Nullable
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u67e5\u8be2\u89d2\u8272\u4e0b\u6240\u6709\u7684\u83dc\u5355")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/findByRoleId"})
    @org.babyfish.jimmer.client.NotApi
    public final java.util.List<cn.hutool.core.lang.tree.Tree<java.lang.String>> findByRoleId(@org.jetbrains.annotations.Nullable
    java.lang.String roleId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u89d2\u8272\u6240\u9009\u53d6\u7684\u83dc\u5355")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/findRoleMenuIdsByRoleId"})
    public final top.yangwulang.platform.entity.sys.vo.RoleMenuVo findRoleMenuIdsByRoleId(@org.jetbrains.annotations.Nullable
    java.lang.String roleId) {
        return null;
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\u7ed1\u5b9a\u89d2\u8272\u548c\u83dc\u5355\u5173\u7cfb")
    @org.springframework.web.bind.annotation.PutMapping(value = {"/bandRoleMenu"})
    public final void bandRoleMenu(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.entity.sys.vo.RoleMenuVo roleMenuVo) {
    }
}