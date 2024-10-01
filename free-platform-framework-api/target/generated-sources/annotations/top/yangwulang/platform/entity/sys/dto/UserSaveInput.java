package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.FixedInputField;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/User.dto"
)
@JsonDeserialize(
        builder = UserSaveInput.Builder.class
)
@Schema(
        description = "用户实体"
)
public class UserSaveInput implements Input<User> {
    public static final DtoMetadata<User, UserSaveInput> METADATA = 
        new DtoMetadata<User, UserSaveInput>(
            UserFetcher.$
                .loginCode()
                .userName()
                .mobile()
                .email()
                .sex()
                .sign()
                .userType()
                .userWeight()
                .mgrType(),
            UserSaveInput::new
    );

    private static final DtoPropAccessor USER_CODE_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { UserDraft.Producer.SLOT_USER_CODE }
    );

    @Schema(
            description = "用户编码,用户id,为空则新增，不为空则修改"
    )
    private String userCode;

    @NotEmpty(
            message = "登陆编码不能为空"
    )
    @Schema(
            description = "登陆编码，用户登陆的账号",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String loginCode;

    @Schema(
            description = "用户名"
    )
    private String userName;

    @Schema(
            description = "手机"
    )
    private String mobile;

    @Schema(
            description = "邮件"
    )
    private String email;

    @Schema(
            description = "性别"
    )
    private String sex;

    @Schema(
            description = "个性签名"
    )
    private String sign;

    @NotEmpty(
            message = "用户类型不能为空"
    )
    @Schema(
            description = "用户类型",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String userType;

    @FixedInputField
    @Schema(
            description = "用户权重",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private Integer userWeight;

    @FixedInputField
    @Schema(
            description = "管理员类型",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String mgrType;

    public UserSaveInput() {
    }

    public UserSaveInput(@NotNull User base) {
        this.userCode = USER_CODE_ACCESSOR.get(base);
        this.loginCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_LOGIN_CODE)) ? base.loginCode() : null;
        this.userName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_USER_NAME)) ? base.userName() : null;
        this.mobile = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_MOBILE)) ? base.mobile() : null;
        this.email = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_EMAIL)) ? base.email() : null;
        this.sex = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_SEX)) ? base.sex() : null;
        this.sign = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_SIGN)) ? base.sign() : null;
        this.userType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_USER_TYPE)) ? base.userType() : null;
        this.userWeight = base.userWeight();
        this.mgrType = base.mgrType();
    }

    @Nullable
    @Schema(
            description = "用户编码,用户id,为空则新增，不为空则修改"
    )
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(@Nullable String userCode) {
        this.userCode = userCode;
    }

    @Nullable
    @NotEmpty(
            message = "登陆编码不能为空"
    )
    @Schema(
            description = "登陆编码，用户登陆的账号",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(@Nullable String loginCode) {
        this.loginCode = loginCode;
    }

    @Nullable
    @Schema(
            description = "用户名"
    )
    public String getUserName() {
        return userName;
    }

    public void setUserName(@Nullable String userName) {
        this.userName = userName;
    }

    @Nullable
    @Schema(
            description = "手机"
    )
    public String getMobile() {
        return mobile;
    }

    public void setMobile(@Nullable String mobile) {
        this.mobile = mobile;
    }

    @Nullable
    @Schema(
            description = "邮件"
    )
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Nullable
    @Schema(
            description = "性别"
    )
    public String getSex() {
        return sex;
    }

    public void setSex(@Nullable String sex) {
        this.sex = sex;
    }

    @Nullable
    @Schema(
            description = "个性签名"
    )
    public String getSign() {
        return sign;
    }

    public void setSign(@Nullable String sign) {
        this.sign = sign;
    }

    @Nullable
    @NotEmpty(
            message = "用户类型不能为空"
    )
    @Schema(
            description = "用户类型",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    public String getUserType() {
        return userType;
    }

    public void setUserType(@Nullable String userType) {
        this.userType = userType;
    }

    @NotNull
    @Schema(
            description = "用户权重",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    public Integer getUserWeight() {
        if (userWeight == null) {
            throw new IllegalStateException("The property \"userWeight\" is not specified");
        }
        return userWeight;
    }

    public void setUserWeight(@NotNull Integer userWeight) {
        this.userWeight = userWeight;
    }

    @NotNull
    @Schema(
            description = "管理员类型",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    public String getMgrType() {
        if (mgrType == null) {
            throw new IllegalStateException("The property \"mgrType\" is not specified");
        }
        return mgrType;
    }

    public void setMgrType(@NotNull String mgrType) {
        this.mgrType = mgrType;
    }

    @Override
    public User toEntity() {
        return UserDraft.$.produce(__draft -> {
            USER_CODE_ACCESSOR.set(__draft, userCode);
            __draft.setLoginCode(loginCode);
            __draft.setUserName(userName);
            __draft.setMobile(mobile);
            __draft.setEmail(email);
            __draft.setSex(sex);
            __draft.setSign(sign);
            __draft.setUserType(userType);
            __draft.setUserWeight(userWeight);
            __draft.setMgrType(mgrType);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(userCode);
        hash = hash * 31 + Objects.hashCode(loginCode);
        hash = hash * 31 + Objects.hashCode(userName);
        hash = hash * 31 + Objects.hashCode(mobile);
        hash = hash * 31 + Objects.hashCode(email);
        hash = hash * 31 + Objects.hashCode(sex);
        hash = hash * 31 + Objects.hashCode(sign);
        hash = hash * 31 + Objects.hashCode(userType);
        hash = hash * 31 + Objects.hashCode(userWeight);
        hash = hash * 31 + Objects.hashCode(mgrType);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        UserSaveInput other = (UserSaveInput) o;
        if (!Objects.equals(userCode, other.userCode)) {
            return false;
        }
        if (!Objects.equals(loginCode, other.loginCode)) {
            return false;
        }
        if (!Objects.equals(userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(mobile, other.mobile)) {
            return false;
        }
        if (!Objects.equals(email, other.email)) {
            return false;
        }
        if (!Objects.equals(sex, other.sex)) {
            return false;
        }
        if (!Objects.equals(sign, other.sign)) {
            return false;
        }
        if (!Objects.equals(userType, other.userType)) {
            return false;
        }
        if (!Objects.equals(userWeight, other.userWeight)) {
            return false;
        }
        if (!Objects.equals(mgrType, other.mgrType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserSaveInput").append('(');
        builder.append("userCode=").append(userCode);
        builder.append(", loginCode=").append(loginCode);
        builder.append(", userName=").append(userName);
        builder.append(", mobile=").append(mobile);
        builder.append(", email=").append(email);
        builder.append(", sex=").append(sex);
        builder.append(", sign=").append(sign);
        builder.append(", userType=").append(userType);
        builder.append(", userWeight=").append(userWeight);
        builder.append(", mgrType=").append(mgrType);
        builder.append(')');
        return builder.toString();
    }

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String userCode;

        private String loginCode;

        private String userName;

        private String mobile;

        private String email;

        private String sex;

        private String sign;

        private String userType;

        private Integer userWeight;

        private String mgrType;

        public Builder userCode(String userCode) {
            this.userCode = userCode;
            return this;
        }

        public Builder loginCode(String loginCode) {
            this.loginCode = loginCode;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder sign(String sign) {
            this.sign = sign;
            return this;
        }

        public Builder userType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder userWeight(Integer userWeight) {
            this.userWeight = Objects.requireNonNull(userWeight, "The property \"userWeight\" cannot be null");
            return this;
        }

        public Builder mgrType(String mgrType) {
            this.mgrType = Objects.requireNonNull(mgrType, "The property \"mgrType\" cannot be null");
            return this;
        }

        public UserSaveInput build() {
            UserSaveInput _input = new UserSaveInput();
            _input.setUserCode(userCode);
            _input.setLoginCode(loginCode);
            _input.setUserName(userName);
            _input.setMobile(mobile);
            _input.setEmail(email);
            _input.setSex(sex);
            _input.setSign(sign);
            _input.setUserType(userType);
            if (userWeight == null) {
                throw Input.unknownNonNullProperty(UserSaveInput.class, "userWeight");
            }
            _input.setUserWeight(userWeight);
            if (mgrType == null) {
                throw Input.unknownNonNullProperty(UserSaveInput.class, "mgrType");
            }
            _input.setMgrType(mgrType);
            return _input;
        }
    }
}
