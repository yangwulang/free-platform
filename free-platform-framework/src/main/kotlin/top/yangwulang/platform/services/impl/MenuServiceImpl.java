package top.yangwulang.platform.services.impl;

import org.babyfish.jimmer.sql.event.EntityEvent;
import org.babyfish.jimmer.sql.event.EntityListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.input.MenuInput;
import top.yangwulang.platform.repository.sys.MenuRepository;
import top.yangwulang.platform.services.MenuService;

/**
 * @author yangwulang
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;


    @Override
    @Transactional
    public Menu save(MenuInput menu) {
        /*Menu parent;
        if (menu.getParentId() != null) {
            parent = MenuDraft.$.produce(df -> df.setId(menu.getParentId()));
        } else if (menu.getParent() != null) {
            parent = MenuDraft.$.produce(df -> df.setId(menu.getParent().getId()));
        } else {
            parent = null;
        }
        Menu save = menuRepository.save(MenuDraft.$.produce(menu.toEntity(), d -> d.setParent(null)));
        if (parent == null) {
            // 如果不是根节点
            menu.setParentCodes("0," + save.id());
            menu.setTreeSorts("0," + save.treeSort());
        } else {
            // 如果不是根节点
            menu.setParentCodes(parent.parentCodes() + "," + save.id());
            menu.setTreeSorts(parent.treeSorts() + "," + save.treeSort());
        }*/
        return menuRepository.save(menu.toEntity());
    }
}
