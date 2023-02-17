package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.MenuTable;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author yangwulang
 */
@Repository
public interface MenuRepository extends JRepository<Menu, String> {
    MenuTable TABLE = MenuTable.$;


    default List<Menu> findChildren(Menu parent) {
        return sql().createQuery(TABLE)
                .where(
                        TABLE.parent().id().eq(parent.id())
                )
                .orderBy(TABLE.treeSort().desc())
                .select(TABLE).execute();
    }


}
