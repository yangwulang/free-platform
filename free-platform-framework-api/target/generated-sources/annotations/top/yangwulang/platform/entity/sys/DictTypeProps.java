package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDateTime;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(DictType.class)
public interface DictTypeProps extends DataTypeBaseProps {
    TypedProp.Scalar<DictType, String> DICT_NAME = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp(8));

    TypedProp.Scalar<DictType, String> DICT_TYPE = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp(9));

    TypedProp.Scalar<DictType, Boolean> SYS = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp(10));

    TypedProp.Scalar<DictType, String> ID = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp(1));

    TypedProp.Scalar<DictType, String> STATUS = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp(2));

    TypedProp.Scalar<DictType, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp(3));

    TypedProp.Scalar<DictType, LocalDateTime> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp(4));

    TypedProp.Scalar<DictType, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp(5));

    TypedProp.Scalar<DictType, LocalDateTime> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp(6));

    TypedProp.Scalar<DictType, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(DictType.class).getProp(7));

    PropExpression.Str dictName();

    PropExpression.Str dictType();

    PropExpression<Boolean> sys();
}
