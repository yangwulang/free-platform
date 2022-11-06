package top.yangwulang.platform.services.sys

import top.yangwulang.platform.entity.sys.SysJob
import top.yangwulang.platform.entity.sys.SysJobId
import top.yangwulang.platform.entity.sys.dto.SysJobDto
import top.yangwulang.platform.factory.JobFactory
import top.yangwulang.platform.services.QueryService
import top.yangwulang.platform.services.UpdateService

interface SysJobService :
    QueryService<SysJob, SysJobId, SysJobDto>,
    UpdateService<SysJob, SysJobId, SysJobDto> {

    fun startAll(): Boolean

    fun runOnce(sysJob: SysJob)

    fun convertFactory() : JobFactory

}