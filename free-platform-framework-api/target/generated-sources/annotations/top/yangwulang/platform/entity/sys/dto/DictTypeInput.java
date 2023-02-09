package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.beans.ConstructorProperties;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.StaticMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeDraft;
import top.yangwulang.platform.entity.sys.DictTypeFetcher;

public class DictTypeInput implements Input<DictType> {
    public static final StaticMetadata<DictType, DictTypeInput> METADATA = 
        new StaticMetadata<DictType, DictTypeInput>(
            DictTypeFetcher.$
                .dictName()
                .dictType()
                .sys(),
            DictTypeInput::new
    );

    @Nullable
    @Null
    @Schema(
            description = "字典名称"
    )
    private final String dictName;

    @Nullable
    @Null
    @Schema(
            description = "字典类型标签"
    )
    private final String dictType;

    @Nullable
    @Null
    @Schema(
            description = "是否系统自带"
    )
    private final Boolean sys;

    @Nullable
    @Null
    private final String id;

    @JsonCreator
    @ConstructorProperties({"dictName", "dictType", "sys", "id"})
    public DictTypeInput(@Nullable @Null @JsonProperty("dictName") String dictName,
            @Nullable @Null @JsonProperty("dictType") String dictType,
            @Nullable @Null @JsonProperty("sys") Boolean sys,
            @Nullable @Null @JsonProperty("id") String id) {
        this.dictName = dictName;
        this.dictType = dictType;
        this.sys = sys;
        this.id = id;
    }

    DictTypeInput(@NotNull DictType base) {
        // This constructor is not public so that the `@Argument` of spring-graphql can work, please use `of`
        ImmutableSpi spi = (ImmutableSpi)base;
        this.dictName = spi.__isLoaded(8) ? base.dictName() : null;
        this.dictType = spi.__isLoaded(9) ? base.dictType() : null;
        this.sys = spi.__isLoaded(10) ? base.isSys() : false;
        this.id = spi.__isLoaded(1) ? base.id() : null;
    }

    public static DictTypeInput of(@NotNull DictType base) {
        return new DictTypeInput(base);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public static Builder newBuilder(@Nullable DictTypeInput base) {
        return new Builder(base);
    }

    @Nullable
    @Null
    public String getDictName() {
        return dictName;
    }

    @Nullable
    @Null
    public String getDictType() {
        return dictType;
    }

    @Nullable
    @Null
    public Boolean isSys() {
        return sys;
    }

    @Nullable
    @Null
    public String getId() {
        return id;
    }

    @Override
    public DictType toEntity() {
        return toEntity(null);
    }

    @Override
    public DictType toEntity(@Nullable DictType base) {
        return DictTypeDraft.$.produce(base, draft -> {
            draft.setDictName(dictName);
            draft.setDictType(dictType);
            draft.setSys(sys);
            if (id != null) {
                draft.setId(id);
            }
        });
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("DictTypeInput{")
            .append("dictName").append('=').append(dictName)
            .append(", ")
            .append("dictType").append('=').append(dictType)
            .append(", ")
            .append("sys").append('=').append(sys)
            .append(", ")
            .append("id").append('=').append(id)
            .append('}')
            .toString();
    }

    public static class Builder {
        private String dictName;

        private String dictType;

        private Boolean sys;

        private String id;

        Builder(DictTypeInput base) {
            if (base != null) {
                this.dictName = base.getDictName();
                this.dictType = base.getDictType();
                this.sys = base.isSys();
                this.id = base.getId();
            }
        }

        @NotNull
        public Builder setDictName(@Nullable String dictName) {
            this.dictName = dictName;
            return this;
        }

        @NotNull
        public Builder setDictType(@Nullable String dictType) {
            this.dictType = dictType;
            return this;
        }

        @NotNull
        public Builder setSys(@Nullable Boolean sys) {
            this.sys = sys;
            return this;
        }

        @NotNull
        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        @NotNull
        public DictTypeInput build() {
            return new DictTypeInput(
                dictName,
                dictType,
                sys,
                id
            );
        }
    }
}
