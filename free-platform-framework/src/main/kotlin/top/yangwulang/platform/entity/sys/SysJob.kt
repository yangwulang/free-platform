package top.yangwulang.platform.entity.sys

import org.quartz.impl.triggers.CronTriggerImpl
import java.io.Serializable
import java.math.BigDecimal
import java.time.Instant
import javax.persistence.Column
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_job")
open class SysJob : Serializable{
    fun convert(sysJob: SysJob, cronTriggerImpl: CronTriggerImpl) {
        TODO("Not yet implemented")
    }

    @EmbeddedId
    open var id: SysJobId? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "description", nullable = false, length = 100)
    open var description: String? = null

    @Size(max = 1000)
    @NotNull
    @Column(name = "invoke_target", nullable = false, length = 1000)
    open var invokeTarget: String? = null

    @Size(max = 255)
    @NotNull
    @Column(name = "cron_expression", nullable = false)
    open var cronExpression: String? = null

    @NotNull
    @Column(name = "misfire_instruction", nullable = false, precision = 1)
    open var misfireInstruction: BigDecimal? = null

    @NotNull
    @Column(name = "concurrent", nullable = false)
    open var concurrent: String? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "instance_name", nullable = false, length = 64)
    open var instanceName: String? = null

    @NotNull
    @Column(name = "status", nullable = false)
    open var status: String? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "create_by", nullable = false, length = 64)
    open var createBy: String? = null

    @NotNull
    @Column(name = "create_date", nullable = false)
    open var createDate: Instant? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "update_by", nullable = false, length = 64)
    open var updateBy: String? = null

    @NotNull
    @Column(name = "update_date", nullable = false)
    open var updateDate: Instant? = null

    @Size(max = 500)
    @Column(name = "remarks", length = 500)
    open var remarks: String? = null
}