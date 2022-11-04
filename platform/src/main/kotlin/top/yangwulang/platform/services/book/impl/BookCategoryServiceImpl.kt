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
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.book.BookCategoryService
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Slf4j
@Service
class BookCategoryServiceImpl :
    BaseServiceImpl<BookCategory, String, BookCategoryDto, BookCategoryRepository>(),
    BookCategoryService {
    @Autowired
    private lateinit var bookCategoryRepository: BookCategoryRepository

    private val bookCategoryFactory = BookCategoryFactory()
    override fun convertFactory(): BookCategoryFactory {
        return bookCategoryFactory
    }

    @Transactional
    @Modifying
    override fun save(dto: BookCategoryDto): BookCategory {
        return bookCategoryRepository.save<BookCategory>(this.bookCategoryFactory.convertDtoToBo(dto))
    }


    override fun where(
        dto: BookCategoryDto,
        root: Root<BookCategory>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {
        if (dto.categoryName != null) {
            predicates.add(cb.like(root.get("categoryName"), "%" + dto.categoryName + "%"))
        }
    }

}