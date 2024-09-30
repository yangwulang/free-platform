package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.ArrayList;
import java.util.Collections;
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
import org.babyfish.jimmer.sql.ManyToOne;
import org.babyfish.jimmer.sql.OneToMany;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.TypeBaseDraft;

@GeneratedBy(
        type = Company.class
)
public interface CompanyDraft extends Company, TypeBaseDraft {
    CompanyDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    CompanyDraft setId(String id);

    @Nullable
    CompanyDraft parent();

    CompanyDraft parent(boolean autoCreate);

    @OldChain
    CompanyDraft setParent(Company parent);

    @OldChain
    CompanyDraft applyParent(DraftConsumer<CompanyDraft> block);

    @OldChain
    CompanyDraft applyParent(Company base, DraftConsumer<CompanyDraft> block);

    @OldChain
    CompanyDraft setParentId(String parentId);

    List<CompanyDraft> children(boolean autoCreate);

    @OldChain
    CompanyDraft setChildren(List<Company> children);

    @OldChain
    CompanyDraft addIntoChildren(DraftConsumer<CompanyDraft> block);

    @OldChain
    CompanyDraft addIntoChildren(Company base, DraftConsumer<CompanyDraft> block);

    List<EmployeeDraft> employees(boolean autoCreate);

    @OldChain
    CompanyDraft setEmployees(List<Employee> employees);

    @OldChain
    CompanyDraft addIntoEmployees(DraftConsumer<EmployeeDraft> block);

    @OldChain
    CompanyDraft addIntoEmployees(Employee base, DraftConsumer<EmployeeDraft> block);

    @OldChain
    CompanyDraft setCompanyCode(String companyCode);

    @OldChain
    CompanyDraft setCompanyName(String companyName);

    @OldChain
    CompanyDraft setCompanyFullName(String companyFullName);

    @OldChain
    CompanyDraft setCorpCode(String corpCode);

    @OldChain
    CompanyDraft setCorpName(String corpName);

