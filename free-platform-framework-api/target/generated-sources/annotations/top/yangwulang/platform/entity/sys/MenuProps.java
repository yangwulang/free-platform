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

@PropsFor(Menu.class)
public interface MenuProps extends DataTypeBaseProps {
    TypedProp.Reference<Menu, Menu> PARENT = 
        TypedProp.reference(ImmutableType.get(Menu.class).getProp(8));

    TypedProp.ReferenceList<Menu, Menu> CHILDREN = 
        TypedProp.referenceList(ImmutableType.get(Menu.class).getProp(9));

    TypedProp.Scalar<Menu, String> PARENT_CODES = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(10));

    TypedProp.Scalar<Menu, BigDecimal> TREE_SORT = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(11));

    TypedProp.Scalar<Menu, String> TREE_SORTS = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(12));

    TypedProp.Scalar<Menu, String> TREE_LEAF = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(13));

    TypedProp.Scalar<Menu, BigDecimal> TREE_LEVEL = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(14));

    TypedProp.Scalar<Menu, String> TREE_NAMES = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(15));

    TypedProp.Scalar<Menu, String> MENU_NAME = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(16));

    TypedProp.Scalar<Menu, String> MENU_TYPE = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(17));

    TypedProp.Scalar<Menu, String> MENU_HREF = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(18));

    TypedProp.Scalar<Menu, String> MENU_COMPONENT = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(19));

    TypedProp.Scalar<Menu, String> MENU_TARGET = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(20));

    TypedProp.Scalar<Menu, String> MENU_ICON = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(21));

    TypedProp.Scalar<Menu, String> MENU_COLOR = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(22));

    TypedProp.Scalar<Menu, String> MENU_TITLE = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(23));

    TypedProp.Scalar<Menu, String> PERMISSION = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(24));

    TypedProp.Scalar<Menu, BigDecimal> WEIGHT = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(25));

    TypedProp.Scalar<Menu, Boolean> SHOW = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(26));

    TypedProp.Scalar<Menu, String> SYS_CODE = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(27));

    TypedProp.Scalar<Menu, String> ID = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(1));

    TypedProp.Scalar<Menu, String> STATUS = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(2));

    TypedProp.Scalar<Menu, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(3));

    TypedProp.Scalar<Menu, LocalDateTime> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(4));

    TypedProp.Scalar<Menu, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(5));

    TypedProp.Scalar<Menu, LocalDateTime> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(6));

    TypedProp.Scalar<Menu, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(Menu.class).getProp(7));

    MenuTable parent();

    MenuTable parent(JoinType joinType);

    PropExpression.Str parentCodes();

    PropExpression.Num<BigDecimal> treeSort();

    PropExpression.Str treeSorts();

    PropExpression.Str treeLeaf();

    PropExpression.Num<BigDecimal> treeLevel();

    PropExpression.Str treeNames();

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

    PropExpression<Boolean> show();

    PropExpression.Str sysCode();
}
