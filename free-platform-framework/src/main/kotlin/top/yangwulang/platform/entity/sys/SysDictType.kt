package top.yangwulang.platform.entity.sys

import top.yangwulang.platform.entity.DataEntity
import java.io.Serializable
import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_dict_type")
open class SysDictType  : DataEntity<SysDictType>(), Serializable {

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
}