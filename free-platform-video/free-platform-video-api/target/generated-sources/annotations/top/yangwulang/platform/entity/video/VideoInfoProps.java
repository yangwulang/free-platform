package top.yangwulang.platform.entity.video;

import java.lang.String;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(VideoInfo.class)
public interface VideoInfoProps extends Props {
    TypedProp.Scalar<VideoInfo, String> ID = 
        TypedProp.scalar(ImmutableType.get(VideoInfo.class).getProp(1));

    TypedProp.Reference<VideoInfo, VideoCategory> CATEGORY = 
        TypedProp.reference(ImmutableType.get(VideoInfo.class).getProp(2));

    TypedProp.Scalar<VideoInfo, String> PLAY_URL = 
        TypedProp.scalar(ImmutableType.get(VideoInfo.class).getProp(3));

    TypedProp.Scalar<VideoInfo, String> IMG_SRC = 
        TypedProp.scalar(ImmutableType.get(VideoInfo.class).getProp(4));

    TypedProp.Scalar<VideoInfo, String> DESC = 
        TypedProp.scalar(ImmutableType.get(VideoInfo.class).getProp(5));

    TypedProp.Scalar<VideoInfo, String> PATH = 
        TypedProp.scalar(ImmutableType.get(VideoInfo.class).getProp(6));

    PropExpression.Str id();

    VideoCategoryTable category();

    VideoCategoryTable category(JoinType joinType);

    PropExpression.Str playUrl();

    PropExpression.Str imgSrc();

    PropExpression.Str desc();

    PropExpression.Str path();
}
