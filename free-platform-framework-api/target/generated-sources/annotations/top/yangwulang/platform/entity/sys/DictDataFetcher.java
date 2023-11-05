package top.yangwulang.platform.entity.sys;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.RecursiveFieldConfig;
import org.babyfish.jimmer.sql.fetcher.RecursiveListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = DictData.class
)
public class DictDataFetcher extends AbstractTypedFetcher<DictData, DictDataFetcher> {
    public static final DictDataFetcher $ = new DictDataFetcher(null);

    private DictDataFetcher(FetcherImpl<DictData> base) {
        super(DictData.class, base);
    }

    private DictDataFetcher(DictDataFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private DictDataFetcher(DictDataFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static DictDataFetcher $from(Fetcher<DictData> base) {
        return base instanceof DictDataFetcher ? 
        	(DictDataFetcher)base : 
        	new DictDataFetcher((FetcherImpl<DictData>)base);
    }

    @NewChain
    public DictDataFetcher status() {
        return add("status");
    }

    @NewChain
    public DictDataFetcher status(boolean enabled) {
        return enabled ? add("status") : remove("status");
    }

    @NewChain
    public DictDataFetcher createBy() {
        return add("createBy");
    }

    @NewChain
    public DictDataFetcher createBy(boolean enabled) {
        return enabled ? add("createBy") : remove("createBy");
    }

    @NewChain
    public DictDataFetcher createDate() {
        return add("createDate");
    }

    @NewChain
    public DictDataFetcher createDate(boolean enabled) {
        return enabled ? add("createDate") : remove("createDate");
    }

    @NewChain
    public DictDataFetcher updateBy() {
        return add("updateBy");
    }

    @NewChain
    public DictDataFetcher updateBy(boolean enabled) {
        return enabled ? add("updateBy") : remove("updateBy");
    }

    @NewChain
    public DictDataFetcher updateDate() {
        return add("updateDate");
    }

    @NewChain
    public DictDataFetcher updateDate(boolean enabled) {
        return enabled ? add("updateDate") : remove("updateDate");
    }

    @NewChain
    public DictDataFetcher remarks() {
        return add("remarks");
    }

    @NewChain
    public DictDataFetcher remarks(boolean enabled) {
        return enabled ? add("remarks") : remove("remarks");
    }

    @NewChain
    public DictDataFetcher parent() {
        return add("parent");
    }

    @NewChain
    public DictDataFetcher parent(boolean enabled) {
        return enabled ? add("parent") : remove("parent");
    }

    @NewChain
    public DictDataFetcher parent(Fetcher<DictData> childFetcher) {
        return add("parent", childFetcher);
    }

    @NewChain
    public DictDataFetcher parent(Fetcher<DictData> childFetcher,
            Consumer<RecursiveFieldConfig<DictData, DictDataTable>> fieldConfig) {
        return add("parent", childFetcher, fieldConfig);
    }

    @NewChain
    public DictDataFetcher parent(IdOnlyFetchType idOnlyFetchType) {
        return add("parent", idOnlyFetchType);
    }

    @NewChain
    public DictDataFetcher children() {
        return add("children");
    }

    @NewChain
    public DictDataFetcher children(boolean enabled) {
        return enabled ? add("children") : remove("children");
    }

    @NewChain
    public DictDataFetcher children(Fetcher<DictData> childFetcher) {
        return add("children", childFetcher);
    }

    @NewChain
    public DictDataFetcher children(Fetcher<DictData> childFetcher,
            Consumer<RecursiveListFieldConfig<DictData, DictDataTable>> fieldConfig) {
        return add("children", childFetcher, fieldConfig);
    }

    @NewChain
    public DictDataFetcher dictType() {
        return add("dictType");
    }

    @NewChain
    public DictDataFetcher dictType(boolean enabled) {
        return enabled ? add("dictType") : remove("dictType");
    }

    @NewChain
    public DictDataFetcher dictType(Fetcher<DictType> childFetcher) {
        return add("dictType", childFetcher);
    }

    @NewChain
    public DictDataFetcher dictType(Fetcher<DictType> childFetcher,
            Consumer<FieldConfig<DictType, DictTypeTable>> fieldConfig) {
        return add("dictType", childFetcher, fieldConfig);
    }

    @NewChain
    public DictDataFetcher dictType(IdOnlyFetchType idOnlyFetchType) {
        return add("dictType", idOnlyFetchType);
    }

    @NewChain
    public DictDataFetcher parentId() {
        return add("parentId");
    }

    @NewChain
    public DictDataFetcher parentId(boolean enabled) {
        return enabled ? add("parentId") : remove("parentId");
    }

    @NewChain
    public DictDataFetcher parentId(IdOnlyFetchType idOnlyFetchType) {
        return add("parentId", idOnlyFetchType);
    }

    @NewChain
    public DictDataFetcher dictTypeId() {
        return add("dictTypeId");
    }

    @NewChain
    public DictDataFetcher dictTypeId(boolean enabled) {
        return enabled ? add("dictTypeId") : remove("dictTypeId");
    }

    @NewChain
    public DictDataFetcher dictTypeId(IdOnlyFetchType idOnlyFetchType) {
        return add("dictTypeId", idOnlyFetchType);
    }

    @NewChain
    public DictDataFetcher dictLabel() {
        return add("dictLabel");
    }

    @NewChain
    public DictDataFetcher dictLabel(boolean enabled) {
        return enabled ? add("dictLabel") : remove("dictLabel");
    }

    @NewChain
    public DictDataFetcher dictValue() {
        return add("dictValue");
    }

    @NewChain
    public DictDataFetcher dictValue(boolean enabled) {
        return enabled ? add("dictValue") : remove("dictValue");
    }

    @NewChain
    public DictDataFetcher isSys() {
        return add("isSys");
    }

    @NewChain
    public DictDataFetcher isSys(boolean enabled) {
        return enabled ? add("isSys") : remove("isSys");
    }

    @NewChain
    public DictDataFetcher description() {
        return add("description");
    }

    @NewChain
    public DictDataFetcher description(boolean enabled) {
        return enabled ? add("description") : remove("description");
    }

    @NewChain
    public DictDataFetcher cssStyle() {
        return add("cssStyle");
    }

    @NewChain
    public DictDataFetcher cssStyle(boolean enabled) {
        return enabled ? add("cssStyle") : remove("cssStyle");
    }

    @NewChain
    public DictDataFetcher cssClass() {
        return add("cssClass");
    }

    @NewChain
    public DictDataFetcher cssClass(boolean enabled) {
        return enabled ? add("cssClass") : remove("cssClass");
    }

    @NewChain
    public DictDataFetcher corpCode() {
        return add("corpCode");
    }

    @NewChain
    public DictDataFetcher corpCode(boolean enabled) {
        return enabled ? add("corpCode") : remove("corpCode");
    }

    @NewChain
    public DictDataFetcher corpName() {
        return add("corpName");
    }

    @NewChain
    public DictDataFetcher corpName(boolean enabled) {
        return enabled ? add("corpName") : remove("corpName");
    }

    @Override
    protected DictDataFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new DictDataFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected DictDataFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new DictDataFetcher(this, prop, fieldConfig);
    }
}
