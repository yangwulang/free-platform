package top.yangwulang.platform.entity.sys.input.area;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.Area;
import top.yangwulang.platform.entity.sys.AreaDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-11T09:31:27+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
class AreaSaveInput$ConverterImpl implements AreaSaveInput.Converter {

    @Override
    public Area toArea(AreaSaveInput input) {
        if ( input == null ) {
            return null;
        }

        AreaDraft.MapStruct area = new AreaDraft.MapStruct();

        area.id( input.getId() );
        area.parentId( input.getParentId() );
        area.areaName( input.getAreaName() );
        area.sort( input.getSort() );
        area.areaType( input.getAreaType() );

        return area.build();
    }
}
