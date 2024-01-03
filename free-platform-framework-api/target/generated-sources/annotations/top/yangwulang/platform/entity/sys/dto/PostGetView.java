package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Post;
import top.yangwulang.platform.entity.sys.PostDraft;
import top.yangwulang.platform.entity.sys.PostFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Post.dto"
)
public class PostGetView implements View<Post> {
    public static final ViewMetadata<Post, PostGetView> METADATA = 
        new ViewMetadata<Post, PostGetView>(
            PostFetcher.$
                .postCode()
                .postName()
                .postType(),
            PostGetView::new
    );

    @NotNull
    private String id;

    @Schema(
            description = "岗位编码"
    )
    @NotNull
    private String postCode;

    @Schema(
            description = "岗位名称"
    )
    @NotNull
    private String postName;

    @Schema(
            description = "岗位类型（高管、中层、低层）"
    )
    @Nullable
    private String postType;

    public PostGetView() {
    }

    public PostGetView(@NotNull Post base) {
        this.id = base.id();
        this.postCode = base.postCode();
        this.postName = base.postName();
        this.postType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(PostDraft.Producer.SLOT_POST_TYPE)) ? base.postType() : null;
    }

    public static PostGetView of(@NotNull Post base) {
        return new PostGetView(base);
    }

    @NotNull
    public String getId() {
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    @NotNull
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(@NotNull String postCode) {
        this.postCode = postCode;
    }

    @NotNull
    public String getPostName() {
        return postName;
    }

    public void setPostName(@NotNull String postName) {
        this.postName = postName;
    }

    @Nullable
    public String getPostType() {
        return postType;
    }

    public void setPostType(@Nullable String postType) {
        this.postType = postType;
    }

    @Override
    public Post toEntity() {
        return PostDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setPostCode(postCode);
            __draft.setPostName(postName);
            __draft.setPostType(postType);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(postCode);
        hash = hash * 31 + Objects.hashCode(postName);
        hash = hash * 31 + Objects.hashCode(postType);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        PostGetView other = (PostGetView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(postCode, other.postCode)) {
            return false;
        }
        if (!Objects.equals(postName, other.postName)) {
            return false;
        }
        if (!Objects.equals(postType, other.postType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PostGetView").append('(');
        builder.append("id=").append(id);
        builder.append(", postCode=").append(postCode);
        builder.append(", postName=").append(postName);
        builder.append(", postType=").append(postType);
        builder.append(')');
        return builder.toString();
    }
}
