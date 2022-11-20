package top.yangwulang.platform.services.sys

import top.yangwulang.platform.entity.sys.SysRole
import top.yangwulang.platform.services.QueryService
import top.yangwulang.platform.services.UpdateService

interface SysRoleService :
    QueryService<SysRole, String, SysRole>,
    UpdateService<SysRole, String, SysRole> {

    fun findRoleListByUsername(userName: String): Set<String>

    fun findPermissionsByRole(role: String): Set<String>

}