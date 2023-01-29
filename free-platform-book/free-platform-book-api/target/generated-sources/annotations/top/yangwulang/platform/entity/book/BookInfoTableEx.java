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

public class BookInfoTableEx extends BookInfoTable implements TableEx<BookInfo> {
    public static final BookInfoTableEx $ = new BookInfoTableEx(BookInfoTable.$, null);

    public BookInfoTableEx() {
        super();
    }

    public BookInfoTableEx(AbstractTypedTable.DelayedOperation<BookInfo> delayedOperation) {
        super(delayedOperation);
    }

    public BookInfoTableEx(TableImplementor<BookInfo> table) {
        super(table);
    }

    protected BookInfoTableEx(BookInfoTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public BookChapterTableEx chapters() {
        __beforeJoin();
        if (raw != null) {
            return new BookChapterTableEx(raw.joinImplementor("chapters"));
        }
        return new BookChapterTableEx(joinOperation("chapters"));
    }

    public BookChapterTableEx chapters(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new BookChapterTableEx(raw.joinImplementor("chapters", joinType));
        }
        return new BookChapterTableEx(joinOperation("chapters", joinType));
    }

    @Override
    public BookInfoTableEx asTableEx() {
        return this;
    }

    @Override
    public BookInfoTableEx __disableJoin(String reason) {
        return new BookInfoTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<BookInfoTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<BookInfoTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
