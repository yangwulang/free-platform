package top.yangwulang.platform.entity.sys;


import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.*;
import top.yangwulang.platform.entity.BaseEntity;

import javax.validation.constraints.Null;
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
    @Null String loginCode();

    @Schema(description = "用户名")
    @Null String userName();

    @Schema(description = "密码")
    @Null String password();


    @Schema(description = "邮件")
    @Null String email();

    @Schema(description = "手机")
    @Null String mobile();


    @Schema(description = "电话")
    @Null String phone();

    @Schema(description = "性别")
    @Null String sex();

    @Schema(description = "头像地址")
    @Null String avatar();

    @Schema(description = "个性签名")
    @Null String sign();

    @Schema(description = "微信开发id")
    @Column(name = "wx_openid")
    @Null String wxOpenId();

    @Schema(description = "手机imei")
    @Null String mobileImei();

    @Schema(description = "用户类型")
    @Null String userType();

    @Schema(description = "用户类型引用编号")
    @Null String refCode();


    @Schema(description = "用户类型引用名称")
    @Null String refName();

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
