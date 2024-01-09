package top.yangwulang.platform.services.impl;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNode;
import cn.hutool.core.lang.tree.TreeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuProps;
import top.yangwulang.platform.repository.sys.MenuRepository;
import top.yangwulang.platform.services.MenuService;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author yangwulang
 */
@Service
public class MenuServiceImpl extends BaseServiceImpl<Menu, String, MenuRepository> implements MenuService {

    public MenuServiceImpl(@Autowired MenuRepository repository) {
        super(repository);
    }

    public List<Menu> findByUserId(String userId) {
        return repository().findByUserIdTree(userId);
    }

    @Override
    public List<Menu> findByRoleId(String roleId) {
        return repository().findByRoleId(roleId);
    }

    @Override
    public List<Tree<String>> convertMenusToTree(List<Menu> menus) {
        List<TreeNode<String>> list = menus.stream().map(m -> {
            TreeNode<String> menuTreeNode = new TreeNode<>(m.id(), m.parentId(), m.menuName(), m.weight());
            menuTreeNode.setExtra(new HashMap<>() {{
                put("menuType", m.menuType());
                put("menuHref", m.menuHref());
                put("menuComponent", m.menuComponent());
                put("menuTarget", m.menuTarget());
                put("menuIcon", m.menuIcon());
                put("menuColor", m.menuColor());
                put("menuTitle", m.menuTitle());
                put("permission", m.permission());
                put("isShow", m.isShow());
                put("sysCode", m.sysCode());
            }});
            return menuTreeNode;
        }).toList();
        return TreeUtil.build(list, null);
    }

    @Override
    public List<Tree<String>> findByRoleIdTree(String roleId) {
        return this.convertMenusToTree(this.findByRoleId(roleId));
    }

    @Override
    public List<Tree<String>> findByUserIdTree(String userId) {
        return this.convertMenusToTree(this.findByUserId(userId));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void bandRoleMenu(String roleId, List<String> menuIds) {
        this.repository().sql().getAssociations(MenuProps.ROLES)
                .batchSaveCommand(
                        Collections.singletonList(roleId),
                        Arrays.asList(menuIds.toArray())
                )
                .checkExistence(true)
                .execute();
    }

}
