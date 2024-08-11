package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.math.BigDecimal;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.DataTypeBaseDraft;

@GeneratedBy(
        type = Role.class
)
public interface RoleDraft extends Role, DataTypeBaseDraft {
    RoleDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    RoleDraft setId(String id);

    @OldChain
    RoleDraft setStatus(int status);

    @OldChain
    RoleDraft setCreateBy(String createBy);

    @OldChain
    RoleDraft setCreateDate(Date createDate);

    @OldChain
    RoleDraft setUpdateBy(String updateBy);

    @OldChain
    RoleDraft setUpdateDate(Date updateDate);

    @OldChain
    RoleDraft setRemarks(String remarks);

    @OldChain
    RoleDraft setRoleCode(String roleCode);

    @OldChain
    RoleDraft setRoleName(String roleName);

    @OldChain
    RoleDraft setRoleType(String roleType);

    @OldChain
    RoleDraft setRoleSort(BigDecimal roleSort);

    @OldChain
    RoleDraft setIsSys(Boolean isSys);

    @OldChain
    RoleDraft setUserType(String userType);

    @OldChain
    RoleDraft setDataScope(String dataScope);

    @OldChain
    RoleDraft setBizScope(String bizScope);

    @OldChain
    RoleDraft setCorpCode(String corpCode);

    @OldChain
    RoleDraft setCorpName(String corpName);

    List<MenuDraft> menus(boolean autoCreate);

    @OldChain
    RoleDraft setMenus(List<Menu> menus);

    @OldChain
    RoleDraft addIntoMenus(DraftConsumer<MenuDraft> block);

    @OldChain
    RoleDraft addIntoMenus(Menu base, DraftConsumer<MenuDraft> block);

    List<UserDraft> users(boolean autoCreate);

    @OldChain
    RoleDraft setUsers(List<User> users);

    @OldChain
    RoleDraft addIntoUsers(DraftConsumer<UserDraft> block);

    @OldChain
    RoleDraft addIntoUsers(User base, DraftConsumer<UserDraft> block);

