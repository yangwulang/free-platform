package top.yangwulang.platform.entity.sys

import java.math.BigDecimal
import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_role")
open class SysRole {
    @Id
    @Size(max = 64)
    @Column(name = "role_code", nullable = false, length = 64)
    open var id: String? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "role_name", nullable = false, length = 100)
    open var roleName: String? = null

    @Size(max = 100)
    @Column(name = "role_type", length = 100)
    open var roleType: String? = null

    @Column(name = "role_sort", precision = 10)
    open var roleSort: BigDecimal? = null

    @Column(name = "is_sys")
    open var isSys: Char? = null

    @Size(max = 16)
    @Column(name = "user_type", length = 16)
    open var userType: String? = null

    @Column(name = "data_scope")
    open var dataScope: Char? = null

    @Size(max = 255)
    @Column(name = "biz_scope")
    open var bizScope: String? = null

    @NotNull
    @Column(name = "status", nullable = false)
    open var status: Char? = null

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

    @Size(max = 64)
    @NotNull
    @Column(name = "corp_code", nullable = false, length = 64)
    open var corpCode: String? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "corp_name", nullable = false, length = 100)
    open var corpName: String? = null
}