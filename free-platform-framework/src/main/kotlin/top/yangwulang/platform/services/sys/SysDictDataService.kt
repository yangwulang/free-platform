package top.yangwulang.platform.services.sys

import top.yangwulang.platform.entity.sys.SysDictData
import top.yangwulang.platform.services.QueryTreeService
import top.yangwulang.platform.services.UpdateService

interface SysDictDataService :
    QueryTreeService<SysDictData, String, SysDictData>,
    UpdateService<SysDictData, String, SysDictData> {
}