package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.DataTypeBaseProps;

@GeneratedBy(
        type = DictData.class
)
@PropsFor(DictData.class)
public interface DictDataProps extends DataTypeBaseProps {
    TypedProp.Scalar<DictData, String> ID = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("id"));

    TypedProp.Scalar<DictData, Integer> STATUS = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("status"));

    TypedProp.Scalar<DictData, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("createBy"));

    TypedProp.Scalar<DictData, Date> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("createDate"));

    TypedProp.Scalar<DictData, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("updateBy"));

    TypedProp.Scalar<DictData, Date> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("updateDate"));

    TypedProp.Scalar<DictData, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("remarks"));

    TypedProp.Reference<DictData, DictData> PARENT = 
        TypedProp.reference(ImmutableType.get(DictData.class).getProp("parent"));

    TypedProp.ReferenceList<DictData, DictData> CHILDREN = 
        TypedProp.referenceList(ImmutableType.get(DictData.class).getProp("children"));

    TypedProp.Reference<DictData, DictType> DICT_TYPE = 
        TypedProp.reference(ImmutableType.get(DictData.class).getProp("dictType"));

    TypedProp.Scalar<DictData, String> PARENT_ID = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("parentId"));

    TypedProp.Scalar<DictData, String> DICT_TYPE_ID = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("dictTypeId"));

    TypedProp.Scalar<DictData, String> DICT_LABEL = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("dictLabel"));

    TypedProp.Scalar<DictData, String> DICT_VALUE = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("dictValue"));

    TypedProp.Scalar<DictData, Boolean> IS_SYS = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("isSys"));

    TypedProp.Scalar<DictData, String> DESCRIPTION = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("description"));

    TypedProp.Scalar<DictData, String> CSS_STYLE = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("cssStyle"));

    TypedProp.Scalar<DictData, String> CSS_CLASS = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("cssClass"));

    TypedProp.Scalar<DictData, String> CORP_CODE = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("corpCode"));

    TypedProp.Scalar<DictData, String> CORP_NAME = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp("corpName"));

    DictDataTable parent();

    DictDataTable parent(JoinType joinType);

    PropExpression.Str parentId();

    Predicate children(Function<DictDataTableEx, Predicate> block);

    DictTypeTable dictType();

    DictTypeTable dictType(JoinType joinType);

    PropExpression.Str dictTypeId();

    PropExpression.Str dictLabel();

    PropExpression.Str dictValue();

    PropExpression.Cmp<Boolean> isSys();

    PropExpression.Str description();

    PropExpression.Str cssStyle();

    PropExpression.Str cssClass();

    PropExpression.Str corpCode();

    PropExpression.Str corpName();
}
