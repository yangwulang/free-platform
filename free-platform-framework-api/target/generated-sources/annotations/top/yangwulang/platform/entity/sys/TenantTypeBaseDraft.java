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
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;

public interface TenantTypeBaseDraft extends TenantTypeBase, Draft {
    TenantTypeBaseDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    TenantTypeBaseDraft setTenant(String tenant);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                TenantTypeBase.class,
                null,
                (ctx, base) -> new DraftImpl(ctx, (TenantTypeBase)base)
            )
            .add(1, "tenant", ImmutablePropCategory.SCALAR, String.class, false)
            .build();

        private Producer() {
        }

        public TenantTypeBase produce(DraftConsumer<TenantTypeBaseDraft> block) {
            return produce(null, block);
        }

        public TenantTypeBase produce(TenantTypeBase base,
                DraftConsumer<TenantTypeBaseDraft> block) {
            return (TenantTypeBase)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements TenantTypeBase, ImmutableSpi {
            @Override
            public Object __get(int prop) {
                switch (prop) {
                    case 1: return tenant();
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public Object __get(String prop) {
                switch (prop) {
                    case "tenant": return tenant();
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
            String tenant;

            @Override
            public String tenant() {
                if (tenant == null) {
                    throw new UnloadedException(TenantTypeBase.class, "tenant");
                }
                return tenant;
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
                    case 1: return tenant != null;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "tenant": return tenant != null;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public int hashCode() {
                int hash = 1;
                if (tenant != null) {
                    hash = 31 * hash + tenant.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = 1;
                if (tenant != null) {
                    hash = 31 * hash + System.identityHashCode(tenant);
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
                boolean __tenantLoaded = tenant != null;
                if (__tenantLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__tenantLoaded && !Objects.equals(tenant, other.tenant())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor other = (Implementor)obj;
                boolean __tenantLoaded = tenant != null;
                if (__tenantLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__tenantLoaded && tenant != other.tenant()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, TenantTypeBaseDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, TenantTypeBase base) {
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
            public String tenant() {
                return (__modified!= null ? __modified : __base).tenant();
            }

            @Override
            public TenantTypeBaseDraft setTenant(String tenant) {
                if (tenant == null) {
                    throw new IllegalArgumentException(
                        "'tenant' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.tenant = tenant;
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(int prop, Object value) {
                switch (prop) {
                    case 1: setTenant((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "tenant": setTenant((String)value);break;
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
                    case 1: __modified().tenant = null;break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "tenant": __modified().tenant = null;break;
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
        private String tenant;

        public MapStruct tenant(String tenant) {
            if (tenant != null) {
                this.tenant = tenant;
            }
            return this;
        }

        public TenantTypeBase build() {
            return TenantTypeBaseDraft.$.produce(draft -> {
                if (tenant != null) {
                    draft.setTenant(tenant);
                }
            });
        }
    }
}
