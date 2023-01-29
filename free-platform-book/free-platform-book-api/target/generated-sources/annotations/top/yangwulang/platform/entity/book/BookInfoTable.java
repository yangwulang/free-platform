package top.yangwulang.platform.entity.book;

import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

public class BookInfoTable extends AbstractTypedTable<BookInfo> implements BookInfoProps {
    public static final BookInfoTable $ = new BookInfoTable();

    public BookInfoTable() {
        super(BookInfo.class);
    }

    public BookInfoTable(AbstractTypedTable.DelayedOperation<BookInfo> delayedOperation) {
        super(BookInfo.class, delayedOperation);
    }

    public BookInfoTable(TableImplementor<BookInfo> table) {
        super(table);
    }

    protected BookInfoTable(BookInfoTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return get("id");
    }

    @Override
    public PropExpression.Str bookName() {
        return get("bookName");
    }

    @Override
    public PropExpression.Str author() {
        return get("author");
    }

    @Override
    public PropExpression.Str describe() {
        return get("describe");
    }

    @Override
    public PropExpression.Str status() {
        return get("status");
    }

    @Override
    public PropExpression.Str bookImgPath() {
        return get("bookImgPath");
    }

    @Override
    public PropExpression.Str category() {
        return get("category");
    }

    @Override
    public PropExpression.Str bookFrom() {
        return get("bookFrom");
    }

    @Override
    public BookInfoTableEx asTableEx() {
        return new BookInfoTableEx(this, null);
    }

    @Override
    public BookInfoTable __disableJoin(String reason) {
        return new BookInfoTable(this, reason);
    }
}
