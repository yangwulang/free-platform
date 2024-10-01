package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
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
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.MenuFetcher;
import top.yangwulang.platform.entity.sys.Meta;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;
import top.yangwulang.platform.entity.sys.RoleFetcher;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/User.dto"
)
@Schema(
        description = "用户实体"
)
public class UserRoleMenuView implements View<User> {
    public static final DtoMetadata<User, UserRoleMenuView> METADATA = 
        new DtoMetadata<User, UserRoleMenuView>(
            UserFetcher.$
                .roles(TargetOf_roles.METADATA.getFetcher()),
            UserRoleMenuView::new
    );

    private static final DtoPropAccessor ROLES_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] { UserDraft.Producer.SLOT_ROLES },
        DtoPropAccessor.<Role, TargetOf_roles>objectListGetter(TargetOf_roles::new),
        DtoPropAccessor.objectListSetter(TargetOf_roles::toEntity)
    );

    private List<TargetOf_roles> roles;

    public UserRoleMenuView() {
    }

    public UserRoleMenuView(@NotNull User base) {
        this.roles = ROLES_ACCESSOR.get(base);
    }

    @NotNull
    public List<TargetOf_roles> getRoles() {
        if (roles == null) {
            throw new IllegalStateException("The property \"roles\" is not specified");
        }
        return roles;
    }

    public void setRoles(@NotNull List<TargetOf_roles> roles) {
        this.roles = roles;
    }

    @Override
    public User toEntity() {
        return UserDraft.$.produce(__draft -> {
            ROLES_ACCESSOR.set(__draft, roles != null ? roles : Collections.emptyList());
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(roles);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        UserRoleMenuView other = (UserRoleMenuView) o;
        if (!Objects.equals(roles, other.roles)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserRoleMenuView").append('(');
        builder.append("roles=").append(roles);
        builder.append(')');
        return builder.toString();
    }

    @GeneratedBy
    @Schema(
            description = "角色"
    )
    public static class TargetOf_roles implements View<Role> {
        public static final DtoMetadata<Role, TargetOf_roles> METADATA = 
            new DtoMetadata<Role, TargetOf_roles>(
                RoleFetcher.$
                    .menus(TargetOf_menus.METADATA.getFetcher()),
                TargetOf_roles::new
        );

        private static final DtoPropAccessor MENUS_ACCESSOR = new DtoPropAccessor(
            true,
            new int[] { RoleDraft.Producer.SLOT_MENUS },
            DtoPropAccessor.<Menu, TargetOf_menus>objectListGetter(TargetOf_menus::new),
            DtoPropAccessor.objectListSetter(TargetOf_menus::toEntity)
        );

        private List<TargetOf_menus> menus;

        public TargetOf_roles() {
        }

        public TargetOf_roles(@NotNull Role base) {
            this.menus = MENUS_ACCESSOR.get(base);
        }

        @NotNull
        @Schema(
                description = "角色拥有的菜单"
        )
        public List<TargetOf_menus> getMenus() {
            if (menus == null) {
                throw new IllegalStateException("The property \"menus\" is not specified");
            }
            return menus;
        }

        public void setMenus(@NotNull List<TargetOf_menus> menus) {
            this.menus = menus;
        }

        @Override
        public Role toEntity() {
            return RoleDraft.$.produce(__draft -> {
                MENUS_ACCESSOR.set(__draft, menus != null ? menus : Collections.emptyList());
            });
        }

        @Override
        public int hashCode() {
            int hash = Objects.hashCode(menus);
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            TargetOf_roles other = (TargetOf_roles) o;
            if (!Objects.equals(menus, other.menus)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("UserRoleMenuView.TargetOf_roles").append('(');
            builder.append("menus=").append(menus);
            builder.append(')');
            return builder.toString();
        }

        /**
         * 菜单表
         *
         */
        @GeneratedBy
        @Schema(
                description = "菜单实体"
        )
        public static class TargetOf_menus implements View<Menu> {
            public static final DtoMetadata<Menu, TargetOf_menus> METADATA = 
                new DtoMetadata<Menu, TargetOf_menus>(
                    MenuFetcher.$
                        .createBy()
                        .createDate()
                        .updateBy()
                        .updateDate()
                        .remarks()
                        .meta()
                        .menuName()
                        .menuPath()
                        .redirect()
                        .menuType()
                        .menuComponent()
                        .menuTarget()
                        .permission()
                        .weight()
                        .sysCode()
                        .recursiveChildren(),
                    TargetOf_menus::new
            );

            private static final DtoPropAccessor CHILDREN_ACCESSOR = new DtoPropAccessor(
                false,
                new int[] { MenuDraft.Producer.SLOT_CHILDREN },
                DtoPropAccessor.<Menu, TargetOf_menus>objectListGetter(TargetOf_menus::new),
                DtoPropAccessor.objectListSetter(TargetOf_menus::toEntity)
            );

            private String id;

            private String createBy;

            private Date createDate;

            private String updateBy;

            private Date updateDate;

            private String remarks;

            private Meta meta;

            private String menuName;

            private String menuPath;

            private String redirect;

            private String menuType;

            private String menuComponent;

            private String menuTarget;

            private String permission;

            private BigDecimal weight;

            private String sysCode;

            private List<TargetOf_menus> children;

            public TargetOf_menus() {
            }

            public TargetOf_menus(@NotNull Menu base) {
                this.id = base.id();
                this.createBy = base.createBy();
                this.createDate = base.createDate();
                this.updateBy = base.updateBy();
                this.updateDate = base.updateDate();
                this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
                this.meta = base.meta();
                this.menuName = base.menuName();
                this.menuPath = base.menuPath();
                this.redirect = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_REDIRECT)) ? base.redirect() : null;
                this.menuType = base.menuType();
                this.menuComponent = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_COMPONENT)) ? base.menuComponent() : null;
                this.menuTarget = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_TARGET)) ? base.menuTarget() : null;
                this.permission = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PERMISSION)) ? base.permission() : null;
                this.weight = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_WEIGHT)) ? base.weight() : null;
                this.sysCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_SYS_CODE)) ? base.sysCode() : null;
                this.children = CHILDREN_ACCESSOR.get(base);
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
                    description = "菜单元数据"
            )
            public Meta getMeta() {
                if (meta == null) {
                    throw new IllegalStateException("The property \"meta\" is not specified");
                }
                return meta;
            }

            public void setMeta(@NotNull Meta meta) {
                this.meta = meta;
            }

            /**
             * 菜单名称
             */
            @NotNull
            @Schema(
                    description = "菜单名称"
            )
            public String getMenuName() {
                if (menuName == null) {
                    throw new IllegalStateException("The property \"menuName\" is not specified");
                }
                return menuName;
            }

            public void setMenuName(@NotNull String menuName) {
                this.menuName = menuName;
            }

            @NotNull
            @Schema(
                    description = "菜单路径"
            )
            public String getMenuPath() {
                if (menuPath == null) {
                    throw new IllegalStateException("The property \"menuPath\" is not specified");
                }
                return menuPath;
            }

            public void setMenuPath(@NotNull String menuPath) {
                this.menuPath = menuPath;
            }

            @Nullable
            @Schema(
                    description = "重定向地址"
            )
            public String getRedirect() {
                return redirect;
            }

            public void setRedirect(@Nullable String redirect) {
                this.redirect = redirect;
            }

            /**
             * 菜单类型（1菜单 2权限 3开发）
             */
            @NotNull
            @Schema(
                    description = "菜单类型（1菜单 2权限 3开发）"
            )
            public String getMenuType() {
                if (menuType == null) {
                    throw new IllegalStateException("The property \"menuType\" is not specified");
                }
                return menuType;
            }

            public void setMenuType(@NotNull String menuType) {
                this.menuType = menuType;
            }

            /**
             * 组件地址
             */
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

            /**
             * 目标
             */
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

            /**
             * 权限标识
             */
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

            /**
             * 菜单权重
             */
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

            /**
             * 归属系统（default:主导航菜单、mobileApp:APP菜单）
             */
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

            @Nullable
            @Schema(
                    description = "子级菜单"
            )
            public List<TargetOf_menus> getChildren() {
                return children;
            }

            public void setChildren(@Nullable List<TargetOf_menus> children) {
                this.children = children;
            }

            @Override
            public Menu toEntity() {
                return MenuDraft.$.produce(__draft -> {
                    __draft.setId(id);
                    __draft.setCreateBy(createBy);
                    __draft.setCreateDate(createDate);
                    __draft.setUpdateBy(updateBy);
                    __draft.setUpdateDate(updateDate);
                    __draft.setRemarks(remarks);
                    __draft.setMeta(meta);
                    __draft.setMenuName(menuName);
                    __draft.setMenuPath(menuPath);
                    __draft.setRedirect(redirect);
                    __draft.setMenuType(menuType);
                    __draft.setMenuComponent(menuComponent);
                    __draft.setMenuTarget(menuTarget);
                    __draft.setPermission(permission);
                    __draft.setWeight(weight);
                    __draft.setSysCode(sysCode);
                    CHILDREN_ACCESSOR.set(__draft, children != null ? children : Collections.emptyList());
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
                hash = hash * 31 + Objects.hashCode(meta);
                hash = hash * 31 + Objects.hashCode(menuName);
                hash = hash * 31 + Objects.hashCode(menuPath);
                hash = hash * 31 + Objects.hashCode(redirect);
                hash = hash * 31 + Objects.hashCode(menuType);
                hash = hash * 31 + Objects.hashCode(menuComponent);
                hash = hash * 31 + Objects.hashCode(menuTarget);
                hash = hash * 31 + Objects.hashCode(permission);
                hash = hash * 31 + Objects.hashCode(weight);
                hash = hash * 31 + Objects.hashCode(sysCode);
                hash = hash * 31 + Objects.hashCode(children);
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
                if (!Objects.equals(meta, other.meta)) {
                    return false;
                }
                if (!Objects.equals(menuName, other.menuName)) {
                    return false;
                }
                if (!Objects.equals(menuPath, other.menuPath)) {
                    return false;
                }
                if (!Objects.equals(redirect, other.redirect)) {
                    return false;
                }
                if (!Objects.equals(menuType, other.menuType)) {
                    return false;
                }
                if (!Objects.equals(menuComponent, other.menuComponent)) {
                    return false;
                }
                if (!Objects.equals(menuTarget, other.menuTarget)) {
                    return false;
                }
                if (!Objects.equals(permission, other.permission)) {
                    return false;
                }
                if (!Objects.equals(weight, other.weight)) {
                    return false;
                }
                if (!Objects.equals(sysCode, other.sysCode)) {
                    return false;
                }
                if (!Objects.equals(children, other.children)) {
                    return false;
                }
                return true;
            }

            @Override
            public String toString() {
                StringBuilder builder = new StringBuilder();
                builder.append("UserRoleMenuView.TargetOf_roles.TargetOf_menus").append('(');
                builder.append("id=").append(id);
                builder.append(", createBy=").append(createBy);
                builder.append(", createDate=").append(createDate);
                builder.append(", updateBy=").append(updateBy);
                builder.append(", updateDate=").append(updateDate);
                builder.append(", remarks=").append(remarks);
                builder.append(", meta=").append(meta);
                builder.append(", menuName=").append(menuName);
                builder.append(", menuPath=").append(menuPath);
                builder.append(", redirect=").append(redirect);
                builder.append(", menuType=").append(menuType);
                builder.append(", menuComponent=").append(menuComponent);
                builder.append(", menuTarget=").append(menuTarget);
                builder.append(", permission=").append(permission);
                builder.append(", weight=").append(weight);
                builder.append(", sysCode=").append(sysCode);
                builder.append(", children=").append(children);
                builder.append(')');
                return builder.toString();
            }
        }
    }
}
