package top.yangwulang.platform.entity.sys

import org.hibernate.annotations.GenericGenerator
import java.time.Instant
import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_dict_type")
open class SysDictType {
    @Id
    @Size(max = 64)
    @Column(name = "id", nullable = false, length = 64)
    @GeneratedValue(generator = "snowflake")
    @GenericGenerator(name = "snowflake", strategy = "top.yangwulang.platform.utils.SnowflakeGenerator")
    open var id: String? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "dict_name", nullable = false, length = 100)
    open var dictName: String? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "dict_type", nullable = false, length = 100)
    open var dictType: String? = null

    @NotNull
    @Column(name = "is_sys", nullable = false)
    open var isSys: Char? = null

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
}