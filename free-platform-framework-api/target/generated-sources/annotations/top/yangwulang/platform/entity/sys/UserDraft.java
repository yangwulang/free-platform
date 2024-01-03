package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;
import org.babyfish.jimmer.runtime.NonSharedList;
import org.babyfish.jimmer.runtime.Visibility;
import org.babyfish.jimmer.sql.ManyToMany;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.BaseEntityDraft;

@GeneratedBy(
        type = User.class
)
public interface UserDraft extends User, BaseEntityDraft {
    UserDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    UserDraft setUserCode(String userCode);

    @OldChain
    UserDraft setStatus(int status);

    @OldChain
    UserDraft setCreateBy(String createBy);

    @OldChain
    UserDraft setCreateDate(Date createDate);

    @OldChain
    UserDraft setUpdateBy(String updateBy);

    @OldChain
    UserDraft setUpdateDate(Date updateDate);

    @OldChain
    UserDraft setRemarks(String remarks);

    @OldChain
    UserDraft setLoginCode(String loginCode);

    @OldChain
    UserDraft setUserName(String userName);

    @OldChain
    UserDraft setPassword(String password);

    @OldChain
    UserDraft setEmail(String email);

    @OldChain
    UserDraft setMobile(String mobile);

    @OldChain
    UserDraft setPhone(String phone);

    @OldChain
    UserDraft setSex(String sex);

    @OldChain
    UserDraft setAvatar(String avatar);

    @OldChain
    UserDraft setSign(String sign);

    @OldChain
    UserDraft setWxOpenId(String wxOpenId);

    @OldChain
    UserDraft setMobileImei(String mobileImei);

    @OldChain
    UserDraft setUserType(String userType);

    @OldChain
    UserDraft setRefCode(String refCode);

    @OldChain
    UserDraft setRefName(String refName);

    @OldChain
    UserDraft setMgrType(String mgrType);

    @OldChain
    UserDraft setPwdSecurityLevel(Integer pwdSecurityLevel);

    @OldChain
    UserDraft setUserWeight(Integer userWeight);

    List<RoleDraft> roles(boolean autoCreate);

    @OldChain
    UserDraft setRoles(List<Role> roles);

    @OldChain
    UserDraft addIntoRoles(DraftConsumer<RoleDraft> block);

    @OldChain
    UserDraft addIntoRoles(Role base, DraftConsumer<RoleDraft> block);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_USER_CODE = 6;

        public static final int SLOT_STATUS = 0;

        public static final int SLOT_CREATE_BY = 1;

        public static final int SLOT_CREATE_DATE = 2;

        public static final int SLOT_UPDATE_BY = 3;

        public static final int SLOT_UPDATE_DATE = 4;

        public static final int SLOT_REMARKS = 5;

        public static final int SLOT_LOGIN_CODE = 7;

        public static final int SLOT_USER_NAME = 8;

        public static final int SLOT_PASSWORD = 9;

        public static final int SLOT_EMAIL = 10;

        public static final int SLOT_MOBILE = 11;

        public static final int SLOT_PHONE = 12;

        public static final int SLOT_SEX = 13;

        public static final int SLOT_AVATAR = 14;

        public static final int SLOT_SIGN = 15;

        public static final int SLOT_WX_OPEN_ID = 16;

        public static final int SLOT_MOBILE_IMEI = 17;

        public static final int SLOT_USER_TYPE = 18;

        public static final int SLOT_REF_CODE = 19;

        public static final int SLOT_REF_NAME = 20;

        public static final int SLOT_MGR_TYPE = 21;

        public static final int SLOT_PWD_SECURITY_LEVEL = 22;

        public static final int SLOT_USER_WEIGHT = 23;

