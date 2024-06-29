package top.yangwulang.platform.security.satoken;

import cn.dev33.satoken.stp.StpInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleFetcher;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserFetcher;
import top.yangwulang.platform.services.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author yangwulang
 */
@Component
public class SaPermission implements StpInterface {

    @Autowired
    private UserService userService;


    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        return userService.getPermissionString((String) loginId);
    }

    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        Optional<User> user = userService.findById((String) loginId,
                UserFetcher.$.loginCode().roles(
                        RoleFetcher.$.roleCode()
                )
        );
        return user.map(it -> it.roles().stream().map(Role::roleCode).toList())
                .orElseGet(ArrayList::new);
    }
}
