package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.beans.ConstructorProperties;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.StaticMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

public class UserInput implements Input<User> {
    public static final StaticMetadata<User, UserInput> METADATA = 
        new StaticMetadata<User, UserInput>(
            UserFetcher.$
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
            UserInput::new
    );

    @Nullable
    @Null
    @Schema(
            description = "用户编码"
    )
    private final String userCode;

    @Nullable
    @Null
    @Schema(
            description = "登录编码(账号)"
    )
    private final String loginCode;

    @Nullable
    @Null
    @Schema(
            description = "用户名"
    )
    private final String userName;

    @Nullable
    @Null
    @Schema(
            description = "邮件"
    )
    private final String email;

    @Nullable
    @Null
    @Schema(
            description = "手机"
    )
    private final String mobile;

    @Nullable
    @Null
    @Schema(
            description = "电话"
    )
    private final String phone;

    @Nullable
    @Null
    @Schema(
            description = "性别"
    )
    private final String sex;

    @Nullable
    @Null
    @Schema(
            description = "头像地址"
    )
    private final String avatar;

    @Nullable
    @Null
    @Schema(
            description = "个性签名"
    )
    private final String sign;

    @Nullable
    @Null
    @Schema(
            description = "微信开发id"
    )
    private final String wxOpenId;

    @Nullable
    @Null
    @Schema(
            description = "手机imei"
    )
    private final String mobileImei;

    @NotNull
    @javax.validation.constraints.NotNull
    @Schema(
            description = "用户类型"
    )
    private final String userType;

    @Nullable
    @Null
    @Schema(
            description = "用户类型引用编号"
    )
    private final String refCode;

    @Nullable
    @Null
    @Schema(
            description = "用户类型引用名称"
    )
    private final String refName;

    @NotNull
    @javax.validation.constraints.NotNull
    @Schema(
            description = "管理员类型"
    )
    private final String mgrType;

    @Nullable
    @Null
    private final Integer pwdSecurityLevel;

    @Nullable
    @Null
    private final Integer userWeight;

    @JsonCreator
    @ConstructorProperties({"userCode", "loginCode", "userName", "email", "mobile", "phone", "sex", "avatar", "sign", "wxOpenId", "mobileImei", "userType", "refCode", "refName", "mgrType", "pwdSecurityLevel", "userWeight"})
    public UserInput(@Nullable @Null @JsonProperty("userCode") String userCode,
            @Nullable @Null @JsonProperty("loginCode") String loginCode,
            @Nullable @Null @JsonProperty("userName") String userName,
            @Nullable @Null @JsonProperty("email") String email,
            @Nullable @Null @JsonProperty("mobile") String mobile,
            @Nullable @Null @JsonProperty("phone") String phone,
            @Nullable @Null @JsonProperty("sex") String sex,
            @Nullable @Null @JsonProperty("avatar") String avatar,
            @Nullable @Null @JsonProperty("sign") String sign,
            @Nullable @Null @JsonProperty("wxOpenId") String wxOpenId,
            @Nullable @Null @JsonProperty("mobileImei") String mobileImei,
            @NotNull @javax.validation.constraints.NotNull @JsonProperty(value = "userType", required = true) String userType,
            @Nullable @Null @JsonProperty("refCode") String refCode,
            @Nullable @Null @JsonProperty("refName") String refName,
            @NotNull @javax.validation.constraints.NotNull @JsonProperty(value = "mgrType", required = true) String mgrType,
            @Nullable @Null @JsonProperty("pwdSecurityLevel") Integer pwdSecurityLevel,
            @Nullable @Null @JsonProperty("userWeight") Integer userWeight) {
        this.userCode = userCode;
        this.loginCode = loginCode;
        this.userName = userName;
        this.email = email;
        this.mobile = mobile;
        this.phone = phone;
        this.sex = sex;
        this.avatar = avatar;
        this.sign = sign;
        this.wxOpenId = wxOpenId;
        this.mobileImei = mobileImei;
        this.userType = Objects.requireNonNull(userType, "userType");
        this.refCode = refCode;
        this.refName = refName;
        this.mgrType = Objects.requireNonNull(mgrType, "mgrType");
        this.pwdSecurityLevel = pwdSecurityLevel;
        this.userWeight = userWeight;
    }

