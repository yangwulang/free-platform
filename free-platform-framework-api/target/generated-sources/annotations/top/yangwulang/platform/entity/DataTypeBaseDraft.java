package top.yangwulang.platform.entity;

import java.lang.String;
import java.util.Arrays;
import java.util.Date;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;

@GeneratedBy(
        type = DataTypeBase.class
)
public interface DataTypeBaseDraft extends DataTypeBase, TypeBaseDraft, StatusTypeBaseDraft {
    DataTypeBaseDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    DataTypeBaseDraft setId(String id);

    @OldChain
    DataTypeBaseDraft setStatus(int status);

    @OldChain
    DataTypeBaseDraft setCreateBy(String createBy);

    @OldChain
    DataTypeBaseDraft setCreateDate(Date createDate);

    @OldChain
    DataTypeBaseDraft setUpdateBy(String updateBy);

    @OldChain
    DataTypeBaseDraft setUpdateDate(Date updateDate);

    @OldChain
    DataTypeBaseDraft setRemarks(String remarks);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.35",
                DataTypeBase.class,
                Arrays.asList(
                    TypeBaseDraft.Producer.TYPE,
                    StatusTypeBaseDraft.Producer.TYPE
                )
                ,null
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
