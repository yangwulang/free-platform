package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;
import top.yangwulang.platform.entity.sys.RoleFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Role.dto"
)
@Schema(
        description = "角色"
)
public class RoleListView implements View<Role> {
    public static final DtoMetadata<Role, RoleListView> METADATA = 
        new DtoMetadata<Role, RoleListView>(
            RoleFetcher.$
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .roleCode()
                .roleName()
                .roleType()
                .roleSort()
                .isSys()
                .userType()
                .dataScope()
                .bizScope(),
            RoleListView::new
    );

    private String id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String roleCode;

    private String roleName;

    private String roleType;

    private BigDecimal roleSort;

    private Boolean isSys;

    private String userType;

    private String dataScope;

    private String bizScope;

    public RoleListView() {
    }

    public RoleListView(@NotNull Role base) {
        this.id = base.id();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
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
    public String getId() {
        if (id == null) {
            throw new IllegalStateException("The property \"id\" is not specified");
        }
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    @NotNull
    public String getCreateBy() {
        if (createBy == null) {
            throw new IllegalStateException("The property \"createBy\" is not specified");
        }
        return createBy;
    }

    public void setCreateBy(@NotNull String createBy) {
        this.createBy = createBy;
    }

    @NotNull
    public Date getCreateDate() {
        if (createDate == null) {
            throw new IllegalStateException("The property \"createDate\" is not specified");
        }
        return createDate;
    }

    public void setCreateDate(@NotNull Date createDate) {
        this.createDate = createDate;
    }

    @NotNull
    public String getUpdateBy() {
        if (updateBy == null) {
            throw new IllegalStateException("The property \"updateBy\" is not specified");
        }
        return updateBy;
    }

    public void setUpdateBy(@NotNull String updateBy) {
        this.updateBy = updateBy;
    }

    @NotNull
    public Date getUpdateDate() {
        if (updateDate == null) {
            throw new IllegalStateException("The property \"updateDate\" is not specified");
        }
        return updateDate;
    }

    public void setUpdateDate(@NotNull Date updateDate) {
        this.updateDate = updateDate;
    }

    @Nullable
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(@Nullable String remarks) {
        this.remarks = remarks;
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
            __draft.setId(id);
            __draft.setCreateBy(createBy);
            __draft.setCreateDate(createDate);
            __draft.setUpdateBy(updateBy);
            __draft.setUpdateDate(updateDate);
            __draft.setRemarks(remarks);
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
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(createBy);
        hash = hash * 31 + Objects.hashCode(createDate);
        hash = hash * 31 + Objects.hashCode(updateBy);
        hash = hash * 31 + Objects.hashCode(updateDate);
        hash = hash * 31 + Objects.hashCode(remarks);
        hash = hash * 31 + Objects.hashCode(roleCode);
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
        RoleListView other = (RoleListView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(createBy, other.createBy)) {
            return false;
        }
        if (!Objects.equals(createDate, other.createDate)) {
            return false;
        }
        if (!Objects.equals(updateBy, other.updateBy)) {
            return false;
        }
        if (!Objects.equals(updateDate, other.updateDate)) {
            return false;
        }
        if (!Objects.equals(remarks, other.remarks)) {
            return false;
        }
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
        builder.append("RoleListView").append('(');
        builder.append("id=").append(id);
        builder.append(", createBy=").append(createBy);
        builder.append(", createDate=").append(createDate);
        builder.append(", updateBy=").append(updateBy);
        builder.append(", updateDate=").append(updateDate);
        builder.append(", remarks=").append(remarks);
        builder.append(", roleCode=").append(roleCode);
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
