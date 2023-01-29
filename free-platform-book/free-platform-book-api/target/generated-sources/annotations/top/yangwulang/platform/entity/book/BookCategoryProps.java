package top.yangwulang.platform.entity.book;

import java.lang.String;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(BookCategory.class)
public interface BookCategoryProps extends Props {
    TypedProp.Scalar<BookCategory, String> ID = 
        TypedProp.scalar(ImmutableType.get(BookCategory.class).getProp(1));

    TypedProp.Scalar<BookCategory, String> CATEGORY_NAME = 
        TypedProp.scalar(ImmutableType.get(BookCategory.class).getProp(2));

    PropExpression.Str id();

    PropExpression.Str categoryName();
}
