package top.yangwulang.platform.services.book.impl

import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.stereotype.Service
import top.yangwulang.platform.entity.book.BookInfo
import top.yangwulang.platform.entity.book.dto.BookInfoDto
import top.yangwulang.platform.factory.BookInfoFactory
import top.yangwulang.platform.repository.book.BookInfoRepository
import top.yangwulang.platform.services.book.BookInfoService
import javax.persistence.criteria.Predicate

@Service
class BookInfoServiceImpl : BookInfoService {
    @Autowired
    private lateinit var bookInfoRepository: BookInfoRepository;
    private val bookInfoFactory: BookInfoFactory = BookInfoFactory()

    override fun findList(dto: BookInfoDto): List<BookInfo> {
        return bookInfoRepository.findAll(createWhere(dto))
    }

    override fun findPage(dto: BookInfoDto, pageable: Pageable): Page<BookInfo> {
        return bookInfoRepository.findAll(createWhere(dto), pageable)
    }

    override fun findById(id: String): BookInfo? {
        return bookInfoRepository.findById(id).orElse(null)
    }

    override fun save(dto: BookInfoDto): BookInfo {
        TODO("Not yet implemented")
    }

    override fun delete(id: String) {
        TODO("Not yet implemented")
    }

    override fun convertFactory(): BookInfoFactory {
        return bookInfoFactory
    }

    private fun createWhere(dto: BookInfoDto): Specification<BookInfo> {
        return Specification.where { root, criteriaQuery, cb ->
            val predicates = arrayListOf<Predicate>()
            if (StringUtils.isNoneBlank(dto.bookName)) {
                predicates.add(cb.like(root.get("bookName"), "%" + dto.bookName + "%"))
            }
            if (StringUtils.isNoneBlank(dto.author)) {
                predicates.add(cb.like(root.get("author"), "%" + dto.author + "%"))
            }
            if (StringUtils.isNoneBlank(dto.category)) {
                predicates.add(cb.equal(root.get<String>("category"), dto.category))
            }
            if (StringUtils.isNoneBlank(dto.describe)) {
                predicates.add(cb.like(root.get("describe"), "%" + dto.describe + "%"))
            }
            if (StringUtils.isNoneBlank(dto.status)) {
                predicates.add(cb.equal(root.get<String>("status"), dto.status))
            }
            criteriaQuery.where(*predicates.toTypedArray()).restriction
        }
    }


}