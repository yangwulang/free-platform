package top.yangwulang.platform.entity.sys;

import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.Objects;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.Draft;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;

public interface TypeBaseDraft extends TypeBase, Draft {
    TypeBaseDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    TypeBaseDraft setId(String id);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                TypeBase.class,
                null,
                (ctx, base) -> new DraftImpl(ctx, (TypeBase)base)
            )
            .id(1, "id", String.class)
            .build();

        private Producer() {
        }

        public TypeBase produce(DraftConsumer<TypeBaseDraft> block) {
            return produce(null, block);
        }

        public TypeBase produce(TypeBase base, DraftConsumer<TypeBaseDraft> block) {
            return (TypeBase)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements TypeBase, ImmutableSpi {
            @Override
            public Object __get(int prop) {
                switch (prop) {
                    case 1: return id();
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public Object __get(String prop) {
                switch (prop) {
                    case "id": return id();
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

            @Override
            public String id() {
                if (id == null) {
                    throw new UnloadedException(TypeBase.class, "id");
                }
                return id;
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
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id": return id != null;
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
                return hash;
            }

            private int __shallowHashCode() {
                int hash = 1;
                if (id != null) {
                    hash = 31 * hash + System.identityHashCode(id);
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
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, TypeBaseDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, TypeBase base) {
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
            public TypeBaseDraft setId(String id) {
                if (id == null) {
                    throw new IllegalArgumentException(
                        "'id' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.id = id;
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(int prop, Object value) {
                switch (prop) {
                    case 1: setId((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id": setId((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(int prop) {
                switch (prop) {
                    case 1: __modified().id = null;break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id": __modified().id = null;break;
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
        private String id;

        public MapStruct id(String id) {
            if (id != null) {
                this.id = id;
            }
            return this;
        }

        public TypeBase build() {
            return TypeBaseDraft.$.produce(draft -> {
                if (id != null) {
                    draft.setId(id);
                }
            });
        }
    }
}
