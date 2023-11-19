package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.ViewableInput;
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
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Employee.dto"
)
public class EmployeeListInput implements ViewableInput<Employee> {
    public static final ViewMetadata<Employee, EmployeeListInput> METADATA = 
        new ViewMetadata<Employee, EmployeeListInput>(
            EmployeeFetcher.$
                .empName()
                .companyId()
                .user(UserFetcher.$
                        .userName()
                        .email()
                        .status()
                ),
            EmployeeListInput::new
    );

    private static final DtoPropAccessor EMP_CODE_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { EmployeeDraft.Producer.SLOT_EMP_CODE }
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
    @Nullable
    private String empCode;

    @Schema(
            description = "员工名称"
    )
    @Null
    private String empName;

    @Null
    private String companyId;

    @Schema(
            description = "用户"
    )
    @Null
    private String userName;

    @Schema(
            description = "用户"
    )
    @Null
    private String email;

    @Schema(
            description = "用户"
    )
    @Null
    private Integer status;

    public EmployeeListInput() {
    }

    public EmployeeListInput(@NotNull Employee base) {
        this.empCode = EMP_CODE_ACCESSOR.get(base);
        this.empName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(EmployeeDraft.Producer.SLOT_EMP_NAME)) ? base.empName() : null;
        this.companyId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(EmployeeDraft.Producer.SLOT_COMPANY_ID)) ? base.companyId() : null;
        this.userName = USER_NAME_ACCESSOR.get(base);
        this.email = EMAIL_ACCESSOR.get(base);
        this.status = STATUS_ACCESSOR.get(base);
    }

    public static EmployeeListInput of(@NotNull Employee base) {
        return new EmployeeListInput(base);
    }

    @Nullable
    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(@Nullable String empCode) {
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
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(@Nullable String companyId) {
        this.companyId = companyId;
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
    public Integer getStatus() {
        return status;
    }

    public void setStatus(@Nullable Integer status) {
        this.status = status;
    }

    @Override
    public Employee toEntity() {
        return EmployeeDraft.$.produce(__draft -> {
            EMP_CODE_ACCESSOR.set(__draft, empCode);
            __draft.setEmpName(empName);
            __draft.setCompanyId(companyId);
            USER_NAME_ACCESSOR.set(__draft, userName);
            EMAIL_ACCESSOR.set(__draft, email);
            STATUS_ACCESSOR.set(__draft, status);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(empCode);
        hash = hash * 31 + Objects.hashCode(empName);
        hash = hash * 31 + Objects.hashCode(companyId);
        hash = hash * 31 + Objects.hashCode(userName);
        hash = hash * 31 + Objects.hashCode(email);
        hash = hash * 31 + Objects.hashCode(status);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        EmployeeListInput other = (EmployeeListInput) o;
        if (!Objects.equals(empCode, other.empCode)) {
            return false;
        }
        if (!Objects.equals(empName, other.empName)) {
            return false;
        }
        if (!Objects.equals(companyId, other.companyId)) {
            return false;
        }
        if (!Objects.equals(userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(email, other.email)) {
            return false;
        }
        if (!Objects.equals(status, other.status)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EmployeeListInput").append('(');
        builder.append("empCode=").append(empCode);
        builder.append(", empName=").append(empName);
        builder.append(", companyId=").append(companyId);
        builder.append(", userName=").append(userName);
        builder.append(", email=").append(email);
        builder.append(", status=").append(status);
        builder.append(')');
        return builder.toString();
    }
}
