package top.yangwulang.platform.security.satoken;

import cn.dev33.satoken.stp.StpInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.yangwulang.platform.repository.sys.RoleRepository;

import java.util.List;

/**
 * @author yangwulang
 */
@Component
public class SaPermission implements StpInterface {

    @Autowired
    private RoleRepository repository;


    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        return null;
    }

    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        return null;
    }
}
