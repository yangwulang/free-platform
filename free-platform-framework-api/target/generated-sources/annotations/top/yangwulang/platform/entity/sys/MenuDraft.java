package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;
import org.babyfish.jimmer.runtime.NonSharedList;
import org.babyfish.jimmer.sql.ManyToMany;
import org.babyfish.jimmer.sql.OneToMany;

public interface MenuDraft extends Menu, DataTypeBaseDraft {
    MenuDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    MenuDraft setId(String id);

    @OldChain
    MenuDraft setStatus(String status);

    @OldChain
    MenuDraft setCreateBy(String createBy);

    @OldChain
    MenuDraft setCreateDate(LocalDateTime createDate);

    @OldChain
    MenuDraft setUpdateBy(String updateBy);

    @OldChain
    MenuDraft setUpdateDate(LocalDateTime updateDate);

    @OldChain
    MenuDraft setRemarks(String remarks);

    MenuDraft parent();

    MenuDraft parent(boolean autoCreate);

    @OldChain
    MenuDraft setParent(Menu parent);

    @OldChain
    MenuDraft applyParent(DraftConsumer<MenuDraft> block);

    @OldChain
    MenuDraft applyParent(Menu base, DraftConsumer<MenuDraft> block);

    List<MenuDraft> children(boolean autoCreate);

    @OldChain
    MenuDraft setChildren(List<Menu> children);

    @OldChain
    MenuDraft addIntoChildren(DraftConsumer<MenuDraft> block);

    @OldChain
    MenuDraft addIntoChildren(Menu base, DraftConsumer<MenuDraft> block);

    @OldChain
    MenuDraft setParentCodes(String parentCodes);

    @OldChain
    MenuDraft setTreeSort(BigDecimal treeSort);

    @OldChain
    MenuDraft setTreeSorts(String treeSorts);

    @OldChain
    MenuDraft setTreeLeaf(String treeLeaf);

    @OldChain
    MenuDraft setTreeLevel(BigDecimal treeLevel);

    @OldChain
    MenuDraft setTreeNames(String treeNames);

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
    MenuDraft setShow(boolean show);

    @OldChain
    MenuDraft setSysCode(String sysCode);

    List<RoleDraft> roles(boolean autoCreate);

    @OldChain
    MenuDraft setRoles(List<Role> roles);

    @OldChain
    MenuDraft addIntoRoles(DraftConsumer<RoleDraft> block);

