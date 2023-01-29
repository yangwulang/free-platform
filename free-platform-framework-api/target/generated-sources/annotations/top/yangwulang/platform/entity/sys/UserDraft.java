package top.yangwulang.platform.entity.sys;

import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.Date;
import java.util.Objects;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.Draft;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;

public interface UserDraft extends User, Draft {
    UserDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    UserDraft setUserCode(String userCode);

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

    @OldChain
    UserDraft setStatus(String status);

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

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                User.class,
                null,
                (ctx, base) -> new DraftImpl(ctx, (User)base)
            )
            .id(1, "userCode", String.class)
            .key(2, "loginCode", String.class)
            .add(3, "userName", ImmutablePropCategory.SCALAR, String.class, true)
            .add(4, "password", ImmutablePropCategory.SCALAR, String.class, true)
            .add(5, "email", ImmutablePropCategory.SCALAR, String.class, true)
            .add(6, "mobile", ImmutablePropCategory.SCALAR, String.class, true)
            .add(7, "phone", ImmutablePropCategory.SCALAR, String.class, true)
            .add(8, "sex", ImmutablePropCategory.SCALAR, String.class, true)
            .add(9, "avatar", ImmutablePropCategory.SCALAR, String.class, true)
            .add(10, "sign", ImmutablePropCategory.SCALAR, String.class, true)
            .add(11, "wxOpenId", ImmutablePropCategory.SCALAR, String.class, true)
            .add(12, "mobileImei", ImmutablePropCategory.SCALAR, String.class, true)
            .add(13, "userType", ImmutablePropCategory.SCALAR, String.class, false)
            .add(14, "refCode", ImmutablePropCategory.SCALAR, String.class, true)
            .add(15, "refName", ImmutablePropCategory.SCALAR, String.class, true)
            .add(16, "mgrType", ImmutablePropCategory.SCALAR, String.class, false)
            .add(17, "pwdSecurityLevel", ImmutablePropCategory.SCALAR, Integer.class, true)
            .add(18, "userWeight", ImmutablePropCategory.SCALAR, Integer.class, true)
            .add(19, "status", ImmutablePropCategory.SCALAR, String.class, false)
            .add(20, "createBy", ImmutablePropCategory.SCALAR, String.class, false)
            .add(21, "createDate", ImmutablePropCategory.SCALAR, Date.class, false)
            .add(22, "updateBy", ImmutablePropCategory.SCALAR, String.class, false)
            .add(23, "updateDate", ImmutablePropCategory.SCALAR, Date.class, false)
            .add(24, "remarks", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public User produce(DraftConsumer<UserDraft> block) {
            return produce(null, block);
        }

        public User produce(User base, DraftConsumer<UserDraft> block) {
            return (User)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements User, ImmutableSpi {
            @Override
            public Object __get(int prop) {
                switch (prop) {
                    case 1: return userCode();
                    case 2: return loginCode();
                    case 3: return userName();
                    case 4: return password();
                    case 5: return email();
                    case 6: return mobile();
                    case 7: return phone();
                    case 8: return sex();
                    case 9: return avatar();
                    case 10: return sign();
                    case 11: return wxOpenId();
                    case 12: return mobileImei();
                    case 13: return userType();
                    case 14: return refCode();
                    case 15: return refName();
                    case 16: return mgrType();
                    case 17: return pwdSecurityLevel();
                    case 18: return userWeight();
                    case 19: return status();
                    case 20: return createBy();
                    case 21: return createDate();
                    case 22: return updateBy();
                    case 23: return updateDate();
                    case 24: return remarks();
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public Object __get(String prop) {
                switch (prop) {
                    case "userCode": return userCode();
                    case "loginCode": return loginCode();
                    case "userName": return userName();
                    case "password": return password();
                    case "email": return email();
                    case "mobile": return mobile();
                    case "phone": return phone();
                    case "sex": return sex();
                    case "avatar": return avatar();
                    case "sign": return sign();
                    case "wxOpenId": return wxOpenId();
                    case "mobileImei": return mobileImei();
                    case "userType": return userType();
                    case "refCode": return refCode();
                    case "refName": return refName();
                    case "mgrType": return mgrType();
                    case "pwdSecurityLevel": return pwdSecurityLevel();
                    case "userWeight": return userWeight();
                    case "status": return status();
                    case "createBy": return createBy();
                    case "createDate": return createDate();
                    case "updateBy": return updateBy();
                    case "updateDate": return updateDate();
                    case "remarks": return remarks();
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public ImmutableType __type() {
                return TYPE;
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }

            public int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        private static class Impl extends Implementor implements Cloneable {
            String userCode;

            String loginCode;

            boolean loginCodeLoaded = false;

            String userName;

            boolean userNameLoaded = false;

            String password;

            boolean passwordLoaded = false;

            String email;

            boolean emailLoaded = false;

            String mobile;

            boolean mobileLoaded = false;

            String phone;

            boolean phoneLoaded = false;

            String sex;

            boolean sexLoaded = false;

            String avatar;

            boolean avatarLoaded = false;

            String sign;

            boolean signLoaded = false;

            String wxOpenId;

            boolean wxOpenIdLoaded = false;

            String mobileImei;

            boolean mobileImeiLoaded = false;

            String userType;

            String refCode;

            boolean refCodeLoaded = false;

            String refName;

            boolean refNameLoaded = false;

            String mgrType;

            Integer pwdSecurityLevel;

            boolean pwdSecurityLevelLoaded = false;

            Integer userWeight;

            boolean userWeightLoaded = false;

            String status;

            String createBy;

            Date createDate;

            String updateBy;

            Date updateDate;

            String remarks;

            boolean remarksLoaded = false;

            @Override
            public String userCode() {
                if (userCode == null) {
                    throw new UnloadedException(User.class, "userCode");
                }
                return userCode;
            }

            @Override
            public String loginCode() {
                if (!loginCodeLoaded) {
                    throw new UnloadedException(User.class, "loginCode");
                }
                return loginCode;
            }

            @Override
            public String userName() {
                if (!userNameLoaded) {
                    throw new UnloadedException(User.class, "userName");
                }
                return userName;
            }

            @Override
            public String password() {
                if (!passwordLoaded) {
                    throw new UnloadedException(User.class, "password");
                }
                return password;
            }

            @Override
            public String email() {
                if (!emailLoaded) {
                    throw new UnloadedException(User.class, "email");
                }
                return email;
            }

            @Override
            public String mobile() {
                if (!mobileLoaded) {
                    throw new UnloadedException(User.class, "mobile");
                }
                return mobile;
            }

            @Override
            public String phone() {
                if (!phoneLoaded) {
                    throw new UnloadedException(User.class, "phone");
                }
                return phone;
            }

            @Override
            public String sex() {
                if (!sexLoaded) {
                    throw new UnloadedException(User.class, "sex");
                }
                return sex;
            }

            @Override
            public String avatar() {
                if (!avatarLoaded) {
                    throw new UnloadedException(User.class, "avatar");
                }
                return avatar;
            }

            @Override
            public String sign() {
                if (!signLoaded) {
                    throw new UnloadedException(User.class, "sign");
                }
                return sign;
            }

            @Override
            public String wxOpenId() {
                if (!wxOpenIdLoaded) {
                    throw new UnloadedException(User.class, "wxOpenId");
                }
                return wxOpenId;
            }

            @Override
            public String mobileImei() {
                if (!mobileImeiLoaded) {
                    throw new UnloadedException(User.class, "mobileImei");
                }
                return mobileImei;
            }

            @Override
            public String userType() {
                if (userType == null) {
                    throw new UnloadedException(User.class, "userType");
                }
                return userType;
            }

            @Override
            public String refCode() {
                if (!refCodeLoaded) {
                    throw new UnloadedException(User.class, "refCode");
                }
                return refCode;
            }

            @Override
            public String refName() {
                if (!refNameLoaded) {
                    throw new UnloadedException(User.class, "refName");
                }
                return refName;
            }

            @Override
            public String mgrType() {
                if (mgrType == null) {
                    throw new UnloadedException(User.class, "mgrType");
                }
                return mgrType;
            }

            @Override
            public Integer pwdSecurityLevel() {
                if (!pwdSecurityLevelLoaded) {
                    throw new UnloadedException(User.class, "pwdSecurityLevel");
                }
                return pwdSecurityLevel;
            }

            @Override
            public Integer userWeight() {
                if (!userWeightLoaded) {
                    throw new UnloadedException(User.class, "userWeight");
                }
                return userWeight;
            }

            @Override
            public String status() {
                if (status == null) {
                    throw new UnloadedException(User.class, "status");
                }
                return status;
            }

            @Override
            public String createBy() {
                if (createBy == null) {
                    throw new UnloadedException(User.class, "createBy");
                }
                return createBy;
            }

            @Override
            public Date createDate() {
                if (createDate == null) {
                    throw new UnloadedException(User.class, "createDate");
                }
                return createDate;
            }

            @Override
            public String updateBy() {
                if (updateBy == null) {
                    throw new UnloadedException(User.class, "updateBy");
                }
                return updateBy;
            }

            @Override
            public Date updateDate() {
                if (updateDate == null) {
                    throw new UnloadedException(User.class, "updateDate");
                }
                return updateDate;
            }

            @Override
            public String remarks() {
                if (!remarksLoaded) {
                    throw new UnloadedException(User.class, "remarks");
                }
                return remarks;
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
            public boolean __isLoaded(int prop) {
                switch (prop) {
                    case 1: return userCode != null;
                    case 2: return loginCodeLoaded;
                    case 3: return userNameLoaded;
                    case 4: return passwordLoaded;
                    case 5: return emailLoaded;
                    case 6: return mobileLoaded;
                    case 7: return phoneLoaded;
                    case 8: return sexLoaded;
                    case 9: return avatarLoaded;
                    case 10: return signLoaded;
                    case 11: return wxOpenIdLoaded;
                    case 12: return mobileImeiLoaded;
                    case 13: return userType != null;
                    case 14: return refCodeLoaded;
                    case 15: return refNameLoaded;
                    case 16: return mgrType != null;
                    case 17: return pwdSecurityLevelLoaded;
                    case 18: return userWeightLoaded;
                    case 19: return status != null;
                    case 20: return createBy != null;
                    case 21: return createDate != null;
                    case 22: return updateBy != null;
                    case 23: return updateDate != null;
                    case 24: return remarksLoaded;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "userCode": return userCode != null;
                    case "loginCode": return loginCodeLoaded;
                    case "userName": return userNameLoaded;
                    case "password": return passwordLoaded;
                    case "email": return emailLoaded;
                    case "mobile": return mobileLoaded;
                    case "phone": return phoneLoaded;
                    case "sex": return sexLoaded;
                    case "avatar": return avatarLoaded;
                    case "sign": return signLoaded;
                    case "wxOpenId": return wxOpenIdLoaded;
                    case "mobileImei": return mobileImeiLoaded;
                    case "userType": return userType != null;
                    case "refCode": return refCodeLoaded;
                    case "refName": return refNameLoaded;
                    case "mgrType": return mgrType != null;
                    case "pwdSecurityLevel": return pwdSecurityLevelLoaded;
                    case "userWeight": return userWeightLoaded;
                    case "status": return status != null;
                    case "createBy": return createBy != null;
                    case "createDate": return createDate != null;
                    case "updateBy": return updateBy != null;
                    case "updateDate": return updateDate != null;
                    case "remarks": return remarksLoaded;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public int hashCode() {
                int hash = 1;
                if (userCode != null) {
                    hash = 31 * hash + userCode.hashCode();
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (loginCodeLoaded && loginCode != null) {
                    hash = 31 * hash + loginCode.hashCode();
                }
                if (userNameLoaded && userName != null) {
                    hash = 31 * hash + userName.hashCode();
                }
                if (passwordLoaded && password != null) {
                    hash = 31 * hash + password.hashCode();
                }
                if (emailLoaded && email != null) {
                    hash = 31 * hash + email.hashCode();
                }
                if (mobileLoaded && mobile != null) {
                    hash = 31 * hash + mobile.hashCode();
                }
                if (phoneLoaded && phone != null) {
                    hash = 31 * hash + phone.hashCode();
                }
                if (sexLoaded && sex != null) {
                    hash = 31 * hash + sex.hashCode();
                }
                if (avatarLoaded && avatar != null) {
                    hash = 31 * hash + avatar.hashCode();
                }
                if (signLoaded && sign != null) {
                    hash = 31 * hash + sign.hashCode();
                }
                if (wxOpenIdLoaded && wxOpenId != null) {
                    hash = 31 * hash + wxOpenId.hashCode();
                }
                if (mobileImeiLoaded && mobileImei != null) {
                    hash = 31 * hash + mobileImei.hashCode();
                }
                if (userType != null) {
                    hash = 31 * hash + userType.hashCode();
                }
                if (refCodeLoaded && refCode != null) {
                    hash = 31 * hash + refCode.hashCode();
                }
                if (refNameLoaded && refName != null) {
                    hash = 31 * hash + refName.hashCode();
                }
                if (mgrType != null) {
                    hash = 31 * hash + mgrType.hashCode();
                }
                if (pwdSecurityLevelLoaded && pwdSecurityLevel != null) {
                    hash = 31 * hash + pwdSecurityLevel.hashCode();
                }
                if (userWeightLoaded && userWeight != null) {
                    hash = 31 * hash + userWeight.hashCode();
                }
                if (status != null) {
                    hash = 31 * hash + status.hashCode();
                }
                if (createBy != null) {
                    hash = 31 * hash + createBy.hashCode();
                }
                if (createDate != null) {
                    hash = 31 * hash + createDate.hashCode();
                }
                if (updateBy != null) {
                    hash = 31 * hash + updateBy.hashCode();
                }
                if (updateDate != null) {
                    hash = 31 * hash + updateDate.hashCode();
                }
                if (remarksLoaded && remarks != null) {
                    hash = 31 * hash + remarks.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = 1;
                if (userCode != null) {
                    hash = 31 * hash + System.identityHashCode(userCode);
                }
                if (loginCodeLoaded) {
                    hash = 31 * hash + System.identityHashCode(loginCode);
                }
                if (userNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(userName);
                }
                if (passwordLoaded) {
                    hash = 31 * hash + System.identityHashCode(password);
                }
                if (emailLoaded) {
                    hash = 31 * hash + System.identityHashCode(email);
                }
                if (mobileLoaded) {
                    hash = 31 * hash + System.identityHashCode(mobile);
                }
                if (phoneLoaded) {
                    hash = 31 * hash + System.identityHashCode(phone);
                }
                if (sexLoaded) {
                    hash = 31 * hash + System.identityHashCode(sex);
                }
                if (avatarLoaded) {
                    hash = 31 * hash + System.identityHashCode(avatar);
                }
                if (signLoaded) {
                    hash = 31 * hash + System.identityHashCode(sign);
                }
                if (wxOpenIdLoaded) {
                    hash = 31 * hash + System.identityHashCode(wxOpenId);
                }
                if (mobileImeiLoaded) {
                    hash = 31 * hash + System.identityHashCode(mobileImei);
                }
                if (userType != null) {
                    hash = 31 * hash + System.identityHashCode(userType);
                }
                if (refCodeLoaded) {
                    hash = 31 * hash + System.identityHashCode(refCode);
                }
                if (refNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(refName);
                }
                if (mgrType != null) {
                    hash = 31 * hash + System.identityHashCode(mgrType);
                }
                if (pwdSecurityLevelLoaded) {
                    hash = 31 * hash + System.identityHashCode(pwdSecurityLevel);
                }
                if (userWeightLoaded) {
                    hash = 31 * hash + System.identityHashCode(userWeight);
                }
                if (status != null) {
                    hash = 31 * hash + System.identityHashCode(status);
                }
                if (createBy != null) {
                    hash = 31 * hash + System.identityHashCode(createBy);
                }
                if (createDate != null) {
                    hash = 31 * hash + System.identityHashCode(createDate);
                }
                if (updateBy != null) {
                    hash = 31 * hash + System.identityHashCode(updateBy);
                }
                if (updateDate != null) {
                    hash = 31 * hash + System.identityHashCode(updateDate);
                }
                if (remarksLoaded) {
                    hash = 31 * hash + System.identityHashCode(remarks);
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
                Implementor other = (Implementor)obj;
                boolean __userCodeLoaded = userCode != null;
                if (__userCodeLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__userCodeLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(userCode, other.userCode());
                }
                boolean __loginCodeLoaded = loginCodeLoaded;
                if (__loginCodeLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__loginCodeLoaded && !Objects.equals(loginCode, other.loginCode())) {
                    return false;
                }
                boolean __userNameLoaded = userNameLoaded;
                if (__userNameLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__userNameLoaded && !Objects.equals(userName, other.userName())) {
                    return false;
                }
                boolean __passwordLoaded = passwordLoaded;
                if (__passwordLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__passwordLoaded && !Objects.equals(password, other.password())) {
                    return false;
                }
                boolean __emailLoaded = emailLoaded;
                if (__emailLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__emailLoaded && !Objects.equals(email, other.email())) {
                    return false;
                }
                boolean __mobileLoaded = mobileLoaded;
                if (__mobileLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__mobileLoaded && !Objects.equals(mobile, other.mobile())) {
                    return false;
                }
                boolean __phoneLoaded = phoneLoaded;
                if (__phoneLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__phoneLoaded && !Objects.equals(phone, other.phone())) {
                    return false;
                }
                boolean __sexLoaded = sexLoaded;
                if (__sexLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__sexLoaded && !Objects.equals(sex, other.sex())) {
                    return false;
                }
                boolean __avatarLoaded = avatarLoaded;
                if (__avatarLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__avatarLoaded && !Objects.equals(avatar, other.avatar())) {
                    return false;
                }
                boolean __signLoaded = signLoaded;
                if (__signLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__signLoaded && !Objects.equals(sign, other.sign())) {
                    return false;
                }
                boolean __wxOpenIdLoaded = wxOpenIdLoaded;
                if (__wxOpenIdLoaded != other.__isLoaded(11)) {
                    return false;
                }
                if (__wxOpenIdLoaded && !Objects.equals(wxOpenId, other.wxOpenId())) {
                    return false;
                }
                boolean __mobileImeiLoaded = mobileImeiLoaded;
                if (__mobileImeiLoaded != other.__isLoaded(12)) {
                    return false;
                }
                if (__mobileImeiLoaded && !Objects.equals(mobileImei, other.mobileImei())) {
                    return false;
                }
                boolean __userTypeLoaded = userType != null;
                if (__userTypeLoaded != other.__isLoaded(13)) {
                    return false;
                }
                if (__userTypeLoaded && !Objects.equals(userType, other.userType())) {
                    return false;
                }
                boolean __refCodeLoaded = refCodeLoaded;
                if (__refCodeLoaded != other.__isLoaded(14)) {
                    return false;
                }
                if (__refCodeLoaded && !Objects.equals(refCode, other.refCode())) {
                    return false;
                }
                boolean __refNameLoaded = refNameLoaded;
                if (__refNameLoaded != other.__isLoaded(15)) {
                    return false;
                }
                if (__refNameLoaded && !Objects.equals(refName, other.refName())) {
                    return false;
                }
                boolean __mgrTypeLoaded = mgrType != null;
                if (__mgrTypeLoaded != other.__isLoaded(16)) {
                    return false;
                }
                if (__mgrTypeLoaded && !Objects.equals(mgrType, other.mgrType())) {
                    return false;
                }
                boolean __pwdSecurityLevelLoaded = pwdSecurityLevelLoaded;
                if (__pwdSecurityLevelLoaded != other.__isLoaded(17)) {
                    return false;
                }
                if (__pwdSecurityLevelLoaded && !Objects.equals(pwdSecurityLevel, other.pwdSecurityLevel())) {
                    return false;
                }
                boolean __userWeightLoaded = userWeightLoaded;
                if (__userWeightLoaded != other.__isLoaded(18)) {
                    return false;
                }
                if (__userWeightLoaded && !Objects.equals(userWeight, other.userWeight())) {
                    return false;
                }
                boolean __statusLoaded = status != null;
                if (__statusLoaded != other.__isLoaded(19)) {
                    return false;
                }
                if (__statusLoaded && !Objects.equals(status, other.status())) {
                    return false;
                }
                boolean __createByLoaded = createBy != null;
                if (__createByLoaded != other.__isLoaded(20)) {
                    return false;
                }
                if (__createByLoaded && !Objects.equals(createBy, other.createBy())) {
                    return false;
                }
                boolean __createDateLoaded = createDate != null;
                if (__createDateLoaded != other.__isLoaded(21)) {
                    return false;
                }
                if (__createDateLoaded && !Objects.equals(createDate, other.createDate())) {
                    return false;
                }
                boolean __updateByLoaded = updateBy != null;
                if (__updateByLoaded != other.__isLoaded(22)) {
                    return false;
                }
                if (__updateByLoaded && !Objects.equals(updateBy, other.updateBy())) {
                    return false;
                }
                boolean __updateDateLoaded = updateDate != null;
                if (__updateDateLoaded != other.__isLoaded(23)) {
                    return false;
                }
                if (__updateDateLoaded && !Objects.equals(updateDate, other.updateDate())) {
                    return false;
                }
                boolean __remarksLoaded = remarksLoaded;
                if (__remarksLoaded != other.__isLoaded(24)) {
                    return false;
                }
                if (__remarksLoaded && !Objects.equals(remarks, other.remarks())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor other = (Implementor)obj;
                boolean __userCodeLoaded = userCode != null;
                if (__userCodeLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__userCodeLoaded && userCode != other.userCode()) {
                    return false;
                }
                boolean __loginCodeLoaded = loginCodeLoaded;
                if (__loginCodeLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__loginCodeLoaded && loginCode != other.loginCode()) {
                    return false;
                }
                boolean __userNameLoaded = userNameLoaded;
                if (__userNameLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__userNameLoaded && userName != other.userName()) {
                    return false;
                }
                boolean __passwordLoaded = passwordLoaded;
                if (__passwordLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__passwordLoaded && password != other.password()) {
                    return false;
                }
                boolean __emailLoaded = emailLoaded;
                if (__emailLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__emailLoaded && email != other.email()) {
                    return false;
                }
                boolean __mobileLoaded = mobileLoaded;
                if (__mobileLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__mobileLoaded && mobile != other.mobile()) {
                    return false;
                }
                boolean __phoneLoaded = phoneLoaded;
                if (__phoneLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__phoneLoaded && phone != other.phone()) {
                    return false;
                }
                boolean __sexLoaded = sexLoaded;
                if (__sexLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__sexLoaded && sex != other.sex()) {
                    return false;
                }
                boolean __avatarLoaded = avatarLoaded;
                if (__avatarLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__avatarLoaded && avatar != other.avatar()) {
                    return false;
                }
                boolean __signLoaded = signLoaded;
                if (__signLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__signLoaded && sign != other.sign()) {
                    return false;
                }
                boolean __wxOpenIdLoaded = wxOpenIdLoaded;
                if (__wxOpenIdLoaded != other.__isLoaded(11)) {
                    return false;
                }
                if (__wxOpenIdLoaded && wxOpenId != other.wxOpenId()) {
                    return false;
                }
                boolean __mobileImeiLoaded = mobileImeiLoaded;
                if (__mobileImeiLoaded != other.__isLoaded(12)) {
                    return false;
                }
                if (__mobileImeiLoaded && mobileImei != other.mobileImei()) {
                    return false;
                }
                boolean __userTypeLoaded = userType != null;
                if (__userTypeLoaded != other.__isLoaded(13)) {
                    return false;
                }
                if (__userTypeLoaded && userType != other.userType()) {
                    return false;
                }
                boolean __refCodeLoaded = refCodeLoaded;
                if (__refCodeLoaded != other.__isLoaded(14)) {
                    return false;
                }
                if (__refCodeLoaded && refCode != other.refCode()) {
                    return false;
                }
                boolean __refNameLoaded = refNameLoaded;
                if (__refNameLoaded != other.__isLoaded(15)) {
                    return false;
                }
                if (__refNameLoaded && refName != other.refName()) {
                    return false;
                }
                boolean __mgrTypeLoaded = mgrType != null;
                if (__mgrTypeLoaded != other.__isLoaded(16)) {
                    return false;
                }
                if (__mgrTypeLoaded && mgrType != other.mgrType()) {
                    return false;
                }
                boolean __pwdSecurityLevelLoaded = pwdSecurityLevelLoaded;
                if (__pwdSecurityLevelLoaded != other.__isLoaded(17)) {
                    return false;
                }
                if (__pwdSecurityLevelLoaded && pwdSecurityLevel != other.pwdSecurityLevel()) {
                    return false;
                }
                boolean __userWeightLoaded = userWeightLoaded;
                if (__userWeightLoaded != other.__isLoaded(18)) {
                    return false;
                }
                if (__userWeightLoaded && userWeight != other.userWeight()) {
                    return false;
                }
                boolean __statusLoaded = status != null;
                if (__statusLoaded != other.__isLoaded(19)) {
                    return false;
                }
                if (__statusLoaded && status != other.status()) {
                    return false;
                }
                boolean __createByLoaded = createBy != null;
                if (__createByLoaded != other.__isLoaded(20)) {
                    return false;
                }
                if (__createByLoaded && createBy != other.createBy()) {
                    return false;
                }
                boolean __createDateLoaded = createDate != null;
                if (__createDateLoaded != other.__isLoaded(21)) {
                    return false;
                }
                if (__createDateLoaded && createDate != other.createDate()) {
                    return false;
                }
                boolean __updateByLoaded = updateBy != null;
                if (__updateByLoaded != other.__isLoaded(22)) {
                    return false;
                }
                if (__updateByLoaded && updateBy != other.updateBy()) {
                    return false;
                }
                boolean __updateDateLoaded = updateDate != null;
                if (__updateDateLoaded != other.__isLoaded(23)) {
                    return false;
                }
                if (__updateDateLoaded && updateDate != other.updateDate()) {
                    return false;
                }
                boolean __remarksLoaded = remarksLoaded;
                if (__remarksLoaded != other.__isLoaded(24)) {
                    return false;
                }
                if (__remarksLoaded && remarks != other.remarks()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, UserDraft {
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
                    __base = new Impl();
                }
            }

            @Override
            public boolean __isLoaded(int prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isLoaded(String prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
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
                Impl modified = __modified();
                modified.userCode = userCode;
                return this;
            }

            @Override
            public String loginCode() {
                return (__modified!= null ? __modified : __base).loginCode();
            }

            @Override
            public UserDraft setLoginCode(String loginCode) {
                Impl modified = __modified();
                modified.loginCode = loginCode;
                modified.loginCodeLoaded = true;
                return this;
            }

            @Override
            public String userName() {
                return (__modified!= null ? __modified : __base).userName();
            }

            @Override
            public UserDraft setUserName(String userName) {
                Impl modified = __modified();
                modified.userName = userName;
                modified.userNameLoaded = true;
                return this;
            }

            @Override
            public String password() {
                return (__modified!= null ? __modified : __base).password();
            }

            @Override
            public UserDraft setPassword(String password) {
                Impl modified = __modified();
                modified.password = password;
                modified.passwordLoaded = true;
                return this;
            }

            @Override
            public String email() {
                return (__modified!= null ? __modified : __base).email();
            }

            @Override
            public UserDraft setEmail(String email) {
                Impl modified = __modified();
                modified.email = email;
                modified.emailLoaded = true;
                return this;
            }

            @Override
            public String mobile() {
                return (__modified!= null ? __modified : __base).mobile();
            }

            @Override
            public UserDraft setMobile(String mobile) {
                Impl modified = __modified();
                modified.mobile = mobile;
                modified.mobileLoaded = true;
                return this;
            }

            @Override
            public String phone() {
                return (__modified!= null ? __modified : __base).phone();
            }

            @Override
            public UserDraft setPhone(String phone) {
                Impl modified = __modified();
                modified.phone = phone;
                modified.phoneLoaded = true;
                return this;
            }

            @Override
            public String sex() {
                return (__modified!= null ? __modified : __base).sex();
            }

            @Override
            public UserDraft setSex(String sex) {
                Impl modified = __modified();
                modified.sex = sex;
                modified.sexLoaded = true;
                return this;
            }

            @Override
            public String avatar() {
                return (__modified!= null ? __modified : __base).avatar();
            }

            @Override
            public UserDraft setAvatar(String avatar) {
                Impl modified = __modified();
                modified.avatar = avatar;
                modified.avatarLoaded = true;
                return this;
            }

            @Override
            public String sign() {
                return (__modified!= null ? __modified : __base).sign();
            }

            @Override
            public UserDraft setSign(String sign) {
                Impl modified = __modified();
                modified.sign = sign;
                modified.signLoaded = true;
                return this;
            }

            @Override
            public String wxOpenId() {
                return (__modified!= null ? __modified : __base).wxOpenId();
            }

            @Override
            public UserDraft setWxOpenId(String wxOpenId) {
                Impl modified = __modified();
                modified.wxOpenId = wxOpenId;
                modified.wxOpenIdLoaded = true;
                return this;
            }

            @Override
            public String mobileImei() {
                return (__modified!= null ? __modified : __base).mobileImei();
            }

            @Override
            public UserDraft setMobileImei(String mobileImei) {
                Impl modified = __modified();
                modified.mobileImei = mobileImei;
                modified.mobileImeiLoaded = true;
                return this;
            }

            @Override
            public String userType() {
                return (__modified!= null ? __modified : __base).userType();
            }

            @Override
            public UserDraft setUserType(String userType) {
                if (userType == null) {
                    throw new IllegalArgumentException(
                        "'userType' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.userType = userType;
                return this;
            }

            @Override
            public String refCode() {
                return (__modified!= null ? __modified : __base).refCode();
            }

            @Override
            public UserDraft setRefCode(String refCode) {
                Impl modified = __modified();
                modified.refCode = refCode;
                modified.refCodeLoaded = true;
                return this;
            }

            @Override
            public String refName() {
                return (__modified!= null ? __modified : __base).refName();
            }

            @Override
            public UserDraft setRefName(String refName) {
                Impl modified = __modified();
                modified.refName = refName;
                modified.refNameLoaded = true;
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
                Impl modified = __modified();
                modified.mgrType = mgrType;
                return this;
            }

            @Override
            public Integer pwdSecurityLevel() {
                return (__modified!= null ? __modified : __base).pwdSecurityLevel();
            }

            @Override
            public UserDraft setPwdSecurityLevel(Integer pwdSecurityLevel) {
                Impl modified = __modified();
                modified.pwdSecurityLevel = pwdSecurityLevel;
                modified.pwdSecurityLevelLoaded = true;
                return this;
            }

            @Override
            public Integer userWeight() {
                return (__modified!= null ? __modified : __base).userWeight();
            }

            @Override
            public UserDraft setUserWeight(Integer userWeight) {
                Impl modified = __modified();
                modified.userWeight = userWeight;
                modified.userWeightLoaded = true;
                return this;
            }

            @Override
            public String status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public UserDraft setStatus(String status) {
                if (status == null) {
                    throw new IllegalArgumentException(
                        "'status' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.status = status;
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
                Impl modified = __modified();
                modified.createBy = createBy;
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
                Impl modified = __modified();
                modified.createDate = createDate;
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
                Impl modified = __modified();
                modified.updateBy = updateBy;
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
                Impl modified = __modified();
                modified.updateDate = updateDate;
                return this;
            }

            @Override
            public String remarks() {
                return (__modified!= null ? __modified : __base).remarks();
            }

            @Override
            public UserDraft setRemarks(String remarks) {
                Impl modified = __modified();
                modified.remarks = remarks;
                modified.remarksLoaded = true;
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(int prop, Object value) {
                switch (prop) {
                    case 1: setUserCode((String)value);break;
                    case 2: setLoginCode((String)value);break;
                    case 3: setUserName((String)value);break;
                    case 4: setPassword((String)value);break;
                    case 5: setEmail((String)value);break;
                    case 6: setMobile((String)value);break;
                    case 7: setPhone((String)value);break;
                    case 8: setSex((String)value);break;
                    case 9: setAvatar((String)value);break;
                    case 10: setSign((String)value);break;
                    case 11: setWxOpenId((String)value);break;
                    case 12: setMobileImei((String)value);break;
                    case 13: setUserType((String)value);break;
                    case 14: setRefCode((String)value);break;
                    case 15: setRefName((String)value);break;
                    case 16: setMgrType((String)value);break;
                    case 17: setPwdSecurityLevel((Integer)value);break;
                    case 18: setUserWeight((Integer)value);break;
                    case 19: setStatus((String)value);break;
                    case 20: setCreateBy((String)value);break;
                    case 21: setCreateDate((Date)value);break;
                    case 22: setUpdateBy((String)value);break;
                    case 23: setUpdateDate((Date)value);break;
                    case 24: setRemarks((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "userCode": setUserCode((String)value);break;
                    case "loginCode": setLoginCode((String)value);break;
                    case "userName": setUserName((String)value);break;
                    case "password": setPassword((String)value);break;
                    case "email": setEmail((String)value);break;
                    case "mobile": setMobile((String)value);break;
                    case "phone": setPhone((String)value);break;
                    case "sex": setSex((String)value);break;
                    case "avatar": setAvatar((String)value);break;
                    case "sign": setSign((String)value);break;
                    case "wxOpenId": setWxOpenId((String)value);break;
                    case "mobileImei": setMobileImei((String)value);break;
                    case "userType": setUserType((String)value);break;
                    case "refCode": setRefCode((String)value);break;
                    case "refName": setRefName((String)value);break;
                    case "mgrType": setMgrType((String)value);break;
                    case "pwdSecurityLevel": setPwdSecurityLevel((Integer)value);break;
                    case "userWeight": setUserWeight((Integer)value);break;
                    case "status": setStatus((String)value);break;
                    case "createBy": setCreateBy((String)value);break;
                    case "createDate": setCreateDate((Date)value);break;
                    case "updateBy": setUpdateBy((String)value);break;
                    case "updateDate": setUpdateDate((Date)value);break;
                    case "remarks": setRemarks((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(int prop) {
                switch (prop) {
                    case 1: __modified().userCode = null;break;
                    case 2: __modified().loginCodeLoaded = false;break;
                    case 3: __modified().userNameLoaded = false;break;
                    case 4: __modified().passwordLoaded = false;break;
                    case 5: __modified().emailLoaded = false;break;
                    case 6: __modified().mobileLoaded = false;break;
                    case 7: __modified().phoneLoaded = false;break;
                    case 8: __modified().sexLoaded = false;break;
                    case 9: __modified().avatarLoaded = false;break;
                    case 10: __modified().signLoaded = false;break;
                    case 11: __modified().wxOpenIdLoaded = false;break;
                    case 12: __modified().mobileImeiLoaded = false;break;
                    case 13: __modified().userType = null;break;
                    case 14: __modified().refCodeLoaded = false;break;
                    case 15: __modified().refNameLoaded = false;break;
                    case 16: __modified().mgrType = null;break;
                    case 17: __modified().pwdSecurityLevelLoaded = false;break;
                    case 18: __modified().userWeightLoaded = false;break;
                    case 19: __modified().status = null;break;
                    case 20: __modified().createBy = null;break;
                    case 21: __modified().createDate = null;break;
                    case 22: __modified().updateBy = null;break;
                    case 23: __modified().updateDate = null;break;
                    case 24: __modified().remarksLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "userCode": __modified().userCode = null;break;
                    case "loginCode": __modified().loginCodeLoaded = false;break;
                    case "userName": __modified().userNameLoaded = false;break;
                    case "password": __modified().passwordLoaded = false;break;
                    case "email": __modified().emailLoaded = false;break;
                    case "mobile": __modified().mobileLoaded = false;break;
                    case "phone": __modified().phoneLoaded = false;break;
                    case "sex": __modified().sexLoaded = false;break;
                    case "avatar": __modified().avatarLoaded = false;break;
                    case "sign": __modified().signLoaded = false;break;
                    case "wxOpenId": __modified().wxOpenIdLoaded = false;break;
                    case "mobileImei": __modified().mobileImeiLoaded = false;break;
                    case "userType": __modified().userType = null;break;
                    case "refCode": __modified().refCodeLoaded = false;break;
                    case "refName": __modified().refNameLoaded = false;break;
                    case "mgrType": __modified().mgrType = null;break;
                    case "pwdSecurityLevel": __modified().pwdSecurityLevelLoaded = false;break;
                    case "userWeight": __modified().userWeightLoaded = false;break;
                    case "status": __modified().status = null;break;
                    case "createBy": __modified().createBy = null;break;
                    case "createDate": __modified().createDate = null;break;
                    case "updateBy": __modified().updateBy = null;break;
                    case "updateDate": __modified().updateDate = null;break;
                    case "remarks": __modified().remarksLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
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
                    Impl modified = __modified;
                    if (modified == null || ImmutableSpi.equals(base, modified, true)) {
                        return base;
                    }
                    return modified;
                }
                finally {
                    __resolving = false;
                }
            }

            private Impl __modified() {
                Impl modified = __modified;
                if (modified == null) {
                    modified = __base.clone();
                    __modified = modified;
                }
                return modified;
            }
        }
    }
}
