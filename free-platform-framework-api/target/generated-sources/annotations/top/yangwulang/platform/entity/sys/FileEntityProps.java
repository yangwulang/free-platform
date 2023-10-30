package top.yangwulang.platform.entity.sys;

import java.lang.String;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.TypeBaseProps;

@GeneratedBy(
        type = FileEntity.class
)
@PropsFor(FileEntity.class)
public interface FileEntityProps extends TypeBaseProps {
    TypedProp.Scalar<FileEntity, String> ID = 
        TypedProp.scalar(ImmutableType.get(FileEntity.class).getProp("id"));

    TypedProp.Scalar<FileEntity, String> FILE_MD5 = 
        TypedProp.scalar(ImmutableType.get(FileEntity.class).getProp("fileMd5"));

    TypedProp.Scalar<FileEntity, String> FILE_PATH = 
        TypedProp.scalar(ImmutableType.get(FileEntity.class).getProp("filePath"));

    TypedProp.Scalar<FileEntity, String> FILE_CONTENT_TYPE = 
        TypedProp.scalar(ImmutableType.get(FileEntity.class).getProp("fileContentType"));

    TypedProp.Scalar<FileEntity, String> FILE_META = 
        TypedProp.scalar(ImmutableType.get(FileEntity.class).getProp("fileMeta"));

    PropExpression.Str fileMd5();

    PropExpression.Str filePath();

    PropExpression.Str fileContentType();

    PropExpression.Str fileMeta();
}
