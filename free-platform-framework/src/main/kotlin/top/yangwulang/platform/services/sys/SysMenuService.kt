package top.yangwulang.platform.services.sys

import top.yangwulang.platform.entity.sys.SysMenu
import top.yangwulang.platform.services.QueryTreeService
import top.yangwulang.platform.services.UpdateService

interface SysMenuService :
    QueryTreeService<SysMenu, String, SysMenu>,
    UpdateService<SysMenu, String, SysMenu> {

}