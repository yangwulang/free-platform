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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.MenuFetcher;
import top.yangwulang.platform.entity.sys.MenuProps;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;
import top.yangwulang.platform.entity.sys.RoleFetcher;
import top.yangwulang.platform.entity.sys.RoleProps;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;
import top.yangwulang.platform.entity.sys.UserProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Role.dto"
)
@Data
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

    @Null
    private String remarks;

    @Schema(
            description = "角色编码"
    )
    @org.jetbrains.annotations.NotNull
    private String roleCode;

    @Schema(
            description = "角色名称"
    )
    @org.jetbrains.annotations.NotNull
    private String roleName;

    @Schema(
            description = "角色类型"
    )
    @Null
    private String roleType;

    @Schema(
            description = "角色排序"
    )
    @Null
    private BigDecimal roleSort;

    @Schema(
            description = "系统内置 1是 0否"
    )
    @Nullable
    private Boolean isSys;

    @Schema(
            description = "用户类型"
    )
    @Null
    private String userType;

    @Schema(
            description = "数据范围设置"
    )
    @Null
    private String dataScope;

    @Schema(
            description = "适应业务范围"
    )
    @Null
    private String bizScope;

    @Schema(
            description = "角色拥有的菜单"
    )
    @org.jetbrains.annotations.NotNull
    private List<TargetOf_menus> menus;

    @Schema(
            description = "角色拥有的用户"
    )
    @org.jetbrains.annotations.NotNull
    private List<TargetOf_users> users;

    public RoleGetView() {
    }

    public RoleGetView(@org.jetbrains.annotations.NotNull Role base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = spi.__isLoaded(RoleProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
        this.roleCode = base.roleCode();
        this.roleName = base.roleName();
        this.roleType = spi.__isLoaded(RoleProps.ROLE_TYPE.unwrap().getId()) ? base.roleType() : null;
        this.roleSort = spi.__isLoaded(RoleProps.ROLE_SORT.unwrap().getId()) ? base.roleSort() : null;
        this.isSys = spi.__isLoaded(RoleProps.IS_SYS.unwrap().getId()) ? base.isSys() : null;
        this.userType = spi.__isLoaded(RoleProps.USER_TYPE.unwrap().getId()) ? base.userType() : null;
        this.dataScope = spi.__isLoaded(RoleProps.DATA_SCOPE.unwrap().getId()) ? base.dataScope() : null;
        this.bizScope = spi.__isLoaded(RoleProps.BIZ_SCOPE.unwrap().getId()) ? base.bizScope() : null;
        this.menus = base.menus().stream().map(TargetOf_menus::new).collect(Collectors.toList());
        this.users = base.users().stream().map(TargetOf_users::new).collect(Collectors.toList());
    }

    public static RoleGetView of(@org.jetbrains.annotations.NotNull Role base) {
        return new RoleGetView(base);
    }

    @Override
    public Role toEntity() {
        return RoleDraft.$.produce(draft -> {
            draft.setId(id);
            draft.setStatus(status);
            draft.setCreateBy(createBy);
            draft.setCreateDate(createDate);
            draft.setUpdateBy(updateBy);
            draft.setUpdateDate(updateDate);
            draft.setRemarks(remarks);
            draft.setRoleCode(roleCode);
            draft.setRoleName(roleName);
            draft.setRoleType(roleType);
            draft.setRoleSort(roleSort);
            draft.setIsSys(isSys);
            draft.setUserType(userType);
            draft.setDataScope(dataScope);
            draft.setBizScope(bizScope);
            if (menus.isEmpty()) {
                draft.setMenus(Collections.emptyList());
            } else {
                for (TargetOf_menus __e : menus) {
                    draft.menus(true).add((MenuDraft)__e.toEntity());
                }
            }
            if (users.isEmpty()) {
                draft.setUsers(Collections.emptyList());
            } else {
                for (TargetOf_users __e : users) {
                    draft.users(true).add((UserDraft)__e.toEntity());
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

        @Null
        private String remarks;

        @Schema(
                description = "菜单名称"
        )
        @org.jetbrains.annotations.NotNull
        private String menuName;

        @Schema(
                description = "菜单类型（1菜单 2权限 3开发）"
        )
        @org.jetbrains.annotations.NotNull
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

        public TargetOf_menus() {
        }

        public TargetOf_menus(@org.jetbrains.annotations.NotNull Menu base) {
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
        }

        public static TargetOf_menus of(@org.jetbrains.annotations.NotNull Menu base) {
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
            });
        }
    }

    @Data
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
        @org.jetbrains.annotations.NotNull
        private String userCode;

        @Schema(
                description = "用户名"
        )
        @Null
        private String userName;

        @Schema(
                description = "用户类型"
        )
        @Null
        private String userType;

        @Schema(
                description = "头像地址"
        )
        @Null
        private String avatar;

        @Schema(
                description = "登录编码(账号)"
        )
        @Null
        private String loginCode;

        @Schema(
                description = "邮件"
        )
        @Null
        private String email;

        @Schema(
                description = "性别"
        )
        @Null
        private String sex;

        public TargetOf_users() {
        }

        public TargetOf_users(@org.jetbrains.annotations.NotNull User base) {
            ImmutableSpi spi = (ImmutableSpi)base;
            this.userCode = base.userCode();
            this.userName = spi.__isLoaded(UserProps.USER_NAME.unwrap().getId()) ? base.userName() : null;
            this.userType = spi.__isLoaded(UserProps.USER_TYPE.unwrap().getId()) ? base.userType() : null;
            this.avatar = spi.__isLoaded(UserProps.AVATAR.unwrap().getId()) ? base.avatar() : null;
            this.loginCode = spi.__isLoaded(UserProps.LOGIN_CODE.unwrap().getId()) ? base.loginCode() : null;
            this.email = spi.__isLoaded(UserProps.EMAIL.unwrap().getId()) ? base.email() : null;
            this.sex = spi.__isLoaded(UserProps.SEX.unwrap().getId()) ? base.sex() : null;
        }

        public static TargetOf_users of(@org.jetbrains.annotations.NotNull User base) {
            return new TargetOf_users(base);
        }

        @Override
        public User toEntity() {
            return UserDraft.$.produce(draft -> {
                draft.setUserCode(userCode);
                draft.setUserName(userName);
                draft.setUserType(userType);
                draft.setAvatar(avatar);
                draft.setLoginCode(loginCode);
                draft.setEmail(email);
                draft.setSex(sex);
            });
        }
    }
}
