package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.impl.util.FlatUtils;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Employee;
import top.yangwulang.platform.entity.sys.EmployeeDraft;
import top.yangwulang.platform.entity.sys.EmployeeFetcher;
import top.yangwulang.platform.entity.sys.EmployeeProps;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Employee.dto"
)
@Data
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
        ImmutableSpi spi = (ImmutableSpi)base;
        this.empCode = base.empCode();
        this.empName = spi.__isLoaded(EmployeeProps.EMP_NAME.unwrap().getId()) ? base.empName() : null;
        this.loginCode = FlatUtils.get(
            spi,
            new int[] {
                EmployeeDraft.Producer.SLOT_USER,
                UserDraft.Producer.SLOT_LOGIN_CODE
            },
            null
        );
        this.userName = FlatUtils.get(
            spi,
            new int[] {
                EmployeeDraft.Producer.SLOT_USER,
                UserDraft.Producer.SLOT_USER_NAME
            },
            null
        );
        this.email = FlatUtils.get(
            spi,
            new int[] {
                EmployeeDraft.Producer.SLOT_USER,
                UserDraft.Producer.SLOT_EMAIL
            },
            null
        );
        this.mobile = FlatUtils.get(
            spi,
            new int[] {
                EmployeeDraft.Producer.SLOT_USER,
                UserDraft.Producer.SLOT_MOBILE
            },
            null
        );
        this.avatar = FlatUtils.get(
            spi,
            new int[] {
                EmployeeDraft.Producer.SLOT_USER,
                UserDraft.Producer.SLOT_AVATAR
            },
            null
        );
        this.status = FlatUtils.get(
            spi,
            new int[] {
                EmployeeDraft.Producer.SLOT_USER,
                UserDraft.Producer.SLOT_STATUS
            },
            null
        );
    }

    public static EmployeeListView of(@NotNull Employee base) {
        return new EmployeeListView(base);
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
                    UserDraft.Producer.SLOT_LOGIN_CODE
                },
                this.loginCode
            );
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
                    UserDraft.Producer.SLOT_MOBILE
                },
                this.mobile
            );
            FlatUtils.set(
                draft,
                new int[] {
                    EmployeeDraft.Producer.SLOT_USER,
                    UserDraft.Producer.SLOT_AVATAR
                },
                this.avatar
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
