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
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
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
        file = "src/main/dto/top/yangwulang/platform/entity/sys/User.dto"
)
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

    private static final DtoPropAccessor ROLES_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] { UserDraft.Producer.SLOT_ROLES },
        DtoPropAccessor.<Role, TargetOf_roles>objectListGetter(TargetOf_roles::new),
        DtoPropAccessor.objectListSetter(TargetOf_roles::toEntity)
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
        this.userCode = base.userCode();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
        this.loginCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_LOGIN_CODE)) ? base.loginCode() : null;
        this.userName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_USER_NAME)) ? base.userName() : null;
        this.email = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_EMAIL)) ? base.email() : null;
        this.mobile = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_MOBILE)) ? base.mobile() : null;
        this.phone = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_PHONE)) ? base.phone() : null;
        this.sex = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_SEX)) ? base.sex() : null;
        this.avatar = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_AVATAR)) ? base.avatar() : null;
        this.sign = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_SIGN)) ? base.sign() : null;
        this.wxOpenId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_WX_OPEN_ID)) ? base.wxOpenId() : null;
        this.mobileImei = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_MOBILE_IMEI)) ? base.mobileImei() : null;
        this.userType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_USER_TYPE)) ? base.userType() : null;
        this.refCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_REF_CODE)) ? base.refCode() : null;
        this.refName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_REF_NAME)) ? base.refName() : null;
        this.mgrType = base.mgrType();
        this.pwdSecurityLevel = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_PWD_SECURITY_LEVEL)) ? base.pwdSecurityLevel() : null;
        this.userWeight = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_USER_WEIGHT)) ? base.userWeight() : null;
        this.roles = ROLES_ACCESSOR.get(base);
    }

    public static UserGetView of(@NotNull User base) {
        return new UserGetView(base);
    }

    @NotNull
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(@NotNull String userCode) {
        this.userCode = userCode;
    }

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

    @Nullable
    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(@Nullable String loginCode) {
        this.loginCode = loginCode;
    }

    @Nullable
    public String getUserName() {
        return userName;
    }

    public void setUserName(@Nullable String userName) {
        this.userName = userName;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Nullable
    public String getMobile() {
        return mobile;
    }

    public void setMobile(@Nullable String mobile) {
        this.mobile = mobile;
    }

    @Nullable
    public String getPhone() {
        return phone;
    }

    public void setPhone(@Nullable String phone) {
        this.phone = phone;
    }

    @Nullable
    public String getSex() {
        return sex;
    }

    public void setSex(@Nullable String sex) {
        this.sex = sex;
    }

    @Nullable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(@Nullable String avatar) {
        this.avatar = avatar;
    }

    @Nullable
    public String getSign() {
        return sign;
    }

    public void setSign(@Nullable String sign) {
        this.sign = sign;
    }

    @Nullable
    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(@Nullable String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    @Nullable
    public String getMobileImei() {
        return mobileImei;
    }

    public void setMobileImei(@Nullable String mobileImei) {
        this.mobileImei = mobileImei;
    }

    @Nullable
    public String getUserType() {
        return userType;
    }

    public void setUserType(@Nullable String userType) {
        this.userType = userType;
    }

    @Nullable
    public String getRefCode() {
        return refCode;
    }

    public void setRefCode(@Nullable String refCode) {
        this.refCode = refCode;
    }

    @Nullable
    public String getRefName() {
        return refName;
    }

    public void setRefName(@Nullable String refName) {
        this.refName = refName;
    }

    @NotNull
    public String getMgrType() {
        return mgrType;
    }

    public void setMgrType(@NotNull String mgrType) {
        this.mgrType = mgrType;
    }

    @Nullable
    public Integer getPwdSecurityLevel() {
        return pwdSecurityLevel;
    }

    public void setPwdSecurityLevel(@Nullable Integer pwdSecurityLevel) {
        this.pwdSecurityLevel = pwdSecurityLevel;
    }

    @Nullable
    public Integer getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(@Nullable Integer userWeight) {
        this.userWeight = userWeight;
    }

    @NotNull
    public List<TargetOf_roles> getRoles() {
        return roles;
    }

    public void setRoles(@NotNull List<TargetOf_roles> roles) {
        this.roles = roles;
    }

    @Override
    public User toEntity() {
        return UserDraft.$.produce(__draft -> {
            __draft.setUserCode(userCode);
            __draft.setStatus(status);
            __draft.setCreateBy(createBy);
            __draft.setCreateDate(createDate);
            __draft.setUpdateBy(updateBy);
            __draft.setUpdateDate(updateDate);
            __draft.setRemarks(remarks);
            __draft.setLoginCode(loginCode);
            __draft.setUserName(userName);
            __draft.setEmail(email);
            __draft.setMobile(mobile);
            __draft.setPhone(phone);
            __draft.setSex(sex);
            __draft.setAvatar(avatar);
            __draft.setSign(sign);
            __draft.setWxOpenId(wxOpenId);
            __draft.setMobileImei(mobileImei);
            __draft.setUserType(userType);
            __draft.setRefCode(refCode);
            __draft.setRefName(refName);
            __draft.setMgrType(mgrType);
            __draft.setPwdSecurityLevel(pwdSecurityLevel);
            __draft.setUserWeight(userWeight);
            ROLES_ACCESSOR.set(__draft, roles != null ? roles : Collections.emptyList());
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(userCode);
        hash = hash * 31 + Integer.hashCode(status);
        hash = hash * 31 + Objects.hashCode(createBy);
        hash = hash * 31 + Objects.hashCode(createDate);
        hash = hash * 31 + Objects.hashCode(updateBy);
        hash = hash * 31 + Objects.hashCode(updateDate);
        hash = hash * 31 + Objects.hashCode(remarks);
        hash = hash * 31 + Objects.hashCode(loginCode);
        hash = hash * 31 + Objects.hashCode(userName);
        hash = hash * 31 + Objects.hashCode(email);
        hash = hash * 31 + Objects.hashCode(mobile);
        hash = hash * 31 + Objects.hashCode(phone);
        hash = hash * 31 + Objects.hashCode(sex);
        hash = hash * 31 + Objects.hashCode(avatar);
        hash = hash * 31 + Objects.hashCode(sign);
        hash = hash * 31 + Objects.hashCode(wxOpenId);
        hash = hash * 31 + Objects.hashCode(mobileImei);
        hash = hash * 31 + Objects.hashCode(userType);
        hash = hash * 31 + Objects.hashCode(refCode);
        hash = hash * 31 + Objects.hashCode(refName);
        hash = hash * 31 + Objects.hashCode(mgrType);
        hash = hash * 31 + Objects.hashCode(pwdSecurityLevel);
        hash = hash * 31 + Objects.hashCode(userWeight);
        hash = hash * 31 + Objects.hashCode(roles);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        UserGetView other = (UserGetView) o;
        if (!Objects.equals(userCode, other.userCode)) {
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
        if (!Objects.equals(loginCode, other.loginCode)) {
            return false;
        }
        if (!Objects.equals(userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(email, other.email)) {
            return false;
        }
        if (!Objects.equals(mobile, other.mobile)) {
            return false;
        }
        if (!Objects.equals(phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(sex, other.sex)) {
            return false;
        }
        if (!Objects.equals(avatar, other.avatar)) {
            return false;
        }
        if (!Objects.equals(sign, other.sign)) {
            return false;
        }
        if (!Objects.equals(wxOpenId, other.wxOpenId)) {
            return false;
        }
        if (!Objects.equals(mobileImei, other.mobileImei)) {
            return false;
        }
        if (!Objects.equals(userType, other.userType)) {
            return false;
        }
        if (!Objects.equals(refCode, other.refCode)) {
            return false;
        }
        if (!Objects.equals(refName, other.refName)) {
            return false;
        }
        if (!Objects.equals(mgrType, other.mgrType)) {
            return false;
        }
        if (!Objects.equals(pwdSecurityLevel, other.pwdSecurityLevel)) {
            return false;
        }
        if (!Objects.equals(userWeight, other.userWeight)) {
            return false;
        }
        if (!Objects.equals(roles, other.roles)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserGetView").append('(');
        builder.append("userCode=").append(userCode);
        builder.append(", status=").append(status);
        builder.append(", createBy=").append(createBy);
        builder.append(", createDate=").append(createDate);
        builder.append(", updateBy=").append(updateBy);
        builder.append(", updateDate=").append(updateDate);
        builder.append(", remarks=").append(remarks);
        builder.append(", loginCode=").append(loginCode);
        builder.append(", userName=").append(userName);
        builder.append(", email=").append(email);
        builder.append(", mobile=").append(mobile);
        builder.append(", phone=").append(phone);
        builder.append(", sex=").append(sex);
        builder.append(", avatar=").append(avatar);
        builder.append(", sign=").append(sign);
        builder.append(", wxOpenId=").append(wxOpenId);
        builder.append(", mobileImei=").append(mobileImei);
        builder.append(", userType=").append(userType);
        builder.append(", refCode=").append(refCode);
        builder.append(", refName=").append(refName);
        builder.append(", mgrType=").append(mgrType);
        builder.append(", pwdSecurityLevel=").append(pwdSecurityLevel);
        builder.append(", userWeight=").append(userWeight);
        builder.append(", roles=").append(roles);
        builder.append(')');
        return builder.toString();
    }

    public static class TargetOf_roles implements View<Role> {
        public static final ViewMetadata<Role, TargetOf_roles> METADATA = 
            new ViewMetadata<Role, TargetOf_roles>(
                RoleFetcher.$
                    .roleName()
                    .roleType()
                    .userType()
                    .menus(TargetOf_menus_2.METADATA.getFetcher()),
                TargetOf_roles::new
        );

        private static final DtoPropAccessor MENUS_ACCESSOR = new DtoPropAccessor(
            true,
            new int[] { RoleDraft.Producer.SLOT_MENUS },
            DtoPropAccessor.<Menu, TargetOf_menus_2>objectListGetter(TargetOf_menus_2::new),
            DtoPropAccessor.objectListSetter(TargetOf_menus_2::toEntity)
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
        private List<TargetOf_menus_2> menus;

        public TargetOf_roles() {
        }

        public TargetOf_roles(@NotNull Role base) {
            this.roleName = base.roleName();
            this.roleType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_ROLE_TYPE)) ? base.roleType() : null;
            this.userType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_USER_TYPE)) ? base.userType() : null;
            this.menus = MENUS_ACCESSOR.get(base);
        }

        public static TargetOf_roles of(@NotNull Role base) {
            return new TargetOf_roles(base);
        }

        @NotNull
        public String getRoleName() {
            return roleName;
        }

        public void setRoleName(@NotNull String roleName) {
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

        @NotNull
        public List<TargetOf_menus_2> getMenus() {
            return menus;
        }

        public void setMenus(@NotNull List<TargetOf_menus_2> menus) {
            this.menus = menus;
        }

        @Override
        public Role toEntity() {
            return RoleDraft.$.produce(__draft -> {
                __draft.setRoleName(roleName);
                __draft.setRoleType(roleType);
                __draft.setUserType(userType);
                MENUS_ACCESSOR.set(__draft, menus != null ? menus : Collections.emptyList());
            });
        }

        @Override
        public int hashCode() {
            int hash = Objects.hashCode(roleName);
            hash = hash * 31 + Objects.hashCode(roleType);
            hash = hash * 31 + Objects.hashCode(userType);
            hash = hash * 31 + Objects.hashCode(menus);
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            TargetOf_roles other = (TargetOf_roles) o;
            if (!Objects.equals(roleName, other.roleName)) {
                return false;
            }
            if (!Objects.equals(roleType, other.roleType)) {
                return false;
            }
            if (!Objects.equals(userType, other.userType)) {
                return false;
            }
            if (!Objects.equals(menus, other.menus)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("UserGetView").append('.');
            builder.append("TargetOf_roles").append('(');
            builder.append("roleName=").append(roleName);
            builder.append(", roleType=").append(roleType);
            builder.append(", userType=").append(userType);
            builder.append(", menus=").append(menus);
            builder.append(')');
            return builder.toString();
        }

        public static class TargetOf_menus_2 implements View<Menu> {
            public static final ViewMetadata<Menu, TargetOf_menus_2> METADATA = 
                new ViewMetadata<Menu, TargetOf_menus_2>(
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
                    TargetOf_menus_2::new
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

            public TargetOf_menus_2() {
            }

            public TargetOf_menus_2(@NotNull Menu base) {
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

            public static TargetOf_menus_2 of(@NotNull Menu base) {
                return new TargetOf_menus_2(base);
            }

            @NotNull
            public String getId() {
                return id;
            }

            public void setId(@NotNull String id) {
                this.id = id;
            }

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
            public String getMenuName() {
                return menuName;
            }

            public void setMenuName(@NotNull String menuName) {
                this.menuName = menuName;
            }

            @NotNull
            public String getMenuType() {
                return menuType;
            }

            public void setMenuType(@NotNull String menuType) {
                this.menuType = menuType;
            }

            @Nullable
            public String getMenuHref() {
                return menuHref;
            }

            public void setMenuHref(@Nullable String menuHref) {
                this.menuHref = menuHref;
            }

            @Nullable
            public String getMenuComponent() {
                return menuComponent;
            }

            public void setMenuComponent(@Nullable String menuComponent) {
                this.menuComponent = menuComponent;
            }

            @Nullable
            public String getMenuTarget() {
                return menuTarget;
            }

            public void setMenuTarget(@Nullable String menuTarget) {
                this.menuTarget = menuTarget;
            }

            @Nullable
            public String getMenuIcon() {
                return menuIcon;
            }

            public void setMenuIcon(@Nullable String menuIcon) {
                this.menuIcon = menuIcon;
            }

            @Nullable
            public String getMenuColor() {
                return menuColor;
            }

            public void setMenuColor(@Nullable String menuColor) {
                this.menuColor = menuColor;
            }

            @Nullable
            public String getMenuTitle() {
                return menuTitle;
            }

            public void setMenuTitle(@Nullable String menuTitle) {
                this.menuTitle = menuTitle;
            }

            @Nullable
            public String getPermission() {
                return permission;
            }

            public void setPermission(@Nullable String permission) {
                this.permission = permission;
            }

            @Nullable
            public BigDecimal getWeight() {
                return weight;
            }

            public void setWeight(@Nullable BigDecimal weight) {
                this.weight = weight;
            }

            @Nullable
            public Boolean getIsShow() {
                return isShow;
            }

            public void setIsShow(@Nullable Boolean isShow) {
                this.isShow = isShow;
            }

            @Nullable
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
                TargetOf_menus_2 other = (TargetOf_menus_2) o;
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
                builder.append("UserGetView").append('.');
                builder.append("TargetOf_roles").append('.');
                builder.append("TargetOf_menus_2").append('(');
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
    }
}
