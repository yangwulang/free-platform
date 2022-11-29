package top.yangwulang.platform.entity.sys

import io.swagger.annotations.ApiModelProperty
import top.yangwulang.platform.entity.DataTreeEntity
import top.yangwulang.platform.event.jpa.TreeSaveEvent
import java.io.Serializable
import javax.persistence.*
import javax.validation.constraints.NotEmpty
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
    @ApiModelProperty("字典类型")
    open var dictType: SysDictType? = null

    @Size(max = 100)
    @NotEmpty(message = "字典标签不能为空")
    @Column(name = "dict_label", nullable = false, length = 100)
    @ApiModelProperty("字典标签")
    open var dictLabel: String? = null
        get() {
            return if (field == null) super.getTreeName() else field
        }
        set(value) {
            super.setTreeName(value)
            field = value
        }

    @Size(max = 100)
    @NotEmpty(message = "字典数据不能为空")
    @ApiModelProperty("字典数据")
    @Column(name = "dict_value", nullable = false, length = 100)
    open var dictValue: String? = null

    @NotEmpty(message = "是否系统字典")
    @Column(name = "is_sys", nullable = false)
    @ApiModelProperty("是否系统字典")
    open var isSys: String? = null

    @Size(max = 500)
    @Column(name = "description", length = 500)
    @ApiModelProperty("描述")
    open var description: String? = null

    @Size(max = 500)
    @Column(name = "css_style", length = 500)
    @ApiModelProperty("css样式")
    open var cssStyle: String? = null

    @Size(max = 500)
    @Column(name = "css_class", length = 500)
    @ApiModelProperty("css的class属性")
    open var cssClass: String? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "corp_code", nullable = false, length = 64)
    @ApiModelProperty("租户编码")
    open var corpCode: String? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "corp_name", nullable = false, length = 100)
    @ApiModelProperty("租户名称")
    open var corpName: String? = null
}