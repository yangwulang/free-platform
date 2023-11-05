package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Employee;
import top.yangwulang.platform.entity.sys.EmployeeDraft;
import top.yangwulang.platform.entity.sys.EmployeeFetcher;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Employee.dto"
)
public class EmployeeGetView implements View<Employee> {
    public static final ViewMetadata<Employee, EmployeeGetView> METADATA = 
        new ViewMetadata<Employee, EmployeeGetView>(
            EmployeeFetcher.$
                .empName(),
            EmployeeGetView::new
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

    public EmployeeGetView() {
    }

    public EmployeeGetView(@NotNull Employee base) {
        this.empCode = base.empCode();
        this.empName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(EmployeeDraft.Producer.SLOT_EMP_NAME)) ? base.empName() : null;
    }

    public static EmployeeGetView of(@NotNull Employee base) {
        return new EmployeeGetView(base);
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

    @Override
    public Employee toEntity() {
        return EmployeeDraft.$.produce(__draft -> {
            __draft.setEmpCode(empCode);
            __draft.setEmpName(empName);
        });
    }

    public int hashCode() {
        int hash = Objects.hashCode(empCode);
        hash = hash * 31 + Objects.hashCode(empName);
        return hash;
    }

    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        EmployeeGetView other = (EmployeeGetView) o;
        if (!Objects.equals(empCode, other.empCode)) {
            return false;
        }
        if (!Objects.equals(empName, other.empName)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EmployeeGetView").append('(');
        builder.append("empCode=").append(empCode);
        builder.append(", empName=").append(empName);
        builder.append(')');
        return builder.toString();
    }
}
