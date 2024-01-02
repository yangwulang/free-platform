package top.yangwulang.platform.controller.sys;

import java.lang.System;

/**
 * @author yangwulang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0007J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0007J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u001fH\u0007J\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0001\u0010#\u001a\u00020$H\u0007J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010&\u001a\u00020\'H\u0007J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006,"}, d2 = {"Ltop/yangwulang/platform/controller/sys/DictController;", "", "()V", "dictDataService", "Ltop/yangwulang/platform/services/DictDataService;", "getDictDataService", "()Ltop/yangwulang/platform/services/DictDataService;", "setDictDataService", "(Ltop/yangwulang/platform/services/DictDataService;)V", "dictTypeService", "Ltop/yangwulang/platform/services/DictTypeService;", "getDictTypeService", "()Ltop/yangwulang/platform/services/DictTypeService;", "setDictTypeService", "(Ltop/yangwulang/platform/services/DictTypeService;)V", "deleteData", "Ltop/yangwulang/platform/entity/Result;", "Ljava/lang/Void;", "id", "", "deleteType", "getData", "Ltop/yangwulang/platform/entity/sys/dto/DictDataGetView;", "getType", "Ltop/yangwulang/platform/entity/sys/dto/DictTypeGetView;", "listData", "Lorg/springframework/data/domain/Page;", "Ltop/yangwulang/platform/entity/sys/dto/DictTypeListView;", "httpServletRequest", "Ljakarta/servlet/http/HttpServletRequest;", "listSpecification", "Ltop/yangwulang/platform/entity/sys/dto/DictTypeListSpecification;", "listDictData", "", "Ltop/yangwulang/platform/entity/sys/dto/DictDataListView;", "dictDataInput", "Ltop/yangwulang/platform/entity/sys/dto/DictDataListInput;", "saveData", "dictData", "Ltop/yangwulang/platform/entity/sys/dto/DictDataSaveInput;", "saveType", "Ltop/yangwulang/platform/entity/sys/DictType;", "dictTypeInput", "Ltop/yangwulang/platform/entity/sys/input/DictTypeInput;", "free-platform-framework"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${adminPath}/sys/dict"})
@io.swagger.v3.oas.annotations.tags.Tags(value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "\u7cfb\u7edf\u6a21\u5757"), @io.swagger.v3.oas.annotations.tags.Tag(name = "\u5b57\u5178\u7ba1\u7406")})
@org.springframework.web.bind.annotation.RestController
public final class DictController {
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.DictTypeService dictTypeService;
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.DictDataService dictDataService;
    
    public DictController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.DictTypeService getDictTypeService() {
        return null;
    }
    
    public final void setDictTypeService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.DictTypeService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.DictDataService getDictDataService() {
        return null;
    }
    
    public final void setDictDataService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.DictDataService p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u5b57\u5178\u7c7b\u578b\u6570\u636e")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/dictType/{id}"})
    @cn.dev33.satoken.annotation.SaCheckPermission(value = {"sys:dictType:view"})
    public final top.yangwulang.platform.entity.sys.dto.DictTypeGetView getType(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u5b57\u5178\u7c7b\u578b\u5217\u8868")
    @org.springframework.web.bind.annotation.PostMapping(value = {"/dictType"})
    @cn.dev33.satoken.annotation.SaCheckPermission(value = {"sys:dictType:view"})
    public final org.springframework.data.domain.Page<top.yangwulang.platform.entity.sys.dto.DictTypeListView> listData(@org.jetbrains.annotations.Nullable
    jakarta.servlet.http.HttpServletRequest httpServletRequest, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.dto.DictTypeListSpecification listSpecification) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u65b0\u589e\u6216\u4fee\u6539\u5b57\u5178\u7c7b\u578b")
    @org.springframework.web.bind.annotation.PutMapping(value = {"/dictType"})
    public final top.yangwulang.platform.entity.sys.DictType saveType(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.entity.sys.input.DictTypeInput dictTypeInput) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u5220\u9664\u5b57\u5178\u7c7b\u578b")
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/dictType/{id}"})
    public final top.yangwulang.platform.entity.Result<java.lang.Void> deleteType(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u5b57\u5178\u6570\u636e")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/dictData/{id}"})
    public final top.yangwulang.platform.entity.sys.dto.DictDataGetView getData(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u5b57\u5178\u6570\u636e\u5217\u8868")
    @org.springframework.web.bind.annotation.PostMapping(value = {"/dictData"})
    public final java.util.List<top.yangwulang.platform.entity.sys.dto.DictDataListView> listDictData(@org.jetbrains.annotations.Nullable
    jakarta.servlet.http.HttpServletRequest httpServletRequest, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.dto.DictDataListInput dictDataInput) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u65b0\u589e\u6216\u4fee\u6539\u5b57\u5178\u6570\u636e")
    @org.springframework.web.bind.annotation.PutMapping(value = {"/dictData"})
    public final top.yangwulang.platform.entity.Result<java.lang.Void> saveData(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.entity.sys.dto.DictDataSaveInput dictData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u5220\u9664\u5b57\u5178\u6570\u636e")
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/dictData/{id}"})
    public final top.yangwulang.platform.entity.Result<java.lang.Void> deleteData(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
}