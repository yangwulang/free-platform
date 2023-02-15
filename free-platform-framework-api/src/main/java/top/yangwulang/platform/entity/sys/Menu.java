package top.yangwulang.platform.entity.sys;

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
@Immutable(value = Immutable.Nullity.NULLABLE)
public interface Menu extends DataTypeBase {
    /**
     * 父级编号
     */
    @Key
    @ManyToOne
    @JoinColumn(name = "pid")
    @OnDissociate(DissociateAction.DELETE)
    Menu parent();

    @OneToMany(mappedBy = "parent")
    @NotNull
    List<Menu> children();

    /**
     * 所有父级编号
     */
    @NotNull
    String parentCodes();

    /**
     * 本级排序号（升序）
     */
    @NotNull
    BigDecimal treeSort();

    /**
     * 所有级别排序号
     */
    @NotNull
    String treeSorts();

    /**
     * 是否最末级
     */
    @NotNull
    String treeLeaf();

    /**
     * 层次级别
     */
    @NotNull
    BigDecimal treeLevel();

    /**
     * 全节点名
     */
    @NotNull
    String treeNames();

    /**
     * 菜单名称
     */
    @NotNull
    String menuName();

    /**
     * 菜单类型（1菜单 2权限 3开发）
     */
    @NotNull
    String menuType();

    /**
     * 链接
     */
    String menuHref();

    /**
     * 组件地址
     */
    String menuComponent();

    /**
     * 目标
     */
    String menuTarget();

    /**
     * 图标
     */
    String menuIcon();

    /**
     * 颜色
     */
    String menuColor();

    /**
     * 菜单标题
     */
    String menuTitle();

    /**
     * 权限标识
     */
    String permission();

    /**
     * 菜单权重
     */
    @NotNull
    BigDecimal weight();

    /**
     * 是否显示（1显示 0隐藏）
     */
    @NotNull
    String isShow();

    /**
     * 归属系统（default:主导航菜单、mobileApp:APP菜单）
     */
    @NotNull
    String sysCode();

}


