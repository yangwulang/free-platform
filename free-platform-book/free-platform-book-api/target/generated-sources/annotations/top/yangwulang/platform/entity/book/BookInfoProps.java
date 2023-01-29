package top.yangwulang.platform.entity.book;

import java.lang.String;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(BookInfo.class)
public interface BookInfoProps extends Props {
    TypedProp.Scalar<BookInfo, String> ID = 
        TypedProp.scalar(ImmutableType.get(BookInfo.class).getProp(1));

    TypedProp.Scalar<BookInfo, String> BOOK_NAME = 
        TypedProp.scalar(ImmutableType.get(BookInfo.class).getProp(2));

    TypedProp.Scalar<BookInfo, String> AUTHOR = 
        TypedProp.scalar(ImmutableType.get(BookInfo.class).getProp(3));

    TypedProp.Scalar<BookInfo, String> DESCRIBE = 
        TypedProp.scalar(ImmutableType.get(BookInfo.class).getProp(4));

    TypedProp.Scalar<BookInfo, String> STATUS = 
        TypedProp.scalar(ImmutableType.get(BookInfo.class).getProp(5));

    TypedProp.Scalar<BookInfo, String> BOOK_IMG_PATH = 
        TypedProp.scalar(ImmutableType.get(BookInfo.class).getProp(6));

    TypedProp.Scalar<BookInfo, String> CATEGORY = 
        TypedProp.scalar(ImmutableType.get(BookInfo.class).getProp(7));

    TypedProp.Scalar<BookInfo, String> BOOK_FROM = 
        TypedProp.scalar(ImmutableType.get(BookInfo.class).getProp(8));

    TypedProp.ReferenceList<BookInfo, BookChapter> CHAPTERS = 
        TypedProp.referenceList(ImmutableType.get(BookInfo.class).getProp(9));

    PropExpression.Str id();

    PropExpression.Str bookName();

    PropExpression.Str author();

    PropExpression.Str describe();

    PropExpression.Str status();

    PropExpression.Str bookImgPath();

    PropExpression.Str category();

    PropExpression.Str bookFrom();
}
