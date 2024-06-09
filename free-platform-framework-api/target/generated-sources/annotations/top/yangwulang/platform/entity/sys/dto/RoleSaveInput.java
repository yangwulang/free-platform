package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.internal.FixedInputField;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;
import top.yangwulang.platform.entity.sys.RoleFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Role.dto"
)
@JsonDeserialize(
        builder = RoleSaveInput.Builder.class
)
@Schema(
        description = "角色"
)
public class RoleSaveInput implements Input<Role> {
    public static final ViewMetadata<Role, RoleSaveInput> METADATA = 
        new ViewMetadata<Role, RoleSaveInput>(
            RoleFetcher.$
                .roleCode()
                .roleName()
                .roleType()
                .roleSort()
                .isSys()
                .userType()
                .dataScope()
                .bizScope(),
            RoleSaveInput::new
    );

    @FixedInputField
    private String roleCode;

    @FixedInputField
    private String roleName;

    private String roleType;

    private BigDecimal roleSort;

    private Boolean isSys;

    private String userType;

    private String dataScope;

    private String bizScope;

    public RoleSaveInput() {
    }

    public RoleSaveInput(@NotNull Role base) {
        this.roleCode = base.roleCode();
        this.roleName = base.roleName();
        this.roleType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_ROLE_TYPE)) ? base.roleType() : null;
        this.roleSort = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_ROLE_SORT)) ? base.roleSort() : null;
        this.isSys = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_IS_SYS)) ? base.isSys() : null;
        this.userType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_USER_TYPE)) ? base.userType() : null;
        this.dataScope = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_DATA_SCOPE)) ? base.dataScope() : null;
        this.bizScope = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_BIZ_SCOPE)) ? base.bizScope() : null;
    }

    @NotNull
    @Schema(
            description = "角色编码"
    )
    public String getRoleCode() {
        if (roleCode == null) {
            throw new IllegalStateException("The property \"roleCode\" is not specified");
        }
        return roleCode;
    }

    public void setRoleCode(@NotNull String roleCode) {
        this.roleCode = roleCode;
    }

    @NotNull
    @Schema(
            description = "角色名称"
    )
    public String getRoleName() {
        if (roleName == null) {
            throw new IllegalStateException("The property \"roleName\" is not specified");
        }
        return roleName;
    }

    public void setRoleName(@NotNull String roleName) {
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
            description = "角色排序"
    )
    public BigDecimal getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(@Nullable BigDecimal roleSort) {
        this.roleSort = roleSort;
    }

    @Nullable
    @Schema(
            description = "系统内置 1是 0否"
    )
    public Boolean getIsSys() {
        return isSys;
    }

    public void setIsSys(@Nullable Boolean isSys) {
        this.isSys = isSys;
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

    @Nullable
    @Schema(
            description = "数据范围设置"
    )
    public String getDataScope() {
        return dataScope;
    }

    public void setDataScope(@Nullable String dataScope) {
        this.dataScope = dataScope;
    }

    @Nullable
    @Schema(
            description = "适应业务范围"
    )
    public String getBizScope() {
        return bizScope;
    }

    public void setBizScope(@Nullable String bizScope) {
        this.bizScope = bizScope;
    }

    @Override
    public Role toEntity() {
        return RoleDraft.$.produce(__draft -> {
            __draft.setRoleCode(roleCode);
            __draft.setRoleName(roleName);
            __draft.setRoleType(roleType);
            __draft.setRoleSort(roleSort);
            __draft.setIsSys(isSys);
            __draft.setUserType(userType);
            __draft.setDataScope(dataScope);
            __draft.setBizScope(bizScope);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(roleCode);
        hash = hash * 31 + Objects.hashCode(roleName);
        hash = hash * 31 + Objects.hashCode(roleType);
        hash = hash * 31 + Objects.hashCode(roleSort);
        hash = hash * 31 + Objects.hashCode(isSys);
        hash = hash * 31 + Objects.hashCode(userType);
        hash = hash * 31 + Objects.hashCode(dataScope);
        hash = hash * 31 + Objects.hashCode(bizScope);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        RoleSaveInput other = (RoleSaveInput) o;
        if (!Objects.equals(roleCode, other.roleCode)) {
            return false;
        }
        if (!Objects.equals(roleName, other.roleName)) {
            return false;
        }
        if (!Objects.equals(roleType, other.roleType)) {
            return false;
        }
        if (!Objects.equals(roleSort, other.roleSort)) {
            return false;
        }
        if (!Objects.equals(isSys, other.isSys)) {
            return false;
        }
        if (!Objects.equals(userType, other.userType)) {
            return false;
        }
        if (!Objects.equals(dataScope, other.dataScope)) {
            return false;
        }
        if (!Objects.equals(bizScope, other.bizScope)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RoleSaveInput").append('(');
        builder.append("roleCode=").append(roleCode);
        builder.append(", roleName=").append(roleName);
        builder.append(", roleType=").append(roleType);
        builder.append(", roleSort=").append(roleSort);
        builder.append(", isSys=").append(isSys);
        builder.append(", userType=").append(userType);
        builder.append(", dataScope=").append(dataScope);
        builder.append(", bizScope=").append(bizScope);
        builder.append(')');
        return builder.toString();
    }

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String roleCode;

        private String roleName;

        private String roleType;

        private BigDecimal roleSort;

        private Boolean isSys;

        private String userType;

        private String dataScope;

        private String bizScope;

        public Builder roleCode(String roleCode) {
            this.roleCode = Objects.requireNonNull(roleCode, "The property \"roleCode\" cannot be null");
            return this;
        }

        public Builder roleName(String roleName) {
            this.roleName = Objects.requireNonNull(roleName, "The property \"roleName\" cannot be null");
            return this;
        }

        public Builder roleType(String roleType) {
            this.roleType = roleType;
            return this;
        }

        public Builder roleSort(BigDecimal roleSort) {
            this.roleSort = roleSort;
            return this;
        }

        public Builder isSys(Boolean isSys) {
            this.isSys = isSys;
            return this;
        }

        public Builder userType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder dataScope(String dataScope) {
            this.dataScope = dataScope;
            return this;
        }

        public Builder bizScope(String bizScope) {
            this.bizScope = bizScope;
            return this;
        }

        public RoleSaveInput build() {
            RoleSaveInput _input = new RoleSaveInput();
            if (roleCode == null) {
                throw Input.unknownNonNullProperty(RoleSaveInput.class, "roleCode");
            }
            _input.setRoleCode(roleCode);
            if (roleName == null) {
                throw Input.unknownNonNullProperty(RoleSaveInput.class, "roleName");
            }
            _input.setRoleName(roleName);
            _input.setRoleType(roleType);
            _input.setRoleSort(roleSort);
            _input.setIsSys(isSys);
            _input.setUserType(userType);
            _input.setDataScope(dataScope);
            _input.setBizScope(bizScope);
            return _input;
        }
    }
}
