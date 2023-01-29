package top.yangwulang.platform.entity.book;

import java.lang.String;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(ChapterContent.class)
public interface ChapterContentProps extends Props {
    TypedProp.Scalar<ChapterContent, String> ID = 
        TypedProp.scalar(ImmutableType.get(ChapterContent.class).getProp(1));

    TypedProp.Reference<ChapterContent, BookChapter> CHAPTER = 
        TypedProp.reference(ImmutableType.get(ChapterContent.class).getProp(2));

    TypedProp.Scalar<ChapterContent, String> CHAPTER_CONTENT = 
        TypedProp.scalar(ImmutableType.get(ChapterContent.class).getProp(3));

    PropExpression.Str id();

    BookChapterTable chapter();

    BookChapterTable chapter(JoinType joinType);

    PropExpression.Str chapterContent();
}
