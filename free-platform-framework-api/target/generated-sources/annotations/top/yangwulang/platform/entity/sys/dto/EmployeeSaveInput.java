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
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Employee;
import top.yangwulang.platform.entity.sys.EmployeeDraft;
import top.yangwulang.platform.entity.sys.EmployeeFetcher;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

/**
 * 员工
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Employee.dto"
)
@JsonDeserialize(
        builder = EmployeeSaveInput.Builder.class
)
@Schema(
        description = "员工"
)
public class EmployeeSaveInput implements Input<Employee> {
    public static final ViewMetadata<Employee, EmployeeSaveInput> METADATA = 
        new ViewMetadata<Employee, EmployeeSaveInput>(
            EmployeeFetcher.$
                .empName()
                .user(UserFetcher.$
                        .loginCode()
                        .userName()
                        .mobile()
                        .email()
                        .sex()
                        .sign()
                        .userType()
                        .userWeight()
                        .mgrType()
                ),
            EmployeeSaveInput::new
    );

    private static final DtoPropAccessor EMP_CODE_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { EmployeeDraft.Producer.SLOT_EMP_CODE }
    );

    private static final DtoPropAccessor LOGIN_CODE_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_LOGIN_CODE
        }
    );

    private static final DtoPropAccessor USER_NAME_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_USER_NAME
        }
    );

    private static final DtoPropAccessor MOBILE_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_MOBILE
        }
    );

    private static final DtoPropAccessor EMAIL_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_EMAIL
        }
    );

    private static final DtoPropAccessor SEX_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_SEX
        }
    );

    private static final DtoPropAccessor SIGN_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_SIGN
        }
    );

    private static final DtoPropAccessor USER_TYPE_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_USER_TYPE
        }
    );

    private static final DtoPropAccessor USER_WEIGHT_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_USER_WEIGHT
        }
    );

    private static final DtoPropAccessor MGR_TYPE_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_MGR_TYPE
        }
    );

    private String empName;

    private String empCode;

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

    public EmployeeSaveInput() {
    }

    public EmployeeSaveInput(@NotNull Employee base) {
        this.empName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(EmployeeDraft.Producer.SLOT_EMP_NAME)) ? base.empName() : null;
        this.empCode = EMP_CODE_ACCESSOR.get(base);
        this.loginCode = LOGIN_CODE_ACCESSOR.get(base);
        this.userName = USER_NAME_ACCESSOR.get(base);
        this.mobile = MOBILE_ACCESSOR.get(base);
        this.email = EMAIL_ACCESSOR.get(base);
        this.sex = SEX_ACCESSOR.get(base);
        this.sign = SIGN_ACCESSOR.get(base);
        this.userType = USER_TYPE_ACCESSOR.get(base);
        this.userWeight = USER_WEIGHT_ACCESSOR.get(base);
        this.mgrType = MGR_TYPE_ACCESSOR.get(base);
    }

    /**
     * 员工姓名
     */
    @Nullable
    @Schema(
            description = "员工名称"
    )
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(@Nullable String empName) {
        this.empName = empName;
    }

    /**
     * 员工编码
     */
    @Nullable
    @Schema(
            description = "员工编码"
    )
    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(@Nullable String empCode) {
        this.empCode = empCode;
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

    @Nullable
    @Schema(
            description = "用户权重",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    public Integer getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(@Nullable Integer userWeight) {
        this.userWeight = userWeight;
    }

    @Nullable
    @Schema(
            description = "管理员类型",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    public String getMgrType() {
        return mgrType;
    }

    public void setMgrType(@Nullable String mgrType) {
        this.mgrType = mgrType;
    }

    @Override
    public Employee toEntity() {
        return EmployeeDraft.$.produce(__draft -> {
            __draft.setEmpName(empName);
            EMP_CODE_ACCESSOR.set(__draft, empCode);
            LOGIN_CODE_ACCESSOR.set(__draft, loginCode);
            USER_NAME_ACCESSOR.set(__draft, userName);
            MOBILE_ACCESSOR.set(__draft, mobile);
            EMAIL_ACCESSOR.set(__draft, email);
            SEX_ACCESSOR.set(__draft, sex);
            SIGN_ACCESSOR.set(__draft, sign);
            USER_TYPE_ACCESSOR.set(__draft, userType);
            USER_WEIGHT_ACCESSOR.set(__draft, userWeight);
            MGR_TYPE_ACCESSOR.set(__draft, mgrType);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(empName);
        hash = hash * 31 + Objects.hashCode(empCode);
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
        EmployeeSaveInput other = (EmployeeSaveInput) o;
        if (!Objects.equals(empName, other.empName)) {
            return false;
        }
        if (!Objects.equals(empCode, other.empCode)) {
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
        builder.append("EmployeeSaveInput").append('(');
        builder.append("empName=").append(empName);
        builder.append(", empCode=").append(empCode);
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
        private String empName;

        private String empCode;

        private String loginCode;

        private String userName;

        private String mobile;

        private String email;

        private String sex;

        private String sign;

        private String userType;

        private Integer userWeight;

        private String mgrType;

        private boolean _isMgrTypeLoaded;

        public Builder empName(String empName) {
            this.empName = empName;
            return this;
        }

        public Builder empCode(String empCode) {
            this.empCode = empCode;
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
            this.userWeight = userWeight;
            return this;
        }

        public Builder mgrType(String mgrType) {
            this.mgrType = mgrType;
            this._isMgrTypeLoaded = true;
            return this;
        }

        public EmployeeSaveInput build() {
            EmployeeSaveInput _input = new EmployeeSaveInput();
            _input.setEmpName(empName);
            _input.setEmpCode(empCode);
            _input.setLoginCode(loginCode);
            _input.setUserName(userName);
            _input.setMobile(mobile);
            _input.setEmail(email);
            _input.setSex(sex);
            _input.setSign(sign);
            _input.setUserType(userType);
            _input.setUserWeight(userWeight);
            if (!_isMgrTypeLoaded) {
                throw Input.unknownNullableProperty(EmployeeSaveInput.class, "mgrType");
            }
            _input.setMgrType(mgrType);
            return _input;
        }
    }
}
