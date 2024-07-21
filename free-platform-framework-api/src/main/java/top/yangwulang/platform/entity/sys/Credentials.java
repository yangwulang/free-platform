package top.yangwulang.platform.entity.sys;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.Objects;
import java.time.Duration;

@Getter
@Setter
public class Credentials {
  private String accessKey;

  private String secretKey;

  private String sessionToken;

  private ZonedDateTime expiration;

  public Credentials() {
  }

  public Credentials(
      String accessKey,
      String secretKey,
      String sessionToken,
      ZonedDateTime expiration) {
    this.accessKey = Objects.requireNonNull(accessKey, "AccessKey must not be null");
    this.secretKey = Objects.requireNonNull(secretKey, "SecretKey must not be null");
    if (accessKey.isEmpty() || secretKey.isEmpty()) {
      throw new IllegalArgumentException("AccessKey and SecretKey must not be empty");
    }
    this.sessionToken = sessionToken;
    this.expiration = expiration;
  }


  public String accessKey() {
    return accessKey;
  }

  public String secretKey() {
    return secretKey;
  }

  public String sessionToken() {
    return sessionToken;
  }

  public boolean isExpired() {
    if (expiration == null) {
      return false;
    }

    return ZonedDateTime.now().plus(Duration.ofSeconds(10)).isAfter(expiration);
  }
}