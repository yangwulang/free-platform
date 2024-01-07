package top.yangwulang.platform.entity.sys.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-07T10:15:06+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
class DictTypeInput$ConverterImpl implements DictTypeInput.Converter {

    @Override
    public DictType toDictType(DictTypeInput input) {
        if ( input == null ) {
            return null;
        }

        DictTypeDraft.MapStruct dictType = new DictTypeDraft.MapStruct();

        dictType.remarks( input.getRemarks() );
        dictType.dictName( input.getDictName() );
        dictType.dictType( input.getDictType() );
        dictType.isSys( input.getIsSys() );

        return dictType.build();
    }
}
