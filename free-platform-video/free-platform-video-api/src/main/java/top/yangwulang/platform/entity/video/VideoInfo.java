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
public interface VideoInfo {
    @Id
    String id();

    @Key
    @ManyToOne
    VideoCategory category();

    @Null String playUrl();

    @Null String imgSrc();

    @Null String desc();

    /**
     * 视频地址
     */
    @Null String path();
}

