package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


/**
 * 菜单表
 *
 * @author yangwulang
 */
@Entity
@Table(name = "sys_menu")
@Schema(description = "菜单实体")
public interface Menu extends DataTypeBase {
    /**
     * 父级编号
     */
    @Key
    @ManyToOne
    @JoinColumn(name = "pid")
    @Schema(description = "父级菜单")
    @OnDissociate(DissociateAction.DELETE)
    @Null Menu parent();

    @OneToMany(mappedBy = "parent")
    @Schema(description = "子级菜单")
    List<Menu> children();

    /**
     * 所有父级编号
     */
    @Schema(description = "父级所有code")
    String parentCodes();

    /**
     * 本级排序号（升序）
     */
    @Schema(description = "当前级别排序")
    BigDecimal treeSort();

    /**
     * 所有级别排序号
     */
    @Schema(description = "所有级别排序")
    String treeSorts();

    /**
     * 是否最末级
     */
    @Schema(description = "是否最末级")
    String treeLeaf();

    /**
     * 层次级别
     */
    @Schema(description = "层次级别")
    BigDecimal treeLevel();

    /**
     * 全节点名
     */
    @Schema(description = "全节点名")
    @Key
    String treeNames();

    /**
     * 菜单名称
     */
    @Schema(description = "菜单名称")
    String menuName();

    /**
     * 菜单类型（1菜单 2权限 3开发）
     */
    @Schema(description = "菜单类型（1菜单 2权限 3开发）")
    String menuType();

    /**
     * 链接
     */
    @Schema(description = "链接")
    @Null String menuHref();

    /**
     * 组件地址
     */
    @Schema(description = "组件地址")
    @Null String menuComponent();

    /**
     * 目标
     */
    @Schema(description = "目标")
    @Null String menuTarget();

    /**
     * 图标
     */
    @Schema(description = "图标")
    @Null String menuIcon();

    /**
     * 颜色
     */
    @Schema(description = "颜色")
    @Null String menuColor();

    /**
     * 菜单标题
     */
    @Schema(description = "菜单标题")
    @Null String menuTitle();

    /**
     * 权限标识
     */
    @Schema(description = "权限标识")
    @Null String permission();

    /**
     * 菜单权重
     */
    @Schema(description = "菜单权重")
    BigDecimal weight();

    /**
     * 是否显示
     */
    @Schema(description = "是否显示")
    @Column(name = "is_show")
    boolean isShow();

    /**
     * 归属系统（default:主导航菜单、mobileApp:APP菜单）
     */
    @Schema(description = "归属系统（default:主导航菜单、mobileApp:APP菜单）")
    String sysCode();


    @ManyToMany
    @JoinTable(
            name = "SYS_ROLE_MENU",
            joinColumnName = "MENU_ID",
            inverseJoinColumnName = "ROLE_ID"
    )
    List<Role> roles();

}


