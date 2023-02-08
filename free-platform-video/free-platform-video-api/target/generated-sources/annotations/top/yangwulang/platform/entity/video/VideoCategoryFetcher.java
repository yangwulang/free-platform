package top.yangwulang.platform.entity.video;

import java.lang.Override;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

public class VideoCategoryFetcher extends AbstractTypedFetcher<VideoCategory, VideoCategoryFetcher> {
    public static final VideoCategoryFetcher $ = new VideoCategoryFetcher(null);

    private VideoCategoryFetcher(FetcherImpl<VideoCategory> base) {
        super(VideoCategory.class, base);
    }

    private VideoCategoryFetcher(VideoCategoryFetcher prev, ImmutableProp prop, boolean negative) {
        super(prev, prop, negative);
    }

    private VideoCategoryFetcher(VideoCategoryFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static VideoCategoryFetcher $from(Fetcher<VideoCategory> base) {
        return base instanceof VideoCategoryFetcher ? 
        	(VideoCategoryFetcher)base : 
        	new VideoCategoryFetcher((FetcherImpl<VideoCategory>)base);
    }

    @NewChain
    public VideoCategoryFetcher categoryName() {
        return add("categoryName");
    }

    @NewChain
    public VideoCategoryFetcher categoryName(boolean enabled) {
        return enabled ? add("categoryName") : remove("categoryName");
    }

    @Override
    protected VideoCategoryFetcher createChildFetcher(ImmutableProp prop, boolean negative) {
        return new VideoCategoryFetcher(this, prop, negative);
    }

    @Override
    protected VideoCategoryFetcher createChildFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new VideoCategoryFetcher(this, prop, fieldConfig);
    }
}
