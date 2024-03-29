package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.*;
import top.yangwulang.platform.entity.DataTypeBase;

import jakarta.annotation.Nullable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 角色表
 *
 * @author yangwulang
 */
@Table(name = "sys_role")
@Entity
@Schema(description = "角色")
public interface Role extends DataTypeBase {
    /**
     * 角色编码
     */
    @Key
    @Schema(description = "角色编码")
    String roleCode();

    /**
     * 角色名称
     */
    @Key
    @Schema(description = "角色名称")
    String roleName();

    /**
     * 角色分类（高管、中层、基层、其它）
     */
    @Schema(description = "角色类型")
    @Nullable String roleType();

    /**
     * 角色排序（升序）
     */
    @Schema(description = "角色排序")
    @Nullable BigDecimal roleSort();

    /**
     * 系统内置（1是 0否）
     */
    @Column(name = "is_sys")
    @Schema(description = "系统内置 1是 0否")
    Boolean isSys();

    /**
     * 用户类型（employee员工 member会员）
     */
    @Schema(description = "用户类型")
    @Nullable String userType();

    /**
     * 数据范围设置（0未设置  1全部数据 2自定义数据）
     */
    @Schema(description = "数据范围设置")
    @Nullable String dataScope();

    /**
     * 适应业务范围（不同的功能，不同的数据权限支持）
     */
    @Schema(description = "适应业务范围")
    @Nullable String bizScope();

    /**
     * 租户代码
     */
    @Nullable String corpCode();

    /**
     * 租户名称
     */
    @Nullable String corpName();

    @ManyToMany(mappedBy = "roles")
    @Schema(description = "角色拥有的菜单")
    List<Menu> menus();

    @ManyToMany(mappedBy = "roles")
    @Schema(description = "角色拥有的用户")
    List<User> users();
}

