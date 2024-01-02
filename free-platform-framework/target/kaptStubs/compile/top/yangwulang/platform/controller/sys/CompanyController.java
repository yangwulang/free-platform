package top.yangwulang.platform.controller.sys;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001b"}, d2 = {"Ltop/yangwulang/platform/controller/sys/CompanyController;", "", "()V", "companyService", "Ltop/yangwulang/platform/services/CompanyService;", "getCompanyService", "()Ltop/yangwulang/platform/services/CompanyService;", "setCompanyService", "(Ltop/yangwulang/platform/services/CompanyService;)V", "delete", "Ltop/yangwulang/platform/entity/Result;", "Ljava/lang/Void;", "id", "", "get", "Ltop/yangwulang/platform/entity/sys/dto/CompanyGetView;", "listData", "Lorg/springframework/data/domain/Page;", "Ltop/yangwulang/platform/entity/sys/dto/CompanyListView;", "companyListInput", "Ltop/yangwulang/platform/entity/sys/dto/CompanyListInput;", "request", "Ljakarta/servlet/http/HttpServletRequest;", "save", "Ltop/yangwulang/platform/entity/sys/Company;", "input", "Ltop/yangwulang/platform/entity/sys/dto/CompanySaveInput;", "free-platform-framework"})
@io.swagger.v3.oas.annotations.tags.Tags(value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "\u7cfb\u7edf\u6a21\u5757"), @io.swagger.v3.oas.annotations.tags.Tag(name = "\u4f01\u4e1a\u7ba1\u7406")})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${adminPath}/sys/company"})
@org.springframework.web.bind.annotation.RestController
public final class CompanyController {
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.CompanyService companyService;
    
    public CompanyController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.CompanyService getCompanyService() {
        return null;
    }
    
    public final void setCompanyService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.CompanyService p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u4f01\u4e1a\u8be6\u60c5")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public final top.yangwulang.platform.entity.sys.dto.CompanyGetView get(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u4f01\u4e1a\u5217\u8868")
    @org.springframework.web.bind.annotation.PostMapping
    public final org.springframework.data.domain.Page<top.yangwulang.platform.entity.sys.dto.CompanyListView> listData(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.dto.CompanyListInput companyListInput, @org.jetbrains.annotations.Nullable
    jakarta.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u5220\u9664\u4f01\u4e1a")
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    public final top.yangwulang.platform.entity.Result<java.lang.Void> delete(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u65b0\u589e\u6216\u4fee\u6539\u4f01\u4e1a\u4fe1\u606f")
    @org.springframework.web.bind.annotation.PutMapping
    public final top.yangwulang.platform.entity.Result<top.yangwulang.platform.entity.sys.Company> save(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.dto.CompanySaveInput input) {
        return null;
    }
}