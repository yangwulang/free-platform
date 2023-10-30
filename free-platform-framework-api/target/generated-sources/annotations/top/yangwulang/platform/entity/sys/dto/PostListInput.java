package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.Input;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.sys.Post;
import top.yangwulang.platform.entity.sys.PostDraft;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Post.dto"
)
@Data
public class PostListInput implements Input<Post> {
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

    public PostListInput() {
    }

    @Override
    public Post toEntity() {
        return PostDraft.$.produce(draft -> {
            draft.setPostCode(postCode);
            draft.setPostName(postName);
            draft.setPostType(postType);
        });
    }
}
