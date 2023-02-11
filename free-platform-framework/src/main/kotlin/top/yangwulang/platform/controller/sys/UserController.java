package top.yangwulang.platform.controller.sys;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.servlet.http.HttpServletRequest;
import org.babyfish.jimmer.client.FetchBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import top.yangwulang.platform.entity.PageHttpRequest;
import top.yangwulang.platform.entity.Result;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserFetcher;
import top.yangwulang.platform.entity.sys.dto.UserInput;
import top.yangwulang.platform.entity.sys.dto.UserVo;
import top.yangwulang.platform.repository.sys.UserRepository;

/**
 * @author yangwulang
 */
@RestController
@Tags(value = {
        @Tag(name = "系统模块"),
        @Tag(name = "用户管理"),
})
@RequestMapping("${adminPath}/sys/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    private final UserFetcher userListFetcher = UserFetcher.$
            .allTableFields()
            .password(false);

    @GetMapping("/{id}")
    @Operation(summary = "获取用户信息")
    @Parameters({
            @Parameter(name = "id", description = "类型主键", required = true, in = ParameterIn.PATH)
    })
    public UserVo get(@PathVariable("id") String id) {
        return userRepository.findById(id)
                .map(UserVo::of)
                .orElse(null);
    }


    @PostMapping("/")
    @Operation(summary = "获取用户列表")
    public Page<User> listData(HttpServletRequest httpServletRequest, @RequestBody UserInput user) {
        return userRepository.findAll(PageHttpRequest.of(httpServletRequest).toPage(), userListFetcher, user);
    }


    @PutMapping("/")
    @Operation(summary = "修改或新增用户")
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }


    @DeleteMapping("/{id}")
    @Operation(summary = "删除用户信息")
    @Parameters({
            @Parameter(name = "id", description = "主键", required = true, in = ParameterIn.PATH)
    })
    public Result<Void> delete(@PathVariable("id") String id) {
        userRepository.deleteById(id);
        return new Result<Void>().success("删除成功");
    }

}

