package top.yangwulang.platform.entity.book;

import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

public class BookChapterTable extends AbstractTypedTable<BookChapter> implements BookChapterProps {
    public static final BookChapterTable $ = new BookChapterTable();

    public BookChapterTable() {
        super(BookChapter.class);
    }

    public BookChapterTable(AbstractTypedTable.DelayedOperation<BookChapter> delayedOperation) {
        super(BookChapter.class, delayedOperation);
    }

    public BookChapterTable(TableImplementor<BookChapter> table) {
        super(table);
    }

    protected BookChapterTable(BookChapterTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return get("id");
    }

    @Override
    public PropExpression.Str chapterTitle() {
        return get("chapterTitle");
    }

    @Override
    public BookInfoTable book() {
        __beforeJoin();
        if (raw != null) {
            return new BookInfoTable(raw.joinImplementor("book"));
        }
        return new BookInfoTable(joinOperation("book"));
    }

    @Override
    public BookInfoTable book(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new BookInfoTable(raw.joinImplementor("book", joinType));
        }
        return new BookInfoTable(joinOperation("book", joinType));
    }

    @Override
    public PropExpression.Str fromPath() {
        return get("fromPath");
    }

    @Override
    public BookChapterTableEx asTableEx() {
        return new BookChapterTableEx(this, null);
    }

    @Override
    public BookChapterTable __disableJoin(String reason) {
        return new BookChapterTable(this, reason);
    }
}
