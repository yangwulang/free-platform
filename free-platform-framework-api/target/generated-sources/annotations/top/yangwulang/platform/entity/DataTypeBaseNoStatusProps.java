package top.yangwulang.platform.entity;

import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = DataTypeBaseNoStatus.class
)
@PropsFor(DataTypeBaseNoStatus.class)
public interface DataTypeBaseNoStatusProps extends TypeBaseProps {
    TypedProp.Scalar<DataTypeBaseNoStatus, String> ID = 
        TypedProp.scalar(ImmutableType.get(DataTypeBaseNoStatus.class).getProp("id"));

    TypedProp.Scalar<DataTypeBaseNoStatus, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(DataTypeBaseNoStatus.class).getProp("createBy"));

    TypedProp.Scalar<DataTypeBaseNoStatus, Date> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DataTypeBaseNoStatus.class).getProp("createDate"));

    TypedProp.Scalar<DataTypeBaseNoStatus, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(DataTypeBaseNoStatus.class).getProp("updateBy"));

    TypedProp.Scalar<DataTypeBaseNoStatus, Date> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DataTypeBaseNoStatus.class).getProp("updateDate"));

    TypedProp.Scalar<DataTypeBaseNoStatus, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(DataTypeBaseNoStatus.class).getProp("remarks"));

    PropExpression.Str createBy();

    PropExpression.Cmp<Date> createDate();

    PropExpression.Str updateBy();

    PropExpression.Cmp<Date> updateDate();

    PropExpression.Str remarks();
}
