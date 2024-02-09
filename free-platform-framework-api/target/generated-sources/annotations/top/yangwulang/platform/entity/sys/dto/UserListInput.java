package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/User.dto"
)
public class UserListInput implements Input<User> {
    public static final ViewMetadata<User, UserListInput> METADATA = 
        new ViewMetadata<User, UserListInput>(
            UserFetcher.$
                .userName(),
            UserListInput::new
    );

    @Schema(
            description = "用户名"
    )
    @Nullable
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
    @Schema(
            description = "用户名"
    )
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

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(userName);
        return hash;
    }

    @Override
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserListInput").append('(');
        builder.append("userName=").append(userName);
        builder.append(')');
        return builder.toString();
    }
}
