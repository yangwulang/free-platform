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
import org.babyfish.jimmer.sql.OneToMany;

public interface DictDataDraft extends DictData, DataTypeBaseDraft {
    DictDataDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    DictDataDraft setId(String id);

    @OldChain
    DictDataDraft setStatus(String status);

    @OldChain
    DictDataDraft setCreateBy(String createBy);

    @OldChain
    DictDataDraft setCreateDate(LocalDateTime createDate);

    @OldChain
    DictDataDraft setUpdateBy(String updateBy);

    @OldChain
    DictDataDraft setUpdateDate(LocalDateTime updateDate);

    @OldChain
    DictDataDraft setRemarks(String remarks);

    DictDataDraft parent();

    DictDataDraft parent(boolean autoCreate);

    @OldChain
    DictDataDraft setParent(DictData parent);

    @OldChain
    DictDataDraft setParent(DraftConsumer<DictDataDraft> block);

    @OldChain
    DictDataDraft setParent(DictData base, DraftConsumer<DictDataDraft> block);

    List<DictDataDraft> children(boolean autoCreate);

    @OldChain
    DictDataDraft setChildren(List<DictData> children);

    @OldChain
    DictDataDraft addIntoChildren(DraftConsumer<DictDataDraft> block);

    @OldChain
    DictDataDraft addIntoChildren(DictData base, DraftConsumer<DictDataDraft> block);

    DictTypeDraft dictType();

    DictTypeDraft dictType(boolean autoCreate);

    @OldChain
    DictDataDraft setDictType(DictType dictType);

    @OldChain
    DictDataDraft setDictType(DraftConsumer<DictTypeDraft> block);

    @OldChain
    DictDataDraft setDictType(DictType base, DraftConsumer<DictTypeDraft> block);

    @OldChain
    DictDataDraft setParentCodes(String parentCodes);

    @OldChain
    DictDataDraft setTreeSort(BigDecimal treeSort);

    @OldChain
    DictDataDraft setTreeSorts(String treeSorts);

    @OldChain
    DictDataDraft setTreeLeaf(String treeLeaf);

    @OldChain
    DictDataDraft setTreeLevel(BigDecimal treeLevel);

    @OldChain
    DictDataDraft setTreeNames(String treeNames);

    @OldChain
    DictDataDraft setDictLabel(String dictLabel);

    @OldChain
    DictDataDraft setDictValue(String dictValue);

    @OldChain
    DictDataDraft setSys(boolean sys);

    @OldChain
    DictDataDraft setDescription(String description);

    @OldChain
    DictDataDraft setCssStyle(String cssStyle);

    @OldChain
    DictDataDraft setCssClass(String cssClass);

    @OldChain
    DictDataDraft setCorpCode(String corpCode);

