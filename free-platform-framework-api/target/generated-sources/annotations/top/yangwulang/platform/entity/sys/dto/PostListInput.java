package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Post;
import top.yangwulang.platform.entity.sys.PostDraft;
import top.yangwulang.platform.entity.sys.PostFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Post.dto"
)
@Schema(
        description = "岗位"
)
public class PostListInput implements Input<Post> {
    public static final DtoMetadata<Post, PostListInput> METADATA = 
        new DtoMetadata<Post, PostListInput>(
            PostFetcher.$
                .postCode()
                .postName()
                .postType(),
            PostListInput::new
    );

    private static final DtoPropAccessor POST_CODE_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { PostDraft.Producer.SLOT_POST_CODE }
    );

    private static final DtoPropAccessor POST_NAME_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { PostDraft.Producer.SLOT_POST_NAME }
    );

    private String postCode;

    private String postName;

    private String postType;

    public PostListInput() {
    }

    public PostListInput(@NotNull Post base) {
        this.postCode = POST_CODE_ACCESSOR.get(base);
        this.postName = POST_NAME_ACCESSOR.get(base);
        this.postType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(PostDraft.Producer.SLOT_POST_TYPE)) ? base.postType() : null;
    }

    @Nullable
    @Schema(
            description = "岗位编码"
    )
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(@Nullable String postCode) {
        this.postCode = postCode;
    }

    @Nullable
    @Schema(
            description = "岗位名称"
    )
    public String getPostName() {
        return postName;
    }

    public void setPostName(@Nullable String postName) {
        this.postName = postName;
    }

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
            POST_CODE_ACCESSOR.set(__draft, postCode);
            POST_NAME_ACCESSOR.set(__draft, postName);
            __draft.setPostType(postType);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(postCode);
        hash = hash * 31 + Objects.hashCode(postName);
        hash = hash * 31 + Objects.hashCode(postType);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        PostListInput other = (PostListInput) o;
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
        builder.append("PostListInput").append('(');
        builder.append("postCode=").append(postCode);
        builder.append(", postName=").append(postName);
        builder.append(", postType=").append(postType);
        builder.append(')');
        return builder.toString();
    }
}
