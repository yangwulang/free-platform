package top.yangwulang.platform.entity.video;

import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.Null;

/**
 * Entity for table "video_category"
 */
@Entity
public interface VideoCategory {
    @Id
    String id();

    @Key
    String categoryName();
}

