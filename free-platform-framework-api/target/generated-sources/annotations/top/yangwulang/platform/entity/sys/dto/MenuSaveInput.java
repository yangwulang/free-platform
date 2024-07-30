package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.internal.FixedInputField;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.MenuFetcher;

/**
 * 菜单表
 *
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Menu.dto"
)
@JsonDeserialize(
        builder = MenuSaveInput.Builder.class
)
@Schema(
        description = "菜单实体"
)
public class MenuSaveInput implements Input<Menu> {
    public static final DtoMetadata<Menu, MenuSaveInput> METADATA = 
        new DtoMetadata<Menu, MenuSaveInput>(
            MenuFetcher.$
                .parentId()
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
            MenuSaveInput::new
    );

    @FixedInputField
    private String id;

    private String parentId;

    @FixedInputField
    private String menuName;

    @FixedInputField
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

    public MenuSaveInput() {
    }

    public MenuSaveInput(@NotNull Menu base) {
        this.id = base.id();
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
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

    @Nullable
    public String getParentId() {
        return parentId;
    }

    public void setParentId(@Nullable String parentId) {
        this.parentId = parentId;
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

    @Override
    public Menu toEntity() {
        return MenuDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setParentId(parentId);
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
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(parentId);
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
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MenuSaveInput other = (MenuSaveInput) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(parentId, other.parentId)) {
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
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MenuSaveInput").append('(');
        builder.append("id=").append(id);
        builder.append(", parentId=").append(parentId);
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
        builder.append(')');
        return builder.toString();
    }

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String id;

        private String parentId;

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

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id, "The property \"id\" cannot be null");
            return this;
        }

        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder menuName(String menuName) {
            this.menuName = Objects.requireNonNull(menuName, "The property \"menuName\" cannot be null");
            return this;
        }

        public Builder menuType(String menuType) {
            this.menuType = Objects.requireNonNull(menuType, "The property \"menuType\" cannot be null");
            return this;
        }

        public Builder menuHref(String menuHref) {
            this.menuHref = menuHref;
            return this;
        }

        public Builder menuComponent(String menuComponent) {
            this.menuComponent = menuComponent;
            return this;
        }

        public Builder menuTarget(String menuTarget) {
            this.menuTarget = menuTarget;
            return this;
        }

        public Builder menuIcon(String menuIcon) {
            this.menuIcon = menuIcon;
            return this;
        }

        public Builder menuColor(String menuColor) {
            this.menuColor = menuColor;
            return this;
        }

        public Builder menuTitle(String menuTitle) {
            this.menuTitle = menuTitle;
            return this;
        }

        public Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        public Builder weight(BigDecimal weight) {
            this.weight = weight;
            return this;
        }

        public Builder isShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }

        public Builder sysCode(String sysCode) {
            this.sysCode = sysCode;
            return this;
        }

        public MenuSaveInput build() {
            MenuSaveInput _input = new MenuSaveInput();
            if (id == null) {
                throw Input.unknownNonNullProperty(MenuSaveInput.class, "id");
            }
            _input.setId(id);
            _input.setParentId(parentId);
            if (menuName == null) {
                throw Input.unknownNonNullProperty(MenuSaveInput.class, "menuName");
            }
            _input.setMenuName(menuName);
            if (menuType == null) {
                throw Input.unknownNonNullProperty(MenuSaveInput.class, "menuType");
            }
            _input.setMenuType(menuType);
            _input.setMenuHref(menuHref);
            _input.setMenuComponent(menuComponent);
            _input.setMenuTarget(menuTarget);
            _input.setMenuIcon(menuIcon);
            _input.setMenuColor(menuColor);
            _input.setMenuTitle(menuTitle);
            _input.setPermission(permission);
            _input.setWeight(weight);
            _input.setIsShow(isShow);
            _input.setSysCode(sysCode);
            return _input;
        }
    }
}
