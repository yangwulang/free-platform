package top.yangwulang.platform.entity.sys.input;

import lombok.Data;
import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.DictData;

@Data
public class DictDataInput implements Input<DictData> {

    private static final DictDataInput.Converter CONVERTER = Mappers.getMapper(DictDataInput.Converter.class);

    private String parentId;

    private String id;

    private DictDataInput parent;

    private String dictTypeId;

    private String dictLabel;

    private String dictValue;

    private Boolean isSys;

    private String description;

    private String cssStyle;

    private String cssClass;

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
