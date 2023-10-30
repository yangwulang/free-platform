package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.Input;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Role.dto"
)
@Data
public class RoleListInput implements Input<Role> {
    @Schema(
            description = "角色名称"
    )
    @NotNull
    private String roleName;

    @Schema(
            description = "角色类型"
    )
    @Null
    private String roleType;

    @Schema(
            description = "用户类型"
    )
    @Null
    private String userType;

    public RoleListInput() {
    }

    @Override
    public Role toEntity() {
        return RoleDraft.$.produce(draft -> {
            draft.setRoleName(roleName);
            draft.setRoleType(roleType);
            draft.setUserType(userType);
        });
    }
}
