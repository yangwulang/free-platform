package top.yangwulang.platform.entity.sys;

import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.DataTypeBaseNoStatusProps;

@GeneratedBy(
        type = Config.class
)
@PropsFor(Config.class)
public interface ConfigProps extends DataTypeBaseNoStatusProps {
    TypedProp.Scalar<Config, String> ID = 
        TypedProp.scalar(ImmutableType.get(Config.class).getProp("id"));

    TypedProp.Scalar<Config, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(Config.class).getProp("createBy"));

    TypedProp.Scalar<Config, Date> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Config.class).getProp("createDate"));

    TypedProp.Scalar<Config, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(Config.class).getProp("updateBy"));

    TypedProp.Scalar<Config, Date> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Config.class).getProp("updateDate"));

    TypedProp.Scalar<Config, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(Config.class).getProp("remarks"));

    TypedProp.Scalar<Config, String> CONFIG_NAME = 
        TypedProp.scalar(ImmutableType.get(Config.class).getProp("configName"));

    TypedProp.Scalar<Config, String> CONFIG_KEY = 
        TypedProp.scalar(ImmutableType.get(Config.class).getProp("configKey"));

    TypedProp.Scalar<Config, String> CONFIG_VALUE = 
        TypedProp.scalar(ImmutableType.get(Config.class).getProp("configValue"));

    PropExpression.Str configName();

    PropExpression.Str configKey();

    PropExpression.Str configValue();
}
