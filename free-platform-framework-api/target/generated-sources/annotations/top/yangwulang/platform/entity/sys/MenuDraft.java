package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;
import org.babyfish.jimmer.runtime.NonSharedList;
import org.babyfish.jimmer.runtime.Visibility;
import org.babyfish.jimmer.sql.ManyToMany;
import org.babyfish.jimmer.sql.ManyToOne;
import org.babyfish.jimmer.sql.OneToMany;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.DataTypeBaseDraft;

@GeneratedBy(
        type = Menu.class
)
public interface MenuDraft extends Menu, DataTypeBaseDraft {
    MenuDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    MenuDraft setId(String id);

    @OldChain
    MenuDraft setStatus(int status);

    @OldChain
    MenuDraft setCreateBy(String createBy);

    @OldChain
    MenuDraft setCreateDate(Date createDate);

    @OldChain
    MenuDraft setUpdateBy(String updateBy);

    @OldChain
    MenuDraft setUpdateDate(Date updateDate);

    @OldChain
    MenuDraft setRemarks(String remarks);

    @Nullable
    MenuDraft parent();

    MenuDraft parent(boolean autoCreate);

    @OldChain
    MenuDraft setParent(Menu parent);

    @OldChain
    MenuDraft applyParent(DraftConsumer<MenuDraft> block);

    @OldChain
    MenuDraft applyParent(Menu base, DraftConsumer<MenuDraft> block);

    @OldChain
    MenuDraft setParentId(String parentId);

    List<MenuDraft> children(boolean autoCreate);

    @OldChain
    MenuDraft setChildren(List<Menu> children);

    @OldChain
    MenuDraft addIntoChildren(DraftConsumer<MenuDraft> block);

    @OldChain
    MenuDraft addIntoChildren(Menu base, DraftConsumer<MenuDraft> block);

    @OldChain
    MenuDraft setMenuName(String menuName);

    @OldChain
    MenuDraft setMenuType(String menuType);

    @OldChain
    MenuDraft setMenuHref(String menuHref);

    @OldChain
    MenuDraft setMenuComponent(String menuComponent);

    @OldChain
    MenuDraft setMenuTarget(String menuTarget);

    @OldChain
    MenuDraft setMenuIcon(String menuIcon);

    @OldChain
    MenuDraft setMenuColor(String menuColor);

    @OldChain
    MenuDraft setMenuTitle(String menuTitle);

    @OldChain
    MenuDraft setPermission(String permission);

    @OldChain
    MenuDraft setWeight(BigDecimal weight);

    @OldChain
    MenuDraft setIsShow(Boolean isShow);

    @OldChain
    MenuDraft setSysCode(String sysCode);

    List<RoleDraft> roles(boolean autoCreate);

    @OldChain
    MenuDraft setRoles(List<Role> roles);

    @OldChain
    MenuDraft addIntoRoles(DraftConsumer<RoleDraft> block);

    @OldChain
    MenuDraft addIntoRoles(Role base, DraftConsumer<RoleDraft> block);

