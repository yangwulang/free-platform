package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.beans.ConstructorProperties;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.StaticMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;
import top.yangwulang.platform.entity.sys.DictDataFetcher;

public class DictDataInput implements Input<DictData> {
    public static final StaticMetadata<DictData, DictDataInput> METADATA = 
        new StaticMetadata<DictData, DictDataInput>(
            DictDataFetcher.$
                .parentCodes()
                .treeSort()
                .treeSorts()
                .treeLeaf()
                .treeLevel()
                .treeNames()
                .dictLabel()
                .dictValue()
                .sys()
                .description()
                .cssStyle()
                .cssClass()
                .corpCode()
                .corpName(),
            DictDataInput::new
    );

    @Nullable
    @Null
    private final String parentCodes;

    @Nullable
    @Null
    private final BigDecimal treeSort;

    @Nullable
    @Null
    private final String treeSorts;

    @Nullable
    @Null
    private final String treeLeaf;

    @Nullable
    @Null
    private final BigDecimal treeLevel;

    @Nullable
    @Null
    private final String treeNames;

    @Nullable
    @Null
    private final String dictLabel;

    @Nullable
    @Null
    private final String dictValue;

    @Nullable
    @Null
    private final Boolean sys;

    @Nullable
    @Null
    private final String description;

    @Nullable
    @Null
    private final String cssStyle;

    @Nullable
    @Null
    private final String cssClass;

    @Nullable
    @Null
    private final String corpCode;

    @Nullable
    @Null
    private final String corpName;

    @Nullable
    @Null
    private final String id;

    @JsonCreator
    @ConstructorProperties({"parentCodes", "treeSort", "treeSorts", "treeLeaf", "treeLevel", "treeNames", "dictLabel", "dictValue", "sys", "description", "cssStyle", "cssClass", "corpCode", "corpName", "id"})
    public DictDataInput(@Nullable @Null @JsonProperty("parentCodes") String parentCodes,
            @Nullable @Null @JsonProperty("treeSort") BigDecimal treeSort,
            @Nullable @Null @JsonProperty("treeSorts") String treeSorts,
            @Nullable @Null @JsonProperty("treeLeaf") String treeLeaf,
            @Nullable @Null @JsonProperty("treeLevel") BigDecimal treeLevel,
            @Nullable @Null @JsonProperty("treeNames") String treeNames,
            @Nullable @Null @JsonProperty("dictLabel") String dictLabel,
            @Nullable @Null @JsonProperty("dictValue") String dictValue,
            @Nullable @Null @JsonProperty("sys") Boolean sys,
            @Nullable @Null @JsonProperty("description") String description,
            @Nullable @Null @JsonProperty("cssStyle") String cssStyle,
            @Nullable @Null @JsonProperty("cssClass") String cssClass,
            @Nullable @Null @JsonProperty("corpCode") String corpCode,
            @Nullable @Null @JsonProperty("corpName") String corpName,
            @Nullable @Null @JsonProperty("id") String id) {
        this.parentCodes = parentCodes;
        this.treeSort = treeSort;
        this.treeSorts = treeSorts;
        this.treeLeaf = treeLeaf;
        this.treeLevel = treeLevel;
        this.treeNames = treeNames;
        this.dictLabel = dictLabel;
        this.dictValue = dictValue;
        this.sys = sys;
        this.description = description;
        this.cssStyle = cssStyle;
        this.cssClass = cssClass;
        this.corpCode = corpCode;
        this.corpName = corpName;
        this.id = id;
    }

