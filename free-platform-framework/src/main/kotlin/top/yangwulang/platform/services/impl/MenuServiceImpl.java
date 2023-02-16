package top.yangwulang.platform.services.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.input.MenuInput;
import top.yangwulang.platform.repository.sys.MenuRepository;
import top.yangwulang.platform.services.MenuService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;


    @Override
    @Transactional
    public Menu save(MenuInput menu) {
        /*menu = MenuDraft.$.produce(menu, d -> {
            if (d.parent() == null) {
                d.setParent(MenuRepository.ROOT);
            }
            List<Menu> children = menuRepository.findChildren(d.parent());
            Menu LastMenu = null;
            if (!children.isEmpty()) {
                LastMenu = children.get(0);
            }
            if (d.treeSort() == null && LastMenu == null) {
                // 如果前端没有给treeSort并且没有最后一个菜单，默认treeSort为 30
                d.setTreeSort(BigDecimal.valueOf(30));
            } else if (d.treeSort() == null && LastMenu != null) {
                // 如果前端没有给，但是数据库中有最后一个菜单，则将最后一个菜单的treeSort + 30 给当前
                d.setTreeSort(LastMenu.treeSort().add(BigDecimal.valueOf(30)));
            }
            String parentTreeNames = d.parent().treeNames();
            String preTreeNames = StringUtils.isEmpty(parentTreeNames) ? "" : parentTreeNames + "/";
            // 如果说前端给了，那么就使用前端的值
            d.setTreeSorts(d.parent().treeSorts() + "," + d.treeSort());
            d.setTreeNames(preTreeNames + d.menuName());
        });*/
        return menuRepository.save(menu);
    }
}
