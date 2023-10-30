package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.FlatUtils;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.sys.Employee;
import top.yangwulang.platform.entity.sys.EmployeeDraft;
import top.yangwulang.platform.entity.sys.UserDraft;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Employee.dto"
)
@Data
public class EmployeeListInput implements Input<Employee> {
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

    @Override
    public Employee toEntity() {
        return EmployeeDraft.$.produce(draft -> {
            draft.setEmpCode(empCode);
            draft.setEmpName(empName);
            FlatUtils.set(
                draft,
                new int[] {
                    EmployeeDraft.Producer.SLOT_USER,
                    UserDraft.Producer.SLOT_USER_NAME
                },
                this.userName
            );
            FlatUtils.set(
                draft,
                new int[] {
                    EmployeeDraft.Producer.SLOT_USER,
                    UserDraft.Producer.SLOT_EMAIL
                },
                this.email
            );
            FlatUtils.set(
                draft,
                new int[] {
                    EmployeeDraft.Producer.SLOT_USER,
                    UserDraft.Producer.SLOT_STATUS
                },
                this.status
            );
        });
    }
}
