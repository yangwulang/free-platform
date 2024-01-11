package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.NotEmpty;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/User.dto"
)
public class UserSaveInput implements Input<User> {
    public static final ViewMetadata<User, UserSaveInput> METADATA = 
        new ViewMetadata<User, UserSaveInput>(
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
    @Nullable
    private String userCode;

    @NotEmpty(
            message = "登陆编码不能为空"
    )
    @Schema(
            description = "登陆编码，用户登陆的账号",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    @NotNull
    private String loginCode;

    @Schema(
            description = "用户名"
    )
    @Nullable
    private String userName;

    @Schema(
            description = "手机"
    )
    @Nullable
    private String mobile;

    @Schema(
            description = "邮件"
    )
    @Nullable
    private String email;

    @Schema(
            description = "性别"
    )
    @Nullable
    private String sex;

    @Schema(
            description = "个性签名"
    )
    @Nullable
    private String sign;

    @NotEmpty(
            message = "用户类型不能为空"
    )
    @Schema(
            description = "用户类型",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    @Nullable
    private String userType;

    @Schema(
            description = "用户权重",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    @NotNull
    private Integer userWeight;

    @Schema(
            description = "管理员类型",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    @NotNull
    private String mgrType;

    public UserSaveInput() {
    }

    public UserSaveInput(@NotNull User base) {
        this.userCode = USER_CODE_ACCESSOR.get(base);
        this.loginCode = base.loginCode();
        this.userName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_USER_NAME)) ? base.userName() : null;
        this.mobile = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_MOBILE)) ? base.mobile() : null;
        this.email = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_EMAIL)) ? base.email() : null;
        this.sex = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_SEX)) ? base.sex() : null;
        this.sign = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_SIGN)) ? base.sign() : null;
        this.userType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_USER_TYPE)) ? base.userType() : null;
        this.userWeight = base.userWeight();
        this.mgrType = base.mgrType();
    }

    public static UserSaveInput of(@NotNull User base) {
        return new UserSaveInput(base);
    }

    @Nullable
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(@Nullable String userCode) {
        this.userCode = userCode;
    }

    @NotNull
    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(@NotNull String loginCode) {
        this.loginCode = loginCode;
    }

    @Nullable
    public String getUserName() {
        return userName;
    }

    public void setUserName(@Nullable String userName) {
        this.userName = userName;
    }

    @Nullable
    public String getMobile() {
        return mobile;
    }

    public void setMobile(@Nullable String mobile) {
        this.mobile = mobile;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Nullable
    public String getSex() {
        return sex;
    }

    public void setSex(@Nullable String sex) {
        this.sex = sex;
    }

    @Nullable
    public String getSign() {
        return sign;
    }

    public void setSign(@Nullable String sign) {
        this.sign = sign;
    }

    @Nullable
    public String getUserType() {
        return userType;
    }

    public void setUserType(@Nullable String userType) {
        this.userType = userType;
    }

    @NotNull
    public Integer getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(@NotNull Integer userWeight) {
        this.userWeight = userWeight;
    }

    @NotNull
    public String getMgrType() {
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
}
