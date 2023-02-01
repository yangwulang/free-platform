package top.yangwulang.platform.repository.video;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.video.VideoCategory;

@Repository
public interface VideoCategoryRepository extends JRepository<VideoCategory, String> {
}