    DictDataInput(@NotNull DictData base) {
        // This constructor is not public so that the `@Argument` of spring-graphql can work, please use `of`
        ImmutableSpi spi = (ImmutableSpi)base;
        this.parentCodes = spi.__isLoaded(11) ? base.parentCodes() : null;
        this.treeSort = spi.__isLoaded(12) ? base.treeSort() : null;
        this.treeSorts = spi.__isLoaded(13) ? base.treeSorts() : null;
        this.treeLeaf = spi.__isLoaded(14) ? base.treeLeaf() : null;
        this.treeLevel = spi.__isLoaded(15) ? base.treeLevel() : null;
        this.treeNames = spi.__isLoaded(16) ? base.treeNames() : null;
        this.dictLabel = spi.__isLoaded(17) ? base.dictLabel() : null;
        this.dictValue = spi.__isLoaded(18) ? base.dictValue() : null;
        this.sys = spi.__isLoaded(19) ? base.isSys() : false;
        this.description = spi.__isLoaded(20) ? base.description() : null;
        this.cssStyle = spi.__isLoaded(21) ? base.cssStyle() : null;
        this.cssClass = spi.__isLoaded(22) ? base.cssClass() : null;
        this.corpCode = spi.__isLoaded(23) ? base.corpCode() : null;
        this.corpName = spi.__isLoaded(24) ? base.corpName() : null;
        this.id = spi.__isLoaded(1) ? base.id() : null;
    }

