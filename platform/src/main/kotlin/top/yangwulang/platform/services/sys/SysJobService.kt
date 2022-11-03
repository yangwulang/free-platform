package top.yangwulang.platform.services.sys

import top.yangwulang.platform.entity.sys.SysJob
import top.yangwulang.platform.entity.sys.SysJobId
import top.yangwulang.platform.services.QueryService
import top.yangwulang.platform.services.UpdateService

interface SysJobService :
    QueryService<SysJob, SysJobId, SysJob>,
    UpdateService<SysJob, SysJobId, SysJob> {
}