package top.yangwulang.platform.entity.sys.input;

import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.Menu;

public class MenuInput implements Input<Menu> {

    private static final Converter CONVERTER = Mappers.getMapper(Converter.class);

    @Override
    public Menu toEntity() {
        return CONVERTER.toMenu(this);
    }

    @Mapper
    interface Converter {

        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        Menu toMenu(MenuInput input);

    }
}