        public static final int SLOT_ROLES = 24;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.54",
                User.class,
                Collections.singleton(BaseEntityDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (User)base)
            )
            .redefine("status", SLOT_STATUS)
            .redefine("createBy", SLOT_CREATE_BY)
            .redefine("createDate", SLOT_CREATE_DATE)
            .redefine("updateBy", SLOT_UPDATE_BY)
            .redefine("updateDate", SLOT_UPDATE_DATE)
            .redefine("remarks", SLOT_REMARKS)
            .id(SLOT_USER_CODE, "userCode", String.class)
            .key(SLOT_LOGIN_CODE, "loginCode", String.class, true)
            .add(SLOT_USER_NAME, "userName", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_PASSWORD, "password", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_EMAIL, "email", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_MOBILE, "mobile", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_PHONE, "phone", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_SEX, "sex", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_AVATAR, "avatar", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_SIGN, "sign", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_WX_OPEN_ID, "wxOpenId", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_MOBILE_IMEI, "mobileImei", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_USER_TYPE, "userType", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_REF_CODE, "refCode", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_REF_NAME, "refName", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_MGR_TYPE, "mgrType", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_PWD_SECURITY_LEVEL, "pwdSecurityLevel", ImmutablePropCategory.SCALAR, Integer.class, true)
            .add(SLOT_USER_WEIGHT, "userWeight", ImmutablePropCategory.SCALAR, Integer.class, true)
            .add(SLOT_ROLES, "roles", ManyToMany.class, Role.class, false)
            .build();

        private Producer() {
        }

        public User produce(DraftConsumer<UserDraft> block) {
            return produce(null, block);
        }

        public User produce(User base, DraftConsumer<UserDraft> block) {
            return (User)Internal.produce(TYPE, base, block);
        }

        public abstract interface Implementor extends User, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_STATUS:
                    		return (Integer)status();
                    case SLOT_CREATE_BY:
                    		return createBy();
                    case SLOT_CREATE_DATE:
                    		return createDate();
                    case SLOT_UPDATE_BY:
                    		return updateBy();
                    case SLOT_UPDATE_DATE:
                    		return updateDate();
                    case SLOT_REMARKS:
                    		return remarks();
                    case SLOT_USER_CODE:
                    		return userCode();
                    case SLOT_LOGIN_CODE:
                    		return loginCode();
                    case SLOT_USER_NAME:
                    		return userName();
                    case SLOT_PASSWORD:
                    		return password();
                    case SLOT_EMAIL:
                    		return email();
                    case SLOT_MOBILE:
                    		return mobile();
                    case SLOT_PHONE:
                    		return phone();
                    case SLOT_SEX:
                    		return sex();
                    case SLOT_AVATAR:
                    		return avatar();
                    case SLOT_SIGN:
                    		return sign();
                    case SLOT_WX_OPEN_ID:
                    		return wxOpenId();
                    case SLOT_MOBILE_IMEI:
                    		return mobileImei();
                    case SLOT_USER_TYPE:
                    		return userType();
                    case SLOT_REF_CODE:
                    		return refCode();
                    case SLOT_REF_NAME:
                    		return refName();
                    case SLOT_MGR_TYPE:
                    		return mgrType();
                    case SLOT_PWD_SECURITY_LEVEL:
                    		return pwdSecurityLevel();
                    case SLOT_USER_WEIGHT:
                    		return userWeight();
                    case SLOT_ROLES:
                    		return roles();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.User\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "status":
                    		return (Integer)status();
                    case "createBy":
                    		return createBy();
                    case "createDate":
                    		return createDate();
                    case "updateBy":
                    		return updateBy();
                    case "updateDate":
                    		return updateDate();
                    case "remarks":
                    		return remarks();
                    case "userCode":
                    		return userCode();
                    case "loginCode":
                    		return loginCode();
                    case "userName":
                    		return userName();
                    case "password":
                    		return password();
                    case "email":
                    		return email();
                    case "mobile":
                    		return mobile();
                    case "phone":
                    		return phone();
                    case "sex":
                    		return sex();
                    case "avatar":
                    		return avatar();
                    case "sign":
                    		return sign();
                    case "wxOpenId":
                    		return wxOpenId();
                    case "mobileImei":
                    		return mobileImei();
                    case "userType":
                    		return userType();
                    case "refCode":
                    		return refCode();
                    case "refName":
                    		return refName();
                    case "mgrType":
                    		return mgrType();
                    case "pwdSecurityLevel":
                    		return pwdSecurityLevel();
                    case "userWeight":
                    		return userWeight();
                    case "roles":
                    		return roles();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.User\": \"" + prop + "\"");
                }
            }

            @JsonIgnore
            default String getUserCode() {
                return userCode();
            }

            @JsonIgnore
            default int getStatus() {
                return status();
            }

            @JsonIgnore
            default String getCreateBy() {
                return createBy();
            }

            @JsonIgnore
            default Date getCreateDate() {
                return createDate();
            }

            @JsonIgnore
            default String getUpdateBy() {
                return updateBy();
            }

            @JsonIgnore
            default Date getUpdateDate() {
                return updateDate();
            }

            @JsonIgnore
            default String getRemarks() {
                return remarks();
            }

            @JsonIgnore
            default String getLoginCode() {
                return loginCode();
            }

            @JsonIgnore
            default String getUserName() {
                return userName();
            }

            @JsonIgnore
            default String getPassword() {
                return password();
            }

            @JsonIgnore
            default String getEmail() {
                return email();
            }

            @JsonIgnore
            default String getMobile() {
                return mobile();
            }

            @JsonIgnore
            default String getPhone() {
                return phone();
            }

            @JsonIgnore
            default String getSex() {
                return sex();
            }

            @JsonIgnore
            default String getAvatar() {
                return avatar();
            }

            @JsonIgnore
            default String getSign() {
                return sign();
            }

            @JsonIgnore
            default String getWxOpenId() {
                return wxOpenId();
            }

            @JsonIgnore
            default String getMobileImei() {
                return mobileImei();
            }

            @JsonIgnore
            default String getUserType() {
                return userType();
            }

            @JsonIgnore
            default String getRefCode() {
                return refCode();
            }

            @JsonIgnore
            default String getRefName() {
                return refName();
            }

            @JsonIgnore
            default String getMgrType() {
                return mgrType();
            }

            @JsonIgnore
            default Integer getPwdSecurityLevel() {
                return pwdSecurityLevel();
            }

            @JsonIgnore
            default Integer getUserWeight() {
                return userWeight();
            }

            @JsonIgnore
            default List<Role> getRoles() {
                return roles();
            }

            @Override
            default ImmutableType __type() {
                return TYPE;
            }

            default int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        private static class Impl implements Implementor, Cloneable, Serializable {
            private Visibility __visibility;

            String __userCodeValue;

            int __statusValue;

            boolean __statusLoaded = false;

            String __createByValue;

            Date __createDateValue;

            String __updateByValue;

            Date __updateDateValue;

            String __remarksValue;

            boolean __remarksLoaded = false;

            String __loginCodeValue;

            boolean __loginCodeLoaded = false;

            String __userNameValue;

            boolean __userNameLoaded = false;

            String __passwordValue;

            boolean __passwordLoaded = false;

            String __emailValue;

            boolean __emailLoaded = false;

            String __mobileValue;

            boolean __mobileLoaded = false;

            String __phoneValue;

            boolean __phoneLoaded = false;

            String __sexValue;

            boolean __sexLoaded = false;

            String __avatarValue;

            boolean __avatarLoaded = false;

            String __signValue;

            boolean __signLoaded = false;

            String __wxOpenIdValue;

            boolean __wxOpenIdLoaded = false;

            String __mobileImeiValue;

            boolean __mobileImeiLoaded = false;

            String __userTypeValue;

            boolean __userTypeLoaded = false;

            String __refCodeValue;

            boolean __refCodeLoaded = false;

            String __refNameValue;

            boolean __refNameLoaded = false;

            String __mgrTypeValue;

            Integer __pwdSecurityLevelValue;

            boolean __pwdSecurityLevelLoaded = false;

            Integer __userWeightValue;

            boolean __userWeightLoaded = false;

            NonSharedList<Role> __rolesValue;

            @Override
            public String userCode() {
                if (__userCodeValue == null) {
                    throw new UnloadedException(User.class, "userCode");
                }
                return __userCodeValue;
            }

            @Override
            public int status() {
                if (!__statusLoaded) {
                    throw new UnloadedException(User.class, "status");
                }
                return __statusValue;
            }

            @Override
            public String createBy() {
                if (__createByValue == null) {
                    throw new UnloadedException(User.class, "createBy");
                }
                return __createByValue;
            }

            @Override
            public Date createDate() {
                if (__createDateValue == null) {
                    throw new UnloadedException(User.class, "createDate");
                }
                return __createDateValue;
            }

            @Override
            public String updateBy() {
                if (__updateByValue == null) {
                    throw new UnloadedException(User.class, "updateBy");
                }
                return __updateByValue;
            }

            @Override
            public Date updateDate() {
                if (__updateDateValue == null) {
                    throw new UnloadedException(User.class, "updateDate");
                }
                return __updateDateValue;
            }

            @Override
            @Nullable
            public String remarks() {
                if (!__remarksLoaded) {
                    throw new UnloadedException(User.class, "remarks");
                }
                return __remarksValue;
            }

            @Override
            @Nullable
            public String loginCode() {
                if (!__loginCodeLoaded) {
                    throw new UnloadedException(User.class, "loginCode");
                }
                return __loginCodeValue;
            }

            @Override
            @Nullable
            public String userName() {
                if (!__userNameLoaded) {
                    throw new UnloadedException(User.class, "userName");
                }
                return __userNameValue;
            }

            @Override
            @Nullable
            public String password() {
                if (!__passwordLoaded) {
                    throw new UnloadedException(User.class, "password");
                }
                return __passwordValue;
            }

            @Override
            @Nullable
            public String email() {
                if (!__emailLoaded) {
                    throw new UnloadedException(User.class, "email");
                }
                return __emailValue;
            }

            @Override
            @Nullable
            public String mobile() {
                if (!__mobileLoaded) {
                    throw new UnloadedException(User.class, "mobile");
                }
                return __mobileValue;
            }

            @Override
            @Nullable
            public String phone() {
                if (!__phoneLoaded) {
                    throw new UnloadedException(User.class, "phone");
                }
                return __phoneValue;
            }

            @Override
            @Nullable
            public String sex() {
                if (!__sexLoaded) {
                    throw new UnloadedException(User.class, "sex");
                }
                return __sexValue;
            }

            @Override
            @Nullable
            public String avatar() {
                if (!__avatarLoaded) {
                    throw new UnloadedException(User.class, "avatar");
                }
                return __avatarValue;
            }

            @Override
            @Nullable
            public String sign() {
                if (!__signLoaded) {
                    throw new UnloadedException(User.class, "sign");
                }
                return __signValue;
            }

            @Override
            @Nullable
            public String wxOpenId() {
                if (!__wxOpenIdLoaded) {
                    throw new UnloadedException(User.class, "wxOpenId");
                }
                return __wxOpenIdValue;
            }

            @Override
            @Nullable
            public String mobileImei() {
                if (!__mobileImeiLoaded) {
                    throw new UnloadedException(User.class, "mobileImei");
                }
                return __mobileImeiValue;
            }

            @Override
            @Nullable
            public String userType() {
                if (!__userTypeLoaded) {
                    throw new UnloadedException(User.class, "userType");
                }
                return __userTypeValue;
            }

            @Override
            @Nullable
            public String refCode() {
                if (!__refCodeLoaded) {
                    throw new UnloadedException(User.class, "refCode");
                }
                return __refCodeValue;
            }

            @Override
            @Nullable
            public String refName() {
                if (!__refNameLoaded) {
                    throw new UnloadedException(User.class, "refName");
                }
                return __refNameValue;
            }

            @Override
            public String mgrType() {
                if (__mgrTypeValue == null) {
                    throw new UnloadedException(User.class, "mgrType");
                }
                return __mgrTypeValue;
            }

            @Override
            @Nullable
            public Integer pwdSecurityLevel() {
                if (!__pwdSecurityLevelLoaded) {
                    throw new UnloadedException(User.class, "pwdSecurityLevel");
                }
                return __pwdSecurityLevelValue;
            }

            @Override
            @Nullable
            public Integer userWeight() {
                if (!__userWeightLoaded) {
                    throw new UnloadedException(User.class, "userWeight");
                }
                return __userWeightValue;
            }

            @Override
            public List<Role> roles() {
                if (__rolesValue == null) {
                    throw new UnloadedException(User.class, "roles");
                }
                return __rolesValue;
            }

            @Override
            public Impl clone() {
                try {
                    return (Impl)super.clone();
                } catch(CloneNotSupportedException ex) {
                    throw new AssertionError(ex);
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isLoaded(prop.asName());
                    case SLOT_STATUS:
                    		return __statusLoaded;
                    case SLOT_CREATE_BY:
                    		return __createByValue != null;
                    case SLOT_CREATE_DATE:
                    		return __createDateValue != null;
                    case SLOT_UPDATE_BY:
                    		return __updateByValue != null;
                    case SLOT_UPDATE_DATE:
                    		return __updateDateValue != null;
                    case SLOT_REMARKS:
                    		return __remarksLoaded;
                    case SLOT_USER_CODE:
                    		return __userCodeValue != null;
                    case SLOT_LOGIN_CODE:
                    		return __loginCodeLoaded;
                    case SLOT_USER_NAME:
                    		return __userNameLoaded;
                    case SLOT_PASSWORD:
                    		return __passwordLoaded;
                    case SLOT_EMAIL:
                    		return __emailLoaded;
                    case SLOT_MOBILE:
                    		return __mobileLoaded;
                    case SLOT_PHONE:
                    		return __phoneLoaded;
                    case SLOT_SEX:
                    		return __sexLoaded;
                    case SLOT_AVATAR:
                    		return __avatarLoaded;
                    case SLOT_SIGN:
                    		return __signLoaded;
                    case SLOT_WX_OPEN_ID:
                    		return __wxOpenIdLoaded;
                    case SLOT_MOBILE_IMEI:
                    		return __mobileImeiLoaded;
                    case SLOT_USER_TYPE:
                    		return __userTypeLoaded;
                    case SLOT_REF_CODE:
                    		return __refCodeLoaded;
                    case SLOT_REF_NAME:
                    		return __refNameLoaded;
                    case SLOT_MGR_TYPE:
                    		return __mgrTypeValue != null;
                    case SLOT_PWD_SECURITY_LEVEL:
                    		return __pwdSecurityLevelLoaded;
                    case SLOT_USER_WEIGHT:
                    		return __userWeightLoaded;
                    case SLOT_ROLES:
                    		return __rolesValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.User\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "status":
                    		return __statusLoaded;
                    case "createBy":
                    		return __createByValue != null;
                    case "createDate":
                    		return __createDateValue != null;
                    case "updateBy":
                    		return __updateByValue != null;
                    case "updateDate":
                    		return __updateDateValue != null;
                    case "remarks":
                    		return __remarksLoaded;
                    case "userCode":
                    		return __userCodeValue != null;
                    case "loginCode":
                    		return __loginCodeLoaded;
                    case "userName":
                    		return __userNameLoaded;
                    case "password":
                    		return __passwordLoaded;
                    case "email":
                    		return __emailLoaded;
                    case "mobile":
                    		return __mobileLoaded;
                    case "phone":
                    		return __phoneLoaded;
                    case "sex":
                    		return __sexLoaded;
                    case "avatar":
                    		return __avatarLoaded;
                    case "sign":
                    		return __signLoaded;
                    case "wxOpenId":
                    		return __wxOpenIdLoaded;
                    case "mobileImei":
                    		return __mobileImeiLoaded;
                    case "userType":
                    		return __userTypeLoaded;
                    case "refCode":
                    		return __refCodeLoaded;
                    case "refName":
                    		return __refNameLoaded;
                    case "mgrType":
                    		return __mgrTypeValue != null;
                    case "pwdSecurityLevel":
                    		return __pwdSecurityLevelLoaded;
                    case "userWeight":
                    		return __userWeightLoaded;
                    case "roles":
                    		return __rolesValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.User\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isVisible(PropId prop) {
                if (__visibility == null) {
                    return true;
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isVisible(prop.asName());
                    case SLOT_STATUS:
                    		return __visibility.visible(SLOT_STATUS);
                    case SLOT_CREATE_BY:
                    		return __visibility.visible(SLOT_CREATE_BY);
                    case SLOT_CREATE_DATE:
                    		return __visibility.visible(SLOT_CREATE_DATE);
                    case SLOT_UPDATE_BY:
                    		return __visibility.visible(SLOT_UPDATE_BY);
                    case SLOT_UPDATE_DATE:
                    		return __visibility.visible(SLOT_UPDATE_DATE);
                    case SLOT_REMARKS:
                    		return __visibility.visible(SLOT_REMARKS);
                    case SLOT_USER_CODE:
                    		return __visibility.visible(SLOT_USER_CODE);
                    case SLOT_LOGIN_CODE:
                    		return __visibility.visible(SLOT_LOGIN_CODE);
                    case SLOT_USER_NAME:
                    		return __visibility.visible(SLOT_USER_NAME);
                    case SLOT_PASSWORD:
                    		return __visibility.visible(SLOT_PASSWORD);
                    case SLOT_EMAIL:
                    		return __visibility.visible(SLOT_EMAIL);
                    case SLOT_MOBILE:
                    		return __visibility.visible(SLOT_MOBILE);
                    case SLOT_PHONE:
                    		return __visibility.visible(SLOT_PHONE);
                    case SLOT_SEX:
                    		return __visibility.visible(SLOT_SEX);
                    case SLOT_AVATAR:
                    		return __visibility.visible(SLOT_AVATAR);
                    case SLOT_SIGN:
                    		return __visibility.visible(SLOT_SIGN);
                    case SLOT_WX_OPEN_ID:
                    		return __visibility.visible(SLOT_WX_OPEN_ID);
                    case SLOT_MOBILE_IMEI:
                    		return __visibility.visible(SLOT_MOBILE_IMEI);
                    case SLOT_USER_TYPE:
                    		return __visibility.visible(SLOT_USER_TYPE);
                    case SLOT_REF_CODE:
                    		return __visibility.visible(SLOT_REF_CODE);
                    case SLOT_REF_NAME:
                    		return __visibility.visible(SLOT_REF_NAME);
                    case SLOT_MGR_TYPE:
                    		return __visibility.visible(SLOT_MGR_TYPE);
                    case SLOT_PWD_SECURITY_LEVEL:
                    		return __visibility.visible(SLOT_PWD_SECURITY_LEVEL);
                    case SLOT_USER_WEIGHT:
                    		return __visibility.visible(SLOT_USER_WEIGHT);
                    case SLOT_ROLES:
                    		return __visibility.visible(SLOT_ROLES);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "status":
                    		return __visibility.visible(SLOT_STATUS);
                    case "createBy":
                    		return __visibility.visible(SLOT_CREATE_BY);
                    case "createDate":
                    		return __visibility.visible(SLOT_CREATE_DATE);
                    case "updateBy":
                    		return __visibility.visible(SLOT_UPDATE_BY);
                    case "updateDate":
                    		return __visibility.visible(SLOT_UPDATE_DATE);
                    case "remarks":
                    		return __visibility.visible(SLOT_REMARKS);
                    case "userCode":
                    		return __visibility.visible(SLOT_USER_CODE);
                    case "loginCode":
                    		return __visibility.visible(SLOT_LOGIN_CODE);
                    case "userName":
                    		return __visibility.visible(SLOT_USER_NAME);
                    case "password":
                    		return __visibility.visible(SLOT_PASSWORD);
                    case "email":
                    		return __visibility.visible(SLOT_EMAIL);
                    case "mobile":
                    		return __visibility.visible(SLOT_MOBILE);
                    case "phone":
                    		return __visibility.visible(SLOT_PHONE);
                    case "sex":
                    		return __visibility.visible(SLOT_SEX);
                    case "avatar":
                    		return __visibility.visible(SLOT_AVATAR);
                    case "sign":
                    		return __visibility.visible(SLOT_SIGN);
                    case "wxOpenId":
                    		return __visibility.visible(SLOT_WX_OPEN_ID);
                    case "mobileImei":
                    		return __visibility.visible(SLOT_MOBILE_IMEI);
                    case "userType":
                    		return __visibility.visible(SLOT_USER_TYPE);
                    case "refCode":
                    		return __visibility.visible(SLOT_REF_CODE);
                    case "refName":
                    		return __visibility.visible(SLOT_REF_NAME);
                    case "mgrType":
                    		return __visibility.visible(SLOT_MGR_TYPE);
                    case "pwdSecurityLevel":
                    		return __visibility.visible(SLOT_PWD_SECURITY_LEVEL);
                    case "userWeight":
                    		return __visibility.visible(SLOT_USER_WEIGHT);
                    case "roles":
                    		return __visibility.visible(SLOT_ROLES);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__userCodeValue != null) {
                    hash = 31 * hash + __userCodeValue.hashCode();
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (__statusLoaded) {
                    hash = 31 * hash + Integer.hashCode(__statusValue);
                }
                if (__createByValue != null) {
                    hash = 31 * hash + __createByValue.hashCode();
                }
                if (__createDateValue != null) {
                    hash = 31 * hash + __createDateValue.hashCode();
                }
                if (__updateByValue != null) {
                    hash = 31 * hash + __updateByValue.hashCode();
                }
                if (__updateDateValue != null) {
                    hash = 31 * hash + __updateDateValue.hashCode();
                }
                if (__remarksLoaded && __remarksValue != null) {
                    hash = 31 * hash + __remarksValue.hashCode();
                }
                if (__loginCodeLoaded && __loginCodeValue != null) {
                    hash = 31 * hash + __loginCodeValue.hashCode();
                }
                if (__userNameLoaded && __userNameValue != null) {
                    hash = 31 * hash + __userNameValue.hashCode();
                }
                if (__passwordLoaded && __passwordValue != null) {
                    hash = 31 * hash + __passwordValue.hashCode();
                }
                if (__emailLoaded && __emailValue != null) {
                    hash = 31 * hash + __emailValue.hashCode();
                }
                if (__mobileLoaded && __mobileValue != null) {
                    hash = 31 * hash + __mobileValue.hashCode();
                }
                if (__phoneLoaded && __phoneValue != null) {
                    hash = 31 * hash + __phoneValue.hashCode();
                }
                if (__sexLoaded && __sexValue != null) {
                    hash = 31 * hash + __sexValue.hashCode();
                }
                if (__avatarLoaded && __avatarValue != null) {
                    hash = 31 * hash + __avatarValue.hashCode();
                }
                if (__signLoaded && __signValue != null) {
                    hash = 31 * hash + __signValue.hashCode();
                }
                if (__wxOpenIdLoaded && __wxOpenIdValue != null) {
                    hash = 31 * hash + __wxOpenIdValue.hashCode();
                }
                if (__mobileImeiLoaded && __mobileImeiValue != null) {
                    hash = 31 * hash + __mobileImeiValue.hashCode();
                }
                if (__userTypeLoaded && __userTypeValue != null) {
                    hash = 31 * hash + __userTypeValue.hashCode();
                }
                if (__refCodeLoaded && __refCodeValue != null) {
                    hash = 31 * hash + __refCodeValue.hashCode();
                }
                if (__refNameLoaded && __refNameValue != null) {
                    hash = 31 * hash + __refNameValue.hashCode();
                }
                if (__mgrTypeValue != null) {
                    hash = 31 * hash + __mgrTypeValue.hashCode();
                }
                if (__pwdSecurityLevelLoaded && __pwdSecurityLevelValue != null) {
                    hash = 31 * hash + __pwdSecurityLevelValue.hashCode();
                }
                if (__userWeightLoaded && __userWeightValue != null) {
                    hash = 31 * hash + __userWeightValue.hashCode();
                }
                if (__rolesValue != null) {
                    hash = 31 * hash + __rolesValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__userCodeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__userCodeValue);
                }
                if (__statusLoaded) {
                    hash = 31 * hash + Integer.hashCode(__statusValue);
                }
                if (__createByValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createByValue);
                }
                if (__createDateValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createDateValue);
                }
                if (__updateByValue != null) {
                    hash = 31 * hash + System.identityHashCode(__updateByValue);
                }
                if (__updateDateValue != null) {
                    hash = 31 * hash + System.identityHashCode(__updateDateValue);
                }
                if (__remarksLoaded) {
                    hash = 31 * hash + System.identityHashCode(__remarksValue);
                }
                if (__loginCodeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__loginCodeValue);
                }
                if (__userNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(__userNameValue);
                }
                if (__passwordLoaded) {
                    hash = 31 * hash + System.identityHashCode(__passwordValue);
                }
                if (__emailLoaded) {
                    hash = 31 * hash + System.identityHashCode(__emailValue);
                }
                if (__mobileLoaded) {
                    hash = 31 * hash + System.identityHashCode(__mobileValue);
                }
                if (__phoneLoaded) {
                    hash = 31 * hash + System.identityHashCode(__phoneValue);
                }
                if (__sexLoaded) {
                    hash = 31 * hash + System.identityHashCode(__sexValue);
                }
                if (__avatarLoaded) {
                    hash = 31 * hash + System.identityHashCode(__avatarValue);
                }
                if (__signLoaded) {
                    hash = 31 * hash + System.identityHashCode(__signValue);
                }
                if (__wxOpenIdLoaded) {
                    hash = 31 * hash + System.identityHashCode(__wxOpenIdValue);
                }
                if (__mobileImeiLoaded) {
                    hash = 31 * hash + System.identityHashCode(__mobileImeiValue);
                }
                if (__userTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__userTypeValue);
                }
                if (__refCodeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__refCodeValue);
                }
                if (__refNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(__refNameValue);
                }
                if (__mgrTypeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__mgrTypeValue);
                }
                if (__pwdSecurityLevelLoaded) {
                    hash = 31 * hash + System.identityHashCode(__pwdSecurityLevelValue);
                }
                if (__userWeightLoaded) {
                    hash = 31 * hash + System.identityHashCode(__userWeightValue);
                }
                if (__rolesValue != null) {
                    hash = 31 * hash + System.identityHashCode(__rolesValue);
                }
                return hash;
            }

            @Override
            public int __hashCode(boolean shallow) {
                return shallow ? __shallowHashCode() : hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_USER_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_USER_CODE))) {
                    return false;
                }
                boolean __userCodeLoaded = __userCodeValue != null;
                if (__userCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER_CODE))) {
                    return false;
                }
                if (__userCodeLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(__userCodeValue, __other.userCode());
                }
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = this.__statusLoaded;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && __statusValue != __other.status()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                boolean __createByLoaded = __createByValue != null;
                if (__createByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                if (__createByLoaded && !Objects.equals(__createByValue, __other.createBy())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                boolean __createDateLoaded = __createDateValue != null;
                if (__createDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                if (__createDateLoaded && !Objects.equals(__createDateValue, __other.createDate())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                boolean __updateByLoaded = __updateByValue != null;
                if (__updateByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                if (__updateByLoaded && !Objects.equals(__updateByValue, __other.updateBy())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                boolean __updateDateLoaded = __updateDateValue != null;
                if (__updateDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                if (__updateDateLoaded && !Objects.equals(__updateDateValue, __other.updateDate())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARKS)) != __other.__isVisible(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                boolean __remarksLoaded = this.__remarksLoaded;
                if (__remarksLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                if (__remarksLoaded && !Objects.equals(__remarksValue, __other.remarks())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_LOGIN_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_LOGIN_CODE))) {
                    return false;
                }
                boolean __loginCodeLoaded = this.__loginCodeLoaded;
                if (__loginCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_LOGIN_CODE))) {
                    return false;
                }
                if (__loginCodeLoaded && !Objects.equals(__loginCodeValue, __other.loginCode())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USER_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_USER_NAME))) {
                    return false;
                }
                boolean __userNameLoaded = this.__userNameLoaded;
                if (__userNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER_NAME))) {
                    return false;
                }
                if (__userNameLoaded && !Objects.equals(__userNameValue, __other.userName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PASSWORD)) != __other.__isVisible(PropId.byIndex(SLOT_PASSWORD))) {
                    return false;
                }
                boolean __passwordLoaded = this.__passwordLoaded;
                if (__passwordLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PASSWORD))) {
                    return false;
                }
                if (__passwordLoaded && !Objects.equals(__passwordValue, __other.password())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EMAIL)) != __other.__isVisible(PropId.byIndex(SLOT_EMAIL))) {
                    return false;
                }
                boolean __emailLoaded = this.__emailLoaded;
                if (__emailLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EMAIL))) {
                    return false;
                }
                if (__emailLoaded && !Objects.equals(__emailValue, __other.email())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MOBILE)) != __other.__isVisible(PropId.byIndex(SLOT_MOBILE))) {
                    return false;
                }
                boolean __mobileLoaded = this.__mobileLoaded;
                if (__mobileLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MOBILE))) {
                    return false;
                }
                if (__mobileLoaded && !Objects.equals(__mobileValue, __other.mobile())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PHONE)) != __other.__isVisible(PropId.byIndex(SLOT_PHONE))) {
                    return false;
                }
                boolean __phoneLoaded = this.__phoneLoaded;
                if (__phoneLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PHONE))) {
                    return false;
                }
                if (__phoneLoaded && !Objects.equals(__phoneValue, __other.phone())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SEX)) != __other.__isVisible(PropId.byIndex(SLOT_SEX))) {
                    return false;
                }
                boolean __sexLoaded = this.__sexLoaded;
                if (__sexLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SEX))) {
                    return false;
                }
                if (__sexLoaded && !Objects.equals(__sexValue, __other.sex())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_AVATAR)) != __other.__isVisible(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                boolean __avatarLoaded = this.__avatarLoaded;
                if (__avatarLoaded != __other.__isLoaded(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                if (__avatarLoaded && !Objects.equals(__avatarValue, __other.avatar())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SIGN)) != __other.__isVisible(PropId.byIndex(SLOT_SIGN))) {
                    return false;
                }
                boolean __signLoaded = this.__signLoaded;
                if (__signLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SIGN))) {
                    return false;
                }
                if (__signLoaded && !Objects.equals(__signValue, __other.sign())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_WX_OPEN_ID)) != __other.__isVisible(PropId.byIndex(SLOT_WX_OPEN_ID))) {
                    return false;
                }
                boolean __wxOpenIdLoaded = this.__wxOpenIdLoaded;
                if (__wxOpenIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_WX_OPEN_ID))) {
                    return false;
                }
                if (__wxOpenIdLoaded && !Objects.equals(__wxOpenIdValue, __other.wxOpenId())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MOBILE_IMEI)) != __other.__isVisible(PropId.byIndex(SLOT_MOBILE_IMEI))) {
                    return false;
                }
                boolean __mobileImeiLoaded = this.__mobileImeiLoaded;
                if (__mobileImeiLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MOBILE_IMEI))) {
                    return false;
                }
                if (__mobileImeiLoaded && !Objects.equals(__mobileImeiValue, __other.mobileImei())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USER_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_USER_TYPE))) {
                    return false;
                }
                boolean __userTypeLoaded = this.__userTypeLoaded;
                if (__userTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER_TYPE))) {
                    return false;
                }
                if (__userTypeLoaded && !Objects.equals(__userTypeValue, __other.userType())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REF_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_REF_CODE))) {
                    return false;
                }
                boolean __refCodeLoaded = this.__refCodeLoaded;
                if (__refCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REF_CODE))) {
                    return false;
                }
                if (__refCodeLoaded && !Objects.equals(__refCodeValue, __other.refCode())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REF_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_REF_NAME))) {
                    return false;
                }
                boolean __refNameLoaded = this.__refNameLoaded;
                if (__refNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REF_NAME))) {
                    return false;
                }
                if (__refNameLoaded && !Objects.equals(__refNameValue, __other.refName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MGR_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_MGR_TYPE))) {
                    return false;
                }
                boolean __mgrTypeLoaded = __mgrTypeValue != null;
                if (__mgrTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MGR_TYPE))) {
                    return false;
                }
                if (__mgrTypeLoaded && !Objects.equals(__mgrTypeValue, __other.mgrType())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PWD_SECURITY_LEVEL)) != __other.__isVisible(PropId.byIndex(SLOT_PWD_SECURITY_LEVEL))) {
                    return false;
                }
                boolean __pwdSecurityLevelLoaded = this.__pwdSecurityLevelLoaded;
                if (__pwdSecurityLevelLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PWD_SECURITY_LEVEL))) {
                    return false;
                }
                if (__pwdSecurityLevelLoaded && !Objects.equals(__pwdSecurityLevelValue, __other.pwdSecurityLevel())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USER_WEIGHT)) != __other.__isVisible(PropId.byIndex(SLOT_USER_WEIGHT))) {
                    return false;
                }
                boolean __userWeightLoaded = this.__userWeightLoaded;
                if (__userWeightLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER_WEIGHT))) {
                    return false;
                }
                if (__userWeightLoaded && !Objects.equals(__userWeightValue, __other.userWeight())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLES)) != __other.__isVisible(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                boolean __rolesLoaded = __rolesValue != null;
                if (__rolesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                if (__rolesLoaded && !Objects.equals(__rolesValue, __other.roles())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_USER_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_USER_CODE))) {
                    return false;
                }
                boolean __userCodeLoaded = __userCodeValue != null;
                if (__userCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER_CODE))) {
                    return false;
                }
                if (__userCodeLoaded && __userCodeValue != __other.userCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = this.__statusLoaded;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && __statusValue != __other.status()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                boolean __createByLoaded = __createByValue != null;
                if (__createByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                if (__createByLoaded && __createByValue != __other.createBy()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                boolean __createDateLoaded = __createDateValue != null;
                if (__createDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                if (__createDateLoaded && __createDateValue != __other.createDate()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                boolean __updateByLoaded = __updateByValue != null;
                if (__updateByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                if (__updateByLoaded && __updateByValue != __other.updateBy()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                boolean __updateDateLoaded = __updateDateValue != null;
                if (__updateDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                if (__updateDateLoaded && __updateDateValue != __other.updateDate()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARKS)) != __other.__isVisible(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                boolean __remarksLoaded = this.__remarksLoaded;
                if (__remarksLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                if (__remarksLoaded && __remarksValue != __other.remarks()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_LOGIN_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_LOGIN_CODE))) {
                    return false;
                }
                boolean __loginCodeLoaded = this.__loginCodeLoaded;
                if (__loginCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_LOGIN_CODE))) {
                    return false;
                }
                if (__loginCodeLoaded && __loginCodeValue != __other.loginCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USER_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_USER_NAME))) {
                    return false;
                }
                boolean __userNameLoaded = this.__userNameLoaded;
                if (__userNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER_NAME))) {
                    return false;
                }
                if (__userNameLoaded && __userNameValue != __other.userName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PASSWORD)) != __other.__isVisible(PropId.byIndex(SLOT_PASSWORD))) {
                    return false;
                }
                boolean __passwordLoaded = this.__passwordLoaded;
                if (__passwordLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PASSWORD))) {
                    return false;
                }
                if (__passwordLoaded && __passwordValue != __other.password()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EMAIL)) != __other.__isVisible(PropId.byIndex(SLOT_EMAIL))) {
                    return false;
                }
                boolean __emailLoaded = this.__emailLoaded;
                if (__emailLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EMAIL))) {
                    return false;
                }
                if (__emailLoaded && __emailValue != __other.email()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MOBILE)) != __other.__isVisible(PropId.byIndex(SLOT_MOBILE))) {
                    return false;
                }
                boolean __mobileLoaded = this.__mobileLoaded;
                if (__mobileLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MOBILE))) {
                    return false;
                }
                if (__mobileLoaded && __mobileValue != __other.mobile()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PHONE)) != __other.__isVisible(PropId.byIndex(SLOT_PHONE))) {
                    return false;
                }
                boolean __phoneLoaded = this.__phoneLoaded;
                if (__phoneLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PHONE))) {
                    return false;
                }
                if (__phoneLoaded && __phoneValue != __other.phone()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SEX)) != __other.__isVisible(PropId.byIndex(SLOT_SEX))) {
                    return false;
                }
                boolean __sexLoaded = this.__sexLoaded;
                if (__sexLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SEX))) {
                    return false;
                }
                if (__sexLoaded && __sexValue != __other.sex()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_AVATAR)) != __other.__isVisible(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                boolean __avatarLoaded = this.__avatarLoaded;
                if (__avatarLoaded != __other.__isLoaded(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                if (__avatarLoaded && __avatarValue != __other.avatar()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SIGN)) != __other.__isVisible(PropId.byIndex(SLOT_SIGN))) {
                    return false;
                }
                boolean __signLoaded = this.__signLoaded;
                if (__signLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SIGN))) {
                    return false;
                }
                if (__signLoaded && __signValue != __other.sign()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_WX_OPEN_ID)) != __other.__isVisible(PropId.byIndex(SLOT_WX_OPEN_ID))) {
                    return false;
                }
                boolean __wxOpenIdLoaded = this.__wxOpenIdLoaded;
                if (__wxOpenIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_WX_OPEN_ID))) {
                    return false;
                }
                if (__wxOpenIdLoaded && __wxOpenIdValue != __other.wxOpenId()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MOBILE_IMEI)) != __other.__isVisible(PropId.byIndex(SLOT_MOBILE_IMEI))) {
                    return false;
                }
                boolean __mobileImeiLoaded = this.__mobileImeiLoaded;
                if (__mobileImeiLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MOBILE_IMEI))) {
                    return false;
                }
                if (__mobileImeiLoaded && __mobileImeiValue != __other.mobileImei()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USER_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_USER_TYPE))) {
                    return false;
                }
                boolean __userTypeLoaded = this.__userTypeLoaded;
                if (__userTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER_TYPE))) {
                    return false;
                }
                if (__userTypeLoaded && __userTypeValue != __other.userType()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REF_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_REF_CODE))) {
                    return false;
                }
                boolean __refCodeLoaded = this.__refCodeLoaded;
                if (__refCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REF_CODE))) {
                    return false;
                }
                if (__refCodeLoaded && __refCodeValue != __other.refCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REF_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_REF_NAME))) {
                    return false;
                }
                boolean __refNameLoaded = this.__refNameLoaded;
                if (__refNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REF_NAME))) {
                    return false;
                }
                if (__refNameLoaded && __refNameValue != __other.refName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MGR_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_MGR_TYPE))) {
                    return false;
                }
                boolean __mgrTypeLoaded = __mgrTypeValue != null;
                if (__mgrTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MGR_TYPE))) {
                    return false;
                }
                if (__mgrTypeLoaded && __mgrTypeValue != __other.mgrType()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PWD_SECURITY_LEVEL)) != __other.__isVisible(PropId.byIndex(SLOT_PWD_SECURITY_LEVEL))) {
                    return false;
                }
                boolean __pwdSecurityLevelLoaded = this.__pwdSecurityLevelLoaded;
                if (__pwdSecurityLevelLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PWD_SECURITY_LEVEL))) {
                    return false;
                }
                if (__pwdSecurityLevelLoaded && __pwdSecurityLevelValue != __other.pwdSecurityLevel()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USER_WEIGHT)) != __other.__isVisible(PropId.byIndex(SLOT_USER_WEIGHT))) {
                    return false;
                }
                boolean __userWeightLoaded = this.__userWeightLoaded;
                if (__userWeightLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER_WEIGHT))) {
                    return false;
                }
                if (__userWeightLoaded && __userWeightValue != __other.userWeight()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLES)) != __other.__isVisible(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                boolean __rolesLoaded = __rolesValue != null;
                if (__rolesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                if (__rolesLoaded && __rolesValue != __other.roles()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }
        }

        private static class DraftImpl implements Implementor, DraftSpi, UserDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, User base) {
                __ctx = ctx;
                if (base != null) {
                    __base = (Impl)base;
                }
                else {
                    __modified = new Impl();
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isLoaded(String prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isVisible(PropId prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public boolean __isVisible(String prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public int hashCode() {
                return (__modified!= null ? __modified : __base).hashCode();
            }

            @Override
            public int __hashCode(boolean shallow) {
                return (__modified!= null ? __modified : __base).__hashCode(shallow);
            }

            @Override
            public boolean equals(Object obj) {
                return (__modified!= null ? __modified : __base).equals(obj);
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return (__modified!= null ? __modified : __base).__equals(obj, shallow);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString((__modified!= null ? __modified : __base));
            }

            @Override
            public String userCode() {
                return (__modified!= null ? __modified : __base).userCode();
            }

            @Override
            public UserDraft setUserCode(String userCode) {
                if (userCode == null) {
                    throw new IllegalArgumentException(
                        "'userCode' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__userCodeValue = userCode;
                return this;
            }

            @Override
            public int status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public UserDraft setStatus(int status) {
                Impl __tmpModified = __modified();
                __tmpModified.__statusValue = status;
                __tmpModified.__statusLoaded = true;
                return this;
            }

            @Override
            public String createBy() {
                return (__modified!= null ? __modified : __base).createBy();
            }

            @Override
            public UserDraft setCreateBy(String createBy) {
                if (createBy == null) {
                    throw new IllegalArgumentException(
                        "'createBy' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__createByValue = createBy;
                return this;
            }

            @Override
            public Date createDate() {
                return (__modified!= null ? __modified : __base).createDate();
            }

            @Override
            public UserDraft setCreateDate(Date createDate) {
                if (createDate == null) {
                    throw new IllegalArgumentException(
                        "'createDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__createDateValue = createDate;
                return this;
            }

            @Override
            public String updateBy() {
                return (__modified!= null ? __modified : __base).updateBy();
            }

            @Override
            public UserDraft setUpdateBy(String updateBy) {
                if (updateBy == null) {
                    throw new IllegalArgumentException(
                        "'updateBy' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__updateByValue = updateBy;
                return this;
            }

            @Override
            public Date updateDate() {
                return (__modified!= null ? __modified : __base).updateDate();
            }

            @Override
            public UserDraft setUpdateDate(Date updateDate) {
                if (updateDate == null) {
                    throw new IllegalArgumentException(
                        "'updateDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__updateDateValue = updateDate;
                return this;
            }

            @Override
            @Nullable
            public String remarks() {
                return (__modified!= null ? __modified : __base).remarks();
            }

            @Override
            public UserDraft setRemarks(String remarks) {
                Impl __tmpModified = __modified();
                __tmpModified.__remarksValue = remarks;
                __tmpModified.__remarksLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String loginCode() {
                return (__modified!= null ? __modified : __base).loginCode();
            }

            @Override
            public UserDraft setLoginCode(String loginCode) {
                Impl __tmpModified = __modified();
                __tmpModified.__loginCodeValue = loginCode;
                __tmpModified.__loginCodeLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String userName() {
                return (__modified!= null ? __modified : __base).userName();
            }

            @Override
            public UserDraft setUserName(String userName) {
                Impl __tmpModified = __modified();
                __tmpModified.__userNameValue = userName;
                __tmpModified.__userNameLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String password() {
                return (__modified!= null ? __modified : __base).password();
            }

            @Override
            public UserDraft setPassword(String password) {
                Impl __tmpModified = __modified();
                __tmpModified.__passwordValue = password;
                __tmpModified.__passwordLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String email() {
                return (__modified!= null ? __modified : __base).email();
            }

            @Override
            public UserDraft setEmail(String email) {
                Impl __tmpModified = __modified();
                __tmpModified.__emailValue = email;
                __tmpModified.__emailLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String mobile() {
                return (__modified!= null ? __modified : __base).mobile();
            }

            @Override
            public UserDraft setMobile(String mobile) {
                Impl __tmpModified = __modified();
                __tmpModified.__mobileValue = mobile;
                __tmpModified.__mobileLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String phone() {
                return (__modified!= null ? __modified : __base).phone();
            }

            @Override
            public UserDraft setPhone(String phone) {
                Impl __tmpModified = __modified();
                __tmpModified.__phoneValue = phone;
                __tmpModified.__phoneLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String sex() {
                return (__modified!= null ? __modified : __base).sex();
            }

            @Override
            public UserDraft setSex(String sex) {
                Impl __tmpModified = __modified();
                __tmpModified.__sexValue = sex;
                __tmpModified.__sexLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String avatar() {
                return (__modified!= null ? __modified : __base).avatar();
            }

            @Override
            public UserDraft setAvatar(String avatar) {
                Impl __tmpModified = __modified();
                __tmpModified.__avatarValue = avatar;
                __tmpModified.__avatarLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String sign() {
                return (__modified!= null ? __modified : __base).sign();
            }

            @Override
            public UserDraft setSign(String sign) {
                Impl __tmpModified = __modified();
                __tmpModified.__signValue = sign;
                __tmpModified.__signLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String wxOpenId() {
                return (__modified!= null ? __modified : __base).wxOpenId();
            }

            @Override
            public UserDraft setWxOpenId(String wxOpenId) {
                Impl __tmpModified = __modified();
                __tmpModified.__wxOpenIdValue = wxOpenId;
                __tmpModified.__wxOpenIdLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String mobileImei() {
                return (__modified!= null ? __modified : __base).mobileImei();
            }

            @Override
            public UserDraft setMobileImei(String mobileImei) {
                Impl __tmpModified = __modified();
                __tmpModified.__mobileImeiValue = mobileImei;
                __tmpModified.__mobileImeiLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String userType() {
                return (__modified!= null ? __modified : __base).userType();
            }

            @Override
            public UserDraft setUserType(String userType) {
                Impl __tmpModified = __modified();
                __tmpModified.__userTypeValue = userType;
                __tmpModified.__userTypeLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String refCode() {
                return (__modified!= null ? __modified : __base).refCode();
            }

            @Override
            public UserDraft setRefCode(String refCode) {
                Impl __tmpModified = __modified();
                __tmpModified.__refCodeValue = refCode;
                __tmpModified.__refCodeLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String refName() {
                return (__modified!= null ? __modified : __base).refName();
            }

            @Override
            public UserDraft setRefName(String refName) {
                Impl __tmpModified = __modified();
                __tmpModified.__refNameValue = refName;
                __tmpModified.__refNameLoaded = true;
                return this;
            }

            @Override
            public String mgrType() {
                return (__modified!= null ? __modified : __base).mgrType();
            }

            @Override
            public UserDraft setMgrType(String mgrType) {
                if (mgrType == null) {
                    throw new IllegalArgumentException(
                        "'mgrType' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__mgrTypeValue = mgrType;
                return this;
            }

            @Override
            @Nullable
            public Integer pwdSecurityLevel() {
                return (__modified!= null ? __modified : __base).pwdSecurityLevel();
            }

            @Override
            public UserDraft setPwdSecurityLevel(Integer pwdSecurityLevel) {
                Impl __tmpModified = __modified();
                __tmpModified.__pwdSecurityLevelValue = pwdSecurityLevel;
                __tmpModified.__pwdSecurityLevelLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public Integer userWeight() {
                return (__modified!= null ? __modified : __base).userWeight();
            }

            @Override
            public UserDraft setUserWeight(Integer userWeight) {
                Impl __tmpModified = __modified();
                __tmpModified.__userWeightValue = userWeight;
                __tmpModified.__userWeightLoaded = true;
                return this;
            }

            @Override
            public List<Role> roles() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).roles(), Role.class, true);
            }

            @Override
            public List<RoleDraft> roles(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_ROLES)))) {
                    setRoles(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).roles(), Role.class, true);
            }

            @Override
            public UserDraft setRoles(List<Role> roles) {
                if (roles == null) {
                    throw new IllegalArgumentException(
                        "'roles' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__rolesValue = NonSharedList.of(__tmpModified.__rolesValue, roles);
                return this;
            }

            @Override
            public UserDraft addIntoRoles(DraftConsumer<RoleDraft> block) {
                addIntoRoles(null, block);
                return this;
            }

            @Override
            public UserDraft addIntoRoles(Role base, DraftConsumer<RoleDraft> block) {
                roles(true).add((RoleDraft)RoleDraft.$.produce(base, block));
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(PropId prop, Object value) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__set(prop.asName(), value);
                    return;
                    case SLOT_STATUS:
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null");
                            setStatus((Integer)value);
                            break;
                    case SLOT_CREATE_BY:
                    		setCreateBy((String)value);break;
                    case SLOT_CREATE_DATE:
                    		setCreateDate((Date)value);break;
                    case SLOT_UPDATE_BY:
                    		setUpdateBy((String)value);break;
                    case SLOT_UPDATE_DATE:
                    		setUpdateDate((Date)value);break;
                    case SLOT_REMARKS:
                    		setRemarks((String)value);break;
                    case SLOT_USER_CODE:
                    		setUserCode((String)value);break;
                    case SLOT_LOGIN_CODE:
                    		setLoginCode((String)value);break;
                    case SLOT_USER_NAME:
                    		setUserName((String)value);break;
                    case SLOT_PASSWORD:
                    		setPassword((String)value);break;
                    case SLOT_EMAIL:
                    		setEmail((String)value);break;
                    case SLOT_MOBILE:
                    		setMobile((String)value);break;
                    case SLOT_PHONE:
                    		setPhone((String)value);break;
                    case SLOT_SEX:
                    		setSex((String)value);break;
                    case SLOT_AVATAR:
                    		setAvatar((String)value);break;
                    case SLOT_SIGN:
                    		setSign((String)value);break;
                    case SLOT_WX_OPEN_ID:
                    		setWxOpenId((String)value);break;
                    case SLOT_MOBILE_IMEI:
                    		setMobileImei((String)value);break;
                    case SLOT_USER_TYPE:
                    		setUserType((String)value);break;
                    case SLOT_REF_CODE:
                    		setRefCode((String)value);break;
                    case SLOT_REF_NAME:
                    		setRefName((String)value);break;
                    case SLOT_MGR_TYPE:
                    		setMgrType((String)value);break;
                    case SLOT_PWD_SECURITY_LEVEL:
                    		setPwdSecurityLevel((Integer)value);break;
                    case SLOT_USER_WEIGHT:
                    		setUserWeight((Integer)value);break;
                    case SLOT_ROLES:
                    		setRoles((List<Role>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.User\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "status":
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null");
                            setStatus((Integer)value);
                            break;
                    case "createBy":
                    		setCreateBy((String)value);break;
                    case "createDate":
                    		setCreateDate((Date)value);break;
                    case "updateBy":
                    		setUpdateBy((String)value);break;
                    case "updateDate":
                    		setUpdateDate((Date)value);break;
                    case "remarks":
                    		setRemarks((String)value);break;
                    case "userCode":
                    		setUserCode((String)value);break;
                    case "loginCode":
                    		setLoginCode((String)value);break;
                    case "userName":
                    		setUserName((String)value);break;
                    case "password":
                    		setPassword((String)value);break;
                    case "email":
                    		setEmail((String)value);break;
                    case "mobile":
                    		setMobile((String)value);break;
                    case "phone":
                    		setPhone((String)value);break;
                    case "sex":
                    		setSex((String)value);break;
                    case "avatar":
                    		setAvatar((String)value);break;
                    case "sign":
                    		setSign((String)value);break;
                    case "wxOpenId":
                    		setWxOpenId((String)value);break;
                    case "mobileImei":
                    		setMobileImei((String)value);break;
                    case "userType":
                    		setUserType((String)value);break;
                    case "refCode":
                    		setRefCode((String)value);break;
                    case "refName":
                    		setRefName((String)value);break;
                    case "mgrType":
                    		setMgrType((String)value);break;
                    case "pwdSecurityLevel":
                    		setPwdSecurityLevel((Integer)value);break;
                    case "userWeight":
                    		setUserWeight((Integer)value);break;
                    case "roles":
                    		setRoles((List<Role>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.User\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(25);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_STATUS:
                    		__visibility.show(SLOT_STATUS, visible);break;
                    case SLOT_CREATE_BY:
                    		__visibility.show(SLOT_CREATE_BY, visible);break;
                    case SLOT_CREATE_DATE:
                    		__visibility.show(SLOT_CREATE_DATE, visible);break;
                    case SLOT_UPDATE_BY:
                    		__visibility.show(SLOT_UPDATE_BY, visible);break;
                    case SLOT_UPDATE_DATE:
                    		__visibility.show(SLOT_UPDATE_DATE, visible);break;
                    case SLOT_REMARKS:
                    		__visibility.show(SLOT_REMARKS, visible);break;
                    case SLOT_USER_CODE:
                    		__visibility.show(SLOT_USER_CODE, visible);break;
                    case SLOT_LOGIN_CODE:
                    		__visibility.show(SLOT_LOGIN_CODE, visible);break;
                    case SLOT_USER_NAME:
                    		__visibility.show(SLOT_USER_NAME, visible);break;
                    case SLOT_PASSWORD:
                    		__visibility.show(SLOT_PASSWORD, visible);break;
                    case SLOT_EMAIL:
                    		__visibility.show(SLOT_EMAIL, visible);break;
                    case SLOT_MOBILE:
                    		__visibility.show(SLOT_MOBILE, visible);break;
                    case SLOT_PHONE:
                    		__visibility.show(SLOT_PHONE, visible);break;
                    case SLOT_SEX:
                    		__visibility.show(SLOT_SEX, visible);break;
                    case SLOT_AVATAR:
                    		__visibility.show(SLOT_AVATAR, visible);break;
                    case SLOT_SIGN:
                    		__visibility.show(SLOT_SIGN, visible);break;
                    case SLOT_WX_OPEN_ID:
                    		__visibility.show(SLOT_WX_OPEN_ID, visible);break;
                    case SLOT_MOBILE_IMEI:
                    		__visibility.show(SLOT_MOBILE_IMEI, visible);break;
                    case SLOT_USER_TYPE:
                    		__visibility.show(SLOT_USER_TYPE, visible);break;
                    case SLOT_REF_CODE:
                    		__visibility.show(SLOT_REF_CODE, visible);break;
                    case SLOT_REF_NAME:
                    		__visibility.show(SLOT_REF_NAME, visible);break;
                    case SLOT_MGR_TYPE:
                    		__visibility.show(SLOT_MGR_TYPE, visible);break;
                    case SLOT_PWD_SECURITY_LEVEL:
                    		__visibility.show(SLOT_PWD_SECURITY_LEVEL, visible);break;
                    case SLOT_USER_WEIGHT:
                    		__visibility.show(SLOT_USER_WEIGHT, visible);break;
                    case SLOT_ROLES:
                    		__visibility.show(SLOT_ROLES, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.User\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __show(String prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(25);
                }
                switch (prop) {
                    case "status":
                    		__visibility.show(SLOT_STATUS, visible);break;
                    case "createBy":
                    		__visibility.show(SLOT_CREATE_BY, visible);break;
                    case "createDate":
                    		__visibility.show(SLOT_CREATE_DATE, visible);break;
                    case "updateBy":
                    		__visibility.show(SLOT_UPDATE_BY, visible);break;
                    case "updateDate":
                    		__visibility.show(SLOT_UPDATE_DATE, visible);break;
                    case "remarks":
                    		__visibility.show(SLOT_REMARKS, visible);break;
                    case "userCode":
                    		__visibility.show(SLOT_USER_CODE, visible);break;
                    case "loginCode":
                    		__visibility.show(SLOT_LOGIN_CODE, visible);break;
                    case "userName":
                    		__visibility.show(SLOT_USER_NAME, visible);break;
                    case "password":
                    		__visibility.show(SLOT_PASSWORD, visible);break;
                    case "email":
                    		__visibility.show(SLOT_EMAIL, visible);break;
                    case "mobile":
                    		__visibility.show(SLOT_MOBILE, visible);break;
                    case "phone":
                    		__visibility.show(SLOT_PHONE, visible);break;
                    case "sex":
                    		__visibility.show(SLOT_SEX, visible);break;
                    case "avatar":
                    		__visibility.show(SLOT_AVATAR, visible);break;
                    case "sign":
                    		__visibility.show(SLOT_SIGN, visible);break;
                    case "wxOpenId":
                    		__visibility.show(SLOT_WX_OPEN_ID, visible);break;
                    case "mobileImei":
                    		__visibility.show(SLOT_MOBILE_IMEI, visible);break;
                    case "userType":
                    		__visibility.show(SLOT_USER_TYPE, visible);break;
                    case "refCode":
                    		__visibility.show(SLOT_REF_CODE, visible);break;
                    case "refName":
                    		__visibility.show(SLOT_REF_NAME, visible);break;
                    case "mgrType":
                    		__visibility.show(SLOT_MGR_TYPE, visible);break;
                    case "pwdSecurityLevel":
                    		__visibility.show(SLOT_PWD_SECURITY_LEVEL, visible);break;
                    case "userWeight":
                    		__visibility.show(SLOT_USER_WEIGHT, visible);break;
                    case "roles":
                    		__visibility.show(SLOT_ROLES, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.User\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __unload(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__unload(prop.asName());
                    return;
                    case SLOT_STATUS:
                    		__modified().__statusLoaded = false;break;
                    case SLOT_CREATE_BY:
                    		__modified().__createByValue = null;break;
                    case SLOT_CREATE_DATE:
                    		__modified().__createDateValue = null;break;
                    case SLOT_UPDATE_BY:
                    		__modified().__updateByValue = null;break;
                    case SLOT_UPDATE_DATE:
                    		__modified().__updateDateValue = null;break;
                    case SLOT_REMARKS:
                    		__modified().__remarksLoaded = false;break;
                    case SLOT_USER_CODE:
                    		__modified().__userCodeValue = null;break;
                    case SLOT_LOGIN_CODE:
                    		__modified().__loginCodeLoaded = false;break;
                    case SLOT_USER_NAME:
                    		__modified().__userNameLoaded = false;break;
                    case SLOT_PASSWORD:
                    		__modified().__passwordLoaded = false;break;
                    case SLOT_EMAIL:
                    		__modified().__emailLoaded = false;break;
                    case SLOT_MOBILE:
                    		__modified().__mobileLoaded = false;break;
                    case SLOT_PHONE:
                    		__modified().__phoneLoaded = false;break;
                    case SLOT_SEX:
                    		__modified().__sexLoaded = false;break;
                    case SLOT_AVATAR:
                    		__modified().__avatarLoaded = false;break;
                    case SLOT_SIGN:
                    		__modified().__signLoaded = false;break;
                    case SLOT_WX_OPEN_ID:
                    		__modified().__wxOpenIdLoaded = false;break;
                    case SLOT_MOBILE_IMEI:
                    		__modified().__mobileImeiLoaded = false;break;
                    case SLOT_USER_TYPE:
                    		__modified().__userTypeLoaded = false;break;
                    case SLOT_REF_CODE:
                    		__modified().__refCodeLoaded = false;break;
                    case SLOT_REF_NAME:
                    		__modified().__refNameLoaded = false;break;
                    case SLOT_MGR_TYPE:
                    		__modified().__mgrTypeValue = null;break;
                    case SLOT_PWD_SECURITY_LEVEL:
                    		__modified().__pwdSecurityLevelLoaded = false;break;
                    case SLOT_USER_WEIGHT:
                    		__modified().__userWeightLoaded = false;break;
                    case SLOT_ROLES:
                    		__modified().__rolesValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.User\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "status":
                    		__modified().__statusLoaded = false;break;
                    case "createBy":
                    		__modified().__createByValue = null;break;
                    case "createDate":
                    		__modified().__createDateValue = null;break;
                    case "updateBy":
                    		__modified().__updateByValue = null;break;
                    case "updateDate":
                    		__modified().__updateDateValue = null;break;
                    case "remarks":
                    		__modified().__remarksLoaded = false;break;
                    case "userCode":
                    		__modified().__userCodeValue = null;break;
                    case "loginCode":
                    		__modified().__loginCodeLoaded = false;break;
                    case "userName":
                    		__modified().__userNameLoaded = false;break;
                    case "password":
                    		__modified().__passwordLoaded = false;break;
                    case "email":
                    		__modified().__emailLoaded = false;break;
                    case "mobile":
                    		__modified().__mobileLoaded = false;break;
                    case "phone":
                    		__modified().__phoneLoaded = false;break;
                    case "sex":
                    		__modified().__sexLoaded = false;break;
                    case "avatar":
                    		__modified().__avatarLoaded = false;break;
                    case "sign":
                    		__modified().__signLoaded = false;break;
                    case "wxOpenId":
                    		__modified().__wxOpenIdLoaded = false;break;
                    case "mobileImei":
                    		__modified().__mobileImeiLoaded = false;break;
                    case "userType":
                    		__modified().__userTypeLoaded = false;break;
                    case "refCode":
                    		__modified().__refCodeLoaded = false;break;
                    case "refName":
                    		__modified().__refNameLoaded = false;break;
                    case "mgrType":
                    		__modified().__mgrTypeValue = null;break;
                    case "pwdSecurityLevel":
                    		__modified().__pwdSecurityLevelLoaded = false;break;
                    case "userWeight":
                    		__modified().__userWeightLoaded = false;break;
                    case "roles":
                    		__modified().__rolesValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.User\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public DraftContext __draftContext() {
                return __ctx;
            }

            @Override
            public Object __resolve() {
                if (__resolving) {
                    throw new CircularReferenceException();
                }
                __resolving = true;
                try {
                    Implementor base = __base;
                    Impl __tmpModified = __modified;
                    if (__tmpModified == null) {
                        if (base.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                            List<Role> oldValue = base.roles();
                            List<Role> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setRoles(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__rolesValue = NonSharedList.of(__tmpModified.__rolesValue, __ctx.resolveList(__tmpModified.__rolesValue));
                    }
                    if (__base != null && __tmpModified == null) {
                        return base;
                    }
                    return __tmpModified;
                }
                finally {
                    __resolving = false;
                }
            }

            private Impl __modified() {
                Impl __tmpModified = __modified;
                if (__tmpModified == null) {
                    __tmpModified = __base.clone();
                    __modified = __tmpModified;
                }
                return __tmpModified;
            }
        }
    }

    class MapStruct {
        private String userCode;

        private Integer status;

        private String createBy;

        private Date createDate;

        private String updateBy;

        private Date updateDate;

        private boolean __remarksLoaded;

        private String remarks;

        private boolean __loginCodeLoaded;

        private String loginCode;

        private boolean __userNameLoaded;

        private String userName;

        private boolean __passwordLoaded;

        private String password;

        private boolean __emailLoaded;

        private String email;

        private boolean __mobileLoaded;

        private String mobile;

        private boolean __phoneLoaded;

        private String phone;

        private boolean __sexLoaded;

        private String sex;

        private boolean __avatarLoaded;

        private String avatar;

        private boolean __signLoaded;

        private String sign;

        private boolean __wxOpenIdLoaded;

        private String wxOpenId;

        private boolean __mobileImeiLoaded;

        private String mobileImei;

        private boolean __userTypeLoaded;

        private String userType;

        private boolean __refCodeLoaded;

        private String refCode;

        private boolean __refNameLoaded;

        private String refName;

        private String mgrType;

        private boolean __pwdSecurityLevelLoaded;

        private Integer pwdSecurityLevel;

        private boolean __userWeightLoaded;

        private Integer userWeight;

        private List<Role> roles;

        public MapStruct userCode(String userCode) {
            this.userCode = userCode;
            return this;
        }

        public MapStruct status(Integer status) {
            this.status = status;
            return this;
        }

        public MapStruct createBy(String createBy) {
            this.createBy = createBy;
            return this;
        }

        public MapStruct createDate(Date createDate) {
            this.createDate = createDate;
            return this;
        }

        public MapStruct updateBy(String updateBy) {
            this.updateBy = updateBy;
            return this;
        }

        public MapStruct updateDate(Date updateDate) {
            this.updateDate = updateDate;
            return this;
        }

        public MapStruct remarks(String remarks) {
            this.__remarksLoaded = true;
            this.remarks = remarks;
            return this;
        }

        public MapStruct loginCode(String loginCode) {
            this.__loginCodeLoaded = true;
            this.loginCode = loginCode;
            return this;
        }

        public MapStruct userName(String userName) {
            this.__userNameLoaded = true;
            this.userName = userName;
            return this;
        }

        public MapStruct password(String password) {
            this.__passwordLoaded = true;
            this.password = password;
            return this;
        }

        public MapStruct email(String email) {
            this.__emailLoaded = true;
            this.email = email;
            return this;
        }

        public MapStruct mobile(String mobile) {
            this.__mobileLoaded = true;
            this.mobile = mobile;
            return this;
        }

        public MapStruct phone(String phone) {
            this.__phoneLoaded = true;
            this.phone = phone;
            return this;
        }

        public MapStruct sex(String sex) {
            this.__sexLoaded = true;
            this.sex = sex;
            return this;
        }

        public MapStruct avatar(String avatar) {
            this.__avatarLoaded = true;
            this.avatar = avatar;
            return this;
        }

        public MapStruct sign(String sign) {
            this.__signLoaded = true;
            this.sign = sign;
            return this;
        }

        public MapStruct wxOpenId(String wxOpenId) {
            this.__wxOpenIdLoaded = true;
            this.wxOpenId = wxOpenId;
            return this;
        }

        public MapStruct mobileImei(String mobileImei) {
            this.__mobileImeiLoaded = true;
            this.mobileImei = mobileImei;
            return this;
        }

        public MapStruct userType(String userType) {
            this.__userTypeLoaded = true;
            this.userType = userType;
            return this;
        }

        public MapStruct refCode(String refCode) {
            this.__refCodeLoaded = true;
            this.refCode = refCode;
            return this;
        }

        public MapStruct refName(String refName) {
            this.__refNameLoaded = true;
            this.refName = refName;
            return this;
        }

        public MapStruct mgrType(String mgrType) {
            this.mgrType = mgrType;
            return this;
        }

        public MapStruct pwdSecurityLevel(Integer pwdSecurityLevel) {
            this.__pwdSecurityLevelLoaded = true;
            this.pwdSecurityLevel = pwdSecurityLevel;
            return this;
        }

        public MapStruct userWeight(Integer userWeight) {
            this.__userWeightLoaded = true;
            this.userWeight = userWeight;
            return this;
        }

        public MapStruct roles(List<Role> roles) {
            this.roles = roles != null ? roles : Collections.emptyList();
            return this;
        }

        public User build() {
            return UserDraft.$.produce(draft -> {
                if (userCode != null) {
                    draft.setUserCode(userCode);
                }
                if (status != null) {
                    draft.setStatus(status);
                }
                if (createBy != null) {
                    draft.setCreateBy(createBy);
                }
                if (createDate != null) {
                    draft.setCreateDate(createDate);
                }
                if (updateBy != null) {
                    draft.setUpdateBy(updateBy);
                }
                if (updateDate != null) {
                    draft.setUpdateDate(updateDate);
                }
                if (__remarksLoaded) {
                    draft.setRemarks(remarks);
                }
                if (__loginCodeLoaded) {
                    draft.setLoginCode(loginCode);
                }
                if (__userNameLoaded) {
                    draft.setUserName(userName);
                }
                if (__passwordLoaded) {
                    draft.setPassword(password);
                }
                if (__emailLoaded) {
                    draft.setEmail(email);
                }
                if (__mobileLoaded) {
                    draft.setMobile(mobile);
                }
                if (__phoneLoaded) {
                    draft.setPhone(phone);
                }
                if (__sexLoaded) {
                    draft.setSex(sex);
                }
                if (__avatarLoaded) {
                    draft.setAvatar(avatar);
                }
                if (__signLoaded) {
                    draft.setSign(sign);
                }
                if (__wxOpenIdLoaded) {
                    draft.setWxOpenId(wxOpenId);
                }
                if (__mobileImeiLoaded) {
                    draft.setMobileImei(mobileImei);
                }
                if (__userTypeLoaded) {
                    draft.setUserType(userType);
                }
                if (__refCodeLoaded) {
                    draft.setRefCode(refCode);
                }
                if (__refNameLoaded) {
                    draft.setRefName(refName);
                }
                if (mgrType != null) {
                    draft.setMgrType(mgrType);
                }
                if (__pwdSecurityLevelLoaded) {
                    draft.setPwdSecurityLevel(pwdSecurityLevel);
                }
                if (__userWeightLoaded) {
                    draft.setUserWeight(userWeight);
                }
                if (roles != null) {
                    draft.setRoles(roles);
                }
            });
        }
    }
}
