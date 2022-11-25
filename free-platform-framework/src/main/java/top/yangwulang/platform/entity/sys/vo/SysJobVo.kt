package top.yangwulang.platform.entity.sys.vo

import com.fasterxml.jackson.annotation.JsonFormat
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import top.yangwulang.platform.entity.sys.SysJobId
import java.io.Serializable
import java.math.BigDecimal
import java.time.Instant

@ApiModel("定时任务Vo")
data class SysJobVo(
    @ApiModelProperty("主键")
    var id: SysJobId? = null,
    @ApiModelProperty("任务描述")
    var description: String? = null,
    @ApiModelProperty("调用目标字符串")
    var invokeTarget: String? = null,
    @ApiModelProperty("cron表达式")
    var cronExpression: String? = null,
    @ApiModelProperty("计划执行错误策略")
    var misfireInstruction: BigDecimal? = null,
    @ApiModelProperty("是否并发执行")
    var concurrent: String? = null,
    @ApiModelProperty("集群实例名")
    var instanceName: String? = null,
    @ApiModelProperty("状态")
    var status: String? = null,
    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    var createDate: Instant? = null,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("修改时间")
    var updateDate: Instant? = null,
    @ApiModelProperty("备注")
    var remarks: String? = null
) : Serializable