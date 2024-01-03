package top.yangwulang.platform.entity;

import java.lang.String;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = TypeBase.class
)
@PropsFor(TypeBase.class)
public interface TypeBaseProps extends Props {
    TypedProp.Scalar<TypeBase, String> ID = 
        TypedProp.scalar(ImmutableType.get(TypeBase.class).getProp("id"));

    PropExpression.Str id();
}
