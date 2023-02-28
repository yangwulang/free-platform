package top.yangwulang.platform.entity.book;

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

public class ChapterContentTableEx extends ChapterContentTable implements TableEx<ChapterContent> {
    public static final ChapterContentTableEx $ = new ChapterContentTableEx(ChapterContentTable.$, null);

    public ChapterContentTableEx() {
        super();
    }

    public ChapterContentTableEx(
            AbstractTypedTable.DelayedOperation<ChapterContent> delayedOperation) {
        super(delayedOperation);
    }

    public ChapterContentTableEx(TableImplementor<ChapterContent> table) {
        super(table);
    }

    protected ChapterContentTableEx(ChapterContentTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public BookChapterTableEx chapter() {
        __beforeJoin();
        if (raw != null) {
            return new BookChapterTableEx(raw.joinImplementor("chapter"));
        }
        return new BookChapterTableEx(joinOperation("chapter"));
    }

    public BookChapterTableEx chapter(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new BookChapterTableEx(raw.joinImplementor("chapter", joinType));
        }
        return new BookChapterTableEx(joinOperation("chapter", joinType));
    }

    @Override
    public ChapterContentTableEx asTableEx() {
        return this;
    }

    @Override
    public ChapterContentTableEx __disableJoin(String reason) {
        return new ChapterContentTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<ChapterContentTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<ChapterContentTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