    UserInput(@NotNull User base) {
        // This constructor is not public so that the `@Argument` of spring-graphql can work, please use `of`
        ImmutableSpi spi = (ImmutableSpi)base;
        this.userCode = spi.__isLoaded(7) ? base.userCode() : null;
        this.loginCode = spi.__isLoaded(8) ? base.loginCode() : null;
        this.userName = spi.__isLoaded(9) ? base.userName() : null;
        this.email = spi.__isLoaded(11) ? base.email() : null;
        this.mobile = spi.__isLoaded(12) ? base.mobile() : null;
        this.phone = spi.__isLoaded(13) ? base.phone() : null;
        this.sex = spi.__isLoaded(14) ? base.sex() : null;
        this.avatar = spi.__isLoaded(15) ? base.avatar() : null;
        this.sign = spi.__isLoaded(16) ? base.sign() : null;
        this.wxOpenId = spi.__isLoaded(17) ? base.wxOpenId() : null;
        this.mobileImei = spi.__isLoaded(18) ? base.mobileImei() : null;
        this.userType = base.userType();
        this.refCode = spi.__isLoaded(20) ? base.refCode() : null;
        this.refName = spi.__isLoaded(21) ? base.refName() : null;
        this.mgrType = base.mgrType();
        this.pwdSecurityLevel = spi.__isLoaded(23) ? base.pwdSecurityLevel() : null;
        this.userWeight = spi.__isLoaded(24) ? base.userWeight() : null;
    }

