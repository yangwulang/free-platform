package top.yangwulang.platform.entity.sys;

import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.time.LocalDateTime;
import java.util.Objects;
import org.babyfish.jimmer.CircularReferenceException;
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

public interface UserDraft extends User, BaseEntityDraft {
    UserDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    UserDraft setUserCode(String userCode);

    @OldChain
    UserDraft setStatus(String status);

    @OldChain
    UserDraft setCreateBy(String createBy);

    @OldChain
    UserDraft setCreateDate(LocalDateTime createDate);

    @OldChain
    UserDraft setUpdateBy(String updateBy);

    @OldChain
    UserDraft setUpdateDate(LocalDateTime updateDate);

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

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                User.class,
                BaseEntityDraft.Producer.TYPE,
                (ctx, base) -> new DraftImpl(ctx, (User)base)
            )
            .id(7, "userCode", String.class)
            .key(8, "loginCode", String.class)
            .add(9, "userName", ImmutablePropCategory.SCALAR, String.class, true)
            .add(10, "password", ImmutablePropCategory.SCALAR, String.class, true)
            .add(11, "email", ImmutablePropCategory.SCALAR, String.class, true)
            .add(12, "mobile", ImmutablePropCategory.SCALAR, String.class, true)
            .add(13, "phone", ImmutablePropCategory.SCALAR, String.class, true)
            .add(14, "sex", ImmutablePropCategory.SCALAR, String.class, true)
            .add(15, "avatar", ImmutablePropCategory.SCALAR, String.class, true)
            .add(16, "sign", ImmutablePropCategory.SCALAR, String.class, true)
            .add(17, "wxOpenId", ImmutablePropCategory.SCALAR, String.class, true)
            .add(18, "mobileImei", ImmutablePropCategory.SCALAR, String.class, true)
            .add(19, "userType", ImmutablePropCategory.SCALAR, String.class, true)
            .add(20, "refCode", ImmutablePropCategory.SCALAR, String.class, true)
            .add(21, "refName", ImmutablePropCategory.SCALAR, String.class, true)
            .add(22, "mgrType", ImmutablePropCategory.SCALAR, String.class, false)
            .add(23, "pwdSecurityLevel", ImmutablePropCategory.SCALAR, Integer.class, true)
            .add(24, "userWeight", ImmutablePropCategory.SCALAR, Integer.class, true)
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
                    case 1: return status();
                    case 2: return createBy();
                    case 3: return createDate();
                    case 4: return updateBy();
                    case 5: return updateDate();
                    case 6: return remarks();
                    case 7: return userCode();
                    case 8: return loginCode();
                    case 9: return userName();
                    case 10: return password();
                    case 11: return email();
                    case 12: return mobile();
                    case 13: return phone();
                    case 14: return sex();
                    case 15: return avatar();
                    case 16: return sign();
                    case 17: return wxOpenId();
                    case 18: return mobileImei();
                    case 19: return userType();
                    case 20: return refCode();
                    case 21: return refName();
                    case 22: return mgrType();
                    case 23: return pwdSecurityLevel();
                    case 24: return userWeight();
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public Object __get(String prop) {
                switch (prop) {
                    case "status": return status();
                    case "createBy": return createBy();
                    case "createDate": return createDate();
                    case "updateBy": return updateBy();
                    case "updateDate": return updateDate();
                    case "remarks": return remarks();
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

            String status;

            String createBy;

            LocalDateTime createDate;

            String updateBy;

            LocalDateTime updateDate;

            String remarks;

            boolean remarksLoaded = false;

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

            boolean userTypeLoaded = false;

            String refCode;

            boolean refCodeLoaded = false;

            String refName;

            boolean refNameLoaded = false;

            String mgrType;

            Integer pwdSecurityLevel;

            boolean pwdSecurityLevelLoaded = false;

            Integer userWeight;

            boolean userWeightLoaded = false;

            @Override
            public String userCode() {
                if (userCode == null) {
                    throw new UnloadedException(User.class, "userCode");
                }
                return userCode;
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
            public LocalDateTime createDate() {
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
            public LocalDateTime updateDate() {
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
                if (!userTypeLoaded) {
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
                    case 1: return status != null;
                    case 2: return createBy != null;
                    case 3: return createDate != null;
                    case 4: return updateBy != null;
                    case 5: return updateDate != null;
                    case 6: return remarksLoaded;
                    case 7: return userCode != null;
                    case 8: return loginCodeLoaded;
                    case 9: return userNameLoaded;
                    case 10: return passwordLoaded;
                    case 11: return emailLoaded;
                    case 12: return mobileLoaded;
                    case 13: return phoneLoaded;
                    case 14: return sexLoaded;
                    case 15: return avatarLoaded;
                    case 16: return signLoaded;
                    case 17: return wxOpenIdLoaded;
                    case 18: return mobileImeiLoaded;
                    case 19: return userTypeLoaded;
                    case 20: return refCodeLoaded;
                    case 21: return refNameLoaded;
                    case 22: return mgrType != null;
                    case 23: return pwdSecurityLevelLoaded;
                    case 24: return userWeightLoaded;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "status": return status != null;
                    case "createBy": return createBy != null;
                    case "createDate": return createDate != null;
                    case "updateBy": return updateBy != null;
                    case "updateDate": return updateDate != null;
                    case "remarks": return remarksLoaded;
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
                    case "userType": return userTypeLoaded;
                    case "refCode": return refCodeLoaded;
                    case "refName": return refNameLoaded;
                    case "mgrType": return mgrType != null;
                    case "pwdSecurityLevel": return pwdSecurityLevelLoaded;
                    case "userWeight": return userWeightLoaded;
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
                if (userTypeLoaded && userType != null) {
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
                return hash;
            }

            private int __shallowHashCode() {
                int hash = 1;
                if (userCode != null) {
                    hash = 31 * hash + System.identityHashCode(userCode);
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
                if (userTypeLoaded) {
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
                if (__userCodeLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__userCodeLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(userCode, other.userCode());
                }
                boolean __statusLoaded = status != null;
                if (__statusLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__statusLoaded && !Objects.equals(status, other.status())) {
                    return false;
                }
                boolean __createByLoaded = createBy != null;
                if (__createByLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__createByLoaded && !Objects.equals(createBy, other.createBy())) {
                    return false;
                }
                boolean __createDateLoaded = createDate != null;
                if (__createDateLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__createDateLoaded && !Objects.equals(createDate, other.createDate())) {
                    return false;
                }
                boolean __updateByLoaded = updateBy != null;
                if (__updateByLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__updateByLoaded && !Objects.equals(updateBy, other.updateBy())) {
                    return false;
                }
                boolean __updateDateLoaded = updateDate != null;
                if (__updateDateLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__updateDateLoaded && !Objects.equals(updateDate, other.updateDate())) {
                    return false;
                }
                boolean __remarksLoaded = remarksLoaded;
                if (__remarksLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__remarksLoaded && !Objects.equals(remarks, other.remarks())) {
                    return false;
                }
                boolean __loginCodeLoaded = loginCodeLoaded;
                if (__loginCodeLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__loginCodeLoaded && !Objects.equals(loginCode, other.loginCode())) {
                    return false;
                }
                boolean __userNameLoaded = userNameLoaded;
                if (__userNameLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__userNameLoaded && !Objects.equals(userName, other.userName())) {
                    return false;
                }
                boolean __passwordLoaded = passwordLoaded;
                if (__passwordLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__passwordLoaded && !Objects.equals(password, other.password())) {
                    return false;
                }
                boolean __emailLoaded = emailLoaded;
                if (__emailLoaded != other.__isLoaded(11)) {
                    return false;
                }
                if (__emailLoaded && !Objects.equals(email, other.email())) {
                    return false;
                }
                boolean __mobileLoaded = mobileLoaded;
                if (__mobileLoaded != other.__isLoaded(12)) {
                    return false;
                }
                if (__mobileLoaded && !Objects.equals(mobile, other.mobile())) {
                    return false;
                }
                boolean __phoneLoaded = phoneLoaded;
                if (__phoneLoaded != other.__isLoaded(13)) {
                    return false;
                }
                if (__phoneLoaded && !Objects.equals(phone, other.phone())) {
                    return false;
                }
                boolean __sexLoaded = sexLoaded;
                if (__sexLoaded != other.__isLoaded(14)) {
                    return false;
                }
                if (__sexLoaded && !Objects.equals(sex, other.sex())) {
                    return false;
                }
                boolean __avatarLoaded = avatarLoaded;
                if (__avatarLoaded != other.__isLoaded(15)) {
                    return false;
                }
                if (__avatarLoaded && !Objects.equals(avatar, other.avatar())) {
                    return false;
                }
                boolean __signLoaded = signLoaded;
                if (__signLoaded != other.__isLoaded(16)) {
                    return false;
                }
                if (__signLoaded && !Objects.equals(sign, other.sign())) {
                    return false;
                }
                boolean __wxOpenIdLoaded = wxOpenIdLoaded;
                if (__wxOpenIdLoaded != other.__isLoaded(17)) {
                    return false;
                }
                if (__wxOpenIdLoaded && !Objects.equals(wxOpenId, other.wxOpenId())) {
                    return false;
                }
                boolean __mobileImeiLoaded = mobileImeiLoaded;
                if (__mobileImeiLoaded != other.__isLoaded(18)) {
                    return false;
                }
                if (__mobileImeiLoaded && !Objects.equals(mobileImei, other.mobileImei())) {
                    return false;
                }
                boolean __userTypeLoaded = userTypeLoaded;
                if (__userTypeLoaded != other.__isLoaded(19)) {
                    return false;
                }
                if (__userTypeLoaded && !Objects.equals(userType, other.userType())) {
                    return false;
                }
                boolean __refCodeLoaded = refCodeLoaded;
                if (__refCodeLoaded != other.__isLoaded(20)) {
                    return false;
                }
                if (__refCodeLoaded && !Objects.equals(refCode, other.refCode())) {
                    return false;
                }
                boolean __refNameLoaded = refNameLoaded;
                if (__refNameLoaded != other.__isLoaded(21)) {
                    return false;
                }
                if (__refNameLoaded && !Objects.equals(refName, other.refName())) {
                    return false;
                }
                boolean __mgrTypeLoaded = mgrType != null;
                if (__mgrTypeLoaded != other.__isLoaded(22)) {
                    return false;
                }
                if (__mgrTypeLoaded && !Objects.equals(mgrType, other.mgrType())) {
                    return false;
                }
                boolean __pwdSecurityLevelLoaded = pwdSecurityLevelLoaded;
                if (__pwdSecurityLevelLoaded != other.__isLoaded(23)) {
                    return false;
                }
                if (__pwdSecurityLevelLoaded && !Objects.equals(pwdSecurityLevel, other.pwdSecurityLevel())) {
                    return false;
                }
                boolean __userWeightLoaded = userWeightLoaded;
                if (__userWeightLoaded != other.__isLoaded(24)) {
                    return false;
                }
                if (__userWeightLoaded && !Objects.equals(userWeight, other.userWeight())) {
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
                if (__userCodeLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__userCodeLoaded && userCode != other.userCode()) {
                    return false;
                }
                boolean __statusLoaded = status != null;
                if (__statusLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__statusLoaded && status != other.status()) {
                    return false;
                }
                boolean __createByLoaded = createBy != null;
                if (__createByLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__createByLoaded && createBy != other.createBy()) {
                    return false;
                }
                boolean __createDateLoaded = createDate != null;
                if (__createDateLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__createDateLoaded && createDate != other.createDate()) {
                    return false;
                }
                boolean __updateByLoaded = updateBy != null;
                if (__updateByLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__updateByLoaded && updateBy != other.updateBy()) {
                    return false;
                }
                boolean __updateDateLoaded = updateDate != null;
                if (__updateDateLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__updateDateLoaded && updateDate != other.updateDate()) {
                    return false;
                }
                boolean __remarksLoaded = remarksLoaded;
                if (__remarksLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__remarksLoaded && remarks != other.remarks()) {
                    return false;
                }
                boolean __loginCodeLoaded = loginCodeLoaded;
                if (__loginCodeLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__loginCodeLoaded && loginCode != other.loginCode()) {
                    return false;
                }
                boolean __userNameLoaded = userNameLoaded;
                if (__userNameLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__userNameLoaded && userName != other.userName()) {
                    return false;
                }
                boolean __passwordLoaded = passwordLoaded;
                if (__passwordLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__passwordLoaded && password != other.password()) {
                    return false;
                }
                boolean __emailLoaded = emailLoaded;
                if (__emailLoaded != other.__isLoaded(11)) {
                    return false;
                }
                if (__emailLoaded && email != other.email()) {
                    return false;
                }
                boolean __mobileLoaded = mobileLoaded;
                if (__mobileLoaded != other.__isLoaded(12)) {
                    return false;
                }
                if (__mobileLoaded && mobile != other.mobile()) {
                    return false;
                }
                boolean __phoneLoaded = phoneLoaded;
                if (__phoneLoaded != other.__isLoaded(13)) {
                    return false;
                }
                if (__phoneLoaded && phone != other.phone()) {
                    return false;
                }
                boolean __sexLoaded = sexLoaded;
                if (__sexLoaded != other.__isLoaded(14)) {
                    return false;
                }
                if (__sexLoaded && sex != other.sex()) {
                    return false;
                }
                boolean __avatarLoaded = avatarLoaded;
                if (__avatarLoaded != other.__isLoaded(15)) {
                    return false;
                }
                if (__avatarLoaded && avatar != other.avatar()) {
                    return false;
                }
                boolean __signLoaded = signLoaded;
                if (__signLoaded != other.__isLoaded(16)) {
                    return false;
                }
                if (__signLoaded && sign != other.sign()) {
                    return false;
                }
                boolean __wxOpenIdLoaded = wxOpenIdLoaded;
                if (__wxOpenIdLoaded != other.__isLoaded(17)) {
                    return false;
                }
                if (__wxOpenIdLoaded && wxOpenId != other.wxOpenId()) {
                    return false;
                }
                boolean __mobileImeiLoaded = mobileImeiLoaded;
                if (__mobileImeiLoaded != other.__isLoaded(18)) {
                    return false;
                }
                if (__mobileImeiLoaded && mobileImei != other.mobileImei()) {
                    return false;
                }
                boolean __userTypeLoaded = userTypeLoaded;
                if (__userTypeLoaded != other.__isLoaded(19)) {
                    return false;
                }
                if (__userTypeLoaded && userType != other.userType()) {
                    return false;
                }
                boolean __refCodeLoaded = refCodeLoaded;
                if (__refCodeLoaded != other.__isLoaded(20)) {
                    return false;
                }
                if (__refCodeLoaded && refCode != other.refCode()) {
                    return false;
                }
                boolean __refNameLoaded = refNameLoaded;
                if (__refNameLoaded != other.__isLoaded(21)) {
                    return false;
                }
                if (__refNameLoaded && refName != other.refName()) {
                    return false;
                }
                boolean __mgrTypeLoaded = mgrType != null;
                if (__mgrTypeLoaded != other.__isLoaded(22)) {
                    return false;
                }
                if (__mgrTypeLoaded && mgrType != other.mgrType()) {
                    return false;
                }
                boolean __pwdSecurityLevelLoaded = pwdSecurityLevelLoaded;
                if (__pwdSecurityLevelLoaded != other.__isLoaded(23)) {
                    return false;
                }
                if (__pwdSecurityLevelLoaded && pwdSecurityLevel != other.pwdSecurityLevel()) {
                    return false;
                }
                boolean __userWeightLoaded = userWeightLoaded;
                if (__userWeightLoaded != other.__isLoaded(24)) {
                    return false;
                }
                if (__userWeightLoaded && userWeight != other.userWeight()) {
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
                Impl __tmpModified = __modified();
                __tmpModified.userCode = userCode;
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
                Impl __tmpModified = __modified();
                __tmpModified.status = status;
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
                __tmpModified.createBy = createBy;
                return this;
            }

            @Override
            public LocalDateTime createDate() {
                return (__modified!= null ? __modified : __base).createDate();
            }

            @Override
            public UserDraft setCreateDate(LocalDateTime createDate) {
                if (createDate == null) {
                    throw new IllegalArgumentException(
                        "'createDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.createDate = createDate;
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
                __tmpModified.updateBy = updateBy;
                return this;
            }

            @Override
            public LocalDateTime updateDate() {
                return (__modified!= null ? __modified : __base).updateDate();
            }

            @Override
            public UserDraft setUpdateDate(LocalDateTime updateDate) {
                if (updateDate == null) {
                    throw new IllegalArgumentException(
                        "'updateDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.updateDate = updateDate;
                return this;
            }

            @Override
            public String remarks() {
                return (__modified!= null ? __modified : __base).remarks();
            }

            @Override
            public UserDraft setRemarks(String remarks) {
                Impl __tmpModified = __modified();
                __tmpModified.remarks = remarks;
                __tmpModified.remarksLoaded = true;
                return this;
            }

            @Override
            public String loginCode() {
                return (__modified!= null ? __modified : __base).loginCode();
            }

            @Override
            public UserDraft setLoginCode(String loginCode) {
                Impl __tmpModified = __modified();
                __tmpModified.loginCode = loginCode;
                __tmpModified.loginCodeLoaded = true;
                return this;
            }

            @Override
            public String userName() {
                return (__modified!= null ? __modified : __base).userName();
            }

            @Override
            public UserDraft setUserName(String userName) {
                Impl __tmpModified = __modified();
                __tmpModified.userName = userName;
                __tmpModified.userNameLoaded = true;
                return this;
            }

            @Override
            public String password() {
                return (__modified!= null ? __modified : __base).password();
            }

            @Override
            public UserDraft setPassword(String password) {
                Impl __tmpModified = __modified();
                __tmpModified.password = password;
                __tmpModified.passwordLoaded = true;
                return this;
            }

            @Override
            public String email() {
                return (__modified!= null ? __modified : __base).email();
            }

            @Override
            public UserDraft setEmail(String email) {
                Impl __tmpModified = __modified();
                __tmpModified.email = email;
                __tmpModified.emailLoaded = true;
                return this;
            }

            @Override
            public String mobile() {
                return (__modified!= null ? __modified : __base).mobile();
            }

            @Override
            public UserDraft setMobile(String mobile) {
                Impl __tmpModified = __modified();
                __tmpModified.mobile = mobile;
                __tmpModified.mobileLoaded = true;
                return this;
            }

            @Override
            public String phone() {
                return (__modified!= null ? __modified : __base).phone();
            }

            @Override
            public UserDraft setPhone(String phone) {
                Impl __tmpModified = __modified();
                __tmpModified.phone = phone;
                __tmpModified.phoneLoaded = true;
                return this;
            }

            @Override
            public String sex() {
                return (__modified!= null ? __modified : __base).sex();
            }

            @Override
            public UserDraft setSex(String sex) {
                Impl __tmpModified = __modified();
                __tmpModified.sex = sex;
                __tmpModified.sexLoaded = true;
                return this;
            }

            @Override
            public String avatar() {
                return (__modified!= null ? __modified : __base).avatar();
            }

            @Override
            public UserDraft setAvatar(String avatar) {
                Impl __tmpModified = __modified();
                __tmpModified.avatar = avatar;
                __tmpModified.avatarLoaded = true;
                return this;
            }

            @Override
            public String sign() {
                return (__modified!= null ? __modified : __base).sign();
            }

            @Override
            public UserDraft setSign(String sign) {
                Impl __tmpModified = __modified();
                __tmpModified.sign = sign;
                __tmpModified.signLoaded = true;
                return this;
            }

            @Override
            public String wxOpenId() {
                return (__modified!= null ? __modified : __base).wxOpenId();
            }

            @Override
            public UserDraft setWxOpenId(String wxOpenId) {
                Impl __tmpModified = __modified();
                __tmpModified.wxOpenId = wxOpenId;
                __tmpModified.wxOpenIdLoaded = true;
                return this;
            }

            @Override
            public String mobileImei() {
                return (__modified!= null ? __modified : __base).mobileImei();
            }

            @Override
            public UserDraft setMobileImei(String mobileImei) {
                Impl __tmpModified = __modified();
                __tmpModified.mobileImei = mobileImei;
                __tmpModified.mobileImeiLoaded = true;
                return this;
            }

            @Override
            public String userType() {
                return (__modified!= null ? __modified : __base).userType();
            }

            @Override
            public UserDraft setUserType(String userType) {
                Impl __tmpModified = __modified();
                __tmpModified.userType = userType;
                __tmpModified.userTypeLoaded = true;
                return this;
            }

            @Override
            public String refCode() {
                return (__modified!= null ? __modified : __base).refCode();
            }

            @Override
            public UserDraft setRefCode(String refCode) {
                Impl __tmpModified = __modified();
                __tmpModified.refCode = refCode;
                __tmpModified.refCodeLoaded = true;
                return this;
            }

            @Override
            public String refName() {
                return (__modified!= null ? __modified : __base).refName();
            }

            @Override
            public UserDraft setRefName(String refName) {
                Impl __tmpModified = __modified();
                __tmpModified.refName = refName;
                __tmpModified.refNameLoaded = true;
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
                __tmpModified.mgrType = mgrType;
                return this;
            }

            @Override
            public Integer pwdSecurityLevel() {
                return (__modified!= null ? __modified : __base).pwdSecurityLevel();
            }

            @Override
            public UserDraft setPwdSecurityLevel(Integer pwdSecurityLevel) {
                Impl __tmpModified = __modified();
                __tmpModified.pwdSecurityLevel = pwdSecurityLevel;
                __tmpModified.pwdSecurityLevelLoaded = true;
                return this;
            }

            @Override
            public Integer userWeight() {
                return (__modified!= null ? __modified : __base).userWeight();
            }

            @Override
            public UserDraft setUserWeight(Integer userWeight) {
                Impl __tmpModified = __modified();
                __tmpModified.userWeight = userWeight;
                __tmpModified.userWeightLoaded = true;
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(int prop, Object value) {
                switch (prop) {
                    case 1: setStatus((String)value);break;
                    case 2: setCreateBy((String)value);break;
                    case 3: setCreateDate((LocalDateTime)value);break;
                    case 4: setUpdateBy((String)value);break;
                    case 5: setUpdateDate((LocalDateTime)value);break;
                    case 6: setRemarks((String)value);break;
                    case 7: setUserCode((String)value);break;
                    case 8: setLoginCode((String)value);break;
                    case 9: setUserName((String)value);break;
                    case 10: setPassword((String)value);break;
                    case 11: setEmail((String)value);break;
                    case 12: setMobile((String)value);break;
                    case 13: setPhone((String)value);break;
                    case 14: setSex((String)value);break;
                    case 15: setAvatar((String)value);break;
                    case 16: setSign((String)value);break;
                    case 17: setWxOpenId((String)value);break;
                    case 18: setMobileImei((String)value);break;
                    case 19: setUserType((String)value);break;
                    case 20: setRefCode((String)value);break;
                    case 21: setRefName((String)value);break;
                    case 22: setMgrType((String)value);break;
                    case 23: setPwdSecurityLevel((Integer)value);break;
                    case 24: setUserWeight((Integer)value);break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "status": setStatus((String)value);break;
                    case "createBy": setCreateBy((String)value);break;
                    case "createDate": setCreateDate((LocalDateTime)value);break;
                    case "updateBy": setUpdateBy((String)value);break;
                    case "updateDate": setUpdateDate((LocalDateTime)value);break;
                    case "remarks": setRemarks((String)value);break;
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
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(int prop) {
                switch (prop) {
                    case 1: __modified().status = null;break;
                    case 2: __modified().createBy = null;break;
                    case 3: __modified().createDate = null;break;
                    case 4: __modified().updateBy = null;break;
                    case 5: __modified().updateDate = null;break;
                    case 6: __modified().remarksLoaded = false;break;
                    case 7: __modified().userCode = null;break;
                    case 8: __modified().loginCodeLoaded = false;break;
                    case 9: __modified().userNameLoaded = false;break;
                    case 10: __modified().passwordLoaded = false;break;
                    case 11: __modified().emailLoaded = false;break;
                    case 12: __modified().mobileLoaded = false;break;
                    case 13: __modified().phoneLoaded = false;break;
                    case 14: __modified().sexLoaded = false;break;
                    case 15: __modified().avatarLoaded = false;break;
                    case 16: __modified().signLoaded = false;break;
                    case 17: __modified().wxOpenIdLoaded = false;break;
                    case 18: __modified().mobileImeiLoaded = false;break;
                    case 19: __modified().userTypeLoaded = false;break;
                    case 20: __modified().refCodeLoaded = false;break;
                    case 21: __modified().refNameLoaded = false;break;
                    case 22: __modified().mgrType = null;break;
                    case 23: __modified().pwdSecurityLevelLoaded = false;break;
                    case 24: __modified().userWeightLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "status": __modified().status = null;break;
                    case "createBy": __modified().createBy = null;break;
                    case "createDate": __modified().createDate = null;break;
                    case "updateBy": __modified().updateBy = null;break;
                    case "updateDate": __modified().updateDate = null;break;
                    case "remarks": __modified().remarksLoaded = false;break;
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
                    case "userType": __modified().userTypeLoaded = false;break;
                    case "refCode": __modified().refCodeLoaded = false;break;
                    case "refName": __modified().refNameLoaded = false;break;
                    case "mgrType": __modified().mgrType = null;break;
                    case "pwdSecurityLevel": __modified().pwdSecurityLevelLoaded = false;break;
                    case "userWeight": __modified().userWeightLoaded = false;break;
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
                    Impl __tmpModified = __modified;
                    if (__tmpModified == null || ImmutableSpi.equals(base, __tmpModified, true)) {
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

        private String status;

        private String createBy;

        private LocalDateTime createDate;

        private String updateBy;

        private LocalDateTime updateDate;

        private boolean remarksLoaded;

        private String remarks;

        private boolean loginCodeLoaded;

        private String loginCode;

        private boolean userNameLoaded;

        private String userName;

        private boolean passwordLoaded;

        private String password;

        private boolean emailLoaded;

        private String email;

        private boolean mobileLoaded;

        private String mobile;

        private boolean phoneLoaded;

        private String phone;

        private boolean sexLoaded;

        private String sex;

        private boolean avatarLoaded;

        private String avatar;

        private boolean signLoaded;

        private String sign;

        private boolean wxOpenIdLoaded;

        private String wxOpenId;

        private boolean mobileImeiLoaded;

        private String mobileImei;

        private boolean userTypeLoaded;

        private String userType;

        private boolean refCodeLoaded;

        private String refCode;

        private boolean refNameLoaded;

        private String refName;

        private String mgrType;

        private boolean pwdSecurityLevelLoaded;

        private Integer pwdSecurityLevel;

        private boolean userWeightLoaded;

        private Integer userWeight;

        public MapStruct userCode(String userCode) {
            if (userCode != null) {
                this.userCode = userCode;
            }
            return this;
        }

        public MapStruct status(String status) {
            if (status != null) {
                this.status = status;
            }
            return this;
        }

        public MapStruct createBy(String createBy) {
            if (createBy != null) {
                this.createBy = createBy;
            }
            return this;
        }

        public MapStruct createDate(LocalDateTime createDate) {
            if (createDate != null) {
                this.createDate = createDate;
            }
            return this;
        }

        public MapStruct updateBy(String updateBy) {
            if (updateBy != null) {
                this.updateBy = updateBy;
            }
            return this;
        }

        public MapStruct updateDate(LocalDateTime updateDate) {
            if (updateDate != null) {
                this.updateDate = updateDate;
            }
            return this;
        }

        public MapStruct remarks(String remarks) {
            this.remarksLoaded = true;
            this.remarks = remarks;
            return this;
        }

        public MapStruct loginCode(String loginCode) {
            this.loginCodeLoaded = true;
            this.loginCode = loginCode;
            return this;
        }

        public MapStruct userName(String userName) {
            this.userNameLoaded = true;
            this.userName = userName;
            return this;
        }

        public MapStruct password(String password) {
            this.passwordLoaded = true;
            this.password = password;
            return this;
        }

        public MapStruct email(String email) {
            this.emailLoaded = true;
            this.email = email;
            return this;
        }

        public MapStruct mobile(String mobile) {
            this.mobileLoaded = true;
            this.mobile = mobile;
            return this;
        }

        public MapStruct phone(String phone) {
            this.phoneLoaded = true;
            this.phone = phone;
            return this;
        }

        public MapStruct sex(String sex) {
            this.sexLoaded = true;
            this.sex = sex;
            return this;
        }

        public MapStruct avatar(String avatar) {
            this.avatarLoaded = true;
            this.avatar = avatar;
            return this;
        }

        public MapStruct sign(String sign) {
            this.signLoaded = true;
            this.sign = sign;
            return this;
        }

        public MapStruct wxOpenId(String wxOpenId) {
            this.wxOpenIdLoaded = true;
            this.wxOpenId = wxOpenId;
            return this;
        }

        public MapStruct mobileImei(String mobileImei) {
            this.mobileImeiLoaded = true;
            this.mobileImei = mobileImei;
            return this;
        }

        public MapStruct userType(String userType) {
            this.userTypeLoaded = true;
            this.userType = userType;
            return this;
        }

        public MapStruct refCode(String refCode) {
            this.refCodeLoaded = true;
            this.refCode = refCode;
            return this;
        }

        public MapStruct refName(String refName) {
            this.refNameLoaded = true;
            this.refName = refName;
            return this;
        }

        public MapStruct mgrType(String mgrType) {
            if (mgrType != null) {
                this.mgrType = mgrType;
            }
            return this;
        }

        public MapStruct pwdSecurityLevel(Integer pwdSecurityLevel) {
            this.pwdSecurityLevelLoaded = true;
            this.pwdSecurityLevel = pwdSecurityLevel;
            return this;
        }

        public MapStruct userWeight(Integer userWeight) {
            this.userWeightLoaded = true;
            this.userWeight = userWeight;
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
                if (remarksLoaded) {
                    draft.setRemarks(remarks);
                }
                if (loginCodeLoaded) {
                    draft.setLoginCode(loginCode);
                }
                if (userNameLoaded) {
                    draft.setUserName(userName);
                }
                if (passwordLoaded) {
                    draft.setPassword(password);
                }
                if (emailLoaded) {
                    draft.setEmail(email);
                }
                if (mobileLoaded) {
                    draft.setMobile(mobile);
                }
                if (phoneLoaded) {
                    draft.setPhone(phone);
                }
                if (sexLoaded) {
                    draft.setSex(sex);
                }
                if (avatarLoaded) {
                    draft.setAvatar(avatar);
                }
                if (signLoaded) {
                    draft.setSign(sign);
                }
                if (wxOpenIdLoaded) {
                    draft.setWxOpenId(wxOpenId);
                }
                if (mobileImeiLoaded) {
                    draft.setMobileImei(mobileImei);
                }
                if (userTypeLoaded) {
                    draft.setUserType(userType);
                }
                if (refCodeLoaded) {
                    draft.setRefCode(refCode);
                }
                if (refNameLoaded) {
                    draft.setRefName(refName);
                }
                if (mgrType != null) {
                    draft.setMgrType(mgrType);
                }
                if (pwdSecurityLevelLoaded) {
                    draft.setPwdSecurityLevel(pwdSecurityLevel);
                }
                if (userWeightLoaded) {
                    draft.setUserWeight(userWeight);
                }
            });
        }
    }
}
