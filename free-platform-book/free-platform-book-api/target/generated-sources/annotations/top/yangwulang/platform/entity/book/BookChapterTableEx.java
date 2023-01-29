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

public class BookChapterTableEx extends BookChapterTable implements TableEx<BookChapter> {
    public static final BookChapterTableEx $ = new BookChapterTableEx(BookChapterTable.$, null);

    public BookChapterTableEx() {
        super();
    }

    public BookChapterTableEx(AbstractTypedTable.DelayedOperation<BookChapter> delayedOperation) {
        super(delayedOperation);
    }

    public BookChapterTableEx(TableImplementor<BookChapter> table) {
        super(table);
    }

    protected BookChapterTableEx(BookChapterTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public BookChapterTableEx asTableEx() {
        return this;
    }

    @Override
    public BookChapterTableEx __disableJoin(String reason) {
        return new BookChapterTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<BookChapterTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<BookChapterTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
