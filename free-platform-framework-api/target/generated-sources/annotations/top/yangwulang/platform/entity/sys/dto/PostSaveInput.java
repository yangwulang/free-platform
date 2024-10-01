package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.FixedInputField;
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
@JsonDeserialize(
        builder = PostSaveInput.Builder.class
)
@Schema(
        description = "岗位"
)
public class PostSaveInput implements Input<Post> {
    public static final DtoMetadata<Post, PostSaveInput> METADATA = 
        new DtoMetadata<Post, PostSaveInput>(
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

    @FixedInputField
    private String postCode;

    @FixedInputField
    private String postName;

    private String postType;

    private String id;

    public PostSaveInput() {
    }

    public PostSaveInput(@NotNull Post base) {
        this.postCode = base.postCode();
        this.postName = base.postName();
        this.postType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(PostDraft.Producer.SLOT_POST_TYPE)) ? base.postType() : null;
        this.id = ID_ACCESSOR.get(base);
    }

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

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(postCode);
        hash = hash * 31 + Objects.hashCode(postName);
        hash = hash * 31 + Objects.hashCode(postType);
        hash = hash * 31 + Objects.hashCode(id);
        return hash;
    }

    @Override
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

    @Override
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

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String postCode;

        private String postName;

        private String postType;

        private String id;

        public Builder postCode(String postCode) {
            this.postCode = Objects.requireNonNull(postCode, "The property \"postCode\" cannot be null");
            return this;
        }

        public Builder postName(String postName) {
            this.postName = Objects.requireNonNull(postName, "The property \"postName\" cannot be null");
            return this;
        }

        public Builder postType(String postType) {
            this.postType = postType;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public PostSaveInput build() {
            PostSaveInput _input = new PostSaveInput();
            if (postCode == null) {
                throw Input.unknownNonNullProperty(PostSaveInput.class, "postCode");
            }
            _input.setPostCode(postCode);
            if (postName == null) {
                throw Input.unknownNonNullProperty(PostSaveInput.class, "postName");
            }
            _input.setPostName(postName);
            _input.setPostType(postType);
            _input.setId(id);
            return _input;
        }
    }
}