    @OldChain
    DictDataDraft setCorpName(String corpName);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                DictData.class,
                DataTypeBaseDraft.Producer.TYPE,
                (ctx, base) -> new DraftImpl(ctx, (DictData)base)
            )
            .keyReference(8, "parent", DictData.class, true)
            .add(9, "children", OneToMany.class, DictData.class, false)
            .keyReference(10, "dictType", DictType.class, true)
            .add(11, "parentCodes", ImmutablePropCategory.SCALAR, String.class, true)
            .add(12, "treeSort", ImmutablePropCategory.SCALAR, BigDecimal.class, true)
            .add(13, "treeSorts", ImmutablePropCategory.SCALAR, String.class, true)
            .add(14, "treeLeaf", ImmutablePropCategory.SCALAR, String.class, true)
            .add(15, "treeLevel", ImmutablePropCategory.SCALAR, BigDecimal.class, true)
            .add(16, "treeNames", ImmutablePropCategory.SCALAR, String.class, true)
            .add(17, "dictLabel", ImmutablePropCategory.SCALAR, String.class, true)
            .add(18, "dictValue", ImmutablePropCategory.SCALAR, String.class, true)
            .add(19, "sys", ImmutablePropCategory.SCALAR, boolean.class, true)
            .add(20, "description", ImmutablePropCategory.SCALAR, String.class, true)
            .add(21, "cssStyle", ImmutablePropCategory.SCALAR, String.class, true)
            .add(22, "cssClass", ImmutablePropCategory.SCALAR, String.class, true)
            .add(23, "corpCode", ImmutablePropCategory.SCALAR, String.class, true)
            .add(24, "corpName", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public DictData produce(DraftConsumer<DictDataDraft> block) {
            return produce(null, block);
        }

        public DictData produce(DictData base, DraftConsumer<DictDataDraft> block) {
            return (DictData)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements DictData, ImmutableSpi {
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
                    case 10: return dictType();
                    case 11: return parentCodes();
                    case 12: return treeSort();
                    case 13: return treeSorts();
                    case 14: return treeLeaf();
                    case 15: return treeLevel();
                    case 16: return treeNames();
                    case 17: return dictLabel();
                    case 18: return dictValue();
                    case 19: return (Boolean)isSys();
                    case 20: return description();
                    case 21: return cssStyle();
                    case 22: return cssClass();
                    case 23: return corpCode();
                    case 24: return corpName();
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
                    case "dictType": return dictType();
                    case "parentCodes": return parentCodes();
                    case "treeSort": return treeSort();
                    case "treeSorts": return treeSorts();
                    case "treeLeaf": return treeLeaf();
                    case "treeLevel": return treeLevel();
                    case "treeNames": return treeNames();
                    case "dictLabel": return dictLabel();
                    case "dictValue": return dictValue();
                    case "sys": return (Boolean)isSys();
                    case "description": return description();
                    case "cssStyle": return cssStyle();
                    case "cssClass": return cssClass();
                    case "corpCode": return corpCode();
                    case "corpName": return corpName();
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

            DictData parent;

            boolean parentLoaded = false;

            NonSharedList<DictData> children;

            DictType dictType;

            boolean dictTypeLoaded = false;

            String parentCodes;

            boolean parentCodesLoaded = false;

            BigDecimal treeSort;

            boolean treeSortLoaded = false;

            String treeSorts;

            boolean treeSortsLoaded = false;

            String treeLeaf;

            boolean treeLeafLoaded = false;

            BigDecimal treeLevel;

            boolean treeLevelLoaded = false;

            String treeNames;

            boolean treeNamesLoaded = false;

            String dictLabel;

            boolean dictLabelLoaded = false;

            String dictValue;

            boolean dictValueLoaded = false;

            boolean sys;

            boolean sysLoaded = false;

            String description;

            boolean descriptionLoaded = false;

            String cssStyle;

            boolean cssStyleLoaded = false;

            String cssClass;

            boolean cssClassLoaded = false;

            String corpCode;

            boolean corpCodeLoaded = false;

            String corpName;

            boolean corpNameLoaded = false;

            @Override
            public String id() {
                if (id == null) {
                    throw new UnloadedException(DictData.class, "id");
                }
                return id;
            }

            @Override
            public String status() {
                if (status == null) {
                    throw new UnloadedException(DictData.class, "status");
                }
                return status;
            }

            @Override
            public String createBy() {
                if (createBy == null) {
                    throw new UnloadedException(DictData.class, "createBy");
                }
                return createBy;
            }

            @Override
            public LocalDateTime createDate() {
                if (createDate == null) {
                    throw new UnloadedException(DictData.class, "createDate");
                }
                return createDate;
            }

            @Override
            public String updateBy() {
                if (updateBy == null) {
                    throw new UnloadedException(DictData.class, "updateBy");
                }
                return updateBy;
            }

            @Override
            public LocalDateTime updateDate() {
                if (updateDate == null) {
                    throw new UnloadedException(DictData.class, "updateDate");
                }
                return updateDate;
            }

            @Override
            public String remarks() {
                if (remarks == null) {
                    throw new UnloadedException(DictData.class, "remarks");
                }
                return remarks;
            }

            @Override
            public DictData parent() {
                if (!parentLoaded) {
                    throw new UnloadedException(DictData.class, "parent");
                }
                return parent;
            }

            @Override
            public List<DictData> children() {
                if (children == null) {
                    throw new UnloadedException(DictData.class, "children");
                }
                return children;
            }

            @Override
            public DictType dictType() {
                if (!dictTypeLoaded) {
                    throw new UnloadedException(DictData.class, "dictType");
                }
                return dictType;
            }

            @Override
            public String parentCodes() {
                if (!parentCodesLoaded) {
                    throw new UnloadedException(DictData.class, "parentCodes");
                }
                return parentCodes;
            }

            @Override
            public BigDecimal treeSort() {
                if (!treeSortLoaded) {
                    throw new UnloadedException(DictData.class, "treeSort");
                }
                return treeSort;
            }

            @Override
            public String treeSorts() {
                if (!treeSortsLoaded) {
                    throw new UnloadedException(DictData.class, "treeSorts");
                }
                return treeSorts;
            }

            @Override
            public String treeLeaf() {
                if (!treeLeafLoaded) {
                    throw new UnloadedException(DictData.class, "treeLeaf");
                }
                return treeLeaf;
            }

            @Override
            public BigDecimal treeLevel() {
                if (!treeLevelLoaded) {
                    throw new UnloadedException(DictData.class, "treeLevel");
                }
                return treeLevel;
            }

            @Override
            public String treeNames() {
                if (!treeNamesLoaded) {
                    throw new UnloadedException(DictData.class, "treeNames");
                }
                return treeNames;
            }

            @Override
            public String dictLabel() {
                if (!dictLabelLoaded) {
                    throw new UnloadedException(DictData.class, "dictLabel");
                }
                return dictLabel;
            }

            @Override
            public String dictValue() {
                if (!dictValueLoaded) {
                    throw new UnloadedException(DictData.class, "dictValue");
                }
                return dictValue;
            }

            @Override
            @JsonIgnore
            public boolean isSys() {
                if (!sysLoaded) {
                    throw new UnloadedException(DictData.class, "sys");
                }
                return sys;
            }

            @Override
            public String description() {
                if (!descriptionLoaded) {
                    throw new UnloadedException(DictData.class, "description");
                }
                return description;
            }

            @Override
            public String cssStyle() {
                if (!cssStyleLoaded) {
                    throw new UnloadedException(DictData.class, "cssStyle");
                }
                return cssStyle;
            }

            @Override
            public String cssClass() {
                if (!cssClassLoaded) {
                    throw new UnloadedException(DictData.class, "cssClass");
                }
                return cssClass;
            }

            @Override
            public String corpCode() {
                if (!corpCodeLoaded) {
                    throw new UnloadedException(DictData.class, "corpCode");
                }
                return corpCode;
            }

            @Override
            public String corpName() {
                if (!corpNameLoaded) {
                    throw new UnloadedException(DictData.class, "corpName");
                }
                return corpName;
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
                    case 7: return remarks != null;
                    case 8: return parentLoaded;
                    case 9: return children != null;
                    case 10: return dictTypeLoaded;
                    case 11: return parentCodesLoaded;
                    case 12: return treeSortLoaded;
                    case 13: return treeSortsLoaded;
                    case 14: return treeLeafLoaded;
                    case 15: return treeLevelLoaded;
                    case 16: return treeNamesLoaded;
                    case 17: return dictLabelLoaded;
                    case 18: return dictValueLoaded;
                    case 19: return sysLoaded;
                    case 20: return descriptionLoaded;
                    case 21: return cssStyleLoaded;
                    case 22: return cssClassLoaded;
                    case 23: return corpCodeLoaded;
                    case 24: return corpNameLoaded;
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
                    case "remarks": return remarks != null;
                    case "parent": return parentLoaded;
                    case "children": return children != null;
                    case "dictType": return dictTypeLoaded;
                    case "parentCodes": return parentCodesLoaded;
                    case "treeSort": return treeSortLoaded;
                    case "treeSorts": return treeSortsLoaded;
                    case "treeLeaf": return treeLeafLoaded;
                    case "treeLevel": return treeLevelLoaded;
                    case "treeNames": return treeNamesLoaded;
                    case "dictLabel": return dictLabelLoaded;
                    case "dictValue": return dictValueLoaded;
                    case "sys": return sysLoaded;
                    case "description": return descriptionLoaded;
                    case "cssStyle": return cssStyleLoaded;
                    case "cssClass": return cssClassLoaded;
                    case "corpCode": return corpCodeLoaded;
                    case "corpName": return corpNameLoaded;
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
                if (remarks != null) {
                    hash = 31 * hash + remarks.hashCode();
                }
                if (parentLoaded && parent != null) {
                    hash = 31 * hash + parent.hashCode();
                }
                if (children != null) {
                    hash = 31 * hash + children.hashCode();
                }
                if (dictTypeLoaded && dictType != null) {
                    hash = 31 * hash + dictType.hashCode();
                }
                if (parentCodesLoaded && parentCodes != null) {
                    hash = 31 * hash + parentCodes.hashCode();
                }
                if (treeSortLoaded && treeSort != null) {
                    hash = 31 * hash + treeSort.hashCode();
                }
                if (treeSortsLoaded && treeSorts != null) {
                    hash = 31 * hash + treeSorts.hashCode();
                }
                if (treeLeafLoaded && treeLeaf != null) {
                    hash = 31 * hash + treeLeaf.hashCode();
                }
                if (treeLevelLoaded && treeLevel != null) {
                    hash = 31 * hash + treeLevel.hashCode();
                }
                if (treeNamesLoaded && treeNames != null) {
                    hash = 31 * hash + treeNames.hashCode();
                }
                if (dictLabelLoaded && dictLabel != null) {
                    hash = 31 * hash + dictLabel.hashCode();
                }
                if (dictValueLoaded && dictValue != null) {
                    hash = 31 * hash + dictValue.hashCode();
                }
                if (sysLoaded) {
                    hash = 31 * hash + Boolean.hashCode(sys);
                }
                if (descriptionLoaded && description != null) {
                    hash = 31 * hash + description.hashCode();
                }
                if (cssStyleLoaded && cssStyle != null) {
                    hash = 31 * hash + cssStyle.hashCode();
                }
                if (cssClassLoaded && cssClass != null) {
                    hash = 31 * hash + cssClass.hashCode();
                }
                if (corpCodeLoaded && corpCode != null) {
                    hash = 31 * hash + corpCode.hashCode();
                }
                if (corpNameLoaded && corpName != null) {
                    hash = 31 * hash + corpName.hashCode();
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
                if (remarks != null) {
                    hash = 31 * hash + System.identityHashCode(remarks);
                }
                if (parentLoaded) {
                    hash = 31 * hash + System.identityHashCode(parent);
                }
                if (children != null) {
                    hash = 31 * hash + System.identityHashCode(children);
                }
                if (dictTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(dictType);
                }
                if (parentCodesLoaded) {
                    hash = 31 * hash + System.identityHashCode(parentCodes);
                }
                if (treeSortLoaded) {
                    hash = 31 * hash + System.identityHashCode(treeSort);
                }
                if (treeSortsLoaded) {
                    hash = 31 * hash + System.identityHashCode(treeSorts);
                }
                if (treeLeafLoaded) {
                    hash = 31 * hash + System.identityHashCode(treeLeaf);
                }
                if (treeLevelLoaded) {
                    hash = 31 * hash + System.identityHashCode(treeLevel);
                }
                if (treeNamesLoaded) {
                    hash = 31 * hash + System.identityHashCode(treeNames);
                }
                if (dictLabelLoaded) {
                    hash = 31 * hash + System.identityHashCode(dictLabel);
                }
                if (dictValueLoaded) {
                    hash = 31 * hash + System.identityHashCode(dictValue);
                }
                if (sysLoaded) {
                    hash = 31 * hash + Boolean.hashCode(sys);
                }
                if (descriptionLoaded) {
                    hash = 31 * hash + System.identityHashCode(description);
                }
                if (cssStyleLoaded) {
                    hash = 31 * hash + System.identityHashCode(cssStyle);
                }
                if (cssClassLoaded) {
                    hash = 31 * hash + System.identityHashCode(cssClass);
                }
                if (corpCodeLoaded) {
                    hash = 31 * hash + System.identityHashCode(corpCode);
                }
                if (corpNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(corpName);
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
                boolean __remarksLoaded = remarks != null;
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
                boolean __dictTypeLoaded = dictTypeLoaded;
                if (__dictTypeLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__dictTypeLoaded && !Objects.equals(dictType, other.dictType())) {
                    return false;
                }
                boolean __parentCodesLoaded = parentCodesLoaded;
                if (__parentCodesLoaded != other.__isLoaded(11)) {
                    return false;
                }
                if (__parentCodesLoaded && !Objects.equals(parentCodes, other.parentCodes())) {
                    return false;
                }
                boolean __treeSortLoaded = treeSortLoaded;
                if (__treeSortLoaded != other.__isLoaded(12)) {
                    return false;
                }
                if (__treeSortLoaded && !Objects.equals(treeSort, other.treeSort())) {
                    return false;
                }
                boolean __treeSortsLoaded = treeSortsLoaded;
                if (__treeSortsLoaded != other.__isLoaded(13)) {
                    return false;
                }
                if (__treeSortsLoaded && !Objects.equals(treeSorts, other.treeSorts())) {
                    return false;
                }
                boolean __treeLeafLoaded = treeLeafLoaded;
                if (__treeLeafLoaded != other.__isLoaded(14)) {
                    return false;
                }
                if (__treeLeafLoaded && !Objects.equals(treeLeaf, other.treeLeaf())) {
                    return false;
                }
                boolean __treeLevelLoaded = treeLevelLoaded;
                if (__treeLevelLoaded != other.__isLoaded(15)) {
                    return false;
                }
                if (__treeLevelLoaded && !Objects.equals(treeLevel, other.treeLevel())) {
                    return false;
                }
                boolean __treeNamesLoaded = treeNamesLoaded;
                if (__treeNamesLoaded != other.__isLoaded(16)) {
                    return false;
                }
                if (__treeNamesLoaded && !Objects.equals(treeNames, other.treeNames())) {
                    return false;
                }
                boolean __dictLabelLoaded = dictLabelLoaded;
                if (__dictLabelLoaded != other.__isLoaded(17)) {
                    return false;
                }
                if (__dictLabelLoaded && !Objects.equals(dictLabel, other.dictLabel())) {
                    return false;
                }
                boolean __dictValueLoaded = dictValueLoaded;
                if (__dictValueLoaded != other.__isLoaded(18)) {
                    return false;
                }
                if (__dictValueLoaded && !Objects.equals(dictValue, other.dictValue())) {
                    return false;
                }
                boolean __sysLoaded = sysLoaded;
                if (__sysLoaded != other.__isLoaded(19)) {
                    return false;
                }
                if (__sysLoaded && sys != other.isSys()) {
                    return false;
                }
                boolean __descriptionLoaded = descriptionLoaded;
                if (__descriptionLoaded != other.__isLoaded(20)) {
                    return false;
                }
                if (__descriptionLoaded && !Objects.equals(description, other.description())) {
                    return false;
                }
                boolean __cssStyleLoaded = cssStyleLoaded;
                if (__cssStyleLoaded != other.__isLoaded(21)) {
                    return false;
                }
                if (__cssStyleLoaded && !Objects.equals(cssStyle, other.cssStyle())) {
                    return false;
                }
                boolean __cssClassLoaded = cssClassLoaded;
                if (__cssClassLoaded != other.__isLoaded(22)) {
                    return false;
                }
                if (__cssClassLoaded && !Objects.equals(cssClass, other.cssClass())) {
                    return false;
                }
                boolean __corpCodeLoaded = corpCodeLoaded;
                if (__corpCodeLoaded != other.__isLoaded(23)) {
                    return false;
                }
                if (__corpCodeLoaded && !Objects.equals(corpCode, other.corpCode())) {
                    return false;
                }
                boolean __corpNameLoaded = corpNameLoaded;
                if (__corpNameLoaded != other.__isLoaded(24)) {
                    return false;
                }
                if (__corpNameLoaded && !Objects.equals(corpName, other.corpName())) {
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
                boolean __remarksLoaded = remarks != null;
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
                boolean __dictTypeLoaded = dictTypeLoaded;
                if (__dictTypeLoaded != other.__isLoaded(10)) {
                    return false;
                }
                if (__dictTypeLoaded && dictType != other.dictType()) {
                    return false;
                }
                boolean __parentCodesLoaded = parentCodesLoaded;
                if (__parentCodesLoaded != other.__isLoaded(11)) {
                    return false;
                }
                if (__parentCodesLoaded && parentCodes != other.parentCodes()) {
                    return false;
                }
                boolean __treeSortLoaded = treeSortLoaded;
                if (__treeSortLoaded != other.__isLoaded(12)) {
                    return false;
                }
                if (__treeSortLoaded && treeSort != other.treeSort()) {
                    return false;
                }
                boolean __treeSortsLoaded = treeSortsLoaded;
                if (__treeSortsLoaded != other.__isLoaded(13)) {
                    return false;
                }
                if (__treeSortsLoaded && treeSorts != other.treeSorts()) {
                    return false;
                }
                boolean __treeLeafLoaded = treeLeafLoaded;
                if (__treeLeafLoaded != other.__isLoaded(14)) {
                    return false;
                }
                if (__treeLeafLoaded && treeLeaf != other.treeLeaf()) {
                    return false;
                }
                boolean __treeLevelLoaded = treeLevelLoaded;
                if (__treeLevelLoaded != other.__isLoaded(15)) {
                    return false;
                }
                if (__treeLevelLoaded && treeLevel != other.treeLevel()) {
                    return false;
                }
                boolean __treeNamesLoaded = treeNamesLoaded;
                if (__treeNamesLoaded != other.__isLoaded(16)) {
                    return false;
                }
                if (__treeNamesLoaded && treeNames != other.treeNames()) {
                    return false;
                }
                boolean __dictLabelLoaded = dictLabelLoaded;
                if (__dictLabelLoaded != other.__isLoaded(17)) {
                    return false;
                }
                if (__dictLabelLoaded && dictLabel != other.dictLabel()) {
                    return false;
                }
                boolean __dictValueLoaded = dictValueLoaded;
                if (__dictValueLoaded != other.__isLoaded(18)) {
                    return false;
                }
                if (__dictValueLoaded && dictValue != other.dictValue()) {
                    return false;
                }
                boolean __sysLoaded = sysLoaded;
                if (__sysLoaded != other.__isLoaded(19)) {
                    return false;
                }
                if (__sysLoaded && sys != other.isSys()) {
                    return false;
                }
                boolean __descriptionLoaded = descriptionLoaded;
                if (__descriptionLoaded != other.__isLoaded(20)) {
                    return false;
                }
                if (__descriptionLoaded && description != other.description()) {
                    return false;
                }
                boolean __cssStyleLoaded = cssStyleLoaded;
                if (__cssStyleLoaded != other.__isLoaded(21)) {
                    return false;
                }
                if (__cssStyleLoaded && cssStyle != other.cssStyle()) {
                    return false;
                }
                boolean __cssClassLoaded = cssClassLoaded;
                if (__cssClassLoaded != other.__isLoaded(22)) {
                    return false;
                }
                if (__cssClassLoaded && cssClass != other.cssClass()) {
                    return false;
                }
                boolean __corpCodeLoaded = corpCodeLoaded;
                if (__corpCodeLoaded != other.__isLoaded(23)) {
                    return false;
                }
                if (__corpCodeLoaded && corpCode != other.corpCode()) {
                    return false;
                }
                boolean __corpNameLoaded = corpNameLoaded;
                if (__corpNameLoaded != other.__isLoaded(24)) {
                    return false;
                }
                if (__corpNameLoaded && corpName != other.corpName()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, DictDataDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, DictData base) {
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
            public DictDataDraft setId(String id) {
                if (id == null) {
                    throw new IllegalArgumentException(
                        "'id' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.id = id;
                return this;
            }

            @Override
            public String status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public DictDataDraft setStatus(String status) {
                if (status == null) {
                    throw new IllegalArgumentException(
                        "'status' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.status = status;
                return this;
            }

            @Override
            public String createBy() {
                return (__modified!= null ? __modified : __base).createBy();
            }

            @Override
            public DictDataDraft setCreateBy(String createBy) {
                if (createBy == null) {
                    throw new IllegalArgumentException(
                        "'createBy' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.createBy = createBy;
                return this;
            }

            @Override
            public LocalDateTime createDate() {
                return (__modified!= null ? __modified : __base).createDate();
            }

            @Override
            public DictDataDraft setCreateDate(LocalDateTime createDate) {
                if (createDate == null) {
                    throw new IllegalArgumentException(
                        "'createDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.createDate = createDate;
                return this;
            }

            @Override
            public String updateBy() {
                return (__modified!= null ? __modified : __base).updateBy();
            }

            @Override
            public DictDataDraft setUpdateBy(String updateBy) {
                if (updateBy == null) {
                    throw new IllegalArgumentException(
                        "'updateBy' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.updateBy = updateBy;
                return this;
            }

            @Override
            public LocalDateTime updateDate() {
                return (__modified!= null ? __modified : __base).updateDate();
            }

            @Override
            public DictDataDraft setUpdateDate(LocalDateTime updateDate) {
                if (updateDate == null) {
                    throw new IllegalArgumentException(
                        "'updateDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.updateDate = updateDate;
                return this;
            }

            @Override
            public String remarks() {
                return (__modified!= null ? __modified : __base).remarks();
            }

            @Override
            public DictDataDraft setRemarks(String remarks) {
                if (remarks == null) {
                    throw new IllegalArgumentException(
                        "'remarks' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.remarks = remarks;
                return this;
            }

            @Override
            public DictDataDraft parent() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public DictDataDraft parent(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(8) || parent() == null)) {
                    setParent(DictDataDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public DictDataDraft setParent(DictData parent) {
                Impl modified = __modified();
                modified.parent = parent;
                modified.parentLoaded = true;
                return this;
            }

            @Override
            public DictDataDraft setParent(DraftConsumer<DictDataDraft> block) {
                setParent(null, block);
                return this;
            }

            @Override
            public DictDataDraft setParent(DictData base, DraftConsumer<DictDataDraft> block) {
                setParent(DictDataDraft.$.produce(base, block));
                return this;
            }

            @Override
            public List<DictData> children() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).children(), DictData.class, true);
            }

            @Override
            public List<DictDataDraft> children(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(9) || children() == null)) {
                    setChildren(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).children(), DictData.class, true);
            }

            @Override
            public DictDataDraft setChildren(List<DictData> children) {
                if (children == null) {
                    throw new IllegalArgumentException(
                        "'children' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.children = NonSharedList.of(modified.children, children);
                return this;
            }

            @Override
            public DictDataDraft addIntoChildren(DraftConsumer<DictDataDraft> block) {
                addIntoChildren(null, block);
                return this;
            }

            @Override
            public DictDataDraft addIntoChildren(DictData base,
                    DraftConsumer<DictDataDraft> block) {
                children(true).add((DictDataDraft)DictDataDraft.$.produce(base, block));
                return this;
            }

            @Override
            public DictTypeDraft dictType() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).dictType());
            }

            @Override
            public DictTypeDraft dictType(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(10) || dictType() == null)) {
                    setDictType(DictTypeDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).dictType());
            }

            @Override
            public DictDataDraft setDictType(DictType dictType) {
                Impl modified = __modified();
                modified.dictType = dictType;
                modified.dictTypeLoaded = true;
                return this;
            }

            @Override
            public DictDataDraft setDictType(DraftConsumer<DictTypeDraft> block) {
                setDictType(null, block);
                return this;
            }

            @Override
            public DictDataDraft setDictType(DictType base, DraftConsumer<DictTypeDraft> block) {
                setDictType(DictTypeDraft.$.produce(base, block));
                return this;
            }

            @Override
            public String parentCodes() {
                return (__modified!= null ? __modified : __base).parentCodes();
            }

            @Override
            public DictDataDraft setParentCodes(String parentCodes) {
                Impl modified = __modified();
                modified.parentCodes = parentCodes;
                modified.parentCodesLoaded = true;
                return this;
            }

            @Override
            public BigDecimal treeSort() {
                return (__modified!= null ? __modified : __base).treeSort();
            }

            @Override
            public DictDataDraft setTreeSort(BigDecimal treeSort) {
                Impl modified = __modified();
                modified.treeSort = treeSort;
                modified.treeSortLoaded = true;
                return this;
            }

            @Override
            public String treeSorts() {
                return (__modified!= null ? __modified : __base).treeSorts();
            }

            @Override
            public DictDataDraft setTreeSorts(String treeSorts) {
                Impl modified = __modified();
                modified.treeSorts = treeSorts;
                modified.treeSortsLoaded = true;
                return this;
            }

            @Override
            public String treeLeaf() {
                return (__modified!= null ? __modified : __base).treeLeaf();
            }

            @Override
            public DictDataDraft setTreeLeaf(String treeLeaf) {
                Impl modified = __modified();
                modified.treeLeaf = treeLeaf;
                modified.treeLeafLoaded = true;
                return this;
            }

            @Override
            public BigDecimal treeLevel() {
                return (__modified!= null ? __modified : __base).treeLevel();
            }

            @Override
            public DictDataDraft setTreeLevel(BigDecimal treeLevel) {
                Impl modified = __modified();
                modified.treeLevel = treeLevel;
                modified.treeLevelLoaded = true;
                return this;
            }

            @Override
            public String treeNames() {
                return (__modified!= null ? __modified : __base).treeNames();
            }

            @Override
            public DictDataDraft setTreeNames(String treeNames) {
                Impl modified = __modified();
                modified.treeNames = treeNames;
                modified.treeNamesLoaded = true;
                return this;
            }

            @Override
            public String dictLabel() {
                return (__modified!= null ? __modified : __base).dictLabel();
            }

            @Override
            public DictDataDraft setDictLabel(String dictLabel) {
                Impl modified = __modified();
                modified.dictLabel = dictLabel;
                modified.dictLabelLoaded = true;
                return this;
            }

            @Override
            public String dictValue() {
                return (__modified!= null ? __modified : __base).dictValue();
            }

            @Override
            public DictDataDraft setDictValue(String dictValue) {
                Impl modified = __modified();
                modified.dictValue = dictValue;
                modified.dictValueLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public boolean isSys() {
                return (__modified!= null ? __modified : __base).isSys();
            }

            @Override
            public DictDataDraft setSys(boolean sys) {
                Impl modified = __modified();
                modified.sys = sys;
                modified.sysLoaded = true;
                return this;
            }

            @Override
            public String description() {
                return (__modified!= null ? __modified : __base).description();
            }

            @Override
            public DictDataDraft setDescription(String description) {
                Impl modified = __modified();
                modified.description = description;
                modified.descriptionLoaded = true;
                return this;
            }

            @Override
            public String cssStyle() {
                return (__modified!= null ? __modified : __base).cssStyle();
            }

            @Override
            public DictDataDraft setCssStyle(String cssStyle) {
                Impl modified = __modified();
                modified.cssStyle = cssStyle;
                modified.cssStyleLoaded = true;
                return this;
            }

            @Override
            public String cssClass() {
                return (__modified!= null ? __modified : __base).cssClass();
            }

            @Override
            public DictDataDraft setCssClass(String cssClass) {
                Impl modified = __modified();
                modified.cssClass = cssClass;
                modified.cssClassLoaded = true;
                return this;
            }

            @Override
            public String corpCode() {
                return (__modified!= null ? __modified : __base).corpCode();
            }

            @Override
            public DictDataDraft setCorpCode(String corpCode) {
                Impl modified = __modified();
                modified.corpCode = corpCode;
                modified.corpCodeLoaded = true;
                return this;
            }

            @Override
            public String corpName() {
                return (__modified!= null ? __modified : __base).corpName();
            }

            @Override
            public DictDataDraft setCorpName(String corpName) {
                Impl modified = __modified();
                modified.corpName = corpName;
                modified.corpNameLoaded = true;
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
                    case 8: setParent((DictData)value);break;
                    case 9: setChildren((List<DictData>)value);break;
                    case 10: setDictType((DictType)value);break;
                    case 11: setParentCodes((String)value);break;
                    case 12: setTreeSort((BigDecimal)value);break;
                    case 13: setTreeSorts((String)value);break;
                    case 14: setTreeLeaf((String)value);break;
                    case 15: setTreeLevel((BigDecimal)value);break;
                    case 16: setTreeNames((String)value);break;
                    case 17: setDictLabel((String)value);break;
                    case 18: setDictValue((String)value);break;
                    case 19: 
                            if (value == null) throw new IllegalArgumentException("'sys' cannot be null");
                            setSys((Boolean)value);
                            break;
                    case 20: setDescription((String)value);break;
                    case 21: setCssStyle((String)value);break;
                    case 22: setCssClass((String)value);break;
                    case 23: setCorpCode((String)value);break;
                    case 24: setCorpName((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
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
                    case "parent": setParent((DictData)value);break;
                    case "children": setChildren((List<DictData>)value);break;
                    case "dictType": setDictType((DictType)value);break;
                    case "parentCodes": setParentCodes((String)value);break;
                    case "treeSort": setTreeSort((BigDecimal)value);break;
                    case "treeSorts": setTreeSorts((String)value);break;
                    case "treeLeaf": setTreeLeaf((String)value);break;
                    case "treeLevel": setTreeLevel((BigDecimal)value);break;
                    case "treeNames": setTreeNames((String)value);break;
                    case "dictLabel": setDictLabel((String)value);break;
                    case "dictValue": setDictValue((String)value);break;
                    case "sys": 
                            if (value == null) throw new IllegalArgumentException("'sys' cannot be null");
                            setSys((Boolean)value);
                            break;
                    case "description": setDescription((String)value);break;
                    case "cssStyle": setCssStyle((String)value);break;
                    case "cssClass": setCssClass((String)value);break;
                    case "corpCode": setCorpCode((String)value);break;
                    case "corpName": setCorpName((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
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
                    case 7: __modified().remarks = null;break;
                    case 8: __modified().parentLoaded = false;break;
                    case 9: __modified().children = null;break;
                    case 10: __modified().dictTypeLoaded = false;break;
                    case 11: __modified().parentCodesLoaded = false;break;
                    case 12: __modified().treeSortLoaded = false;break;
                    case 13: __modified().treeSortsLoaded = false;break;
                    case 14: __modified().treeLeafLoaded = false;break;
                    case 15: __modified().treeLevelLoaded = false;break;
                    case 16: __modified().treeNamesLoaded = false;break;
                    case 17: __modified().dictLabelLoaded = false;break;
                    case 18: __modified().dictValueLoaded = false;break;
                    case 19: __modified().sysLoaded = false;break;
                    case 20: __modified().descriptionLoaded = false;break;
                    case 21: __modified().cssStyleLoaded = false;break;
                    case 22: __modified().cssClassLoaded = false;break;
                    case 23: __modified().corpCodeLoaded = false;break;
                    case 24: __modified().corpNameLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
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
                    case "remarks": __modified().remarks = null;break;
                    case "parent": __modified().parentLoaded = false;break;
                    case "children": __modified().children = null;break;
                    case "dictType": __modified().dictTypeLoaded = false;break;
                    case "parentCodes": __modified().parentCodesLoaded = false;break;
                    case "treeSort": __modified().treeSortLoaded = false;break;
                    case "treeSorts": __modified().treeSortsLoaded = false;break;
                    case "treeLeaf": __modified().treeLeafLoaded = false;break;
                    case "treeLevel": __modified().treeLevelLoaded = false;break;
                    case "treeNames": __modified().treeNamesLoaded = false;break;
                    case "dictLabel": __modified().dictLabelLoaded = false;break;
                    case "dictValue": __modified().dictValueLoaded = false;break;
                    case "sys": __modified().sysLoaded = false;break;
                    case "description": __modified().descriptionLoaded = false;break;
                    case "cssStyle": __modified().cssStyleLoaded = false;break;
                    case "cssClass": __modified().cssClassLoaded = false;break;
                    case "corpCode": __modified().corpCodeLoaded = false;break;
                    case "corpName": __modified().corpNameLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
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
                    Impl modified = __modified;
                    if (modified == null) {
                        if (base.__isLoaded(8)) {
                            DictData oldValue = base.parent();
                            DictData newValue = __ctx.resolveObject(oldValue);
                            if (!ImmutableSpi.equals(oldValue, newValue, true)) {
                                setParent(newValue);
                            }
                        }
                        if (base.__isLoaded(9)) {
                            List<DictData> oldValue = base.children();
                            List<DictData> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setChildren(newValue);
                            }
                        }
                        if (base.__isLoaded(10)) {
                            DictType oldValue = base.dictType();
                            DictType newValue = __ctx.resolveObject(oldValue);
                            if (!ImmutableSpi.equals(oldValue, newValue, true)) {
                                setDictType(newValue);
                            }
                        }
                        modified = __modified;
                    }
                    else {
                        modified.parent = __ctx.resolveObject(modified.parent);
                        modified.children = NonSharedList.of(modified.children, __ctx.resolveList(modified.children));
                        modified.dictType = __ctx.resolveObject(modified.dictType);
                    }
                    if (modified == null || ImmutableSpi.equals(base, modified, true)) {
                        return base;
                    }
                    return modified;
                }
                finally {
                    __resolving = false;
                }
            }

            private Impl __modified() {
                Impl modified = __modified;
                if (modified == null) {
                    modified = __base.clone();
                    __modified = modified;
                }
                return modified;
            }
        }
    }
}
