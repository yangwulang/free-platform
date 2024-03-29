package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;
import top.yangwulang.platform.entity.sys.RoleFetcher;

/**
 *  角色表
 *
 *  @author yangwulang
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Role.dto"
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

    @Schema(
            description = "角色编码"
    )
    @NotNull
    private String roleCode;

    @Schema(
            description = "角色名称"
    )
    @NotNull
    private String roleName;

    @Schema(
            description = "角色类型"
    )
    @Nullable
    private String roleType;

    @Schema(
            description = "角色排序"
    )
    @Nullable
    private BigDecimal roleSort;

    @Schema(
            description = "系统内置 1是 0否"
    )
    @Nullable
    private Boolean isSys;

    @Schema(
            description = "用户类型"
    )
    @Nullable
    private String userType;

    @Schema(
            description = "数据范围设置"
    )
    @Nullable
    private String dataScope;

    @Schema(
            description = "适应业务范围"
    )
    @Nullable
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

    public static RoleSaveInput of(@NotNull Role base) {
        return new RoleSaveInput(base);
    }

    /**
     * 角色编码
     */
    @NotNull
    @Schema(
            description = "角色编码"
    )
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(@NotNull String roleCode) {
        this.roleCode = roleCode;
    }

    /**
     * 角色名称
     */
    @NotNull
    @Schema(
            description = "角色名称"
    )
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(@NotNull String roleName) {
        this.roleName = roleName;
    }

    /**
     * 角色分类（高管、中层、基层、其它）
     */
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

    /**
     * 角色排序（升序）
     */
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

    /**
     * 系统内置（1是 0否）
     */
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

    /**
     * 用户类型（employee员工 member会员）
     */
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

    /**
     * 数据范围设置（0未设置  1全部数据 2自定义数据）
     */
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

    /**
     * 适应业务范围（不同的功能，不同的数据权限支持）
     */
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
}
