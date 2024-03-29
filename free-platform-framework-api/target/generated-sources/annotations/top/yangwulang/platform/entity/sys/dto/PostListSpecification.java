package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.query.specification.JSpecification;
import org.babyfish.jimmer.sql.ast.query.specification.PredicateApplier;
import org.babyfish.jimmer.sql.ast.query.specification.SpecificationArgs;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Post;
import top.yangwulang.platform.entity.sys.PostProps;
import top.yangwulang.platform.entity.sys.PostTable;

/**
 *  岗位表
 *
 *  @author yangwulang
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Post.dto"
)
public class PostListSpecification implements JSpecification<Post, PostTable> {
    @Schema(
            description = "岗位编码"
    )
    @Nullable
    private String postCode;

    @Schema(
            description = "岗位名称"
    )
    @Nullable
    private String postName;

    @Schema(
            description = "岗位类型（高管、中层、低层）"
    )
    @Nullable
    private String postType;

    public PostListSpecification() {
    }

    /**
     * 岗位编码
     *
     * @return 岗位编码
     */
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

    /**
     * 岗位名称
     *
     * @return 岗位名称
     */
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
    public Class<Post> entityType() {
        return Post.class;
    }

    @Override
    public void applyTo(SpecificationArgs<Post, PostTable> args) {
        PredicateApplier __applier = args.getApplier();
        __applier.like(new ImmutableProp[] { PostProps.POST_CODE.unwrap() }, this.postCode, false, false, false);
        __applier.like(new ImmutableProp[] { PostProps.POST_NAME.unwrap() }, this.postName, false, false, false);
        __applier.eq(new ImmutableProp[] { PostProps.POST_TYPE.unwrap() }, this.postType);
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
        PostListSpecification other = (PostListSpecification) o;
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
        builder.append("PostListSpecification").append('(');
        builder.append("postCode=").append(postCode);
        builder.append(", postName=").append(postName);
        builder.append(", postType=").append(postType);
        builder.append(')');
        return builder.toString();
    }
}
