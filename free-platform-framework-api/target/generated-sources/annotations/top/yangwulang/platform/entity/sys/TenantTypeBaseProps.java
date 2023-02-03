package top.yangwulang.platform.entity.sys;

import java.lang.String;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(TenantTypeBase.class)
public interface TenantTypeBaseProps extends Props {
    TypedProp.Scalar<TenantTypeBase, String> TENANT = 
        TypedProp.scalar(ImmutableType.get(TenantTypeBase.class).getProp(1));

    PropExpression.Str tenant();
}
