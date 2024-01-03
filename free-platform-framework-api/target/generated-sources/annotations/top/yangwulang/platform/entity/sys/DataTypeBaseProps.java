package top.yangwulang.platform.entity.sys;

import java.lang.String;
import java.time.LocalDateTime;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = DataTypeBase.class
)
@PropsFor(DataTypeBase.class)
public interface DataTypeBaseProps extends TypeBaseProps {
    TypedProp.Scalar<DataTypeBase, String> ID = 
        TypedProp.scalar(ImmutableType.get(DataTypeBase.class).getProp("id"));

    TypedProp.Scalar<DataTypeBase, String> STATUS = 
        TypedProp.scalar(ImmutableType.get(DataTypeBase.class).getProp("status"));

    TypedProp.Scalar<DataTypeBase, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(DataTypeBase.class).getProp("createBy"));

    TypedProp.Scalar<DataTypeBase, LocalDateTime> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DataTypeBase.class).getProp("createDate"));

    TypedProp.Scalar<DataTypeBase, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(DataTypeBase.class).getProp("updateBy"));

    TypedProp.Scalar<DataTypeBase, LocalDateTime> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DataTypeBase.class).getProp("updateDate"));

    TypedProp.Scalar<DataTypeBase, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(DataTypeBase.class).getProp("remarks"));

    PropExpression.Str status();

    PropExpression.Str createBy();

    PropExpression.Cmp<LocalDateTime> createDate();

    PropExpression.Str updateBy();

    PropExpression.Cmp<LocalDateTime> updateDate();

    PropExpression.Str remarks();
}
