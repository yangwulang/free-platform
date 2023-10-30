package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import top.yangwulang.platform.entity.sys.Post;
import top.yangwulang.platform.entity.sys.PostDraft;
import top.yangwulang.platform.entity.sys.PostFetcher;
import top.yangwulang.platform.entity.sys.PostProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Post.dto"
)
@Data
public class PostListView implements View<Post> {
    public static final ViewMetadata<Post, PostListView> METADATA = 
        new ViewMetadata<Post, PostListView>(
            PostFetcher.$
                .postCode()
                .postName()
                .postType(),
            PostListView::new
    );

    @NotNull
    private String id;

    @Schema(
            description = "岗位编码"
    )
    @org.jetbrains.annotations.NotNull
    private String postCode;

    @Schema(
            description = "岗位名称"
    )
    @org.jetbrains.annotations.NotNull
    private String postName;

    @Schema(
            description = "岗位类型（高管、中层、低层）"
    )
    @Null
    private String postType;

    public PostListView() {
    }

    public PostListView(@org.jetbrains.annotations.NotNull Post base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.postCode = base.postCode();
        this.postName = base.postName();
        this.postType = spi.__isLoaded(PostProps.POST_TYPE.unwrap().getId()) ? base.postType() : null;
    }

    public static PostListView of(@org.jetbrains.annotations.NotNull Post base) {
        return new PostListView(base);
    }

    @Override
    public Post toEntity() {
        return PostDraft.$.produce(draft -> {
            draft.setId(id);
            draft.setPostCode(postCode);
            draft.setPostName(postName);
            draft.setPostType(postType);
        });
    }
}
