package top.yangwulang.platform.entity.sys

import top.yangwulang.platform.entity.DataTreeEntity
import java.io.Serializable
import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_menu")
open class SysMenu : DataTreeEntity<SysMenu>(), Serializable{

    @Size(max = 100)
    @NotNull
    @Column(name = "menu_name", nullable = false, length = 100)
    open var menuName: String? = null

    @NotNull
    @Column(name = "menu_type", nullable = false)
    open var menuType: Char? = null

    @Size(max = 1000)
    @Column(name = "menu_href", length = 1000)
    open var menuHref: String? = null

    @Size(max = 1000)
    @Column(name = "menu_component", length = 1000)
    open var menuComponent: String? = null

    @Size(max = 20)
    @Column(name = "menu_target", length = 20)
    open var menuTarget: String? = null

    @Size(max = 100)
    @Column(name = "menu_icon", length = 100)
    open var menuIcon: String? = null

    @Size(max = 50)
    @Column(name = "menu_color", length = 50)
    open var menuColor: String? = null

    @Size(max = 100)
    @Column(name = "menu_title", length = 100)
    open var menuTitle: String? = null

    @Size(max = 1000)
    @Column(name = "permission", length = 1000)
    open var permission: String? = null

    @Column(name = "weight", precision = 4)
    open var weight: BigDecimal? = null

    @NotNull
    @Column(name = "is_show", nullable = false)
    open var isShow: Char? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "sys_code", nullable = false, length = 64)
    open var sysCode: String? = null

}