    public static UserInput of(@NotNull User base) {
        return new UserInput(base);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public static Builder newBuilder(@Nullable UserInput base) {
        return new Builder(base);
    }

    @Nullable
    @Null
    public String getUserCode() {
        return userCode;
    }

    @Nullable
    @Null
    public String getLoginCode() {
        return loginCode;
    }

    @Nullable
    @Null
    public String getUserName() {
        return userName;
    }

    @Nullable
    @Null
    public String getEmail() {
        return email;
    }

    @Nullable
    @Null
    public String getMobile() {
        return mobile;
    }

    @Nullable
    @Null
    public String getPhone() {
        return phone;
    }

    @Nullable
    @Null
    public String getSex() {
        return sex;
    }

    @Nullable
    @Null
    public String getAvatar() {
        return avatar;
    }

    @Nullable
    @Null
    public String getSign() {
        return sign;
    }

    @Nullable
    @Null
    public String getWxOpenId() {
        return wxOpenId;
    }

    @Nullable
    @Null
    public String getMobileImei() {
        return mobileImei;
    }

    @NotNull
    @javax.validation.constraints.NotNull
    public String getUserType() {
        return userType;
    }

    @Nullable
    @Null
    public String getRefCode() {
        return refCode;
    }

    @Nullable
    @Null
    public String getRefName() {
        return refName;
    }

    @NotNull
    @javax.validation.constraints.NotNull
    public String getMgrType() {
        return mgrType;
    }

    @Nullable
    @Null
    public Integer getPwdSecurityLevel() {
        return pwdSecurityLevel;
    }

    @Nullable
    @Null
    public Integer getUserWeight() {
        return userWeight;
    }

    @Override
    public User toEntity() {
        return toEntity(null);
    }

    @Override
    public User toEntity(@Nullable User base) {
        return UserDraft.$.produce(base, draft -> {
            if (userCode != null) {
                draft.setUserCode(userCode);
            }
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

    @Override
    public String toString() {
        return new StringBuilder()
            .append("UserInput{")
            .append("userCode").append('=').append(userCode)
            .append(", ")
            .append("loginCode").append('=').append(loginCode)
            .append(", ")
            .append("userName").append('=').append(userName)
            .append(", ")
            .append("email").append('=').append(email)
            .append(", ")
            .append("mobile").append('=').append(mobile)
            .append(", ")
            .append("phone").append('=').append(phone)
            .append(", ")
            .append("sex").append('=').append(sex)
            .append(", ")
            .append("avatar").append('=').append(avatar)
            .append(", ")
            .append("sign").append('=').append(sign)
            .append(", ")
            .append("wxOpenId").append('=').append(wxOpenId)
            .append(", ")
            .append("mobileImei").append('=').append(mobileImei)
            .append(", ")
            .append("userType").append('=').append(userType)
            .append(", ")
            .append("refCode").append('=').append(refCode)
            .append(", ")
            .append("refName").append('=').append(refName)
            .append(", ")
            .append("mgrType").append('=').append(mgrType)
            .append(", ")
            .append("pwdSecurityLevel").append('=').append(pwdSecurityLevel)
            .append(", ")
            .append("userWeight").append('=').append(userWeight)
            .append('}')
            .toString();
    }

    public static class Builder {
        private String userCode;

        private String loginCode;

        private String userName;

        private String email;

        private String mobile;

        private String phone;

        private String sex;

        private String avatar;

        private String sign;

        private String wxOpenId;

        private String mobileImei;

        private String userType;

        private String refCode;

        private String refName;

        private String mgrType;

        private Integer pwdSecurityLevel;

        private Integer userWeight;

        Builder(UserInput base) {
            if (base != null) {
                this.userCode = base.getUserCode();
                this.loginCode = base.getLoginCode();
                this.userName = base.getUserName();
                this.email = base.getEmail();
                this.mobile = base.getMobile();
                this.phone = base.getPhone();
                this.sex = base.getSex();
                this.avatar = base.getAvatar();
                this.sign = base.getSign();
                this.wxOpenId = base.getWxOpenId();
                this.mobileImei = base.getMobileImei();
                this.userType = base.getUserType();
                this.refCode = base.getRefCode();
                this.refName = base.getRefName();
                this.mgrType = base.getMgrType();
                this.pwdSecurityLevel = base.getPwdSecurityLevel();
                this.userWeight = base.getUserWeight();
            }
        }

        @NotNull
        public Builder setUserCode(@Nullable String userCode) {
            this.userCode = userCode;
            return this;
        }

        @NotNull
        public Builder setLoginCode(@Nullable String loginCode) {
            this.loginCode = loginCode;
            return this;
        }

        @NotNull
        public Builder setUserName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }

        @NotNull
        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        @NotNull
        public Builder setMobile(@Nullable String mobile) {
            this.mobile = mobile;
            return this;
        }

        @NotNull
        public Builder setPhone(@Nullable String phone) {
            this.phone = phone;
            return this;
        }

        @NotNull
        public Builder setSex(@Nullable String sex) {
            this.sex = sex;
            return this;
        }

        @NotNull
        public Builder setAvatar(@Nullable String avatar) {
            this.avatar = avatar;
            return this;
        }

        @NotNull
        public Builder setSign(@Nullable String sign) {
            this.sign = sign;
            return this;
        }

        @NotNull
        public Builder setWxOpenId(@Nullable String wxOpenId) {
            this.wxOpenId = wxOpenId;
            return this;
        }

        @NotNull
        public Builder setMobileImei(@Nullable String mobileImei) {
            this.mobileImei = mobileImei;
            return this;
        }

        @NotNull
        public Builder setUserType(@NotNull String userType) {
            this.userType = userType;
            return this;
        }

        @NotNull
        public Builder setRefCode(@Nullable String refCode) {
            this.refCode = refCode;
            return this;
        }

        @NotNull
        public Builder setRefName(@Nullable String refName) {
            this.refName = refName;
            return this;
        }

        @NotNull
        public Builder setMgrType(@NotNull String mgrType) {
            this.mgrType = mgrType;
            return this;
        }

        @NotNull
        public Builder setPwdSecurityLevel(@Nullable Integer pwdSecurityLevel) {
            this.pwdSecurityLevel = pwdSecurityLevel;
            return this;
        }

        @NotNull
        public Builder setUserWeight(@Nullable Integer userWeight) {
            this.userWeight = userWeight;
            return this;
        }

        @NotNull
        public UserInput build() {
            if (userType == null) {
                throw new IllegalArgumentException("Property \"userType\" has not been set");
            }
            if (mgrType == null) {
                throw new IllegalArgumentException("Property \"mgrType\" has not been set");
            }
            return new UserInput(
                userCode,
                loginCode,
                userName,
                email,
                mobile,
                phone,
                sex,
                avatar,
                sign,
                wxOpenId,
                mobileImei,
                userType,
                refCode,
                refName,
                mgrType,
                pwdSecurityLevel,
                userWeight
            );
        }
    }
}