    @GeneratedBy(
            type = Role.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_STATUS = 1;

        public static final int SLOT_CREATE_BY = 2;

        public static final int SLOT_CREATE_DATE = 3;

        public static final int SLOT_UPDATE_BY = 4;

        public static final int SLOT_UPDATE_DATE = 5;

        public static final int SLOT_REMARKS = 6;

        public static final int SLOT_ROLE_CODE = 7;

        public static final int SLOT_ROLE_NAME = 8;

        public static final int SLOT_ROLE_TYPE = 9;

        public static final int SLOT_ROLE_SORT = 10;

        public static final int SLOT_IS_SYS = 11;

        public static final int SLOT_USER_TYPE = 12;

        public static final int SLOT_DATA_SCOPE = 13;

        public static final int SLOT_BIZ_SCOPE = 14;

        public static final int SLOT_CORP_CODE = 15;

        public static final int SLOT_CORP_NAME = 16;

        public static final int SLOT_MENUS = 17;

        public static final int SLOT_USERS = 18;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.150",
                Role.class,
                Collections.singleton(DataTypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (Role)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("status", SLOT_STATUS)
            .redefine("createBy", SLOT_CREATE_BY)
            .redefine("createDate", SLOT_CREATE_DATE)
            .redefine("updateBy", SLOT_UPDATE_BY)
            .redefine("updateDate", SLOT_UPDATE_DATE)
            .redefine("remarks", SLOT_REMARKS)
            .key(SLOT_ROLE_CODE, "roleCode", String.class, false)
            .key(SLOT_ROLE_NAME, "roleName", String.class, false)
            .add(SLOT_ROLE_TYPE, "roleType", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_ROLE_SORT, "roleSort", ImmutablePropCategory.SCALAR, BigDecimal.class, true)
            .add(SLOT_IS_SYS, "isSys", ImmutablePropCategory.SCALAR, Boolean.class, true)
            .add(SLOT_USER_TYPE, "userType", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_DATA_SCOPE, "dataScope", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_BIZ_SCOPE, "bizScope", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CORP_CODE, "corpCode", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CORP_NAME, "corpName", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_MENUS, "menus", ManyToMany.class, Menu.class, false)
            .add(SLOT_USERS, "users", ManyToMany.class, User.class, false)
            .build();

        private Producer() {
        }

        public Role produce(DraftConsumer<RoleDraft> block) {
            return produce(null, block);
        }

        public Role produce(Role base, DraftConsumer<RoleDraft> block) {
            return (Role)Internal.produce(TYPE, base, block);
        }

        @GeneratedBy(
                type = Role.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "status", "createBy", "createDate", "updateBy", "updateDate", "remarks", "roleCode", "roleName", "roleType", "roleSort", "isSys", "userType", "dataScope", "bizScope", "corpCode", "corpName", "menus", "users"})
        public abstract interface Implementor extends Role, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
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
                    case SLOT_ROLE_CODE:
                    		return roleCode();
                    case SLOT_ROLE_NAME:
                    		return roleName();
                    case SLOT_ROLE_TYPE:
                    		return roleType();
                    case SLOT_ROLE_SORT:
                    		return roleSort();
                    case SLOT_IS_SYS:
                    		return isSys();
                    case SLOT_USER_TYPE:
                    		return userType();
                    case SLOT_DATA_SCOPE:
                    		return dataScope();
                    case SLOT_BIZ_SCOPE:
                    		return bizScope();
                    case SLOT_CORP_CODE:
                    		return corpCode();
                    case SLOT_CORP_NAME:
                    		return corpName();
                    case SLOT_MENUS:
                    		return menus();
                    case SLOT_USERS:
                    		return users();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Role\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
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
                    case "roleCode":
                    		return roleCode();
                    case "roleName":
                    		return roleName();
                    case "roleType":
                    		return roleType();
                    case "roleSort":
                    		return roleSort();
                    case "isSys":
                    		return isSys();
                    case "userType":
                    		return userType();
                    case "dataScope":
                    		return dataScope();
                    case "bizScope":
                    		return bizScope();
                    case "corpCode":
                    		return corpCode();
                    case "corpName":
                    		return corpName();
                    case "menus":
                    		return menus();
                    case "users":
                    		return users();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Role\": \"" + prop + "\"");
                }
            }

            @NotNull
            default String getId() {
                return id();
            }

            @Schema(
                    description = "状态"
            )
            default int getStatus() {
                return status();
            }

            @NotNull
            default String getCreateBy() {
                return createBy();
            }

            @NotNull
            default Date getCreateDate() {
                return createDate();
            }

            @NotNull
            default String getUpdateBy() {
                return updateBy();
            }

            @NotNull
            default Date getUpdateDate() {
                return updateDate();
            }

            @Nullable
            default String getRemarks() {
                return remarks();
            }

            @Schema(
                    description = "角色编码"
            )
            default String getRoleCode() {
                return roleCode();
            }

            @Schema(
                    description = "角色名称"
            )
            default String getRoleName() {
                return roleName();
            }

            @Schema(
                    description = "角色类型"
            )
            @jakarta.annotation.Nullable
            default String getRoleType() {
                return roleType();
            }

            @Schema(
                    description = "角色排序"
            )
            @jakarta.annotation.Nullable
            default BigDecimal getRoleSort() {
                return roleSort();
            }

            @Schema(
                    description = "系统内置 1是 0否"
            )
            default Boolean getIsSys() {
                return isSys();
            }

            @Schema(
                    description = "用户类型"
            )
            @jakarta.annotation.Nullable
            default String getUserType() {
                return userType();
            }

            @Schema(
                    description = "数据范围设置"
            )
            @jakarta.annotation.Nullable
            default String getDataScope() {
                return dataScope();
            }

            @Schema(
                    description = "适应业务范围"
            )
            @jakarta.annotation.Nullable
            default String getBizScope() {
                return bizScope();
            }

            @jakarta.annotation.Nullable
            default String getCorpCode() {
                return corpCode();
            }

            @jakarta.annotation.Nullable
            default String getCorpName() {
                return corpName();
            }

            @Schema(
                    description = "角色拥有的菜单"
            )
            default List<Menu> getMenus() {
                return menus();
            }

            @Schema(
                    description = "角色拥有的用户"
            )
            default List<User> getUsers() {
                return users();
            }

            @Override
            default ImmutableType __type() {
                return TYPE;
            }

            default int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        @GeneratedBy(
                type = Role.class
        )
        private static class Impl implements Implementor, Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            int __statusValue;

            boolean __statusLoaded = false;

            String __createByValue;

            Date __createDateValue;

            String __updateByValue;

            Date __updateDateValue;

            String __remarksValue;

            boolean __remarksLoaded = false;

            String __roleCodeValue;

            String __roleNameValue;

            String __roleTypeValue;

            boolean __roleTypeLoaded = false;

            BigDecimal __roleSortValue;

            boolean __roleSortLoaded = false;

            Boolean __isSysValue;

            boolean __isSysLoaded = false;

            String __userTypeValue;

            boolean __userTypeLoaded = false;

            String __dataScopeValue;

            boolean __dataScopeLoaded = false;

            String __bizScopeValue;

            boolean __bizScopeLoaded = false;

            String __corpCodeValue;

            boolean __corpCodeLoaded = false;

            String __corpNameValue;

            boolean __corpNameLoaded = false;

            NonSharedList<Menu> __menusValue;

            NonSharedList<User> __usersValue;

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(Role.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public int status() {
                if (!__statusLoaded) {
                    throw new UnloadedException(Role.class, "status");
                }
                return __statusValue;
            }

            @Override
            @JsonIgnore
            public String createBy() {
                if (__createByValue == null) {
                    throw new UnloadedException(Role.class, "createBy");
                }
                return __createByValue;
            }

            @Override
            @JsonIgnore
            public Date createDate() {
                if (__createDateValue == null) {
                    throw new UnloadedException(Role.class, "createDate");
                }
                return __createDateValue;
            }

            @Override
            @JsonIgnore
            public String updateBy() {
                if (__updateByValue == null) {
                    throw new UnloadedException(Role.class, "updateBy");
                }
                return __updateByValue;
            }

            @Override
            @JsonIgnore
            public Date updateDate() {
                if (__updateDateValue == null) {
                    throw new UnloadedException(Role.class, "updateDate");
                }
                return __updateDateValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String remarks() {
                if (!__remarksLoaded) {
                    throw new UnloadedException(Role.class, "remarks");
                }
                return __remarksValue;
            }

            @Override
            @JsonIgnore
            public String roleCode() {
                if (__roleCodeValue == null) {
                    throw new UnloadedException(Role.class, "roleCode");
                }
                return __roleCodeValue;
            }

            @Override
            @JsonIgnore
            public String roleName() {
                if (__roleNameValue == null) {
                    throw new UnloadedException(Role.class, "roleName");
                }
                return __roleNameValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String roleType() {
                if (!__roleTypeLoaded) {
                    throw new UnloadedException(Role.class, "roleType");
                }
                return __roleTypeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public BigDecimal roleSort() {
                if (!__roleSortLoaded) {
                    throw new UnloadedException(Role.class, "roleSort");
                }
                return __roleSortValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Boolean isSys() {
                if (!__isSysLoaded) {
                    throw new UnloadedException(Role.class, "isSys");
                }
                return __isSysValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String userType() {
                if (!__userTypeLoaded) {
                    throw new UnloadedException(Role.class, "userType");
                }
                return __userTypeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String dataScope() {
                if (!__dataScopeLoaded) {
                    throw new UnloadedException(Role.class, "dataScope");
                }
                return __dataScopeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String bizScope() {
                if (!__bizScopeLoaded) {
                    throw new UnloadedException(Role.class, "bizScope");
                }
                return __bizScopeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String corpCode() {
                if (!__corpCodeLoaded) {
                    throw new UnloadedException(Role.class, "corpCode");
                }
                return __corpCodeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String corpName() {
                if (!__corpNameLoaded) {
                    throw new UnloadedException(Role.class, "corpName");
                }
                return __corpNameValue;
            }

            @Override
            @JsonIgnore
            public List<Menu> menus() {
                if (__menusValue == null) {
                    throw new UnloadedException(Role.class, "menus");
                }
                return __menusValue;
            }

            @Override
            @JsonIgnore
            public List<User> users() {
                if (__usersValue == null) {
                    throw new UnloadedException(Role.class, "users");
                }
                return __usersValue;
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
                    case SLOT_ID:
                    		return __idValue != null;
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
                    case SLOT_ROLE_CODE:
                    		return __roleCodeValue != null;
                    case SLOT_ROLE_NAME:
                    		return __roleNameValue != null;
                    case SLOT_ROLE_TYPE:
                    		return __roleTypeLoaded;
                    case SLOT_ROLE_SORT:
                    		return __roleSortLoaded;
                    case SLOT_IS_SYS:
                    		return __isSysLoaded;
                    case SLOT_USER_TYPE:
                    		return __userTypeLoaded;
                    case SLOT_DATA_SCOPE:
                    		return __dataScopeLoaded;
                    case SLOT_BIZ_SCOPE:
                    		return __bizScopeLoaded;
                    case SLOT_CORP_CODE:
                    		return __corpCodeLoaded;
                    case SLOT_CORP_NAME:
                    		return __corpNameLoaded;
                    case SLOT_MENUS:
                    		return __menusValue != null;
                    case SLOT_USERS:
                    		return __usersValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Role\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
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
                    case "roleCode":
                    		return __roleCodeValue != null;
                    case "roleName":
                    		return __roleNameValue != null;
                    case "roleType":
                    		return __roleTypeLoaded;
                    case "roleSort":
                    		return __roleSortLoaded;
                    case "isSys":
                    		return __isSysLoaded;
                    case "userType":
                    		return __userTypeLoaded;
                    case "dataScope":
                    		return __dataScopeLoaded;
                    case "bizScope":
                    		return __bizScopeLoaded;
                    case "corpCode":
                    		return __corpCodeLoaded;
                    case "corpName":
                    		return __corpNameLoaded;
                    case "menus":
                    		return __menusValue != null;
                    case "users":
                    		return __usersValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Role\": \"" + prop + "\"");
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
                    case SLOT_ID:
                    		return __visibility.visible(SLOT_ID);
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
                    case SLOT_ROLE_CODE:
                    		return __visibility.visible(SLOT_ROLE_CODE);
                    case SLOT_ROLE_NAME:
                    		return __visibility.visible(SLOT_ROLE_NAME);
                    case SLOT_ROLE_TYPE:
                    		return __visibility.visible(SLOT_ROLE_TYPE);
                    case SLOT_ROLE_SORT:
                    		return __visibility.visible(SLOT_ROLE_SORT);
                    case SLOT_IS_SYS:
                    		return __visibility.visible(SLOT_IS_SYS);
                    case SLOT_USER_TYPE:
                    		return __visibility.visible(SLOT_USER_TYPE);
                    case SLOT_DATA_SCOPE:
                    		return __visibility.visible(SLOT_DATA_SCOPE);
                    case SLOT_BIZ_SCOPE:
                    		return __visibility.visible(SLOT_BIZ_SCOPE);
                    case SLOT_CORP_CODE:
                    		return __visibility.visible(SLOT_CORP_CODE);
                    case SLOT_CORP_NAME:
                    		return __visibility.visible(SLOT_CORP_NAME);
                    case SLOT_MENUS:
                    		return __visibility.visible(SLOT_MENUS);
                    case SLOT_USERS:
                    		return __visibility.visible(SLOT_USERS);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "id":
                    		return __visibility.visible(SLOT_ID);
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
                    case "roleCode":
                    		return __visibility.visible(SLOT_ROLE_CODE);
                    case "roleName":
                    		return __visibility.visible(SLOT_ROLE_NAME);
                    case "roleType":
                    		return __visibility.visible(SLOT_ROLE_TYPE);
                    case "roleSort":
                    		return __visibility.visible(SLOT_ROLE_SORT);
                    case "isSys":
                    		return __visibility.visible(SLOT_IS_SYS);
                    case "userType":
                    		return __visibility.visible(SLOT_USER_TYPE);
                    case "dataScope":
                    		return __visibility.visible(SLOT_DATA_SCOPE);
                    case "bizScope":
                    		return __visibility.visible(SLOT_BIZ_SCOPE);
                    case "corpCode":
                    		return __visibility.visible(SLOT_CORP_CODE);
                    case "corpName":
                    		return __visibility.visible(SLOT_CORP_NAME);
                    case "menus":
                    		return __visibility.visible(SLOT_MENUS);
                    case "users":
                    		return __visibility.visible(SLOT_USERS);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + __idValue.hashCode();
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
                if (__roleCodeValue != null) {
                    hash = 31 * hash + __roleCodeValue.hashCode();
                }
                if (__roleNameValue != null) {
                    hash = 31 * hash + __roleNameValue.hashCode();
                }
                if (__roleTypeLoaded && __roleTypeValue != null) {
                    hash = 31 * hash + __roleTypeValue.hashCode();
                }
                if (__roleSortLoaded && __roleSortValue != null) {
                    hash = 31 * hash + __roleSortValue.hashCode();
                }
                if (__isSysLoaded && __isSysValue != null) {
                    hash = 31 * hash + __isSysValue.hashCode();
                }
                if (__userTypeLoaded && __userTypeValue != null) {
                    hash = 31 * hash + __userTypeValue.hashCode();
                }
                if (__dataScopeLoaded && __dataScopeValue != null) {
                    hash = 31 * hash + __dataScopeValue.hashCode();
                }
                if (__bizScopeLoaded && __bizScopeValue != null) {
                    hash = 31 * hash + __bizScopeValue.hashCode();
                }
                if (__corpCodeLoaded && __corpCodeValue != null) {
                    hash = 31 * hash + __corpCodeValue.hashCode();
                }
                if (__corpNameLoaded && __corpNameValue != null) {
                    hash = 31 * hash + __corpNameValue.hashCode();
                }
                if (__menusValue != null) {
                    hash = 31 * hash + __menusValue.hashCode();
                }
                if (__usersValue != null) {
                    hash = 31 * hash + __usersValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
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
                if (__roleCodeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__roleCodeValue);
                }
                if (__roleNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__roleNameValue);
                }
                if (__roleTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__roleTypeValue);
                }
                if (__roleSortLoaded) {
                    hash = 31 * hash + System.identityHashCode(__roleSortValue);
                }
                if (__isSysLoaded) {
                    hash = 31 * hash + System.identityHashCode(__isSysValue);
                }
                if (__userTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__userTypeValue);
                }
                if (__dataScopeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__dataScopeValue);
                }
                if (__bizScopeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__bizScopeValue);
                }
                if (__corpCodeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__corpCodeValue);
                }
                if (__corpNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(__corpNameValue);
                }
                if (__menusValue != null) {
                    hash = 31 * hash + System.identityHashCode(__menusValue);
                }
                if (__usersValue != null) {
                    hash = 31 * hash + System.identityHashCode(__usersValue);
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
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(__idValue, __other.id());
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
                if (__isVisible(PropId.byIndex(SLOT_ROLE_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_CODE))) {
                    return false;
                }
                boolean __roleCodeLoaded = __roleCodeValue != null;
                if (__roleCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_CODE))) {
                    return false;
                }
                if (__roleCodeLoaded && !Objects.equals(__roleCodeValue, __other.roleCode())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_NAME))) {
                    return false;
                }
                boolean __roleNameLoaded = __roleNameValue != null;
                if (__roleNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_NAME))) {
                    return false;
                }
                if (__roleNameLoaded && !Objects.equals(__roleNameValue, __other.roleName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_TYPE))) {
                    return false;
                }
                boolean __roleTypeLoaded = this.__roleTypeLoaded;
                if (__roleTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_TYPE))) {
                    return false;
                }
                if (__roleTypeLoaded && !Objects.equals(__roleTypeValue, __other.roleType())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE_SORT)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_SORT))) {
                    return false;
                }
                boolean __roleSortLoaded = this.__roleSortLoaded;
                if (__roleSortLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_SORT))) {
                    return false;
                }
                if (__roleSortLoaded && !Objects.equals(__roleSortValue, __other.roleSort())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_IS_SYS)) != __other.__isVisible(PropId.byIndex(SLOT_IS_SYS))) {
                    return false;
                }
                boolean __isSysLoaded = this.__isSysLoaded;
                if (__isSysLoaded != __other.__isLoaded(PropId.byIndex(SLOT_IS_SYS))) {
                    return false;
                }
                if (__isSysLoaded && !Objects.equals(__isSysValue, __other.isSys())) {
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
                if (__isVisible(PropId.byIndex(SLOT_DATA_SCOPE)) != __other.__isVisible(PropId.byIndex(SLOT_DATA_SCOPE))) {
                    return false;
                }
                boolean __dataScopeLoaded = this.__dataScopeLoaded;
                if (__dataScopeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DATA_SCOPE))) {
                    return false;
                }
                if (__dataScopeLoaded && !Objects.equals(__dataScopeValue, __other.dataScope())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_BIZ_SCOPE)) != __other.__isVisible(PropId.byIndex(SLOT_BIZ_SCOPE))) {
                    return false;
                }
                boolean __bizScopeLoaded = this.__bizScopeLoaded;
                if (__bizScopeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_BIZ_SCOPE))) {
                    return false;
                }
                if (__bizScopeLoaded && !Objects.equals(__bizScopeValue, __other.bizScope())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CORP_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_CORP_CODE))) {
                    return false;
                }
                boolean __corpCodeLoaded = this.__corpCodeLoaded;
                if (__corpCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CORP_CODE))) {
                    return false;
                }
                if (__corpCodeLoaded && !Objects.equals(__corpCodeValue, __other.corpCode())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CORP_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_CORP_NAME))) {
                    return false;
                }
                boolean __corpNameLoaded = this.__corpNameLoaded;
                if (__corpNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CORP_NAME))) {
                    return false;
                }
                if (__corpNameLoaded && !Objects.equals(__corpNameValue, __other.corpName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENUS)) != __other.__isVisible(PropId.byIndex(SLOT_MENUS))) {
                    return false;
                }
                boolean __menusLoaded = __menusValue != null;
                if (__menusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENUS))) {
                    return false;
                }
                if (__menusLoaded && !Objects.equals(__menusValue, __other.menus())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USERS)) != __other.__isVisible(PropId.byIndex(SLOT_USERS))) {
                    return false;
                }
                boolean __usersLoaded = __usersValue != null;
                if (__usersLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USERS))) {
                    return false;
                }
                if (__usersLoaded && !Objects.equals(__usersValue, __other.users())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded && __idValue != __other.id()) {
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
                if (__isVisible(PropId.byIndex(SLOT_ROLE_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_CODE))) {
                    return false;
                }
                boolean __roleCodeLoaded = __roleCodeValue != null;
                if (__roleCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_CODE))) {
                    return false;
                }
                if (__roleCodeLoaded && __roleCodeValue != __other.roleCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_NAME))) {
                    return false;
                }
                boolean __roleNameLoaded = __roleNameValue != null;
                if (__roleNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_NAME))) {
                    return false;
                }
                if (__roleNameLoaded && __roleNameValue != __other.roleName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_TYPE))) {
                    return false;
                }
                boolean __roleTypeLoaded = this.__roleTypeLoaded;
                if (__roleTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_TYPE))) {
                    return false;
                }
                if (__roleTypeLoaded && __roleTypeValue != __other.roleType()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE_SORT)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_SORT))) {
                    return false;
                }
                boolean __roleSortLoaded = this.__roleSortLoaded;
                if (__roleSortLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_SORT))) {
                    return false;
                }
                if (__roleSortLoaded && __roleSortValue != __other.roleSort()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_IS_SYS)) != __other.__isVisible(PropId.byIndex(SLOT_IS_SYS))) {
                    return false;
                }
                boolean __isSysLoaded = this.__isSysLoaded;
                if (__isSysLoaded != __other.__isLoaded(PropId.byIndex(SLOT_IS_SYS))) {
                    return false;
                }
                if (__isSysLoaded && __isSysValue != __other.isSys()) {
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
                if (__isVisible(PropId.byIndex(SLOT_DATA_SCOPE)) != __other.__isVisible(PropId.byIndex(SLOT_DATA_SCOPE))) {
                    return false;
                }
                boolean __dataScopeLoaded = this.__dataScopeLoaded;
                if (__dataScopeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DATA_SCOPE))) {
                    return false;
                }
                if (__dataScopeLoaded && __dataScopeValue != __other.dataScope()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_BIZ_SCOPE)) != __other.__isVisible(PropId.byIndex(SLOT_BIZ_SCOPE))) {
                    return false;
                }
                boolean __bizScopeLoaded = this.__bizScopeLoaded;
                if (__bizScopeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_BIZ_SCOPE))) {
                    return false;
                }
                if (__bizScopeLoaded && __bizScopeValue != __other.bizScope()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CORP_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_CORP_CODE))) {
                    return false;
                }
                boolean __corpCodeLoaded = this.__corpCodeLoaded;
                if (__corpCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CORP_CODE))) {
                    return false;
                }
                if (__corpCodeLoaded && __corpCodeValue != __other.corpCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CORP_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_CORP_NAME))) {
                    return false;
                }
                boolean __corpNameLoaded = this.__corpNameLoaded;
                if (__corpNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CORP_NAME))) {
                    return false;
                }
                if (__corpNameLoaded && __corpNameValue != __other.corpName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENUS)) != __other.__isVisible(PropId.byIndex(SLOT_MENUS))) {
                    return false;
                }
                boolean __menusLoaded = __menusValue != null;
                if (__menusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENUS))) {
                    return false;
                }
                if (__menusLoaded && __menusValue != __other.menus()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USERS)) != __other.__isVisible(PropId.byIndex(SLOT_USERS))) {
                    return false;
                }
                boolean __usersLoaded = __usersValue != null;
                if (__usersLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USERS))) {
                    return false;
                }
                if (__usersLoaded && __usersValue != __other.users()) {
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

        @GeneratedBy(
                type = Role.class
        )
        private static class DraftImpl implements Implementor, DraftSpi, RoleDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private Role __resolved;

            DraftImpl(DraftContext ctx, Role base) {
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
                return ImmutableObjects.toString(this);
            }

            @Override
            @JsonIgnore
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public RoleDraft setId(String id) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (id == null) {
                    throw new IllegalArgumentException(
                        "'id' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__idValue = id;
                return this;
            }

            @Override
            @JsonIgnore
            public int status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public RoleDraft setStatus(int status) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__statusValue = status;
                __tmpModified.__statusLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String createBy() {
                return (__modified!= null ? __modified : __base).createBy();
            }

            @Override
            public RoleDraft setCreateBy(String createBy) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            @JsonIgnore
            public Date createDate() {
                return (__modified!= null ? __modified : __base).createDate();
            }

            @Override
            public RoleDraft setCreateDate(Date createDate) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            @JsonIgnore
            public String updateBy() {
                return (__modified!= null ? __modified : __base).updateBy();
            }

            @Override
            public RoleDraft setUpdateBy(String updateBy) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            @JsonIgnore
            public Date updateDate() {
                return (__modified!= null ? __modified : __base).updateDate();
            }

            @Override
            public RoleDraft setUpdateDate(Date updateDate) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            @JsonIgnore
            @Nullable
            public String remarks() {
                return (__modified!= null ? __modified : __base).remarks();
            }

            @Override
            public RoleDraft setRemarks(String remarks) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__remarksValue = remarks;
                __tmpModified.__remarksLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String roleCode() {
                return (__modified!= null ? __modified : __base).roleCode();
            }

            @Override
            public RoleDraft setRoleCode(String roleCode) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (roleCode == null) {
                    throw new IllegalArgumentException(
                        "'roleCode' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__roleCodeValue = roleCode;
                return this;
            }

            @Override
            @JsonIgnore
            public String roleName() {
                return (__modified!= null ? __modified : __base).roleName();
            }

            @Override
            public RoleDraft setRoleName(String roleName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (roleName == null) {
                    throw new IllegalArgumentException(
                        "'roleName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__roleNameValue = roleName;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String roleType() {
                return (__modified!= null ? __modified : __base).roleType();
            }

            @Override
            public RoleDraft setRoleType(String roleType) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__roleTypeValue = roleType;
                __tmpModified.__roleTypeLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public BigDecimal roleSort() {
                return (__modified!= null ? __modified : __base).roleSort();
            }

            @Override
            public RoleDraft setRoleSort(BigDecimal roleSort) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__roleSortValue = roleSort;
                __tmpModified.__roleSortLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Boolean isSys() {
                return (__modified!= null ? __modified : __base).isSys();
            }

            @Override
            public RoleDraft setIsSys(Boolean isSys) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__isSysValue = isSys;
                __tmpModified.__isSysLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String userType() {
                return (__modified!= null ? __modified : __base).userType();
            }

            @Override
            public RoleDraft setUserType(String userType) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__userTypeValue = userType;
                __tmpModified.__userTypeLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String dataScope() {
                return (__modified!= null ? __modified : __base).dataScope();
            }

            @Override
            public RoleDraft setDataScope(String dataScope) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__dataScopeValue = dataScope;
                __tmpModified.__dataScopeLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String bizScope() {
                return (__modified!= null ? __modified : __base).bizScope();
            }

            @Override
            public RoleDraft setBizScope(String bizScope) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__bizScopeValue = bizScope;
                __tmpModified.__bizScopeLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String corpCode() {
                return (__modified!= null ? __modified : __base).corpCode();
            }

            @Override
            public RoleDraft setCorpCode(String corpCode) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__corpCodeValue = corpCode;
                __tmpModified.__corpCodeLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String corpName() {
                return (__modified!= null ? __modified : __base).corpName();
            }

            @Override
            public RoleDraft setCorpName(String corpName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__corpNameValue = corpName;
                __tmpModified.__corpNameLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public List<Menu> menus() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).menus(), Menu.class, true);
            }

            @Override
            public List<MenuDraft> menus(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_MENUS)))) {
                    setMenus(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).menus(), Menu.class, true);
            }

            @Override
            public RoleDraft setMenus(List<Menu> menus) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (menus == null) {
                    throw new IllegalArgumentException(
                        "'menus' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__menusValue = NonSharedList.of(__tmpModified.__menusValue, menus);
                return this;
            }

            @Override
            public RoleDraft addIntoMenus(DraftConsumer<MenuDraft> block) {
                addIntoMenus(null, block);
                return this;
            }

            @Override
            public RoleDraft addIntoMenus(Menu base, DraftConsumer<MenuDraft> block) {
                menus(true).add((MenuDraft)MenuDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public List<User> users() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).users(), User.class, true);
            }

            @Override
            public List<UserDraft> users(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_USERS)))) {
                    setUsers(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).users(), User.class, true);
            }

            @Override
            public RoleDraft setUsers(List<User> users) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (users == null) {
                    throw new IllegalArgumentException(
                        "'users' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__usersValue = NonSharedList.of(__tmpModified.__usersValue, users);
                return this;
            }

            @Override
            public RoleDraft addIntoUsers(DraftConsumer<UserDraft> block) {
                addIntoUsers(null, block);
                return this;
            }

            @Override
            public RoleDraft addIntoUsers(User base, DraftConsumer<UserDraft> block) {
                users(true).add((UserDraft)UserDraft.$.produce(base, block));
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
                    case SLOT_ID:
                    		setId((String)value);break;
                    case SLOT_STATUS:
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
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
                    case SLOT_ROLE_CODE:
                    		setRoleCode((String)value);break;
                    case SLOT_ROLE_NAME:
                    		setRoleName((String)value);break;
                    case SLOT_ROLE_TYPE:
                    		setRoleType((String)value);break;
                    case SLOT_ROLE_SORT:
                    		setRoleSort((BigDecimal)value);break;
                    case SLOT_IS_SYS:
                    		setIsSys((Boolean)value);break;
                    case SLOT_USER_TYPE:
                    		setUserType((String)value);break;
                    case SLOT_DATA_SCOPE:
                    		setDataScope((String)value);break;
                    case SLOT_BIZ_SCOPE:
                    		setBizScope((String)value);break;
                    case SLOT_CORP_CODE:
                    		setCorpCode((String)value);break;
                    case SLOT_CORP_NAME:
                    		setCorpName((String)value);break;
                    case SLOT_MENUS:
                    		setMenus((List<Menu>)value);break;
                    case SLOT_USERS:
                    		setUsers((List<User>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Role\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "status":
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
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
                    case "roleCode":
                    		setRoleCode((String)value);break;
                    case "roleName":
                    		setRoleName((String)value);break;
                    case "roleType":
                    		setRoleType((String)value);break;
                    case "roleSort":
                    		setRoleSort((BigDecimal)value);break;
                    case "isSys":
                    		setIsSys((Boolean)value);break;
                    case "userType":
                    		setUserType((String)value);break;
                    case "dataScope":
                    		setDataScope((String)value);break;
                    case "bizScope":
                    		setBizScope((String)value);break;
                    case "corpCode":
                    		setCorpCode((String)value);break;
                    case "corpName":
                    		setCorpName((String)value);break;
                    case "menus":
                    		setMenus((List<Menu>)value);break;
                    case "users":
                    		setUsers((List<User>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Role\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(19);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
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
                    case SLOT_ROLE_CODE:
                    		__visibility.show(SLOT_ROLE_CODE, visible);break;
                    case SLOT_ROLE_NAME:
                    		__visibility.show(SLOT_ROLE_NAME, visible);break;
                    case SLOT_ROLE_TYPE:
                    		__visibility.show(SLOT_ROLE_TYPE, visible);break;
                    case SLOT_ROLE_SORT:
                    		__visibility.show(SLOT_ROLE_SORT, visible);break;
                    case SLOT_IS_SYS:
                    		__visibility.show(SLOT_IS_SYS, visible);break;
                    case SLOT_USER_TYPE:
                    		__visibility.show(SLOT_USER_TYPE, visible);break;
                    case SLOT_DATA_SCOPE:
                    		__visibility.show(SLOT_DATA_SCOPE, visible);break;
                    case SLOT_BIZ_SCOPE:
                    		__visibility.show(SLOT_BIZ_SCOPE, visible);break;
                    case SLOT_CORP_CODE:
                    		__visibility.show(SLOT_CORP_CODE, visible);break;
                    case SLOT_CORP_NAME:
                    		__visibility.show(SLOT_CORP_NAME, visible);break;
                    case SLOT_MENUS:
                    		__visibility.show(SLOT_MENUS, visible);break;
                    case SLOT_USERS:
                    		__visibility.show(SLOT_USERS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.Role\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __show(String prop, boolean visible) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(19);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
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
                    case "roleCode":
                    		__visibility.show(SLOT_ROLE_CODE, visible);break;
                    case "roleName":
                    		__visibility.show(SLOT_ROLE_NAME, visible);break;
                    case "roleType":
                    		__visibility.show(SLOT_ROLE_TYPE, visible);break;
                    case "roleSort":
                    		__visibility.show(SLOT_ROLE_SORT, visible);break;
                    case "isSys":
                    		__visibility.show(SLOT_IS_SYS, visible);break;
                    case "userType":
                    		__visibility.show(SLOT_USER_TYPE, visible);break;
                    case "dataScope":
                    		__visibility.show(SLOT_DATA_SCOPE, visible);break;
                    case "bizScope":
                    		__visibility.show(SLOT_BIZ_SCOPE, visible);break;
                    case "corpCode":
                    		__visibility.show(SLOT_CORP_CODE, visible);break;
                    case "corpName":
                    		__visibility.show(SLOT_CORP_NAME, visible);break;
                    case "menus":
                    		__visibility.show(SLOT_MENUS, visible);break;
                    case "users":
                    		__visibility.show(SLOT_USERS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.Role\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __unload(PropId prop) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__unload(prop.asName());
                    return;
                    case SLOT_ID:
                    		__modified().__idValue = null;break;
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
                    case SLOT_ROLE_CODE:
                    		__modified().__roleCodeValue = null;break;
                    case SLOT_ROLE_NAME:
                    		__modified().__roleNameValue = null;break;
                    case SLOT_ROLE_TYPE:
                    		__modified().__roleTypeLoaded = false;break;
                    case SLOT_ROLE_SORT:
                    		__modified().__roleSortLoaded = false;break;
                    case SLOT_IS_SYS:
                    		__modified().__isSysLoaded = false;break;
                    case SLOT_USER_TYPE:
                    		__modified().__userTypeLoaded = false;break;
                    case SLOT_DATA_SCOPE:
                    		__modified().__dataScopeLoaded = false;break;
                    case SLOT_BIZ_SCOPE:
                    		__modified().__bizScopeLoaded = false;break;
                    case SLOT_CORP_CODE:
                    		__modified().__corpCodeLoaded = false;break;
                    case SLOT_CORP_NAME:
                    		__modified().__corpNameLoaded = false;break;
                    case SLOT_MENUS:
                    		__modified().__menusValue = null;break;
                    case SLOT_USERS:
                    		__modified().__usersValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Role\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                switch (prop) {
                    case "id":
                    		__modified().__idValue = null;break;
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
                    case "roleCode":
                    		__modified().__roleCodeValue = null;break;
                    case "roleName":
                    		__modified().__roleNameValue = null;break;
                    case "roleType":
                    		__modified().__roleTypeLoaded = false;break;
                    case "roleSort":
                    		__modified().__roleSortLoaded = false;break;
                    case "isSys":
                    		__modified().__isSysLoaded = false;break;
                    case "userType":
                    		__modified().__userTypeLoaded = false;break;
                    case "dataScope":
                    		__modified().__dataScopeLoaded = false;break;
                    case "bizScope":
                    		__modified().__bizScopeLoaded = false;break;
                    case "corpCode":
                    		__modified().__corpCodeLoaded = false;break;
                    case "corpName":
                    		__modified().__corpNameLoaded = false;break;
                    case "menus":
                    		__modified().__menusValue = null;break;
                    case "users":
                    		__modified().__usersValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Role\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public DraftContext __draftContext() {
                return __ctx;
            }

            @Override
            public Object __resolve() {
                if (__resolved != null) {
                    return __resolved;
                }
                if (__resolving) {
                    throw new CircularReferenceException();
                }
                __resolving = true;
                try {
                    Implementor base = __base;
                    Impl __tmpModified = __modified;
                    if (__tmpModified == null) {
                        if (base.__isLoaded(PropId.byIndex(SLOT_MENUS))) {
                            List<Menu> oldValue = base.menus();
                            List<Menu> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setMenus(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_USERS))) {
                            List<User> oldValue = base.users();
                            List<User> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setUsers(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__menusValue = NonSharedList.of(__tmpModified.__menusValue, __ctx.resolveList(__tmpModified.__menusValue));
                        __tmpModified.__usersValue = NonSharedList.of(__tmpModified.__usersValue, __ctx.resolveList(__tmpModified.__usersValue));
                    }
                    if (__base != null && __tmpModified == null) {
                        this.__resolved = base;
                        return base;
                    }
                    this.__resolved = __tmpModified;
                    return __tmpModified;
                }
                finally {
                    __resolving = false;
                }
            }

            @Override
            public boolean __isResolved() {
                return __resolved != null;
            }

            Impl __modified() {
                Impl __tmpModified = __modified;
                if (__tmpModified == null) {
                    __tmpModified = __base.clone();
                    __modified = __tmpModified;
                }
                return __tmpModified;
            }
        }
    }

    @GeneratedBy(
            type = Role.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
        }

        @NotNull
        public Builder id(String id) {
            if (id != null) {
                __draft.setId(id);
            }
            return this;
        }

        @Schema(
                description = "状态"
        )
        public Builder status(Integer status) {
            if (status != null) {
                __draft.setStatus(status);
            }
            return this;
        }

        @NotNull
        public Builder createBy(String createBy) {
            if (createBy != null) {
                __draft.setCreateBy(createBy);
            }
            return this;
        }

        @NotNull
        public Builder createDate(Date createDate) {
            if (createDate != null) {
                __draft.setCreateDate(createDate);
            }
            return this;
        }

        @NotNull
        public Builder updateBy(String updateBy) {
            if (updateBy != null) {
                __draft.setUpdateBy(updateBy);
            }
            return this;
        }

        @NotNull
        public Builder updateDate(Date updateDate) {
            if (updateDate != null) {
                __draft.setUpdateDate(updateDate);
            }
            return this;
        }

        @Nullable
        public Builder remarks(String remarks) {
            __draft.setRemarks(remarks);
            return this;
        }

        @Schema(
                description = "角色编码"
        )
        public Builder roleCode(String roleCode) {
            if (roleCode != null) {
                __draft.setRoleCode(roleCode);
            }
            return this;
        }

        @Schema(
                description = "角色名称"
        )
        public Builder roleName(String roleName) {
            if (roleName != null) {
                __draft.setRoleName(roleName);
            }
            return this;
        }

        @Schema(
                description = "角色类型"
        )
        @jakarta.annotation.Nullable
        public Builder roleType(String roleType) {
            __draft.setRoleType(roleType);
            return this;
        }

        @Schema(
                description = "角色排序"
        )
        @jakarta.annotation.Nullable
        public Builder roleSort(BigDecimal roleSort) {
            __draft.setRoleSort(roleSort);
            return this;
        }

        @Schema(
                description = "系统内置 1是 0否"
        )
        public Builder isSys(Boolean isSys) {
            __draft.setIsSys(isSys);
            return this;
        }

        @Schema(
                description = "用户类型"
        )
        @jakarta.annotation.Nullable
        public Builder userType(String userType) {
            __draft.setUserType(userType);
            return this;
        }

        @Schema(
                description = "数据范围设置"
        )
        @jakarta.annotation.Nullable
        public Builder dataScope(String dataScope) {
            __draft.setDataScope(dataScope);
            return this;
        }

        @Schema(
                description = "适应业务范围"
        )
        @jakarta.annotation.Nullable
        public Builder bizScope(String bizScope) {
            __draft.setBizScope(bizScope);
            return this;
        }

        @jakarta.annotation.Nullable
        public Builder corpCode(String corpCode) {
            __draft.setCorpCode(corpCode);
            return this;
        }

        @jakarta.annotation.Nullable
        public Builder corpName(String corpName) {
            __draft.setCorpName(corpName);
            return this;
        }

        @Schema(
                description = "角色拥有的菜单"
        )
        public Builder menus(List<Menu> menus) {
            if (menus != null) {
                __draft.setMenus(menus);
            }
            return this;
        }

        @Schema(
                description = "角色拥有的用户"
        )
        public Builder users(List<User> users) {
            if (users != null) {
                __draft.setUsers(users);
            }
            return this;
        }

        public Role build() {
            return (Role)__draft.__modified();
        }
    }
}
