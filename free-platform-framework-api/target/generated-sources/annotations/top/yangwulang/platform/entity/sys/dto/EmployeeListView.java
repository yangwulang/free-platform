package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
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

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Employee.dto"
)
public class EmployeeListView implements View<Employee> {
    public static final ViewMetadata<Employee, EmployeeListView> METADATA = 
        new ViewMetadata<Employee, EmployeeListView>(
            EmployeeFetcher.$
                .empName()
                .user(UserFetcher.$
                        .loginCode()
                        .userName()
                        .email()
                        .mobile()
                        .avatar()
                        .status()
                ),
            EmployeeListView::new
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

    private static final DtoPropAccessor EMAIL_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_EMAIL
        }
    );

    private static final DtoPropAccessor MOBILE_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_MOBILE
        }
    );

    private static final DtoPropAccessor AVATAR_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_AVATAR
        }
    );

    private static final DtoPropAccessor STATUS_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] {
            EmployeeDraft.Producer.SLOT_USER,
            UserDraft.Producer.SLOT_STATUS
        }
    );

    @Schema(
            description = "员工编码"
    )
    @NotNull
    private String empCode;

    @Schema(
            description = "员工名称"
    )
    @Null
    private String empName;

    @Schema(
            description = "登录编码"
    )
    @Nullable
    private String loginCode;

    @Schema(
            description = "用户名"
    )
    @Nullable
    private String userName;

    @Schema(
            description = "邮箱"
    )
    @Nullable
    private String email;

    @Schema(
            description = "手机号"
    )
    @Nullable
    private String mobile;

    @Schema(
            description = "头像"
    )
    @Nullable
    private String avatar;

    @Schema(
            description = "状态"
    )
    @Nullable
    private Integer status;

    public EmployeeListView() {
    }

    public EmployeeListView(@NotNull Employee base) {
        this.empCode = base.empCode();
        this.empName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(EmployeeDraft.Producer.SLOT_EMP_NAME)) ? base.empName() : null;
        this.loginCode = LOGIN_CODE_ACCESSOR.get(base);
        this.userName = USER_NAME_ACCESSOR.get(base);
        this.email = EMAIL_ACCESSOR.get(base);
        this.mobile = MOBILE_ACCESSOR.get(base);
        this.avatar = AVATAR_ACCESSOR.get(base);
        this.status = STATUS_ACCESSOR.get(base);
    }

    public static EmployeeListView of(@NotNull Employee base) {
        return new EmployeeListView(base);
    }

    @NotNull
    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(@NotNull String empCode) {
        this.empCode = empCode;
    }

    @Nullable
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(@Nullable String empName) {
        this.empName = empName;
    }

    @Nullable
    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(@Nullable String loginCode) {
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
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Nullable
    public String getMobile() {
        return mobile;
    }

    public void setMobile(@Nullable String mobile) {
        this.mobile = mobile;
    }

    @Nullable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(@Nullable String avatar) {
        this.avatar = avatar;
    }

    @Nullable
    public Integer getStatus() {
        return status;
    }

    public void setStatus(@Nullable Integer status) {
        this.status = status;
    }

    @Override
    public Employee toEntity() {
        return EmployeeDraft.$.produce(__draft -> {
            __draft.setEmpCode(empCode);
            __draft.setEmpName(empName);
            LOGIN_CODE_ACCESSOR.set(__draft, loginCode);
            USER_NAME_ACCESSOR.set(__draft, userName);
            EMAIL_ACCESSOR.set(__draft, email);
            MOBILE_ACCESSOR.set(__draft, mobile);
            AVATAR_ACCESSOR.set(__draft, avatar);
            STATUS_ACCESSOR.set(__draft, status);
        });
    }

    public int hashCode() {
        int hash = Objects.hashCode(empCode);
        hash = hash * 31 + Objects.hashCode(empName);
        hash = hash * 31 + Objects.hashCode(loginCode);
        hash = hash * 31 + Objects.hashCode(userName);
        hash = hash * 31 + Objects.hashCode(email);
        hash = hash * 31 + Objects.hashCode(mobile);
        hash = hash * 31 + Objects.hashCode(avatar);
        hash = hash * 31 + Objects.hashCode(status);
        return hash;
    }

    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        EmployeeListView other = (EmployeeListView) o;
        if (!Objects.equals(empCode, other.empCode)) {
            return false;
        }
        if (!Objects.equals(empName, other.empName)) {
            return false;
        }
        if (!Objects.equals(loginCode, other.loginCode)) {
            return false;
        }
        if (!Objects.equals(userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(email, other.email)) {
            return false;
        }
        if (!Objects.equals(mobile, other.mobile)) {
            return false;
        }
        if (!Objects.equals(avatar, other.avatar)) {
            return false;
        }
        if (!Objects.equals(status, other.status)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EmployeeListView").append('(');
        builder.append("empCode=").append(empCode);
        builder.append(", empName=").append(empName);
        builder.append(", loginCode=").append(loginCode);
        builder.append(", userName=").append(userName);
        builder.append(", email=").append(email);
        builder.append(", mobile=").append(mobile);
        builder.append(", avatar=").append(avatar);
        builder.append(", status=").append(status);
        builder.append(')');
        return builder.toString();
    }
}
