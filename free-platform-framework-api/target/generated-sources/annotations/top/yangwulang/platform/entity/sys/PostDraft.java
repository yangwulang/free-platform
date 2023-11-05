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
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
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
import top.yangwulang.platform.entity.TypeBaseDraft;

@GeneratedBy(
        type = Post.class
)
public interface PostDraft extends Post, TypeBaseDraft {
    PostDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    PostDraft setId(String id);

    @OldChain
    PostDraft setPostCode(String postCode);

    @OldChain
    PostDraft setPostName(String postName);

    @OldChain
    PostDraft setPostType(String postType);

    List<EmployeeDraft> employees(boolean autoCreate);

    @OldChain
    PostDraft setEmployees(List<Employee> employees);

    @OldChain
    PostDraft addIntoEmployees(DraftConsumer<EmployeeDraft> block);

    @OldChain
    PostDraft addIntoEmployees(Employee base, DraftConsumer<EmployeeDraft> block);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_POST_CODE = 1;

        public static final int SLOT_POST_NAME = 2;

        public static final int SLOT_POST_TYPE = 3;

        public static final int SLOT_EMPLOYEES = 4;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.35",
                Post.class,
                Collections.singleton(TypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (Post)base)
            )
            .redefine("id", SLOT_ID)
            .add(SLOT_POST_CODE, "postCode", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_POST_NAME, "postName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_POST_TYPE, "postType", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_EMPLOYEES, "employees", ManyToMany.class, Employee.class, false)
            .build();

        private Producer() {
        }

        public Post produce(DraftConsumer<PostDraft> block) {
            return produce(null, block);
        }

        public Post produce(Post base, DraftConsumer<PostDraft> block) {
            return (Post)Internal.produce(TYPE, base, block);
        }

        public abstract interface Implementor extends Post, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
                    case SLOT_POST_CODE:
                    		return postCode();
                    case SLOT_POST_NAME:
                    		return postName();
                    case SLOT_POST_TYPE:
                    		return postType();
                    case SLOT_EMPLOYEES:
                    		return employees();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Post\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
                    case "postCode":
                    		return postCode();
                    case "postName":
                    		return postName();
                    case "postType":
                    		return postType();
                    case "employees":
                    		return employees();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Post\": \"" + prop + "\"");
                }
            }

            @JsonIgnore
            default String getId() {
                return id();
            }

            @JsonIgnore
            default String getPostCode() {
                return postCode();
            }

            @JsonIgnore
            default String getPostName() {
                return postName();
            }

            @JsonIgnore
            default String getPostType() {
                return postType();
            }

            @JsonIgnore
            default List<Employee> getEmployees() {
                return employees();
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

            String __idValue;

            String __postCodeValue;

            String __postNameValue;

            String __postTypeValue;

            boolean __postTypeLoaded = false;

            NonSharedList<Employee> __employeesValue;

            @Override
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(Post.class, "id");
                }
                return __idValue;
            }

            @Override
            public String postCode() {
                if (__postCodeValue == null) {
                    throw new UnloadedException(Post.class, "postCode");
                }
                return __postCodeValue;
            }

            @Override
            public String postName() {
                if (__postNameValue == null) {
                    throw new UnloadedException(Post.class, "postName");
                }
                return __postNameValue;
            }

            @Override
            @Nullable
            public String postType() {
                if (!__postTypeLoaded) {
                    throw new UnloadedException(Post.class, "postType");
                }
                return __postTypeValue;
            }

            @Override
            public List<Employee> employees() {
                if (__employeesValue == null) {
                    throw new UnloadedException(Post.class, "employees");
                }
                return __employeesValue;
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
                    case SLOT_POST_CODE:
                    		return __postCodeValue != null;
                    case SLOT_POST_NAME:
                    		return __postNameValue != null;
                    case SLOT_POST_TYPE:
                    		return __postTypeLoaded;
                    case SLOT_EMPLOYEES:
                    		return __employeesValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Post\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
                    case "postCode":
                    		return __postCodeValue != null;
                    case "postName":
                    		return __postNameValue != null;
                    case "postType":
                    		return __postTypeLoaded;
                    case "employees":
                    		return __employeesValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Post\": \"" + prop + "\"");
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
                    case SLOT_POST_CODE:
                    		return __visibility.visible(SLOT_POST_CODE);
                    case SLOT_POST_NAME:
                    		return __visibility.visible(SLOT_POST_NAME);
                    case SLOT_POST_TYPE:
                    		return __visibility.visible(SLOT_POST_TYPE);
                    case SLOT_EMPLOYEES:
                    		return __visibility.visible(SLOT_EMPLOYEES);
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
                    case "postCode":
                    		return __visibility.visible(SLOT_POST_CODE);
                    case "postName":
                    		return __visibility.visible(SLOT_POST_NAME);
                    case "postType":
                    		return __visibility.visible(SLOT_POST_TYPE);
                    case "employees":
                    		return __visibility.visible(SLOT_EMPLOYEES);
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
                if (__postCodeValue != null) {
                    hash = 31 * hash + __postCodeValue.hashCode();
                }
                if (__postNameValue != null) {
                    hash = 31 * hash + __postNameValue.hashCode();
                }
                if (__postTypeLoaded && __postTypeValue != null) {
                    hash = 31 * hash + __postTypeValue.hashCode();
                }
                if (__employeesValue != null) {
                    hash = 31 * hash + __employeesValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
                }
                if (__postCodeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__postCodeValue);
                }
                if (__postNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__postNameValue);
                }
                if (__postTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__postTypeValue);
                }
                if (__employeesValue != null) {
                    hash = 31 * hash + System.identityHashCode(__employeesValue);
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
                if (__isVisible(PropId.byIndex(SLOT_POST_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_POST_CODE))) {
                    return false;
                }
                boolean __postCodeLoaded = __postCodeValue != null;
                if (__postCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_POST_CODE))) {
                    return false;
                }
                if (__postCodeLoaded && !Objects.equals(__postCodeValue, __other.postCode())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_POST_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_POST_NAME))) {
                    return false;
                }
                boolean __postNameLoaded = __postNameValue != null;
                if (__postNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_POST_NAME))) {
                    return false;
                }
                if (__postNameLoaded && !Objects.equals(__postNameValue, __other.postName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_POST_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_POST_TYPE))) {
                    return false;
                }
                boolean __postTypeLoaded = this.__postTypeLoaded;
                if (__postTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_POST_TYPE))) {
                    return false;
                }
                if (__postTypeLoaded && !Objects.equals(__postTypeValue, __other.postType())) {
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
                if (__isVisible(PropId.byIndex(SLOT_POST_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_POST_CODE))) {
                    return false;
                }
                boolean __postCodeLoaded = __postCodeValue != null;
                if (__postCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_POST_CODE))) {
                    return false;
                }
                if (__postCodeLoaded && __postCodeValue != __other.postCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_POST_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_POST_NAME))) {
                    return false;
                }
                boolean __postNameLoaded = __postNameValue != null;
                if (__postNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_POST_NAME))) {
                    return false;
                }
                if (__postNameLoaded && __postNameValue != __other.postName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_POST_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_POST_TYPE))) {
                    return false;
                }
                boolean __postTypeLoaded = this.__postTypeLoaded;
                if (__postTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_POST_TYPE))) {
                    return false;
                }
                if (__postTypeLoaded && __postTypeValue != __other.postType()) {
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

        private static class DraftImpl implements Implementor, DraftSpi, PostDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, Post base) {
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
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public PostDraft setId(String id) {
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
            public String postCode() {
                return (__modified!= null ? __modified : __base).postCode();
            }

            @Override
            public PostDraft setPostCode(String postCode) {
                if (postCode == null) {
                    throw new IllegalArgumentException(
                        "'postCode' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__postCodeValue = postCode;
                return this;
            }

            @Override
            public String postName() {
                return (__modified!= null ? __modified : __base).postName();
            }

            @Override
            public PostDraft setPostName(String postName) {
                if (postName == null) {
                    throw new IllegalArgumentException(
                        "'postName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__postNameValue = postName;
                return this;
            }

            @Override
            @Nullable
            public String postType() {
                return (__modified!= null ? __modified : __base).postType();
            }

            @Override
            public PostDraft setPostType(String postType) {
                Impl __tmpModified = __modified();
                __tmpModified.__postTypeValue = postType;
                __tmpModified.__postTypeLoaded = true;
                return this;
            }

            @Override
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
            public PostDraft setEmployees(List<Employee> employees) {
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
            public PostDraft addIntoEmployees(DraftConsumer<EmployeeDraft> block) {
                addIntoEmployees(null, block);
                return this;
            }

            @Override
            public PostDraft addIntoEmployees(Employee base, DraftConsumer<EmployeeDraft> block) {
                employees(true).add((EmployeeDraft)EmployeeDraft.$.produce(base, block));
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
                    case SLOT_POST_CODE:
                    		setPostCode((String)value);break;
                    case SLOT_POST_NAME:
                    		setPostName((String)value);break;
                    case SLOT_POST_TYPE:
                    		setPostType((String)value);break;
                    case SLOT_EMPLOYEES:
                    		setEmployees((List<Employee>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Post\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "postCode":
                    		setPostCode((String)value);break;
                    case "postName":
                    		setPostName((String)value);break;
                    case "postType":
                    		setPostType((String)value);break;
                    case "employees":
                    		setEmployees((List<Employee>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Post\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(5);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_POST_CODE:
                    		__visibility.show(SLOT_POST_CODE, visible);break;
                    case SLOT_POST_NAME:
                    		__visibility.show(SLOT_POST_NAME, visible);break;
                    case SLOT_POST_TYPE:
                    		__visibility.show(SLOT_POST_TYPE, visible);break;
                    case SLOT_EMPLOYEES:
                    		__visibility.show(SLOT_EMPLOYEES, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.Post\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(5);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "postCode":
                    		__visibility.show(SLOT_POST_CODE, visible);break;
                    case "postName":
                    		__visibility.show(SLOT_POST_NAME, visible);break;
                    case "postType":
                    		__visibility.show(SLOT_POST_TYPE, visible);break;
                    case "employees":
                    		__visibility.show(SLOT_EMPLOYEES, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.Post\": \"" + 
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
                    case SLOT_ID:
                    		__modified().__idValue = null;break;
                    case SLOT_POST_CODE:
                    		__modified().__postCodeValue = null;break;
                    case SLOT_POST_NAME:
                    		__modified().__postNameValue = null;break;
                    case SLOT_POST_TYPE:
                    		__modified().__postTypeLoaded = false;break;
                    case SLOT_EMPLOYEES:
                    		__modified().__employeesValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Post\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id":
                    		__modified().__idValue = null;break;
                    case "postCode":
                    		__modified().__postCodeValue = null;break;
                    case "postName":
                    		__modified().__postNameValue = null;break;
                    case "postType":
                    		__modified().__postTypeLoaded = false;break;
                    case "employees":
                    		__modified().__employeesValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Post\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        __tmpModified.__employeesValue = NonSharedList.of(__tmpModified.__employeesValue, __ctx.resolveList(__tmpModified.__employeesValue));
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
        private String id;

        private String postCode;

        private String postName;

        private boolean __postTypeLoaded;

        private String postType;

        private List<Employee> employees;

        public MapStruct id(String id) {
            this.id = id;
            return this;
        }

        public MapStruct postCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public MapStruct postName(String postName) {
            this.postName = postName;
            return this;
        }

        public MapStruct postType(String postType) {
            this.__postTypeLoaded = true;
            this.postType = postType;
            return this;
        }

        public MapStruct employees(List<Employee> employees) {
            this.employees = employees != null ? employees : Collections.emptyList();
            return this;
        }

        public Post build() {
            return PostDraft.$.produce(draft -> {
                if (id != null) {
                    draft.setId(id);
                }
                if (postCode != null) {
                    draft.setPostCode(postCode);
                }
                if (postName != null) {
                    draft.setPostName(postName);
                }
                if (__postTypeLoaded) {
                    draft.setPostType(postType);
                }
                if (employees != null) {
                    draft.setEmployees(employees);
                }
            });
        }
    }
}
