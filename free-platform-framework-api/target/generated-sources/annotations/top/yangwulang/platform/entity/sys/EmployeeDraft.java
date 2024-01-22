package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
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
import org.babyfish.jimmer.Draft;
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
import org.babyfish.jimmer.sql.ManyToOne;
import org.babyfish.jimmer.sql.OneToOne;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        type = Employee.class
)
public interface EmployeeDraft extends Employee, Draft {
    EmployeeDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    EmployeeDraft setEmpCode(String empCode);

    @Nullable
    UserDraft user();

    UserDraft user(boolean autoCreate);

    @OldChain
    EmployeeDraft setUser(User user);

    @OldChain
    EmployeeDraft applyUser(DraftConsumer<UserDraft> block);

    @OldChain
    EmployeeDraft applyUser(User base, DraftConsumer<UserDraft> block);

    @Nullable
    CompanyDraft company();

    CompanyDraft company(boolean autoCreate);

    @OldChain
    EmployeeDraft setCompany(Company company);

    @OldChain
    EmployeeDraft applyCompany(DraftConsumer<CompanyDraft> block);

    @OldChain
    EmployeeDraft applyCompany(Company base, DraftConsumer<CompanyDraft> block);

    @OldChain
    EmployeeDraft setCompanyId(String companyId);

    @OldChain
    EmployeeDraft setEmpName(String empName);

    List<PostDraft> posts(boolean autoCreate);

    @OldChain
    EmployeeDraft setPosts(List<Post> posts);

    @OldChain
    EmployeeDraft addIntoPosts(DraftConsumer<PostDraft> block);

    @OldChain
    EmployeeDraft addIntoPosts(Post base, DraftConsumer<PostDraft> block);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_EMP_CODE = 0;

        public static final int SLOT_USER = 1;

        public static final int SLOT_COMPANY = 2;

        public static final int SLOT_COMPANY_ID = 3;

        public static final int SLOT_EMP_NAME = 4;

