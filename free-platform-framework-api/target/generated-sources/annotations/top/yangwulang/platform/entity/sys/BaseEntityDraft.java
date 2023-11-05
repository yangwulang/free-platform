package top.yangwulang.platform.entity.sys;

import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collections;
import org.babyfish.jimmer.Draft;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;

@GeneratedBy(
        type = BaseEntity.class
)
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
                "0.8.35",
                BaseEntity.class,
                Collections.emptyList(),
                null
            )
            .add(-1, "status", ImmutablePropCategory.SCALAR, String.class, false)
            .add(-1, "createBy", ImmutablePropCategory.SCALAR, String.class, false)
            .add(-1, "createDate", ImmutablePropCategory.SCALAR, LocalDateTime.class, false)
            .add(-1, "updateBy", ImmutablePropCategory.SCALAR, String.class, false)
            .add(-1, "updateDate", ImmutablePropCategory.SCALAR, LocalDateTime.class, false)
            .add(-1, "remarks", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }
    }
}
