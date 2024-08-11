package top.yangwulang.platform.entity;

import java.util.Collections;
import org.babyfish.jimmer.Draft;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutableType;

@GeneratedBy(
        type = StatusTypeBase.class
)
public interface StatusTypeBaseDraft extends StatusTypeBase, Draft {
    StatusTypeBaseDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    StatusTypeBaseDraft setStatus(int status);

    @GeneratedBy(
            type = StatusTypeBase.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.150",
                StatusTypeBase.class,
                Collections.emptyList(),
                null
            )
            .logicalDeleted(-1, "status", int.class, false)
            .build();

        private Producer() {
        }
    }
}
