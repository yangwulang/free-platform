package top.yangwulang.platform.repository.video;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.video.VideoInfo;

@Repository
public interface VideoInfoRepository extends JRepository<VideoInfo, String> {
}
