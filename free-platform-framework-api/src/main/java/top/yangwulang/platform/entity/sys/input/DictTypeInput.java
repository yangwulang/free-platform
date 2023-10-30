package top.yangwulang.platform.entity.sys.input;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "字典类型查询入口")
public class DictTypeInput implements Input<DictType> {

    private static final DictTypeInput.Converter CONVERTER = Mappers.getMapper(DictTypeInput.Converter.class);

    @Schema(description = "字典类型")
    private String dictType;
    @Schema(description = "字典名称")
    private String dictName;
    @Schema(description = "是否系统自带")
    private Boolean isSys;
    @Schema(description = "备注")
    private String remarks;

    @Override
    public DictType toEntity() {
        return CONVERTER.toDictType(this);
    }

    @Mapper
    interface Converter {
        /**
         * 讲输入实体转化为不可变的字典类型实体
         *
         * @param input 输入实体
         * @return 字典类型
         */
        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        DictType toDictType(DictTypeInput input);

    }
}
