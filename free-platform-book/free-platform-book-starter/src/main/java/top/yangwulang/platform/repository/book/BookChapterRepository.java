package top.yangwulang.platform.repository.book;

import org.apache.commons.lang3.StringUtils;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.book.BookChapter;
import top.yangwulang.platform.entity.book.BookChapterTable;
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.entity.book.BookInfoTable;
import top.yangwulang.platform.entity.book.dto.BookChapterInput;
import top.yangwulang.platform.entity.book.dto.BookInfoInput;

/**
 * @author yangwulang
 */
@Repository
public interface BookChapterRepository extends JRepository<BookChapter, String> {

    BookChapterTable TABLE = BookChapterTable.$;

    default Page<BookChapter> findAll(Pageable pageable, Fetcher<BookChapter> fetcher, BookChapterInput bookChapterInput) {
        return pager(pageable)
                .execute(
                        sql().createQuery(TABLE)
                                .whereIf(StringUtils.isNotEmpty(bookChapterInput.getChapterTitle()), TABLE.chapterTitle().like(bookChapterInput.getChapterTitle()))
                                .whereIf(StringUtils.isNotEmpty(bookChapterInput.getBookId()), TABLE.book().id().eq(bookChapterInput.getBookId()))
                                .select(TABLE.fetch(fetcher))
                );
    }

}
