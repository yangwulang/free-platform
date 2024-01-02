package top.yangwulang.platform.controller.sys;

import java.lang.System;

/**
 * @author yangwulang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Ltop/yangwulang/platform/controller/sys/EmployeeController;", "", "()V", "employeeService", "Ltop/yangwulang/platform/services/EmployeeService;", "getEmployeeService", "()Ltop/yangwulang/platform/services/EmployeeService;", "setEmployeeService", "(Ltop/yangwulang/platform/services/EmployeeService;)V", "get", "Ltop/yangwulang/platform/entity/sys/dto/EmployeeGetView;", "id", "", "listData", "Lorg/springframework/data/domain/Page;", "Ltop/yangwulang/platform/entity/sys/dto/EmployeeListView;", "input", "Ltop/yangwulang/platform/entity/sys/dto/EmployeeListInput;", "request", "Ljakarta/servlet/http/HttpServletRequest;", "free-platform-framework"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${adminPath}/sys/employee"})
@io.swagger.v3.oas.annotations.tags.Tags(value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "\u7cfb\u7edf\u6a21\u5757"), @io.swagger.v3.oas.annotations.tags.Tag(name = "\u5458\u5de5\u7ba1\u7406")})
@org.springframework.web.bind.annotation.RestController
public final class EmployeeController {
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.EmployeeService employeeService;
    
    public EmployeeController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.EmployeeService getEmployeeService() {
        return null;
    }
    
    public final void setEmployeeService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.EmployeeService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u5458\u5de5\u5217\u8868")
    @org.springframework.web.bind.annotation.PostMapping
    public final org.springframework.data.domain.Page<top.yangwulang.platform.entity.sys.dto.EmployeeListView> listData(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.dto.EmployeeListInput input, @org.jetbrains.annotations.Nullable
    jakarta.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u5458\u5de5\u4fe1\u606f")
    public final top.yangwulang.platform.entity.sys.dto.EmployeeGetView get(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
}