package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
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
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;
import top.yangwulang.platform.entity.sys.RoleFetcher;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Role.dto"
)
public class RoleListInput implements ViewableInput<Role> {
    public static final ViewMetadata<Role, RoleListInput> METADATA = 
        new ViewMetadata<Role, RoleListInput>(
            RoleFetcher.$
                .roleName()
                .roleType()
                .userType(),
            RoleListInput::new
    );

    private static final DtoPropAccessor ROLE_NAME_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { RoleDraft.Producer.SLOT_ROLE_NAME }
    );

    @Schema(
            description = "角色名称"
    )
    @Nullable
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

    public RoleListInput(@NotNull Role base) {
        this.roleName = ROLE_NAME_ACCESSOR.get(base);
        this.roleType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_ROLE_TYPE)) ? base.roleType() : null;
        this.userType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_USER_TYPE)) ? base.userType() : null;
    }

    public static RoleListInput of(@NotNull Role base) {
        return new RoleListInput(base);
    }

    @Nullable
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(@Nullable String roleName) {
        this.roleName = roleName;
    }

    @Nullable
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(@Nullable String roleType) {
        this.roleType = roleType;
    }

    @Nullable
    public String getUserType() {
        return userType;
    }

    public void setUserType(@Nullable String userType) {
        this.userType = userType;
    }

    @Override
    public Role toEntity() {
        return RoleDraft.$.produce(__draft -> {
            ROLE_NAME_ACCESSOR.set(__draft, roleName);
            __draft.setRoleType(roleType);
            __draft.setUserType(userType);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(roleName);
        hash = hash * 31 + Objects.hashCode(roleType);
        hash = hash * 31 + Objects.hashCode(userType);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        RoleListInput other = (RoleListInput) o;
        if (!Objects.equals(roleName, other.roleName)) {
            return false;
        }
        if (!Objects.equals(roleType, other.roleType)) {
            return false;
        }
        if (!Objects.equals(userType, other.userType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RoleListInput").append('(');
        builder.append("roleName=").append(roleName);
        builder.append(", roleType=").append(roleType);
        builder.append(", userType=").append(userType);
        builder.append(')');
        return builder.toString();
    }
}
