package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.DataTypeBaseProps;

@GeneratedBy(
        type = DictType.class
)
@PropsFor(DictType.class)
public interface DictTypeProps extends DataTypeBaseProps {
    TypedProp.Scalar<DictType, String> ID = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp("id"));

    TypedProp.Scalar<DictType, Integer> STATUS = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp("status"));

    TypedProp.Scalar<DictType, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp("createBy"));

    TypedProp.Scalar<DictType, Date> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp("createDate"));

    TypedProp.Scalar<DictType, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp("updateBy"));

    TypedProp.Scalar<DictType, Date> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp("updateDate"));

    TypedProp.Scalar<DictType, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp("remarks"));

    TypedProp.Scalar<DictType, String> DICT_NAME = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp("dictName"));

    TypedProp.Scalar<DictType, String> DICT_TYPE = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp("dictType"));

    TypedProp.Scalar<DictType, Boolean> IS_SYS = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp("isSys"));

    PropExpression.Str dictName();

    PropExpression.Str dictType();

    PropExpression.Cmp<Boolean> isSys();
}
