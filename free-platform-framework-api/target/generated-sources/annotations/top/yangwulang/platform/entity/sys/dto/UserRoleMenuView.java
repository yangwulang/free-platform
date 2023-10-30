package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.RecursiveFieldConfig;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.MenuFetcher;
import top.yangwulang.platform.entity.sys.MenuProps;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;
import top.yangwulang.platform.entity.sys.RoleFetcher;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/User.dto"
)
@Data
public class UserRoleMenuView implements View<User> {
    public static final ViewMetadata<User, UserRoleMenuView> METADATA = 
        new ViewMetadata<User, UserRoleMenuView>(
            UserFetcher.$
                .roles(TargetOf_roles.METADATA.getFetcher()),
            UserRoleMenuView::new
    );

    @NotNull
    private List<TargetOf_roles> roles;

    public UserRoleMenuView() {
    }

    public UserRoleMenuView(@NotNull User base) {
        this.roles = base.roles().stream().map(TargetOf_roles::new).collect(Collectors.toList());
    }

    public static UserRoleMenuView of(@NotNull User base) {
        return new UserRoleMenuView(base);
    }

    @Override
    public User toEntity() {
        return UserDraft.$.produce(draft -> {
            if (roles.isEmpty()) {
                draft.setRoles(Collections.emptyList());
            } else {
                for (TargetOf_roles __e : roles) {
                    draft.roles(true).add((RoleDraft)__e.toEntity());
                }
            }
        });
    }

    @Data
    public static class TargetOf_roles implements View<Role> {
        public static final ViewMetadata<Role, TargetOf_roles> METADATA = 
            new ViewMetadata<Role, TargetOf_roles>(
                RoleFetcher.$
                    .menus(TargetOf_menus.METADATA.getFetcher()),
                TargetOf_roles::new
        );

        @Schema(
                description = "角色拥有的菜单"
        )
        @NotNull
        private List<TargetOf_menus> menus;

        public TargetOf_roles() {
        }

        public TargetOf_roles(@NotNull Role base) {
            this.menus = base.menus().stream().map(TargetOf_menus::new).collect(Collectors.toList());
        }

        public static TargetOf_roles of(@NotNull Role base) {
            return new TargetOf_roles(base);
        }

        @Override
        public Role toEntity() {
            return RoleDraft.$.produce(draft -> {
                if (menus.isEmpty()) {
                    draft.setMenus(Collections.emptyList());
                } else {
                    for (TargetOf_menus __e : menus) {
                        draft.menus(true).add((MenuDraft)__e.toEntity());
                    }
                }
            });
        }

        @Data
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
                        .sysCode()
                        .children(TargetOf_children.METADATA.getFetcher(), RecursiveFieldConfig::recursive),
                    TargetOf_menus::new
            );

            @javax.validation.constraints.NotNull
            private String id;

            @Schema(
                    description = "状态"
            )
            private int status;

            @javax.validation.constraints.NotNull
            private String createBy;

            @javax.validation.constraints.NotNull
            private Date createDate;

            @javax.validation.constraints.NotNull
            private String updateBy;

            @javax.validation.constraints.NotNull
            private Date updateDate;

            @Null
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
            @Null
            private String menuHref;

            @Schema(
                    description = "组件地址"
            )
            @Null
            private String menuComponent;

            @Schema(
                    description = "目标"
            )
            @Null
            private String menuTarget;

            @Schema(
                    description = "图标"
            )
            @Null
            private String menuIcon;

            @Schema(
                    description = "颜色"
            )
            @Null
            private String menuColor;

            @Schema(
                    description = "菜单标题"
            )
            @Null
            private String menuTitle;

            @Schema(
                    description = "权限标识"
            )
            @Null
            private String permission;

            @Schema(
                    description = "菜单权重"
            )
            @Null
            private BigDecimal weight;

            @Schema(
                    description = "是否显示"
            )
            @Null
            private Boolean isShow;

            @Schema(
                    description = "归属系统（default:主导航菜单、mobileApp:APP菜单）"
            )
            @Null
            private String sysCode;

            @Schema(
                    description = "子级菜单"
            )
            @Nullable
            private List<TargetOf_children> children;

            public TargetOf_menus() {
            }

