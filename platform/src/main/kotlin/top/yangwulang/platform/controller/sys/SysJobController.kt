package top.yangwulang.platform.controller.sys

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiImplicitParams
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.book.BookInfo
import top.yangwulang.platform.entity.book.dto.BookInfoDto
import top.yangwulang.platform.entity.sys.SysJob
import top.yangwulang.platform.entity.sys.dto.SysJobDto
import top.yangwulang.platform.entity.sys.vo.SysJobVo
import top.yangwulang.platform.services.HttpPage
import top.yangwulang.platform.services.sys.SysJobService
import javax.servlet.http.HttpServletRequest

@RestController
@Api(tags = ["系统模块模块", "作业监控"])
@RequestMapping("\${adminPath}/sys/job")
class SysJobController {

    @Autowired
    private lateinit var sysJobService: SysJobService

    @GetMapping("/{jobGroup}/{jobName}")
    @ApiOperation(value = "获取作业信息")
    @ApiImplicitParams(
        value = [
            ApiImplicitParam(name = "jobGroup", value = "任务组", required = true),
            ApiImplicitParam(name = "jobName", value = "任务名", required = true)
        ]
    )
    fun get(@PathVariable("jobGroup") jobGroup: String, @PathVariable("jobName") jobName: String): SysJobVo? {
        return sysJobService.convertFactory().convertVo(
            sysJobService.findById(
                sysJobService.convertFactory().convertJobId(jobName, jobGroup)
            )
        )
    }

    @PostMapping
    @ApiOperation(value = "获取作业信息")
    fun page(
        @RequestBody sysJobDto: SysJobDto,
        httpServletRequest: HttpServletRequest
    ): Page<SysJobDto> {
        val httpPage = HttpPage(httpServletRequest)
        return sysJobService
            .findPage(sysJobDto, PageRequest.of(httpPage.getPositionNum(), httpPage.pageSize))
            .map {
                sysJobService.convertFactory().convertBoToDto(it)
            }
    }

}