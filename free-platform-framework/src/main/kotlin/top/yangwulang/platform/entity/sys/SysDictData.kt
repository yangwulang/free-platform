package top.yangwulang.platform.entity.sys

import top.yangwulang.platform.entity.DataTreeEntity
import top.yangwulang.platform.event.jpa.TreeSaveEvent
import java.io.Serializable
import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_dict_data")
@EntityListeners(value = [TreeSaveEvent::class])
open class SysDictData : DataTreeEntity<SysDictData>, Serializable {
    constructor() : super()

    constructor(id: String) : super(id)

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "dict_type_id", nullable = false)
    open var dictType: SysDictType? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "dict_label", nullable = false, length = 100)
    open var dictLabel: String? = null
        get() {
            return if (field == null) super.getTreeName() else field
        }
        set(value) {
            super.setTreeName(value)
            field = value
        }

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