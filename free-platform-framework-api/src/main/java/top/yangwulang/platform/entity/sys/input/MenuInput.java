package top.yangwulang.platform.entity.sys.input;

import lombok.Data;
import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.Menu;

import java.math.BigDecimal;
import java.util.List;

@Data
public class MenuInput implements Input<Menu> {

    private static final Converter CONVERTER = Mappers.getMapper(Converter.class);

    private String parentCodes;

    private BigDecimal treeSort;

    private String treeSorts;

    private String treeLeaf;

    private BigDecimal treeLevel;

    private String treeNames;

    private String menuName;

    private String menuType;

    private String menuHref;

    private String menuComponent;

    private String menuTarget;

    private String menuIcon;

    private String menuColor;

    private String menuTitle;

    private String permission;

    private BigDecimal weight;

    private boolean isShow;

    private String sysCode;

    private String id;

    private String parentId;

    MenuInput parent;
    private List<MenuInput> children;

    public MenuInput() {
    }

    public MenuInput(String id) {
        this.id = id;
    }

    @Override
    public Menu toEntity() {
        return CONVERTER.toMenu(this);
    }

    @Mapper
    interface Converter {

        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        Menu toMenu(MenuInput input);

    }
}
