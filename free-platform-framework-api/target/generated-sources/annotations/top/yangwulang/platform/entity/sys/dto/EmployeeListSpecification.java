package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.query.specification.JSpecification;
import org.babyfish.jimmer.sql.ast.query.specification.PredicateApplier;
import org.babyfish.jimmer.sql.ast.query.specification.SpecificationArgs;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Employee;
import top.yangwulang.platform.entity.sys.EmployeeProps;
import top.yangwulang.platform.entity.sys.EmployeeTable;
import top.yangwulang.platform.entity.sys.UserProps;

/**
 * 员工
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Employee.dto"
)
public class EmployeeListSpecification implements JSpecification<Employee, EmployeeTable> {
    @Schema(
            description = "员工编码"
    )
    @Nullable
    private String empCode;

    @Schema(
            description = "员工名称"
    )
    @Nullable
    private String empName;

    @Nullable
    private String companyId;

    @Schema(
            description = "用户"
    )
    @Nullable
    private String userName;

    @Schema(
            description = "用户"
    )
    @Nullable
    private String email;

    @Schema(
            description = "用户"
    )
    @Nullable
    private Integer status;

    public EmployeeListSpecification() {
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
     * 公司主键
     */
    @Nullable
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(@Nullable String companyId) {
        this.companyId = companyId;
    }

    @Nullable
    @Schema(
            description = "用户"
    )
    public String getUserName() {
        return userName;
    }

    public void setUserName(@Nullable String userName) {
        this.userName = userName;
    }

    @Nullable
    @Schema(
            description = "用户"
    )
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Nullable
    @Schema(
            description = "用户"
    )
    public Integer getStatus() {
        return status;
    }

    public void setStatus(@Nullable Integer status) {
        this.status = status;
    }

    @Override
    public Class<Employee> entityType() {
        return Employee.class;
    }

    @Override
    public void applyTo(SpecificationArgs<Employee, EmployeeTable> args) {
        PredicateApplier __applier = args.getApplier();
        __applier.eq(new ImmutableProp[] { EmployeeProps.EMP_CODE.unwrap() }, this.empCode);
        __applier.like(new ImmutableProp[] { EmployeeProps.EMP_NAME.unwrap() }, this.empName, false, false, false);
        __applier.eq(new ImmutableProp[] { EmployeeProps.COMPANY_ID.unwrap() }, this.companyId);
        __applier.push(EmployeeProps.USER.unwrap());
        __applier.like(new ImmutableProp[] { UserProps.USER_NAME.unwrap() }, this.userName, false, false, false);
        __applier.like(new ImmutableProp[] { UserProps.EMAIL.unwrap() }, this.email, false, false, false);
        __applier.eq(new ImmutableProp[] { UserProps.STATUS.unwrap() }, this.status);
        __applier.pop();
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
        EmployeeListSpecification other = (EmployeeListSpecification) o;
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
        builder.append("EmployeeListSpecification").append('(');
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
