package top.yangwulang.platform.entity.sys

import org.hibernate.Hibernate
import java.io.Serializable
import java.util.*
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Entity
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Embeddable
open class SysJobId : Serializable {
    @Size(max = 64)
    @NotNull
    @Column(name = "job_name", nullable = false, length = 64)
    open var jobName: String? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "job_group", nullable = false, length = 64)
    open var jobGroup: String? = null

    override fun hashCode(): Int = Objects.hash(jobName, jobGroup)
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false

        other as SysJobId

        return jobName == other.jobName &&
                jobGroup == other.jobGroup
    }

    companion object {
        private const val serialVersionUID = 3777755452256075191L
    }
}