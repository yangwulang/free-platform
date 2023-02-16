package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 角色表
 */
@Table(name = "sys_role")
@Entity
public interface Role {
    /**
     * 角色编码
     */
    @Id
    String roleCode();

    /**
     * 角色名称
     */
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
     * 状态（0正常 1删除 2停用）
     */
    @Key
    String status();

    /**
     * 创建者
     */
    String createBy();

    /**
     * 创建时间
     */
    LocalDateTime createDate();

    /**
     * 更新者
     */
    String updateBy();

    /**
     * 更新时间
     */
    LocalDateTime updateDate();

    /**
     * 备注信息
     */
    @Null String remarks();

    /**
     * 租户代码
     */
    @Key
    @Null String corpCode();

    /**
     * 租户名称
     */
    String corpName();
}

