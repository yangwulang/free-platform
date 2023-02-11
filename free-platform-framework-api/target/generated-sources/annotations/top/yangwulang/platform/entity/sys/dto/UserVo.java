package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.beans.ConstructorProperties;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.Static;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.StaticMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

public class UserVo implements Static<User> {
    public static final StaticMetadata<User, UserVo> METADATA = 
        new StaticMetadata<User, UserVo>(
            UserFetcher.$
                .loginCode()
                .userName()
                .email(),
            UserVo::new
    );

    @NotNull
    @javax.validation.constraints.NotNull
    @Schema(
            description = "用户编码"
    )
    private final String userCode;

    @Nullable
    @Null
    @Schema(
            description = "登录编码(账号)"
    )
    private final String loginCode;

    @Nullable
    @Null
    @Schema(
            description = "用户名"
    )
    private final String userName;

    @Nullable
    @Null
    @Schema(
            description = "邮件"
    )
    private final String email;

    @JsonCreator
    @ConstructorProperties({"userCode", "loginCode", "userName", "email"})
    public UserVo(
            @NotNull @javax.validation.constraints.NotNull @JsonProperty(value = "userCode", required = true) String userCode,
            @Nullable @Null @JsonProperty("loginCode") String loginCode,
            @Nullable @Null @JsonProperty("userName") String userName,
            @Nullable @Null @JsonProperty("email") String email) {
        this.userCode = Objects.requireNonNull(userCode, "userCode");
        this.loginCode = loginCode;
        this.userName = userName;
        this.email = email;
    }

    UserVo(@NotNull User base) {
        // This constructor is not public so that the `@Argument` of spring-graphql can work, please use `of`
        ImmutableSpi spi = (ImmutableSpi)base;
        this.userCode = base.userCode();
        this.loginCode = spi.__isLoaded(8) ? base.loginCode() : null;
        this.userName = spi.__isLoaded(9) ? base.userName() : null;
        this.email = spi.__isLoaded(11) ? base.email() : null;
    }

    public static UserVo of(@NotNull User base) {
        return new UserVo(base);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public static Builder newBuilder(@Nullable UserVo base) {
        return new Builder(base);
    }

    @NotNull
    @javax.validation.constraints.NotNull
    public String getUserCode() {
        return userCode;
    }

    @Nullable
    @Null
    public String getLoginCode() {
        return loginCode;
    }

    @Nullable
    @Null
    public String getUserName() {
        return userName;
    }

    @Nullable
    @Null
    public String getEmail() {
        return email;
    }

    @Override
    public User toEntity() {
        return toEntity(null);
    }

    @Override
    public User toEntity(@Nullable User base) {
        return UserDraft.$.produce(base, draft -> {
            draft.setUserCode(userCode);
            draft.setLoginCode(loginCode);
            draft.setUserName(userName);
            draft.setEmail(email);
        });
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("UserVo{")
            .append("userCode").append('=').append(userCode)
            .append(", ")
            .append("loginCode").append('=').append(loginCode)
            .append(", ")
            .append("userName").append('=').append(userName)
            .append(", ")
            .append("email").append('=').append(email)
            .append('}')
            .toString();
    }

    public static class Builder {
        private String userCode;

        private String loginCode;

        private String userName;

        private String email;

        Builder(UserVo base) {
            if (base != null) {
                this.userCode = base.getUserCode();
                this.loginCode = base.getLoginCode();
                this.userName = base.getUserName();
                this.email = base.getEmail();
            }
        }

        @NotNull
        public Builder setUserCode(@NotNull String userCode) {
            this.userCode = userCode;
            return this;
        }

        @NotNull
        public Builder setLoginCode(@Nullable String loginCode) {
            this.loginCode = loginCode;
            return this;
        }

        @NotNull
        public Builder setUserName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }

        @NotNull
        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        @NotNull
        public UserVo build() {
            if (userCode == null) {
                throw new IllegalArgumentException("Property \"userCode\" has not been set");
            }
            return new UserVo(
                userCode,
                loginCode,
                userName,
                email
            );
        }
    }
}
