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
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
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

/**
 *  @author yangwulang
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/User.dto"
)
@Schema(
        description = "用户实体"
)
public class UserGetView implements View<User> {
    public static final DtoMetadata<User, UserGetView> METADATA = 
        new DtoMetadata<User, UserGetView>(
            UserFetcher.$
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

    private String userCode;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String loginCode;

    private String userName;

    private String email;

    private String mobile;

    private String phone;

    private String sex;

    private String avatar;

    private String sign;

    private String wxOpenId;

    private String mobileImei;

    private String userType;

    private String refCode;

    private String refName;

    private String mgrType;

    private Integer pwdSecurityLevel;

    private Integer userWeight;

    private List<TargetOf_roles> roles;

    public UserGetView() {
    }

    public UserGetView(@NotNull User base) {
        this.userCode = base.userCode();
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

    @NotNull
    @Schema(
            description = "用户编码"
    )
    public String getUserCode() {
        if (userCode == null) {
            throw new IllegalStateException("The property \"userCode\" is not specified");
        }
        return userCode;
    }

    public void setUserCode(@NotNull String userCode) {
        this.userCode = userCode;
    }

    /**
     * 创建者
     *
     * @return 创建者
     */
    @NotNull
    @Schema(
            description = "创建人"
    )
    public String getCreateBy() {
        if (createBy == null) {
            throw new IllegalStateException("The property \"createBy\" is not specified");
        }
        return createBy;
    }

    public void setCreateBy(@NotNull String createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     *
     * @return 创建时间
     */
    @NotNull
    @Schema(
            description = "创建时间"
    )
    public Date getCreateDate() {
        if (createDate == null) {
            throw new IllegalStateException("The property \"createDate\" is not specified");
        }
        return createDate;
    }

    public void setCreateDate(@NotNull Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新者
     *
     * @return 更新者
     */
    @NotNull
    @Schema(
            description = "修改者"
    )
    public String getUpdateBy() {
        if (updateBy == null) {
            throw new IllegalStateException("The property \"updateBy\" is not specified");
        }
        return updateBy;
    }

    public void setUpdateBy(@NotNull String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 更新时间
     *
     * @return 更新时间
     */
    @NotNull
    @Schema(
            description = "修改时间"
    )
    public Date getUpdateDate() {
        if (updateDate == null) {
            throw new IllegalStateException("The property \"updateDate\" is not specified");
        }
        return updateDate;
    }

    public void setUpdateDate(@NotNull Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 备注信息
     *
     * @return 备注信息
     */
    @Nullable
    @Schema(
            description = "备注"
    )
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(@Nullable String remarks) {
        this.remarks = remarks;
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
            description = "手机"
    )
    public String getMobile() {
        return mobile;
    }

    public void setMobile(@Nullable String mobile) {
        this.mobile = mobile;
    }

    @Nullable
    @Schema(
            description = "电话"
    )
    public String getPhone() {
        return phone;
    }

    public void setPhone(@Nullable String phone) {
        this.phone = phone;
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
            description = "个性签名"
    )
    public String getSign() {
        return sign;
    }

    public void setSign(@Nullable String sign) {
        this.sign = sign;
    }

    @Nullable
    @Schema(
            description = "微信开发id"
    )
    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(@Nullable String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    @Nullable
    @Schema(
            description = "手机imei"
    )
    public String getMobileImei() {
        return mobileImei;
    }

    public void setMobileImei(@Nullable String mobileImei) {
        this.mobileImei = mobileImei;
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
            description = "用户类型引用编号"
    )
    public String getRefCode() {
        return refCode;
    }

    public void setRefCode(@Nullable String refCode) {
        this.refCode = refCode;
    }

    @Nullable
    @Schema(
            description = "用户类型引用名称"
    )
    public String getRefName() {
        return refName;
    }

    public void setRefName(@Nullable String refName) {
        this.refName = refName;
    }

    @NotNull
    @Schema(
            description = "管理员类型"
    )
    public String getMgrType() {
        if (mgrType == null) {
            throw new IllegalStateException("The property \"mgrType\" is not specified");
        }
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
            __draft.setUserCode(userCode);
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

    /**
     * 角色表
     *
     */
    @GeneratedBy
    @Schema(
            description = "角色"
    )
    public static class TargetOf_roles implements View<Role> {
        public static final DtoMetadata<Role, TargetOf_roles> METADATA = 
            new DtoMetadata<Role, TargetOf_roles>(
                RoleFetcher.$
                    .roleName()
                    .roleType()
                    .userType()
                    .menus(TargetOf_menus.METADATA.getFetcher()),
                TargetOf_roles::new
        );

        private static final DtoPropAccessor MENUS_ACCESSOR = new DtoPropAccessor(
            true,
            new int[] { RoleDraft.Producer.SLOT_MENUS },
            DtoPropAccessor.<Menu, TargetOf_menus>objectListGetter(TargetOf_menus::new),
            DtoPropAccessor.objectListSetter(TargetOf_menus::toEntity)
        );

        private String roleName;

        private String roleType;

        private String userType;

        private List<TargetOf_menus> menus;

        public TargetOf_roles() {
        }

        public TargetOf_roles(@NotNull Role base) {
            this.roleName = base.roleName();
            this.roleType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_ROLE_TYPE)) ? base.roleType() : null;
            this.userType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(RoleDraft.Producer.SLOT_USER_TYPE)) ? base.userType() : null;
            this.menus = MENUS_ACCESSOR.get(base);
        }

        /**
         * 角色名称
         */
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
            builder.append("UserGetView.TargetOf_roles").append('(');
            builder.append("roleName=").append(roleName);
            builder.append(", roleType=").append(roleType);
            builder.append(", userType=").append(userType);
            builder.append(", menus=").append(menus);
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

            private String id;

            private String createBy;

            private Date createDate;

            private String updateBy;

            private Date updateDate;

            private String remarks;

            private String menuName;

            private String menuType;

            private String menuHref;

            private String menuComponent;

            private String menuTarget;

            private String menuIcon;

            private String menuColor;

            private String menuTitle;

            private String permission;

            private BigDecimal weight;

            private Boolean isShow;

            private String sysCode;

            public TargetOf_menus() {
            }

            public TargetOf_menus(@NotNull Menu base) {
                this.id = base.id();
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

            /**
             * 字典类型编码
             * @return 主键值
             */
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

            /**
             * 创建者
             *
             * @return 创建者
             */
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

            /**
             * 创建时间
             *
             * @return 创建时间
             */
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

            /**
             * 更新者
             *
             * @return 更新者
             */
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

            /**
             * 更新时间
             *
             * @return 更新时间
             */
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

            /**
             * 备注信息
             *
             * @return 备注信息
             */
            @Nullable
            public String getRemarks() {
                return remarks;
            }

            public void setRemarks(@Nullable String remarks) {
                this.remarks = remarks;
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
             * 链接
             */
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
             * 图标
             */
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

            /**
             * 颜色
             */
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

            /**
             * 菜单标题
             */
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
             * 是否显示
             */
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

            @Override
            public Menu toEntity() {
                return MenuDraft.$.produce(__draft -> {
                    __draft.setId(id);
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
                builder.append("UserGetView.TargetOf_roles.TargetOf_menus").append('(');
                builder.append("id=").append(id);
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
