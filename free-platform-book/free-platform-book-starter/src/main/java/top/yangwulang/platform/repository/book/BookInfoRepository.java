package top.yangwulang.platform.repository.book;

import org.apache.commons.lang3.StringUtils;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.entity.book.BookInfoTable;
import top.yangwulang.platform.entity.book.dto.BookInfoInput;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.dto.DictTypeInput;

@Repository
public interface BookInfoRepository extends JRepository<BookInfo, String> {
    BookInfoTable TABLE = BookInfoTable.$;

    /**
     * 查询列表页数据
     *
     * @param pageable      分页数据
     * @param fetcher       f对象
     * @param bookInfoInput 入参对象
     * @return 分页数据
     */
    default Page<BookInfo> findAll(Pageable pageable, Fetcher<BookInfo> fetcher, BookInfoInput bookInfoInput) {
        return pager(pageable)
                .execute(
                        sql().createQuery(TABLE)
                                .whereIf(StringUtils.isNotEmpty(bookInfoInput.getBookName()), TABLE.bookName().like(bookInfoInput.getBookName()))
                                .whereIf(StringUtils.isNotEmpty(bookInfoInput.getAuthor()), TABLE.author().like(bookInfoInput.getAuthor()))
                                .whereIf(StringUtils.isNotEmpty(bookInfoInput.getDescribe()), TABLE.author().like(bookInfoInput.getAuthor()))
                                .select(TABLE.fetch(fetcher))
                );
    }
}
