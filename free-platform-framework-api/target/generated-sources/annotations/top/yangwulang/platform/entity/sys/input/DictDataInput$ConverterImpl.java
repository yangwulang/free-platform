package top.yangwulang.platform.entity.sys.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-16T20:52:19+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
class DictDataInput$ConverterImpl implements DictDataInput.Converter {

    @Override
    public DictData toDictData(DictDataInput input) {
        if ( input == null ) {
            return null;
        }

        DictDataDraft.MapStruct dictData = new DictDataDraft.MapStruct();

        return dictData.build();
    }
}