            public TargetOf_menus(@NotNull Menu base) {
                ImmutableSpi spi = (ImmutableSpi)base;
                this.id = base.id();
                this.status = base.status();
                this.createBy = base.createBy();
                this.createDate = base.createDate();
                this.updateBy = base.updateBy();
                this.updateDate = base.updateDate();
                this.remarks = spi.__isLoaded(MenuProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
                this.menuName = base.menuName();
                this.menuType = base.menuType();
                this.menuHref = spi.__isLoaded(MenuProps.MENU_HREF.unwrap().getId()) ? base.menuHref() : null;
                this.menuComponent = spi.__isLoaded(MenuProps.MENU_COMPONENT.unwrap().getId()) ? base.menuComponent() : null;
                this.menuTarget = spi.__isLoaded(MenuProps.MENU_TARGET.unwrap().getId()) ? base.menuTarget() : null;
                this.menuIcon = spi.__isLoaded(MenuProps.MENU_ICON.unwrap().getId()) ? base.menuIcon() : null;
                this.menuColor = spi.__isLoaded(MenuProps.MENU_COLOR.unwrap().getId()) ? base.menuColor() : null;
                this.menuTitle = spi.__isLoaded(MenuProps.MENU_TITLE.unwrap().getId()) ? base.menuTitle() : null;
                this.permission = spi.__isLoaded(MenuProps.PERMISSION.unwrap().getId()) ? base.permission() : null;
                this.weight = spi.__isLoaded(MenuProps.WEIGHT.unwrap().getId()) ? base.weight() : null;
                this.isShow = spi.__isLoaded(MenuProps.IS_SHOW.unwrap().getId()) ? base.isShow() : null;
                this.sysCode = spi.__isLoaded(MenuProps.SYS_CODE.unwrap().getId()) ? base.sysCode() : null;
                this.children = spi.__isLoaded(MenuProps.CHILDREN.unwrap().getId()) ? 
                            base.children().stream().map(TargetOf_children::new).collect(Collectors.toList()) : 
                            null;
            }

            public static TargetOf_menus of(@NotNull Menu base) {
                return new TargetOf_menus(base);
            }

            @Override
            public Menu toEntity() {
                return MenuDraft.$.produce(draft -> {
                    draft.setId(id);
                    draft.setStatus(status);
                    draft.setCreateBy(createBy);
                    draft.setCreateDate(createDate);
                    draft.setUpdateBy(updateBy);
                    draft.setUpdateDate(updateDate);
                    draft.setRemarks(remarks);
                    draft.setMenuName(menuName);
                    draft.setMenuType(menuType);
                    draft.setMenuHref(menuHref);
                    draft.setMenuComponent(menuComponent);
                    draft.setMenuTarget(menuTarget);
                    draft.setMenuIcon(menuIcon);
                    draft.setMenuColor(menuColor);
                    draft.setMenuTitle(menuTitle);
                    draft.setPermission(permission);
                    draft.setWeight(weight);
                    draft.setIsShow(isShow);
                    draft.setSysCode(sysCode);
                    if (children != null) {
                        if (children.isEmpty()) {
                            draft.setChildren(Collections.emptyList());
                        } else {
                            for (TargetOf_children __e : children) {
                                draft.children(true).add((MenuDraft)__e.toEntity());
                            }
                        }
                    } else {
                        draft.setChildren(Collections.emptyList());
                    }
                });
            }

            @Data
            public static class TargetOf_children implements View<Menu> {
                public static final ViewMetadata<Menu, TargetOf_children> METADATA = 
                    new ViewMetadata<Menu, TargetOf_children>(
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
                        TargetOf_children::new
                );

                @javax.validation.constraints.NotNull
                private String id;

                @Schema(
                        description = "状态"
                )
                private int status;

                @javax.validation.constraints.NotNull
                private String createBy;

                @javax.validation.constraints.NotNull
                private Date createDate;

                @javax.validation.constraints.NotNull
                private String updateBy;

                @javax.validation.constraints.NotNull
                private Date updateDate;

                @Null
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
                @Null
                private String menuHref;

                @Schema(
                        description = "组件地址"
                )
                @Null
                private String menuComponent;

                @Schema(
                        description = "目标"
                )
                @Null
                private String menuTarget;

                @Schema(
                        description = "图标"
                )
                @Null
                private String menuIcon;

                @Schema(
                        description = "颜色"
                )
                @Null
                private String menuColor;

                @Schema(
                        description = "菜单标题"
                )
                @Null
                private String menuTitle;

                @Schema(
                        description = "权限标识"
                )
                @Null
                private String permission;

                @Schema(
                        description = "菜单权重"
                )
                @Null
                private BigDecimal weight;

                @Schema(
                        description = "是否显示"
                )
                @Null
                private Boolean isShow;

                @Schema(
                        description = "归属系统（default:主导航菜单、mobileApp:APP菜单）"
                )
                @Null
                private String sysCode;

                @Schema(
                        description = "子级菜单"
                )
                @Nullable
                private List<TargetOf_children> children;

                public TargetOf_children() {
                }

                public TargetOf_children(@NotNull Menu base) {
                    ImmutableSpi spi = (ImmutableSpi)base;
                    this.id = base.id();
                    this.status = base.status();
                    this.createBy = base.createBy();
                    this.createDate = base.createDate();
                    this.updateBy = base.updateBy();
                    this.updateDate = base.updateDate();
                    this.remarks = spi.__isLoaded(MenuProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
                    this.menuName = base.menuName();
                    this.menuType = base.menuType();
                    this.menuHref = spi.__isLoaded(MenuProps.MENU_HREF.unwrap().getId()) ? base.menuHref() : null;
                    this.menuComponent = spi.__isLoaded(MenuProps.MENU_COMPONENT.unwrap().getId()) ? base.menuComponent() : null;
                    this.menuTarget = spi.__isLoaded(MenuProps.MENU_TARGET.unwrap().getId()) ? base.menuTarget() : null;
                    this.menuIcon = spi.__isLoaded(MenuProps.MENU_ICON.unwrap().getId()) ? base.menuIcon() : null;
                    this.menuColor = spi.__isLoaded(MenuProps.MENU_COLOR.unwrap().getId()) ? base.menuColor() : null;
                    this.menuTitle = spi.__isLoaded(MenuProps.MENU_TITLE.unwrap().getId()) ? base.menuTitle() : null;
                    this.permission = spi.__isLoaded(MenuProps.PERMISSION.unwrap().getId()) ? base.permission() : null;
                    this.weight = spi.__isLoaded(MenuProps.WEIGHT.unwrap().getId()) ? base.weight() : null;
                    this.isShow = spi.__isLoaded(MenuProps.IS_SHOW.unwrap().getId()) ? base.isShow() : null;
                    this.sysCode = spi.__isLoaded(MenuProps.SYS_CODE.unwrap().getId()) ? base.sysCode() : null;
                    this.children = spi.__isLoaded(MenuProps.CHILDREN.unwrap().getId()) ? 
                                base.children().stream().map(TargetOf_children::new).collect(Collectors.toList()) : 
                                null;
                }

                public static TargetOf_children of(@NotNull Menu base) {
                    return new TargetOf_children(base);
                }

                @Override
                public Menu toEntity() {
                    return MenuDraft.$.produce(draft -> {
                        draft.setId(id);
                        draft.setStatus(status);
                        draft.setCreateBy(createBy);
                        draft.setCreateDate(createDate);
                        draft.setUpdateBy(updateBy);
                        draft.setUpdateDate(updateDate);
                        draft.setRemarks(remarks);
                        draft.setMenuName(menuName);
                        draft.setMenuType(menuType);
                        draft.setMenuHref(menuHref);
                        draft.setMenuComponent(menuComponent);
                        draft.setMenuTarget(menuTarget);
                        draft.setMenuIcon(menuIcon);
                        draft.setMenuColor(menuColor);
                        draft.setMenuTitle(menuTitle);
                        draft.setPermission(permission);
                        draft.setWeight(weight);
                        draft.setIsShow(isShow);
                        draft.setSysCode(sysCode);
                        if (children != null) {
                            if (children.isEmpty()) {
                                draft.setChildren(Collections.emptyList());
                            } else {
                                for (TargetOf_children __e : children) {
                                    draft.children(true).add((MenuDraft)__e.toEntity());
                                }
                            }
                        } else {
                            draft.setChildren(Collections.emptyList());
                        }
                    });
                }
            }
        }
    }
}
