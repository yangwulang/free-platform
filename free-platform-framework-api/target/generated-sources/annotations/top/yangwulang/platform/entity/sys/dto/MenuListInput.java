package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.Input;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Menu.dto"
)
@Data
public class MenuListInput implements Input<Menu> {
    @Schema(
            description = "菜单名称"
    )
    @Nullable
    private String menuName;

    @Schema(
            description = "菜单类型（1菜单 2权限 3开发）"
    )
    @Nullable
    private String menuType;

    @Null
    private String parentId;

    public MenuListInput() {
    }

    @Override
    public Menu toEntity() {
        return MenuDraft.$.produce(draft -> {
            if (menuName != null) {
                draft.setMenuName(menuName);
            }
            if (menuType != null) {
                draft.setMenuType(menuType);
            }
            draft.setParentId(parentId);
        });
    }
}
