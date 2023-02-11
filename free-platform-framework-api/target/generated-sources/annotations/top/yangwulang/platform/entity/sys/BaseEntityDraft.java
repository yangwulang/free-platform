package top.yangwulang.platform.entity.sys;

import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
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

public interface BaseEntityDraft extends BaseEntity, Draft {
    BaseEntityDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    BaseEntityDraft setStatus(String status);

    @OldChain
    BaseEntityDraft setCreateBy(String createBy);

    @OldChain
    BaseEntityDraft setCreateDate(LocalDateTime createDate);

    @OldChain
    BaseEntityDraft setUpdateBy(String updateBy);

    @OldChain
    BaseEntityDraft setUpdateDate(LocalDateTime updateDate);

    @OldChain
    BaseEntityDraft setRemarks(String remarks);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                BaseEntity.class,
                null,
                (ctx, base) -> new DraftImpl(ctx, (BaseEntity)base)
            )
            .add(1, "status", ImmutablePropCategory.SCALAR, String.class, false)
            .add(2, "createBy", ImmutablePropCategory.SCALAR, String.class, false)
            .add(3, "createDate", ImmutablePropCategory.SCALAR, LocalDateTime.class, false)
            .add(4, "updateBy", ImmutablePropCategory.SCALAR, String.class, false)
            .add(5, "updateDate", ImmutablePropCategory.SCALAR, LocalDateTime.class, false)
            .add(6, "remarks", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public BaseEntity produce(DraftConsumer<BaseEntityDraft> block) {
            return produce(null, block);
        }

        public BaseEntity produce(BaseEntity base, DraftConsumer<BaseEntityDraft> block) {
            return (BaseEntity)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements BaseEntity, ImmutableSpi {
            @Override
            public Object __get(int prop) {
                switch (prop) {
                    case 1: return status();
                    case 2: return createBy();
                    case 3: return createDate();
                    case 4: return updateBy();
                    case 5: return updateDate();
                    case 6: return remarks();
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
            String status;

            String createBy;

            LocalDateTime createDate;

            String updateBy;

            LocalDateTime updateDate;

            String remarks;

            boolean remarksLoaded = false;

            @Override
            public String status() {
                if (status == null) {
                    throw new UnloadedException(BaseEntity.class, "status");
                }
                return status;
            }

            @Override
            public String createBy() {
                if (createBy == null) {
                    throw new UnloadedException(BaseEntity.class, "createBy");
                }
                return createBy;
            }

            @Override
            public LocalDateTime createDate() {
                if (createDate == null) {
                    throw new UnloadedException(BaseEntity.class, "createDate");
                }
                return createDate;
            }

            @Override
            public String updateBy() {
                if (updateBy == null) {
                    throw new UnloadedException(BaseEntity.class, "updateBy");
                }
                return updateBy;
            }

            @Override
            public LocalDateTime updateDate() {
                if (updateDate == null) {
                    throw new UnloadedException(BaseEntity.class, "updateDate");
                }
                return updateDate;
            }

            @Override
            public String remarks() {
                if (!remarksLoaded) {
                    throw new UnloadedException(BaseEntity.class, "remarks");
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
                    case 1: return status != null;
                    case 2: return createBy != null;
                    case 3: return createDate != null;
                    case 4: return updateBy != null;
                    case 5: return updateDate != null;
                    case 6: return remarksLoaded;
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
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public int hashCode() {
                int hash = 1;
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
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor other = (Implementor)obj;
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
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, BaseEntityDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, BaseEntity base) {
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
            public String status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public BaseEntityDraft setStatus(String status) {
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
            public BaseEntityDraft setCreateBy(String createBy) {
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
            public LocalDateTime createDate() {
                return (__modified!= null ? __modified : __base).createDate();
            }

            @Override
            public BaseEntityDraft setCreateDate(LocalDateTime createDate) {
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
            public BaseEntityDraft setUpdateBy(String updateBy) {
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
            public LocalDateTime updateDate() {
                return (__modified!= null ? __modified : __base).updateDate();
            }

            @Override
            public BaseEntityDraft setUpdateDate(LocalDateTime updateDate) {
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
            public BaseEntityDraft setRemarks(String remarks) {
                Impl modified = __modified();
                modified.remarks = remarks;
                modified.remarksLoaded = true;
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
