package top.yangwulang.platform.entity.video;

import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.Id;
import org.babyfish.jimmer.sql.GeneratedValue;

import javax.validation.constraints.Null;

import org.babyfish.jimmer.sql.GenerationType;

/**
 * Entity for table "video_category"
 */
@Entity
public interface VideoCategory {
    @Id
    String id();

    @Null String categoryName();
}

