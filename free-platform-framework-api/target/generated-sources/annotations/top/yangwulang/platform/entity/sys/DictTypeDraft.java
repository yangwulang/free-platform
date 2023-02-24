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

public interface DictTypeDraft extends DictType, DataTypeBaseDraft {
    DictTypeDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    DictTypeDraft setId(String id);

    @OldChain
    DictTypeDraft setStatus(String status);

    @OldChain
    DictTypeDraft setCreateBy(String createBy);

    @OldChain
    DictTypeDraft setCreateDate(LocalDateTime createDate);

    @OldChain
    DictTypeDraft setUpdateBy(String updateBy);

    @OldChain
    DictTypeDraft setUpdateDate(LocalDateTime updateDate);

    @OldChain
    DictTypeDraft setRemarks(String remarks);

    @OldChain
    DictTypeDraft setDictName(String dictName);

    @OldChain
    DictTypeDraft setDictType(String dictType);

    @OldChain
    DictTypeDraft setSys(boolean sys);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                DictType.class,
                DataTypeBaseDraft.Producer.TYPE,
                (ctx, base) -> new DraftImpl(ctx, (DictType)base)
            )
            .add(8, "dictName", ImmutablePropCategory.SCALAR, String.class, true)
            .key(9, "dictType", String.class)
            .add(10, "sys", ImmutablePropCategory.SCALAR, boolean.class, true)
            .build();

        private Producer() {
        }

        public DictType produce(DraftConsumer<DictTypeDraft> block) {
            return produce(null, block);
        }

        public DictType produce(DictType base, DraftConsumer<DictTypeDraft> block) {
            return (DictType)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements DictType, ImmutableSpi {
            @Override
            public Object __get(int prop) {
                switch (prop) {
                    case 1: return id();
                    case 2: return status();
                    case 3: return createBy();
                    case 4: return createDate();
                    case 5: return updateBy();
                    case 6: return updateDate();
                    case 7: return remarks();
                    case 8: return dictName();
                    case 9: return dictType();
                    case 10: return (Boolean)isSys();
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public Object __get(String prop) {
                switch (prop) {
                    case "id": return id();
                    case "status": return status();
                    case "createBy": return createBy();
                    case "createDate": return createDate();
                    case "updateBy": return updateBy();
                    case "updateDate": return updateDate();
                    case "remarks": return remarks();
                    case "dictName": return dictName();
                    case "dictType": return dictType();
                    case "sys": return (Boolean)isSys();
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
            String id;

            String status;

            String createBy;

            LocalDateTime createDate;

            String updateBy;

            LocalDateTime updateDate;

            String remarks;

            boolean remarksLoaded = false;

            String dictName;

            boolean dictNameLoaded = false;

            String dictType;

            boolean dictTypeLoaded = false;

            boolean sys;

            boolean sysLoaded = false;

            @Override
            public String id() {
                if (id == null) {
                    throw new UnloadedException(DictType.class, "id");
                }
                return id;
            }

            @Override
            public String status() {
                if (status == null) {
                    throw new UnloadedException(DictType.class, "status");
                }
                return status;
            }

            @Override
            public String createBy() {
                if (createBy == null) {
                    throw new UnloadedException(DictType.class, "createBy");
                }
                return createBy;
            }

            @Override
            public LocalDateTime createDate() {
                if (createDate == null) {
                    throw new UnloadedException(DictType.class, "createDate");
                }
                return createDate;
            }

            @Override
            public String updateBy() {
                if (updateBy == null) {
                    throw new UnloadedException(DictType.class, "updateBy");
                }
                return updateBy;
            }

            @Override
            public LocalDateTime updateDate() {
                if (updateDate == null) {
                    throw new UnloadedException(DictType.class, "updateDate");
                }
                return updateDate;
            }

            @Override
            public String remarks() {
                if (!remarksLoaded) {
                    throw new UnloadedException(DictType.class, "remarks");
                }
                return remarks;
            }

            @Override
            public String dictName() {
                if (!dictNameLoaded) {
                    throw new UnloadedException(DictType.class, "dictName");
                }
                return dictName;
            }

            @Override
            public String dictType() {
                if (!dictTypeLoaded) {
                    throw new UnloadedException(DictType.class, "dictType");
                }
                return dictType;
            }

            @Override
            @JsonIgnore
            public boolean isSys() {
                if (!sysLoaded) {
                    throw new UnloadedException(DictType.class, "sys");
                }
                return sys;
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
                    case 1: return id != null;
                    case 2: return status != null;
                    case 3: return createBy != null;
                    case 4: return createDate != null;
                    case 5: return updateBy != null;
                    case 6: return updateDate != null;
                    case 7: return remarksLoaded;
                    case 8: return dictNameLoaded;
                    case 9: return dictTypeLoaded;
                    case 10: return sysLoaded;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id": return id != null;
                    case "status": return status != null;
                    case "createBy": return createBy != null;
                    case "createDate": return createDate != null;
                    case "updateBy": return updateBy != null;
                    case "updateDate": return updateDate != null;
                    case "remarks": return remarksLoaded;
                    case "dictName": return dictNameLoaded;
                    case "dictType": return dictTypeLoaded;
                    case "sys": return sysLoaded;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public int hashCode() {
                int hash = 1;
                if (id != null) {
                    hash = 31 * hash + id.hashCode();
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
                if (dictNameLoaded && dictName != null) {
                    hash = 31 * hash + dictName.hashCode();
                }
                if (dictTypeLoaded && dictType != null) {
                    hash = 31 * hash + dictType.hashCode();
                }
                if (sysLoaded) {
                    hash = 31 * hash + Boolean.hashCode(sys);
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = 1;
                if (id != null) {
                    hash = 31 * hash + System.identityHashCode(id);
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
                if (dictNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(dictName);
                }
                if (dictTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(dictType);
                }
                if (sysLoaded) {
                    hash = 31 * hash + Boolean.hashCode(sys);
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
                boolean __idLoaded = id != null;
                if (__idLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__idLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(id, other.id());
                }
                boolean __statusLoaded = status != null;
                if (__statusLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__statusLoaded && !Objects.equals(status, other.status())) {
                    return false;
                }
                boolean __createByLoaded = createBy != null;
                if (__createByLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__createByLoaded && !Objects.equals(createBy, other.createBy())) {
                    return false;
                }
                boolean __createDateLoaded = createDate != null;
                if (__createDateLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__createDateLoaded && !Objects.equals(createDate, other.createDate())) {
                    return false;
                }
                boolean __updateByLoaded = updateBy != null;
                if (__updateByLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__updateByLoaded && !Objects.equals(updateBy, other.updateBy())) {
                    return false;
                }
                boolean __updateDateLoaded = updateDate != null;
                if (__updateDateLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__updateDateLoaded && !Objects.equals(updateDate, other.updateDate())) {
                    return false;
                }
                boolean __remarksLoaded = remarksLoaded;
                if (__remarksLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__remarksLoaded && !Objects.equals(remarks, other.remarks())) {
                    return false;
                }
                boolean __dictNameLoaded = dictNameLoaded;
                if (__dictNameLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__dictNameLoaded && !Objects.equals(dictName, other.dictName())) {
                    return false;
                }
                boolean __dictTypeLoaded = dictTypeLoaded;
                if (__dictTypeLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__dictTypeLoaded && !Objects.equals(dictType, other.dictType())) {
                    return false;
                }
                boolean __sysLoaded = sysLoaded;
                if (__sysLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__sysLoaded && sys != other.isSys()) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor other = (Implementor)obj;
                boolean __idLoaded = id != null;
                if (__idLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__idLoaded && id != other.id()) {
                    return false;
                }
                boolean __statusLoaded = status != null;
                if (__statusLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__statusLoaded && status != other.status()) {
                    return false;
                }
                boolean __createByLoaded = createBy != null;
                if (__createByLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__createByLoaded && createBy != other.createBy()) {
                    return false;
                }
                boolean __createDateLoaded = createDate != null;
                if (__createDateLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__createDateLoaded && createDate != other.createDate()) {
                    return false;
                }
                boolean __updateByLoaded = updateBy != null;
                if (__updateByLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__updateByLoaded && updateBy != other.updateBy()) {
                    return false;
                }
                boolean __updateDateLoaded = updateDate != null;
                if (__updateDateLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__updateDateLoaded && updateDate != other.updateDate()) {
                    return false;
                }
                boolean __remarksLoaded = remarksLoaded;
                if (__remarksLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__remarksLoaded && remarks != other.remarks()) {
                    return false;
                }
                boolean __dictNameLoaded = dictNameLoaded;
                if (__dictNameLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__dictNameLoaded && dictName != other.dictName()) {
                    return false;
                }
                boolean __dictTypeLoaded = dictTypeLoaded;
                if (__dictTypeLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__dictTypeLoaded && dictType != other.dictType()) {
                    return false;
                }
                boolean __sysLoaded = sysLoaded;
                if (__sysLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__sysLoaded && sys != other.isSys()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, DictTypeDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, DictType base) {
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
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public DictTypeDraft setId(String id) {
                if (id == null) {
                    throw new IllegalArgumentException(
                        "'id' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.id = id;
                return this;
            }

            @Override
            public String status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public DictTypeDraft setStatus(String status) {
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
            public DictTypeDraft setCreateBy(String createBy) {
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
            public DictTypeDraft setCreateDate(LocalDateTime createDate) {
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
            public DictTypeDraft setUpdateBy(String updateBy) {
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
            public DictTypeDraft setUpdateDate(LocalDateTime updateDate) {
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
            public DictTypeDraft setRemarks(String remarks) {
                Impl __tmpModified = __modified();
                __tmpModified.remarks = remarks;
                __tmpModified.remarksLoaded = true;
                return this;
            }

            @Override
            public String dictName() {
                return (__modified!= null ? __modified : __base).dictName();
            }

            @Override
            public DictTypeDraft setDictName(String dictName) {
                Impl __tmpModified = __modified();
                __tmpModified.dictName = dictName;
                __tmpModified.dictNameLoaded = true;
                return this;
            }

            @Override
            public String dictType() {
                return (__modified!= null ? __modified : __base).dictType();
            }

            @Override
            public DictTypeDraft setDictType(String dictType) {
                Impl __tmpModified = __modified();
                __tmpModified.dictType = dictType;
                __tmpModified.dictTypeLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public boolean isSys() {
                return (__modified!= null ? __modified : __base).isSys();
            }

            @Override
            public DictTypeDraft setSys(boolean sys) {
                Impl __tmpModified = __modified();
                __tmpModified.sys = sys;
                __tmpModified.sysLoaded = true;
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(int prop, Object value) {
                switch (prop) {
                    case 1: setId((String)value);break;
                    case 2: setStatus((String)value);break;
                    case 3: setCreateBy((String)value);break;
                    case 4: setCreateDate((LocalDateTime)value);break;
                    case 5: setUpdateBy((String)value);break;
                    case 6: setUpdateDate((LocalDateTime)value);break;
                    case 7: setRemarks((String)value);break;
                    case 8: setDictName((String)value);break;
                    case 9: setDictType((String)value);break;
                    case 10: 
                            if (value == null) throw new IllegalArgumentException("'sys' cannot be null");
                            setSys((Boolean)value);
                            break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id": setId((String)value);break;
                    case "status": setStatus((String)value);break;
                    case "createBy": setCreateBy((String)value);break;
                    case "createDate": setCreateDate((LocalDateTime)value);break;
                    case "updateBy": setUpdateBy((String)value);break;
                    case "updateDate": setUpdateDate((LocalDateTime)value);break;
                    case "remarks": setRemarks((String)value);break;
                    case "dictName": setDictName((String)value);break;
                    case "dictType": setDictType((String)value);break;
                    case "sys": 
                            if (value == null) throw new IllegalArgumentException("'sys' cannot be null");
                            setSys((Boolean)value);
                            break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public void __use(int prop) {
                switch (prop) {
                    default: throw new IllegalArgumentException(
                                "Illegal property id: \"" + 
                                prop + 
                                "\",it does not exists or is not non-abstract formula property" + 
                                "(Only non-abstract formula property can be used)"
                            );
                }
            }

            @Override
            public void __use(String prop) {
                switch (prop) {
                    default: throw new IllegalArgumentException(
                                "Illegal property name: \"" + 
                                prop + 
                                "\",it does not exists or is not non-abstract formula property" + 
                                "(Only non-abstract formula property can be used)"
                            );
                }
            }

            @Override
            public void __unload(int prop) {
                switch (prop) {
                    case 1: __modified().id = null;break;
                    case 2: __modified().status = null;break;
                    case 3: __modified().createBy = null;break;
                    case 4: __modified().createDate = null;break;
                    case 5: __modified().updateBy = null;break;
                    case 6: __modified().updateDate = null;break;
                    case 7: __modified().remarksLoaded = false;break;
                    case 8: __modified().dictNameLoaded = false;break;
                    case 9: __modified().dictTypeLoaded = false;break;
                    case 10: __modified().sysLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id": __modified().id = null;break;
                    case "status": __modified().status = null;break;
                    case "createBy": __modified().createBy = null;break;
                    case "createDate": __modified().createDate = null;break;
                    case "updateBy": __modified().updateBy = null;break;
                    case "updateDate": __modified().updateDate = null;break;
                    case "remarks": __modified().remarksLoaded = false;break;
                    case "dictName": __modified().dictNameLoaded = false;break;
                    case "dictType": __modified().dictTypeLoaded = false;break;
                    case "sys": __modified().sysLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
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
        private String id;

        private String status;

        private String createBy;

        private LocalDateTime createDate;

        private String updateBy;

        private LocalDateTime updateDate;

        private boolean remarksLoaded;

        private String remarks;

        private boolean dictNameLoaded;

        private String dictName;

        private boolean dictTypeLoaded;

        private String dictType;

        private boolean sysLoaded;

        private boolean sys;

        public MapStruct id(String id) {
            if (id != null) {
                this.id = id;
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

        public MapStruct dictName(String dictName) {
            this.dictNameLoaded = true;
            this.dictName = dictName;
            return this;
        }

        public MapStruct dictType(String dictType) {
            this.dictTypeLoaded = true;
            this.dictType = dictType;
            return this;
        }

        public MapStruct sys(boolean sys) {
            this.sysLoaded = true;
            this.sys = sys;
            return this;
        }

        public DictType build() {
            return DictTypeDraft.$.produce(draft -> {
                if (id != null) {
                    draft.setId(id);
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
                if (dictNameLoaded) {
                    draft.setDictName(dictName);
                }
                if (dictTypeLoaded) {
                    draft.setDictType(dictType);
                }
                if (sysLoaded) {
                    draft.setSys(sys);
                }
            });
        }
    }
}
