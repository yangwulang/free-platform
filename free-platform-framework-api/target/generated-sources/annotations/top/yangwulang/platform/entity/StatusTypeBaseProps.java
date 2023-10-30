package top.yangwulang.platform.entity;

import java.lang.Integer;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = StatusTypeBase.class
)
@PropsFor(StatusTypeBase.class)
public interface StatusTypeBaseProps extends Props {
    TypedProp.Scalar<StatusTypeBase, Integer> STATUS = 
        TypedProp.scalar(ImmutableType.get(StatusTypeBase.class).getProp("status"));

    PropExpression.Num<Integer> status();
}
