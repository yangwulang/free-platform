package top.yangwulang.platform.repository.book;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.book.BookChapter;

@Repository
public interface BookChapterRepository extends JRepository<BookChapter, String> {
}
