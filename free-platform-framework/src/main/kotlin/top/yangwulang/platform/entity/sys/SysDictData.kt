package top.yangwulang.platform.entity.sys

import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import java.time.Instant
import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_dict_data")
open class SysDictData {
    @Id
    @Size(max = 64)
    @Column(name = "id", nullable = false, length = 64)
    @GeneratedValue(generator = "snowflake")
    @GenericGenerator(name = "snowflake", strategy = "top.yangwulang.platform.utils.SnowflakeGenerator")
    open var id: String? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "pid", nullable = false, length = 64)
    open var pid: String? = null

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "dict_type_id", nullable = false)
    open var dictType: SysDictType? = null

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