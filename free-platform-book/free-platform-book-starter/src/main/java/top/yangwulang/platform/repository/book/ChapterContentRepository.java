package top.yangwulang.platform.repository.book;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.book.ChapterContent;

@Repository
public interface ChapterContentRepository extends JRepository<ChapterContent, String> {
}
