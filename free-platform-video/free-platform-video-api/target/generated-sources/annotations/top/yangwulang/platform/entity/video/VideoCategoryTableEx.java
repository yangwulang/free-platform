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

public class VideoCategoryTableEx extends VideoCategoryTable implements TableEx<VideoCategory> {
    public static final VideoCategoryTableEx $ = new VideoCategoryTableEx(VideoCategoryTable.$, null);

    public VideoCategoryTableEx() {
        super();
    }

    public VideoCategoryTableEx(
            AbstractTypedTable.DelayedOperation<VideoCategory> delayedOperation) {
        super(delayedOperation);
    }

    public VideoCategoryTableEx(TableImplementor<VideoCategory> table) {
        super(table);
    }

    protected VideoCategoryTableEx(VideoCategoryTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public VideoCategoryTableEx asTableEx() {
        return this;
    }

    @Override
    public VideoCategoryTableEx __disableJoin(String reason) {
        return new VideoCategoryTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<VideoCategoryTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<VideoCategoryTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