    @GeneratedBy(
            type = Menu.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_STATUS = 1;

        public static final int SLOT_CREATE_BY = 2;

        public static final int SLOT_CREATE_DATE = 3;

        public static final int SLOT_UPDATE_BY = 4;

        public static final int SLOT_UPDATE_DATE = 5;

        public static final int SLOT_REMARKS = 6;

        public static final int SLOT_PARENT = 7;

        public static final int SLOT_PARENT_ID = 8;

        public static final int SLOT_CHILDREN = 9;

        public static final int SLOT_MENU_NAME = 10;

        public static final int SLOT_MENU_TYPE = 11;

        public static final int SLOT_MENU_HREF = 12;

        public static final int SLOT_MENU_COMPONENT = 13;

        public static final int SLOT_MENU_TARGET = 14;

        public static final int SLOT_MENU_ICON = 15;

        public static final int SLOT_MENU_COLOR = 16;

        public static final int SLOT_MENU_TITLE = 17;

        public static final int SLOT_PERMISSION = 18;

        public static final int SLOT_WEIGHT = 19;

        public static final int SLOT_IS_SHOW = 20;

        public static final int SLOT_SYS_CODE = 21;

        public static final int SLOT_ROLES = 22;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.130",
                Menu.class,
                Collections.singleton(DataTypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (Menu)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("status", SLOT_STATUS)
            .redefine("createBy", SLOT_CREATE_BY)
            .redefine("createDate", SLOT_CREATE_DATE)
            .redefine("updateBy", SLOT_UPDATE_BY)
            .redefine("updateDate", SLOT_UPDATE_DATE)
            .redefine("remarks", SLOT_REMARKS)
            .keyReference(SLOT_PARENT, "parent", ManyToOne.class, Menu.class, true)
            .add(SLOT_PARENT_ID, "parentId", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CHILDREN, "children", OneToMany.class, Menu.class, false)
            .add(SLOT_MENU_NAME, "menuName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_MENU_TYPE, "menuType", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_MENU_HREF, "menuHref", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_MENU_COMPONENT, "menuComponent", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_MENU_TARGET, "menuTarget", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_MENU_ICON, "menuIcon", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_MENU_COLOR, "menuColor", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_MENU_TITLE, "menuTitle", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_PERMISSION, "permission", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_WEIGHT, "weight", ImmutablePropCategory.SCALAR, BigDecimal.class, true)
            .add(SLOT_IS_SHOW, "isShow", ImmutablePropCategory.SCALAR, Boolean.class, true)
            .add(SLOT_SYS_CODE, "sysCode", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_ROLES, "roles", ManyToMany.class, Role.class, false)
            .build();

        private Producer() {
        }

        public Menu produce(DraftConsumer<MenuDraft> block) {
            return produce(null, block);
        }

        public Menu produce(Menu base, DraftConsumer<MenuDraft> block) {
            return (Menu)Internal.produce(TYPE, base, block);
        }

        @GeneratedBy(
                type = Menu.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "status", "createBy", "createDate", "updateBy", "updateDate", "remarks", "parent", "parentId", "children", "menuName", "menuType", "menuHref", "menuComponent", "menuTarget", "menuIcon", "menuColor", "menuTitle", "permission", "weight", "isShow", "sysCode", "roles"})
        public abstract interface Implementor extends Menu, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
                    case SLOT_STATUS:
                    		return (Integer)status();
                    case SLOT_CREATE_BY:
                    		return createBy();
                    case SLOT_CREATE_DATE:
                    		return createDate();
                    case SLOT_UPDATE_BY:
                    		return updateBy();
                    case SLOT_UPDATE_DATE:
                    		return updateDate();
                    case SLOT_REMARKS:
                    		return remarks();
                    case SLOT_PARENT:
                    		return parent();
                    case SLOT_PARENT_ID:
                    		return parentId();
                    case SLOT_CHILDREN:
                    		return children();
                    case SLOT_MENU_NAME:
                    		return menuName();
                    case SLOT_MENU_TYPE:
                    		return menuType();
                    case SLOT_MENU_HREF:
                    		return menuHref();
                    case SLOT_MENU_COMPONENT:
                    		return menuComponent();
                    case SLOT_MENU_TARGET:
                    		return menuTarget();
                    case SLOT_MENU_ICON:
                    		return menuIcon();
                    case SLOT_MENU_COLOR:
                    		return menuColor();
                    case SLOT_MENU_TITLE:
                    		return menuTitle();
                    case SLOT_PERMISSION:
                    		return permission();
                    case SLOT_WEIGHT:
                    		return weight();
                    case SLOT_IS_SHOW:
                    		return isShow();
                    case SLOT_SYS_CODE:
                    		return sysCode();
                    case SLOT_ROLES:
                    		return roles();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Menu\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
                    case "status":
                    		return (Integer)status();
                    case "createBy":
                    		return createBy();
                    case "createDate":
                    		return createDate();
                    case "updateBy":
                    		return updateBy();
                    case "updateDate":
                    		return updateDate();
                    case "remarks":
                    		return remarks();
                    case "parent":
                    		return parent();
                    case "parentId":
                    		return parentId();
                    case "children":
                    		return children();
                    case "menuName":
                    		return menuName();
                    case "menuType":
                    		return menuType();
                    case "menuHref":
                    		return menuHref();
                    case "menuComponent":
                    		return menuComponent();
                    case "menuTarget":
                    		return menuTarget();
                    case "menuIcon":
                    		return menuIcon();
                    case "menuColor":
                    		return menuColor();
                    case "menuTitle":
                    		return menuTitle();
                    case "permission":
                    		return permission();
                    case "weight":
                    		return weight();
                    case "isShow":
                    		return isShow();
                    case "sysCode":
                    		return sysCode();
                    case "roles":
                    		return roles();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Menu\": \"" + prop + "\"");
                }
            }

            @NotNull
            default String getId() {
                return id();
            }

            @Schema(
                    description = "状态"
            )
            default int getStatus() {
                return status();
            }

            @NotNull
            default String getCreateBy() {
                return createBy();
            }

            @NotNull
            default Date getCreateDate() {
                return createDate();
            }

            @NotNull
            default String getUpdateBy() {
                return updateBy();
            }

            @NotNull
            default Date getUpdateDate() {
                return updateDate();
            }

            @Nullable
            default String getRemarks() {
                return remarks();
            }

            @Schema(
                    description = "父级菜单"
            )
            @jakarta.annotation.Nullable
            default Menu getParent() {
                return parent();
            }

            @jakarta.annotation.Nullable
            default String getParentId() {
                return parentId();
            }

            @Schema(
                    description = "子级菜单"
            )
            default List<Menu> getChildren() {
                return children();
            }

            @Schema(
                    description = "菜单名称"
            )
            default String getMenuName() {
                return menuName();
            }

            @Schema(
                    description = "菜单类型（1菜单 2权限 3开发）"
            )
            default String getMenuType() {
                return menuType();
            }

            @Schema(
                    description = "链接"
            )
            @jakarta.annotation.Nullable
            default String getMenuHref() {
                return menuHref();
            }

            @Schema(
                    description = "组件地址"
            )
            @jakarta.annotation.Nullable
            default String getMenuComponent() {
                return menuComponent();
            }

            @Schema(
                    description = "目标"
            )
            @jakarta.annotation.Nullable
            default String getMenuTarget() {
                return menuTarget();
            }

            @Schema(
                    description = "图标"
            )
            @jakarta.annotation.Nullable
            default String getMenuIcon() {
                return menuIcon();
            }

            @Schema(
                    description = "颜色"
            )
            @jakarta.annotation.Nullable
            default String getMenuColor() {
                return menuColor();
            }

            @Schema(
                    description = "菜单标题"
            )
            @jakarta.annotation.Nullable
            default String getMenuTitle() {
                return menuTitle();
            }

            @Schema(
                    description = "权限标识"
            )
            @jakarta.annotation.Nullable
            default String getPermission() {
                return permission();
            }

            @Schema(
                    description = "菜单权重"
            )
            @jakarta.annotation.Nullable
            default BigDecimal getWeight() {
                return weight();
            }

            @Schema(
                    description = "是否显示"
            )
            @jakarta.annotation.Nullable
            default Boolean getIsShow() {
                return isShow();
            }

            @Schema(
                    description = "归属系统（default:主导航菜单、mobileApp:APP菜单）"
            )
            @jakarta.annotation.Nullable
            default String getSysCode() {
                return sysCode();
            }

            default List<Role> getRoles() {
                return roles();
            }

            @Override
            default ImmutableType __type() {
                return TYPE;
            }

            default int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        @GeneratedBy(
                type = Menu.class
        )
        private static class Impl implements Implementor, Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            int __statusValue;

            boolean __statusLoaded = false;

            String __createByValue;

            Date __createDateValue;

            String __updateByValue;

            Date __updateDateValue;

            String __remarksValue;

            boolean __remarksLoaded = false;

            Menu __parentValue;

            boolean __parentLoaded = false;

            NonSharedList<Menu> __childrenValue;

            String __menuNameValue;

            String __menuTypeValue;

            String __menuHrefValue;

            boolean __menuHrefLoaded = false;

            String __menuComponentValue;

            boolean __menuComponentLoaded = false;

            String __menuTargetValue;

            boolean __menuTargetLoaded = false;

            String __menuIconValue;

            boolean __menuIconLoaded = false;

            String __menuColorValue;

            boolean __menuColorLoaded = false;

            String __menuTitleValue;

            boolean __menuTitleLoaded = false;

            String __permissionValue;

            boolean __permissionLoaded = false;

            BigDecimal __weightValue;

            boolean __weightLoaded = false;

            Boolean __isShowValue;

            boolean __isShowLoaded = false;

            String __sysCodeValue;

            boolean __sysCodeLoaded = false;

            NonSharedList<Role> __rolesValue;

            Impl() {
                __visibility = Visibility.of(23);
                __visibility.show(SLOT_PARENT_ID, false);
            }

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(Menu.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public int status() {
                if (!__statusLoaded) {
                    throw new UnloadedException(Menu.class, "status");
                }
                return __statusValue;
            }

            @Override
            @JsonIgnore
            public String createBy() {
                if (__createByValue == null) {
                    throw new UnloadedException(Menu.class, "createBy");
                }
                return __createByValue;
            }

            @Override
            @JsonIgnore
            public Date createDate() {
                if (__createDateValue == null) {
                    throw new UnloadedException(Menu.class, "createDate");
                }
                return __createDateValue;
            }

            @Override
            @JsonIgnore
            public String updateBy() {
                if (__updateByValue == null) {
                    throw new UnloadedException(Menu.class, "updateBy");
                }
                return __updateByValue;
            }

            @Override
            @JsonIgnore
            public Date updateDate() {
                if (__updateDateValue == null) {
                    throw new UnloadedException(Menu.class, "updateDate");
                }
                return __updateDateValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String remarks() {
                if (!__remarksLoaded) {
                    throw new UnloadedException(Menu.class, "remarks");
                }
                return __remarksValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Menu parent() {
                if (!__parentLoaded) {
                    throw new UnloadedException(Menu.class, "parent");
                }
                return __parentValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String parentId() {
                Menu __target = parent();
                return __target != null ? __target.id() : null;
            }

            @Override
            @JsonIgnore
            public List<Menu> children() {
                if (__childrenValue == null) {
                    throw new UnloadedException(Menu.class, "children");
                }
                return __childrenValue;
            }

            @Override
            @JsonIgnore
            public String menuName() {
                if (__menuNameValue == null) {
                    throw new UnloadedException(Menu.class, "menuName");
                }
                return __menuNameValue;
            }

            @Override
            @JsonIgnore
            public String menuType() {
                if (__menuTypeValue == null) {
                    throw new UnloadedException(Menu.class, "menuType");
                }
                return __menuTypeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuHref() {
                if (!__menuHrefLoaded) {
                    throw new UnloadedException(Menu.class, "menuHref");
                }
                return __menuHrefValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuComponent() {
                if (!__menuComponentLoaded) {
                    throw new UnloadedException(Menu.class, "menuComponent");
                }
                return __menuComponentValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuTarget() {
                if (!__menuTargetLoaded) {
                    throw new UnloadedException(Menu.class, "menuTarget");
                }
                return __menuTargetValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuIcon() {
                if (!__menuIconLoaded) {
                    throw new UnloadedException(Menu.class, "menuIcon");
                }
                return __menuIconValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuColor() {
                if (!__menuColorLoaded) {
                    throw new UnloadedException(Menu.class, "menuColor");
                }
                return __menuColorValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuTitle() {
                if (!__menuTitleLoaded) {
                    throw new UnloadedException(Menu.class, "menuTitle");
                }
                return __menuTitleValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String permission() {
                if (!__permissionLoaded) {
                    throw new UnloadedException(Menu.class, "permission");
                }
                return __permissionValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public BigDecimal weight() {
                if (!__weightLoaded) {
                    throw new UnloadedException(Menu.class, "weight");
                }
                return __weightValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Boolean isShow() {
                if (!__isShowLoaded) {
                    throw new UnloadedException(Menu.class, "isShow");
                }
                return __isShowValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String sysCode() {
                if (!__sysCodeLoaded) {
                    throw new UnloadedException(Menu.class, "sysCode");
                }
                return __sysCodeValue;
            }

            @Override
            @JsonIgnore
            public List<Role> roles() {
                if (__rolesValue == null) {
                    throw new UnloadedException(Menu.class, "roles");
                }
                return __rolesValue;
            }

            @Override
            public Impl clone() {
                try {
                    return (Impl)super.clone();
                } catch(CloneNotSupportedException ex) {
                    throw new AssertionError(ex);
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isLoaded(prop.asName());
                    case SLOT_ID:
                    		return __idValue != null;
                    case SLOT_STATUS:
                    		return __statusLoaded;
                    case SLOT_CREATE_BY:
                    		return __createByValue != null;
                    case SLOT_CREATE_DATE:
                    		return __createDateValue != null;
                    case SLOT_UPDATE_BY:
                    		return __updateByValue != null;
                    case SLOT_UPDATE_DATE:
                    		return __updateDateValue != null;
                    case SLOT_REMARKS:
                    		return __remarksLoaded;
                    case SLOT_PARENT:
                    		return __parentLoaded;
                    case SLOT_PARENT_ID:
                    		return __isLoaded(PropId.byIndex(SLOT_PARENT)) && (parent() == null || 
                            	((ImmutableSpi)parent()).__isLoaded(PropId.byIndex(Producer.SLOT_ID)));
                    case SLOT_CHILDREN:
                    		return __childrenValue != null;
                    case SLOT_MENU_NAME:
                    		return __menuNameValue != null;
                    case SLOT_MENU_TYPE:
                    		return __menuTypeValue != null;
                    case SLOT_MENU_HREF:
                    		return __menuHrefLoaded;
                    case SLOT_MENU_COMPONENT:
                    		return __menuComponentLoaded;
                    case SLOT_MENU_TARGET:
                    		return __menuTargetLoaded;
                    case SLOT_MENU_ICON:
                    		return __menuIconLoaded;
                    case SLOT_MENU_COLOR:
                    		return __menuColorLoaded;
                    case SLOT_MENU_TITLE:
                    		return __menuTitleLoaded;
                    case SLOT_PERMISSION:
                    		return __permissionLoaded;
                    case SLOT_WEIGHT:
                    		return __weightLoaded;
                    case SLOT_IS_SHOW:
                    		return __isShowLoaded;
                    case SLOT_SYS_CODE:
                    		return __sysCodeLoaded;
                    case SLOT_ROLES:
                    		return __rolesValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Menu\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
                    case "status":
                    		return __statusLoaded;
                    case "createBy":
                    		return __createByValue != null;
                    case "createDate":
                    		return __createDateValue != null;
                    case "updateBy":
                    		return __updateByValue != null;
                    case "updateDate":
                    		return __updateDateValue != null;
                    case "remarks":
                    		return __remarksLoaded;
                    case "parent":
                    		return __parentLoaded;
                    case "parentId":
                    		return __isLoaded(PropId.byIndex(SLOT_PARENT)) && (parent() == null || 
                            	((ImmutableSpi)parent()).__isLoaded(PropId.byIndex(Producer.SLOT_ID)));
                    case "children":
                    		return __childrenValue != null;
                    case "menuName":
                    		return __menuNameValue != null;
                    case "menuType":
                    		return __menuTypeValue != null;
                    case "menuHref":
                    		return __menuHrefLoaded;
                    case "menuComponent":
                    		return __menuComponentLoaded;
                    case "menuTarget":
                    		return __menuTargetLoaded;
                    case "menuIcon":
                    		return __menuIconLoaded;
                    case "menuColor":
                    		return __menuColorLoaded;
                    case "menuTitle":
                    		return __menuTitleLoaded;
                    case "permission":
                    		return __permissionLoaded;
                    case "weight":
                    		return __weightLoaded;
                    case "isShow":
                    		return __isShowLoaded;
                    case "sysCode":
                    		return __sysCodeLoaded;
                    case "roles":
                    		return __rolesValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Menu\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isVisible(PropId prop) {
                if (__visibility == null) {
                    return true;
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isVisible(prop.asName());
                    case SLOT_ID:
                    		return __visibility.visible(SLOT_ID);
                    case SLOT_STATUS:
                    		return __visibility.visible(SLOT_STATUS);
                    case SLOT_CREATE_BY:
                    		return __visibility.visible(SLOT_CREATE_BY);
                    case SLOT_CREATE_DATE:
                    		return __visibility.visible(SLOT_CREATE_DATE);
                    case SLOT_UPDATE_BY:
                    		return __visibility.visible(SLOT_UPDATE_BY);
                    case SLOT_UPDATE_DATE:
                    		return __visibility.visible(SLOT_UPDATE_DATE);
                    case SLOT_REMARKS:
                    		return __visibility.visible(SLOT_REMARKS);
                    case SLOT_PARENT:
                    		return __visibility.visible(SLOT_PARENT);
                    case SLOT_PARENT_ID:
                    		return __visibility.visible(SLOT_PARENT_ID);
                    case SLOT_CHILDREN:
                    		return __visibility.visible(SLOT_CHILDREN);
                    case SLOT_MENU_NAME:
                    		return __visibility.visible(SLOT_MENU_NAME);
                    case SLOT_MENU_TYPE:
                    		return __visibility.visible(SLOT_MENU_TYPE);
                    case SLOT_MENU_HREF:
                    		return __visibility.visible(SLOT_MENU_HREF);
                    case SLOT_MENU_COMPONENT:
                    		return __visibility.visible(SLOT_MENU_COMPONENT);
                    case SLOT_MENU_TARGET:
                    		return __visibility.visible(SLOT_MENU_TARGET);
                    case SLOT_MENU_ICON:
                    		return __visibility.visible(SLOT_MENU_ICON);
                    case SLOT_MENU_COLOR:
                    		return __visibility.visible(SLOT_MENU_COLOR);
                    case SLOT_MENU_TITLE:
                    		return __visibility.visible(SLOT_MENU_TITLE);
                    case SLOT_PERMISSION:
                    		return __visibility.visible(SLOT_PERMISSION);
                    case SLOT_WEIGHT:
                    		return __visibility.visible(SLOT_WEIGHT);
                    case SLOT_IS_SHOW:
                    		return __visibility.visible(SLOT_IS_SHOW);
                    case SLOT_SYS_CODE:
                    		return __visibility.visible(SLOT_SYS_CODE);
                    case SLOT_ROLES:
                    		return __visibility.visible(SLOT_ROLES);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "id":
                    		return __visibility.visible(SLOT_ID);
                    case "status":
                    		return __visibility.visible(SLOT_STATUS);
                    case "createBy":
                    		return __visibility.visible(SLOT_CREATE_BY);
                    case "createDate":
                    		return __visibility.visible(SLOT_CREATE_DATE);
                    case "updateBy":
                    		return __visibility.visible(SLOT_UPDATE_BY);
                    case "updateDate":
                    		return __visibility.visible(SLOT_UPDATE_DATE);
                    case "remarks":
                    		return __visibility.visible(SLOT_REMARKS);
                    case "parent":
                    		return __visibility.visible(SLOT_PARENT);
                    case "parentId":
                    		return __visibility.visible(SLOT_PARENT_ID);
                    case "children":
                    		return __visibility.visible(SLOT_CHILDREN);
                    case "menuName":
                    		return __visibility.visible(SLOT_MENU_NAME);
                    case "menuType":
                    		return __visibility.visible(SLOT_MENU_TYPE);
                    case "menuHref":
                    		return __visibility.visible(SLOT_MENU_HREF);
                    case "menuComponent":
                    		return __visibility.visible(SLOT_MENU_COMPONENT);
                    case "menuTarget":
                    		return __visibility.visible(SLOT_MENU_TARGET);
                    case "menuIcon":
                    		return __visibility.visible(SLOT_MENU_ICON);
                    case "menuColor":
                    		return __visibility.visible(SLOT_MENU_COLOR);
                    case "menuTitle":
                    		return __visibility.visible(SLOT_MENU_TITLE);
                    case "permission":
                    		return __visibility.visible(SLOT_PERMISSION);
                    case "weight":
                    		return __visibility.visible(SLOT_WEIGHT);
                    case "isShow":
                    		return __visibility.visible(SLOT_IS_SHOW);
                    case "sysCode":
                    		return __visibility.visible(SLOT_SYS_CODE);
                    case "roles":
                    		return __visibility.visible(SLOT_ROLES);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + __idValue.hashCode();
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (__statusLoaded) {
                    hash = 31 * hash + Integer.hashCode(__statusValue);
                }
                if (__createByValue != null) {
                    hash = 31 * hash + __createByValue.hashCode();
                }
                if (__createDateValue != null) {
                    hash = 31 * hash + __createDateValue.hashCode();
                }
                if (__updateByValue != null) {
                    hash = 31 * hash + __updateByValue.hashCode();
                }
                if (__updateDateValue != null) {
                    hash = 31 * hash + __updateDateValue.hashCode();
                }
                if (__remarksLoaded && __remarksValue != null) {
                    hash = 31 * hash + __remarksValue.hashCode();
                }
                if (__parentLoaded && __parentValue != null) {
                    hash = 31 * hash + __parentValue.hashCode();
                }
                if (__childrenValue != null) {
                    hash = 31 * hash + __childrenValue.hashCode();
                }
                if (__menuNameValue != null) {
                    hash = 31 * hash + __menuNameValue.hashCode();
                }
                if (__menuTypeValue != null) {
                    hash = 31 * hash + __menuTypeValue.hashCode();
                }
                if (__menuHrefLoaded && __menuHrefValue != null) {
                    hash = 31 * hash + __menuHrefValue.hashCode();
                }
                if (__menuComponentLoaded && __menuComponentValue != null) {
                    hash = 31 * hash + __menuComponentValue.hashCode();
                }
                if (__menuTargetLoaded && __menuTargetValue != null) {
                    hash = 31 * hash + __menuTargetValue.hashCode();
                }
                if (__menuIconLoaded && __menuIconValue != null) {
                    hash = 31 * hash + __menuIconValue.hashCode();
                }
                if (__menuColorLoaded && __menuColorValue != null) {
                    hash = 31 * hash + __menuColorValue.hashCode();
                }
                if (__menuTitleLoaded && __menuTitleValue != null) {
                    hash = 31 * hash + __menuTitleValue.hashCode();
                }
                if (__permissionLoaded && __permissionValue != null) {
                    hash = 31 * hash + __permissionValue.hashCode();
                }
                if (__weightLoaded && __weightValue != null) {
                    hash = 31 * hash + __weightValue.hashCode();
                }
                if (__isShowLoaded && __isShowValue != null) {
                    hash = 31 * hash + __isShowValue.hashCode();
                }
                if (__sysCodeLoaded && __sysCodeValue != null) {
                    hash = 31 * hash + __sysCodeValue.hashCode();
                }
                if (__rolesValue != null) {
                    hash = 31 * hash + __rolesValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
                }
                if (__statusLoaded) {
                    hash = 31 * hash + Integer.hashCode(__statusValue);
                }
                if (__createByValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createByValue);
                }
                if (__createDateValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createDateValue);
                }
                if (__updateByValue != null) {
                    hash = 31 * hash + System.identityHashCode(__updateByValue);
                }
                if (__updateDateValue != null) {
                    hash = 31 * hash + System.identityHashCode(__updateDateValue);
                }
                if (__remarksLoaded) {
                    hash = 31 * hash + System.identityHashCode(__remarksValue);
                }
                if (__parentLoaded) {
                    hash = 31 * hash + System.identityHashCode(__parentValue);
                }
                if (__childrenValue != null) {
                    hash = 31 * hash + System.identityHashCode(__childrenValue);
                }
                if (__menuNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__menuNameValue);
                }
                if (__menuTypeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__menuTypeValue);
                }
                if (__menuHrefLoaded) {
                    hash = 31 * hash + System.identityHashCode(__menuHrefValue);
                }
                if (__menuComponentLoaded) {
                    hash = 31 * hash + System.identityHashCode(__menuComponentValue);
                }
                if (__menuTargetLoaded) {
                    hash = 31 * hash + System.identityHashCode(__menuTargetValue);
                }
                if (__menuIconLoaded) {
                    hash = 31 * hash + System.identityHashCode(__menuIconValue);
                }
                if (__menuColorLoaded) {
                    hash = 31 * hash + System.identityHashCode(__menuColorValue);
                }
                if (__menuTitleLoaded) {
                    hash = 31 * hash + System.identityHashCode(__menuTitleValue);
                }
                if (__permissionLoaded) {
                    hash = 31 * hash + System.identityHashCode(__permissionValue);
                }
                if (__weightLoaded) {
                    hash = 31 * hash + System.identityHashCode(__weightValue);
                }
                if (__isShowLoaded) {
                    hash = 31 * hash + System.identityHashCode(__isShowValue);
                }
                if (__sysCodeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__sysCodeValue);
                }
                if (__rolesValue != null) {
                    hash = 31 * hash + System.identityHashCode(__rolesValue);
                }
                return hash;
            }

            @Override
            public int __hashCode(boolean shallow) {
                return shallow ? __shallowHashCode() : hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(__idValue, __other.id());
                }
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = this.__statusLoaded;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && __statusValue != __other.status()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                boolean __createByLoaded = __createByValue != null;
                if (__createByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                if (__createByLoaded && !Objects.equals(__createByValue, __other.createBy())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                boolean __createDateLoaded = __createDateValue != null;
                if (__createDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                if (__createDateLoaded && !Objects.equals(__createDateValue, __other.createDate())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                boolean __updateByLoaded = __updateByValue != null;
                if (__updateByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                if (__updateByLoaded && !Objects.equals(__updateByValue, __other.updateBy())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                boolean __updateDateLoaded = __updateDateValue != null;
                if (__updateDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                if (__updateDateLoaded && !Objects.equals(__updateDateValue, __other.updateDate())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARKS)) != __other.__isVisible(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                boolean __remarksLoaded = this.__remarksLoaded;
                if (__remarksLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                if (__remarksLoaded && !Objects.equals(__remarksValue, __other.remarks())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PARENT)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                boolean __parentLoaded = this.__parentLoaded;
                if (__parentLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                if (__parentLoaded && !Objects.equals(__parentValue, __other.parent())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PARENT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CHILDREN)) != __other.__isVisible(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                boolean __childrenLoaded = __childrenValue != null;
                if (__childrenLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                if (__childrenLoaded && !Objects.equals(__childrenValue, __other.children())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_NAME))) {
                    return false;
                }
                boolean __menuNameLoaded = __menuNameValue != null;
                if (__menuNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_NAME))) {
                    return false;
                }
                if (__menuNameLoaded && !Objects.equals(__menuNameValue, __other.menuName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_TYPE))) {
                    return false;
                }
                boolean __menuTypeLoaded = __menuTypeValue != null;
                if (__menuTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_TYPE))) {
                    return false;
                }
                if (__menuTypeLoaded && !Objects.equals(__menuTypeValue, __other.menuType())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_HREF)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_HREF))) {
                    return false;
                }
                boolean __menuHrefLoaded = this.__menuHrefLoaded;
                if (__menuHrefLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_HREF))) {
                    return false;
                }
                if (__menuHrefLoaded && !Objects.equals(__menuHrefValue, __other.menuHref())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_COMPONENT)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_COMPONENT))) {
                    return false;
                }
                boolean __menuComponentLoaded = this.__menuComponentLoaded;
                if (__menuComponentLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_COMPONENT))) {
                    return false;
                }
                if (__menuComponentLoaded && !Objects.equals(__menuComponentValue, __other.menuComponent())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_TARGET)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_TARGET))) {
                    return false;
                }
                boolean __menuTargetLoaded = this.__menuTargetLoaded;
                if (__menuTargetLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_TARGET))) {
                    return false;
                }
                if (__menuTargetLoaded && !Objects.equals(__menuTargetValue, __other.menuTarget())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_ICON)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_ICON))) {
                    return false;
                }
                boolean __menuIconLoaded = this.__menuIconLoaded;
                if (__menuIconLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_ICON))) {
                    return false;
                }
                if (__menuIconLoaded && !Objects.equals(__menuIconValue, __other.menuIcon())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_COLOR)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_COLOR))) {
                    return false;
                }
                boolean __menuColorLoaded = this.__menuColorLoaded;
                if (__menuColorLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_COLOR))) {
                    return false;
                }
                if (__menuColorLoaded && !Objects.equals(__menuColorValue, __other.menuColor())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_TITLE)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_TITLE))) {
                    return false;
                }
                boolean __menuTitleLoaded = this.__menuTitleLoaded;
                if (__menuTitleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_TITLE))) {
                    return false;
                }
                if (__menuTitleLoaded && !Objects.equals(__menuTitleValue, __other.menuTitle())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PERMISSION)) != __other.__isVisible(PropId.byIndex(SLOT_PERMISSION))) {
                    return false;
                }
                boolean __permissionLoaded = this.__permissionLoaded;
                if (__permissionLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PERMISSION))) {
                    return false;
                }
                if (__permissionLoaded && !Objects.equals(__permissionValue, __other.permission())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_WEIGHT)) != __other.__isVisible(PropId.byIndex(SLOT_WEIGHT))) {
                    return false;
                }
                boolean __weightLoaded = this.__weightLoaded;
                if (__weightLoaded != __other.__isLoaded(PropId.byIndex(SLOT_WEIGHT))) {
                    return false;
                }
                if (__weightLoaded && !Objects.equals(__weightValue, __other.weight())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_IS_SHOW)) != __other.__isVisible(PropId.byIndex(SLOT_IS_SHOW))) {
                    return false;
                }
                boolean __isShowLoaded = this.__isShowLoaded;
                if (__isShowLoaded != __other.__isLoaded(PropId.byIndex(SLOT_IS_SHOW))) {
                    return false;
                }
                if (__isShowLoaded && !Objects.equals(__isShowValue, __other.isShow())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SYS_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_SYS_CODE))) {
                    return false;
                }
                boolean __sysCodeLoaded = this.__sysCodeLoaded;
                if (__sysCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SYS_CODE))) {
                    return false;
                }
                if (__sysCodeLoaded && !Objects.equals(__sysCodeValue, __other.sysCode())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLES)) != __other.__isVisible(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                boolean __rolesLoaded = __rolesValue != null;
                if (__rolesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                if (__rolesLoaded && !Objects.equals(__rolesValue, __other.roles())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded && __idValue != __other.id()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = this.__statusLoaded;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && __statusValue != __other.status()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                boolean __createByLoaded = __createByValue != null;
                if (__createByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                if (__createByLoaded && __createByValue != __other.createBy()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                boolean __createDateLoaded = __createDateValue != null;
                if (__createDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                if (__createDateLoaded && __createDateValue != __other.createDate()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                boolean __updateByLoaded = __updateByValue != null;
                if (__updateByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                if (__updateByLoaded && __updateByValue != __other.updateBy()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                boolean __updateDateLoaded = __updateDateValue != null;
                if (__updateDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                if (__updateDateLoaded && __updateDateValue != __other.updateDate()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARKS)) != __other.__isVisible(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                boolean __remarksLoaded = this.__remarksLoaded;
                if (__remarksLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                if (__remarksLoaded && __remarksValue != __other.remarks()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PARENT)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                boolean __parentLoaded = this.__parentLoaded;
                if (__parentLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                if (__parentLoaded && __parentValue != __other.parent()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PARENT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CHILDREN)) != __other.__isVisible(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                boolean __childrenLoaded = __childrenValue != null;
                if (__childrenLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                if (__childrenLoaded && __childrenValue != __other.children()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_NAME))) {
                    return false;
                }
                boolean __menuNameLoaded = __menuNameValue != null;
                if (__menuNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_NAME))) {
                    return false;
                }
                if (__menuNameLoaded && __menuNameValue != __other.menuName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_TYPE))) {
                    return false;
                }
                boolean __menuTypeLoaded = __menuTypeValue != null;
                if (__menuTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_TYPE))) {
                    return false;
                }
                if (__menuTypeLoaded && __menuTypeValue != __other.menuType()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_HREF)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_HREF))) {
                    return false;
                }
                boolean __menuHrefLoaded = this.__menuHrefLoaded;
                if (__menuHrefLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_HREF))) {
                    return false;
                }
                if (__menuHrefLoaded && __menuHrefValue != __other.menuHref()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_COMPONENT)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_COMPONENT))) {
                    return false;
                }
                boolean __menuComponentLoaded = this.__menuComponentLoaded;
                if (__menuComponentLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_COMPONENT))) {
                    return false;
                }
                if (__menuComponentLoaded && __menuComponentValue != __other.menuComponent()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_TARGET)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_TARGET))) {
                    return false;
                }
                boolean __menuTargetLoaded = this.__menuTargetLoaded;
                if (__menuTargetLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_TARGET))) {
                    return false;
                }
                if (__menuTargetLoaded && __menuTargetValue != __other.menuTarget()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_ICON)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_ICON))) {
                    return false;
                }
                boolean __menuIconLoaded = this.__menuIconLoaded;
                if (__menuIconLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_ICON))) {
                    return false;
                }
                if (__menuIconLoaded && __menuIconValue != __other.menuIcon()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_COLOR)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_COLOR))) {
                    return false;
                }
                boolean __menuColorLoaded = this.__menuColorLoaded;
                if (__menuColorLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_COLOR))) {
                    return false;
                }
                if (__menuColorLoaded && __menuColorValue != __other.menuColor()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MENU_TITLE)) != __other.__isVisible(PropId.byIndex(SLOT_MENU_TITLE))) {
                    return false;
                }
                boolean __menuTitleLoaded = this.__menuTitleLoaded;
                if (__menuTitleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MENU_TITLE))) {
                    return false;
                }
                if (__menuTitleLoaded && __menuTitleValue != __other.menuTitle()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PERMISSION)) != __other.__isVisible(PropId.byIndex(SLOT_PERMISSION))) {
                    return false;
                }
                boolean __permissionLoaded = this.__permissionLoaded;
                if (__permissionLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PERMISSION))) {
                    return false;
                }
                if (__permissionLoaded && __permissionValue != __other.permission()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_WEIGHT)) != __other.__isVisible(PropId.byIndex(SLOT_WEIGHT))) {
                    return false;
                }
                boolean __weightLoaded = this.__weightLoaded;
                if (__weightLoaded != __other.__isLoaded(PropId.byIndex(SLOT_WEIGHT))) {
                    return false;
                }
                if (__weightLoaded && __weightValue != __other.weight()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_IS_SHOW)) != __other.__isVisible(PropId.byIndex(SLOT_IS_SHOW))) {
                    return false;
                }
                boolean __isShowLoaded = this.__isShowLoaded;
                if (__isShowLoaded != __other.__isLoaded(PropId.byIndex(SLOT_IS_SHOW))) {
                    return false;
                }
                if (__isShowLoaded && __isShowValue != __other.isShow()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SYS_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_SYS_CODE))) {
                    return false;
                }
                boolean __sysCodeLoaded = this.__sysCodeLoaded;
                if (__sysCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SYS_CODE))) {
                    return false;
                }
                if (__sysCodeLoaded && __sysCodeValue != __other.sysCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLES)) != __other.__isVisible(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                boolean __rolesLoaded = __rolesValue != null;
                if (__rolesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                    return false;
                }
                if (__rolesLoaded && __rolesValue != __other.roles()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }
        }

        @GeneratedBy(
                type = Menu.class
        )
        private static class DraftImpl implements Implementor, DraftSpi, MenuDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, Menu base) {
                __ctx = ctx;
                if (base != null) {
                    __base = (Impl)base;
                }
                else {
                    __modified = new Impl();
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isLoaded(String prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isVisible(PropId prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public boolean __isVisible(String prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public int hashCode() {
                return (__modified!= null ? __modified : __base).hashCode();
            }

            @Override
            public int __hashCode(boolean shallow) {
                return (__modified!= null ? __modified : __base).__hashCode(shallow);
            }

            @Override
            public boolean equals(Object obj) {
                return (__modified!= null ? __modified : __base).equals(obj);
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return (__modified!= null ? __modified : __base).__equals(obj, shallow);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString((__modified!= null ? __modified : __base));
            }

            @Override
            @JsonIgnore
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public MenuDraft setId(String id) {
                if (id == null) {
                    throw new IllegalArgumentException(
                        "'id' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__idValue = id;
                return this;
            }

            @Override
            @JsonIgnore
            public int status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public MenuDraft setStatus(int status) {
                Impl __tmpModified = __modified();
                __tmpModified.__statusValue = status;
                __tmpModified.__statusLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String createBy() {
                return (__modified!= null ? __modified : __base).createBy();
            }

            @Override
            public MenuDraft setCreateBy(String createBy) {
                if (createBy == null) {
                    throw new IllegalArgumentException(
                        "'createBy' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__createByValue = createBy;
                return this;
            }

            @Override
            @JsonIgnore
            public Date createDate() {
                return (__modified!= null ? __modified : __base).createDate();
            }

            @Override
            public MenuDraft setCreateDate(Date createDate) {
                if (createDate == null) {
                    throw new IllegalArgumentException(
                        "'createDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__createDateValue = createDate;
                return this;
            }

            @Override
            @JsonIgnore
            public String updateBy() {
                return (__modified!= null ? __modified : __base).updateBy();
            }

            @Override
            public MenuDraft setUpdateBy(String updateBy) {
                if (updateBy == null) {
                    throw new IllegalArgumentException(
                        "'updateBy' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__updateByValue = updateBy;
                return this;
            }

            @Override
            @JsonIgnore
            public Date updateDate() {
                return (__modified!= null ? __modified : __base).updateDate();
            }

            @Override
            public MenuDraft setUpdateDate(Date updateDate) {
                if (updateDate == null) {
                    throw new IllegalArgumentException(
                        "'updateDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__updateDateValue = updateDate;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String remarks() {
                return (__modified!= null ? __modified : __base).remarks();
            }

            @Override
            public MenuDraft setRemarks(String remarks) {
                Impl __tmpModified = __modified();
                __tmpModified.__remarksValue = remarks;
                __tmpModified.__remarksLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public MenuDraft parent() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public MenuDraft parent(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_PARENT)) || parent() == null)) {
                    setParent(MenuDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public MenuDraft setParent(Menu parent) {
                Impl __tmpModified = __modified();
                __tmpModified.__parentValue = parent;
                __tmpModified.__parentLoaded = true;
                return this;
            }

            @Override
            public MenuDraft applyParent(DraftConsumer<MenuDraft> block) {
                applyParent(null, block);
                return this;
            }

            @Override
            public MenuDraft applyParent(Menu base, DraftConsumer<MenuDraft> block) {
                setParent(MenuDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String parentId() {
                Menu __target = parent();
                return __target != null ? __target.id() : null;
            }

            @Override
            public MenuDraft setParentId(String parentId) {
                if (parentId != null) {
                    setParent(ImmutableObjects.makeIdOnly(Menu.class, parentId));
                } else {
                    setParent(null);
                }
                return this;
            }

            @Override
            @JsonIgnore
            public List<Menu> children() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).children(), Menu.class, true);
            }

            @Override
            public List<MenuDraft> children(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_CHILDREN)))) {
                    setChildren(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).children(), Menu.class, true);
            }

            @Override
            public MenuDraft setChildren(List<Menu> children) {
                if (children == null) {
                    throw new IllegalArgumentException(
                        "'children' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__childrenValue = NonSharedList.of(__tmpModified.__childrenValue, children);
                return this;
            }

            @Override
            public MenuDraft addIntoChildren(DraftConsumer<MenuDraft> block) {
                addIntoChildren(null, block);
                return this;
            }

            @Override
            public MenuDraft addIntoChildren(Menu base, DraftConsumer<MenuDraft> block) {
                children(true).add((MenuDraft)MenuDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public String menuName() {
                return (__modified!= null ? __modified : __base).menuName();
            }

            @Override
            public MenuDraft setMenuName(String menuName) {
                if (menuName == null) {
                    throw new IllegalArgumentException(
                        "'menuName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__menuNameValue = menuName;
                return this;
            }

            @Override
            @JsonIgnore
            public String menuType() {
                return (__modified!= null ? __modified : __base).menuType();
            }

            @Override
            public MenuDraft setMenuType(String menuType) {
                if (menuType == null) {
                    throw new IllegalArgumentException(
                        "'menuType' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__menuTypeValue = menuType;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuHref() {
                return (__modified!= null ? __modified : __base).menuHref();
            }

            @Override
            public MenuDraft setMenuHref(String menuHref) {
                Impl __tmpModified = __modified();
                __tmpModified.__menuHrefValue = menuHref;
                __tmpModified.__menuHrefLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuComponent() {
                return (__modified!= null ? __modified : __base).menuComponent();
            }

            @Override
            public MenuDraft setMenuComponent(String menuComponent) {
                Impl __tmpModified = __modified();
                __tmpModified.__menuComponentValue = menuComponent;
                __tmpModified.__menuComponentLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuTarget() {
                return (__modified!= null ? __modified : __base).menuTarget();
            }

            @Override
            public MenuDraft setMenuTarget(String menuTarget) {
                Impl __tmpModified = __modified();
                __tmpModified.__menuTargetValue = menuTarget;
                __tmpModified.__menuTargetLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuIcon() {
                return (__modified!= null ? __modified : __base).menuIcon();
            }

            @Override
            public MenuDraft setMenuIcon(String menuIcon) {
                Impl __tmpModified = __modified();
                __tmpModified.__menuIconValue = menuIcon;
                __tmpModified.__menuIconLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuColor() {
                return (__modified!= null ? __modified : __base).menuColor();
            }

            @Override
            public MenuDraft setMenuColor(String menuColor) {
                Impl __tmpModified = __modified();
                __tmpModified.__menuColorValue = menuColor;
                __tmpModified.__menuColorLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String menuTitle() {
                return (__modified!= null ? __modified : __base).menuTitle();
            }

            @Override
            public MenuDraft setMenuTitle(String menuTitle) {
                Impl __tmpModified = __modified();
                __tmpModified.__menuTitleValue = menuTitle;
                __tmpModified.__menuTitleLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String permission() {
                return (__modified!= null ? __modified : __base).permission();
            }

            @Override
            public MenuDraft setPermission(String permission) {
                Impl __tmpModified = __modified();
                __tmpModified.__permissionValue = permission;
                __tmpModified.__permissionLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public BigDecimal weight() {
                return (__modified!= null ? __modified : __base).weight();
            }

            @Override
            public MenuDraft setWeight(BigDecimal weight) {
                Impl __tmpModified = __modified();
                __tmpModified.__weightValue = weight;
                __tmpModified.__weightLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Boolean isShow() {
                return (__modified!= null ? __modified : __base).isShow();
            }

            @Override
            public MenuDraft setIsShow(Boolean isShow) {
                Impl __tmpModified = __modified();
                __tmpModified.__isShowValue = isShow;
                __tmpModified.__isShowLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String sysCode() {
                return (__modified!= null ? __modified : __base).sysCode();
            }

            @Override
            public MenuDraft setSysCode(String sysCode) {
                Impl __tmpModified = __modified();
                __tmpModified.__sysCodeValue = sysCode;
                __tmpModified.__sysCodeLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public List<Role> roles() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).roles(), Role.class, true);
            }

            @Override
            public List<RoleDraft> roles(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_ROLES)))) {
                    setRoles(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).roles(), Role.class, true);
            }

            @Override
            public MenuDraft setRoles(List<Role> roles) {
                if (roles == null) {
                    throw new IllegalArgumentException(
                        "'roles' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__rolesValue = NonSharedList.of(__tmpModified.__rolesValue, roles);
                return this;
            }

            @Override
            public MenuDraft addIntoRoles(DraftConsumer<RoleDraft> block) {
                addIntoRoles(null, block);
                return this;
            }

            @Override
            public MenuDraft addIntoRoles(Role base, DraftConsumer<RoleDraft> block) {
                roles(true).add((RoleDraft)RoleDraft.$.produce(base, block));
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(PropId prop, Object value) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__set(prop.asName(), value);
                    return;
                    case SLOT_ID:
                    		setId((String)value);break;
                    case SLOT_STATUS:
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setStatus((Integer)value);
                            break;
                    case SLOT_CREATE_BY:
                    		setCreateBy((String)value);break;
                    case SLOT_CREATE_DATE:
                    		setCreateDate((Date)value);break;
                    case SLOT_UPDATE_BY:
                    		setUpdateBy((String)value);break;
                    case SLOT_UPDATE_DATE:
                    		setUpdateDate((Date)value);break;
                    case SLOT_REMARKS:
                    		setRemarks((String)value);break;
                    case SLOT_PARENT:
                    		setParent((Menu)value);break;
                    case SLOT_PARENT_ID:
                    		setParentId((String)value);break;
                    case SLOT_CHILDREN:
                    		setChildren((List<Menu>)value);break;
                    case SLOT_MENU_NAME:
                    		setMenuName((String)value);break;
                    case SLOT_MENU_TYPE:
                    		setMenuType((String)value);break;
                    case SLOT_MENU_HREF:
                    		setMenuHref((String)value);break;
                    case SLOT_MENU_COMPONENT:
                    		setMenuComponent((String)value);break;
                    case SLOT_MENU_TARGET:
                    		setMenuTarget((String)value);break;
                    case SLOT_MENU_ICON:
                    		setMenuIcon((String)value);break;
                    case SLOT_MENU_COLOR:
                    		setMenuColor((String)value);break;
                    case SLOT_MENU_TITLE:
                    		setMenuTitle((String)value);break;
                    case SLOT_PERMISSION:
                    		setPermission((String)value);break;
                    case SLOT_WEIGHT:
                    		setWeight((BigDecimal)value);break;
                    case SLOT_IS_SHOW:
                    		setIsShow((Boolean)value);break;
                    case SLOT_SYS_CODE:
                    		setSysCode((String)value);break;
                    case SLOT_ROLES:
                    		setRoles((List<Role>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Menu\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "status":
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setStatus((Integer)value);
                            break;
                    case "createBy":
                    		setCreateBy((String)value);break;
                    case "createDate":
                    		setCreateDate((Date)value);break;
                    case "updateBy":
                    		setUpdateBy((String)value);break;
                    case "updateDate":
                    		setUpdateDate((Date)value);break;
                    case "remarks":
                    		setRemarks((String)value);break;
                    case "parent":
                    		setParent((Menu)value);break;
                    case "parentId":
                    		setParentId((String)value);break;
                    case "children":
                    		setChildren((List<Menu>)value);break;
                    case "menuName":
                    		setMenuName((String)value);break;
                    case "menuType":
                    		setMenuType((String)value);break;
                    case "menuHref":
                    		setMenuHref((String)value);break;
                    case "menuComponent":
                    		setMenuComponent((String)value);break;
                    case "menuTarget":
                    		setMenuTarget((String)value);break;
                    case "menuIcon":
                    		setMenuIcon((String)value);break;
                    case "menuColor":
                    		setMenuColor((String)value);break;
                    case "menuTitle":
                    		setMenuTitle((String)value);break;
                    case "permission":
                    		setPermission((String)value);break;
                    case "weight":
                    		setWeight((BigDecimal)value);break;
                    case "isShow":
                    		setIsShow((Boolean)value);break;
                    case "sysCode":
                    		setSysCode((String)value);break;
                    case "roles":
                    		setRoles((List<Role>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Menu\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(23);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_STATUS:
                    		__visibility.show(SLOT_STATUS, visible);break;
                    case SLOT_CREATE_BY:
                    		__visibility.show(SLOT_CREATE_BY, visible);break;
                    case SLOT_CREATE_DATE:
                    		__visibility.show(SLOT_CREATE_DATE, visible);break;
                    case SLOT_UPDATE_BY:
                    		__visibility.show(SLOT_UPDATE_BY, visible);break;
                    case SLOT_UPDATE_DATE:
                    		__visibility.show(SLOT_UPDATE_DATE, visible);break;
                    case SLOT_REMARKS:
                    		__visibility.show(SLOT_REMARKS, visible);break;
                    case SLOT_PARENT:
                    		__visibility.show(SLOT_PARENT, visible);break;
                    case SLOT_PARENT_ID:
                    		__visibility.show(SLOT_PARENT_ID, visible);break;
                    case SLOT_CHILDREN:
                    		__visibility.show(SLOT_CHILDREN, visible);break;
                    case SLOT_MENU_NAME:
                    		__visibility.show(SLOT_MENU_NAME, visible);break;
                    case SLOT_MENU_TYPE:
                    		__visibility.show(SLOT_MENU_TYPE, visible);break;
                    case SLOT_MENU_HREF:
                    		__visibility.show(SLOT_MENU_HREF, visible);break;
                    case SLOT_MENU_COMPONENT:
                    		__visibility.show(SLOT_MENU_COMPONENT, visible);break;
                    case SLOT_MENU_TARGET:
                    		__visibility.show(SLOT_MENU_TARGET, visible);break;
                    case SLOT_MENU_ICON:
                    		__visibility.show(SLOT_MENU_ICON, visible);break;
                    case SLOT_MENU_COLOR:
                    		__visibility.show(SLOT_MENU_COLOR, visible);break;
                    case SLOT_MENU_TITLE:
                    		__visibility.show(SLOT_MENU_TITLE, visible);break;
                    case SLOT_PERMISSION:
                    		__visibility.show(SLOT_PERMISSION, visible);break;
                    case SLOT_WEIGHT:
                    		__visibility.show(SLOT_WEIGHT, visible);break;
                    case SLOT_IS_SHOW:
                    		__visibility.show(SLOT_IS_SHOW, visible);break;
                    case SLOT_SYS_CODE:
                    		__visibility.show(SLOT_SYS_CODE, visible);break;
                    case SLOT_ROLES:
                    		__visibility.show(SLOT_ROLES, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.Menu\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __show(String prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(23);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "status":
                    		__visibility.show(SLOT_STATUS, visible);break;
                    case "createBy":
                    		__visibility.show(SLOT_CREATE_BY, visible);break;
                    case "createDate":
                    		__visibility.show(SLOT_CREATE_DATE, visible);break;
                    case "updateBy":
                    		__visibility.show(SLOT_UPDATE_BY, visible);break;
                    case "updateDate":
                    		__visibility.show(SLOT_UPDATE_DATE, visible);break;
                    case "remarks":
                    		__visibility.show(SLOT_REMARKS, visible);break;
                    case "parent":
                    		__visibility.show(SLOT_PARENT, visible);break;
                    case "parentId":
                    		__visibility.show(SLOT_PARENT_ID, visible);break;
                    case "children":
                    		__visibility.show(SLOT_CHILDREN, visible);break;
                    case "menuName":
                    		__visibility.show(SLOT_MENU_NAME, visible);break;
                    case "menuType":
                    		__visibility.show(SLOT_MENU_TYPE, visible);break;
                    case "menuHref":
                    		__visibility.show(SLOT_MENU_HREF, visible);break;
                    case "menuComponent":
                    		__visibility.show(SLOT_MENU_COMPONENT, visible);break;
                    case "menuTarget":
                    		__visibility.show(SLOT_MENU_TARGET, visible);break;
                    case "menuIcon":
                    		__visibility.show(SLOT_MENU_ICON, visible);break;
                    case "menuColor":
                    		__visibility.show(SLOT_MENU_COLOR, visible);break;
                    case "menuTitle":
                    		__visibility.show(SLOT_MENU_TITLE, visible);break;
                    case "permission":
                    		__visibility.show(SLOT_PERMISSION, visible);break;
                    case "weight":
                    		__visibility.show(SLOT_WEIGHT, visible);break;
                    case "isShow":
                    		__visibility.show(SLOT_IS_SHOW, visible);break;
                    case "sysCode":
                    		__visibility.show(SLOT_SYS_CODE, visible);break;
                    case "roles":
                    		__visibility.show(SLOT_ROLES, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.Menu\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __unload(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__unload(prop.asName());
                    return;
                    case SLOT_ID:
                    		__modified().__idValue = null;break;
                    case SLOT_STATUS:
                    		__modified().__statusLoaded = false;break;
                    case SLOT_CREATE_BY:
                    		__modified().__createByValue = null;break;
                    case SLOT_CREATE_DATE:
                    		__modified().__createDateValue = null;break;
                    case SLOT_UPDATE_BY:
                    		__modified().__updateByValue = null;break;
                    case SLOT_UPDATE_DATE:
                    		__modified().__updateDateValue = null;break;
                    case SLOT_REMARKS:
                    		__modified().__remarksLoaded = false;break;
                    case SLOT_PARENT:
                    		__modified().__parentLoaded = false;break;
                    case SLOT_PARENT_ID:
                    		__unload(PropId.byIndex(SLOT_PARENT));break;
                    case SLOT_CHILDREN:
                    		__modified().__childrenValue = null;break;
                    case SLOT_MENU_NAME:
                    		__modified().__menuNameValue = null;break;
                    case SLOT_MENU_TYPE:
                    		__modified().__menuTypeValue = null;break;
                    case SLOT_MENU_HREF:
                    		__modified().__menuHrefLoaded = false;break;
                    case SLOT_MENU_COMPONENT:
                    		__modified().__menuComponentLoaded = false;break;
                    case SLOT_MENU_TARGET:
                    		__modified().__menuTargetLoaded = false;break;
                    case SLOT_MENU_ICON:
                    		__modified().__menuIconLoaded = false;break;
                    case SLOT_MENU_COLOR:
                    		__modified().__menuColorLoaded = false;break;
                    case SLOT_MENU_TITLE:
                    		__modified().__menuTitleLoaded = false;break;
                    case SLOT_PERMISSION:
                    		__modified().__permissionLoaded = false;break;
                    case SLOT_WEIGHT:
                    		__modified().__weightLoaded = false;break;
                    case SLOT_IS_SHOW:
                    		__modified().__isShowLoaded = false;break;
                    case SLOT_SYS_CODE:
                    		__modified().__sysCodeLoaded = false;break;
                    case SLOT_ROLES:
                    		__modified().__rolesValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Menu\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id":
                    		__modified().__idValue = null;break;
                    case "status":
                    		__modified().__statusLoaded = false;break;
                    case "createBy":
                    		__modified().__createByValue = null;break;
                    case "createDate":
                    		__modified().__createDateValue = null;break;
                    case "updateBy":
                    		__modified().__updateByValue = null;break;
                    case "updateDate":
                    		__modified().__updateDateValue = null;break;
                    case "remarks":
                    		__modified().__remarksLoaded = false;break;
                    case "parent":
                    		__modified().__parentLoaded = false;break;
                    case "parentId":
                    		__unload(PropId.byIndex(SLOT_PARENT));break;
                    case "children":
                    		__modified().__childrenValue = null;break;
                    case "menuName":
                    		__modified().__menuNameValue = null;break;
                    case "menuType":
                    		__modified().__menuTypeValue = null;break;
                    case "menuHref":
                    		__modified().__menuHrefLoaded = false;break;
                    case "menuComponent":
                    		__modified().__menuComponentLoaded = false;break;
                    case "menuTarget":
                    		__modified().__menuTargetLoaded = false;break;
                    case "menuIcon":
                    		__modified().__menuIconLoaded = false;break;
                    case "menuColor":
                    		__modified().__menuColorLoaded = false;break;
                    case "menuTitle":
                    		__modified().__menuTitleLoaded = false;break;
                    case "permission":
                    		__modified().__permissionLoaded = false;break;
                    case "weight":
                    		__modified().__weightLoaded = false;break;
                    case "isShow":
                    		__modified().__isShowLoaded = false;break;
                    case "sysCode":
                    		__modified().__sysCodeLoaded = false;break;
                    case "roles":
                    		__modified().__rolesValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Menu\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public DraftContext __draftContext() {
                return __ctx;
            }

            @Override
            public Object __resolve() {
                if (__resolving) {
                    throw new CircularReferenceException();
                }
                __resolving = true;
                try {
                    Implementor base = __base;
                    Impl __tmpModified = __modified;
                    if (__tmpModified == null) {
                        if (base.__isLoaded(PropId.byIndex(SLOT_PARENT))) {
                            Menu oldValue = base.parent();
                            Menu newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setParent(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_CHILDREN))) {
                            List<Menu> oldValue = base.children();
                            List<Menu> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setChildren(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_ROLES))) {
                            List<Role> oldValue = base.roles();
                            List<Role> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setRoles(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__parentValue = __ctx.resolveObject(__tmpModified.__parentValue);
                        __tmpModified.__childrenValue = NonSharedList.of(__tmpModified.__childrenValue, __ctx.resolveList(__tmpModified.__childrenValue));
                        __tmpModified.__rolesValue = NonSharedList.of(__tmpModified.__rolesValue, __ctx.resolveList(__tmpModified.__rolesValue));
                    }
                    if (__base != null && __tmpModified == null) {
                        return base;
                    }
                    return __tmpModified;
                }
                finally {
                    __resolving = false;
                }
            }

            Impl __modified() {
                Impl __tmpModified = __modified;
                if (__tmpModified == null) {
                    __tmpModified = __base.clone();
                    __modified = __tmpModified;
                }
                return __tmpModified;
            }
        }
    }

    @GeneratedBy(
            type = Menu.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT), false);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT_ID), false);
        }

        @NotNull
        public Builder id(String id) {
            if (id != null) {
                __draft.setId(id);
            }
            return this;
        }

        @Schema(
                description = "状态"
        )
        public Builder status(Integer status) {
            if (status != null) {
                __draft.setStatus(status);
            }
            return this;
        }

        @NotNull
        public Builder createBy(String createBy) {
            if (createBy != null) {
                __draft.setCreateBy(createBy);
            }
            return this;
        }

        @NotNull
        public Builder createDate(Date createDate) {
            if (createDate != null) {
                __draft.setCreateDate(createDate);
            }
            return this;
        }

        @NotNull
        public Builder updateBy(String updateBy) {
            if (updateBy != null) {
                __draft.setUpdateBy(updateBy);
            }
            return this;
        }

        @NotNull
        public Builder updateDate(Date updateDate) {
            if (updateDate != null) {
                __draft.setUpdateDate(updateDate);
            }
            return this;
        }

        @Nullable
        public Builder remarks(String remarks) {
            __draft.setRemarks(remarks);
            return this;
        }

        @Schema(
                description = "父级菜单"
        )
        @jakarta.annotation.Nullable
        public Builder parent(Menu parent) {
            __draft.setParent(parent);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT), true);
            return this;
        }

        @jakarta.annotation.Nullable
        public Builder parentId(String parentId) {
            __draft.setParentId(parentId);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT_ID), true);
            return this;
        }

        @Schema(
                description = "子级菜单"
        )
        public Builder children(List<Menu> children) {
            if (children != null) {
                __draft.setChildren(children);
            }
            return this;
        }

        @Schema(
                description = "菜单名称"
        )
        public Builder menuName(String menuName) {
            if (menuName != null) {
                __draft.setMenuName(menuName);
            }
            return this;
        }

        @Schema(
                description = "菜单类型（1菜单 2权限 3开发）"
        )
        public Builder menuType(String menuType) {
            if (menuType != null) {
                __draft.setMenuType(menuType);
            }
            return this;
        }

        @Schema(
                description = "链接"
        )
        @jakarta.annotation.Nullable
        public Builder menuHref(String menuHref) {
            __draft.setMenuHref(menuHref);
            return this;
        }

        @Schema(
                description = "组件地址"
        )
        @jakarta.annotation.Nullable
        public Builder menuComponent(String menuComponent) {
            __draft.setMenuComponent(menuComponent);
            return this;
        }

        @Schema(
                description = "目标"
        )
        @jakarta.annotation.Nullable
        public Builder menuTarget(String menuTarget) {
            __draft.setMenuTarget(menuTarget);
            return this;
        }

        @Schema(
                description = "图标"
        )
        @jakarta.annotation.Nullable
        public Builder menuIcon(String menuIcon) {
            __draft.setMenuIcon(menuIcon);
            return this;
        }

        @Schema(
                description = "颜色"
        )
        @jakarta.annotation.Nullable
        public Builder menuColor(String menuColor) {
            __draft.setMenuColor(menuColor);
            return this;
        }

        @Schema(
                description = "菜单标题"
        )
        @jakarta.annotation.Nullable
        public Builder menuTitle(String menuTitle) {
            __draft.setMenuTitle(menuTitle);
            return this;
        }

        @Schema(
                description = "权限标识"
        )
        @jakarta.annotation.Nullable
        public Builder permission(String permission) {
            __draft.setPermission(permission);
            return this;
        }

        @Schema(
                description = "菜单权重"
        )
        @jakarta.annotation.Nullable
        public Builder weight(BigDecimal weight) {
            __draft.setWeight(weight);
            return this;
        }

        @Schema(
                description = "是否显示"
        )
        @jakarta.annotation.Nullable
        public Builder isShow(Boolean isShow) {
            __draft.setIsShow(isShow);
            return this;
        }

        @Schema(
                description = "归属系统（default:主导航菜单、mobileApp:APP菜单）"
        )
        @jakarta.annotation.Nullable
        public Builder sysCode(String sysCode) {
            __draft.setSysCode(sysCode);
            return this;
        }

        public Builder roles(List<Role> roles) {
            if (roles != null) {
                __draft.setRoles(roles);
            }
            return this;
        }

        public Menu build() {
            return (Menu)__draft.__modified();
        }
    }
}
