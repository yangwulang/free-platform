package top.yangwulang.platform.entity.sys

import top.yangwulang.platform.entity.DataTreeEntity
import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_dict_data")
open class SysDictData : DataTreeEntity<SysDictData>(), Serializable{

    @Size(max = 100)
    @NotNull
    @Column(name = "dict_label", nullable = false, length = 100)
    open var dictLabel: String? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "dict_value", nullable = false, length = 100)
    open var dictValue: String? = null

    @NotNull
    @Column(name = "is_sys", nullable = false)
    open var isSys: Char? = null

    @Size(max = 500)
    @Column(name = "description", length = 500)
    open var description: String? = null

    @Size(max = 500)
    @Column(name = "css_style", length = 500)
    open var cssStyle: String? = null

    @Size(max = 500)
    @Column(name = "css_class", length = 500)
    open var cssClass: String? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "corp_code", nullable = false, length = 64)
    open var corpCode: String? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "corp_name", nullable = false, length = 100)
    open var corpName: String? = null
}