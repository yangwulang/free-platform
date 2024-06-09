package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.MenuFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Menu.dto"
)
@Schema(
        description = "菜单实体"
)
public class MenuListInput implements Input<Menu> {
    public static final ViewMetadata<Menu, MenuListInput> METADATA = 
        new ViewMetadata<Menu, MenuListInput>(
            MenuFetcher.$
                .menuName()
                .menuType()
                .parentId(),
            MenuListInput::new
    );

    private static final DtoPropAccessor MENU_NAME_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { MenuDraft.Producer.SLOT_MENU_NAME }
    );

    private static final DtoPropAccessor MENU_TYPE_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { MenuDraft.Producer.SLOT_MENU_TYPE }
    );

    private String menuName;

    private String menuType;

    private String parentId;

    public MenuListInput() {
    }

    public MenuListInput(@NotNull Menu base) {
        this.menuName = MENU_NAME_ACCESSOR.get(base);
        this.menuType = MENU_TYPE_ACCESSOR.get(base);
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
    }

    @Nullable
    @Schema(
            description = "菜单名称"
    )
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(@Nullable String menuName) {
        this.menuName = menuName;
    }

    @Nullable
    @Schema(
            description = "菜单类型（1菜单 2权限 3开发）"
    )
    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(@Nullable String menuType) {
        this.menuType = menuType;
    }

    @Nullable
    public String getParentId() {
        return parentId;
    }

    public void setParentId(@Nullable String parentId) {
        this.parentId = parentId;
    }

    @Override
    public Menu toEntity() {
        return MenuDraft.$.produce(__draft -> {
            MENU_NAME_ACCESSOR.set(__draft, menuName);
            MENU_TYPE_ACCESSOR.set(__draft, menuType);
            __draft.setParentId(parentId);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(menuName);
        hash = hash * 31 + Objects.hashCode(menuType);
        hash = hash * 31 + Objects.hashCode(parentId);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MenuListInput other = (MenuListInput) o;
        if (!Objects.equals(menuName, other.menuName)) {
            return false;
        }
        if (!Objects.equals(menuType, other.menuType)) {
            return false;
        }
        if (!Objects.equals(parentId, other.parentId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MenuListInput").append('(');
        builder.append("menuName=").append(menuName);
        builder.append(", menuType=").append(menuType);
        builder.append(", parentId=").append(parentId);
        builder.append(')');
        return builder.toString();
    }
}
