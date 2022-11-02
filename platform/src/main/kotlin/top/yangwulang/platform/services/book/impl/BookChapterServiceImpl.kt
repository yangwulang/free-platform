package top.yangwulang.platform.services.book.impl

import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.stereotype.Service
import top.yangwulang.platform.entity.book.BookChapter
import top.yangwulang.platform.entity.book.BookInfo
import top.yangwulang.platform.entity.book.dto.BookChapterDto
import top.yangwulang.platform.factory.BookChapterFactory
import top.yangwulang.platform.repository.book.BookChapterRepository
import top.yangwulang.platform.services.book.BookChapterService
import javax.persistence.criteria.Predicate

@Service
class BookChapterServiceImpl : BookChapterService {
    @Autowired
    private lateinit var bookChapterRepository: BookChapterRepository;
    private val bookChapterFactory = BookChapterFactory()
    override fun convertFactory(): BookChapterFactory {
        return bookChapterFactory
    }

    override fun findList(dto: BookChapterDto): List<BookChapter> {
        return bookChapterRepository.findAll(createWhere(dto))
    }

    override fun findPage(dto: BookChapterDto, pageable: Pageable): Page<BookChapter> {
        return bookChapterRepository.findAll(createWhere(dto), pageable)
    }

    override fun findById(id: String): BookChapter? {
        return bookChapterRepository.findById(id).orElse(null)
    }

    override fun save(dto: BookChapterDto): BookChapter {
        return bookChapterRepository.save(bookChapterFactory.convertDtoToBo(dto))
    }

    override fun delete(id: String) {
        if (bookChapterRepository.existsById(id)) {
            bookChapterRepository.deleteById(id)
        }
    }

    private fun createWhere(dto: BookChapterDto): Specification<BookChapter> {
        return Specification.where { root, criteriaQuery, cb ->
            val predicates = arrayListOf<Predicate>()
            predicates.add(cb.equal(root.get<BookInfo>("book").get<String>("id"), dto.bookId))
            if (StringUtils.isNoneBlank(dto.chapterTitle)) {
                predicates.add(cb.like(root.get("chapterTitle"), "%" + dto.chapterTitle + "%"))
            }
            criteriaQuery.where(*predicates.toTypedArray()).restriction
        }
    }
}