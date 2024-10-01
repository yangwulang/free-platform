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
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Post;
import top.yangwulang.platform.entity.sys.PostDraft;
import top.yangwulang.platform.entity.sys.PostFetcher;

/**
 * 岗位表
 *
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Post.dto"
)
@Schema(
        description = "岗位"
)
public class PostListView implements View<Post> {
    public static final DtoMetadata<Post, PostListView> METADATA = 
        new DtoMetadata<Post, PostListView>(
            PostFetcher.$
                .postCode()
                .postName()
                .postType(),
            PostListView::new
    );

    private String id;

    private String postCode;

    private String postName;

    private String postType;

    public PostListView() {
    }

    public PostListView(@NotNull Post base) {
        this.id = base.id();
        this.postCode = base.postCode();
        this.postName = base.postName();
        this.postType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(PostDraft.Producer.SLOT_POST_TYPE)) ? base.postType() : null;
    }

    /**
     * 字典类型编码
     * @return 主键值
     */
    @NotNull
    public String getId() {
        if (id == null) {
            throw new IllegalStateException("The property \"id\" is not specified");
        }
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    /**
     * 岗位编码
     *
     * @return 岗位编码
     */
    @NotNull
    @Schema(
            description = "岗位编码"
    )
    public String getPostCode() {
        if (postCode == null) {
            throw new IllegalStateException("The property \"postCode\" is not specified");
        }
        return postCode;
    }

    public void setPostCode(@NotNull String postCode) {
        this.postCode = postCode;
    }

    /**
     * 岗位名称
     *
     * @return 岗位名称
     */
    @NotNull
    @Schema(
            description = "岗位名称"
    )
    public String getPostName() {
        if (postName == null) {
            throw new IllegalStateException("The property \"postName\" is not specified");
        }
        return postName;
    }

    public void setPostName(@NotNull String postName) {
        this.postName = postName;
    }

    /**
     * 岗位类型（高管、中层、低层）
     *
     * @return 高管、中层、低层 此处是字典
     */
    @Nullable
    @Schema(
            description = "岗位类型（高管、中层、低层）"
    )
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
        PostListView other = (PostListView) o;
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
        builder.append("PostListView").append('(');
        builder.append("id=").append(id);
        builder.append(", postCode=").append(postCode);
        builder.append(", postName=").append(postName);
        builder.append(", postType=").append(postType);
        builder.append(')');
        return builder.toString();
    }
}
