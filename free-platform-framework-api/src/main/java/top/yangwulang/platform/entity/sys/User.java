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
@Schema(name = "用户实体")
@Immutable(value = Immutable.Nullity.NULLABLE)
public interface User {

    @Id
    @Schema(name = "用户编码")
    @NotNull
    String userCode();

    @Schema(name = "登录编码")
    @Key
    String loginCode();

    String userName();

    @Schema(name = "密码")
    String password();


    @Schema(name = "邮件")
    String email();

    @Schema(name = "手机")
    String mobile();


    @Schema(name = "电话")
    String phone();

    @Schema(name = "性别")
    String sex();

    @Schema(name = "头像地址")
    String avatar();

    @Schema(name = "个性签名")
    String sign();

    @Schema(name = "微信开发id")
    @Column(name = "wx_openid")
    String wxOpenId();

    @Schema(name = "手机imei")
    String mobileImei();

    @Schema(name = "用户类型")
    @NotNull
    String userType();

    @Schema(name = "用户类型引用编号")
    String refCode();


    @Schema(name = "用户类型引用名称")
    String refName();

    @Schema(name = "管理员类型")
    @NotNull
    String mgrType();

    Integer pwdSecurityLevel();

    Integer userWeight();

    @NotNull
    String status();

    @NotNull
    String createBy();

    @NotNull
    Date createDate();

    @NotNull
    String updateBy();

    @NotNull
    Date updateDate();

    String remarks();

}
