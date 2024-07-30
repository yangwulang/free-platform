package top.yangwulang.platform.entity;

import java.lang.String;
import java.util.Collections;
import java.util.Date;
import org.babyfish.jimmer.Draft;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;

@GeneratedBy(
        type = BaseEntity.class
)
public interface BaseEntityDraft extends BaseEntity, Draft {
    BaseEntityDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    BaseEntityDraft setStatus(int status);

    @OldChain
    BaseEntityDraft setCreateBy(String createBy);

    @OldChain
    BaseEntityDraft setCreateDate(Date createDate);

    @OldChain
    BaseEntityDraft setUpdateBy(String updateBy);

    @OldChain
    BaseEntityDraft setUpdateDate(Date updateDate);

    @OldChain
    BaseEntityDraft setRemarks(String remarks);

    @GeneratedBy(
            type = BaseEntity.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.149",
                BaseEntity.class,
                Collections.emptyList(),
                null
            )
            .logicalDeleted(-1, "status", int.class, false)
            .add(-1, "createBy", ImmutablePropCategory.SCALAR, String.class, false)
            .add(-1, "createDate", ImmutablePropCategory.SCALAR, Date.class, false)
            .add(-1, "updateBy", ImmutablePropCategory.SCALAR, String.class, false)
            .add(-1, "updateDate", ImmutablePropCategory.SCALAR, Date.class, false)
            .add(-1, "remarks", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }
    }
}
