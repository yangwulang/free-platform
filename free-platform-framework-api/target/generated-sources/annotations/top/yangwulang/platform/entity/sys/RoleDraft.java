package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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

public interface RoleDraft extends Role, Draft {
    RoleDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    RoleDraft setRoleCode(String roleCode);

    @OldChain
    RoleDraft setRoleName(String roleName);

    @OldChain
    RoleDraft setRoleType(String roleType);

    @OldChain
    RoleDraft setRoleSort(BigDecimal roleSort);

    @OldChain
    RoleDraft setSys(boolean sys);

    @OldChain
    RoleDraft setUserType(String userType);

    @OldChain
    RoleDraft setDataScope(String dataScope);

    @OldChain
    RoleDraft setBizScope(String bizScope);

    @OldChain
    RoleDraft setStatus(String status);

    @OldChain
    RoleDraft setCreateBy(String createBy);

    @OldChain
    RoleDraft setCreateDate(LocalDateTime createDate);

    @OldChain
    RoleDraft setUpdateBy(String updateBy);

    @OldChain
    RoleDraft setUpdateDate(LocalDateTime updateDate);

    @OldChain
    RoleDraft setRemarks(String remarks);

    @OldChain
    RoleDraft setCorpCode(String corpCode);

    @OldChain
    RoleDraft setCorpName(String corpName);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                Role.class,
                null,
                (ctx, base) -> new DraftImpl(ctx, (Role)base)
            )
            .id(1, "roleCode", String.class)
            .add(2, "roleName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(3, "roleType", ImmutablePropCategory.SCALAR, String.class, true)
            .add(4, "roleSort", ImmutablePropCategory.SCALAR, BigDecimal.class, true)
            .add(5, "sys", ImmutablePropCategory.SCALAR, boolean.class, true)
            .add(6, "userType", ImmutablePropCategory.SCALAR, String.class, true)
            .add(7, "dataScope", ImmutablePropCategory.SCALAR, String.class, true)
            .add(8, "bizScope", ImmutablePropCategory.SCALAR, String.class, true)
            .key(9, "status", String.class)
            .add(10, "createBy", ImmutablePropCategory.SCALAR, String.class, false)
            .add(11, "createDate", ImmutablePropCategory.SCALAR, LocalDateTime.class, false)
            .add(12, "updateBy", ImmutablePropCategory.SCALAR, String.class, false)
            .add(13, "updateDate", ImmutablePropCategory.SCALAR, LocalDateTime.class, false)
            .add(14, "remarks", ImmutablePropCategory.SCALAR, String.class, true)
            .key(15, "corpCode", String.class)
            .add(16, "corpName", ImmutablePropCategory.SCALAR, String.class, false)
            .build();

        private Producer() {
        }

        public Role produce(DraftConsumer<RoleDraft> block) {
            return produce(null, block);
        }

        public Role produce(Role base, DraftConsumer<RoleDraft> block) {
            return (Role)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements Role, ImmutableSpi {
            @Override
            public Object __get(int prop) {
                switch (prop) {
                    case 1: return roleCode();
                    case 2: return roleName();
                    case 3: return roleType();
                    case 4: return roleSort();
                    case 5: return (Boolean)isSys();
                    case 6: return userType();
                    case 7: return dataScope();
                    case 8: return bizScope();
                    case 9: return status();
                    case 10: return createBy();
                    case 11: return createDate();
                    case 12: return updateBy();
                    case 13: return updateDate();
                    case 14: return remarks();
                    case 15: return corpCode();
                    case 16: return corpName();
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public Object __get(String prop) {
                switch (prop) {
                    case "roleCode": return roleCode();
                    case "roleName": return roleName();
                    case "roleType": return roleType();
                    case "roleSort": return roleSort();
                    case "sys": return (Boolean)isSys();
                    case "userType": return userType();
                    case "dataScope": return dataScope();
                    case "bizScope": return bizScope();
                    case "status": return status();
                    case "createBy": return createBy();
                    case "createDate": return createDate();
                    case "updateBy": return updateBy();
                    case "updateDate": return updateDate();
                    case "remarks": return remarks();
                    case "corpCode": return corpCode();
                    case "corpName": return corpName();
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
            String roleCode;

            String roleName;

            String roleType;

            boolean roleTypeLoaded = false;

            BigDecimal roleSort;

            boolean roleSortLoaded = false;

            boolean sys;

            boolean sysLoaded = false;

            String userType;

            boolean userTypeLoaded = false;

            String dataScope;

            boolean dataScopeLoaded = false;

            String bizScope;

            boolean bizScopeLoaded = false;

            String status;

            String createBy;

            LocalDateTime createDate;

            String updateBy;

            LocalDateTime updateDate;

            String remarks;

            boolean remarksLoaded = false;

            String corpCode;

            boolean corpCodeLoaded = false;

            String corpName;

            @Override
            public String roleCode() {
                if (roleCode == null) {
                    throw new UnloadedException(Role.class, "roleCode");
                }
                return roleCode;
            }

            @Override
            public String roleName() {
                if (roleName == null) {
                    throw new UnloadedException(Role.class, "roleName");
                }
                return roleName;
            }

            @Override
            public String roleType() {
                if (!roleTypeLoaded) {
                    throw new UnloadedException(Role.class, "roleType");
                }
                return roleType;
            }

            @Override
            public BigDecimal roleSort() {
                if (!roleSortLoaded) {
                    throw new UnloadedException(Role.class, "roleSort");
                }
                return roleSort;
            }

            @Override
            @JsonIgnore
            public boolean isSys() {
                if (!sysLoaded) {
                    throw new UnloadedException(Role.class, "sys");
                }
                return sys;
            }

            @Override
            public String userType() {
                if (!userTypeLoaded) {
                    throw new UnloadedException(Role.class, "userType");
                }
                return userType;
            }

            @Override
            public String dataScope() {
                if (!dataScopeLoaded) {
                    throw new UnloadedException(Role.class, "dataScope");
                }
                return dataScope;
            }

            @Override
            public String bizScope() {
                if (!bizScopeLoaded) {
                    throw new UnloadedException(Role.class, "bizScope");
                }
                return bizScope;
            }

            @Override
            public String status() {
                if (status == null) {
                    throw new UnloadedException(Role.class, "status");
                }
                return status;
            }

            @Override
            public String createBy() {
                if (createBy == null) {
                    throw new UnloadedException(Role.class, "createBy");
                }
                return createBy;
            }

            @Override
            public LocalDateTime createDate() {
                if (createDate == null) {
                    throw new UnloadedException(Role.class, "createDate");
                }
                return createDate;
            }

            @Override
            public String updateBy() {
                if (updateBy == null) {
                    throw new UnloadedException(Role.class, "updateBy");
                }
                return updateBy;
            }

            @Override
            public LocalDateTime updateDate() {
                if (updateDate == null) {
                    throw new UnloadedException(Role.class, "updateDate");
                }
                return updateDate;
            }

            @Override
            public String remarks() {
                if (!remarksLoaded) {
                    throw new UnloadedException(Role.class, "remarks");
                }
                return remarks;
            }

            @Override
            public String corpCode() {
                if (!corpCodeLoaded) {
                    throw new UnloadedException(Role.class, "corpCode");
                }
                return corpCode;
            }

            @Override
            public String corpName() {
                if (corpName == null) {
                    throw new UnloadedException(Role.class, "corpName");
                }
                return corpName;
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
                    case 1: return roleCode != null;
                    case 2: return roleName != null;
                    case 3: return roleTypeLoaded;
                    case 4: return roleSortLoaded;
                    case 5: return sysLoaded;
                    case 6: return userTypeLoaded;
                    case 7: return dataScopeLoaded;
                    case 8: return bizScopeLoaded;
                    case 9: return status != null;
                    case 10: return createBy != null;
                    case 11: return createDate != null;
                    case 12: return updateBy != null;
                    case 13: return updateDate != null;
                    case 14: return remarksLoaded;
                    case 15: return corpCodeLoaded;
                    case 16: return corpName != null;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "roleCode": return roleCode != null;
                    case "roleName": return roleName != null;
                    case "roleType": return roleTypeLoaded;
                    case "roleSort": return roleSortLoaded;
                    case "sys": return sysLoaded;
                    case "userType": return userTypeLoaded;
                    case "dataScope": return dataScopeLoaded;
                    case "bizScope": return bizScopeLoaded;
                    case "status": return status != null;
                    case "createBy": return createBy != null;
                    case "createDate": return createDate != null;
                    case "updateBy": return updateBy != null;
                    case "updateDate": return updateDate != null;
                    case "remarks": return remarksLoaded;
                    case "corpCode": return corpCodeLoaded;
                    case "corpName": return corpName != null;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public int hashCode() {
                int hash = 1;
                if (roleCode != null) {
                    hash = 31 * hash + roleCode.hashCode();
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (roleName != null) {
                    hash = 31 * hash + roleName.hashCode();
                }
                if (roleTypeLoaded && roleType != null) {
                    hash = 31 * hash + roleType.hashCode();
                }
                if (roleSortLoaded && roleSort != null) {
                    hash = 31 * hash + roleSort.hashCode();
                }
                if (sysLoaded) {
                    hash = 31 * hash + Boolean.hashCode(sys);
                }
                if (userTypeLoaded && userType != null) {
                    hash = 31 * hash + userType.hashCode();
                }
                if (dataScopeLoaded && dataScope != null) {
                    hash = 31 * hash + dataScope.hashCode();
                }
                if (bizScopeLoaded && bizScope != null) {
                    hash = 31 * hash + bizScope.hashCode();
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
                if (corpCodeLoaded && corpCode != null) {
                    hash = 31 * hash + corpCode.hashCode();
                }
                if (corpName != null) {
                    hash = 31 * hash + corpName.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = 1;
                if (roleCode != null) {
                    hash = 31 * hash + System.identityHashCode(roleCode);
                }
                if (roleName != null) {
                    hash = 31 * hash + System.identityHashCode(roleName);
                }
                if (roleTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(roleType);
                }
                if (roleSortLoaded) {
                    hash = 31 * hash + System.identityHashCode(roleSort);
                }
                if (sysLoaded) {
                    hash = 31 * hash + Boolean.hashCode(sys);
                }
                if (userTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(userType);
                }
                if (dataScopeLoaded) {
                    hash = 31 * hash + System.identityHashCode(dataScope);
                }
                if (bizScopeLoaded) {
                    hash = 31 * hash + System.identityHashCode(bizScope);
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
                if (corpCodeLoaded) {
                    hash = 31 * hash + System.identityHashCode(corpCode);
                }
                if (corpName != null) {
                    hash = 31 * hash + System.identityHashCode(corpName);
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
                boolean __roleCodeLoaded = roleCode != null;
                if (__roleCodeLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__roleCodeLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(roleCode, other.roleCode());
                }
                boolean __roleNameLoaded = roleName != null;
                if (__roleNameLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__roleNameLoaded && !Objects.equals(roleName, other.roleName())) {
                    return false;
                }
                boolean __roleTypeLoaded = roleTypeLoaded;
                if (__roleTypeLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__roleTypeLoaded && !Objects.equals(roleType, other.roleType())) {
                    return false;
                }
                boolean __roleSortLoaded = roleSortLoaded;
                if (__roleSortLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__roleSortLoaded && !Objects.equals(roleSort, other.roleSort())) {
                    return false;
                }
                boolean __sysLoaded = sysLoaded;
                if (__sysLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__sysLoaded && sys != other.isSys()) {
                    return false;
                }
                boolean __userTypeLoaded = userTypeLoaded;
                if (__userTypeLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__userTypeLoaded && !Objects.equals(userType, other.userType())) {
                    return false;
                }
                boolean __dataScopeLoaded = dataScopeLoaded;
                if (__dataScopeLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__dataScopeLoaded && !Objects.equals(dataScope, other.dataScope())) {
                    return false;
                }
                boolean __bizScopeLoaded = bizScopeLoaded;
                if (__bizScopeLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__bizScopeLoaded && !Objects.equals(bizScope, other.bizScope())) {
                    return false;
                }
                boolean __statusLoaded = status != null;
                if (__statusLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__statusLoaded && !Objects.equals(status, other.status())) {
                    return false;
                }
                boolean __createByLoaded = createBy != null;
                if (__createByLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__createByLoaded && !Objects.equals(createBy, other.createBy())) {
                    return false;
                }
                boolean __createDateLoaded = createDate != null;
                if (__createDateLoaded != other.__isLoaded(11)) {
                    return false;
                }
                if (__createDateLoaded && !Objects.equals(createDate, other.createDate())) {
                    return false;
                }
                boolean __updateByLoaded = updateBy != null;
                if (__updateByLoaded != other.__isLoaded(12)) {
                    return false;
                }
                if (__updateByLoaded && !Objects.equals(updateBy, other.updateBy())) {
                    return false;
                }
                boolean __updateDateLoaded = updateDate != null;
                if (__updateDateLoaded != other.__isLoaded(13)) {
                    return false;
                }
                if (__updateDateLoaded && !Objects.equals(updateDate, other.updateDate())) {
                    return false;
                }
                boolean __remarksLoaded = remarksLoaded;
                if (__remarksLoaded != other.__isLoaded(14)) {
                    return false;
                }
                if (__remarksLoaded && !Objects.equals(remarks, other.remarks())) {
                    return false;
                }
                boolean __corpCodeLoaded = corpCodeLoaded;
                if (__corpCodeLoaded != other.__isLoaded(15)) {
                    return false;
                }
                if (__corpCodeLoaded && !Objects.equals(corpCode, other.corpCode())) {
                    return false;
                }
                boolean __corpNameLoaded = corpName != null;
                if (__corpNameLoaded != other.__isLoaded(16)) {
                    return false;
                }
                if (__corpNameLoaded && !Objects.equals(corpName, other.corpName())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor other = (Implementor)obj;
                boolean __roleCodeLoaded = roleCode != null;
                if (__roleCodeLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__roleCodeLoaded && roleCode != other.roleCode()) {
                    return false;
                }
                boolean __roleNameLoaded = roleName != null;
                if (__roleNameLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__roleNameLoaded && roleName != other.roleName()) {
                    return false;
                }
                boolean __roleTypeLoaded = roleTypeLoaded;
                if (__roleTypeLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__roleTypeLoaded && roleType != other.roleType()) {
                    return false;
                }
                boolean __roleSortLoaded = roleSortLoaded;
                if (__roleSortLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__roleSortLoaded && roleSort != other.roleSort()) {
                    return false;
                }
                boolean __sysLoaded = sysLoaded;
                if (__sysLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__sysLoaded && sys != other.isSys()) {
                    return false;
                }
                boolean __userTypeLoaded = userTypeLoaded;
                if (__userTypeLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__userTypeLoaded && userType != other.userType()) {
                    return false;
                }
                boolean __dataScopeLoaded = dataScopeLoaded;
                if (__dataScopeLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__dataScopeLoaded && dataScope != other.dataScope()) {
                    return false;
                }
                boolean __bizScopeLoaded = bizScopeLoaded;
                if (__bizScopeLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__bizScopeLoaded && bizScope != other.bizScope()) {
                    return false;
                }
                boolean __statusLoaded = status != null;
                if (__statusLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__statusLoaded && status != other.status()) {
                    return false;
                }
                boolean __createByLoaded = createBy != null;
                if (__createByLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__createByLoaded && createBy != other.createBy()) {
                    return false;
                }
                boolean __createDateLoaded = createDate != null;
                if (__createDateLoaded != other.__isLoaded(11)) {
                    return false;
                }
                if (__createDateLoaded && createDate != other.createDate()) {
                    return false;
                }
                boolean __updateByLoaded = updateBy != null;
                if (__updateByLoaded != other.__isLoaded(12)) {
                    return false;
                }
                if (__updateByLoaded && updateBy != other.updateBy()) {
                    return false;
                }
                boolean __updateDateLoaded = updateDate != null;
                if (__updateDateLoaded != other.__isLoaded(13)) {
                    return false;
                }
                if (__updateDateLoaded && updateDate != other.updateDate()) {
                    return false;
                }
                boolean __remarksLoaded = remarksLoaded;
                if (__remarksLoaded != other.__isLoaded(14)) {
                    return false;
                }
                if (__remarksLoaded && remarks != other.remarks()) {
                    return false;
                }
                boolean __corpCodeLoaded = corpCodeLoaded;
                if (__corpCodeLoaded != other.__isLoaded(15)) {
                    return false;
                }
                if (__corpCodeLoaded && corpCode != other.corpCode()) {
                    return false;
                }
                boolean __corpNameLoaded = corpName != null;
                if (__corpNameLoaded != other.__isLoaded(16)) {
                    return false;
                }
                if (__corpNameLoaded && corpName != other.corpName()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, RoleDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, Role base) {
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
            public String roleCode() {
                return (__modified!= null ? __modified : __base).roleCode();
            }

            @Override
            public RoleDraft setRoleCode(String roleCode) {
                if (roleCode == null) {
                    throw new IllegalArgumentException(
                        "'roleCode' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.roleCode = roleCode;
                return this;
            }

            @Override
            public String roleName() {
                return (__modified!= null ? __modified : __base).roleName();
            }

            @Override
            public RoleDraft setRoleName(String roleName) {
                if (roleName == null) {
                    throw new IllegalArgumentException(
                        "'roleName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.roleName = roleName;
                return this;
            }

            @Override
            public String roleType() {
                return (__modified!= null ? __modified : __base).roleType();
            }

            @Override
            public RoleDraft setRoleType(String roleType) {
                Impl __tmpModified = __modified();
                __tmpModified.roleType = roleType;
                __tmpModified.roleTypeLoaded = true;
                return this;
            }

            @Override
            public BigDecimal roleSort() {
                return (__modified!= null ? __modified : __base).roleSort();
            }

            @Override
            public RoleDraft setRoleSort(BigDecimal roleSort) {
                Impl __tmpModified = __modified();
                __tmpModified.roleSort = roleSort;
                __tmpModified.roleSortLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public boolean isSys() {
                return (__modified!= null ? __modified : __base).isSys();
            }

            @Override
            public RoleDraft setSys(boolean sys) {
                Impl __tmpModified = __modified();
                __tmpModified.sys = sys;
                __tmpModified.sysLoaded = true;
                return this;
            }

            @Override
            public String userType() {
                return (__modified!= null ? __modified : __base).userType();
            }

            @Override
            public RoleDraft setUserType(String userType) {
                Impl __tmpModified = __modified();
                __tmpModified.userType = userType;
                __tmpModified.userTypeLoaded = true;
                return this;
            }

            @Override
            public String dataScope() {
                return (__modified!= null ? __modified : __base).dataScope();
            }

            @Override
            public RoleDraft setDataScope(String dataScope) {
                Impl __tmpModified = __modified();
                __tmpModified.dataScope = dataScope;
                __tmpModified.dataScopeLoaded = true;
                return this;
            }

            @Override
            public String bizScope() {
                return (__modified!= null ? __modified : __base).bizScope();
            }

            @Override
            public RoleDraft setBizScope(String bizScope) {
                Impl __tmpModified = __modified();
                __tmpModified.bizScope = bizScope;
                __tmpModified.bizScopeLoaded = true;
                return this;
            }

            @Override
            public String status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public RoleDraft setStatus(String status) {
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
            public RoleDraft setCreateBy(String createBy) {
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
            public RoleDraft setCreateDate(LocalDateTime createDate) {
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
            public RoleDraft setUpdateBy(String updateBy) {
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
            public RoleDraft setUpdateDate(LocalDateTime updateDate) {
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
            public RoleDraft setRemarks(String remarks) {
                Impl __tmpModified = __modified();
                __tmpModified.remarks = remarks;
                __tmpModified.remarksLoaded = true;
                return this;
            }

            @Override
            public String corpCode() {
                return (__modified!= null ? __modified : __base).corpCode();
            }

            @Override
            public RoleDraft setCorpCode(String corpCode) {
                Impl __tmpModified = __modified();
                __tmpModified.corpCode = corpCode;
                __tmpModified.corpCodeLoaded = true;
                return this;
            }

            @Override
            public String corpName() {
                return (__modified!= null ? __modified : __base).corpName();
            }

            @Override
            public RoleDraft setCorpName(String corpName) {
                if (corpName == null) {
                    throw new IllegalArgumentException(
                        "'corpName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.corpName = corpName;
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(int prop, Object value) {
                switch (prop) {
                    case 1: setRoleCode((String)value);break;
                    case 2: setRoleName((String)value);break;
                    case 3: setRoleType((String)value);break;
                    case 4: setRoleSort((BigDecimal)value);break;
                    case 5: 
                            if (value == null) throw new IllegalArgumentException("'sys' cannot be null");
                            setSys((Boolean)value);
                            break;
                    case 6: setUserType((String)value);break;
                    case 7: setDataScope((String)value);break;
                    case 8: setBizScope((String)value);break;
                    case 9: setStatus((String)value);break;
                    case 10: setCreateBy((String)value);break;
                    case 11: setCreateDate((LocalDateTime)value);break;
                    case 12: setUpdateBy((String)value);break;
                    case 13: setUpdateDate((LocalDateTime)value);break;
                    case 14: setRemarks((String)value);break;
                    case 15: setCorpCode((String)value);break;
                    case 16: setCorpName((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "roleCode": setRoleCode((String)value);break;
                    case "roleName": setRoleName((String)value);break;
                    case "roleType": setRoleType((String)value);break;
                    case "roleSort": setRoleSort((BigDecimal)value);break;
                    case "sys": 
                            if (value == null) throw new IllegalArgumentException("'sys' cannot be null");
                            setSys((Boolean)value);
                            break;
                    case "userType": setUserType((String)value);break;
                    case "dataScope": setDataScope((String)value);break;
                    case "bizScope": setBizScope((String)value);break;
                    case "status": setStatus((String)value);break;
                    case "createBy": setCreateBy((String)value);break;
                    case "createDate": setCreateDate((LocalDateTime)value);break;
                    case "updateBy": setUpdateBy((String)value);break;
                    case "updateDate": setUpdateDate((LocalDateTime)value);break;
                    case "remarks": setRemarks((String)value);break;
                    case "corpCode": setCorpCode((String)value);break;
                    case "corpName": setCorpName((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(int prop) {
                switch (prop) {
                    case 1: __modified().roleCode = null;break;
                    case 2: __modified().roleName = null;break;
                    case 3: __modified().roleTypeLoaded = false;break;
                    case 4: __modified().roleSortLoaded = false;break;
                    case 5: __modified().sysLoaded = false;break;
                    case 6: __modified().userTypeLoaded = false;break;
                    case 7: __modified().dataScopeLoaded = false;break;
                    case 8: __modified().bizScopeLoaded = false;break;
                    case 9: __modified().status = null;break;
                    case 10: __modified().createBy = null;break;
                    case 11: __modified().createDate = null;break;
                    case 12: __modified().updateBy = null;break;
                    case 13: __modified().updateDate = null;break;
                    case 14: __modified().remarksLoaded = false;break;
                    case 15: __modified().corpCodeLoaded = false;break;
                    case 16: __modified().corpName = null;break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "roleCode": __modified().roleCode = null;break;
                    case "roleName": __modified().roleName = null;break;
                    case "roleType": __modified().roleTypeLoaded = false;break;
                    case "roleSort": __modified().roleSortLoaded = false;break;
                    case "sys": __modified().sysLoaded = false;break;
                    case "userType": __modified().userTypeLoaded = false;break;
                    case "dataScope": __modified().dataScopeLoaded = false;break;
                    case "bizScope": __modified().bizScopeLoaded = false;break;
                    case "status": __modified().status = null;break;
                    case "createBy": __modified().createBy = null;break;
                    case "createDate": __modified().createDate = null;break;
                    case "updateBy": __modified().updateBy = null;break;
                    case "updateDate": __modified().updateDate = null;break;
                    case "remarks": __modified().remarksLoaded = false;break;
                    case "corpCode": __modified().corpCodeLoaded = false;break;
                    case "corpName": __modified().corpName = null;break;
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
        private String roleCode;

        private String roleName;

        private boolean roleTypeLoaded;

        private String roleType;

        private boolean roleSortLoaded;

        private BigDecimal roleSort;

        private boolean sysLoaded;

        private boolean sys;

        private boolean userTypeLoaded;

        private String userType;

        private boolean dataScopeLoaded;

        private String dataScope;

        private boolean bizScopeLoaded;

        private String bizScope;

        private String status;

        private String createBy;

        private LocalDateTime createDate;

        private String updateBy;

        private LocalDateTime updateDate;

        private boolean remarksLoaded;

        private String remarks;

        private boolean corpCodeLoaded;

        private String corpCode;

        private String corpName;

        public MapStruct roleCode(String roleCode) {
            if (roleCode != null) {
                this.roleCode = roleCode;
            }
            return this;
        }

        public MapStruct roleName(String roleName) {
            if (roleName != null) {
                this.roleName = roleName;
            }
            return this;
        }

        public MapStruct roleType(String roleType) {
            this.roleTypeLoaded = true;
            this.roleType = roleType;
            return this;
        }

        public MapStruct roleSort(BigDecimal roleSort) {
            this.roleSortLoaded = true;
            this.roleSort = roleSort;
            return this;
        }

        public MapStruct sys(boolean sys) {
            this.sysLoaded = true;
            this.sys = sys;
            return this;
        }

        public MapStruct userType(String userType) {
            this.userTypeLoaded = true;
            this.userType = userType;
            return this;
        }

        public MapStruct dataScope(String dataScope) {
            this.dataScopeLoaded = true;
            this.dataScope = dataScope;
            return this;
        }

        public MapStruct bizScope(String bizScope) {
            this.bizScopeLoaded = true;
            this.bizScope = bizScope;
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

        public MapStruct corpCode(String corpCode) {
            this.corpCodeLoaded = true;
            this.corpCode = corpCode;
            return this;
        }

        public MapStruct corpName(String corpName) {
            if (corpName != null) {
                this.corpName = corpName;
            }
            return this;
        }

        public Role build() {
            return RoleDraft.$.produce(draft -> {
                if (roleCode != null) {
                    draft.setRoleCode(roleCode);
                }
                if (roleName != null) {
                    draft.setRoleName(roleName);
                }
                if (roleTypeLoaded) {
                    draft.setRoleType(roleType);
                }
                if (roleSortLoaded) {
                    draft.setRoleSort(roleSort);
                }
                if (sysLoaded) {
                    draft.setSys(sys);
                }
                if (userTypeLoaded) {
                    draft.setUserType(userType);
                }
                if (dataScopeLoaded) {
                    draft.setDataScope(dataScope);
                }
                if (bizScopeLoaded) {
                    draft.setBizScope(bizScope);
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
                if (corpCodeLoaded) {
                    draft.setCorpCode(corpCode);
                }
                if (corpName != null) {
                    draft.setCorpName(corpName);
                }
            });
        }
    }
}
