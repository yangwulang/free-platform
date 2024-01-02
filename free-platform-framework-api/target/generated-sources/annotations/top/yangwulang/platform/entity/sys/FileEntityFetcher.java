package top.yangwulang.platform.entity.sys;

import java.lang.Override;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = FileEntity.class
)
public class FileEntityFetcher extends AbstractTypedFetcher<FileEntity, FileEntityFetcher> {
    public static final FileEntityFetcher $ = new FileEntityFetcher(null);

    private FileEntityFetcher(FetcherImpl<FileEntity> base) {
        super(FileEntity.class, base);
    }

    private FileEntityFetcher(FileEntityFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private FileEntityFetcher(FileEntityFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static FileEntityFetcher $from(Fetcher<FileEntity> base) {
        return base instanceof FileEntityFetcher ? 
        	(FileEntityFetcher)base : 
        	new FileEntityFetcher((FetcherImpl<FileEntity>)base);
    }

    @NewChain
    public FileEntityFetcher fileMd5() {
        return add("fileMd5");
    }

    @NewChain
    public FileEntityFetcher fileMd5(boolean enabled) {
        return enabled ? add("fileMd5") : remove("fileMd5");
    }

    @NewChain
    public FileEntityFetcher filePath() {
        return add("filePath");
    }

    @NewChain
    public FileEntityFetcher filePath(boolean enabled) {
        return enabled ? add("filePath") : remove("filePath");
    }

    @NewChain
    public FileEntityFetcher fileContentType() {
        return add("fileContentType");
    }

    @NewChain
    public FileEntityFetcher fileContentType(boolean enabled) {
        return enabled ? add("fileContentType") : remove("fileContentType");
    }

    @NewChain
    public FileEntityFetcher fileMeta() {
        return add("fileMeta");
    }

    @NewChain
    public FileEntityFetcher fileMeta(boolean enabled) {
        return enabled ? add("fileMeta") : remove("fileMeta");
    }

    @Override
    protected FileEntityFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new FileEntityFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected FileEntityFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new FileEntityFetcher(this, prop, fieldConfig);
    }
}
