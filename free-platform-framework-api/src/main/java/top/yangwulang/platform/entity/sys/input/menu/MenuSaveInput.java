package top.yangwulang.platform.entity.sys.input.menu;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.babyfish.jimmer.Input;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.Menu;

import java.math.BigDecimal;

/**
 * @author yangwulang
 */
@Data
@Schema(description = "菜单保存实体")
public class MenuSaveInput implements Input<Menu> {
    private static final MenuSaveInput.Converter CONVERTER = Mappers.getMapper(MenuSaveInput.Converter.class);

    private String parentCodes;

    private BigDecimal treeSort;

    private String treeSorts;

    private String treeLeaf;

    private BigDecimal treeLevel;
    @Schema(description = "全节点名")
    private String treeNames;
    @Schema(description = "菜单名称")
    private String menuName;
    @Schema(description = "菜单类型（1菜单 2权限 3开发）")
    private String menuType;
    @Schema(description = "链接，外链用的上")
    private String menuHref;
    @Schema(description = "组件地址")
    private String menuComponent;
    @Schema(description = "目标")
    private String menuTarget;
    @Schema(description = "图标")
    private String menuIcon;
    @Schema(description = "菜单颜色")
    private String menuColor;
    @Schema(description = "菜单标题")
    private String menuTitle;
    @Schema(description = "权限标识")
    private String permission;
    @Schema(description = "菜单权重")
    private BigDecimal weight;
    @Schema(description = "是否显示")
    private boolean isShow;
    @Schema(description = "归属系统（default:主导航菜单、mobileApp:APP菜单）")
    private String sysCode;

    private String id;

    private String parentId;

    @Override
    public Menu toEntity() {
        return CONVERTER.toMenu(this);
    }

    @Mapper
    interface Converter {
        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        Menu toMenu(MenuSaveInput input);
    }
}
