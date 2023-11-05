package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.ViewableInput;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/User.dto"
)
public class UserListInput implements ViewableInput<User> {
    public static final ViewMetadata<User, UserListInput> METADATA = 
        new ViewMetadata<User, UserListInput>(
            UserFetcher.$
                .userName(),
            UserListInput::new
    );

    @Schema(
            description = "用户名"
    )
    @Null
    private String userName;

    public UserListInput() {
    }

    public UserListInput(@NotNull User base) {
        this.userName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(UserDraft.Producer.SLOT_USER_NAME)) ? base.userName() : null;
    }

    public static UserListInput of(@NotNull User base) {
        return new UserListInput(base);
    }

    @Nullable
    public String getUserName() {
        return userName;
    }

    public void setUserName(@Nullable String userName) {
        this.userName = userName;
    }

    @Override
    public User toEntity() {
        return UserDraft.$.produce(__draft -> {
            __draft.setUserName(userName);
        });
    }

    public int hashCode() {
        int hash = Objects.hashCode(userName);
        return hash;
    }

    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        UserListInput other = (UserListInput) o;
        if (!Objects.equals(userName, other.userName)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserListInput").append('(');
        builder.append("userName=").append(userName);
        builder.append(')');
        return builder.toString();
    }
}
