package top.yangwulang.platform.factory

import org.springframework.beans.BeanUtils
import top.yangwulang.platform.entity.sys.SysJob
import top.yangwulang.platform.entity.sys.SysJobId
import top.yangwulang.platform.entity.sys.dto.SysJobDto
import top.yangwulang.platform.entity.sys.vo.SysJobVo
import top.yangwulang.platform.exception.ServiceException

class JobFactory {

    fun convertJobId(jobName: String?, jobGroup: String?): SysJobId {
        if (jobName == null || jobGroup == null) {
            throw ServiceException("定时任务的名称或者组别不能为空")
        }
        val sysJobId = SysJobId()
        sysJobId.jobName = jobName
        sysJobId.jobGroup = jobGroup
        return sysJobId
    }

    fun convertVo(sysJob: SysJob?): SysJobVo? {
        if (sysJob == null) {
            return null
        }
        val sysJobVo = SysJobVo()
        BeanUtils.copyProperties(sysJob, sysJobVo)
        return sysJobVo
    }

    fun convertDtoToBo(dto: SysJobDto?): SysJob {
        val sysJob = SysJob()
        return if (dto == null) {
            sysJob
        } else {
            BeanUtils.copyProperties(dto, sysJob)
            sysJob
        }
    }

    fun convertBoToDto(sysJob: SysJob?): SysJobDto {
        val sysJobDto = SysJobDto()
        return if (sysJob == null) {
            sysJobDto
        } else {
            BeanUtils.copyProperties(sysJob, sysJobDto)
            sysJobDto
        }
    }

}