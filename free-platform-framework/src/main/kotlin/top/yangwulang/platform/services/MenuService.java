package top.yangwulang.platform.services;

import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.input.MenuInput;

public interface MenuService {
    Menu save(MenuInput menu);
}
