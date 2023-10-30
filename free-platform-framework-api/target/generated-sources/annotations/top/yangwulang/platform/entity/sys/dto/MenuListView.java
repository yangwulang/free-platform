package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.RecursiveFieldConfig;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.MenuFetcher;
import top.yangwulang.platform.entity.sys.MenuProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Menu.dto"
)
@Data
public class MenuListView implements View<Menu> {
    public static final ViewMetadata<Menu, MenuListView> METADATA = 
        new ViewMetadata<Menu, MenuListView>(
            MenuFetcher.$
                .status()
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
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
                .children(TargetOf_children.METADATA.getFetcher(), RecursiveFieldConfig::recursive),
            MenuListView::new
    );

    @NotNull
    private String id;

    @Schema(
            description = "状态"
    )
    private int status;

    @NotNull
    private String createBy;

    @NotNull
    private Date createDate;

    @NotNull
    private String updateBy;

    @NotNull
    private Date updateDate;

    @Null
    private String remarks;

    @Schema(
            description = "菜单名称"
    )
    @org.jetbrains.annotations.NotNull
    private String menuName;

    @Schema(
            description = "菜单类型（1菜单 2权限 3开发）"
    )
    @org.jetbrains.annotations.NotNull
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

    @Schema(
            description = "子级菜单"
    )
    @Nullable
    private List<TargetOf_children> children;

    public MenuListView() {
    }

    public MenuListView(@org.jetbrains.annotations.NotNull Menu base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = spi.__isLoaded(MenuProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
        this.menuName = base.menuName();
        this.menuType = base.menuType();
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
        this.children = spi.__isLoaded(MenuProps.CHILDREN.unwrap().getId()) ? 
                    base.children().stream().map(TargetOf_children::new).collect(Collectors.toList()) : 
                    null;
    }

    public static MenuListView of(@org.jetbrains.annotations.NotNull Menu base) {
        return new MenuListView(base);
    }

    @Override
    public Menu toEntity() {
        return MenuDraft.$.produce(draft -> {
            draft.setId(id);
            draft.setStatus(status);
            draft.setCreateBy(createBy);
            draft.setCreateDate(createDate);
            draft.setUpdateBy(updateBy);
            draft.setUpdateDate(updateDate);
            draft.setRemarks(remarks);
            draft.setMenuName(menuName);
            draft.setMenuType(menuType);
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
            if (children != null) {
                if (children.isEmpty()) {
                    draft.setChildren(Collections.emptyList());
                } else {
                    for (TargetOf_children __e : children) {
                        draft.children(true).add((MenuDraft)__e.toEntity());
                    }
                }
            } else {
                draft.setChildren(Collections.emptyList());
            }
        });
    }

    @Data
    public static class TargetOf_children implements View<Menu> {
        public static final ViewMetadata<Menu, TargetOf_children> METADATA = 
            new ViewMetadata<Menu, TargetOf_children>(
                MenuFetcher.$
                    .status()
                    .createBy()
                    .createDate()
                    .updateBy()
                    .updateDate()
                    .remarks()
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
                    .sysCode(),
                TargetOf_children::new
        );

        @NotNull
        private String id;

        @Schema(
                description = "状态"
        )
        private int status;

        @NotNull
        private String createBy;

        @NotNull
        private Date createDate;

        @NotNull
        private String updateBy;

        @NotNull
        private Date updateDate;

        @Null
        private String remarks;

        @Schema(
                description = "菜单名称"
        )
        @org.jetbrains.annotations.NotNull
        private String menuName;

        @Schema(
                description = "菜单类型（1菜单 2权限 3开发）"
        )
        @org.jetbrains.annotations.NotNull
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

        @Schema(
                description = "子级菜单"
        )
        @Nullable
        private List<TargetOf_children> children;

        public TargetOf_children() {
        }

        public TargetOf_children(@org.jetbrains.annotations.NotNull Menu base) {
            ImmutableSpi spi = (ImmutableSpi)base;
            this.id = base.id();
            this.status = base.status();
            this.createBy = base.createBy();
            this.createDate = base.createDate();
            this.updateBy = base.updateBy();
            this.updateDate = base.updateDate();
            this.remarks = spi.__isLoaded(MenuProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
            this.menuName = base.menuName();
            this.menuType = base.menuType();
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
            this.children = spi.__isLoaded(MenuProps.CHILDREN.unwrap().getId()) ? 
                        base.children().stream().map(TargetOf_children::new).collect(Collectors.toList()) : 
                        null;
        }

        public static TargetOf_children of(@org.jetbrains.annotations.NotNull Menu base) {
            return new TargetOf_children(base);
        }

        @Override
        public Menu toEntity() {
            return MenuDraft.$.produce(draft -> {
                draft.setId(id);
                draft.setStatus(status);
                draft.setCreateBy(createBy);
                draft.setCreateDate(createDate);
                draft.setUpdateBy(updateBy);
                draft.setUpdateDate(updateDate);
                draft.setRemarks(remarks);
                draft.setMenuName(menuName);
                draft.setMenuType(menuType);
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
                if (children != null) {
                    if (children.isEmpty()) {
                        draft.setChildren(Collections.emptyList());
                    } else {
                        for (TargetOf_children __e : children) {
                            draft.children(true).add((MenuDraft)__e.toEntity());
                        }
                    }
                } else {
                    draft.setChildren(Collections.emptyList());
                }
            });
        }
    }
}
