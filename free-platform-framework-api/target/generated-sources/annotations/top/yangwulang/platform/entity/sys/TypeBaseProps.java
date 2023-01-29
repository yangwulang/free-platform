package top.yangwulang.platform.entity.sys;

import java.lang.String;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(TypeBase.class)
public interface TypeBaseProps extends Props {
    TypedProp.Scalar<TypeBase, String> ID = 
        TypedProp.scalar(ImmutableType.get(TypeBase.class).getProp(1));

    PropExpression.Str id();
}
