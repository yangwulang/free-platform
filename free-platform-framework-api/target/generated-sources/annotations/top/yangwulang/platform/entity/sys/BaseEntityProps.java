package top.yangwulang.platform.entity.sys;

import java.lang.String;
import java.time.LocalDateTime;
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
    TypedProp.Scalar<BaseEntity, String> STATUS = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("status"));

    TypedProp.Scalar<BaseEntity, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("createBy"));

    TypedProp.Scalar<BaseEntity, LocalDateTime> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("createDate"));

    TypedProp.Scalar<BaseEntity, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("updateBy"));

    TypedProp.Scalar<BaseEntity, LocalDateTime> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("updateDate"));

    TypedProp.Scalar<BaseEntity, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(BaseEntity.class).getProp("remarks"));

    PropExpression.Str status();

    PropExpression.Str createBy();

    PropExpression.Cmp<LocalDateTime> createDate();

    PropExpression.Str updateBy();

    PropExpression.Cmp<LocalDateTime> updateDate();

    PropExpression.Str remarks();
}
