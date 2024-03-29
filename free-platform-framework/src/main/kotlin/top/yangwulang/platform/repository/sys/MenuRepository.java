package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuFetcher;
import top.yangwulang.platform.entity.sys.MenuTable;
import top.yangwulang.platform.entity.sys.MenuTableEx;
import top.yangwulang.platform.entity.sys.dto.MenuUserTreeView;

import java.util.List;

/**
 * @author yangwulang
 */
@Repository
public interface MenuRepository extends JRepository<Menu, String> {
    MenuTable TABLE = MenuTable.$;


    /**
     * 通过用户id查询菜单树
     *
     * @param userId 用户id
     * @return 菜单树
     */
    default List<Menu> findByUserIdTree(String userId) {
        // where parent is null过滤掉了所有子级，只保留根节点菜单，再通过递归查询所有菜单
        return sql()
                .createQuery(TABLE)
                .where(MenuTableEx.$.roles().users().userCode().eq(userId))
                .select(
                        TABLE.fetch(
                                MenuFetcher.$.allScalarFields()
                                        .parentId()
                        )
                )
                .execute();
    }

    /**
     * 通过用户id查询菜单树视图
     *
     * @param userId 用户id
     * @return 菜单树
     */
    default List<MenuUserTreeView> findByUserIdTreeView(String userId) {
        return sql()
                .createQuery(TABLE)
                .where(MenuTableEx.$.roles().users().userCode().eq(userId))
                .select(TABLE.fetch(MenuUserTreeView.class))
                .execute();
    }

    /**
     * 通过角色id查询角色所拥有全部菜单
     *
     * @param roleId 角色id
     * @return 菜单树
     */

    default List<Menu> findByRoleId(String roleId) {
        return sql()
                .createQuery(TABLE)
                .where(MenuTableEx.$.roles().roleCode().eq(roleId))
                .select(TABLE.fetch(
                        MenuFetcher.$.allScalarFields()
                                .parentId()
                ))
                .execute();
    }
}
