package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.ViewableInput;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Post;
import top.yangwulang.platform.entity.sys.PostDraft;
import top.yangwulang.platform.entity.sys.PostFetcher;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Post.dto"
)
public class PostSaveInput implements ViewableInput<Post> {
    public static final ViewMetadata<Post, PostSaveInput> METADATA = 
        new ViewMetadata<Post, PostSaveInput>(
            PostFetcher.$
                .postCode()
                .postName()
                .postType(),
            PostSaveInput::new
    );

    private static final DtoPropAccessor ID_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { PostDraft.Producer.SLOT_ID }
    );

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
    @Null
    private String postType;

    @javax.validation.constraints.NotNull
    private String id;

    public PostSaveInput() {
    }

    public PostSaveInput(@NotNull Post base) {
        this.postCode = base.postCode();
        this.postName = base.postName();
        this.postType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(PostDraft.Producer.SLOT_POST_TYPE)) ? base.postType() : null;
        this.id = ID_ACCESSOR.get(base);
    }

    public static PostSaveInput of(@NotNull Post base) {
        return new PostSaveInput(base);
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

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
    }

    @Override
    public Post toEntity() {
        return PostDraft.$.produce(__draft -> {
            __draft.setPostCode(postCode);
            __draft.setPostName(postName);
            __draft.setPostType(postType);
            ID_ACCESSOR.set(__draft, id);
        });
    }

    public int hashCode() {
        int hash = Objects.hashCode(postCode);
        hash = hash * 31 + Objects.hashCode(postName);
        hash = hash * 31 + Objects.hashCode(postType);
        hash = hash * 31 + Objects.hashCode(id);
        return hash;
    }

    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        PostSaveInput other = (PostSaveInput) o;
        if (!Objects.equals(postCode, other.postCode)) {
            return false;
        }
        if (!Objects.equals(postName, other.postName)) {
            return false;
        }
        if (!Objects.equals(postType, other.postType)) {
            return false;
        }
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PostSaveInput").append('(');
        builder.append("postCode=").append(postCode);
        builder.append(", postName=").append(postName);
        builder.append(", postType=").append(postType);
        builder.append(", id=").append(id);
        builder.append(')');
        return builder.toString();
    }
}
