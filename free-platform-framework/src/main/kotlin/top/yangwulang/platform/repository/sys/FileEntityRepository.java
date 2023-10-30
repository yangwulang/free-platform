package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.FileEntity;

@Repository
public interface FileEntityRepository extends JRepository<FileEntity, String> {
}