    @GeneratedBy(
            type = Company.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_PARENT = 1;

        public static final int SLOT_PARENT_ID = 2;

        public static final int SLOT_CHILDREN = 3;

        public static final int SLOT_EMPLOYEES = 4;

        public static final int SLOT_COMPANY_CODE = 5;

        public static final int SLOT_COMPANY_NAME = 6;

        public static final int SLOT_COMPANY_FULL_NAME = 7;

        public static final int SLOT_CORP_CODE = 8;

        public static final int SLOT_CORP_NAME = 9;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.184",
                Company.class,
                Collections.singleton(TypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (Company)base)
            )
            .redefine("id", SLOT_ID)
            .keyReference(SLOT_PARENT, "parent", ManyToOne.class, Company.class, true)
            .add(SLOT_PARENT_ID, "parentId", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CHILDREN, "children", OneToMany.class, Company.class, false)
            .add(SLOT_EMPLOYEES, "employees", OneToMany.class, Employee.class, false)
            .key(SLOT_COMPANY_CODE, "companyCode", String.class, false)
            .key(SLOT_COMPANY_NAME, "companyName", String.class, false)
            .add(SLOT_COMPANY_FULL_NAME, "companyFullName", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CORP_CODE, "corpCode", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CORP_NAME, "corpName", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public Company produce(DraftConsumer<CompanyDraft> block) {
            return produce(null, block);
        }

        public Company produce(Company base, DraftConsumer<CompanyDraft> block) {
            return (Company)Internal.produce(TYPE, base, block);
        }

        /**
         * Class, not interface, for free-marker
         */
        @GeneratedBy(
                type = Company.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "parent", "parentId", "children", "employees", "companyCode", "companyName", "companyFullName", "corpCode", "corpName"})
        public abstract static class Implementor implements Company, ImmutableSpi {
            @Override
            public final Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
                    case SLOT_PARENT:
                    		return parent();
                    case SLOT_PARENT_ID:
                    		return parentId();
                    case SLOT_CHILDREN:
                    		return children();
                    case SLOT_EMPLOYEES:
                    		return employees();
                    case SLOT_COMPANY_CODE:
                    		return companyCode();
                    case SLOT_COMPANY_NAME:
                    		return companyName();
                    case SLOT_COMPANY_FULL_NAME:
                    		return companyFullName();
                    case SLOT_CORP_CODE:
                    		return corpCode();
                    case SLOT_CORP_NAME:
                    		return corpName();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Company\": \"" + prop + "\"");
                }
            }

            @Override
            public final Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
                    case "parent":
                    		return parent();
                    case "parentId":
                    		return parentId();
                    case "children":
                    		return children();
                    case "employees":
                    		return employees();
                    case "companyCode":
                    		return companyCode();
                    case "companyName":
                    		return companyName();
                    case "companyFullName":
                    		return companyFullName();
                    case "corpCode":
                    		return corpCode();
                    case "corpName":
                    		return corpName();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Company\": \"" + prop + "\"");
                }
            }

            @NotNull
            public final String getId() {
                return id();
            }

            @Schema(
                    description = "父级公司"
            )
            @jakarta.annotation.Nullable
            public final Company getParent() {
                return parent();
            }

            @Schema(
                    description = "父级id"
            )
            @jakarta.annotation.Nullable
            public final String getParentId() {
                return parentId();
            }

            @Schema(
                    description = "子级公司"
            )
            public final List<Company> getChildren() {
                return children();
            }

            public final List<Employee> getEmployees() {
                return employees();
            }

            @Schema(
                    description = "公司编码"
            )
            public final String getCompanyCode() {
                return companyCode();
            }

            @Schema(
                    description = "公司名称"
            )
            public final String getCompanyName() {
                return companyName();
            }

            @Schema(
                    description = "公司全名"
            )
            @jakarta.annotation.Nullable
            public final String getCompanyFullName() {
                return companyFullName();
            }

            @jakarta.annotation.Nullable
            public final String getCorpCode() {
                return corpCode();
            }

            @jakarta.annotation.Nullable
            public final String getCorpName() {
                return corpName();
            }

            @Override
            public final ImmutableType __type() {
                return TYPE;
            }

            public final int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        @GeneratedBy(
                type = Company.class
        )
        private static class Impl extends Implementor implements Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            Company __parentValue;

            boolean __parentLoaded = false;

            NonSharedList<Company> __childrenValue;

            NonSharedList<Employee> __employeesValue;

            String __companyCodeValue;

            String __companyNameValue;

            String __companyFullNameValue;

            boolean __companyFullNameLoaded = false;

            String __corpCodeValue;

            boolean __corpCodeLoaded = false;

            String __corpNameValue;

            boolean __corpNameLoaded = false;

            Impl() {
                __visibility = Visibility.of(10);
                __visibility.show(SLOT_PARENT_ID, false);
            }

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(Company.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Company parent() {
                if (!__parentLoaded) {
                    throw new UnloadedException(Company.class, "parent");
                }
                return __parentValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String parentId() {
                Company __target = parent();
                return __target != null ? __target.id() : null;
            }

            @Override
            @JsonIgnore
            public List<Company> children() {
                if (__childrenValue == null) {
                    throw new UnloadedException(Company.class, "children");
                }
                return __childrenValue;
            }

            @Override
            @JsonIgnore
            public List<Employee> employees() {
                if (__employeesValue == null) {
                    throw new UnloadedException(Company.class, "employees");
                }
                return __employeesValue;
            }

            @Override
            @JsonIgnore
            public String companyCode() {
                if (__companyCodeValue == null) {
                    throw new UnloadedException(Company.class, "companyCode");
                }
                return __companyCodeValue;
            }

            @Override
            @JsonIgnore
            public String companyName() {
                if (__companyNameValue == null) {
                    throw new UnloadedException(Company.class, "companyName");
                }
                return __companyNameValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String companyFullName() {
                if (!__companyFullNameLoaded) {
                    throw new UnloadedException(Company.class, "companyFullName");
                }
                return __companyFullNameValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String corpCode() {
                if (!__corpCodeLoaded) {
                    throw new UnloadedException(Company.class, "corpCode");
                }
                return __corpCodeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String corpName() {
                if (!__corpNameLoaded) {
                    throw new UnloadedException(Company.class, "corpName");
                }
                return __corpNameValue;
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
                    case SLOT_PARENT:
                    		return __parentLoaded;
                    case SLOT_PARENT_ID:
                    		return __isLoaded(PropId.byIndex(SLOT_PARENT)) && (parent() == null || 
                            	((ImmutableSpi)parent()).__isLoaded(PropId.byIndex(Producer.SLOT_ID)));
                    case SLOT_CHILDREN:
                    		return __childrenValue != null;
                    case SLOT_EMPLOYEES:
                    		return __employeesValue != null;
                    case SLOT_COMPANY_CODE:
                    		return __companyCodeValue != null;
                    case SLOT_COMPANY_NAME:
                    		return __companyNameValue != null;
                    case SLOT_COMPANY_FULL_NAME:
                    		return __companyFullNameLoaded;
                    case SLOT_CORP_CODE:
                    		return __corpCodeLoaded;
                    case SLOT_CORP_NAME:
                    		return __corpNameLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Company\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
                    case "parent":
                    		return __parentLoaded;
                    case "parentId":
                    		return __isLoaded(PropId.byIndex(SLOT_PARENT)) && (parent() == null || 
                            	((ImmutableSpi)parent()).__isLoaded(PropId.byIndex(Producer.SLOT_ID)));
                    case "children":
                    		return __childrenValue != null;
                    case "employees":
                    		return __employeesValue != null;
                    case "companyCode":
                    		return __companyCodeValue != null;
                    case "companyName":
                    		return __companyNameValue != null;
                    case "companyFullName":
                    		return __companyFullNameLoaded;
                    case "corpCode":
                    		return __corpCodeLoaded;
                    case "corpName":
                    		return __corpNameLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Company\": \"" + prop + "\"");
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
                    case SLOT_PARENT:
                    		return __visibility.visible(SLOT_PARENT);
                    case SLOT_PARENT_ID:
                    		return __visibility.visible(SLOT_PARENT_ID);
                    case SLOT_CHILDREN:
                    		return __visibility.visible(SLOT_CHILDREN);
                    case SLOT_EMPLOYEES:
                    		return __visibility.visible(SLOT_EMPLOYEES);
                    case SLOT_COMPANY_CODE:
                    		return __visibility.visible(SLOT_COMPANY_CODE);
                    case SLOT_COMPANY_NAME:
                    		return __visibility.visible(SLOT_COMPANY_NAME);
                    case SLOT_COMPANY_FULL_NAME:
                    		return __visibility.visible(SLOT_COMPANY_FULL_NAME);
                    case SLOT_CORP_CODE:
                    		return __visibility.visible(SLOT_CORP_CODE);
                    case SLOT_CORP_NAME:
                    		return __visibility.visible(SLOT_CORP_NAME);
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
                    case "parent":
                    		return __visibility.visible(SLOT_PARENT);
                    case "parentId":
                    		return __visibility.visible(SLOT_PARENT_ID);
                    case "children":
                    		return __visibility.visible(SLOT_CHILDREN);
                    case "employees":
                    		return __visibility.visible(SLOT_EMPLOYEES);
                    case "companyCode":
                    		return __visibility.visible(SLOT_COMPANY_CODE);
                    case "companyName":
                    		return __visibility.visible(SLOT_COMPANY_NAME);
                    case "companyFullName":
                    		return __visibility.visible(SLOT_COMPANY_FULL_NAME);
                    case "corpCode":
                    		return __visibility.visible(SLOT_CORP_CODE);
                    case "corpName":
                    		return __visibility.visible(SLOT_CORP_NAME);
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
                if (__parentLoaded && __parentValue != null) {
                    hash = 31 * hash + __parentValue.hashCode();
                }
                if (__childrenValue != null) {
                    hash = 31 * hash + __childrenValue.hashCode();
                }
                if (__employeesValue != null) {
                    hash = 31 * hash + __employeesValue.hashCode();
                }
                if (__companyCodeValue != null) {
                    hash = 31 * hash + __companyCodeValue.hashCode();
                }
                if (__companyNameValue != null) {
                    hash = 31 * hash + __companyNameValue.hashCode();
                }
                if (__companyFullNameLoaded && __companyFullNameValue != null) {
                    hash = 31 * hash + __companyFullNameValue.hashCode();
                }
                if (__corpCodeLoaded && __corpCodeValue != null) {
                    hash = 31 * hash + __corpCodeValue.hashCode();
                }
                if (__corpNameLoaded && __corpNameValue != null) {
                    hash = 31 * hash + __corpNameValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
                }
                if (__parentLoaded) {
                    hash = 31 * hash + System.identityHashCode(__parentValue);
                }
                if (__childrenValue != null) {
                    hash = 31 * hash + System.identityHashCode(__childrenValue);
                }
                if (__employeesValue != null) {
                    hash = 31 * hash + System.identityHashCode(__employeesValue);
                }
                if (__companyCodeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__companyCodeValue);
                }
                if (__companyNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__companyNameValue);
                }
                if (__companyFullNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(__companyFullNameValue);
                }
                if (__corpCodeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__corpCodeValue);
                }
                if (__corpNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(__corpNameValue);
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
                if (__isVisible(PropId.byIndex(SLOT_PARENT)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                boolean __parentLoaded = this.__parentLoaded;
                if (__parentLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                if (__parentLoaded && !Objects.equals(__parentValue, __other.parent())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PARENT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CHILDREN)) != __other.__isVisible(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                boolean __childrenLoaded = __childrenValue != null;
                if (__childrenLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                if (__childrenLoaded && !Objects.equals(__childrenValue, __other.children())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EMPLOYEES)) != __other.__isVisible(PropId.byIndex(SLOT_EMPLOYEES))) {
                    return false;
                }
                boolean __employeesLoaded = __employeesValue != null;
                if (__employeesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EMPLOYEES))) {
                    return false;
                }
                if (__employeesLoaded && !Objects.equals(__employeesValue, __other.employees())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COMPANY_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_COMPANY_CODE))) {
                    return false;
                }
                boolean __companyCodeLoaded = __companyCodeValue != null;
                if (__companyCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COMPANY_CODE))) {
                    return false;
                }
                if (__companyCodeLoaded && !Objects.equals(__companyCodeValue, __other.companyCode())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COMPANY_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_COMPANY_NAME))) {
                    return false;
                }
                boolean __companyNameLoaded = __companyNameValue != null;
                if (__companyNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COMPANY_NAME))) {
                    return false;
                }
                if (__companyNameLoaded && !Objects.equals(__companyNameValue, __other.companyName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COMPANY_FULL_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_COMPANY_FULL_NAME))) {
                    return false;
                }
                boolean __companyFullNameLoaded = this.__companyFullNameLoaded;
                if (__companyFullNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COMPANY_FULL_NAME))) {
                    return false;
                }
                if (__companyFullNameLoaded && !Objects.equals(__companyFullNameValue, __other.companyFullName())) {
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
                if (__isVisible(PropId.byIndex(SLOT_PARENT)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                boolean __parentLoaded = this.__parentLoaded;
                if (__parentLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                if (__parentLoaded && __parentValue != __other.parent()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PARENT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CHILDREN)) != __other.__isVisible(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                boolean __childrenLoaded = __childrenValue != null;
                if (__childrenLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                if (__childrenLoaded && __childrenValue != __other.children()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EMPLOYEES)) != __other.__isVisible(PropId.byIndex(SLOT_EMPLOYEES))) {
                    return false;
                }
                boolean __employeesLoaded = __employeesValue != null;
                if (__employeesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EMPLOYEES))) {
                    return false;
                }
                if (__employeesLoaded && __employeesValue != __other.employees()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COMPANY_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_COMPANY_CODE))) {
                    return false;
                }
                boolean __companyCodeLoaded = __companyCodeValue != null;
                if (__companyCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COMPANY_CODE))) {
                    return false;
                }
                if (__companyCodeLoaded && __companyCodeValue != __other.companyCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COMPANY_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_COMPANY_NAME))) {
                    return false;
                }
                boolean __companyNameLoaded = __companyNameValue != null;
                if (__companyNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COMPANY_NAME))) {
                    return false;
                }
                if (__companyNameLoaded && __companyNameValue != __other.companyName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COMPANY_FULL_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_COMPANY_FULL_NAME))) {
                    return false;
                }
                boolean __companyFullNameLoaded = this.__companyFullNameLoaded;
                if (__companyFullNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COMPANY_FULL_NAME))) {
                    return false;
                }
                if (__companyFullNameLoaded && __companyFullNameValue != __other.companyFullName()) {
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
                type = Company.class
        )
        private static class DraftImpl extends Implementor implements DraftSpi, CompanyDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private Company __resolved;

            DraftImpl(DraftContext ctx, Company base) {
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
            public CompanyDraft setId(String id) {
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
            @Nullable
            public CompanyDraft parent() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public CompanyDraft parent(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_PARENT)) || parent() == null)) {
                    setParent(CompanyDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public CompanyDraft setParent(Company parent) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__parentValue = parent;
                __tmpModified.__parentLoaded = true;
                return this;
            }

            @Override
            public CompanyDraft applyParent(DraftConsumer<CompanyDraft> block) {
                applyParent(null, block);
                return this;
            }

            @Override
            public CompanyDraft applyParent(Company base, DraftConsumer<CompanyDraft> block) {
                setParent(CompanyDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String parentId() {
                Company __target = parent();
                return __target != null ? __target.id() : null;
            }

            @Override
            public CompanyDraft setParentId(String parentId) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (parentId != null) {
                    setParent(ImmutableObjects.makeIdOnly(Company.class, parentId));
                } else {
                    setParent(null);
                }
                return this;
            }

            @Override
            @JsonIgnore
            public List<Company> children() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).children(), Company.class, true);
            }

            @Override
            public List<CompanyDraft> children(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_CHILDREN)))) {
                    setChildren(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).children(), Company.class, true);
            }

            @Override
            public CompanyDraft setChildren(List<Company> children) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (children == null) {
                    throw new IllegalArgumentException(
                        "'children' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__childrenValue = NonSharedList.of(__tmpModified.__childrenValue, children);
                return this;
            }

            @Override
            public CompanyDraft addIntoChildren(DraftConsumer<CompanyDraft> block) {
                addIntoChildren(null, block);
                return this;
            }

            @Override
            public CompanyDraft addIntoChildren(Company base, DraftConsumer<CompanyDraft> block) {
                children(true).add((CompanyDraft)CompanyDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public List<Employee> employees() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).employees(), Employee.class, true);
            }

            @Override
            public List<EmployeeDraft> employees(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_EMPLOYEES)))) {
                    setEmployees(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).employees(), Employee.class, true);
            }

            @Override
            public CompanyDraft setEmployees(List<Employee> employees) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (employees == null) {
                    throw new IllegalArgumentException(
                        "'employees' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__employeesValue = NonSharedList.of(__tmpModified.__employeesValue, employees);
                return this;
            }

            @Override
            public CompanyDraft addIntoEmployees(DraftConsumer<EmployeeDraft> block) {
                addIntoEmployees(null, block);
                return this;
            }

            @Override
            public CompanyDraft addIntoEmployees(Employee base,
                    DraftConsumer<EmployeeDraft> block) {
                employees(true).add((EmployeeDraft)EmployeeDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public String companyCode() {
                return (__modified!= null ? __modified : __base).companyCode();
            }

            @Override
            public CompanyDraft setCompanyCode(String companyCode) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (companyCode == null) {
                    throw new IllegalArgumentException(
                        "'companyCode' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__companyCodeValue = companyCode;
                return this;
            }

            @Override
            @JsonIgnore
            public String companyName() {
                return (__modified!= null ? __modified : __base).companyName();
            }

            @Override
            public CompanyDraft setCompanyName(String companyName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (companyName == null) {
                    throw new IllegalArgumentException(
                        "'companyName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__companyNameValue = companyName;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String companyFullName() {
                return (__modified!= null ? __modified : __base).companyFullName();
            }

            @Override
            public CompanyDraft setCompanyFullName(String companyFullName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__companyFullNameValue = companyFullName;
                __tmpModified.__companyFullNameLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String corpCode() {
                return (__modified!= null ? __modified : __base).corpCode();
            }

            @Override
            public CompanyDraft setCorpCode(String corpCode) {
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
            public CompanyDraft setCorpName(String corpName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__corpNameValue = corpName;
                __tmpModified.__corpNameLoaded = true;
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
                    case SLOT_PARENT:
                    		setParent((Company)value);break;
                    case SLOT_PARENT_ID:
                    		setParentId((String)value);break;
                    case SLOT_CHILDREN:
                    		setChildren((List<Company>)value);break;
                    case SLOT_EMPLOYEES:
                    		setEmployees((List<Employee>)value);break;
                    case SLOT_COMPANY_CODE:
                    		setCompanyCode((String)value);break;
                    case SLOT_COMPANY_NAME:
                    		setCompanyName((String)value);break;
                    case SLOT_COMPANY_FULL_NAME:
                    		setCompanyFullName((String)value);break;
                    case SLOT_CORP_CODE:
                    		setCorpCode((String)value);break;
                    case SLOT_CORP_NAME:
                    		setCorpName((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Company\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "parent":
                    		setParent((Company)value);break;
                    case "parentId":
                    		setParentId((String)value);break;
                    case "children":
                    		setChildren((List<Company>)value);break;
                    case "employees":
                    		setEmployees((List<Employee>)value);break;
                    case "companyCode":
                    		setCompanyCode((String)value);break;
                    case "companyName":
                    		setCompanyName((String)value);break;
                    case "companyFullName":
                    		setCompanyFullName((String)value);break;
                    case "corpCode":
                    		setCorpCode((String)value);break;
                    case "corpName":
                    		setCorpName((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Company\": \"" + prop + "\"");
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
                    __modified().__visibility = __visibility = Visibility.of(10);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_PARENT:
                    		__visibility.show(SLOT_PARENT, visible);break;
                    case SLOT_PARENT_ID:
                    		__visibility.show(SLOT_PARENT_ID, visible);break;
                    case SLOT_CHILDREN:
                    		__visibility.show(SLOT_CHILDREN, visible);break;
                    case SLOT_EMPLOYEES:
                    		__visibility.show(SLOT_EMPLOYEES, visible);break;
                    case SLOT_COMPANY_CODE:
                    		__visibility.show(SLOT_COMPANY_CODE, visible);break;
                    case SLOT_COMPANY_NAME:
                    		__visibility.show(SLOT_COMPANY_NAME, visible);break;
                    case SLOT_COMPANY_FULL_NAME:
                    		__visibility.show(SLOT_COMPANY_FULL_NAME, visible);break;
                    case SLOT_CORP_CODE:
                    		__visibility.show(SLOT_CORP_CODE, visible);break;
                    case SLOT_CORP_NAME:
                    		__visibility.show(SLOT_CORP_NAME, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.Company\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(10);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "parent":
                    		__visibility.show(SLOT_PARENT, visible);break;
                    case "parentId":
                    		__visibility.show(SLOT_PARENT_ID, visible);break;
                    case "children":
                    		__visibility.show(SLOT_CHILDREN, visible);break;
                    case "employees":
                    		__visibility.show(SLOT_EMPLOYEES, visible);break;
                    case "companyCode":
                    		__visibility.show(SLOT_COMPANY_CODE, visible);break;
                    case "companyName":
                    		__visibility.show(SLOT_COMPANY_NAME, visible);break;
                    case "companyFullName":
                    		__visibility.show(SLOT_COMPANY_FULL_NAME, visible);break;
                    case "corpCode":
                    		__visibility.show(SLOT_CORP_CODE, visible);break;
                    case "corpName":
                    		__visibility.show(SLOT_CORP_NAME, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.Company\": \"" + 
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
                    case SLOT_PARENT:
                    		__modified().__parentLoaded = false;break;
                    case SLOT_PARENT_ID:
                    		__unload(PropId.byIndex(SLOT_PARENT));break;
                    case SLOT_CHILDREN:
                    		__modified().__childrenValue = null;break;
                    case SLOT_EMPLOYEES:
                    		__modified().__employeesValue = null;break;
                    case SLOT_COMPANY_CODE:
                    		__modified().__companyCodeValue = null;break;
                    case SLOT_COMPANY_NAME:
                    		__modified().__companyNameValue = null;break;
                    case SLOT_COMPANY_FULL_NAME:
                    		__modified().__companyFullNameLoaded = false;break;
                    case SLOT_CORP_CODE:
                    		__modified().__corpCodeLoaded = false;break;
                    case SLOT_CORP_NAME:
                    		__modified().__corpNameLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Company\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                    case "parent":
                    		__modified().__parentLoaded = false;break;
                    case "parentId":
                    		__unload(PropId.byIndex(SLOT_PARENT));break;
                    case "children":
                    		__modified().__childrenValue = null;break;
                    case "employees":
                    		__modified().__employeesValue = null;break;
                    case "companyCode":
                    		__modified().__companyCodeValue = null;break;
                    case "companyName":
                    		__modified().__companyNameValue = null;break;
                    case "companyFullName":
                    		__modified().__companyFullNameLoaded = false;break;
                    case "corpCode":
                    		__modified().__corpCodeLoaded = false;break;
                    case "corpName":
                    		__modified().__corpNameLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Company\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        if (base.__isLoaded(PropId.byIndex(SLOT_PARENT))) {
                            Company oldValue = base.parent();
                            Company newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setParent(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_CHILDREN))) {
                            List<Company> oldValue = base.children();
                            List<Company> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setChildren(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_EMPLOYEES))) {
                            List<Employee> oldValue = base.employees();
                            List<Employee> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setEmployees(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__parentValue = __ctx.resolveObject(__tmpModified.__parentValue);
                        __tmpModified.__childrenValue = NonSharedList.of(__tmpModified.__childrenValue, __ctx.resolveList(__tmpModified.__childrenValue));
                        __tmpModified.__employeesValue = NonSharedList.of(__tmpModified.__employeesValue, __ctx.resolveList(__tmpModified.__employeesValue));
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
            type = Company.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT), false);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT_ID), false);
        }

        @NotNull
        public Builder id(String id) {
            if (id != null) {
                __draft.setId(id);
            }
            return this;
        }

        @Schema(
                description = "父级公司"
        )
        @jakarta.annotation.Nullable
        public Builder parent(Company parent) {
            __draft.setParent(parent);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT), true);
            return this;
        }

        @Schema(
                description = "父级id"
        )
        @jakarta.annotation.Nullable
        public Builder parentId(String parentId) {
            __draft.setParentId(parentId);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT_ID), true);
            return this;
        }

        @Schema(
                description = "子级公司"
        )
        public Builder children(List<Company> children) {
            if (children != null) {
                __draft.setChildren(children);
            }
            return this;
        }

        public Builder employees(List<Employee> employees) {
            if (employees != null) {
                __draft.setEmployees(employees);
            }
            return this;
        }

        @Schema(
                description = "公司编码"
        )
        public Builder companyCode(String companyCode) {
            if (companyCode != null) {
                __draft.setCompanyCode(companyCode);
            }
            return this;
        }

        @Schema(
                description = "公司名称"
        )
        public Builder companyName(String companyName) {
            if (companyName != null) {
                __draft.setCompanyName(companyName);
            }
            return this;
        }

        @Schema(
                description = "公司全名"
        )
        @jakarta.annotation.Nullable
        public Builder companyFullName(String companyFullName) {
            __draft.setCompanyFullName(companyFullName);
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

        public Company build() {
            return (Company)__draft.__modified();
        }
    }
}
