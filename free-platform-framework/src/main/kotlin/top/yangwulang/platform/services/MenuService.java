package top.yangwulang.platform.services;

import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.dto.MenuInput;

public interface MenuService {
    Menu save(MenuInput menu);
}
