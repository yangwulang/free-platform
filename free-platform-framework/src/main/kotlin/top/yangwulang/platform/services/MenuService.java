package top.yangwulang.platform.services;

import cn.hutool.core.lang.tree.Tree;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.input.MenuInput;
import top.yangwulang.platform.repository.sys.MenuRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 菜单服务层
 *
 * @author yangwulang
 */
public interface MenuService extends BaseService<Menu, String, MenuRepository> {
    /**
     * 保存菜单
     *
     * @param menu 菜单
     * @return 存取后的菜单
     */
    Menu save(MenuInput menu);

    /**
     * 查询用户下所有的菜单树
     *
     * @param userId 用户id
     * @return 菜单树
     */
    List<Menu> findByUserId(String userId);

    /**
     * 通过角色id查询角色拥有的菜单树（扁平化）
     *
     * @param roleId 角色id
     * @return 菜单列表
     */
    List<Menu> findByRoleId(String roleId);

    /**
     * 将菜单列表转换成树结构
     *
     * @param menus 菜单列表
     * @return 菜单树
     */
    List<Tree<String>> convertMenusToTree(List<Menu> menus);


    /**
     * 通过角色id查询角色拥有的菜单树（树形结构）
     *
     * @param roleId 角色id
     * @return 树形结构数据
     */
    List<Tree<String>> findByRoleIdTree(String roleId);

    /**
     * 通过用户id查询用户拥有的菜单树（树形结构）
     *
     * @param userId 用户id
     * @return 树形结构数据
     */
    List<Tree<String>> findByUserIdTree(String userId);

    /**
     * 绑定角色与菜单的关系
     * @param roleId 角色id
     * @param menuIds 菜单id
     */
    void bandRoleMenu(String roleId, List<String> menuIds);
}
