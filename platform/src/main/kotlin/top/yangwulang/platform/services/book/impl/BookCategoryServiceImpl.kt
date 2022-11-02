package top.yangwulang.platform.services.book.impl

import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.Modifying
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import top.yangwulang.platform.entity.book.BookCategory
import top.yangwulang.platform.entity.book.dto.BookCategoryDto
import top.yangwulang.platform.factory.BookCategoryFactory
import top.yangwulang.platform.repository.book.BookCategoryRepository
import top.yangwulang.platform.services.book.BookCategoryService
import javax.persistence.criteria.Predicate

@Slf4j
@Service
class BookCategoryServiceImpl : BookCategoryService {
    @Autowired
    private lateinit var bookCategoryRepository: BookCategoryRepository

    private val bookCategoryFactory = BookCategoryFactory()

    override fun findPage(
        dto: BookCategoryDto,
        pageable: Pageable
    ): Page<BookCategory> {
        return bookCategoryRepository.findAll(createWhere(dto), pageable)
    }

    override fun findById(id: String): BookCategory? {
        return bookCategoryRepository.findById(id).orElse(null)
    }

    override fun convertFactory(): BookCategoryFactory {
        return bookCategoryFactory
    }

    override fun findList(dto: BookCategoryDto): List<BookCategory> {
        return bookCategoryRepository.findAll(createWhere(dto))
    }

    @Transactional
    @Modifying
    override fun save(dto: BookCategoryDto): BookCategory {
        return bookCategoryRepository.save<BookCategory>(this.bookCategoryFactory.convertDtoToBo(dto))
    }

    @Transactional
    @Modifying
    override fun delete(id: String) {
        bookCategoryRepository.deleteById(id)
    }

    private fun createWhere(bookCategoryDto: BookCategoryDto): Specification<BookCategory> {
        return Specification.where { root, criteriaQuery, cb ->
            val predicates = arrayListOf<Predicate>()
            if (bookCategoryDto.categoryName != null) {
                predicates.add(cb.like(root.get("categoryName"), "%" + bookCategoryDto.categoryName + "%"))
            }
            criteriaQuery.where(*predicates.toTypedArray()).restriction
        }
    }

}