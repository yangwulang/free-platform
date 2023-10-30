package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;
import top.yangwulang.platform.entity.sys.UserProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/User.dto"
)
@Data
public class UserListView implements View<User> {
    public static final ViewMetadata<User, UserListView> METADATA = 
        new ViewMetadata<User, UserListView>(
            UserFetcher.$
                .status()
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .loginCode()
                .userName()
                .email()
                .mobile()
                .phone()
                .sex()
                .avatar()
                .sign()
                .wxOpenId()
                .mobileImei()
                .userType()
                .refCode()
                .refName()
                .mgrType()
                .pwdSecurityLevel()
                .userWeight(),
            UserListView::new
    );

    @Schema(
            description = "用户编码"
    )
    @NotNull
    private String userCode;

    @javax.validation.constraints.NotNull
    @Schema(
            description = "状态"
    )
    private int status;

    @javax.validation.constraints.NotNull
    @Schema(
            description = "创建人"
    )
    private String createBy;

    @javax.validation.constraints.NotNull
    @Schema(
            description = "创建时间"
    )
    private Date createDate;

    @javax.validation.constraints.NotNull
    @Schema(
            description = "修改者"
    )
    private String updateBy;

    @javax.validation.constraints.NotNull
    @Schema(
            description = "修改时间"
    )
    private Date updateDate;

    @Null
    @Schema(
            description = "备注"
    )
    private String remarks;

    @Schema(
            description = "登录编码(账号)"
    )
    @Null
    private String loginCode;

    @Schema(
            description = "用户名"
    )
    @Null
    private String userName;

    @Schema(
            description = "邮件"
    )
    @Null
    private String email;

    @Schema(
            description = "手机"
    )
    @Null
    private String mobile;

    @Schema(
            description = "电话"
    )
    @Null
    private String phone;

    @Schema(
            description = "性别"
    )
    @Null
    private String sex;

    @Schema(
            description = "头像地址"
    )
    @Null
    private String avatar;

    @Schema(
            description = "个性签名"
    )
    @Null
    private String sign;

    @Schema(
            description = "微信开发id"
    )
    @Null
    private String wxOpenId;

    @Schema(
            description = "手机imei"
    )
    @Null
    private String mobileImei;

    @Schema(
            description = "用户类型"
    )
    @Null
    private String userType;

    @Schema(
            description = "用户类型引用编号"
    )
    @Null
    private String refCode;

    @Schema(
            description = "用户类型引用名称"
    )
    @Null
    private String refName;

    @Schema(
            description = "管理员类型"
    )
    @NotNull
    private String mgrType;

    @Nullable
    private Integer pwdSecurityLevel;

    @Nullable
    private Integer userWeight;

    public UserListView() {
    }

    public UserListView(@NotNull User base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.userCode = base.userCode();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = spi.__isLoaded(UserProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
        this.loginCode = spi.__isLoaded(UserProps.LOGIN_CODE.unwrap().getId()) ? base.loginCode() : null;
        this.userName = spi.__isLoaded(UserProps.USER_NAME.unwrap().getId()) ? base.userName() : null;
        this.email = spi.__isLoaded(UserProps.EMAIL.unwrap().getId()) ? base.email() : null;
        this.mobile = spi.__isLoaded(UserProps.MOBILE.unwrap().getId()) ? base.mobile() : null;
        this.phone = spi.__isLoaded(UserProps.PHONE.unwrap().getId()) ? base.phone() : null;
        this.sex = spi.__isLoaded(UserProps.SEX.unwrap().getId()) ? base.sex() : null;
        this.avatar = spi.__isLoaded(UserProps.AVATAR.unwrap().getId()) ? base.avatar() : null;
        this.sign = spi.__isLoaded(UserProps.SIGN.unwrap().getId()) ? base.sign() : null;
        this.wxOpenId = spi.__isLoaded(UserProps.WX_OPEN_ID.unwrap().getId()) ? base.wxOpenId() : null;
        this.mobileImei = spi.__isLoaded(UserProps.MOBILE_IMEI.unwrap().getId()) ? base.mobileImei() : null;
        this.userType = spi.__isLoaded(UserProps.USER_TYPE.unwrap().getId()) ? base.userType() : null;
        this.refCode = spi.__isLoaded(UserProps.REF_CODE.unwrap().getId()) ? base.refCode() : null;
        this.refName = spi.__isLoaded(UserProps.REF_NAME.unwrap().getId()) ? base.refName() : null;
        this.mgrType = base.mgrType();
        this.pwdSecurityLevel = spi.__isLoaded(UserProps.PWD_SECURITY_LEVEL.unwrap().getId()) ? base.pwdSecurityLevel() : null;
        this.userWeight = spi.__isLoaded(UserProps.USER_WEIGHT.unwrap().getId()) ? base.userWeight() : null;
    }

    public static UserListView of(@NotNull User base) {
        return new UserListView(base);
    }

    @Override
    public User toEntity() {
        return UserDraft.$.produce(draft -> {
            draft.setUserCode(userCode);
            draft.setStatus(status);
            draft.setCreateBy(createBy);
            draft.setCreateDate(createDate);
            draft.setUpdateBy(updateBy);
            draft.setUpdateDate(updateDate);
            draft.setRemarks(remarks);
            draft.setLoginCode(loginCode);
            draft.setUserName(userName);
            draft.setEmail(email);
            draft.setMobile(mobile);
            draft.setPhone(phone);
            draft.setSex(sex);
            draft.setAvatar(avatar);
            draft.setSign(sign);
            draft.setWxOpenId(wxOpenId);
            draft.setMobileImei(mobileImei);
            draft.setUserType(userType);
            draft.setRefCode(refCode);
            draft.setRefName(refName);
            draft.setMgrType(mgrType);
            draft.setPwdSecurityLevel(pwdSecurityLevel);
            draft.setUserWeight(userWeight);
        });
    }
}
