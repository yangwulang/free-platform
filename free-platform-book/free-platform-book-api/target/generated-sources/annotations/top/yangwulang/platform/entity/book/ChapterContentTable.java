package top.yangwulang.platform.entity.book;

import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

public class ChapterContentTable extends AbstractTypedTable<ChapterContent> implements ChapterContentProps {
    public static final ChapterContentTable $ = new ChapterContentTable();

    public ChapterContentTable() {
        super(ChapterContent.class);
    }

    public ChapterContentTable(
            AbstractTypedTable.DelayedOperation<ChapterContent> delayedOperation) {
        super(ChapterContent.class, delayedOperation);
    }

    public ChapterContentTable(TableImplementor<ChapterContent> table) {
        super(table);
    }

    protected ChapterContentTable(ChapterContentTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return get("id");
    }

    @Override
    public BookChapterTable chapter() {
        __beforeJoin();
        if (raw != null) {
            return new BookChapterTable(raw.joinImplementor("chapter"));
        }
        return new BookChapterTable(joinOperation("chapter"));
    }

    @Override
    public BookChapterTable chapter(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new BookChapterTable(raw.joinImplementor("chapter", joinType));
        }
        return new BookChapterTable(joinOperation("chapter", joinType));
    }

    @Override
    public PropExpression.Str chapterContent() {
        return get("chapterContent");
    }

    @Override
    public ChapterContentTableEx asTableEx() {
        return new ChapterContentTableEx(this, null);
    }

    @Override
    public ChapterContentTable __disableJoin(String reason) {
        return new ChapterContentTable(this, reason);
    }
}
