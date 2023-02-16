package top.yangwulang.platform.entity.sys.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-16T17:43:49+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
class MenuInput$ConverterImpl implements MenuInput.Converter {

    @Override
    public Menu toMenu(MenuInput input) {
        if ( input == null ) {
            return null;
        }

        MenuDraft.MapStruct menu = new MenuDraft.MapStruct();

        return menu.build();
    }
}
