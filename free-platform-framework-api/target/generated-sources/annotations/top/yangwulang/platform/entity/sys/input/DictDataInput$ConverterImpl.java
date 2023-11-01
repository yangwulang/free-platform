package top.yangwulang.platform.entity.sys.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-01T21:39:54+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
class DictDataInput$ConverterImpl implements DictDataInput.Converter {

    @Override
    public DictData toDictData(DictDataInput input) {
        if ( input == null ) {
            return null;
        }

        DictDataDraft.MapStruct dictData = new DictDataDraft.MapStruct();

        dictData.id( input.getId() );
        dictData.parent( dictDataInputToDictData( input.getParent() ) );
        dictData.parentId( input.getParentId() );
        dictData.dictTypeId( input.getDictTypeId() );
        dictData.dictLabel( input.getDictLabel() );
        dictData.dictValue( input.getDictValue() );
        dictData.isSys( input.getIsSys() );
        dictData.description( input.getDescription() );
        dictData.cssStyle( input.getCssStyle() );
        dictData.cssClass( input.getCssClass() );

        return dictData.build();
    }

    protected DictData dictDataInputToDictData(DictDataInput dictDataInput) {
        if ( dictDataInput == null ) {
            return null;
        }

        DictDataDraft.MapStruct dictData = new DictDataDraft.MapStruct();

        dictData.id( dictDataInput.getId() );
        dictData.parent( toDictData( dictDataInput.getParent() ) );
        dictData.parentId( dictDataInput.getParentId() );
        dictData.dictTypeId( dictDataInput.getDictTypeId() );
        dictData.dictLabel( dictDataInput.getDictLabel() );
        dictData.dictValue( dictDataInput.getDictValue() );
        dictData.isSys( dictDataInput.getIsSys() );
        dictData.description( dictDataInput.getDescription() );
        dictData.cssStyle( dictDataInput.getCssStyle() );
        dictData.cssClass( dictDataInput.getCssClass() );

        return dictData.build();
    }
}
