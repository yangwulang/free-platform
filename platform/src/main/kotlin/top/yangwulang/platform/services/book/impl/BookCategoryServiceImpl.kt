package top.yangwulang.platform.services.book.impl

import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.stereotype.Service
import top.yangwulang.platform.entity.book.BookCategory
import top.yangwulang.platform.entity.book.dto.BookCategoryDto
import top.yangwulang.platform.factory.BookCategoryFactory
import top.yangwulang.platform.repository.book.BookCategoryRepository
import top.yangwulang.platform.services.book.BookCategoryService
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Slf4j
@Service
class BookCategoryServiceImpl : BookCategoryService {
    @Autowired
    private lateinit var bookCategoryRepository: BookCategoryRepository

    private val bookCategoryFactory = BookCategoryFactory()

    override fun findPage(
        bookCategoryDto: BookCategoryDto,
        pageable: Pageable
    ): Page<BookCategory> {
        val where = Specification.where<BookCategory> { root, criteriaQuery, cb ->
            val predicates = arrayListOf<Predicate>()
            if (bookCategoryDto.categoryName != null) {
                predicates.add(cb.like(root.get("categoryName"), "%" + bookCategoryDto.categoryName + "%"))
            }
            criteriaQuery.where(*predicates.toTypedArray()).restriction
        }
        return bookCategoryRepository.findAll(where, pageable)
    }

    override fun findById(id: String): BookCategory? {
        return bookCategoryRepository.findById(id).orElse(null)
    }

    override fun convertFactory(): BookCategoryFactory {
        return bookCategoryFactory
    }

}