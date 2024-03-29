package top.yangwulang.platform.entity.sys;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import org.babyfish.jimmer.sql.*;
import top.yangwulang.platform.entity.BaseEntity;

import java.util.List;

/**
 * @author yangwulang
 */
@Entity
@Table(name = "sys_user")
@Schema(description = "用户实体")
public interface User extends BaseEntity {
    /**
     * 未激活
     */
    String STATUS_UN_ACTIVE = "10";

    String STATUS_ACTIVE = "0";

    /**
     * 超级管理员用户类型
     */
    String USER_TYPE_SUPER_ADMIN = "9";
    /**
     * 普通用户类型
     */
    String USER_TYPE_SIMPLE_USER = "1";
    /**
     * 高管
     */
    String MGRTYPE_SENIOR_EXECUTIVE = "3";
    /**
     * 中层
     */
    String MGRTYPE_MIDDLE_LEVEL = "2";
    /**
     * 普通员工
     */
    String MGRTYPE_SIMPLE_EMPLOYEE = "1";

    @Id
    @Schema(description = "用户编码")
    String userCode();

    @Schema(description = "登录编码(账号)")
    @Key
    @Nullable String loginCode();

    @Schema(description = "用户名")
    @Nullable String userName();

    @Schema(description = "密码")
    @Nullable String password();


    @Schema(description = "邮件")
    @Nullable String email();

    @Schema(description = "手机")
    @Nullable String mobile();


    @Schema(description = "电话")
    @Nullable String phone();

    @Schema(description = "性别")
    @Nullable String sex();

    @Schema(description = "头像地址")
    @Nullable String avatar();

    @Schema(description = "个性签名")
    @Nullable String sign();

    @Schema(description = "微信开发id")
    @Column(name = "wx_openid")
    @Nullable String wxOpenId();

    @Schema(description = "手机imei")
    @Nullable String mobileImei();

    @Schema(description = "用户类型")
    @Nullable String userType();

    @Schema(description = "用户类型引用编号")
    @Nullable String refCode();


    @Schema(description = "用户类型引用名称")
    @Nullable String refName();

    @Schema(description = "管理员类型")
    String mgrType();

    Integer pwdSecurityLevel();

    Integer userWeight();

    @ManyToMany
    @JoinTable(
            name = "SYS_USER_ROLE",
            joinColumnName = "USER_CODE",
            inverseJoinColumnName = "ROLE_CODE"
    )
    List<Role> roles();

}
