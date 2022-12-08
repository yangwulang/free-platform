package top.yangwulang.platform.entity.sys

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import top.yangwulang.platform.entity.DataTreeEntity
import top.yangwulang.platform.event.jpa.TreeSaveEvent
import java.io.Serializable
import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EntityListeners
import javax.persistence.Table
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_menu")
@EntityListeners(value = [TreeSaveEvent::class])
@ApiModel("菜单实体")
open class SysMenu : DataTreeEntity<SysMenu>, Serializable {

    constructor() : super()

    constructor(id: String) : super(id)

    @Size(max = 100)
    @NotEmpty(message = "菜单名称不能为空")
    @Column(name = "menu_name", nullable = false, length = 100)
    @ApiModelProperty("菜单名称")
    open var menuName: String? = null
        get() {
            return if (field == null) super.getTreeName() else field
        }
        set(value) {
            super.setTreeName(value)
            field = value
        }

    @NotEmpty(message = "菜单类型不能为空")
    @Column(name = "menu_type", nullable = false)
    @ApiModelProperty("菜单类型")
    open var menuType: String? = null

    @Size(max = 1000)
    @Column(name = "menu_href", length = 1000)
    @ApiModelProperty("菜单链接（路由）")
    open var menuHref: String? = null

    @Size(max = 1000, message = "菜单组件地址不能超过1000个字符")
    @Column(name = "menu_component", length = 1000)
    @ApiModelProperty("菜单组件地址")
    open var menuComponent: String? = null

    @Size(max = 20)
    @Column(name = "menu_target", length = 20)
    @ApiModelProperty("菜单Target")
    open var menuTarget: String? = null

    @Size(max = 100, message = "菜单图标不能超过100个字符")
    @Column(name = "menu_icon", length = 100)
    @ApiModelProperty("菜单图标")
    open var menuIcon: String? = null

    @Size(max = 50,message = "菜单颜色不能超过50个字符")
    @Column(name = "menu_color", length = 50)
    @ApiModelProperty("菜单颜色")
    open var menuColor: String? = null

    @Size(max = 100,message = "菜单标题不能超过100个字符")
    @Column(name = "menu_title", length = 100)
    @ApiModelProperty("菜单标题")
    open var menuTitle: String? = null

    @Size(max = 1000, message = "菜单权限不能超过1000个字符")
    @Column(name = "permission", length = 1000)
    @ApiModelProperty("菜单权限")
    open var permission: String? = null

    @Column(name = "weight", precision = 4)
    @ApiModelProperty("菜单权重")
    open var weight: Int? = null

    @NotEmpty(message = "是否显示不能为空")
    @Column(name = "is_show", nullable = false)
    @ApiModelProperty("是否显示")
    open var isShow: String? = null

    @Size(max = 64)
    @NotEmpty(message = "系统编码不能为空")
    @Column(name = "sys_code", nullable = false, length = 64)
    @ApiModelProperty("系统编码")
    open var sysCode: String? = null

}