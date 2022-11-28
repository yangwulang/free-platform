package top.yangwulang.platform.services.sys

import top.yangwulang.platform.entity.sys.SysDictType
import top.yangwulang.platform.services.QueryService
import top.yangwulang.platform.services.UpdateService

interface SysDictTypeService :
    QueryService<SysDictType, String, SysDictType>,
    UpdateService<SysDictType, String, SysDictType> {
}