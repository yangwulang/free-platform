package top.yangwulang.platform.entity.sys.input;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-27T12:42:50+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
class MenuInput$ConverterImpl implements MenuInput.Converter {

    @Override
    public Menu toMenu(MenuInput input) {
        if ( input == null ) {
            return null;
        }

        MenuDraft.MapStruct menu = new MenuDraft.MapStruct();

        menu.id( input.getId() );
        menu.parent( menuInputToMenu( input.getParent() ) );
        menu.children( menuInputListToMenuList( input.getChildren() ) );
        menu.parentCodes( input.getParentCodes() );
        menu.treeSort( input.getTreeSort() );
        menu.treeSorts( input.getTreeSorts() );
        menu.treeLeaf( input.getTreeLeaf() );
        menu.treeLevel( input.getTreeLevel() );
        menu.treeNames( input.getTreeNames() );
        menu.menuName( input.getMenuName() );
        menu.menuType( input.getMenuType() );
        menu.menuHref( input.getMenuHref() );
        menu.menuComponent( input.getMenuComponent() );
        menu.menuTarget( input.getMenuTarget() );
        menu.menuIcon( input.getMenuIcon() );
        menu.menuColor( input.getMenuColor() );
        menu.menuTitle( input.getMenuTitle() );
        menu.permission( input.getPermission() );
        menu.weight( input.getWeight() );
        menu.show( input.isShow() );
        menu.sysCode( input.getSysCode() );

        return menu.build();
    }

    protected List<Menu> menuInputListToMenuList(List<MenuInput> list) {
        if ( list == null ) {
            return null;
        }

        List<Menu> list1 = new ArrayList<Menu>( list.size() );
        for ( MenuInput menuInput : list ) {
            list1.add( toMenu( menuInput ) );
        }

        return list1;
    }

    protected Menu menuInputToMenu(MenuInput menuInput) {
        if ( menuInput == null ) {
            return null;
        }

        MenuDraft.MapStruct menu = new MenuDraft.MapStruct();

        menu.id( menuInput.getId() );
        menu.parent( toMenu( menuInput.getParent() ) );
        menu.children( menuInputListToMenuList( menuInput.getChildren() ) );
        menu.parentCodes( menuInput.getParentCodes() );
        menu.treeSort( menuInput.getTreeSort() );
        menu.treeSorts( menuInput.getTreeSorts() );
        menu.treeLeaf( menuInput.getTreeLeaf() );
        menu.treeLevel( menuInput.getTreeLevel() );
        menu.treeNames( menuInput.getTreeNames() );
        menu.menuName( menuInput.getMenuName() );
        menu.menuType( menuInput.getMenuType() );
        menu.menuHref( menuInput.getMenuHref() );
        menu.menuComponent( menuInput.getMenuComponent() );
        menu.menuTarget( menuInput.getMenuTarget() );
        menu.menuIcon( menuInput.getMenuIcon() );
        menu.menuColor( menuInput.getMenuColor() );
        menu.menuTitle( menuInput.getMenuTitle() );
        menu.permission( menuInput.getPermission() );
        menu.weight( menuInput.getWeight() );
        menu.show( menuInput.isShow() );
        menu.sysCode( menuInput.getSysCode() );

        return menu.build();
    }
}
