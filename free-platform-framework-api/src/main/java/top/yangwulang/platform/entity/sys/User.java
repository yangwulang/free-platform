package top.yangwulang.platform.entity.sys;


import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author yangwulang
 */
@Entity
@Table(name = "sys_user")
@Schema(description = "用户实体")
@Immutable(value = Immutable.Nullity.NULLABLE)
public interface User extends BaseEntity {

    @Id
    @Schema(description = "用户编码")
    @NotNull
    String userCode();

    @Schema(description = "登录编码(账号)")
    @Key
    String loginCode();

    @Schema(description = "用户名")
    String userName();

    @Schema(description = "密码")
    String password();


    @Schema(description = "邮件")
    String email();

    @Schema(description = "手机")
    String mobile();


    @Schema(description = "电话")
    String phone();

    @Schema(description = "性别")
    String sex();

    @Schema(description = "头像地址")
    String avatar();

    @Schema(description = "个性签名")
    String sign();

    @Schema(description = "微信开发id")
    @Column(name = "wx_openid")
    String wxOpenId();

    @Schema(description = "手机imei")
    String mobileImei();

    @Schema(description = "用户类型")
    @NotNull
    String userType();

    @Schema(description = "用户类型引用编号")
    String refCode();


    @Schema(description = "用户类型引用名称")
    String refName();

    @Schema(description = "管理员类型")
    @NotNull
    String mgrType();

    Integer pwdSecurityLevel();

    Integer userWeight();

}