    public static DictDataInput of(@NotNull DictData base) {
        return new DictDataInput(base);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public static Builder newBuilder(@Nullable DictDataInput base) {
        return new Builder(base);
    }

    @Nullable
    @Null
    public String getParentCodes() {
        return parentCodes;
    }

    @Nullable
    @Null
    public BigDecimal getTreeSort() {
        return treeSort;
    }

    @Nullable
    @Null
    public String getTreeSorts() {
        return treeSorts;
    }

    @Nullable
    @Null
    public String getTreeLeaf() {
        return treeLeaf;
    }

    @Nullable
    @Null
    public BigDecimal getTreeLevel() {
        return treeLevel;
    }

    @Nullable
    @Null
    public String getTreeNames() {
        return treeNames;
    }

    @Nullable
    @Null
    public String getDictLabel() {
        return dictLabel;
    }

    @Nullable
    @Null
    public String getDictValue() {
        return dictValue;
    }

    @Nullable
    @Null
    public Boolean isSys() {
        return sys;
    }

    @Nullable
    @Null
    public String getDescription() {
        return description;
    }

    @Nullable
    @Null
    public String getCssStyle() {
        return cssStyle;
    }

    @Nullable
    @Null
    public String getCssClass() {
        return cssClass;
    }

    @Nullable
    @Null
    public String getCorpCode() {
        return corpCode;
    }

    @Nullable
    @Null
    public String getCorpName() {
        return corpName;
    }

    @Nullable
    @Null
    public String getId() {
        return id;
    }

    @Override
    public DictData toEntity() {
        return toEntity(null);
    }

    @Override
    public DictData toEntity(@Nullable DictData base) {
        return DictDataDraft.$.produce(base, draft -> {
            draft.setParentCodes(parentCodes);
            draft.setTreeSort(treeSort);
            draft.setTreeSorts(treeSorts);
            draft.setTreeLeaf(treeLeaf);
            draft.setTreeLevel(treeLevel);
            draft.setTreeNames(treeNames);
            draft.setDictLabel(dictLabel);
            draft.setDictValue(dictValue);
            draft.setSys(sys);
            draft.setDescription(description);
            draft.setCssStyle(cssStyle);
            draft.setCssClass(cssClass);
            draft.setCorpCode(corpCode);
            draft.setCorpName(corpName);
            if (id != null) {
                draft.setId(id);
            }
        });
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("DictDataInput{")
            .append("parentCodes").append('=').append(parentCodes)
            .append(", ")
            .append("treeSort").append('=').append(treeSort)
            .append(", ")
            .append("treeSorts").append('=').append(treeSorts)
            .append(", ")
            .append("treeLeaf").append('=').append(treeLeaf)
            .append(", ")
            .append("treeLevel").append('=').append(treeLevel)
            .append(", ")
            .append("treeNames").append('=').append(treeNames)
            .append(", ")
            .append("dictLabel").append('=').append(dictLabel)
            .append(", ")
            .append("dictValue").append('=').append(dictValue)
            .append(", ")
            .append("sys").append('=').append(sys)
            .append(", ")
            .append("description").append('=').append(description)
            .append(", ")
            .append("cssStyle").append('=').append(cssStyle)
            .append(", ")
            .append("cssClass").append('=').append(cssClass)
            .append(", ")
            .append("corpCode").append('=').append(corpCode)
            .append(", ")
            .append("corpName").append('=').append(corpName)
            .append(", ")
            .append("id").append('=').append(id)
            .append('}')
            .toString();
    }

    public static class Builder {
        private String parentCodes;

        private BigDecimal treeSort;

        private String treeSorts;

        private String treeLeaf;

        private BigDecimal treeLevel;

        private String treeNames;

        private String dictLabel;

        private String dictValue;

        private Boolean sys;

        private String description;

        private String cssStyle;

        private String cssClass;

        private String corpCode;

        private String corpName;

        private String id;

        Builder(DictDataInput base) {
            if (base != null) {
                this.parentCodes = base.getParentCodes();
                this.treeSort = base.getTreeSort();
                this.treeSorts = base.getTreeSorts();
                this.treeLeaf = base.getTreeLeaf();
                this.treeLevel = base.getTreeLevel();
                this.treeNames = base.getTreeNames();
                this.dictLabel = base.getDictLabel();
                this.dictValue = base.getDictValue();
                this.sys = base.isSys();
                this.description = base.getDescription();
                this.cssStyle = base.getCssStyle();
                this.cssClass = base.getCssClass();
                this.corpCode = base.getCorpCode();
                this.corpName = base.getCorpName();
                this.id = base.getId();
            }
        }

        @NotNull
        public Builder setParentCodes(@Nullable String parentCodes) {
            this.parentCodes = parentCodes;
            return this;
        }

        @NotNull
        public Builder setTreeSort(@Nullable BigDecimal treeSort) {
            this.treeSort = treeSort;
            return this;
        }

        @NotNull
        public Builder setTreeSorts(@Nullable String treeSorts) {
            this.treeSorts = treeSorts;
            return this;
        }

        @NotNull
        public Builder setTreeLeaf(@Nullable String treeLeaf) {
            this.treeLeaf = treeLeaf;
            return this;
        }

        @NotNull
        public Builder setTreeLevel(@Nullable BigDecimal treeLevel) {
            this.treeLevel = treeLevel;
            return this;
        }

        @NotNull
        public Builder setTreeNames(@Nullable String treeNames) {
            this.treeNames = treeNames;
            return this;
        }

        @NotNull
        public Builder setDictLabel(@Nullable String dictLabel) {
            this.dictLabel = dictLabel;
            return this;
        }

        @NotNull
        public Builder setDictValue(@Nullable String dictValue) {
            this.dictValue = dictValue;
            return this;
        }

        @NotNull
        public Builder setSys(@Nullable Boolean sys) {
            this.sys = sys;
            return this;
        }

        @NotNull
        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        @NotNull
        public Builder setCssStyle(@Nullable String cssStyle) {
            this.cssStyle = cssStyle;
            return this;
        }

        @NotNull
        public Builder setCssClass(@Nullable String cssClass) {
            this.cssClass = cssClass;
            return this;
        }

        @NotNull
        public Builder setCorpCode(@Nullable String corpCode) {
            this.corpCode = corpCode;
            return this;
        }

        @NotNull
        public Builder setCorpName(@Nullable String corpName) {
            this.corpName = corpName;
            return this;
        }

        @NotNull
        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        @NotNull
        public DictDataInput build() {
            return new DictDataInput(
                parentCodes,
                treeSort,
                treeSorts,
                treeLeaf,
                treeLevel,
                treeNames,
                dictLabel,
                dictValue,
                sys,
                description,
                cssStyle,
                cssClass,
                corpCode,
                corpName,
                id
            );
        }
    }
}
