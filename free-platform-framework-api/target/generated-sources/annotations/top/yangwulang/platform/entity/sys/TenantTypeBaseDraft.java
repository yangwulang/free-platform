package top.yangwulang.platform.entity.sys;

import java.lang.String;
import java.util.Collections;
import org.babyfish.jimmer.Draft;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;

@GeneratedBy(
        type = TenantTypeBase.class
)
public interface TenantTypeBaseDraft extends TenantTypeBase, Draft {
    TenantTypeBaseDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    TenantTypeBaseDraft setTenant(String tenant);

    @GeneratedBy(
            type = TenantTypeBase.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.184",
                TenantTypeBase.class,
                Collections.emptyList(),
                null
            )
            .add(-1, "tenant", ImmutablePropCategory.SCALAR, String.class, false)
            .build();

        private Producer() {
        }
    }
}
