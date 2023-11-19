package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.RecursiveFieldConfig;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.MenuFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Menu.dto"
)
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

    private static final DtoPropAccessor CHILDREN_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { MenuDraft.Producer.SLOT_CHILDREN },
        DtoPropAccessor.<Menu, TargetOf_children>objectListGetter(TargetOf_children::new),
        DtoPropAccessor.objectListSetter(TargetOf_children::toEntity)
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
        this.id = base.id();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
        this.menuName = base.menuName();
        this.menuType = base.menuType();
        this.menuHref = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_HREF)) ? base.menuHref() : null;
        this.menuComponent = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_COMPONENT)) ? base.menuComponent() : null;
        this.menuTarget = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_TARGET)) ? base.menuTarget() : null;
        this.menuIcon = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_ICON)) ? base.menuIcon() : null;
        this.menuColor = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_COLOR)) ? base.menuColor() : null;
        this.menuTitle = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_TITLE)) ? base.menuTitle() : null;
        this.permission = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PERMISSION)) ? base.permission() : null;
        this.weight = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_WEIGHT)) ? base.weight() : null;
        this.isShow = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_IS_SHOW)) ? base.isShow() : null;
        this.sysCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_SYS_CODE)) ? base.sysCode() : null;
        this.children = CHILDREN_ACCESSOR.get(base);
    }

    public static MenuListView of(@org.jetbrains.annotations.NotNull Menu base) {
        return new MenuListView(base);
    }

    @org.jetbrains.annotations.NotNull
    public String getId() {
        return id;
    }

    public void setId(@org.jetbrains.annotations.NotNull String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @org.jetbrains.annotations.NotNull
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(@org.jetbrains.annotations.NotNull String createBy) {
        this.createBy = createBy;
    }

    @org.jetbrains.annotations.NotNull
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(@org.jetbrains.annotations.NotNull Date createDate) {
        this.createDate = createDate;
    }

    @org.jetbrains.annotations.NotNull
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(@org.jetbrains.annotations.NotNull String updateBy) {
        this.updateBy = updateBy;
    }

    @org.jetbrains.annotations.NotNull
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(@org.jetbrains.annotations.NotNull Date updateDate) {
        this.updateDate = updateDate;
    }

    @Nullable
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(@Nullable String remarks) {
        this.remarks = remarks;
    }

    @org.jetbrains.annotations.NotNull
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(@org.jetbrains.annotations.NotNull String menuName) {
        this.menuName = menuName;
    }

    @org.jetbrains.annotations.NotNull
    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(@org.jetbrains.annotations.NotNull String menuType) {
        this.menuType = menuType;
    }

    @Nullable
    public String getMenuHref() {
        return menuHref;
    }

    public void setMenuHref(@Nullable String menuHref) {
        this.menuHref = menuHref;
    }

    @Nullable
    public String getMenuComponent() {
        return menuComponent;
    }

    public void setMenuComponent(@Nullable String menuComponent) {
        this.menuComponent = menuComponent;
    }

    @Nullable
    public String getMenuTarget() {
        return menuTarget;
    }

    public void setMenuTarget(@Nullable String menuTarget) {
        this.menuTarget = menuTarget;
    }

    @Nullable
    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(@Nullable String menuIcon) {
        this.menuIcon = menuIcon;
    }

    @Nullable
    public String getMenuColor() {
        return menuColor;
    }

    public void setMenuColor(@Nullable String menuColor) {
        this.menuColor = menuColor;
    }

    @Nullable
    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(@Nullable String menuTitle) {
        this.menuTitle = menuTitle;
    }

    @Nullable
    public String getPermission() {
        return permission;
    }

    public void setPermission(@Nullable String permission) {
        this.permission = permission;
    }

    @Nullable
    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(@Nullable BigDecimal weight) {
        this.weight = weight;
    }

    @Nullable
    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(@Nullable Boolean isShow) {
        this.isShow = isShow;
    }

    @Nullable
    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(@Nullable String sysCode) {
        this.sysCode = sysCode;
    }

    @Nullable
    public List<TargetOf_children> getChildren() {
        return children;
    }

    public void setChildren(@Nullable List<TargetOf_children> children) {
        this.children = children;
    }

    @Override
    public Menu toEntity() {
        return MenuDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setStatus(status);
            __draft.setCreateBy(createBy);
            __draft.setCreateDate(createDate);
            __draft.setUpdateBy(updateBy);
            __draft.setUpdateDate(updateDate);
            __draft.setRemarks(remarks);
            __draft.setMenuName(menuName);
            __draft.setMenuType(menuType);
            __draft.setMenuHref(menuHref);
            __draft.setMenuComponent(menuComponent);
            __draft.setMenuTarget(menuTarget);
            __draft.setMenuIcon(menuIcon);
            __draft.setMenuColor(menuColor);
            __draft.setMenuTitle(menuTitle);
            __draft.setPermission(permission);
            __draft.setWeight(weight);
            __draft.setIsShow(isShow);
            __draft.setSysCode(sysCode);
            CHILDREN_ACCESSOR.set(__draft, children != null ? children : Collections.emptyList());
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Integer.hashCode(status);
        hash = hash * 31 + Objects.hashCode(createBy);
        hash = hash * 31 + Objects.hashCode(createDate);
        hash = hash * 31 + Objects.hashCode(updateBy);
        hash = hash * 31 + Objects.hashCode(updateDate);
        hash = hash * 31 + Objects.hashCode(remarks);
        hash = hash * 31 + Objects.hashCode(menuName);
        hash = hash * 31 + Objects.hashCode(menuType);
        hash = hash * 31 + Objects.hashCode(menuHref);
        hash = hash * 31 + Objects.hashCode(menuComponent);
        hash = hash * 31 + Objects.hashCode(menuTarget);
        hash = hash * 31 + Objects.hashCode(menuIcon);
        hash = hash * 31 + Objects.hashCode(menuColor);
        hash = hash * 31 + Objects.hashCode(menuTitle);
        hash = hash * 31 + Objects.hashCode(permission);
        hash = hash * 31 + Objects.hashCode(weight);
        hash = hash * 31 + Objects.hashCode(isShow);
        hash = hash * 31 + Objects.hashCode(sysCode);
        hash = hash * 31 + Objects.hashCode(children);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MenuListView other = (MenuListView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (status != other.status) {
            return false;
        }
        if (!Objects.equals(createBy, other.createBy)) {
            return false;
        }
        if (!Objects.equals(createDate, other.createDate)) {
            return false;
        }
        if (!Objects.equals(updateBy, other.updateBy)) {
            return false;
        }
        if (!Objects.equals(updateDate, other.updateDate)) {
            return false;
        }
        if (!Objects.equals(remarks, other.remarks)) {
            return false;
        }
        if (!Objects.equals(menuName, other.menuName)) {
            return false;
        }
        if (!Objects.equals(menuType, other.menuType)) {
            return false;
        }
        if (!Objects.equals(menuHref, other.menuHref)) {
            return false;
        }
        if (!Objects.equals(menuComponent, other.menuComponent)) {
            return false;
        }
        if (!Objects.equals(menuTarget, other.menuTarget)) {
            return false;
        }
        if (!Objects.equals(menuIcon, other.menuIcon)) {
            return false;
        }
        if (!Objects.equals(menuColor, other.menuColor)) {
            return false;
        }
        if (!Objects.equals(menuTitle, other.menuTitle)) {
            return false;
        }
        if (!Objects.equals(permission, other.permission)) {
            return false;
        }
        if (!Objects.equals(weight, other.weight)) {
            return false;
        }
        if (!Objects.equals(isShow, other.isShow)) {
            return false;
        }
        if (!Objects.equals(sysCode, other.sysCode)) {
            return false;
        }
        if (!Objects.equals(children, other.children)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MenuListView").append('(');
        builder.append("id=").append(id);
        builder.append(", status=").append(status);
        builder.append(", createBy=").append(createBy);
        builder.append(", createDate=").append(createDate);
        builder.append(", updateBy=").append(updateBy);
        builder.append(", updateDate=").append(updateDate);
        builder.append(", remarks=").append(remarks);
        builder.append(", menuName=").append(menuName);
        builder.append(", menuType=").append(menuType);
        builder.append(", menuHref=").append(menuHref);
        builder.append(", menuComponent=").append(menuComponent);
        builder.append(", menuTarget=").append(menuTarget);
        builder.append(", menuIcon=").append(menuIcon);
        builder.append(", menuColor=").append(menuColor);
        builder.append(", menuTitle=").append(menuTitle);
        builder.append(", permission=").append(permission);
        builder.append(", weight=").append(weight);
        builder.append(", isShow=").append(isShow);
        builder.append(", sysCode=").append(sysCode);
        builder.append(", children=").append(children);
        builder.append(')');
        return builder.toString();
    }

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

        private static final DtoPropAccessor CHILDREN_ACCESSOR = new DtoPropAccessor(
            false,
            new int[] { MenuDraft.Producer.SLOT_CHILDREN },
            DtoPropAccessor.<Menu, TargetOf_children>objectListGetter(TargetOf_children::new),
            DtoPropAccessor.objectListSetter(TargetOf_children::toEntity)
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
            this.id = base.id();
            this.status = base.status();
            this.createBy = base.createBy();
            this.createDate = base.createDate();
            this.updateBy = base.updateBy();
            this.updateDate = base.updateDate();
            this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
            this.menuName = base.menuName();
            this.menuType = base.menuType();
            this.menuHref = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_HREF)) ? base.menuHref() : null;
            this.menuComponent = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_COMPONENT)) ? base.menuComponent() : null;
            this.menuTarget = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_TARGET)) ? base.menuTarget() : null;
            this.menuIcon = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_ICON)) ? base.menuIcon() : null;
            this.menuColor = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_COLOR)) ? base.menuColor() : null;
            this.menuTitle = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_TITLE)) ? base.menuTitle() : null;
            this.permission = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PERMISSION)) ? base.permission() : null;
            this.weight = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_WEIGHT)) ? base.weight() : null;
            this.isShow = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_IS_SHOW)) ? base.isShow() : null;
            this.sysCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_SYS_CODE)) ? base.sysCode() : null;
            this.children = CHILDREN_ACCESSOR.get(base);
        }

        public static TargetOf_children of(@org.jetbrains.annotations.NotNull Menu base) {
            return new TargetOf_children(base);
        }

        @org.jetbrains.annotations.NotNull
        public String getId() {
            return id;
        }

        public void setId(@org.jetbrains.annotations.NotNull String id) {
            this.id = id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        @org.jetbrains.annotations.NotNull
        public String getCreateBy() {
            return createBy;
        }

        public void setCreateBy(@org.jetbrains.annotations.NotNull String createBy) {
            this.createBy = createBy;
        }

        @org.jetbrains.annotations.NotNull
        public Date getCreateDate() {
            return createDate;
        }

        public void setCreateDate(@org.jetbrains.annotations.NotNull Date createDate) {
            this.createDate = createDate;
        }

        @org.jetbrains.annotations.NotNull
        public String getUpdateBy() {
            return updateBy;
        }

        public void setUpdateBy(@org.jetbrains.annotations.NotNull String updateBy) {
            this.updateBy = updateBy;
        }

        @org.jetbrains.annotations.NotNull
        public Date getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(@org.jetbrains.annotations.NotNull Date updateDate) {
            this.updateDate = updateDate;
        }

        @Nullable
        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(@Nullable String remarks) {
            this.remarks = remarks;
        }

        @org.jetbrains.annotations.NotNull
        public String getMenuName() {
            return menuName;
        }

        public void setMenuName(@org.jetbrains.annotations.NotNull String menuName) {
            this.menuName = menuName;
        }

        @org.jetbrains.annotations.NotNull
        public String getMenuType() {
            return menuType;
        }

        public void setMenuType(@org.jetbrains.annotations.NotNull String menuType) {
            this.menuType = menuType;
        }

        @Nullable
        public String getMenuHref() {
            return menuHref;
        }

        public void setMenuHref(@Nullable String menuHref) {
            this.menuHref = menuHref;
        }

        @Nullable
        public String getMenuComponent() {
            return menuComponent;
        }

        public void setMenuComponent(@Nullable String menuComponent) {
            this.menuComponent = menuComponent;
        }

        @Nullable
        public String getMenuTarget() {
            return menuTarget;
        }

        public void setMenuTarget(@Nullable String menuTarget) {
            this.menuTarget = menuTarget;
        }

        @Nullable
        public String getMenuIcon() {
            return menuIcon;
        }

        public void setMenuIcon(@Nullable String menuIcon) {
            this.menuIcon = menuIcon;
        }

        @Nullable
        public String getMenuColor() {
            return menuColor;
        }

        public void setMenuColor(@Nullable String menuColor) {
            this.menuColor = menuColor;
        }

        @Nullable
        public String getMenuTitle() {
            return menuTitle;
        }

        public void setMenuTitle(@Nullable String menuTitle) {
            this.menuTitle = menuTitle;
        }

        @Nullable
        public String getPermission() {
            return permission;
        }

        public void setPermission(@Nullable String permission) {
            this.permission = permission;
        }

        @Nullable
        public BigDecimal getWeight() {
            return weight;
        }

        public void setWeight(@Nullable BigDecimal weight) {
            this.weight = weight;
        }

        @Nullable
        public Boolean getIsShow() {
            return isShow;
        }

        public void setIsShow(@Nullable Boolean isShow) {
            this.isShow = isShow;
        }

        @Nullable
        public String getSysCode() {
            return sysCode;
        }

        public void setSysCode(@Nullable String sysCode) {
            this.sysCode = sysCode;
        }

        @Nullable
        public List<TargetOf_children> getChildren() {
            return children;
        }

        public void setChildren(@Nullable List<TargetOf_children> children) {
            this.children = children;
        }

        @Override
        public Menu toEntity() {
            return MenuDraft.$.produce(__draft -> {
                __draft.setId(id);
                __draft.setStatus(status);
                __draft.setCreateBy(createBy);
                __draft.setCreateDate(createDate);
                __draft.setUpdateBy(updateBy);
                __draft.setUpdateDate(updateDate);
                __draft.setRemarks(remarks);
                __draft.setMenuName(menuName);
                __draft.setMenuType(menuType);
                __draft.setMenuHref(menuHref);
                __draft.setMenuComponent(menuComponent);
                __draft.setMenuTarget(menuTarget);
                __draft.setMenuIcon(menuIcon);
                __draft.setMenuColor(menuColor);
                __draft.setMenuTitle(menuTitle);
                __draft.setPermission(permission);
                __draft.setWeight(weight);
                __draft.setIsShow(isShow);
                __draft.setSysCode(sysCode);
                CHILDREN_ACCESSOR.set(__draft, children != null ? children : Collections.emptyList());
            });
        }

        @Override
        public int hashCode() {
            int hash = Objects.hashCode(id);
            hash = hash * 31 + Integer.hashCode(status);
            hash = hash * 31 + Objects.hashCode(createBy);
            hash = hash * 31 + Objects.hashCode(createDate);
            hash = hash * 31 + Objects.hashCode(updateBy);
            hash = hash * 31 + Objects.hashCode(updateDate);
            hash = hash * 31 + Objects.hashCode(remarks);
            hash = hash * 31 + Objects.hashCode(menuName);
            hash = hash * 31 + Objects.hashCode(menuType);
            hash = hash * 31 + Objects.hashCode(menuHref);
            hash = hash * 31 + Objects.hashCode(menuComponent);
            hash = hash * 31 + Objects.hashCode(menuTarget);
            hash = hash * 31 + Objects.hashCode(menuIcon);
            hash = hash * 31 + Objects.hashCode(menuColor);
            hash = hash * 31 + Objects.hashCode(menuTitle);
            hash = hash * 31 + Objects.hashCode(permission);
            hash = hash * 31 + Objects.hashCode(weight);
            hash = hash * 31 + Objects.hashCode(isShow);
            hash = hash * 31 + Objects.hashCode(sysCode);
            hash = hash * 31 + Objects.hashCode(children);
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            TargetOf_children other = (TargetOf_children) o;
            if (!Objects.equals(id, other.id)) {
                return false;
            }
            if (status != other.status) {
                return false;
            }
            if (!Objects.equals(createBy, other.createBy)) {
                return false;
            }
            if (!Objects.equals(createDate, other.createDate)) {
                return false;
            }
            if (!Objects.equals(updateBy, other.updateBy)) {
                return false;
            }
            if (!Objects.equals(updateDate, other.updateDate)) {
                return false;
            }
            if (!Objects.equals(remarks, other.remarks)) {
                return false;
            }
            if (!Objects.equals(menuName, other.menuName)) {
                return false;
            }
            if (!Objects.equals(menuType, other.menuType)) {
                return false;
            }
            if (!Objects.equals(menuHref, other.menuHref)) {
                return false;
            }
            if (!Objects.equals(menuComponent, other.menuComponent)) {
                return false;
            }
            if (!Objects.equals(menuTarget, other.menuTarget)) {
                return false;
            }
            if (!Objects.equals(menuIcon, other.menuIcon)) {
                return false;
            }
            if (!Objects.equals(menuColor, other.menuColor)) {
                return false;
            }
            if (!Objects.equals(menuTitle, other.menuTitle)) {
                return false;
            }
            if (!Objects.equals(permission, other.permission)) {
                return false;
            }
            if (!Objects.equals(weight, other.weight)) {
                return false;
            }
            if (!Objects.equals(isShow, other.isShow)) {
                return false;
            }
            if (!Objects.equals(sysCode, other.sysCode)) {
                return false;
            }
            if (!Objects.equals(children, other.children)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("MenuListView").append('.');
            builder.append("TargetOf_children").append('(');
            builder.append("id=").append(id);
            builder.append(", status=").append(status);
            builder.append(", createBy=").append(createBy);
            builder.append(", createDate=").append(createDate);
            builder.append(", updateBy=").append(updateBy);
            builder.append(", updateDate=").append(updateDate);
            builder.append(", remarks=").append(remarks);
            builder.append(", menuName=").append(menuName);
            builder.append(", menuType=").append(menuType);
            builder.append(", menuHref=").append(menuHref);
            builder.append(", menuComponent=").append(menuComponent);
            builder.append(", menuTarget=").append(menuTarget);
            builder.append(", menuIcon=").append(menuIcon);
            builder.append(", menuColor=").append(menuColor);
            builder.append(", menuTitle=").append(menuTitle);
            builder.append(", permission=").append(permission);
            builder.append(", weight=").append(weight);
            builder.append(", isShow=").append(isShow);
            builder.append(", sysCode=").append(sysCode);
            builder.append(", children=").append(children);
            builder.append(')');
            return builder.toString();
        }
    }
}
