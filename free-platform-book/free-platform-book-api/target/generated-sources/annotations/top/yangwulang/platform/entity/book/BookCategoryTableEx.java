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

public class BookCategoryTableEx extends BookCategoryTable implements TableEx<BookCategory> {
    public static final BookCategoryTableEx $ = new BookCategoryTableEx(BookCategoryTable.$, null);

    public BookCategoryTableEx() {
        super();
    }

    public BookCategoryTableEx(AbstractTypedTable.DelayedOperation<BookCategory> delayedOperation) {
        super(delayedOperation);
    }

    public BookCategoryTableEx(TableImplementor<BookCategory> table) {
        super(table);
    }

    protected BookCategoryTableEx(BookCategoryTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public BookCategoryTableEx asTableEx() {
        return this;
    }

    @Override
    public BookCategoryTableEx __disableJoin(String reason) {
        return new BookCategoryTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<BookCategoryTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<BookCategoryTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
