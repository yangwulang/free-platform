package top.yangwulang.platform.entity.sys

import java.time.Instant
import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_job_log")
open class SysJobLog {
    @Id
    @Size(max = 64)
    @Column(name = "id", nullable = false, length = 64)
    open var id: String? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "job_name", nullable = false, length = 64)
    open var jobName: String? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "job_group", nullable = false, length = 64)
    open var jobGroup: String? = null

    @Size(max = 50)
    @Column(name = "job_type", length = 50)
    open var jobType: String? = null

    @Size(max = 200)
    @Column(name = "job_event", length = 200)
    open var jobEvent: String? = null

    @Size(max = 500)
    @Column(name = "job_message", length = 500)
    open var jobMessage: String? = null

    @Column(name = "is_exception")
    open var isException: Char? = null

    @Lob
    @Column(name = "exception_info")
    open var exceptionInfo: String? = null

    @Column(name = "create_date")
    open var createDate: Instant? = null
}