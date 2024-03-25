package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.MenuFetcher;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;
import top.yangwulang.platform.entity.sys.RoleFetcher;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Role.dto"
)
public class RoleGetView implements View<Role> {
    public static final ViewMetadata<Role, RoleGetView> METADATA = 
        new ViewMetadata<Role, RoleGetView>(
            RoleFetcher.$
                .status()
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
                .bizScope()
                .menus(TargetOf_menus.METADATA.getFetcher())
                .users(TargetOf_users.METADATA.getFetcher()),
            RoleGetView::new
    );

    private static final DtoPropAccessor MENUS_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] { RoleDraft.Producer.SLOT_MENUS },
        DtoPropAccessor.<Menu, TargetOf_menus>objectListGetter(TargetOf_menus::new),
        DtoPropAccessor.objectListSetter(TargetOf_menus::toEntity)
    );

    private static final DtoPropAccessor USERS_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] { RoleDraft.Producer.SLOT_USERS },
        DtoPropAccessor.<User, TargetOf_users>objectListGetter(TargetOf_users::new),
        DtoPropAccessor.objectListSetter(TargetOf_users::toEntity)
    );

    @NotNull
    private String id;

    @Schema(
            description = "状态"
    )
    private int status;

    @NotNull
    private String createBy;

    @NotNull
    private Date createDate;

    @NotNull
    private String updateBy;

    @NotNull
    private Date updateDate;

    @Nullable
    private String remarks;

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

    @Schema(
            description = "角色拥有的菜单"
    )
    @NotNull
    private List<TargetOf_menus> menus;

    @Schema(
            description = "角色拥有的用户"
    )
    @NotNull
    private List<TargetOf_users> users;

    public RoleGetView() {
    }

    public RoleGetView(@NotNull Role base) {
        this.id = base.id();
        this.status = base.status();
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
        this.menus = MENUS_ACCESSOR.get(base);
        this.users = USERS_ACCESSOR.get(base);
    }

    public static RoleGetView of(@NotNull Role base) {
        return new RoleGetView(base);
    }

    @NotNull
    public String getId() {
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    @Schema(
            description = "状态"
    )
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @NotNull
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(@NotNull String createBy) {
        this.createBy = createBy;
    }

    @NotNull
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(@NotNull Date createDate) {
        this.createDate = createDate;
    }

    @NotNull
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(@NotNull String updateBy) {
        this.updateBy = updateBy;
    }

    @NotNull
    public Date getUpdateDate() {
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

    @NotNull
    @Schema(
            description = "角色拥有的菜单"
    )
    public List<TargetOf_menus> getMenus() {
        return menus;
    }

    public void setMenus(@NotNull List<TargetOf_menus> menus) {
        this.menus = menus;
    }

    @NotNull
    @Schema(
            description = "角色拥有的用户"
    )
    public List<TargetOf_users> getUsers() {
        return users;
    }

    public void setUsers(@NotNull List<TargetOf_users> users) {
        this.users = users;
    }

    @Override
    public Role toEntity() {
        return RoleDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setStatus(status);
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
            MENUS_ACCESSOR.set(__draft, menus != null ? menus : Collections.emptyList());
            USERS_ACCESSOR.set(__draft, users != null ? users : Collections.emptyList());
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Integer.hashCode(status);
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
        hash = hash * 31 + Objects.hashCode(menus);
        hash = hash * 31 + Objects.hashCode(users);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        RoleGetView other = (RoleGetView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (status != other.status) {
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
        if (!Objects.equals(menus, other.menus)) {
            return false;
        }
        if (!Objects.equals(users, other.users)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RoleGetView").append('(');
        builder.append("id=").append(id);
        builder.append(", status=").append(status);
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
        builder.append(", menus=").append(menus);
        builder.append(", users=").append(users);
        builder.append(')');
        return builder.toString();
    }

    public static class TargetOf_menus implements View<Menu> {
        public static final ViewMetadata<Menu, TargetOf_menus> METADATA = 
            new ViewMetadata<Menu, TargetOf_menus>(
                MenuFetcher.$
                    .status()
                    .createBy()
                    .createDate()
                    .updateBy()
                    .updateDate()
                    .remarks()
                    .menuName()
                    .menuType()
                    .menuHref()
                    .menuComponent()
                    .menuTarget()
                    .menuIcon()
                    .menuColor()
                    .menuTitle()
                    .permission()
                    .weight()
                    .isShow()
                    .sysCode(),
                TargetOf_menus::new
        );

        @NotNull
        private String id;

        @Schema(
                description = "状态"
        )
        private int status;

        @NotNull
        private String createBy;

        @NotNull
        private Date createDate;

        @NotNull
        private String updateBy;

        @NotNull
        private Date updateDate;

        @Nullable
        private String remarks;

        @Schema(
                description = "菜单名称"
        )
        @NotNull
        private String menuName;

        @Schema(
                description = "菜单类型（1菜单 2权限 3开发）"
        )
        @NotNull
        private String menuType;

        @Schema(
                description = "链接"
        )
        @Nullable
        private String menuHref;

        @Schema(
                description = "组件地址"
        )
        @Nullable
        private String menuComponent;

        @Schema(
                description = "目标"
        )
        @Nullable
        private String menuTarget;

        @Schema(
                description = "图标"
        )
        @Nullable
        private String menuIcon;

        @Schema(
                description = "颜色"
        )
        @Nullable
        private String menuColor;

        @Schema(
                description = "菜单标题"
        )
        @Nullable
        private String menuTitle;

        @Schema(
                description = "权限标识"
        )
        @Nullable
        private String permission;

        @Schema(
                description = "菜单权重"
        )
        @Nullable
        private BigDecimal weight;

        @Schema(
                description = "是否显示"
        )
        @Nullable
        private Boolean isShow;

        @Schema(
                description = "归属系统（default:主导航菜单、mobileApp:APP菜单）"
        )
        @Nullable
        private String sysCode;

        public TargetOf_menus() {
        }

        public TargetOf_menus(@NotNull Menu base) {
            this.id = base.id();
            this.status = base.status();
            this.createBy = base.createBy();
            this.createDate = base.createDate();
            this.updateBy = base.updateBy();
            this.updateDate = base.updateDate();
            this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
            this.menuName = base.menuName();
            this.menuType = base.menuType();
            this.menuHref = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_HREF)) ? base.menuHref() : null;
            this.menuComponent = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_COMPONENT)) ? base.menuComponent() : null;
            this.menuTarget = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_TARGET)) ? base.menuTarget() : null;
            this.menuIcon = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_ICON)) ? base.menuIcon() : null;
            this.menuColor = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_COLOR)) ? base.menuColor() : null;
            this.menuTitle = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_TITLE)) ? base.menuTitle() : null;
            this.permission = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PERMISSION)) ? base.permission() : null;
            this.weight = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_WEIGHT)) ? base.weight() : null;
            this.isShow = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_IS_SHOW)) ? base.isShow() : null;
            this.sysCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_SYS_CODE)) ? base.sysCode() : null;
        }

        public static TargetOf_menus of(@NotNull Menu base) {
            return new TargetOf_menus(base);
        }

        @NotNull
        public String getId() {
            return id;
        }

        public void setId(@NotNull String id) {
            this.id = id;
        }

        @Schema(
                description = "状态"
        )
        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        @NotNull
        public String getCreateBy() {
            return createBy;
        }

        public void setCreateBy(@NotNull String createBy) {
            this.createBy = createBy;
        }

        @NotNull
        public Date getCreateDate() {
            return createDate;
        }

        public void setCreateDate(@NotNull Date createDate) {
            this.createDate = createDate;
        }

        @NotNull
        public String getUpdateBy() {
            return updateBy;
        }

        public void setUpdateBy(@NotNull String updateBy) {
            this.updateBy = updateBy;
        }

        @NotNull
        public Date getUpdateDate() {
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
                description = "菜单名称"
        )
        public String getMenuName() {
            return menuName;
        }

        public void setMenuName(@NotNull String menuName) {
            this.menuName = menuName;
        }

        @NotNull
        @Schema(
                description = "菜单类型（1菜单 2权限 3开发）"
        )
        public String getMenuType() {
            return menuType;
        }

        public void setMenuType(@NotNull String menuType) {
            this.menuType = menuType;
        }

        @Nullable
        @Schema(
                description = "链接"
        )
        public String getMenuHref() {
            return menuHref;
        }

        public void setMenuHref(@Nullable String menuHref) {
            this.menuHref = menuHref;
        }

        @Nullable
        @Schema(
                description = "组件地址"
        )
        public String getMenuComponent() {
            return menuComponent;
        }

        public void setMenuComponent(@Nullable String menuComponent) {
            this.menuComponent = menuComponent;
        }

        @Nullable
        @Schema(
                description = "目标"
        )
        public String getMenuTarget() {
            return menuTarget;
        }

        public void setMenuTarget(@Nullable String menuTarget) {
            this.menuTarget = menuTarget;
        }

        @Nullable
        @Schema(
                description = "图标"
        )
        public String getMenuIcon() {
            return menuIcon;
        }

        public void setMenuIcon(@Nullable String menuIcon) {
            this.menuIcon = menuIcon;
        }

        @Nullable
        @Schema(
                description = "颜色"
        )
        public String getMenuColor() {
            return menuColor;
        }

        public void setMenuColor(@Nullable String menuColor) {
            this.menuColor = menuColor;
        }

        @Nullable
        @Schema(
                description = "菜单标题"
        )
        public String getMenuTitle() {
            return menuTitle;
        }

        public void setMenuTitle(@Nullable String menuTitle) {
            this.menuTitle = menuTitle;
        }

        @Nullable
        @Schema(
                description = "权限标识"
        )
        public String getPermission() {
            return permission;
        }

        public void setPermission(@Nullable String permission) {
            this.permission = permission;
        }

        @Nullable
        @Schema(
                description = "菜单权重"
        )
        public BigDecimal getWeight() {
            return weight;
        }

        public void setWeight(@Nullable BigDecimal weight) {
            this.weight = weight;
        }

        @Nullable
        @Schema(
                description = "是否显示"
        )
        public Boolean getIsShow() {
            return isShow;
        }

        public void setIsShow(@Nullable Boolean isShow) {
            this.isShow = isShow;
        }

        @Nullable
        @Schema(
                description = "归属系统（default:主导航菜单、mobileApp:APP菜单）"
        )
        public String getSysCode() {
            return sysCode;
        }

        public void setSysCode(@Nullable String sysCode) {
            this.sysCode = sysCode;
        }

        @Override
        public Menu toEntity() {
            return MenuDraft.$.produce(__draft -> {
                __draft.setId(id);
                __draft.setStatus(status);
                __draft.setCreateBy(createBy);
                __draft.setCreateDate(createDate);
                __draft.setUpdateBy(updateBy);
                __draft.setUpdateDate(updateDate);
                __draft.setRemarks(remarks);
                __draft.setMenuName(menuName);
                __draft.setMenuType(menuType);
                __draft.setMenuHref(menuHref);
                __draft.setMenuComponent(menuComponent);
                __draft.setMenuTarget(menuTarget);
                __draft.setMenuIcon(menuIcon);
                __draft.setMenuColor(menuColor);
                __draft.setMenuTitle(menuTitle);
                __draft.setPermission(permission);
                __draft.setWeight(weight);
                __draft.setIsShow(isShow);
                __draft.setSysCode(sysCode);
            });
        }

        @Override
        public int hashCode() {
            int hash = Objects.hashCode(id);
            hash = hash * 31 + Integer.hashCode(status);
            hash = hash * 31 + Objects.hashCode(createBy);
            hash = hash * 31 + Objects.hashCode(createDate);
            hash = hash * 31 + Objects.hashCode(updateBy);
            hash = hash * 31 + Objects.hashCode(updateDate);
            hash = hash * 31 + Objects.hashCode(remarks);
            hash = hash * 31 + Objects.hashCode(menuName);
            hash = hash * 31 + Objects.hashCode(menuType);
            hash = hash * 31 + Objects.hashCode(menuHref);
            hash = hash * 31 + Objects.hashCode(menuComponent);
            hash = hash * 31 + Objects.hashCode(menuTarget);
            hash = hash * 31 + Objects.hashCode(menuIcon);
            hash = hash * 31 + Objects.hashCode(menuColor);
            hash = hash * 31 + Objects.hashCode(menuTitle);
            hash = hash * 31 + Objects.hashCode(permission);
            hash = hash * 31 + Objects.hashCode(weight);
            hash = hash * 31 + Objects.hashCode(isShow);
            hash = hash * 31 + Objects.hashCode(sysCode);
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            TargetOf_menus other = (TargetOf_menus) o;
            if (!Objects.equals(id, other.id)) {
                return false;
            }
            if (status != other.status) {
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
            if (!Objects.equals(menuName, other.menuName)) {
                return false;
            }
            if (!Objects.equals(menuType, other.menuType)) {
                return false;
            }
            if (!Objects.equals(menuHref, other.menuHref)) {
                return false;
            }
            if (!Objects.equals(menuComponent, other.menuComponent)) {
                return false;
            }
            if (!Objects.equals(menuTarget, other.menuTarget)) {
                return false;
            }
            if (!Objects.equals(menuIcon, other.menuIcon)) {
                return false;
            }
            if (!Objects.equals(menuColor, other.menuColor)) {
                return false;
            }
            if (!Objects.equals(menuTitle, other.menuTitle)) {
                return false;
            }
            if (!Objects.equals(permission, other.permission)) {
                return false;
            }
            if (!Objects.equals(weight, other.weight)) {
                return false;
            }
            if (!Objects.equals(isShow, other.isShow)) {
                return false;
            }
            if (!Objects.equals(sysCode, other.sysCode)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("RoleGetView").append('.');
            builder.append("TargetOf_menus").append('(');
            builder.append("id=").append(id);
            builder.append(", status=").append(status);
            builder.append(", createBy=").append(createBy);
            builder.append(", createDate=").append(createDate);
            builder.append(", updateBy=").append(updateBy);
            builder.append(", updateDate=").append(updateDate);
            builder.append(", remarks=").append(remarks);
            builder.append(", menuName=").append(menuName);
            builder.append(", menuType=").append(menuType);
            builder.append(", menuHref=").append(menuHref);
            builder.append(", menuComponent=").append(menuComponent);
            builder.append(", menuTarget=").append(menuTarget);
            builder.append(", menuIcon=").append(menuIcon);
            builder.append(", menuColor=").append(menuColor);
            builder.append(", menuTitle=").append(menuTitle);
            builder.append(", permission=").append(permission);
            builder.append(", weight=").append(weight);
            builder.append(", isShow=").append(isShow);
            builder.append(", sysCode=").append(sysCode);
            builder.append(')');
            return builder.toString();
        }
    }

    public static class TargetOf_users implements View<User> {
        public static final ViewMetadata<User, TargetOf_users> METADATA = 
            new ViewMetadata<User, TargetOf_users>(
                UserFetcher.$
                    .userName()
                    .userType()
                    .avatar()
                    .loginCode()
                    .email()
                    .sex(),
                TargetOf_users::new
        );

        @Schema(
                description = "用户编码"
        )
        @NotNull
        private String userCode;

        @Schema(
                description = "用户名"
        )
        @Nullable
        private String userName;

        @Schema(
                description = "用户类型"
        )
        @Nullable
        private String userType;

        @Schema(
                description = "头像地址"
        )
        @Nullable
        private String avatar;

        @Schema(
                description = "登录编码(账号)"
        )
        @Nullable
        private String loginCode;

        @Schema(
                description = "邮件"
        )
        @Nullable
        private String email;

        @Schema(
                description = "性别"
        )
        @Nullable
        private String sex;

        public TargetOf_users() {
        }

        public TargetOf_users(@NotNull User base) {
            this.userCode = base.userCode();
            this.userName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_USER_NAME)) ? base.userName() : null;
            this.userType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_USER_TYPE)) ? base.userType() : null;
            this.avatar = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_AVATAR)) ? base.avatar() : null;
            this.loginCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_LOGIN_CODE)) ? base.loginCode() : null;
            this.email = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_EMAIL)) ? base.email() : null;
            this.sex = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_SEX)) ? base.sex() : null;
        }

        public static TargetOf_users of(@NotNull User base) {
            return new TargetOf_users(base);
        }

        @NotNull
        @Schema(
                description = "用户编码"
        )
        public String getUserCode() {
            return userCode;
        }

        public void setUserCode(@NotNull String userCode) {
            this.userCode = userCode;
        }

        @Nullable
        @Schema(
                description = "用户名"
        )
        public String getUserName() {
            return userName;
        }

        public void setUserName(@Nullable String userName) {
            this.userName = userName;
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
                description = "头像地址"
        )
        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(@Nullable String avatar) {
            this.avatar = avatar;
        }

        @Nullable
        @Schema(
                description = "登录编码(账号)"
        )
        public String getLoginCode() {
            return loginCode;
        }

        public void setLoginCode(@Nullable String loginCode) {
            this.loginCode = loginCode;
        }

        @Nullable
        @Schema(
                description = "邮件"
        )
        public String getEmail() {
            return email;
        }

        public void setEmail(@Nullable String email) {
            this.email = email;
        }

        @Nullable
        @Schema(
                description = "性别"
        )
        public String getSex() {
            return sex;
        }

        public void setSex(@Nullable String sex) {
            this.sex = sex;
        }

        @Override
        public User toEntity() {
            return UserDraft.$.produce(__draft -> {
                __draft.setUserCode(userCode);
                __draft.setUserName(userName);
                __draft.setUserType(userType);
                __draft.setAvatar(avatar);
                __draft.setLoginCode(loginCode);
                __draft.setEmail(email);
                __draft.setSex(sex);
            });
        }

        @Override
        public int hashCode() {
            int hash = Objects.hashCode(userCode);
            hash = hash * 31 + Objects.hashCode(userName);
            hash = hash * 31 + Objects.hashCode(userType);
            hash = hash * 31 + Objects.hashCode(avatar);
            hash = hash * 31 + Objects.hashCode(loginCode);
            hash = hash * 31 + Objects.hashCode(email);
            hash = hash * 31 + Objects.hashCode(sex);
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            TargetOf_users other = (TargetOf_users) o;
            if (!Objects.equals(userCode, other.userCode)) {
                return false;
            }
            if (!Objects.equals(userName, other.userName)) {
                return false;
            }
            if (!Objects.equals(userType, other.userType)) {
                return false;
            }
            if (!Objects.equals(avatar, other.avatar)) {
                return false;
            }
            if (!Objects.equals(loginCode, other.loginCode)) {
                return false;
            }
            if (!Objects.equals(email, other.email)) {
                return false;
            }
            if (!Objects.equals(sex, other.sex)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("RoleGetView").append('.');
            builder.append("TargetOf_users").append('(');
            builder.append("userCode=").append(userCode);
            builder.append(", userName=").append(userName);
            builder.append(", userType=").append(userType);
            builder.append(", avatar=").append(avatar);
            builder.append(", loginCode=").append(loginCode);
            builder.append(", email=").append(email);
            builder.append(", sex=").append(sex);
            builder.append(')');
            return builder.toString();
        }
    }
}
