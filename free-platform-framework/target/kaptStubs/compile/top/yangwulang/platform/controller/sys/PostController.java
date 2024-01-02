package top.yangwulang.platform.controller.sys;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0087\u0002J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0012\u001a\u00020\u0016H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Ltop/yangwulang/platform/controller/sys/PostController;", "", "()V", "postService", "Ltop/yangwulang/platform/services/PostService;", "getPostService", "()Ltop/yangwulang/platform/services/PostService;", "setPostService", "(Ltop/yangwulang/platform/services/PostService;)V", "get", "Ltop/yangwulang/platform/entity/sys/dto/PostGetView;", "id", "", "listData", "Lorg/springframework/data/domain/Page;", "Ltop/yangwulang/platform/entity/sys/dto/PostListView;", "request", "Ljakarta/servlet/http/HttpServletRequest;", "input", "Ltop/yangwulang/platform/entity/sys/dto/PostListSpecification;", "save", "Ltop/yangwulang/platform/entity/sys/Post;", "Ltop/yangwulang/platform/entity/sys/dto/PostSaveInput;", "free-platform-framework"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${adminPath}/sys/post"})
@io.swagger.v3.oas.annotations.tags.Tags(value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "\u7cfb\u7edf\u6a21\u5757"), @io.swagger.v3.oas.annotations.tags.Tag(name = "\u5c97\u4f4d\u7ba1\u7406")})
@org.springframework.web.bind.annotation.RestController
public final class PostController {
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.PostService postService;
    
    public PostController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.PostService getPostService() {
        return null;
    }
    
    public final void setPostService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.PostService p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u5c97\u4f4d\u4fe1\u606f")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public final top.yangwulang.platform.entity.sys.dto.PostGetView get(@org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.PathVariable(value = "id")
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u5c97\u4f4d\u5217\u8868")
    @org.springframework.web.bind.annotation.PostMapping
    public final org.springframework.data.domain.Page<top.yangwulang.platform.entity.sys.dto.PostListView> listData(@org.jetbrains.annotations.Nullable
    jakarta.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.dto.PostListSpecification input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u65b0\u589e\u6216\u4fee\u6539\u5c97\u4f4d")
    @org.springframework.web.bind.annotation.PutMapping
    public final top.yangwulang.platform.entity.sys.Post save(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.sys.dto.PostSaveInput input) {
        return null;
    }
}