package top.yangwulang.platform.services;

import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.repository.sys.RoleRepository;

import java.util.List;

/**
 * @author yangwulang
 */
public interface RoleService extends BaseService<Role, String, RoleRepository> {
    /**
     * 解除用户的角色绑定，指定某个用户与角色进行解绑
     *
     * @param userId 用户id
     * @param roleId 角色id
     */
    void unBindUserRole(String userId, String roleId);
    /**
     * 绑定用户的角色，指定某个用户与角色进行绑定
     *
     * @param userId 用户id
     * @param roleId 角色id
     */
    void bindUserRole(String userId, String roleId);
    /**
     * 批量绑定用户的角色，指定某个用户与角色进行绑定
     *
     * @param userId 用户id
     * @param roleId 角色id
     */
    void bindUserRoleBatch(List<String> userId, String roleId);
}
