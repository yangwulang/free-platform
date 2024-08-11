package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.*;
import top.yangwulang.platform.entity.DataTypeBase;

import jakarta.annotation.Nullable;

import java.math.BigDecimal;
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
     * 菜单类型-权限
     */
    String MENU_TYPE_PERMISSION = "2";
    /**
     * 菜单类型-菜单
     */
    String MENU_TYPE_MENU = "1";

    /**
     * 父级编号
     */
    @Key
    @ManyToOne
    @JoinColumn(name = "pid")
    @Schema(description = "父级菜单")
    @OnDissociate(DissociateAction.DELETE)
    @Nullable Menu parent();

    @IdView
    @Nullable String parentId();

    @OneToMany(mappedBy = "parent")
    @Schema(description = "子级菜单")
    List<Menu> children();

    @Serialized
    @Schema(description = "菜单元数据")
    Meta meta();

    /**
     * 菜单名称
     */
    @Schema(description = "菜单名称")
    String menuName();

    @Schema(description = "菜单路径")
    String menuPath();

    @Schema(description = "重定向地址")
    @Nullable String redirect();

    /**
     * 菜单类型（1菜单 2权限 3开发）
     */
    @Schema(description = "菜单类型（1菜单 2权限 3开发）")
    String menuType();


    /**
     * 组件地址
     */
    @Schema(description = "组件地址")
    @Nullable String menuComponent();

    /**
     * 目标
     */
    @Schema(description = "目标")
    @Nullable String menuTarget();

    /**
     * 权限标识
     */
    @Schema(description = "权限标识")
    @Nullable String permission();

    /**
     * 菜单权重
     */
    @Schema(description = "菜单权重")
    @Nullable BigDecimal weight();


    /**
     * 归属系统（default:主导航菜单、mobileApp:APP菜单）
     */
    @Schema(description = "归属系统（default:主导航菜单、mobileApp:APP菜单）")
    @Nullable String sysCode();


    @ManyToMany
    @JoinTable(
            name = "SYS_ROLE_MENU",
            joinColumnName = "MENU_ID",
            inverseJoinColumnName = "ROLE_ID"
    )
    List<Role> roles();

}


