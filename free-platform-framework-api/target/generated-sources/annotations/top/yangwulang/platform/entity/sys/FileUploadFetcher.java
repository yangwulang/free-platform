package top.yangwulang.platform.entity.sys;

import java.lang.Override;
import java.util.function.Consumer;
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
        type = FileUpload.class
)
public class FileUploadFetcher extends AbstractTypedFetcher<FileUpload, FileUploadFetcher> {
    public static final FileUploadFetcher $ = new FileUploadFetcher(null);

    private FileUploadFetcher(FetcherImpl<FileUpload> base) {
        super(FileUpload.class, base);
    }

    private FileUploadFetcher(FileUploadFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private FileUploadFetcher(FileUploadFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static FileUploadFetcher $from(Fetcher<FileUpload> base) {
        return base instanceof FileUploadFetcher ? 
        	(FileUploadFetcher)base : 
        	new FileUploadFetcher((FetcherImpl<FileUpload>)base);
    }

    @NewChain
    public FileUploadFetcher fileEntity() {
        return add("fileEntity");
    }

    @NewChain
    public FileUploadFetcher fileEntity(boolean enabled) {
        return enabled ? add("fileEntity") : remove("fileEntity");
    }

    @NewChain
    public FileUploadFetcher fileEntity(Fetcher<FileEntity> childFetcher) {
        return add("fileEntity", childFetcher);
    }

    @NewChain
    public FileUploadFetcher fileEntity(Fetcher<FileEntity> childFetcher,
            Consumer<FieldConfig<FileEntity, FileEntityTable>> fieldConfig) {
        return add("fileEntity", childFetcher, fieldConfig);
    }

    @NewChain
    public FileUploadFetcher fileEntity(IdOnlyFetchType idOnlyFetchType) {
        return add("fileEntity", idOnlyFetchType);
    }

    @NewChain
    public FileUploadFetcher fileEntityId() {
        return add("fileEntityId");
    }

    @NewChain
    public FileUploadFetcher fileEntityId(boolean enabled) {
        return enabled ? add("fileEntityId") : remove("fileEntityId");
    }

    @NewChain
    public FileUploadFetcher fileEntityId(IdOnlyFetchType idOnlyFetchType) {
        return add("fileEntityId", idOnlyFetchType);
    }

    @NewChain
    public FileUploadFetcher fileName() {
        return add("fileName");
    }

    @NewChain
    public FileUploadFetcher fileName(boolean enabled) {
        return enabled ? add("fileName") : remove("fileName");
    }

    @NewChain
    public FileUploadFetcher fileType() {
        return add("fileType");
    }

    @NewChain
    public FileUploadFetcher fileType(boolean enabled) {
        return enabled ? add("fileType") : remove("fileType");
    }

    @NewChain
    public FileUploadFetcher bizKey() {
        return add("bizKey");
    }

    @NewChain
    public FileUploadFetcher bizKey(boolean enabled) {
        return enabled ? add("bizKey") : remove("bizKey");
    }

    @NewChain
    public FileUploadFetcher bizType() {
        return add("bizType");
    }

    @NewChain
    public FileUploadFetcher bizType(boolean enabled) {
        return enabled ? add("bizType") : remove("bizType");
    }

    @Override
    protected FileUploadFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new FileUploadFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected FileUploadFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new FileUploadFetcher(this, prop, fieldConfig);
    }
}
