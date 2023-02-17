package top.yangwulang.platform.controller.sys;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import top.yangwulang.platform.entity.PageHttpRequest;
import top.yangwulang.platform.entity.Result;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleFetcher;
import top.yangwulang.platform.entity.sys.input.RoleInput;
import top.yangwulang.platform.repository.sys.RoleRepository;

@RestController
@Tags(value = {
        @Tag(name = "系统模块"),
        @Tag(name = "角色管理"),
})
@RequestMapping("${adminPath}/sys/role")
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    private final RoleFetcher roleFetcher = RoleFetcher.$.allScalarFields();


    @GetMapping("/{id}")
    @Operation(summary = "获取角色信息")
    public Role get(@PathVariable("id") String id) {
        return roleRepository.findNullable(id);
    }

    @PostMapping
    @Operation(summary = "获取角色列表")
    public Page<Role> listData(HttpServletRequest request) {
        return roleRepository.findAll(PageHttpRequest.of(request).toPage(), roleFetcher);
    }

    @PutMapping
    @Operation(summary = "保存或修改角色信息")
    public Role save(@RequestBody RoleInput roleInput) {
        return roleRepository.save(roleInput);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除角色信息")
    public Result<Void> delete(@PathVariable("id") String id) {
        roleRepository.deleteById(id);
        return new Result<Void>().success("删除成功");
    }

}
