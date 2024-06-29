package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.babyfish.jimmer.View;
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

/**
 *  菜单表
 *
 *  @author yangwulang
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Menu.dto"
)
@Schema(
        description = "菜单实体"
)
public class MenuUserTreeView implements View<Menu> {
    public static final ViewMetadata<Menu, MenuUserTreeView> METADATA = 
        new ViewMetadata<Menu, MenuUserTreeView>(
            MenuFetcher.$
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
                .recursiveChildren()
                .parentId(),
            MenuUserTreeView::new
    );

    private static final DtoPropAccessor CHILDREN_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { MenuDraft.Producer.SLOT_CHILDREN },
        DtoPropAccessor.<Menu, MenuUserTreeView>objectListGetter(MenuUserTreeView::new),
        DtoPropAccessor.objectListSetter(MenuUserTreeView::toEntity)
    );

    private String id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

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

    private Boolean isShow;

    private String sysCode;

    private List<MenuUserTreeView> children;

    private String parentId;

    public MenuUserTreeView() {
    }

    public MenuUserTreeView(@NotNull Menu base) {
        this.id = base.id();
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
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
    }

    /**
     * 字典类型编码
     * @return 主键值
     */
    @NotNull
    public String getId() {
        if (id == null) {
            throw new IllegalStateException("The property \"id\" is not specified");
        }
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    /**
     * 创建者
     *
     * @return 创建者
     */
    @NotNull
    public String getCreateBy() {
        if (createBy == null) {
            throw new IllegalStateException("The property \"createBy\" is not specified");
        }
        return createBy;
    }

    public void setCreateBy(@NotNull String createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     *
     * @return 创建时间
     */
    @NotNull
    public Date getCreateDate() {
        if (createDate == null) {
            throw new IllegalStateException("The property \"createDate\" is not specified");
        }
        return createDate;
    }

    public void setCreateDate(@NotNull Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新者
     *
     * @return 更新者
     */
    @NotNull
    public String getUpdateBy() {
        if (updateBy == null) {
            throw new IllegalStateException("The property \"updateBy\" is not specified");
        }
        return updateBy;
    }

    public void setUpdateBy(@NotNull String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 更新时间
     *
     * @return 更新时间
     */
    @NotNull
    public Date getUpdateDate() {
        if (updateDate == null) {
            throw new IllegalStateException("The property \"updateDate\" is not specified");
        }
        return updateDate;
    }

    public void setUpdateDate(@NotNull Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 备注信息
     *
     * @return 备注信息
     */
    @Nullable
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(@Nullable String remarks) {
        this.remarks = remarks;
    }

    /**
     * 菜单名称
     */
    @NotNull
    @Schema(
            description = "菜单名称"
    )
    public String getMenuName() {
        if (menuName == null) {
            throw new IllegalStateException("The property \"menuName\" is not specified");
        }
        return menuName;
    }

    public void setMenuName(@NotNull String menuName) {
        this.menuName = menuName;
    }

    /**
     * 菜单类型（1菜单 2权限 3开发）
     */
    @NotNull
    @Schema(
            description = "菜单类型（1菜单 2权限 3开发）"
    )
    public String getMenuType() {
        if (menuType == null) {
            throw new IllegalStateException("The property \"menuType\" is not specified");
        }
        return menuType;
    }

    public void setMenuType(@NotNull String menuType) {
        this.menuType = menuType;
    }

    /**
     * 链接
     */
    @Nullable
    @Schema(
            description = "链接"
    )
    public String getMenuHref() {
        return menuHref;
    }

    public void setMenuHref(@Nullable String menuHref) {
        this.menuHref = menuHref;
    }

    /**
     * 组件地址
     */
    @Nullable
    @Schema(
            description = "组件地址"
    )
    public String getMenuComponent() {
        return menuComponent;
    }

    public void setMenuComponent(@Nullable String menuComponent) {
        this.menuComponent = menuComponent;
    }

    /**
     * 目标
     */
    @Nullable
    @Schema(
            description = "目标"
    )
    public String getMenuTarget() {
        return menuTarget;
    }

    public void setMenuTarget(@Nullable String menuTarget) {
        this.menuTarget = menuTarget;
    }

    /**
     * 图标
     */
    @Nullable
    @Schema(
            description = "图标"
    )
    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(@Nullable String menuIcon) {
        this.menuIcon = menuIcon;
    }

    /**
     * 颜色
     */
    @Nullable
    @Schema(
            description = "颜色"
    )
    public String getMenuColor() {
        return menuColor;
    }

    public void setMenuColor(@Nullable String menuColor) {
        this.menuColor = menuColor;
    }

    /**
     * 菜单标题
     */
    @Nullable
    @Schema(
            description = "菜单标题"
    )
    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(@Nullable String menuTitle) {
        this.menuTitle = menuTitle;
    }

    /**
     * 权限标识
     */
    @Nullable
    @Schema(
            description = "权限标识"
    )
    public String getPermission() {
        return permission;
    }

    public void setPermission(@Nullable String permission) {
        this.permission = permission;
    }

    /**
     * 菜单权重
     */
    @Nullable
    @Schema(
            description = "菜单权重"
    )
    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(@Nullable BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 是否显示
     */
    @Nullable
    @Schema(
            description = "是否显示"
    )
    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(@Nullable Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * 归属系统（default:主导航菜单、mobileApp:APP菜单）
     */
    @Nullable
    @Schema(
            description = "归属系统（default:主导航菜单、mobileApp:APP菜单）"
    )
    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(@Nullable String sysCode) {
        this.sysCode = sysCode;
    }

    @Nullable
    @Schema(
            description = "子级菜单"
    )
    public List<MenuUserTreeView> getChildren() {
        return children;
    }

    public void setChildren(@Nullable List<MenuUserTreeView> children) {
        this.children = children;
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
            __draft.setId(id);
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
            __draft.setParentId(parentId);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
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
        hash = hash * 31 + Objects.hashCode(parentId);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MenuUserTreeView other = (MenuUserTreeView) o;
        if (!Objects.equals(id, other.id)) {
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
        if (!Objects.equals(parentId, other.parentId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MenuUserTreeView").append('(');
        builder.append("id=").append(id);
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
        builder.append(", parentId=").append(parentId);
        builder.append(')');
        return builder.toString();
    }
}
