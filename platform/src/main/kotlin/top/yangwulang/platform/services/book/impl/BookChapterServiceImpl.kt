package top.yangwulang.platform.services.book.impl

import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.Modifying
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import top.yangwulang.platform.entity.book.BookChapter
import top.yangwulang.platform.entity.book.BookInfo
import top.yangwulang.platform.entity.book.dto.BookChapterDto
import top.yangwulang.platform.factory.BookChapterFactory
import top.yangwulang.platform.repository.book.BookChapterRepository
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.book.BookChapterService
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Service
class BookChapterServiceImpl :
    BaseServiceImpl<BookChapter, String, BookChapter, BookChapterRepository>(),
    BookChapterService {
    private val bookChapterFactory = BookChapterFactory()
    override fun convertFactory(): BookChapterFactory {
        return bookChapterFactory
    }

    override fun existsById(id: String): Boolean {
        return repository.existsById(id)
    }
    @Transactional
    @Modifying
    override fun save(dto: BookChapter): BookChapter {
        return repository.save(dto)
    }

    override fun where(
        dto: BookChapter,
        root: Root<BookChapter>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {
        predicates.add(cb.equal(root.get<BookInfo>("book").get<String>("id"), dto.book?.id))
        if (StringUtils.isNoneBlank(dto.chapterTitle)) {
            predicates.add(cb.like(root.get("chapterTitle"), "%" + dto.chapterTitle + "%"))
        }
    }
}