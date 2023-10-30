package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Date;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.DataTypeBaseProps;

@GeneratedBy(
        type = Menu.class
)
@PropsFor(Menu.class)
public interface MenuProps extends DataTypeBaseProps {
    TypedProp.Scalar<Menu, String> ID = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("id"));

    TypedProp.Scalar<Menu, Integer> STATUS = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("status"));

    TypedProp.Scalar<Menu, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("createBy"));

    TypedProp.Scalar<Menu, Date> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("createDate"));

    TypedProp.Scalar<Menu, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("updateBy"));

    TypedProp.Scalar<Menu, Date> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("updateDate"));

    TypedProp.Scalar<Menu, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("remarks"));

    TypedProp.Reference<Menu, Menu> PARENT = 
        TypedProp.reference(ImmutableType.get(Menu.class).getProp("parent"));

    TypedProp.Scalar<Menu, String> PARENT_ID = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("parentId"));

    TypedProp.ReferenceList<Menu, Menu> CHILDREN = 
        TypedProp.referenceList(ImmutableType.get(Menu.class).getProp("children"));

    TypedProp.Scalar<Menu, String> MENU_NAME = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("menuName"));

    TypedProp.Scalar<Menu, String> MENU_TYPE = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("menuType"));

    TypedProp.Scalar<Menu, String> MENU_HREF = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("menuHref"));

    TypedProp.Scalar<Menu, String> MENU_COMPONENT = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("menuComponent"));

    TypedProp.Scalar<Menu, String> MENU_TARGET = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("menuTarget"));

    TypedProp.Scalar<Menu, String> MENU_ICON = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("menuIcon"));

    TypedProp.Scalar<Menu, String> MENU_COLOR = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("menuColor"));

    TypedProp.Scalar<Menu, String> MENU_TITLE = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("menuTitle"));

    TypedProp.Scalar<Menu, String> PERMISSION = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("permission"));

    TypedProp.Scalar<Menu, BigDecimal> WEIGHT = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("weight"));

    TypedProp.Scalar<Menu, Boolean> IS_SHOW = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("isShow"));

    TypedProp.Scalar<Menu, String> SYS_CODE = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp("sysCode"));

    TypedProp.ReferenceList<Menu, Role> ROLES = 
        TypedProp.referenceList(ImmutableType.get(Menu.class).getProp("roles"));

    MenuTable parent();

    MenuTable parent(JoinType joinType);

    PropExpression.Str parentId();

    PropExpression.Str menuName();

    PropExpression.Str menuType();

    PropExpression.Str menuHref();

    PropExpression.Str menuComponent();

    PropExpression.Str menuTarget();

    PropExpression.Str menuIcon();

    PropExpression.Str menuColor();

    PropExpression.Str menuTitle();

    PropExpression.Str permission();

    PropExpression.Num<BigDecimal> weight();

    PropExpression.Cmp<Boolean> isShow();

    PropExpression.Str sysCode();
}
