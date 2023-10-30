package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Integer;
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
import top.yangwulang.platform.entity.sys.RoleProps;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;
import top.yangwulang.platform.entity.sys.UserProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/User.dto"
)
@Data
public class UserGetView implements View<User> {
    public static final ViewMetadata<User, UserGetView> METADATA = 
        new ViewMetadata<User, UserGetView>(
            UserFetcher.$
                .status()
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .loginCode()
                .userName()
                .email()
                .mobile()
                .phone()
                .sex()
                .avatar()
                .sign()
                .wxOpenId()
                .mobileImei()
                .userType()
                .refCode()
                .refName()
                .mgrType()
                .pwdSecurityLevel()
                .userWeight()
                .roles(TargetOf_roles.METADATA.getFetcher()),
            UserGetView::new
    );

    @Schema(
            description = "用户编码"
    )
    @NotNull
    private String userCode;

    @javax.validation.constraints.NotNull
    @Schema(
            description = "状态"
    )
    private int status;

    @javax.validation.constraints.NotNull
    @Schema(
            description = "创建人"
    )
    private String createBy;

    @javax.validation.constraints.NotNull
    @Schema(
            description = "创建时间"
    )
    private Date createDate;

    @javax.validation.constraints.NotNull
    @Schema(
            description = "修改者"
    )
    private String updateBy;

    @javax.validation.constraints.NotNull
    @Schema(
            description = "修改时间"
    )
    private Date updateDate;

    @Null
    @Schema(
            description = "备注"
    )
    private String remarks;

    @Schema(
            description = "登录编码(账号)"
    )
    @Null
    private String loginCode;

    @Schema(
            description = "用户名"
    )
    @Null
    private String userName;

    @Schema(
            description = "邮件"
    )
    @Null
    private String email;

    @Schema(
            description = "手机"
    )
    @Null
    private String mobile;

    @Schema(
            description = "电话"
    )
    @Null
    private String phone;

    @Schema(
            description = "性别"
    )
    @Null
    private String sex;

    @Schema(
            description = "头像地址"
    )
    @Null
    private String avatar;

    @Schema(
            description = "个性签名"
    )
    @Null
    private String sign;

    @Schema(
            description = "微信开发id"
    )
    @Null
    private String wxOpenId;

    @Schema(
            description = "手机imei"
    )
    @Null
    private String mobileImei;

    @Schema(
            description = "用户类型"
    )
    @Null
    private String userType;

    @Schema(
            description = "用户类型引用编号"
    )
    @Null
    private String refCode;

    @Schema(
            description = "用户类型引用名称"
    )
    @Null
    private String refName;

    @Schema(
            description = "管理员类型"
    )
    @NotNull
    private String mgrType;

    @Nullable
    private Integer pwdSecurityLevel;

    @Nullable
    private Integer userWeight;

    @NotNull
    private List<TargetOf_roles> roles;

    public UserGetView() {
    }

    public UserGetView(@NotNull User base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.userCode = base.userCode();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = spi.__isLoaded(UserProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
        this.loginCode = spi.__isLoaded(UserProps.LOGIN_CODE.unwrap().getId()) ? base.loginCode() : null;
        this.userName = spi.__isLoaded(UserProps.USER_NAME.unwrap().getId()) ? base.userName() : null;
        this.email = spi.__isLoaded(UserProps.EMAIL.unwrap().getId()) ? base.email() : null;
        this.mobile = spi.__isLoaded(UserProps.MOBILE.unwrap().getId()) ? base.mobile() : null;
        this.phone = spi.__isLoaded(UserProps.PHONE.unwrap().getId()) ? base.phone() : null;
        this.sex = spi.__isLoaded(UserProps.SEX.unwrap().getId()) ? base.sex() : null;
        this.avatar = spi.__isLoaded(UserProps.AVATAR.unwrap().getId()) ? base.avatar() : null;
        this.sign = spi.__isLoaded(UserProps.SIGN.unwrap().getId()) ? base.sign() : null;
        this.wxOpenId = spi.__isLoaded(UserProps.WX_OPEN_ID.unwrap().getId()) ? base.wxOpenId() : null;
        this.mobileImei = spi.__isLoaded(UserProps.MOBILE_IMEI.unwrap().getId()) ? base.mobileImei() : null;
        this.userType = spi.__isLoaded(UserProps.USER_TYPE.unwrap().getId()) ? base.userType() : null;
        this.refCode = spi.__isLoaded(UserProps.REF_CODE.unwrap().getId()) ? base.refCode() : null;
        this.refName = spi.__isLoaded(UserProps.REF_NAME.unwrap().getId()) ? base.refName() : null;
        this.mgrType = base.mgrType();
        this.pwdSecurityLevel = spi.__isLoaded(UserProps.PWD_SECURITY_LEVEL.unwrap().getId()) ? base.pwdSecurityLevel() : null;
        this.userWeight = spi.__isLoaded(UserProps.USER_WEIGHT.unwrap().getId()) ? base.userWeight() : null;
        this.roles = base.roles().stream().map(TargetOf_roles::new).collect(Collectors.toList());
    }

    public static UserGetView of(@NotNull User base) {
        return new UserGetView(base);
    }

    @Override
    public User toEntity() {
        return UserDraft.$.produce(draft -> {
            draft.setUserCode(userCode);
            draft.setStatus(status);
            draft.setCreateBy(createBy);
            draft.setCreateDate(createDate);
            draft.setUpdateBy(updateBy);
            draft.setUpdateDate(updateDate);
            draft.setRemarks(remarks);
            draft.setLoginCode(loginCode);
            draft.setUserName(userName);
            draft.setEmail(email);
            draft.setMobile(mobile);
            draft.setPhone(phone);
            draft.setSex(sex);
            draft.setAvatar(avatar);
            draft.setSign(sign);
            draft.setWxOpenId(wxOpenId);
            draft.setMobileImei(mobileImei);
            draft.setUserType(userType);
            draft.setRefCode(refCode);
            draft.setRefName(refName);
            draft.setMgrType(mgrType);
            draft.setPwdSecurityLevel(pwdSecurityLevel);
            draft.setUserWeight(userWeight);
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
                    .roleName()
                    .roleType()
                    .userType()
                    .menus(TargetOf_menus.METADATA.getFetcher()),
                TargetOf_roles::new
        );

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

        @Schema(
                description = "角色拥有的菜单"
        )
        @NotNull
        private List<TargetOf_menus> menus;

        public TargetOf_roles() {
        }

        public TargetOf_roles(@NotNull Role base) {
            ImmutableSpi spi = (ImmutableSpi)base;
            this.roleName = base.roleName();
            this.roleType = spi.__isLoaded(RoleProps.ROLE_TYPE.unwrap().getId()) ? base.roleType() : null;
            this.userType = spi.__isLoaded(RoleProps.USER_TYPE.unwrap().getId()) ? base.userType() : null;
            this.menus = base.menus().stream().map(TargetOf_menus::new).collect(Collectors.toList());
        }

        public static TargetOf_roles of(@NotNull Role base) {
            return new TargetOf_roles(base);
        }

        @Override
        public Role toEntity() {
            return RoleDraft.$.produce(draft -> {
                draft.setRoleName(roleName);
                draft.setRoleType(roleType);
                draft.setUserType(userType);
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
                        .sysCode(),
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
                });
            }
        }
    }
}
