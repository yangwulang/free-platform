package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(DictData.class)
public interface DictDataProps extends DataTypeBaseProps {
    TypedProp.Reference<DictData, DictData> PARENT = 
        TypedProp.reference(ImmutableType.get(DictData.class).getProp(8));

    TypedProp.ReferenceList<DictData, DictData> CHILDREN = 
        TypedProp.referenceList(ImmutableType.get(DictData.class).getProp(9));

    TypedProp.Reference<DictData, DictType> DICT_TYPE = 
        TypedProp.reference(ImmutableType.get(DictData.class).getProp(10));

    TypedProp.Scalar<DictData, String> PARENT_CODES = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(11));

    TypedProp.Scalar<DictData, BigDecimal> TREE_SORT = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(12));

    TypedProp.Scalar<DictData, String> TREE_SORTS = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(13));

    TypedProp.Scalar<DictData, String> TREE_LEAF = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(14));

    TypedProp.Scalar<DictData, BigDecimal> TREE_LEVEL = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(15));

    TypedProp.Scalar<DictData, String> TREE_NAMES = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(16));

    TypedProp.Scalar<DictData, String> DICT_LABEL = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(17));

    TypedProp.Scalar<DictData, String> DICT_VALUE = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(18));

    TypedProp.Scalar<DictData, Boolean> SYS = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(19));

    TypedProp.Scalar<DictData, String> DESCRIPTION = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(20));

    TypedProp.Scalar<DictData, String> CSS_STYLE = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(21));

    TypedProp.Scalar<DictData, String> CSS_CLASS = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(22));

    TypedProp.Scalar<DictData, String> CORP_CODE = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(23));

    TypedProp.Scalar<DictData, String> CORP_NAME = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(24));

    TypedProp.Scalar<DictData, String> ID = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(1));

    TypedProp.Scalar<DictData, String> STATUS = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(2));

    TypedProp.Scalar<DictData, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(3));

    TypedProp.Scalar<DictData, LocalDateTime> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(4));

    TypedProp.Scalar<DictData, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(5));

    TypedProp.Scalar<DictData, LocalDateTime> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(6));

    TypedProp.Scalar<DictData, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(DictData.class).getProp(7));

    DictDataTable parent();

    DictDataTable parent(JoinType joinType);

    DictTypeTable dictType();

    DictTypeTable dictType(JoinType joinType);

    PropExpression.Str parentCodes();

    PropExpression.Num<BigDecimal> treeSort();

    PropExpression.Str treeSorts();

    PropExpression.Str treeLeaf();

    PropExpression.Num<BigDecimal> treeLevel();

    PropExpression.Str treeNames();

    PropExpression.Str dictLabel();

    PropExpression.Str dictValue();

    PropExpression<Boolean> sys();

    PropExpression.Str description();

    PropExpression.Str cssStyle();

    PropExpression.Str cssClass();

    PropExpression.Str corpCode();

    PropExpression.Str corpName();
}
