package top.yangwulang.platform.repository.book;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.book.BookInfo;

@Repository
public interface BookInfoRepository extends JRepository<BookInfo, String> {
}