    @OldChain
    MenuDraft addIntoRoles(Role base, DraftConsumer<RoleDraft> block);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                Menu.class,
                DataTypeBaseDraft.Producer.TYPE,
                (ctx, base) -> new DraftImpl(ctx, (Menu)base)
            )
            .keyReference(8, "parent", Menu.class, true)
            .add(9, "children", OneToMany.class, Menu.class, false)
            .add(10, "parentCodes", ImmutablePropCategory.SCALAR, String.class, false)
            .add(11, "treeSort", ImmutablePropCategory.SCALAR, BigDecimal.class, false)
            .add(12, "treeSorts", ImmutablePropCategory.SCALAR, String.class, false)
            .add(13, "treeLeaf", ImmutablePropCategory.SCALAR, String.class, false)
            .add(14, "treeLevel", ImmutablePropCategory.SCALAR, BigDecimal.class, false)
            .key(15, "treeNames", String.class)
            .add(16, "menuName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(17, "menuType", ImmutablePropCategory.SCALAR, String.class, false)
            .add(18, "menuHref", ImmutablePropCategory.SCALAR, String.class, true)
            .add(19, "menuComponent", ImmutablePropCategory.SCALAR, String.class, true)
            .add(20, "menuTarget", ImmutablePropCategory.SCALAR, String.class, true)
            .add(21, "menuIcon", ImmutablePropCategory.SCALAR, String.class, true)
            .add(22, "menuColor", ImmutablePropCategory.SCALAR, String.class, true)
            .add(23, "menuTitle", ImmutablePropCategory.SCALAR, String.class, true)
            .add(24, "permission", ImmutablePropCategory.SCALAR, String.class, true)
            .add(25, "weight", ImmutablePropCategory.SCALAR, BigDecimal.class, false)
            .add(26, "show", ImmutablePropCategory.SCALAR, boolean.class, false)
            .add(27, "sysCode", ImmutablePropCategory.SCALAR, String.class, false)
            .add(28, "roles", ManyToMany.class, Role.class, false)
            .build();

        private Producer() {
        }

        public Menu produce(DraftConsumer<MenuDraft> block) {
            return produce(null, block);
        }

        public Menu produce(Menu base, DraftConsumer<MenuDraft> block) {
            return (Menu)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements Menu, ImmutableSpi {
            @Override
            public Object __get(int prop) {
                switch (prop) {
                    case 1: return id();
                    case 2: return status();
                    case 3: return createBy();
                    case 4: return createDate();
                    case 5: return updateBy();
                    case 6: return updateDate();
                    case 7: return remarks();
                    case 8: return parent();
                    case 9: return children();
                    case 10: return parentCodes();
                    case 11: return treeSort();
                    case 12: return treeSorts();
                    case 13: return treeLeaf();
                    case 14: return treeLevel();
                    case 15: return treeNames();
                    case 16: return menuName();
                    case 17: return menuType();
                    case 18: return menuHref();
                    case 19: return menuComponent();
                    case 20: return menuTarget();
                    case 21: return menuIcon();
                    case 22: return menuColor();
                    case 23: return menuTitle();
                    case 24: return permission();
                    case 25: return weight();
                    case 26: return (Boolean)isShow();
                    case 27: return sysCode();
                    case 28: return roles();
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public Object __get(String prop) {
                switch (prop) {
                    case "id": return id();
                    case "status": return status();
                    case "createBy": return createBy();
                    case "createDate": return createDate();
                    case "updateBy": return updateBy();
                    case "updateDate": return updateDate();
                    case "remarks": return remarks();
                    case "parent": return parent();
                    case "children": return children();
                    case "parentCodes": return parentCodes();
                    case "treeSort": return treeSort();
                    case "treeSorts": return treeSorts();
                    case "treeLeaf": return treeLeaf();
                    case "treeLevel": return treeLevel();
                    case "treeNames": return treeNames();
                    case "menuName": return menuName();
                    case "menuType": return menuType();
                    case "menuHref": return menuHref();
                    case "menuComponent": return menuComponent();
                    case "menuTarget": return menuTarget();
                    case "menuIcon": return menuIcon();
                    case "menuColor": return menuColor();
                    case "menuTitle": return menuTitle();
                    case "permission": return permission();
                    case "weight": return weight();
                    case "show": return (Boolean)isShow();
                    case "sysCode": return sysCode();
                    case "roles": return roles();
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public ImmutableType __type() {
                return TYPE;
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }

            public int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        private static class Impl extends Implementor implements Cloneable {
            String id;

            String status;

            String createBy;

            LocalDateTime createDate;

            String updateBy;

            LocalDateTime updateDate;

            String remarks;

            boolean remarksLoaded = false;

            Menu parent;

            boolean parentLoaded = false;

            NonSharedList<Menu> children;

            String parentCodes;

            BigDecimal treeSort;

            String treeSorts;

            String treeLeaf;

            BigDecimal treeLevel;

            String treeNames;

            String menuName;

            String menuType;

            String menuHref;

            boolean menuHrefLoaded = false;

            String menuComponent;

            boolean menuComponentLoaded = false;

            String menuTarget;

            boolean menuTargetLoaded = false;

            String menuIcon;

            boolean menuIconLoaded = false;

            String menuColor;

            boolean menuColorLoaded = false;

            String menuTitle;

            boolean menuTitleLoaded = false;

            String permission;

            boolean permissionLoaded = false;

            BigDecimal weight;

            boolean show;

            boolean showLoaded = false;

            String sysCode;

            NonSharedList<Role> roles;

            @Override
            public String id() {
                if (id == null) {
                    throw new UnloadedException(Menu.class, "id");
                }
                return id;
            }

            @Override
            public String status() {
                if (status == null) {
                    throw new UnloadedException(Menu.class, "status");
                }
                return status;
            }

            @Override
            public String createBy() {
                if (createBy == null) {
                    throw new UnloadedException(Menu.class, "createBy");
                }
                return createBy;
            }

            @Override
            public LocalDateTime createDate() {
                if (createDate == null) {
                    throw new UnloadedException(Menu.class, "createDate");
                }
                return createDate;
            }

            @Override
            public String updateBy() {
                if (updateBy == null) {
                    throw new UnloadedException(Menu.class, "updateBy");
                }
                return updateBy;
            }

            @Override
            public LocalDateTime updateDate() {
                if (updateDate == null) {
                    throw new UnloadedException(Menu.class, "updateDate");
                }
                return updateDate;
            }

            @Override
            public String remarks() {
                if (!remarksLoaded) {
                    throw new UnloadedException(Menu.class, "remarks");
                }
                return remarks;
            }

            @Override
            public Menu parent() {
                if (!parentLoaded) {
                    throw new UnloadedException(Menu.class, "parent");
                }
                return parent;
            }

            @Override
            public List<Menu> children() {
                if (children == null) {
                    throw new UnloadedException(Menu.class, "children");
                }
                return children;
            }

            @Override
            public String parentCodes() {
                if (parentCodes == null) {
                    throw new UnloadedException(Menu.class, "parentCodes");
                }
                return parentCodes;
            }

            @Override
            public BigDecimal treeSort() {
                if (treeSort == null) {
                    throw new UnloadedException(Menu.class, "treeSort");
                }
                return treeSort;
            }

            @Override
            public String treeSorts() {
                if (treeSorts == null) {
                    throw new UnloadedException(Menu.class, "treeSorts");
                }
                return treeSorts;
            }

            @Override
            public String treeLeaf() {
                if (treeLeaf == null) {
                    throw new UnloadedException(Menu.class, "treeLeaf");
                }
                return treeLeaf;
            }

            @Override
            public BigDecimal treeLevel() {
                if (treeLevel == null) {
                    throw new UnloadedException(Menu.class, "treeLevel");
                }
                return treeLevel;
            }

            @Override
            public String treeNames() {
                if (treeNames == null) {
                    throw new UnloadedException(Menu.class, "treeNames");
                }
                return treeNames;
            }

            @Override
            public String menuName() {
                if (menuName == null) {
                    throw new UnloadedException(Menu.class, "menuName");
                }
                return menuName;
            }

            @Override
            public String menuType() {
                if (menuType == null) {
                    throw new UnloadedException(Menu.class, "menuType");
                }
                return menuType;
            }

            @Override
            public String menuHref() {
                if (!menuHrefLoaded) {
                    throw new UnloadedException(Menu.class, "menuHref");
                }
                return menuHref;
            }

            @Override
            public String menuComponent() {
                if (!menuComponentLoaded) {
                    throw new UnloadedException(Menu.class, "menuComponent");
                }
                return menuComponent;
            }

            @Override
            public String menuTarget() {
                if (!menuTargetLoaded) {
                    throw new UnloadedException(Menu.class, "menuTarget");
                }
                return menuTarget;
            }

            @Override
            public String menuIcon() {
                if (!menuIconLoaded) {
                    throw new UnloadedException(Menu.class, "menuIcon");
                }
                return menuIcon;
            }

            @Override
            public String menuColor() {
                if (!menuColorLoaded) {
                    throw new UnloadedException(Menu.class, "menuColor");
                }
                return menuColor;
            }

            @Override
            public String menuTitle() {
                if (!menuTitleLoaded) {
                    throw new UnloadedException(Menu.class, "menuTitle");
                }
                return menuTitle;
            }

            @Override
            public String permission() {
                if (!permissionLoaded) {
                    throw new UnloadedException(Menu.class, "permission");
                }
                return permission;
            }

            @Override
            public BigDecimal weight() {
                if (weight == null) {
                    throw new UnloadedException(Menu.class, "weight");
                }
                return weight;
            }

            @Override
            @JsonIgnore
            public boolean isShow() {
                if (!showLoaded) {
                    throw new UnloadedException(Menu.class, "show");
                }
                return show;
            }

            @Override
            public String sysCode() {
                if (sysCode == null) {
                    throw new UnloadedException(Menu.class, "sysCode");
                }
                return sysCode;
            }

            @Override
            public List<Role> roles() {
                if (roles == null) {
                    throw new UnloadedException(Menu.class, "roles");
                }
                return roles;
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
            public boolean __isLoaded(int prop) {
                switch (prop) {
                    case 1: return id != null;
                    case 2: return status != null;
                    case 3: return createBy != null;
                    case 4: return createDate != null;
                    case 5: return updateBy != null;
                    case 6: return updateDate != null;
                    case 7: return remarksLoaded;
                    case 8: return parentLoaded;
                    case 9: return children != null;
                    case 10: return parentCodes != null;
                    case 11: return treeSort != null;
                    case 12: return treeSorts != null;
                    case 13: return treeLeaf != null;
                    case 14: return treeLevel != null;
                    case 15: return treeNames != null;
                    case 16: return menuName != null;
                    case 17: return menuType != null;
                    case 18: return menuHrefLoaded;
                    case 19: return menuComponentLoaded;
                    case 20: return menuTargetLoaded;
                    case 21: return menuIconLoaded;
                    case 22: return menuColorLoaded;
                    case 23: return menuTitleLoaded;
                    case 24: return permissionLoaded;
                    case 25: return weight != null;
                    case 26: return showLoaded;
                    case 27: return sysCode != null;
                    case 28: return roles != null;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id": return id != null;
                    case "status": return status != null;
                    case "createBy": return createBy != null;
                    case "createDate": return createDate != null;
                    case "updateBy": return updateBy != null;
                    case "updateDate": return updateDate != null;
                    case "remarks": return remarksLoaded;
                    case "parent": return parentLoaded;
                    case "children": return children != null;
                    case "parentCodes": return parentCodes != null;
                    case "treeSort": return treeSort != null;
                    case "treeSorts": return treeSorts != null;
                    case "treeLeaf": return treeLeaf != null;
                    case "treeLevel": return treeLevel != null;
                    case "treeNames": return treeNames != null;
                    case "menuName": return menuName != null;
                    case "menuType": return menuType != null;
                    case "menuHref": return menuHrefLoaded;
                    case "menuComponent": return menuComponentLoaded;
                    case "menuTarget": return menuTargetLoaded;
                    case "menuIcon": return menuIconLoaded;
                    case "menuColor": return menuColorLoaded;
                    case "menuTitle": return menuTitleLoaded;
                    case "permission": return permissionLoaded;
                    case "weight": return weight != null;
                    case "show": return showLoaded;
                    case "sysCode": return sysCode != null;
                    case "roles": return roles != null;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public int hashCode() {
                int hash = 1;
                if (id != null) {
                    hash = 31 * hash + id.hashCode();
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (status != null) {
                    hash = 31 * hash + status.hashCode();
                }
                if (createBy != null) {
                    hash = 31 * hash + createBy.hashCode();
                }
                if (createDate != null) {
                    hash = 31 * hash + createDate.hashCode();
                }
                if (updateBy != null) {
                    hash = 31 * hash + updateBy.hashCode();
                }
                if (updateDate != null) {
                    hash = 31 * hash + updateDate.hashCode();
                }
                if (remarksLoaded && remarks != null) {
                    hash = 31 * hash + remarks.hashCode();
                }
                if (parentLoaded && parent != null) {
                    hash = 31 * hash + parent.hashCode();
                }
                if (children != null) {
                    hash = 31 * hash + children.hashCode();
                }
                if (parentCodes != null) {
                    hash = 31 * hash + parentCodes.hashCode();
                }
                if (treeSort != null) {
                    hash = 31 * hash + treeSort.hashCode();
                }
                if (treeSorts != null) {
                    hash = 31 * hash + treeSorts.hashCode();
                }
                if (treeLeaf != null) {
                    hash = 31 * hash + treeLeaf.hashCode();
                }
                if (treeLevel != null) {
                    hash = 31 * hash + treeLevel.hashCode();
                }
                if (treeNames != null) {
                    hash = 31 * hash + treeNames.hashCode();
                }
                if (menuName != null) {
                    hash = 31 * hash + menuName.hashCode();
                }
                if (menuType != null) {
                    hash = 31 * hash + menuType.hashCode();
                }
                if (menuHrefLoaded && menuHref != null) {
                    hash = 31 * hash + menuHref.hashCode();
                }
                if (menuComponentLoaded && menuComponent != null) {
                    hash = 31 * hash + menuComponent.hashCode();
                }
                if (menuTargetLoaded && menuTarget != null) {
                    hash = 31 * hash + menuTarget.hashCode();
                }
                if (menuIconLoaded && menuIcon != null) {
                    hash = 31 * hash + menuIcon.hashCode();
                }
                if (menuColorLoaded && menuColor != null) {
                    hash = 31 * hash + menuColor.hashCode();
                }
                if (menuTitleLoaded && menuTitle != null) {
                    hash = 31 * hash + menuTitle.hashCode();
                }
                if (permissionLoaded && permission != null) {
                    hash = 31 * hash + permission.hashCode();
                }
                if (weight != null) {
                    hash = 31 * hash + weight.hashCode();
                }
                if (showLoaded) {
                    hash = 31 * hash + Boolean.hashCode(show);
                }
                if (sysCode != null) {
                    hash = 31 * hash + sysCode.hashCode();
                }
                if (roles != null) {
                    hash = 31 * hash + roles.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = 1;
                if (id != null) {
                    hash = 31 * hash + System.identityHashCode(id);
                }
                if (status != null) {
                    hash = 31 * hash + System.identityHashCode(status);
                }
                if (createBy != null) {
                    hash = 31 * hash + System.identityHashCode(createBy);
                }
                if (createDate != null) {
                    hash = 31 * hash + System.identityHashCode(createDate);
                }
                if (updateBy != null) {
                    hash = 31 * hash + System.identityHashCode(updateBy);
                }
                if (updateDate != null) {
                    hash = 31 * hash + System.identityHashCode(updateDate);
                }
                if (remarksLoaded) {
                    hash = 31 * hash + System.identityHashCode(remarks);
                }
                if (parentLoaded) {
                    hash = 31 * hash + System.identityHashCode(parent);
                }
                if (children != null) {
                    hash = 31 * hash + System.identityHashCode(children);
                }
                if (parentCodes != null) {
                    hash = 31 * hash + System.identityHashCode(parentCodes);
                }
                if (treeSort != null) {
                    hash = 31 * hash + System.identityHashCode(treeSort);
                }
                if (treeSorts != null) {
                    hash = 31 * hash + System.identityHashCode(treeSorts);
                }
                if (treeLeaf != null) {
                    hash = 31 * hash + System.identityHashCode(treeLeaf);
                }
                if (treeLevel != null) {
                    hash = 31 * hash + System.identityHashCode(treeLevel);
                }
                if (treeNames != null) {
                    hash = 31 * hash + System.identityHashCode(treeNames);
                }
                if (menuName != null) {
                    hash = 31 * hash + System.identityHashCode(menuName);
                }
                if (menuType != null) {
                    hash = 31 * hash + System.identityHashCode(menuType);
                }
                if (menuHrefLoaded) {
                    hash = 31 * hash + System.identityHashCode(menuHref);
                }
                if (menuComponentLoaded) {
                    hash = 31 * hash + System.identityHashCode(menuComponent);
                }
                if (menuTargetLoaded) {
                    hash = 31 * hash + System.identityHashCode(menuTarget);
                }
                if (menuIconLoaded) {
                    hash = 31 * hash + System.identityHashCode(menuIcon);
                }
                if (menuColorLoaded) {
                    hash = 31 * hash + System.identityHashCode(menuColor);
                }
                if (menuTitleLoaded) {
                    hash = 31 * hash + System.identityHashCode(menuTitle);
                }
                if (permissionLoaded) {
                    hash = 31 * hash + System.identityHashCode(permission);
                }
                if (weight != null) {
                    hash = 31 * hash + System.identityHashCode(weight);
                }
                if (showLoaded) {
                    hash = 31 * hash + Boolean.hashCode(show);
                }
                if (sysCode != null) {
                    hash = 31 * hash + System.identityHashCode(sysCode);
                }
                if (roles != null) {
                    hash = 31 * hash + System.identityHashCode(roles);
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
                Implementor other = (Implementor)obj;
                boolean __idLoaded = id != null;
                if (__idLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__idLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(id, other.id());
                }
                boolean __statusLoaded = status != null;
                if (__statusLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__statusLoaded && !Objects.equals(status, other.status())) {
                    return false;
                }
                boolean __createByLoaded = createBy != null;
                if (__createByLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__createByLoaded && !Objects.equals(createBy, other.createBy())) {
                    return false;
                }
                boolean __createDateLoaded = createDate != null;
                if (__createDateLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__createDateLoaded && !Objects.equals(createDate, other.createDate())) {
                    return false;
                }
                boolean __updateByLoaded = updateBy != null;
                if (__updateByLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__updateByLoaded && !Objects.equals(updateBy, other.updateBy())) {
                    return false;
                }
                boolean __updateDateLoaded = updateDate != null;
                if (__updateDateLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__updateDateLoaded && !Objects.equals(updateDate, other.updateDate())) {
                    return false;
                }
                boolean __remarksLoaded = remarksLoaded;
                if (__remarksLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__remarksLoaded && !Objects.equals(remarks, other.remarks())) {
                    return false;
                }
                boolean __parentLoaded = parentLoaded;
                if (__parentLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__parentLoaded && !Objects.equals(parent, other.parent())) {
                    return false;
                }
                boolean __childrenLoaded = children != null;
                if (__childrenLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__childrenLoaded && !Objects.equals(children, other.children())) {
                    return false;
                }
                boolean __parentCodesLoaded = parentCodes != null;
                if (__parentCodesLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__parentCodesLoaded && !Objects.equals(parentCodes, other.parentCodes())) {
                    return false;
                }
                boolean __treeSortLoaded = treeSort != null;
                if (__treeSortLoaded != other.__isLoaded(11)) {
                    return false;
                }
                if (__treeSortLoaded && !Objects.equals(treeSort, other.treeSort())) {
                    return false;
                }
                boolean __treeSortsLoaded = treeSorts != null;
                if (__treeSortsLoaded != other.__isLoaded(12)) {
                    return false;
                }
                if (__treeSortsLoaded && !Objects.equals(treeSorts, other.treeSorts())) {
                    return false;
                }
                boolean __treeLeafLoaded = treeLeaf != null;
                if (__treeLeafLoaded != other.__isLoaded(13)) {
                    return false;
                }
                if (__treeLeafLoaded && !Objects.equals(treeLeaf, other.treeLeaf())) {
                    return false;
                }
                boolean __treeLevelLoaded = treeLevel != null;
                if (__treeLevelLoaded != other.__isLoaded(14)) {
                    return false;
                }
                if (__treeLevelLoaded && !Objects.equals(treeLevel, other.treeLevel())) {
                    return false;
                }
                boolean __treeNamesLoaded = treeNames != null;
                if (__treeNamesLoaded != other.__isLoaded(15)) {
                    return false;
                }
                if (__treeNamesLoaded && !Objects.equals(treeNames, other.treeNames())) {
                    return false;
                }
                boolean __menuNameLoaded = menuName != null;
                if (__menuNameLoaded != other.__isLoaded(16)) {
                    return false;
                }
                if (__menuNameLoaded && !Objects.equals(menuName, other.menuName())) {
                    return false;
                }
                boolean __menuTypeLoaded = menuType != null;
                if (__menuTypeLoaded != other.__isLoaded(17)) {
                    return false;
                }
                if (__menuTypeLoaded && !Objects.equals(menuType, other.menuType())) {
                    return false;
                }
                boolean __menuHrefLoaded = menuHrefLoaded;
                if (__menuHrefLoaded != other.__isLoaded(18)) {
                    return false;
                }
                if (__menuHrefLoaded && !Objects.equals(menuHref, other.menuHref())) {
                    return false;
                }
                boolean __menuComponentLoaded = menuComponentLoaded;
                if (__menuComponentLoaded != other.__isLoaded(19)) {
                    return false;
                }
                if (__menuComponentLoaded && !Objects.equals(menuComponent, other.menuComponent())) {
                    return false;
                }
                boolean __menuTargetLoaded = menuTargetLoaded;
                if (__menuTargetLoaded != other.__isLoaded(20)) {
                    return false;
                }
                if (__menuTargetLoaded && !Objects.equals(menuTarget, other.menuTarget())) {
                    return false;
                }
                boolean __menuIconLoaded = menuIconLoaded;
                if (__menuIconLoaded != other.__isLoaded(21)) {
                    return false;
                }
                if (__menuIconLoaded && !Objects.equals(menuIcon, other.menuIcon())) {
                    return false;
                }
                boolean __menuColorLoaded = menuColorLoaded;
                if (__menuColorLoaded != other.__isLoaded(22)) {
                    return false;
                }
                if (__menuColorLoaded && !Objects.equals(menuColor, other.menuColor())) {
                    return false;
                }
                boolean __menuTitleLoaded = menuTitleLoaded;
                if (__menuTitleLoaded != other.__isLoaded(23)) {
                    return false;
                }
                if (__menuTitleLoaded && !Objects.equals(menuTitle, other.menuTitle())) {
                    return false;
                }
                boolean __permissionLoaded = permissionLoaded;
                if (__permissionLoaded != other.__isLoaded(24)) {
                    return false;
                }
                if (__permissionLoaded && !Objects.equals(permission, other.permission())) {
                    return false;
                }
                boolean __weightLoaded = weight != null;
                if (__weightLoaded != other.__isLoaded(25)) {
                    return false;
                }
                if (__weightLoaded && !Objects.equals(weight, other.weight())) {
                    return false;
                }
                boolean __showLoaded = showLoaded;
                if (__showLoaded != other.__isLoaded(26)) {
                    return false;
                }
                if (__showLoaded && show != other.isShow()) {
                    return false;
                }
                boolean __sysCodeLoaded = sysCode != null;
                if (__sysCodeLoaded != other.__isLoaded(27)) {
                    return false;
                }
                if (__sysCodeLoaded && !Objects.equals(sysCode, other.sysCode())) {
                    return false;
                }
                boolean __rolesLoaded = roles != null;
                if (__rolesLoaded != other.__isLoaded(28)) {
                    return false;
                }
                if (__rolesLoaded && !Objects.equals(roles, other.roles())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor other = (Implementor)obj;
                boolean __idLoaded = id != null;
                if (__idLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__idLoaded && id != other.id()) {
                    return false;
                }
                boolean __statusLoaded = status != null;
                if (__statusLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__statusLoaded && status != other.status()) {
                    return false;
                }
                boolean __createByLoaded = createBy != null;
                if (__createByLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__createByLoaded && createBy != other.createBy()) {
                    return false;
                }
                boolean __createDateLoaded = createDate != null;
                if (__createDateLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__createDateLoaded && createDate != other.createDate()) {
                    return false;
                }
                boolean __updateByLoaded = updateBy != null;
                if (__updateByLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__updateByLoaded && updateBy != other.updateBy()) {
                    return false;
                }
                boolean __updateDateLoaded = updateDate != null;
                if (__updateDateLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__updateDateLoaded && updateDate != other.updateDate()) {
                    return false;
                }
                boolean __remarksLoaded = remarksLoaded;
                if (__remarksLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__remarksLoaded && remarks != other.remarks()) {
                    return false;
                }
                boolean __parentLoaded = parentLoaded;
                if (__parentLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__parentLoaded && parent != other.parent()) {
                    return false;
                }
                boolean __childrenLoaded = children != null;
                if (__childrenLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__childrenLoaded && children != other.children()) {
                    return false;
                }
                boolean __parentCodesLoaded = parentCodes != null;
                if (__parentCodesLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__parentCodesLoaded && parentCodes != other.parentCodes()) {
                    return false;
                }
                boolean __treeSortLoaded = treeSort != null;
                if (__treeSortLoaded != other.__isLoaded(11)) {
                    return false;
                }
                if (__treeSortLoaded && treeSort != other.treeSort()) {
                    return false;
                }
                boolean __treeSortsLoaded = treeSorts != null;
                if (__treeSortsLoaded != other.__isLoaded(12)) {
                    return false;
                }
                if (__treeSortsLoaded && treeSorts != other.treeSorts()) {
                    return false;
                }
                boolean __treeLeafLoaded = treeLeaf != null;
                if (__treeLeafLoaded != other.__isLoaded(13)) {
                    return false;
                }
                if (__treeLeafLoaded && treeLeaf != other.treeLeaf()) {
                    return false;
                }
                boolean __treeLevelLoaded = treeLevel != null;
                if (__treeLevelLoaded != other.__isLoaded(14)) {
                    return false;
                }
                if (__treeLevelLoaded && treeLevel != other.treeLevel()) {
                    return false;
                }
                boolean __treeNamesLoaded = treeNames != null;
                if (__treeNamesLoaded != other.__isLoaded(15)) {
                    return false;
                }
                if (__treeNamesLoaded && treeNames != other.treeNames()) {
                    return false;
                }
                boolean __menuNameLoaded = menuName != null;
                if (__menuNameLoaded != other.__isLoaded(16)) {
                    return false;
                }
                if (__menuNameLoaded && menuName != other.menuName()) {
                    return false;
                }
                boolean __menuTypeLoaded = menuType != null;
                if (__menuTypeLoaded != other.__isLoaded(17)) {
                    return false;
                }
                if (__menuTypeLoaded && menuType != other.menuType()) {
                    return false;
                }
                boolean __menuHrefLoaded = menuHrefLoaded;
                if (__menuHrefLoaded != other.__isLoaded(18)) {
                    return false;
                }
                if (__menuHrefLoaded && menuHref != other.menuHref()) {
                    return false;
                }
                boolean __menuComponentLoaded = menuComponentLoaded;
                if (__menuComponentLoaded != other.__isLoaded(19)) {
                    return false;
                }
                if (__menuComponentLoaded && menuComponent != other.menuComponent()) {
                    return false;
                }
                boolean __menuTargetLoaded = menuTargetLoaded;
                if (__menuTargetLoaded != other.__isLoaded(20)) {
                    return false;
                }
                if (__menuTargetLoaded && menuTarget != other.menuTarget()) {
                    return false;
                }
                boolean __menuIconLoaded = menuIconLoaded;
                if (__menuIconLoaded != other.__isLoaded(21)) {
                    return false;
                }
                if (__menuIconLoaded && menuIcon != other.menuIcon()) {
                    return false;
                }
                boolean __menuColorLoaded = menuColorLoaded;
                if (__menuColorLoaded != other.__isLoaded(22)) {
                    return false;
                }
                if (__menuColorLoaded && menuColor != other.menuColor()) {
                    return false;
                }
                boolean __menuTitleLoaded = menuTitleLoaded;
                if (__menuTitleLoaded != other.__isLoaded(23)) {
                    return false;
                }
                if (__menuTitleLoaded && menuTitle != other.menuTitle()) {
                    return false;
                }
                boolean __permissionLoaded = permissionLoaded;
                if (__permissionLoaded != other.__isLoaded(24)) {
                    return false;
                }
                if (__permissionLoaded && permission != other.permission()) {
                    return false;
                }
                boolean __weightLoaded = weight != null;
                if (__weightLoaded != other.__isLoaded(25)) {
                    return false;
                }
                if (__weightLoaded && weight != other.weight()) {
                    return false;
                }
                boolean __showLoaded = showLoaded;
                if (__showLoaded != other.__isLoaded(26)) {
                    return false;
                }
                if (__showLoaded && show != other.isShow()) {
                    return false;
                }
                boolean __sysCodeLoaded = sysCode != null;
                if (__sysCodeLoaded != other.__isLoaded(27)) {
                    return false;
                }
                if (__sysCodeLoaded && sysCode != other.sysCode()) {
                    return false;
                }
                boolean __rolesLoaded = roles != null;
                if (__rolesLoaded != other.__isLoaded(28)) {
                    return false;
                }
                if (__rolesLoaded && roles != other.roles()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, MenuDraft {
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
                    __base = new Impl();
                }
            }

            @Override
            public boolean __isLoaded(int prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isLoaded(String prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
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
                __tmpModified.id = id;
                return this;
            }

            @Override
            public String status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public MenuDraft setStatus(String status) {
                if (status == null) {
                    throw new IllegalArgumentException(
                        "'status' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.status = status;
                return this;
            }

            @Override
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
                __tmpModified.createBy = createBy;
                return this;
            }

            @Override
            public LocalDateTime createDate() {
                return (__modified!= null ? __modified : __base).createDate();
            }

            @Override
            public MenuDraft setCreateDate(LocalDateTime createDate) {
                if (createDate == null) {
                    throw new IllegalArgumentException(
                        "'createDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.createDate = createDate;
                return this;
            }

            @Override
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
                __tmpModified.updateBy = updateBy;
                return this;
            }

            @Override
            public LocalDateTime updateDate() {
                return (__modified!= null ? __modified : __base).updateDate();
            }

            @Override
            public MenuDraft setUpdateDate(LocalDateTime updateDate) {
                if (updateDate == null) {
                    throw new IllegalArgumentException(
                        "'updateDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.updateDate = updateDate;
                return this;
            }

            @Override
            public String remarks() {
                return (__modified!= null ? __modified : __base).remarks();
            }

            @Override
            public MenuDraft setRemarks(String remarks) {
                Impl __tmpModified = __modified();
                __tmpModified.remarks = remarks;
                __tmpModified.remarksLoaded = true;
                return this;
            }

            @Override
            public MenuDraft parent() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public MenuDraft parent(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(8) || parent() == null)) {
                    setParent(MenuDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public MenuDraft setParent(Menu parent) {
                Impl __tmpModified = __modified();
                __tmpModified.parent = parent;
                __tmpModified.parentLoaded = true;
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
            public List<Menu> children() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).children(), Menu.class, true);
            }

            @Override
            public List<MenuDraft> children(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(9) || children() == null)) {
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
                __tmpModified.children = NonSharedList.of(__tmpModified.children, children);
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
            public String parentCodes() {
                return (__modified!= null ? __modified : __base).parentCodes();
            }

            @Override
            public MenuDraft setParentCodes(String parentCodes) {
                if (parentCodes == null) {
                    throw new IllegalArgumentException(
                        "'parentCodes' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.parentCodes = parentCodes;
                return this;
            }

            @Override
            public BigDecimal treeSort() {
                return (__modified!= null ? __modified : __base).treeSort();
            }

            @Override
            public MenuDraft setTreeSort(BigDecimal treeSort) {
                if (treeSort == null) {
                    throw new IllegalArgumentException(
                        "'treeSort' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.treeSort = treeSort;
                return this;
            }

            @Override
            public String treeSorts() {
                return (__modified!= null ? __modified : __base).treeSorts();
            }

            @Override
            public MenuDraft setTreeSorts(String treeSorts) {
                if (treeSorts == null) {
                    throw new IllegalArgumentException(
                        "'treeSorts' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.treeSorts = treeSorts;
                return this;
            }

            @Override
            public String treeLeaf() {
                return (__modified!= null ? __modified : __base).treeLeaf();
            }

            @Override
            public MenuDraft setTreeLeaf(String treeLeaf) {
                if (treeLeaf == null) {
                    throw new IllegalArgumentException(
                        "'treeLeaf' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.treeLeaf = treeLeaf;
                return this;
            }

            @Override
            public BigDecimal treeLevel() {
                return (__modified!= null ? __modified : __base).treeLevel();
            }

            @Override
            public MenuDraft setTreeLevel(BigDecimal treeLevel) {
                if (treeLevel == null) {
                    throw new IllegalArgumentException(
                        "'treeLevel' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.treeLevel = treeLevel;
                return this;
            }

            @Override
            public String treeNames() {
                return (__modified!= null ? __modified : __base).treeNames();
            }

            @Override
            public MenuDraft setTreeNames(String treeNames) {
                if (treeNames == null) {
                    throw new IllegalArgumentException(
                        "'treeNames' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.treeNames = treeNames;
                return this;
            }

            @Override
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
                __tmpModified.menuName = menuName;
                return this;
            }

            @Override
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
                __tmpModified.menuType = menuType;
                return this;
            }

            @Override
            public String menuHref() {
                return (__modified!= null ? __modified : __base).menuHref();
            }

            @Override
            public MenuDraft setMenuHref(String menuHref) {
                Impl __tmpModified = __modified();
                __tmpModified.menuHref = menuHref;
                __tmpModified.menuHrefLoaded = true;
                return this;
            }

            @Override
            public String menuComponent() {
                return (__modified!= null ? __modified : __base).menuComponent();
            }

            @Override
            public MenuDraft setMenuComponent(String menuComponent) {
                Impl __tmpModified = __modified();
                __tmpModified.menuComponent = menuComponent;
                __tmpModified.menuComponentLoaded = true;
                return this;
            }

            @Override
            public String menuTarget() {
                return (__modified!= null ? __modified : __base).menuTarget();
            }

            @Override
            public MenuDraft setMenuTarget(String menuTarget) {
                Impl __tmpModified = __modified();
                __tmpModified.menuTarget = menuTarget;
                __tmpModified.menuTargetLoaded = true;
                return this;
            }

            @Override
            public String menuIcon() {
                return (__modified!= null ? __modified : __base).menuIcon();
            }

            @Override
            public MenuDraft setMenuIcon(String menuIcon) {
                Impl __tmpModified = __modified();
                __tmpModified.menuIcon = menuIcon;
                __tmpModified.menuIconLoaded = true;
                return this;
            }

            @Override
            public String menuColor() {
                return (__modified!= null ? __modified : __base).menuColor();
            }

            @Override
            public MenuDraft setMenuColor(String menuColor) {
                Impl __tmpModified = __modified();
                __tmpModified.menuColor = menuColor;
                __tmpModified.menuColorLoaded = true;
                return this;
            }

            @Override
            public String menuTitle() {
                return (__modified!= null ? __modified : __base).menuTitle();
            }

            @Override
            public MenuDraft setMenuTitle(String menuTitle) {
                Impl __tmpModified = __modified();
                __tmpModified.menuTitle = menuTitle;
                __tmpModified.menuTitleLoaded = true;
                return this;
            }

            @Override
            public String permission() {
                return (__modified!= null ? __modified : __base).permission();
            }

            @Override
            public MenuDraft setPermission(String permission) {
                Impl __tmpModified = __modified();
                __tmpModified.permission = permission;
                __tmpModified.permissionLoaded = true;
                return this;
            }

            @Override
            public BigDecimal weight() {
                return (__modified!= null ? __modified : __base).weight();
            }

            @Override
            public MenuDraft setWeight(BigDecimal weight) {
                if (weight == null) {
                    throw new IllegalArgumentException(
                        "'weight' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.weight = weight;
                return this;
            }

            @Override
            @JsonIgnore
            public boolean isShow() {
                return (__modified!= null ? __modified : __base).isShow();
            }

            @Override
            public MenuDraft setShow(boolean show) {
                Impl __tmpModified = __modified();
                __tmpModified.show = show;
                __tmpModified.showLoaded = true;
                return this;
            }

            @Override
            public String sysCode() {
                return (__modified!= null ? __modified : __base).sysCode();
            }

            @Override
            public MenuDraft setSysCode(String sysCode) {
                if (sysCode == null) {
                    throw new IllegalArgumentException(
                        "'sysCode' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.sysCode = sysCode;
                return this;
            }

            @Override
            public List<Role> roles() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).roles(), Role.class, true);
            }

            @Override
            public List<RoleDraft> roles(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(28) || roles() == null)) {
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
                __tmpModified.roles = NonSharedList.of(__tmpModified.roles, roles);
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
            public void __set(int prop, Object value) {
                switch (prop) {
                    case 1: setId((String)value);break;
                    case 2: setStatus((String)value);break;
                    case 3: setCreateBy((String)value);break;
                    case 4: setCreateDate((LocalDateTime)value);break;
                    case 5: setUpdateBy((String)value);break;
                    case 6: setUpdateDate((LocalDateTime)value);break;
                    case 7: setRemarks((String)value);break;
                    case 8: setParent((Menu)value);break;
                    case 9: setChildren((List<Menu>)value);break;
                    case 10: setParentCodes((String)value);break;
                    case 11: setTreeSort((BigDecimal)value);break;
                    case 12: setTreeSorts((String)value);break;
                    case 13: setTreeLeaf((String)value);break;
                    case 14: setTreeLevel((BigDecimal)value);break;
                    case 15: setTreeNames((String)value);break;
                    case 16: setMenuName((String)value);break;
                    case 17: setMenuType((String)value);break;
                    case 18: setMenuHref((String)value);break;
                    case 19: setMenuComponent((String)value);break;
                    case 20: setMenuTarget((String)value);break;
                    case 21: setMenuIcon((String)value);break;
                    case 22: setMenuColor((String)value);break;
                    case 23: setMenuTitle((String)value);break;
                    case 24: setPermission((String)value);break;
                    case 25: setWeight((BigDecimal)value);break;
                    case 26: 
                            if (value == null) throw new IllegalArgumentException("'show' cannot be null");
                            setShow((Boolean)value);
                            break;
                    case 27: setSysCode((String)value);break;
                    case 28: setRoles((List<Role>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id": setId((String)value);break;
                    case "status": setStatus((String)value);break;
                    case "createBy": setCreateBy((String)value);break;
                    case "createDate": setCreateDate((LocalDateTime)value);break;
                    case "updateBy": setUpdateBy((String)value);break;
                    case "updateDate": setUpdateDate((LocalDateTime)value);break;
                    case "remarks": setRemarks((String)value);break;
                    case "parent": setParent((Menu)value);break;
                    case "children": setChildren((List<Menu>)value);break;
                    case "parentCodes": setParentCodes((String)value);break;
                    case "treeSort": setTreeSort((BigDecimal)value);break;
                    case "treeSorts": setTreeSorts((String)value);break;
                    case "treeLeaf": setTreeLeaf((String)value);break;
                    case "treeLevel": setTreeLevel((BigDecimal)value);break;
                    case "treeNames": setTreeNames((String)value);break;
                    case "menuName": setMenuName((String)value);break;
                    case "menuType": setMenuType((String)value);break;
                    case "menuHref": setMenuHref((String)value);break;
                    case "menuComponent": setMenuComponent((String)value);break;
                    case "menuTarget": setMenuTarget((String)value);break;
                    case "menuIcon": setMenuIcon((String)value);break;
                    case "menuColor": setMenuColor((String)value);break;
                    case "menuTitle": setMenuTitle((String)value);break;
                    case "permission": setPermission((String)value);break;
                    case "weight": setWeight((BigDecimal)value);break;
                    case "show": 
                            if (value == null) throw new IllegalArgumentException("'show' cannot be null");
                            setShow((Boolean)value);
                            break;
                    case "sysCode": setSysCode((String)value);break;
                    case "roles": setRoles((List<Role>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public void __use(int prop) {
                switch (prop) {
                    default: throw new IllegalArgumentException(
                                "Illegal property id: \"" + 
                                prop + 
                                "\",it does not exists or is not non-abstract formula property" + 
                                "(Only non-abstract formula property can be used)"
                            );
                }
            }

            @Override
            public void __use(String prop) {
                switch (prop) {
                    default: throw new IllegalArgumentException(
                                "Illegal property name: \"" + 
                                prop + 
                                "\",it does not exists or is not non-abstract formula property" + 
                                "(Only non-abstract formula property can be used)"
                            );
                }
            }

            @Override
            public void __unload(int prop) {
                switch (prop) {
                    case 1: __modified().id = null;break;
                    case 2: __modified().status = null;break;
                    case 3: __modified().createBy = null;break;
                    case 4: __modified().createDate = null;break;
                    case 5: __modified().updateBy = null;break;
                    case 6: __modified().updateDate = null;break;
                    case 7: __modified().remarksLoaded = false;break;
                    case 8: __modified().parentLoaded = false;break;
                    case 9: __modified().children = null;break;
                    case 10: __modified().parentCodes = null;break;
                    case 11: __modified().treeSort = null;break;
                    case 12: __modified().treeSorts = null;break;
                    case 13: __modified().treeLeaf = null;break;
                    case 14: __modified().treeLevel = null;break;
                    case 15: __modified().treeNames = null;break;
                    case 16: __modified().menuName = null;break;
                    case 17: __modified().menuType = null;break;
                    case 18: __modified().menuHrefLoaded = false;break;
                    case 19: __modified().menuComponentLoaded = false;break;
                    case 20: __modified().menuTargetLoaded = false;break;
                    case 21: __modified().menuIconLoaded = false;break;
                    case 22: __modified().menuColorLoaded = false;break;
                    case 23: __modified().menuTitleLoaded = false;break;
                    case 24: __modified().permissionLoaded = false;break;
                    case 25: __modified().weight = null;break;
                    case 26: __modified().showLoaded = false;break;
                    case 27: __modified().sysCode = null;break;
                    case 28: __modified().roles = null;break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id": __modified().id = null;break;
                    case "status": __modified().status = null;break;
                    case "createBy": __modified().createBy = null;break;
                    case "createDate": __modified().createDate = null;break;
                    case "updateBy": __modified().updateBy = null;break;
                    case "updateDate": __modified().updateDate = null;break;
                    case "remarks": __modified().remarksLoaded = false;break;
                    case "parent": __modified().parentLoaded = false;break;
                    case "children": __modified().children = null;break;
                    case "parentCodes": __modified().parentCodes = null;break;
                    case "treeSort": __modified().treeSort = null;break;
                    case "treeSorts": __modified().treeSorts = null;break;
                    case "treeLeaf": __modified().treeLeaf = null;break;
                    case "treeLevel": __modified().treeLevel = null;break;
                    case "treeNames": __modified().treeNames = null;break;
                    case "menuName": __modified().menuName = null;break;
                    case "menuType": __modified().menuType = null;break;
                    case "menuHref": __modified().menuHrefLoaded = false;break;
                    case "menuComponent": __modified().menuComponentLoaded = false;break;
                    case "menuTarget": __modified().menuTargetLoaded = false;break;
                    case "menuIcon": __modified().menuIconLoaded = false;break;
                    case "menuColor": __modified().menuColorLoaded = false;break;
                    case "menuTitle": __modified().menuTitleLoaded = false;break;
                    case "permission": __modified().permissionLoaded = false;break;
                    case "weight": __modified().weight = null;break;
                    case "show": __modified().showLoaded = false;break;
                    case "sysCode": __modified().sysCode = null;break;
                    case "roles": __modified().roles = null;break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
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
                        if (base.__isLoaded(8)) {
                            Menu oldValue = base.parent();
                            Menu newValue = __ctx.resolveObject(oldValue);
                            if (!ImmutableSpi.equals(oldValue, newValue, true)) {
                                setParent(newValue);
                            }
                        }
                        if (base.__isLoaded(9)) {
                            List<Menu> oldValue = base.children();
                            List<Menu> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setChildren(newValue);
                            }
                        }
                        if (base.__isLoaded(28)) {
                            List<Role> oldValue = base.roles();
                            List<Role> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setRoles(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.parent = __ctx.resolveObject(__tmpModified.parent);
                        __tmpModified.children = NonSharedList.of(__tmpModified.children, __ctx.resolveList(__tmpModified.children));
                        __tmpModified.roles = NonSharedList.of(__tmpModified.roles, __ctx.resolveList(__tmpModified.roles));
                    }
                    if (__tmpModified == null || ImmutableSpi.equals(base, __tmpModified, true)) {
                        return base;
                    }
                    return __tmpModified;
                }
                finally {
                    __resolving = false;
                }
            }

            private Impl __modified() {
                Impl __tmpModified = __modified;
                if (__tmpModified == null) {
                    __tmpModified = __base.clone();
                    __modified = __tmpModified;
                }
                return __tmpModified;
            }
        }
    }

    class MapStruct {
        private String id;

        private String status;

        private String createBy;

        private LocalDateTime createDate;

        private String updateBy;

        private LocalDateTime updateDate;

        private boolean remarksLoaded;

        private String remarks;

        private boolean parentLoaded;

        private Menu parent;

        private List<Menu> children;

        private String parentCodes;

        private BigDecimal treeSort;

        private String treeSorts;

        private String treeLeaf;

        private BigDecimal treeLevel;

        private String treeNames;

        private String menuName;

        private String menuType;

        private boolean menuHrefLoaded;

        private String menuHref;

        private boolean menuComponentLoaded;

        private String menuComponent;

        private boolean menuTargetLoaded;

        private String menuTarget;

        private boolean menuIconLoaded;

        private String menuIcon;

        private boolean menuColorLoaded;

        private String menuColor;

        private boolean menuTitleLoaded;

        private String menuTitle;

        private boolean permissionLoaded;

        private String permission;

        private BigDecimal weight;

        private boolean showLoaded;

        private boolean show;

        private String sysCode;

        private List<Role> roles;

        public MapStruct id(String id) {
            if (id != null) {
                this.id = id;
            }
            return this;
        }

        public MapStruct status(String status) {
            if (status != null) {
                this.status = status;
            }
            return this;
        }

        public MapStruct createBy(String createBy) {
            if (createBy != null) {
                this.createBy = createBy;
            }
            return this;
        }

        public MapStruct createDate(LocalDateTime createDate) {
            if (createDate != null) {
                this.createDate = createDate;
            }
            return this;
        }

        public MapStruct updateBy(String updateBy) {
            if (updateBy != null) {
                this.updateBy = updateBy;
            }
            return this;
        }

        public MapStruct updateDate(LocalDateTime updateDate) {
            if (updateDate != null) {
                this.updateDate = updateDate;
            }
            return this;
        }

        public MapStruct remarks(String remarks) {
            this.remarksLoaded = true;
            this.remarks = remarks;
            return this;
        }

        public MapStruct parent(Menu parent) {
            this.parentLoaded = true;
            this.parent = parent;
            return this;
        }

        public MapStruct children(List<Menu> children) {
            this.children = children != null ? children : Collections.emptyList();
            return this;
        }

        public MapStruct parentCodes(String parentCodes) {
            if (parentCodes != null) {
                this.parentCodes = parentCodes;
            }
            return this;
        }

        public MapStruct treeSort(BigDecimal treeSort) {
            if (treeSort != null) {
                this.treeSort = treeSort;
            }
            return this;
        }

        public MapStruct treeSorts(String treeSorts) {
            if (treeSorts != null) {
                this.treeSorts = treeSorts;
            }
            return this;
        }

        public MapStruct treeLeaf(String treeLeaf) {
            if (treeLeaf != null) {
                this.treeLeaf = treeLeaf;
            }
            return this;
        }

        public MapStruct treeLevel(BigDecimal treeLevel) {
            if (treeLevel != null) {
                this.treeLevel = treeLevel;
            }
            return this;
        }

        public MapStruct treeNames(String treeNames) {
            if (treeNames != null) {
                this.treeNames = treeNames;
            }
            return this;
        }

        public MapStruct menuName(String menuName) {
            if (menuName != null) {
                this.menuName = menuName;
            }
            return this;
        }

        public MapStruct menuType(String menuType) {
            if (menuType != null) {
                this.menuType = menuType;
            }
            return this;
        }

        public MapStruct menuHref(String menuHref) {
            this.menuHrefLoaded = true;
            this.menuHref = menuHref;
            return this;
        }

        public MapStruct menuComponent(String menuComponent) {
            this.menuComponentLoaded = true;
            this.menuComponent = menuComponent;
            return this;
        }

        public MapStruct menuTarget(String menuTarget) {
            this.menuTargetLoaded = true;
            this.menuTarget = menuTarget;
            return this;
        }

        public MapStruct menuIcon(String menuIcon) {
            this.menuIconLoaded = true;
            this.menuIcon = menuIcon;
            return this;
        }

        public MapStruct menuColor(String menuColor) {
            this.menuColorLoaded = true;
            this.menuColor = menuColor;
            return this;
        }

        public MapStruct menuTitle(String menuTitle) {
            this.menuTitleLoaded = true;
            this.menuTitle = menuTitle;
            return this;
        }

        public MapStruct permission(String permission) {
            this.permissionLoaded = true;
            this.permission = permission;
            return this;
        }

        public MapStruct weight(BigDecimal weight) {
            if (weight != null) {
                this.weight = weight;
            }
            return this;
        }

        public MapStruct show(boolean show) {
            this.showLoaded = true;
            this.show = show;
            return this;
        }

        public MapStruct sysCode(String sysCode) {
            if (sysCode != null) {
                this.sysCode = sysCode;
            }
            return this;
        }

        public MapStruct roles(List<Role> roles) {
            this.roles = roles != null ? roles : Collections.emptyList();
            return this;
        }

        public Menu build() {
            return MenuDraft.$.produce(draft -> {
                if (id != null) {
                    draft.setId(id);
                }
                if (status != null) {
                    draft.setStatus(status);
                }
                if (createBy != null) {
                    draft.setCreateBy(createBy);
                }
                if (createDate != null) {
                    draft.setCreateDate(createDate);
                }
                if (updateBy != null) {
                    draft.setUpdateBy(updateBy);
                }
                if (updateDate != null) {
                    draft.setUpdateDate(updateDate);
                }
                if (remarksLoaded) {
                    draft.setRemarks(remarks);
                }
                if (parentLoaded) {
                    draft.setParent(parent);
                }
                if (children != null) {
                    draft.setChildren(children);
                }
                if (parentCodes != null) {
                    draft.setParentCodes(parentCodes);
                }
                if (treeSort != null) {
                    draft.setTreeSort(treeSort);
                }
                if (treeSorts != null) {
                    draft.setTreeSorts(treeSorts);
                }
                if (treeLeaf != null) {
                    draft.setTreeLeaf(treeLeaf);
                }
                if (treeLevel != null) {
                    draft.setTreeLevel(treeLevel);
                }
                if (treeNames != null) {
                    draft.setTreeNames(treeNames);
                }
                if (menuName != null) {
                    draft.setMenuName(menuName);
                }
                if (menuType != null) {
                    draft.setMenuType(menuType);
                }
                if (menuHrefLoaded) {
                    draft.setMenuHref(menuHref);
                }
                if (menuComponentLoaded) {
                    draft.setMenuComponent(menuComponent);
                }
                if (menuTargetLoaded) {
                    draft.setMenuTarget(menuTarget);
                }
                if (menuIconLoaded) {
                    draft.setMenuIcon(menuIcon);
                }
                if (menuColorLoaded) {
                    draft.setMenuColor(menuColor);
                }
                if (menuTitleLoaded) {
                    draft.setMenuTitle(menuTitle);
                }
                if (permissionLoaded) {
                    draft.setPermission(permission);
                }
                if (weight != null) {
                    draft.setWeight(weight);
                }
                if (showLoaded) {
                    draft.setShow(show);
                }
                if (sysCode != null) {
                    draft.setSysCode(sysCode);
                }
                if (roles != null) {
                    draft.setRoles(roles);
                }
            });
        }
    }
}
