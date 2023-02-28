package top.yangwulang.platform.entity.sys.input;

import lombok.Data;
import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.DictType;

/**
 * @author yangwulang
 */
@Data
public class DictTypeInput implements Input<DictType> {

    private static final DictTypeInput.Converter CONVERTER = Mappers.getMapper(DictTypeInput.Converter.class);

    private String dictType;
    private String dictName;

    @Override
    public DictType toEntity() {
        return CONVERTER.toDictType(this);
    }

    @Mapper
    interface Converter {

        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        DictType toDictType(DictTypeInput input);

    }
}
