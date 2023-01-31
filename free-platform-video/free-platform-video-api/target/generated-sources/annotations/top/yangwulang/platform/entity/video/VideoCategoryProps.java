package top.yangwulang.platform.entity.video;

import java.lang.String;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(VideoCategory.class)
public interface VideoCategoryProps extends Props {
    TypedProp.Scalar<VideoCategory, String> ID = 
        TypedProp.scalar(ImmutableType.get(VideoCategory.class).getProp(1));

    TypedProp.Scalar<VideoCategory, String> CATEGORY_NAME = 
        TypedProp.scalar(ImmutableType.get(VideoCategory.class).getProp(2));

    PropExpression.Str id();

    PropExpression.Str categoryName();
}
