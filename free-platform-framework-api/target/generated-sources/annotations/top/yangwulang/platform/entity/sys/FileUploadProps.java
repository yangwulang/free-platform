package top.yangwulang.platform.entity.sys;

import java.lang.String;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.TypeBaseProps;

@GeneratedBy(
        type = FileUpload.class
)
@PropsFor(FileUpload.class)
public interface FileUploadProps extends TypeBaseProps {
    TypedProp.Scalar<FileUpload, String> ID = 
        TypedProp.scalar(ImmutableType.get(FileUpload.class).getProp("id"));

    TypedProp.Reference<FileUpload, FileEntity> FILE_ENTITY = 
        TypedProp.reference(ImmutableType.get(FileUpload.class).getProp("fileEntity"));

    TypedProp.Scalar<FileUpload, String> FILE_ENTITY_ID = 
        TypedProp.scalar(ImmutableType.get(FileUpload.class).getProp("fileEntityId"));

    TypedProp.Scalar<FileUpload, String> FILE_NAME = 
        TypedProp.scalar(ImmutableType.get(FileUpload.class).getProp("fileName"));

    TypedProp.Scalar<FileUpload, String> FILE_TYPE = 
        TypedProp.scalar(ImmutableType.get(FileUpload.class).getProp("fileType"));

    TypedProp.Scalar<FileUpload, String> BIZ_KEY = 
        TypedProp.scalar(ImmutableType.get(FileUpload.class).getProp("bizKey"));

    TypedProp.Scalar<FileUpload, String> BIZ_TYPE = 
        TypedProp.scalar(ImmutableType.get(FileUpload.class).getProp("bizType"));

    FileEntityTable fileEntity();

    FileEntityTable fileEntity(JoinType joinType);

    PropExpression.Str fileEntityId();

    PropExpression.Str fileName();

    PropExpression.Str fileType();

    PropExpression.Str bizKey();

    PropExpression.Str bizType();
}
