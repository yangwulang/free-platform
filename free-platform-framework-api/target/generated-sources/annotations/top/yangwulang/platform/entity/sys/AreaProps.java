package top.yangwulang.platform.entity.sys;

import java.lang.Integer;
import java.lang.Long;
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
        type = Area.class
)
@PropsFor(Area.class)
public interface AreaProps extends DataTypeBaseProps {
    TypedProp.Scalar<Area, String> ID = 
        TypedProp.scalar(ImmutableType.get(Area.class).getProp("id"));

    TypedProp.Scalar<Area, Integer> STATUS = 
        TypedProp.scalar(ImmutableType.get(Area.class).getProp("status"));

    TypedProp.Scalar<Area, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(Area.class).getProp("createBy"));

    TypedProp.Scalar<Area, Date> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Area.class).getProp("createDate"));

    TypedProp.Scalar<Area, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(Area.class).getProp("updateBy"));

    TypedProp.Scalar<Area, Date> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Area.class).getProp("updateDate"));

    TypedProp.Scalar<Area, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(Area.class).getProp("remarks"));

    TypedProp.Reference<Area, Area> PARENT = 
        TypedProp.reference(ImmutableType.get(Area.class).getProp("parent"));

    TypedProp.Scalar<Area, String> PARENT_ID = 
        TypedProp.scalar(ImmutableType.get(Area.class).getProp("parentId"));

    TypedProp.ReferenceList<Area, Area> CHILDREN = 
        TypedProp.referenceList(ImmutableType.get(Area.class).getProp("children"));

    TypedProp.Scalar<Area, String> AREA_NAME = 
        TypedProp.scalar(ImmutableType.get(Area.class).getProp("areaName"));

    TypedProp.Scalar<Area, Long> SORT = 
        TypedProp.scalar(ImmutableType.get(Area.class).getProp("sort"));

    TypedProp.Scalar<Area, String> AREA_TYPE = 
        TypedProp.scalar(ImmutableType.get(Area.class).getProp("areaType"));

    AreaTable parent();

    AreaTable parent(JoinType joinType);

    PropExpression.Str parentId();

    Predicate children(Function<AreaTableEx, Predicate> block);

    PropExpression.Str areaName();

    PropExpression.Num<Long> sort();

    PropExpression.Str areaType();
}
