package top.yangwulang.platform.entity.sys;

import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.TypeBaseProps;

@GeneratedBy(
        type = OptionAnalysis.class
)
@PropsFor(OptionAnalysis.class)
public interface OptionAnalysisProps extends TypeBaseProps {
    TypedProp.Scalar<OptionAnalysis, String> ID = 
        TypedProp.scalar(ImmutableType.get(OptionAnalysis.class).getProp("id"));

    TypedProp.Scalar<OptionAnalysis, String> EVENT_NAME = 
        TypedProp.scalar(ImmutableType.get(OptionAnalysis.class).getProp("eventName"));

    TypedProp.Scalar<OptionAnalysis, String> EVENT_CODE = 
        TypedProp.scalar(ImmutableType.get(OptionAnalysis.class).getProp("eventCode"));

    TypedProp.Reference<OptionAnalysis, User> OPTION_USER = 
        TypedProp.reference(ImmutableType.get(OptionAnalysis.class).getProp("optionUser"));

    TypedProp.Scalar<OptionAnalysis, String> IP_ADDRESS = 
        TypedProp.scalar(ImmutableType.get(OptionAnalysis.class).getProp("ipAddress"));

    TypedProp.Scalar<OptionAnalysis, Date> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(OptionAnalysis.class).getProp("createDate"));

    TypedProp.Scalar<OptionAnalysis, String> META = 
        TypedProp.scalar(ImmutableType.get(OptionAnalysis.class).getProp("meta"));

    PropExpression.Str eventName();

    PropExpression.Str eventCode();

    UserTable optionUser();

    UserTable optionUser(JoinType joinType);

    PropExpression.Str optionUserId();

    PropExpression.Str ipAddress();

    PropExpression.Cmp<Date> createDate();

    PropExpression.Str meta();
}
