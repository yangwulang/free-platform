package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.MenuFetcher;
import top.yangwulang.platform.entity.sys.MenuProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Menu.dto"
)
@Data
public class MenuGetView implements View<Menu> {
    public static final ViewMetadata<Menu, MenuGetView> METADATA = 
        new ViewMetadata<Menu, MenuGetView>(
            MenuFetcher.$
                .menuName()
                .menuType()
                .menuHref()
                .menuComponent()
                .menuTarget()
                .menuIcon()
                .menuColor()
                .menuTitle()
                .permission()
                .weight()
                .isShow()
                .sysCode()
                .parentId()
                .parent(TargetOf_parent.METADATA.getFetcher()),
            MenuGetView::new
    );

    @Schema(
            description = "登录编码"
    )
    @Nullable
    private String id;

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

    @Schema(
            description = "链接"
    )
    @Null
    private String menuHref;

    @Schema(
            description = "组件地址"
    )
    @Null
    private String menuComponent;

    @Schema(
            description = "目标"
    )
    @Null
    private String menuTarget;

    @Schema(
            description = "图标"
    )
    @Null
    private String menuIcon;

    @Schema(
            description = "颜色"
    )
    @Null
    private String menuColor;

    @Schema(
            description = "菜单标题"
    )
    @Null
    private String menuTitle;

    @Schema(
            description = "权限标识"
    )
    @Null
    private String permission;

    @Schema(
            description = "菜单权重"
    )
    @Null
    private BigDecimal weight;

    @Schema(
            description = "是否显示"
    )
    @Null
    private Boolean isShow;

    @Schema(
            description = "归属系统（default:主导航菜单、mobileApp:APP菜单）"
    )
    @Null
    private String sysCode;

    @Null
    private String parentId;

    @Schema(
            description = "父级菜单"
    )
    @Null
    private TargetOf_parent parent;

    public MenuGetView() {
    }

    public MenuGetView(@NotNull Menu base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = spi.__isLoaded(MenuProps.ID.unwrap().getId()) ? base.id() : null;
        this.menuName = spi.__isLoaded(MenuProps.MENU_NAME.unwrap().getId()) ? base.menuName() : null;
        this.menuType = spi.__isLoaded(MenuProps.MENU_TYPE.unwrap().getId()) ? base.menuType() : null;
        this.menuHref = spi.__isLoaded(MenuProps.MENU_HREF.unwrap().getId()) ? base.menuHref() : null;
        this.menuComponent = spi.__isLoaded(MenuProps.MENU_COMPONENT.unwrap().getId()) ? base.menuComponent() : null;
        this.menuTarget = spi.__isLoaded(MenuProps.MENU_TARGET.unwrap().getId()) ? base.menuTarget() : null;
        this.menuIcon = spi.__isLoaded(MenuProps.MENU_ICON.unwrap().getId()) ? base.menuIcon() : null;
        this.menuColor = spi.__isLoaded(MenuProps.MENU_COLOR.unwrap().getId()) ? base.menuColor() : null;
        this.menuTitle = spi.__isLoaded(MenuProps.MENU_TITLE.unwrap().getId()) ? base.menuTitle() : null;
        this.permission = spi.__isLoaded(MenuProps.PERMISSION.unwrap().getId()) ? base.permission() : null;
        this.weight = spi.__isLoaded(MenuProps.WEIGHT.unwrap().getId()) ? base.weight() : null;
        this.isShow = spi.__isLoaded(MenuProps.IS_SHOW.unwrap().getId()) ? base.isShow() : null;
        this.sysCode = spi.__isLoaded(MenuProps.SYS_CODE.unwrap().getId()) ? base.sysCode() : null;
        this.parentId = spi.__isLoaded(MenuProps.PARENT_ID.unwrap().getId()) ? base.parentId() : null;
        Menu _tmp_parent = spi.__isLoaded(MenuProps.PARENT.unwrap().getId()) ? base.parent() : null;
        this.parent = _tmp_parent != null ? new TargetOf_parent(_tmp_parent) : null;
    }

    public static MenuGetView of(@NotNull Menu base) {
        return new MenuGetView(base);
    }

    @Override
    public Menu toEntity() {
        return MenuDraft.$.produce(draft -> {
            if (id != null) {
                draft.setId(id);
            }
            if (menuName != null) {
                draft.setMenuName(menuName);
            }
            if (menuType != null) {
                draft.setMenuType(menuType);
            }
            draft.setMenuHref(menuHref);
            draft.setMenuComponent(menuComponent);
            draft.setMenuTarget(menuTarget);
            draft.setMenuIcon(menuIcon);
            draft.setMenuColor(menuColor);
            draft.setMenuTitle(menuTitle);
            draft.setPermission(permission);
            draft.setWeight(weight);
            draft.setIsShow(isShow);
            draft.setSysCode(sysCode);
            draft.setParentId(parentId);
            if (parent != null) {
                draft.setParent(parent.toEntity());
            } else {
                draft.setParent((Menu)null);
            }
        });
    }

    @Data
    public static class TargetOf_parent implements View<Menu> {
        public static final ViewMetadata<Menu, TargetOf_parent> METADATA = 
            new ViewMetadata<Menu, TargetOf_parent>(
                MenuFetcher.$
                    .menuName(),
                TargetOf_parent::new
        );

        @Schema(
                description = "菜单名称"
        )
        @Nullable
        private String menuName;

        public TargetOf_parent() {
        }

        public TargetOf_parent(@NotNull Menu base) {
            ImmutableSpi spi = (ImmutableSpi)base;
            this.menuName = spi.__isLoaded(MenuProps.MENU_NAME.unwrap().getId()) ? base.menuName() : null;
        }

        public static TargetOf_parent of(@NotNull Menu base) {
            return new TargetOf_parent(base);
        }

        @Override
        public Menu toEntity() {
            return MenuDraft.$.produce(draft -> {
                if (menuName != null) {
                    draft.setMenuName(menuName);
                }
            });
        }
    }
}
