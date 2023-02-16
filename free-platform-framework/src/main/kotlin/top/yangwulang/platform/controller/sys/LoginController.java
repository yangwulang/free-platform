package top.yangwulang.platform.controller.sys;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.alicp.jetcache.Cache;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.yangwulang.platform.entity.DeviceType;
import top.yangwulang.platform.entity.Result;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserFetcher;
import top.yangwulang.platform.entity.sys.input.LoginInput;
import top.yangwulang.platform.repository.sys.UserRepository;
import top.yangwulang.platform.utils.UserUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangwulang
 */
@RestController
@RequestMapping
@Tags({
        @Tag(name = "系统模块"),
        @Tag(name = "登录控制器"),
})
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    @Operation(summary = "登录接口")
    public Result<Map<String, Object>> login(@RequestBody LoginInput loginInput) {
        Map<String, Object> loginInfo = new HashMap<>(2);
        try (Cache<String, Object> cache = UserUtils.loginUserCache()) {
            User user = userRepository.findByLoginAndPassword(loginInput.getLoginCode(), loginInput.getPassword());
            if (user != null) {
                StpUtil.login(user.userCode(), DeviceType.WEB.name());
                loginInfo.put("userInfo", user);
                loginInfo.put("loginInfo", StpUtil.getTokenInfo());
                cache.put((String) StpUtil.getTokenInfo().getLoginId(), user);
                return new Result<Map<String, Object>>().success("登录成功", loginInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result<Map<String, Object>>().failed("用户名或密码错误");
    }

    @GetMapping("/tokenInfo")
    @Operation(summary = "查询当前登录信息")
    public SaTokenInfo tokenInfo() {
        return StpUtil.getTokenInfo();
    }

    @GetMapping("/loginUserInfo")
    @Operation(summary = "查询当前登录的用户信息")
    public User loginUserInfo() {
        return userRepository.findNullable(StpUtil.getLoginIdAsString(), UserFetcher.$.allScalarFields().password(false));
    }

    @PostMapping("/loginOut")
    public void loginOut() {
        StpUtil.logout();
    }

}
