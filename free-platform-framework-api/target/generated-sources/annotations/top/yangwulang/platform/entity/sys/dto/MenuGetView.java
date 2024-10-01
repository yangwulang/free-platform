package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Objects;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
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
@Schema(
        description = "菜单实体"
)
public class MenuGetView implements View<Menu> {
    public static final DtoMetadata<Menu, MenuGetView> METADATA = 
        new DtoMetadata<Menu, MenuGetView>(
            MenuFetcher.$
                .menuName()
                .menuType()
                .menuComponent()
                .menuTarget()
                .menuPath()
                .permission()
                .weight()
                .sysCode()
                .parentId()
                .parent(TargetOf_parent.METADATA.getFetcher())
                .meta(),
            MenuGetView::new
    );

    private static final DtoPropAccessor ID_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { MenuDraft.Producer.SLOT_ID }
    );

    private static final DtoPropAccessor MENU_NAME_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { MenuDraft.Producer.SLOT_MENU_NAME }
    );

    private static final DtoPropAccessor MENU_TYPE_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { MenuDraft.Producer.SLOT_MENU_TYPE }
    );

    private static final DtoPropAccessor PARENT_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] { MenuDraft.Producer.SLOT_PARENT },
        DtoPropAccessor.<Menu, TargetOf_parent>objectReferenceGetter(TargetOf_parent::new),
        DtoPropAccessor.objectReferenceSetter(TargetOf_parent::toEntity)
    );

    @Schema(
            description = "登录编码"
    )
    private String id;

    private String menuName;

    private String menuType;

    private String menuComponent;

    private String menuTarget;

    private String menuPath;

    private String permission;

    private BigDecimal weight;

    private String sysCode;

    private String parentId;

    private TargetOf_parent parent;

    private Meta meta;

    public MenuGetView() {
    }

    public MenuGetView(@NotNull Menu base) {
        this.id = ID_ACCESSOR.get(base);
        this.menuName = MENU_NAME_ACCESSOR.get(base);
        this.menuType = MENU_TYPE_ACCESSOR.get(base);
        this.menuComponent = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_COMPONENT)) ? base.menuComponent() : null;
        this.menuTarget = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_MENU_TARGET)) ? base.menuTarget() : null;
        this.menuPath = base.menuPath();
        this.permission = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PERMISSION)) ? base.permission() : null;
        this.weight = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_WEIGHT)) ? base.weight() : null;
        this.sysCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_SYS_CODE)) ? base.sysCode() : null;
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MenuDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
        this.parent = PARENT_ACCESSOR.get(base);
        this.meta = base.meta();
    }

    /**
     * 字典类型编码
     * @return 主键值
     */
    @Nullable
    @Schema(
            description = "登录编码"
    )
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
    }

    /**
     * 菜单名称
     */
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

    /**
     * 菜单类型（1菜单 2权限 3开发）
     */
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

    @Nullable
    public String getParentId() {
        return parentId;
    }

    public void setParentId(@Nullable String parentId) {
        this.parentId = parentId;
    }

    /**
     * 父级编号
     */
    @Nullable
    @Schema(
            description = "父级菜单"
    )
    public TargetOf_parent getParent() {
        return parent;
    }

    public void setParent(@Nullable TargetOf_parent parent) {
        this.parent = parent;
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
            MENU_NAME_ACCESSOR.set(__draft, menuName);
            MENU_TYPE_ACCESSOR.set(__draft, menuType);
            __draft.setMenuComponent(menuComponent);
            __draft.setMenuTarget(menuTarget);
            __draft.setMenuPath(menuPath);
            __draft.setPermission(permission);
            __draft.setWeight(weight);
            __draft.setSysCode(sysCode);
            __draft.setParentId(parentId);
            PARENT_ACCESSOR.set(__draft, parent);
            __draft.setMeta(meta);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(menuName);
        hash = hash * 31 + Objects.hashCode(menuType);
        hash = hash * 31 + Objects.hashCode(menuComponent);
        hash = hash * 31 + Objects.hashCode(menuTarget);
        hash = hash * 31 + Objects.hashCode(menuPath);
        hash = hash * 31 + Objects.hashCode(permission);
        hash = hash * 31 + Objects.hashCode(weight);
        hash = hash * 31 + Objects.hashCode(sysCode);
        hash = hash * 31 + Objects.hashCode(parentId);
        hash = hash * 31 + Objects.hashCode(parent);
        hash = hash * 31 + Objects.hashCode(meta);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MenuGetView other = (MenuGetView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(menuName, other.menuName)) {
            return false;
        }
        if (!Objects.equals(menuType, other.menuType)) {
            return false;
        }
        if (!Objects.equals(menuComponent, other.menuComponent)) {
            return false;
        }
        if (!Objects.equals(menuTarget, other.menuTarget)) {
            return false;
        }
        if (!Objects.equals(menuPath, other.menuPath)) {
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
        if (!Objects.equals(parentId, other.parentId)) {
            return false;
        }
        if (!Objects.equals(parent, other.parent)) {
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
        builder.append("MenuGetView").append('(');
        builder.append("id=").append(id);
        builder.append(", menuName=").append(menuName);
        builder.append(", menuType=").append(menuType);
        builder.append(", menuComponent=").append(menuComponent);
        builder.append(", menuTarget=").append(menuTarget);
        builder.append(", menuPath=").append(menuPath);
        builder.append(", permission=").append(permission);
        builder.append(", weight=").append(weight);
        builder.append(", sysCode=").append(sysCode);
        builder.append(", parentId=").append(parentId);
        builder.append(", parent=").append(parent);
        builder.append(", meta=").append(meta);
        builder.append(')');
        return builder.toString();
    }

    /**
     * 菜单表
     *
     */
    @GeneratedBy
    @Schema(
            description = "菜单实体"
    )
    public static class TargetOf_parent implements View<Menu> {
        public static final DtoMetadata<Menu, TargetOf_parent> METADATA = 
            new DtoMetadata<Menu, TargetOf_parent>(
                MenuFetcher.$
                    .menuName(),
                TargetOf_parent::new
        );

        private static final DtoPropAccessor MENU_NAME_ACCESSOR = new DtoPropAccessor(
            false,
            new int[] { MenuDraft.Producer.SLOT_MENU_NAME }
        );

        private String menuName;

        public TargetOf_parent() {
        }

        public TargetOf_parent(@NotNull Menu base) {
            this.menuName = MENU_NAME_ACCESSOR.get(base);
        }

        /**
         * 菜单名称
         */
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

        @Override
        public Menu toEntity() {
            return MenuDraft.$.produce(__draft -> {
                MENU_NAME_ACCESSOR.set(__draft, menuName);
            });
        }

        @Override
        public int hashCode() {
            int hash = Objects.hashCode(menuName);
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            TargetOf_parent other = (TargetOf_parent) o;
            if (!Objects.equals(menuName, other.menuName)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("MenuGetView.TargetOf_parent").append('(');
            builder.append("menuName=").append(menuName);
            builder.append(')');
            return builder.toString();
        }
    }
}
