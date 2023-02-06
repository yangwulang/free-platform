package top.yangwulang.platform.entity.sys.input;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.client.ExportFields;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;


/**
 * @author yangwulang
 */
@ExportFields
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(name = "用户输入实体")
public class UserInput implements Input<User> {


    @Schema(name = "userCode", title = "用户编码")
    private String userCode;

    @SchemaProperty(name = "adsfasdf")
    private String userName;


    @NotNull
    @Override
    public User toEntity() {
        return UserDraft.$.produce(book -> {
            book.setUserCode(this.userCode);
            book.setUserName(this.userName);
        });
    }

    @NotNull
    @Override
    public User toEntity(User base) {
        return UserDraft.$.produce(base,book -> {
            book.setUserCode(this.userCode);
            book.setUserName(this.userName);
        });
    }
}
