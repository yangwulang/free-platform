package top.yangwulang.platform.services.sys

import top.yangwulang.platform.entity.sys.SysJobLog
import top.yangwulang.platform.services.QueryService
import top.yangwulang.platform.services.UpdateService

interface SysJobLogService :
    QueryService<SysJobLog, String, SysJobLog>,
    UpdateService<SysJobLog, String, SysJobLog> {
}