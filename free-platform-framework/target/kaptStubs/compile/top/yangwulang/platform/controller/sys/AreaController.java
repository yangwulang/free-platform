package top.yangwulang.platform.controller.sys;

import java.lang.System;

/**
 * @author yangwulang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0087\u0002J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Ltop/yangwulang/platform/controller/sys/AreaController;", "", "()V", "areaService", "Ltop/yangwulang/platform/services/AreaService;", "getAreaService", "()Ltop/yangwulang/platform/services/AreaService;", "setAreaService", "(Ltop/yangwulang/platform/services/AreaService;)V", "delete", "", "id", "", "get", "Ltop/yangwulang/platform/entity/sys/dto/AreaGetView;", "listData", "", "Ltop/yangwulang/platform/entity/sys/dto/AreaListView;", "areaQo", "Ltop/yangwulang/platform/entity/sys/dto/AreaListInput;", "save", "Ltop/yangwulang/platform/entity/sys/Area;", "input", "Ltop/yangwulang/platform/entity/sys/input/area/AreaSaveInput;", "free-platform-framework"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${adminPath}/sys/area"})
@io.swagger.v3.oas.annotations.tags.Tags(value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "\u7cfb\u7edf\u6a21\u5757"), @io.swagger.v3.oas.annotations.tags.Tag(name = "\u533a\u57df\u7ba1\u7406")})
@org.springframework.web.bind.annotation.RestController
public final class AreaController {
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.AreaService areaService;
    
    public AreaController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.AreaService getAreaService() {
        return null;
    }
    
    public final void setAreaService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.AreaService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u533a\u57df\u5217\u8868")
    @org.springframework.web.bind.annotation.PostMapping
    public final java.util.List<top.yangwulang.platform.entity.sys.dto.AreaListView> listData(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.dto.AreaListInput areaQo) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u533a\u57df\u8be6\u60c5")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public final top.yangwulang.platform.entity.sys.dto.AreaGetView get(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\u5220\u9664\u533a\u57df")
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    public final void delete(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u4fee\u6539\u6216\u65b0\u589e\u533a\u57df")
    @org.springframework.web.bind.annotation.PutMapping
    public final top.yangwulang.platform.entity.sys.Area save(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.input.area.AreaSaveInput input) {
        return null;
    }
}