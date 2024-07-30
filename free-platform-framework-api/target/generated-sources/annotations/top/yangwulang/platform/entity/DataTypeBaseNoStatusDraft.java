package top.yangwulang.platform.entity;

import java.lang.String;
import java.util.Collections;
import java.util.Date;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;

@GeneratedBy(
        type = DataTypeBaseNoStatus.class
)
public interface DataTypeBaseNoStatusDraft extends DataTypeBaseNoStatus, TypeBaseDraft {
    DataTypeBaseNoStatusDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    DataTypeBaseNoStatusDraft setId(String id);

    @OldChain
    DataTypeBaseNoStatusDraft setCreateBy(String createBy);

    @OldChain
    DataTypeBaseNoStatusDraft setCreateDate(Date createDate);

    @OldChain
    DataTypeBaseNoStatusDraft setUpdateBy(String updateBy);

    @OldChain
    DataTypeBaseNoStatusDraft setUpdateDate(Date updateDate);

    @OldChain
    DataTypeBaseNoStatusDraft setRemarks(String remarks);

    @GeneratedBy(
            type = DataTypeBaseNoStatus.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.149",
                DataTypeBaseNoStatus.class,
                Collections.singleton(TypeBaseDraft.Producer.TYPE),
                null
            )
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
