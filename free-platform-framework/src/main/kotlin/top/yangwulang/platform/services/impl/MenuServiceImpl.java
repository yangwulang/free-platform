package top.yangwulang.platform.services.impl;

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
        Menu parent;
        if (menu.getParentId() != null) {
            parent = MenuDraft.$.produce(df -> df.setId(menu.getParentId()));
        } else if (menu.getParent() != null) {
            parent = MenuDraft.$.produce(df -> df.setId(menu.getParent().getId()));
        } else {
            parent = MenuDraft.$.produce(df -> df.setId("0"));
        }
        return menuRepository.save(MenuDraft.$.produce(menu.toEntity(), d -> d.setParent(parent)));
    }
}
