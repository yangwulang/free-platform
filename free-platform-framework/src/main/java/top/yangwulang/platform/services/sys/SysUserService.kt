package top.yangwulang.platform.services.sys

import top.yangwulang.platform.entity.sys.SysUser
import top.yangwulang.platform.services.QueryService
import top.yangwulang.platform.services.UpdateService

interface SysUserService :
    QueryService<SysUser, String, SysUser>,
    UpdateService<SysUser, String, SysUser> {

    fun findByUserName(userName: String): SysUser?

}