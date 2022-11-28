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
@Table(name = "sys_menu")
open class SysMenu {
    @Id
    @Size(max = 64)
    @Column(name = "id", nullable = false, length = 64)
    open var id: String? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "pid", nullable = false, length = 64)
    open var pid: String? = null

    @Size(max = 1000)
    @NotNull
    @Column(name = "parent_codes", nullable = false, length = 1000)
    open var parentCodes: String? = null

    @NotNull
    @Column(name = "tree_sort", nullable = false, precision = 10)
    open var treeSort: BigDecimal? = null

    @Size(max = 1000)
    @NotNull
    @Column(name = "tree_sorts", nullable = false, length = 1000)
    open var treeSorts: String? = null

    @NotNull
    @Column(name = "tree_leaf", nullable = false)
    open var treeLeaf: Char? = null

    @NotNull
    @Column(name = "tree_level", nullable = false, precision = 4)
    open var treeLevel: BigDecimal? = null

    @Size(max = 1000)
    @NotNull
    @Column(name = "tree_names", nullable = false, length = 1000)
    open var treeNames: String? = null

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