package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
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
import top.yangwulang.platform.entity.sys.Meta;

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
                .menuPath()
                .menuComponent()
                .menuTarget()
                .permission()
                .weight()
                .sysCode()
                .meta(),
            MenuSaveInput::new
    );

    private static final DtoPropAccessor ID_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { MenuDraft.Producer.SLOT_ID }
    );

    private String id;

    private String parentId;

    @FixedInputField
    private String menuName;

    @FixedInputField
    private String menuType;

    @FixedInputField
    private String menuPath;

    private String menuComponent;

    private String menuTarget;

    private String permission;

    private BigDecimal weight;

    private String sysCode;

    @FixedInputField
    private Meta meta;

    public MenuSaveInput() {
    }

    public MenuSaveInput(@NotNull Menu base) {
        this.id = ID_ACCESSOR.get(base);
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
        this.menuName = base.menuName();
        this.menuType = base.menuType();
        this.menuPath = base.menuPath();
        this.menuComponent = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_COMPONENT)) ? base.menuComponent() : null;
        this.menuTarget = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_TARGET)) ? base.menuTarget() : null;
        this.permission = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PERMISSION)) ? base.permission() : null;
        this.weight = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_WEIGHT)) ? base.weight() : null;
        this.sysCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_SYS_CODE)) ? base.sysCode() : null;
        this.meta = base.meta();
    }

    /**
     * 字典类型编码
     * @return 主键值
     */
    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
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

    @NotNull
    @Schema(
            description = "菜单路径"
    )
    public String getMenuPath() {
        if (menuPath == null) {
            throw new IllegalStateException("The property \"menuPath\" is not specified");
        }
        return menuPath;
    }

    public void setMenuPath(@NotNull String menuPath) {
        this.menuPath = menuPath;
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

    @NotNull
    @Schema(
            description = "菜单元数据"
    )
    public Meta getMeta() {
        if (meta == null) {
            throw new IllegalStateException("The property \"meta\" is not specified");
        }
        return meta;
    }

    public void setMeta(@NotNull Meta meta) {
        this.meta = meta;
    }

    @Override
    public Menu toEntity() {
        return MenuDraft.$.produce(__draft -> {
            ID_ACCESSOR.set(__draft, id);
            __draft.setParentId(parentId);
            __draft.setMenuName(menuName);
            __draft.setMenuType(menuType);
            __draft.setMenuPath(menuPath);
            __draft.setMenuComponent(menuComponent);
            __draft.setMenuTarget(menuTarget);
            __draft.setPermission(permission);
            __draft.setWeight(weight);
            __draft.setSysCode(sysCode);
            __draft.setMeta(meta);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(parentId);
        hash = hash * 31 + Objects.hashCode(menuName);
        hash = hash * 31 + Objects.hashCode(menuType);
        hash = hash * 31 + Objects.hashCode(menuPath);
        hash = hash * 31 + Objects.hashCode(menuComponent);
        hash = hash * 31 + Objects.hashCode(menuTarget);
        hash = hash * 31 + Objects.hashCode(permission);
        hash = hash * 31 + Objects.hashCode(weight);
        hash = hash * 31 + Objects.hashCode(sysCode);
        hash = hash * 31 + Objects.hashCode(meta);
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
        if (!Objects.equals(menuPath, other.menuPath)) {
            return false;
        }
        if (!Objects.equals(menuComponent, other.menuComponent)) {
            return false;
        }
        if (!Objects.equals(menuTarget, other.menuTarget)) {
            return false;
        }
        if (!Objects.equals(permission, other.permission)) {
            return false;
        }
        if (!Objects.equals(weight, other.weight)) {
            return false;
        }
        if (!Objects.equals(sysCode, other.sysCode)) {
            return false;
        }
        if (!Objects.equals(meta, other.meta)) {
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
        builder.append(", menuPath=").append(menuPath);
        builder.append(", menuComponent=").append(menuComponent);
        builder.append(", menuTarget=").append(menuTarget);
        builder.append(", permission=").append(permission);
        builder.append(", weight=").append(weight);
        builder.append(", sysCode=").append(sysCode);
        builder.append(", meta=").append(meta);
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

        private String menuPath;

        private String menuComponent;

        private String menuTarget;

        private String permission;

        private BigDecimal weight;

        private String sysCode;

        private Meta meta;

        public Builder id(String id) {
            this.id = id;
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

        public Builder menuPath(String menuPath) {
            this.menuPath = Objects.requireNonNull(menuPath, "The property \"menuPath\" cannot be null");
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

        public Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        public Builder weight(BigDecimal weight) {
            this.weight = weight;
            return this;
        }

        public Builder sysCode(String sysCode) {
            this.sysCode = sysCode;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = Objects.requireNonNull(meta, "The property \"meta\" cannot be null");
            return this;
        }

        public MenuSaveInput build() {
            MenuSaveInput _input = new MenuSaveInput();
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
            if (menuPath == null) {
                throw Input.unknownNonNullProperty(MenuSaveInput.class, "menuPath");
            }
            _input.setMenuPath(menuPath);
            _input.setMenuComponent(menuComponent);
            _input.setMenuTarget(menuTarget);
            _input.setPermission(permission);
            _input.setWeight(weight);
            _input.setSysCode(sysCode);
            if (meta == null) {
                throw Input.unknownNonNullProperty(MenuSaveInput.class, "meta");
            }
            _input.setMeta(meta);
            return _input;
        }
    }
}
