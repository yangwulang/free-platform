package top.yangwulang.platform.entity.sys.input;

import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.DictData;

public class DictDataInput implements Input<DictData> {

    private static final DictDataInput.Converter CONVERTER = Mappers.getMapper(DictDataInput.Converter.class);

    @Override
    public DictData toEntity() {
        return CONVERTER.toDictData(this);
    }

    @Mapper
    interface Converter {

        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        DictData toDictData(DictDataInput input);

    }
}
