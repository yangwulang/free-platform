package top.yangwulang.platform.entity.sys

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import top.yangwulang.platform.entity.DataEntity
import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_dict_type")
@ApiModel("字典类型")
open class SysDictType : DataEntity<SysDictType>(), Serializable {

    @Size(max = 100)
    @NotEmpty(message = "字典名称不能为空!")
    @Column(name = "dict_name", nullable = false, length = 100)
    @ApiModelProperty("字典名称")
    open var dictName: String? = null

    @Size(max = 100)
    @NotEmpty(message = "字典类型不能为空!")
    @Column(name = "dict_type", nullable = false, length = 100)
    @ApiModelProperty("字典类型编码")
    open var dictType: String? = null

    @NotEmpty(message = "是否系统字典不能为空!")
    @Column(name = "is_sys", nullable = false)
    @ApiModelProperty("是否系统字典 0是 1否")
    open var isSys: String? = null
}