package top.yangwulang.platform.controller.sys;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yangwulang.platform.entity.sys.dto.LoginInput;
import top.yangwulang.platform.security.shiro.realm.AccountPasswordRealm;

/**
 * @author yangwulang
 */
@RestController
@RequestMapping
public class LoginController {

    @PostMapping("/login")
    public Object login(@RequestBody LoginInput loginInput) {
        try {
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(loginInput.getLoginCode(), loginInput.getPassword());
            SecurityUtils.getSubject().login(usernamePasswordToken);
            return "登录成功";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
