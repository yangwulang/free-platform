package top.yangwulang.platform.entity;

import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = BaseEntity.class
)
@PropsFor(BaseEntity.class)
public interface BaseEntityProps extends Props {
    TypedProp.Scalar<BaseEntity, Integer> STATUS = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("status"));

    TypedProp.Scalar<BaseEntity, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("createBy"));

    TypedProp.Scalar<BaseEntity, Date> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("createDate"));

    TypedProp.Scalar<BaseEntity, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("updateBy"));

    TypedProp.Scalar<BaseEntity, Date> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("updateDate"));

    TypedProp.Scalar<BaseEntity, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("remarks"));

    PropExpression.Num<Integer> status();

    PropExpression.Str createBy();

    PropExpression.Cmp<Date> createDate();

    PropExpression.Str updateBy();

    PropExpression.Cmp<Date> updateDate();

    PropExpression.Str remarks();
}
