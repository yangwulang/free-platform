package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.MenuTable;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * @author yangwulang
 */
@Repository
public interface MenuRepository extends JRepository<Menu, String> {
    MenuTable TABLE = MenuTable.$;

    Menu ROOT = MenuDraft.$.produce(m -> {
        m.setId("0");
        m.setTreeSort(BigDecimal.valueOf(0));
        m.setTreeNames("");
        m.setTreeSorts("0");
    });

    default List<Menu> findChildren(Menu parent) {
        return sql().createQuery(TABLE)
                .where(
                        TABLE.parent().id().eq(parent.id())
                )
                .orderBy(TABLE.treeSort().desc())
                .select(TABLE).execute();
    }


}
