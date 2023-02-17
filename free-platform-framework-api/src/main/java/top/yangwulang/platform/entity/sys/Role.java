package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 角色表
 */
@Table(name = "sys_role")
@Entity
public interface Role extends BaseEntity{
    /**
     * 角色编码
     */
    @Id
    String roleCode();

    /**
     * 角色名称
     */
    @Key
    String roleName();

    /**
     * 角色分类（高管、中层、基层、其它）
     */
    @Null String roleType();

    /**
     * 角色排序（升序）
     */
    @Null BigDecimal roleSort();

    /**
     * 系统内置（1是 0否）
     */
    @Column(name = "is_sys")
    @Null boolean isSys();

    /**
     * 用户类型（employee员工 member会员）
     */
    @Null String userType();

    /**
     * 数据范围设置（0未设置  1全部数据 2自定义数据）
     */
    @Null String dataScope();

    /**
     * 适应业务范围（不同的功能，不同的数据权限支持）
     */
    @Null String bizScope();

    /**
     * 租户代码
     */
    @Null String corpCode();

    /**
     * 租户名称
     */
    @Null String corpName();

    @ManyToMany(mappedBy = "roles")
    List<Menu> menus();
}

