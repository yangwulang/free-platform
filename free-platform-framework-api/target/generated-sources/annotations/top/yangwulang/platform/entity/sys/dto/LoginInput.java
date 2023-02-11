package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.beans.ConstructorProperties;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.StaticMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.entity.sys.UserFetcher;

public class LoginInput implements Input<User> {
    public static final StaticMetadata<User, LoginInput> METADATA = 
        new StaticMetadata<User, LoginInput>(
            UserFetcher.$
                .loginCode()
                .password(),
            LoginInput::new
    );

    @Nullable
    @Null
    @Schema(
            description = "登录编码(账号)"
    )
    private final String loginCode;

    @Nullable
    @Null
    @Schema(
            description = "密码"
    )
    private final String password;

    @JsonCreator
    @ConstructorProperties({"loginCode", "password"})
    public LoginInput(@Nullable @Null @JsonProperty("loginCode") String loginCode,
            @Nullable @Null @JsonProperty("password") String password) {
        this.loginCode = loginCode;
        this.password = password;
    }

    LoginInput(@NotNull User base) {
        // This constructor is not public so that the `@Argument` of spring-graphql can work, please use `of`
        ImmutableSpi spi = (ImmutableSpi)base;
        this.loginCode = spi.__isLoaded(8) ? base.loginCode() : null;
        this.password = spi.__isLoaded(10) ? base.password() : null;
    }

    public static LoginInput of(@NotNull User base) {
        return new LoginInput(base);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public static Builder newBuilder(@Nullable LoginInput base) {
        return new Builder(base);
    }

    @Nullable
    @Null
    public String getLoginCode() {
        return loginCode;
    }

    @Nullable
    @Null
    public String getPassword() {
        return password;
    }

    @Override
    public User toEntity() {
        return toEntity(null);
    }

    @Override
    public User toEntity(@Nullable User base) {
        return UserDraft.$.produce(base, draft -> {
            draft.setLoginCode(loginCode);
            draft.setPassword(password);
        });
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("LoginInput{")
            .append("loginCode").append('=').append(loginCode)
            .append(", ")
            .append("password").append('=').append(password)
            .append('}')
            .toString();
    }

    public static class Builder {
        private String loginCode;

        private String password;

        Builder(LoginInput base) {
            if (base != null) {
                this.loginCode = base.getLoginCode();
                this.password = base.getPassword();
            }
        }

        @NotNull
        public Builder setLoginCode(@Nullable String loginCode) {
            this.loginCode = loginCode;
            return this;
        }

        @NotNull
        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        @NotNull
        public LoginInput build() {
            return new LoginInput(
                loginCode,
                password
            );
        }
    }
}
