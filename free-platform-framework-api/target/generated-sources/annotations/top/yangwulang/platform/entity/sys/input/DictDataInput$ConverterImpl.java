package top.yangwulang.platform.entity.sys.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-24T16:52:01+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
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

        return dictData.build();
    }

    protected DictData dictDataInputToDictData(DictDataInput dictDataInput) {
        if ( dictDataInput == null ) {
            return null;
        }

        DictDataDraft.MapStruct dictData = new DictDataDraft.MapStruct();

        dictData.id( dictDataInput.getId() );
        dictData.parent( toDictData( dictDataInput.getParent() ) );

        return dictData.build();
    }
}
