package top.yangwulang.platform.services.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleProps;
import top.yangwulang.platform.exception.ServiceException;
import top.yangwulang.platform.repository.sys.RoleRepository;
import top.yangwulang.platform.services.RoleService;

import java.util.List;

/**
 * @author yangwulang
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, String, RoleRepository> implements RoleService {
    public RoleServiceImpl(@Autowired RoleRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void unBindUserRole(String userId, String roleId) {
        this.validUserIdAndRoleId(userId, roleId);
        this.repository().sql()
                .getAssociations(RoleProps.USERS)
                .delete(roleId, userId);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void bindUserRole(String userId, String roleId) {
        this.validUserIdAndRoleId(userId, roleId);
        this.repository().sql()
                .getAssociations(RoleProps.USERS)
                .save(roleId, userId);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void bindUserRoleBatch(List<String> userId, String roleId) {
        if (StringUtils.isEmpty(roleId)) {
            throw new ServiceException("角色id不能为空");
        }
        if (userId == null) {
            throw new ServiceException("用户id不能为空");
        }
        this.repository().sql()
                .getAssociations(RoleProps.USERS)
                .batchSave(List.of(roleId), userId);
    }

    private void validUserIdAndRoleId(String userId, String roleId) {
        if (StringUtils.isEmpty(userId)) {
            throw new ServiceException("用户id不能为空");
        }
        if (StringUtils.isEmpty(roleId)) {
            throw new ServiceException("角色id不能为空");
        }
    }
}
