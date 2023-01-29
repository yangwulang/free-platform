package top.yangwulang.platform.entity.book;

import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

public class BookCategoryTable extends AbstractTypedTable<BookCategory> implements BookCategoryProps {
    public static final BookCategoryTable $ = new BookCategoryTable();

    public BookCategoryTable() {
        super(BookCategory.class);
    }

    public BookCategoryTable(AbstractTypedTable.DelayedOperation<BookCategory> delayedOperation) {
        super(BookCategory.class, delayedOperation);
    }

    public BookCategoryTable(TableImplementor<BookCategory> table) {
        super(table);
    }

    protected BookCategoryTable(BookCategoryTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return get("id");
    }

    @Override
    public PropExpression.Str categoryName() {
        return get("categoryName");
    }

    @Override
    public BookCategoryTableEx asTableEx() {
        return new BookCategoryTableEx(this, null);
    }

    @Override
    public BookCategoryTable __disableJoin(String reason) {
        return new BookCategoryTable(this, reason);
    }
}
