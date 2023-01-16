package top.yangwulang.platform.controller.sys;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.yangwulang.platform.entity.sys.User;
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

    @GetMapping("/{id}")
    @Operation(summary = "获取用户信息")
    @Parameters({
            @Parameter(name = "id", description = "类型主键", required = true, in = ParameterIn.PATH)
    })
    public User get(@PathVariable("id") String id) {
        return userRepository.findById(id).orElse(null);
    }


    @PutMapping("/save")
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

}