        public static final int SLOT_POSTS = 5;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.69",
                Employee.class,
                Collections.emptyList(),
                (ctx, base) -> new DraftImpl(ctx, (Employee)base)
            )
            .id(SLOT_EMP_CODE, "empCode", String.class)
            .keyReference(SLOT_USER, "user", OneToOne.class, User.class, true)
            .add(SLOT_COMPANY, "company", ManyToOne.class, Company.class, true)
            .add(SLOT_COMPANY_ID, "companyId", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_EMP_NAME, "empName", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_POSTS, "posts", ManyToMany.class, Post.class, false)
            .build();

        private Producer() {
        }

        public Employee produce(DraftConsumer<EmployeeDraft> block) {
            return produce(null, block);
        }

        public Employee produce(Employee base, DraftConsumer<EmployeeDraft> block) {
            return (Employee)Internal.produce(TYPE, base, block);
        }

        public abstract interface Implementor extends Employee, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_EMP_CODE:
                    		return empCode();
                    case SLOT_USER:
                    		return user();
                    case SLOT_COMPANY:
                    		return company();
                    case SLOT_COMPANY_ID:
                    		return companyId();
                    case SLOT_EMP_NAME:
                    		return empName();
                    case SLOT_POSTS:
                    		return posts();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Employee\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "empCode":
                    		return empCode();
                    case "user":
                    		return user();
                    case "company":
                    		return company();
                    case "companyId":
                    		return companyId();
                    case "empName":
                    		return empName();
                    case "posts":
                    		return posts();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Employee\": \"" + prop + "\"");
                }
            }

            @JsonIgnore
            default String getEmpCode() {
                return empCode();
            }

            @JsonIgnore
            default User getUser() {
                return user();
            }

            @JsonIgnore
            default Company getCompany() {
                return company();
            }

            @JsonIgnore
            default String getCompanyId() {
                return companyId();
            }

            @JsonIgnore
            default String getEmpName() {
                return empName();
            }

            @JsonIgnore
            default List<Post> getPosts() {
                return posts();
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

            String __empCodeValue;

            User __userValue;

            boolean __userLoaded = false;

            Company __companyValue;

            boolean __companyLoaded = false;

            String __empNameValue;

            boolean __empNameLoaded = false;

            NonSharedList<Post> __postsValue;

            Impl() {
                __visibility = Visibility.of(6);
                __visibility.show(SLOT_COMPANY_ID, false);
            }

            @Override
            public String empCode() {
                if (__empCodeValue == null) {
                    throw new UnloadedException(Employee.class, "empCode");
                }
                return __empCodeValue;
            }

            @Override
            @Nullable
            public User user() {
                if (!__userLoaded) {
                    throw new UnloadedException(Employee.class, "user");
                }
                return __userValue;
            }

            @Override
            @Nullable
            public Company company() {
                if (!__companyLoaded) {
                    throw new UnloadedException(Employee.class, "company");
                }
                return __companyValue;
            }

            @Override
            @Nullable
            public String companyId() {
                Company __target = company();
                return __target != null ? __target.id() : null;
            }

            @Override
            @Nullable
            public String empName() {
                if (!__empNameLoaded) {
                    throw new UnloadedException(Employee.class, "empName");
                }
                return __empNameValue;
            }

            @Override
            public List<Post> posts() {
                if (__postsValue == null) {
                    throw new UnloadedException(Employee.class, "posts");
                }
                return __postsValue;
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
                    case SLOT_EMP_CODE:
                    		return __empCodeValue != null;
                    case SLOT_USER:
                    		return __userLoaded;
                    case SLOT_COMPANY:
                    		return __companyLoaded;
                    case SLOT_COMPANY_ID:
                    		return __isLoaded(PropId.byIndex(SLOT_COMPANY)) && (company() == null || 
                            	((ImmutableSpi)company()).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_ID)));
                    case SLOT_EMP_NAME:
                    		return __empNameLoaded;
                    case SLOT_POSTS:
                    		return __postsValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Employee\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "empCode":
                    		return __empCodeValue != null;
                    case "user":
                    		return __userLoaded;
                    case "company":
                    		return __companyLoaded;
                    case "companyId":
                    		return __isLoaded(PropId.byIndex(SLOT_COMPANY)) && (company() == null || 
                            	((ImmutableSpi)company()).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_ID)));
                    case "empName":
                    		return __empNameLoaded;
                    case "posts":
                    		return __postsValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Employee\": \"" + prop + "\"");
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
                    case SLOT_EMP_CODE:
                    		return __visibility.visible(SLOT_EMP_CODE);
                    case SLOT_USER:
                    		return __visibility.visible(SLOT_USER);
                    case SLOT_COMPANY:
                    		return __visibility.visible(SLOT_COMPANY);
                    case SLOT_COMPANY_ID:
                    		return __visibility.visible(SLOT_COMPANY_ID);
                    case SLOT_EMP_NAME:
                    		return __visibility.visible(SLOT_EMP_NAME);
                    case SLOT_POSTS:
                    		return __visibility.visible(SLOT_POSTS);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "empCode":
                    		return __visibility.visible(SLOT_EMP_CODE);
                    case "user":
                    		return __visibility.visible(SLOT_USER);
                    case "company":
                    		return __visibility.visible(SLOT_COMPANY);
                    case "companyId":
                    		return __visibility.visible(SLOT_COMPANY_ID);
                    case "empName":
                    		return __visibility.visible(SLOT_EMP_NAME);
                    case "posts":
                    		return __visibility.visible(SLOT_POSTS);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__empCodeValue != null) {
                    hash = 31 * hash + __empCodeValue.hashCode();
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (__userLoaded && __userValue != null) {
                    hash = 31 * hash + __userValue.hashCode();
                }
                if (__companyLoaded && __companyValue != null) {
                    hash = 31 * hash + __companyValue.hashCode();
                }
                if (__empNameLoaded && __empNameValue != null) {
                    hash = 31 * hash + __empNameValue.hashCode();
                }
                if (__postsValue != null) {
                    hash = 31 * hash + __postsValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__empCodeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__empCodeValue);
                }
                if (__userLoaded) {
                    hash = 31 * hash + System.identityHashCode(__userValue);
                }
                if (__companyLoaded) {
                    hash = 31 * hash + System.identityHashCode(__companyValue);
                }
                if (__empNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(__empNameValue);
                }
                if (__postsValue != null) {
                    hash = 31 * hash + System.identityHashCode(__postsValue);
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
                if (__isVisible(PropId.byIndex(SLOT_EMP_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_EMP_CODE))) {
                    return false;
                }
                boolean __empCodeLoaded = __empCodeValue != null;
                if (__empCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EMP_CODE))) {
                    return false;
                }
                if (__empCodeLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(__empCodeValue, __other.empCode());
                }
                if (__isVisible(PropId.byIndex(SLOT_USER)) != __other.__isVisible(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                boolean __userLoaded = this.__userLoaded;
                if (__userLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                if (__userLoaded && !Objects.equals(__userValue, __other.user())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COMPANY)) != __other.__isVisible(PropId.byIndex(SLOT_COMPANY))) {
                    return false;
                }
                boolean __companyLoaded = this.__companyLoaded;
                if (__companyLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COMPANY))) {
                    return false;
                }
                if (__companyLoaded && !Objects.equals(__companyValue, __other.company())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COMPANY_ID)) != __other.__isVisible(PropId.byIndex(SLOT_COMPANY_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EMP_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_EMP_NAME))) {
                    return false;
                }
                boolean __empNameLoaded = this.__empNameLoaded;
                if (__empNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EMP_NAME))) {
                    return false;
                }
                if (__empNameLoaded && !Objects.equals(__empNameValue, __other.empName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_POSTS)) != __other.__isVisible(PropId.byIndex(SLOT_POSTS))) {
                    return false;
                }
                boolean __postsLoaded = __postsValue != null;
                if (__postsLoaded != __other.__isLoaded(PropId.byIndex(SLOT_POSTS))) {
                    return false;
                }
                if (__postsLoaded && !Objects.equals(__postsValue, __other.posts())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_EMP_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_EMP_CODE))) {
                    return false;
                }
                boolean __empCodeLoaded = __empCodeValue != null;
                if (__empCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EMP_CODE))) {
                    return false;
                }
                if (__empCodeLoaded && __empCodeValue != __other.empCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USER)) != __other.__isVisible(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                boolean __userLoaded = this.__userLoaded;
                if (__userLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                if (__userLoaded && __userValue != __other.user()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COMPANY)) != __other.__isVisible(PropId.byIndex(SLOT_COMPANY))) {
                    return false;
                }
                boolean __companyLoaded = this.__companyLoaded;
                if (__companyLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COMPANY))) {
                    return false;
                }
                if (__companyLoaded && __companyValue != __other.company()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COMPANY_ID)) != __other.__isVisible(PropId.byIndex(SLOT_COMPANY_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EMP_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_EMP_NAME))) {
                    return false;
                }
                boolean __empNameLoaded = this.__empNameLoaded;
                if (__empNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EMP_NAME))) {
                    return false;
                }
                if (__empNameLoaded && __empNameValue != __other.empName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_POSTS)) != __other.__isVisible(PropId.byIndex(SLOT_POSTS))) {
                    return false;
                }
                boolean __postsLoaded = __postsValue != null;
                if (__postsLoaded != __other.__isLoaded(PropId.byIndex(SLOT_POSTS))) {
                    return false;
                }
                if (__postsLoaded && __postsValue != __other.posts()) {
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

        private static class DraftImpl implements Implementor, DraftSpi, EmployeeDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, Employee base) {
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
            public String empCode() {
                return (__modified!= null ? __modified : __base).empCode();
            }

            @Override
            public EmployeeDraft setEmpCode(String empCode) {
                if (empCode == null) {
                    throw new IllegalArgumentException(
                        "'empCode' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__empCodeValue = empCode;
                return this;
            }

            @Override
            @Nullable
            public UserDraft user() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).user());
            }

            @Override
            public UserDraft user(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_USER)) || user() == null)) {
                    setUser(UserDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).user());
            }

            @Override
            public EmployeeDraft setUser(User user) {
                Impl __tmpModified = __modified();
                __tmpModified.__userValue = user;
                __tmpModified.__userLoaded = true;
                return this;
            }

            @Override
            public EmployeeDraft applyUser(DraftConsumer<UserDraft> block) {
                applyUser(null, block);
                return this;
            }

            @Override
            public EmployeeDraft applyUser(User base, DraftConsumer<UserDraft> block) {
                setUser(UserDraft.$.produce(base, block));
                return this;
            }

            @Override
            @Nullable
            public CompanyDraft company() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).company());
            }

            @Override
            public CompanyDraft company(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_COMPANY)) || company() == null)) {
                    setCompany(CompanyDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).company());
            }

            @Override
            public EmployeeDraft setCompany(Company company) {
                Impl __tmpModified = __modified();
                __tmpModified.__companyValue = company;
                __tmpModified.__companyLoaded = true;
                return this;
            }

            @Override
            public EmployeeDraft applyCompany(DraftConsumer<CompanyDraft> block) {
                applyCompany(null, block);
                return this;
            }

            @Override
            public EmployeeDraft applyCompany(Company base, DraftConsumer<CompanyDraft> block) {
                setCompany(CompanyDraft.$.produce(base, block));
                return this;
            }

            @Override
            @Nullable
            public String companyId() {
                Company __target = company();
                return __target != null ? __target.id() : null;
            }

            @Override
            public EmployeeDraft setCompanyId(String companyId) {
                if (companyId != null) {
                    setCompany(ImmutableObjects.makeIdOnly(Company.class, companyId));
                } else {
                    setCompany(null);
                }
                return this;
            }

            @Override
            @Nullable
            public String empName() {
                return (__modified!= null ? __modified : __base).empName();
            }

            @Override
            public EmployeeDraft setEmpName(String empName) {
                Impl __tmpModified = __modified();
                __tmpModified.__empNameValue = empName;
                __tmpModified.__empNameLoaded = true;
                return this;
            }

            @Override
            public List<Post> posts() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).posts(), Post.class, true);
            }

            @Override
            public List<PostDraft> posts(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_POSTS)))) {
                    setPosts(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).posts(), Post.class, true);
            }

            @Override
            public EmployeeDraft setPosts(List<Post> posts) {
                if (posts == null) {
                    throw new IllegalArgumentException(
                        "'posts' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__postsValue = NonSharedList.of(__tmpModified.__postsValue, posts);
                return this;
            }

            @Override
            public EmployeeDraft addIntoPosts(DraftConsumer<PostDraft> block) {
                addIntoPosts(null, block);
                return this;
            }

            @Override
            public EmployeeDraft addIntoPosts(Post base, DraftConsumer<PostDraft> block) {
                posts(true).add((PostDraft)PostDraft.$.produce(base, block));
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
                    case SLOT_EMP_CODE:
                    		setEmpCode((String)value);break;
                    case SLOT_USER:
                    		setUser((User)value);break;
                    case SLOT_COMPANY:
                    		setCompany((Company)value);break;
                    case SLOT_COMPANY_ID:
                    		setCompanyId((String)value);break;
                    case SLOT_EMP_NAME:
                    		setEmpName((String)value);break;
                    case SLOT_POSTS:
                    		setPosts((List<Post>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Employee\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "empCode":
                    		setEmpCode((String)value);break;
                    case "user":
                    		setUser((User)value);break;
                    case "company":
                    		setCompany((Company)value);break;
                    case "companyId":
                    		setCompanyId((String)value);break;
                    case "empName":
                    		setEmpName((String)value);break;
                    case "posts":
                    		setPosts((List<Post>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Employee\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(6);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_EMP_CODE:
                    		__visibility.show(SLOT_EMP_CODE, visible);break;
                    case SLOT_USER:
                    		__visibility.show(SLOT_USER, visible);break;
                    case SLOT_COMPANY:
                    		__visibility.show(SLOT_COMPANY, visible);break;
                    case SLOT_COMPANY_ID:
                    		__visibility.show(SLOT_COMPANY_ID, visible);break;
                    case SLOT_EMP_NAME:
                    		__visibility.show(SLOT_EMP_NAME, visible);break;
                    case SLOT_POSTS:
                    		__visibility.show(SLOT_POSTS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.Employee\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(6);
                }
                switch (prop) {
                    case "empCode":
                    		__visibility.show(SLOT_EMP_CODE, visible);break;
                    case "user":
                    		__visibility.show(SLOT_USER, visible);break;
                    case "company":
                    		__visibility.show(SLOT_COMPANY, visible);break;
                    case "companyId":
                    		__visibility.show(SLOT_COMPANY_ID, visible);break;
                    case "empName":
                    		__visibility.show(SLOT_EMP_NAME, visible);break;
                    case "posts":
                    		__visibility.show(SLOT_POSTS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.Employee\": \"" + 
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
                    case SLOT_EMP_CODE:
                    		__modified().__empCodeValue = null;break;
                    case SLOT_USER:
                    		__modified().__userLoaded = false;break;
                    case SLOT_COMPANY:
                    		__modified().__companyLoaded = false;break;
                    case SLOT_COMPANY_ID:
                    		__unload(PropId.byIndex(SLOT_COMPANY));break;
                    case SLOT_EMP_NAME:
                    		__modified().__empNameLoaded = false;break;
                    case SLOT_POSTS:
                    		__modified().__postsValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Employee\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "empCode":
                    		__modified().__empCodeValue = null;break;
                    case "user":
                    		__modified().__userLoaded = false;break;
                    case "company":
                    		__modified().__companyLoaded = false;break;
                    case "companyId":
                    		__unload(PropId.byIndex(SLOT_COMPANY));break;
                    case "empName":
                    		__modified().__empNameLoaded = false;break;
                    case "posts":
                    		__modified().__postsValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Employee\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        if (base.__isLoaded(PropId.byIndex(SLOT_USER))) {
                            User oldValue = base.user();
                            User newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setUser(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_COMPANY))) {
                            Company oldValue = base.company();
                            Company newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setCompany(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_POSTS))) {
                            List<Post> oldValue = base.posts();
                            List<Post> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setPosts(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__userValue = __ctx.resolveObject(__tmpModified.__userValue);
                        __tmpModified.__companyValue = __ctx.resolveObject(__tmpModified.__companyValue);
                        __tmpModified.__postsValue = NonSharedList.of(__tmpModified.__postsValue, __ctx.resolveList(__tmpModified.__postsValue));
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
        private String empCode;

        private boolean __userLoaded;

        private User user;

        private boolean __companyLoaded;

        private Company company;

        private boolean __empNameLoaded;

        private String empName;

        private List<Post> posts;

        public MapStruct empCode(String empCode) {
            this.empCode = empCode;
            return this;
        }

        public MapStruct user(User user) {
            this.__userLoaded = true;
            this.user = user;
            return this;
        }

        public MapStruct company(Company company) {
            this.__companyLoaded = true;
            this.company = company;
            return this;
        }

        public MapStruct companyId(String companyId) {
            this.__companyLoaded = true;
            if (companyId == null) {
                this.company = null;
            } else {
                this.company = ImmutableObjects.makeIdOnly(Company.class, companyId);
            }
            return this;
        }

        public MapStruct empName(String empName) {
            this.__empNameLoaded = true;
            this.empName = empName;
            return this;
        }

        public MapStruct posts(List<Post> posts) {
            this.posts = posts != null ? posts : Collections.emptyList();
            return this;
        }

        public Employee build() {
            return EmployeeDraft.$.produce(draft -> {
                if (empCode != null) {
                    draft.setEmpCode(empCode);
                }
                if (__userLoaded) {
                    draft.setUser(user);
                }
                if (__companyLoaded) {
                    draft.setCompany(company);
                }
                if (__empNameLoaded) {
                    draft.setEmpName(empName);
                }
                if (posts != null) {
                    draft.setPosts(posts);
                }
            });
        }
    }
}
