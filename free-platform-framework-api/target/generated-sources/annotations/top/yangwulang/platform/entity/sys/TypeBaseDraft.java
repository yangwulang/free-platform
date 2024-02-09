package top.yangwulang.platform.entity.sys;

import java.lang.String;
import java.util.Collections;
import org.babyfish.jimmer.Draft;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutableType;

@GeneratedBy(
        type = TypeBase.class
)
public interface TypeBaseDraft extends TypeBase, Draft {
    TypeBaseDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    TypeBaseDraft setId(String id);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.93",
                TypeBase.class,
                Collections.emptyList(),
                null
            )
            .id(-1, "id", String.class)
            .build();

        private Producer() {
        }
    }
}
