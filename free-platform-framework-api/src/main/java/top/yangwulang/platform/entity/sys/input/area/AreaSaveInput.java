package top.yangwulang.platform.entity.sys.input.area;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.Area;

@Data
@Schema(description = "地区保存对象")
public class AreaSaveInput implements Input<Area> {
    private static final Converter CONVERTER = Mappers.getMapper(Converter.class);
    @Schema(description = "区域码")
    private String id;
    @Schema(description = "父级区域码")
    private String parentId;
    @Schema(description = "地区名称")
    private String areaName;
    @Schema(description = "排序")
    private Long sort;
    @Schema(description = "地区类型(1：国家；2：省份、直辖市；3：地市；4：区县)")
    private String areaType;

    @Override
    public Area toEntity() {
        return CONVERTER.toArea(this);
    }

    /**
     * 转换器
     */
    @Mapper
    interface Converter {
        /**
         * saveInput转换成area
         *
         * @param input 输入
         * @return 地区
         */
        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        Area toArea(AreaSaveInput input);
    }
}
