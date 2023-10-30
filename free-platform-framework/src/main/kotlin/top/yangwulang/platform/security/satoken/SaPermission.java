package top.yangwulang.platform.security.satoken;

import cn.dev33.satoken.stp.StpInterface;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.yangwulang.platform.entity.sys.*;
import top.yangwulang.platform.services.UserService;

import java.util.ArrayList;
import java.util.Collection;
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
        Optional<User> user = userService.findById((String) loginId,
                UserFetcher.$.loginCode().roles(
                        RoleFetcher.$.menus(
                                MenuFetcher.$.allScalarFields()
                        )
                )
        );
        return user.map(it -> {
                    // TODO: 此处登录编码写死了设置超管不会进行鉴权
                    if ("system".equals(it.loginCode())) {
                        return List.of("*");
                    }
                    return it.roles()
                            .stream()
                            .map(Role::menus)
                            .flatMap(Collection::stream)
                            .map(Menu::permission)
                            .filter(StringUtils::isNotEmpty)
                            .toList();
                }
        ).orElseGet(ArrayList::new);
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
