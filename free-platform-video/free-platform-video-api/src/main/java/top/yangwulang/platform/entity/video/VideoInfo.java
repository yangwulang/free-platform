package top.yangwulang.platform.entity.video;

import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Entity for table "video_video"
 *
 * @author yangwulang
 */
@Entity
@Table(name = "video_video")
@Immutable(value = Immutable.Nullity.NULLABLE)
public interface VideoInfo {
    @Id
    @NotNull
    String id();

    @Key
    @ManyToOne
    @NotNull
    VideoCategory category();

    String playUrl();

    String imgSrc();

    String desc();

    /**
     * 视频地址
     */
    String path();
}

