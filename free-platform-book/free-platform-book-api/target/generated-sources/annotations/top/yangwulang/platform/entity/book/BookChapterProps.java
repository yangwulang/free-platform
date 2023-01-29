package top.yangwulang.platform.entity.book;

import java.lang.String;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(BookChapter.class)
public interface BookChapterProps extends Props {
    TypedProp.Scalar<BookChapter, String> ID = 
        TypedProp.scalar(ImmutableType.get(BookChapter.class).getProp(1));

    TypedProp.Scalar<BookChapter, String> CHAPTER_TITLE = 
        TypedProp.scalar(ImmutableType.get(BookChapter.class).getProp(2));

    TypedProp.Reference<BookChapter, BookInfo> BOOK = 
        TypedProp.reference(ImmutableType.get(BookChapter.class).getProp(3));

    TypedProp.Scalar<BookChapter, String> FROM_PATH = 
        TypedProp.scalar(ImmutableType.get(BookChapter.class).getProp(4));

    PropExpression.Str id();

    PropExpression.Str chapterTitle();

    BookInfoTable book();

    BookInfoTable book(JoinType joinType);

    PropExpression.Str fromPath();
}
