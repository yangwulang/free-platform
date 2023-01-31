package top.yangwulang.platform.entity.video;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

public class VideoInfoFetcher extends AbstractTypedFetcher<VideoInfo, VideoInfoFetcher> {
    public static final VideoInfoFetcher $ = new VideoInfoFetcher(null);

    private VideoInfoFetcher(FetcherImpl<VideoInfo> base) {
        super(VideoInfo.class, base);
    }

    private VideoInfoFetcher(VideoInfoFetcher prev, ImmutableProp prop, boolean negative) {
        super(prev, prop, negative);
    }

    private VideoInfoFetcher(VideoInfoFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static VideoInfoFetcher $from(Fetcher<VideoInfo> base) {
        return base instanceof VideoInfoFetcher ? 
        	(VideoInfoFetcher)base : 
        	new VideoInfoFetcher((FetcherImpl<VideoInfo>)base);
    }

    @NewChain
    public VideoInfoFetcher category() {
        return add("category");
    }

    @NewChain
    public VideoInfoFetcher category(boolean enabled) {
        return enabled ? add("category") : remove("category");
    }

    @NewChain
    public VideoInfoFetcher category(Fetcher<VideoCategory> childFetcher) {
        return add("category", childFetcher);
    }

    @NewChain
    public VideoInfoFetcher category(Fetcher<VideoCategory> childFetcher,
            Consumer<FieldConfig<VideoCategory, VideoCategoryTable>> fieldConfig) {
        return add("category", childFetcher, fieldConfig);
    }

    @NewChain
    public VideoInfoFetcher playUrl() {
        return add("playUrl");
    }

    @NewChain
    public VideoInfoFetcher playUrl(boolean enabled) {
        return enabled ? add("playUrl") : remove("playUrl");
    }

    @NewChain
    public VideoInfoFetcher imgSrc() {
        return add("imgSrc");
    }

    @NewChain
    public VideoInfoFetcher imgSrc(boolean enabled) {
        return enabled ? add("imgSrc") : remove("imgSrc");
    }

    @NewChain
    public VideoInfoFetcher desc() {
        return add("desc");
    }

    @NewChain
    public VideoInfoFetcher desc(boolean enabled) {
        return enabled ? add("desc") : remove("desc");
    }

    @NewChain
    public VideoInfoFetcher path() {
        return add("path");
    }

    @NewChain
    public VideoInfoFetcher path(boolean enabled) {
        return enabled ? add("path") : remove("path");
    }

    @Override
    protected VideoInfoFetcher createChildFetcher(ImmutableProp prop, boolean negative) {
        return new VideoInfoFetcher(this, prop, negative);
    }

    @Override
    protected VideoInfoFetcher createChildFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new VideoInfoFetcher(this, prop, fieldConfig);
    }
}
