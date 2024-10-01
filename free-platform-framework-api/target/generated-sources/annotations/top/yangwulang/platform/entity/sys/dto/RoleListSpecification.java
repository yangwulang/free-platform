package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Class;
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
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleProps;
import top.yangwulang.platform.entity.sys.RoleTable;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Role.dto"
)
@Schema(
        description = "角色"
)
public class RoleListSpecification implements JSpecification<Role, RoleTable> {
    private String roleName;

    private String roleType;

    private String userType;

    public RoleListSpecification() {
    }

    @Nullable
    @Schema(
            description = "角色名称"
    )
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(@Nullable String roleName) {
        this.roleName = roleName;
    }

    @Nullable
    @Schema(
            description = "角色类型"
    )
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(@Nullable String roleType) {
        this.roleType = roleType;
    }

    @Nullable
    @Schema(
            description = "用户类型"
    )
    public String getUserType() {
        return userType;
    }

    public void setUserType(@Nullable String userType) {
        this.userType = userType;
    }

    @Override
    public Class<Role> entityType() {
        return Role.class;
    }

    @Override
    public void applyTo(SpecificationArgs<Role, RoleTable> args) {
        PredicateApplier __applier = args.getApplier();
        __applier.like(new ImmutableProp[] { RoleProps.ROLE_NAME.unwrap() }, this.roleName, false, false, false);
        __applier.eq(new ImmutableProp[] { RoleProps.ROLE_TYPE.unwrap() }, this.roleType);
        __applier.eq(new ImmutableProp[] { RoleProps.USER_TYPE.unwrap() }, this.userType);
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
        RoleListSpecification other = (RoleListSpecification) o;
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
        builder.append("RoleListSpecification").append('(');
        builder.append("roleName=").append(roleName);
        builder.append(", roleType=").append(roleType);
        builder.append(", userType=").append(userType);
        builder.append(')');
        return builder.toString();
    }
}
