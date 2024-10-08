package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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
public class LoginUserInfoView implements View<User> {
    public static final DtoMetadata<User, LoginUserInfoView> METADATA = 
        new DtoMetadata<User, LoginUserInfoView>(
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
                .userWeight()
                .roles(TargetOf_roles.METADATA.getFetcher()),
            LoginUserInfoView::new
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

    private Integer userWeight;

    private List<TargetOf_roles> roles;

    private List<? extends String> permission;

    public LoginUserInfoView() {
    }

    public LoginUserInfoView(@NotNull User base) {
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

    @NotNull
    public List<? extends String> getPermission() {
        if (permission == null) {
            throw new IllegalStateException("The property \"permission\" is not specified");
        }
        return permission;
    }

    public void setPermission(@NotNull List<? extends String> permission) {
        this.permission = permission;
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
        hash = hash * 31 + Objects.hashCode(userWeight);
        hash = hash * 31 + Objects.hashCode(roles);
        hash = hash * 31 + Objects.hashCode(permission);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        LoginUserInfoView other = (LoginUserInfoView) o;
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
        if (!Objects.equals(userWeight, other.userWeight)) {
            return false;
        }
        if (!Objects.equals(roles, other.roles)) {
            return false;
        }
        if (!Objects.equals(permission, other.permission)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("LoginUserInfoView").append('(');
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
        builder.append(", userWeight=").append(userWeight);
        builder.append(", roles=").append(roles);
        builder.append(", permission=").append(permission);
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
                    .roleCode(),
                TargetOf_roles::new
        );

        private String roleName;

        private String roleCode;

        public TargetOf_roles() {
        }

        public TargetOf_roles(@NotNull Role base) {
            this.roleName = base.roleName();
            this.roleCode = base.roleCode();
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
         * 角色编码
         */
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

        @Override
        public Role toEntity() {
            return RoleDraft.$.produce(__draft -> {
                __draft.setRoleName(roleName);
                __draft.setRoleCode(roleCode);
            });
        }

        @Override
        public int hashCode() {
            int hash = Objects.hashCode(roleName);
            hash = hash * 31 + Objects.hashCode(roleCode);
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
            if (!Objects.equals(roleCode, other.roleCode)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("LoginUserInfoView.TargetOf_roles").append('(');
            builder.append("roleName=").append(roleName);
            builder.append(", roleCode=").append(roleCode);
            builder.append(')');
            return builder.toString();
        }
    }
}
