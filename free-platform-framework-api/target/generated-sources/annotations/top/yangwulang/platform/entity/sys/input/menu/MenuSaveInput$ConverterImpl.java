package top.yangwulang.platform.entity.sys.input.menu;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-09T17:37:58+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
class MenuSaveInput$ConverterImpl implements MenuSaveInput.Converter {

    @Override
    public Menu toMenu(MenuSaveInput input) {
        if ( input == null ) {
            return null;
        }

        MenuDraft.MapStruct menu = new MenuDraft.MapStruct();

        menu.id( input.getId() );
        menu.parentId( input.getParentId() );
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
        menu.sysCode( input.getSysCode() );

        return menu.build();
    }
}
