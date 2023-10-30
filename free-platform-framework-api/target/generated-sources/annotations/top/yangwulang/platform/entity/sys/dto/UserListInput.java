package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.Input;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/User.dto"
)
@Data
public class UserListInput implements Input<User> {
    @Schema(
            description = "用户名"
    )
    @Null
    private String userName;

    public UserListInput() {
    }

    @Override
    public User toEntity() {
        return UserDraft.$.produce(draft -> {
            draft.setUserName(userName);
        });
    }
}
