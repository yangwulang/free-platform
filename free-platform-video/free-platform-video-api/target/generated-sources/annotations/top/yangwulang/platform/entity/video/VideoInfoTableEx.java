package top.yangwulang.platform.entity.video;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

public class VideoInfoTableEx extends VideoInfoTable implements TableEx<VideoInfo> {
    public static final VideoInfoTableEx $ = new VideoInfoTableEx(VideoInfoTable.$, null);

    public VideoInfoTableEx() {
        super();
    }

    public VideoInfoTableEx(AbstractTypedTable.DelayedOperation<VideoInfo> delayedOperation) {
        super(delayedOperation);
    }

    public VideoInfoTableEx(TableImplementor<VideoInfo> table) {
        super(table);
    }

    protected VideoInfoTableEx(VideoInfoTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public VideoInfoTableEx asTableEx() {
        return this;
    }

    @Override
    public VideoInfoTableEx __disableJoin(String reason) {
        return new VideoInfoTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<VideoInfoTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<VideoInfoTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
