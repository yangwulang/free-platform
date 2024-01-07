package top.yangwulang.platform.entity.sys;

import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collections;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;

@GeneratedBy(
        type = DataTypeBase.class
)
public interface DataTypeBaseDraft extends DataTypeBase, TypeBaseDraft {
    DataTypeBaseDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    DataTypeBaseDraft setId(String id);

    @OldChain
    DataTypeBaseDraft setStatus(String status);

    @OldChain
    DataTypeBaseDraft setCreateBy(String createBy);

    @OldChain
    DataTypeBaseDraft setCreateDate(LocalDateTime createDate);

    @OldChain
    DataTypeBaseDraft setUpdateBy(String updateBy);

    @OldChain
    DataTypeBaseDraft setUpdateDate(LocalDateTime updateDate);

    @OldChain
    DataTypeBaseDraft setRemarks(String remarks);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.69",
                DataTypeBase.class,
                Collections.singleton(TypeBaseDraft.Producer.TYPE),
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
