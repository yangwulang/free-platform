package top.yangwulang.platform.services.book.impl

import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import top.yangwulang.platform.entity.book.BookCategory
import top.yangwulang.platform.factory.BookCategoryFactory
import top.yangwulang.platform.repository.book.BookCategoryRepository
import top.yangwulang.platform.services.book.BookCategoryService

@Slf4j
@Service
class BookCategoryServiceImpl : BookCategoryService {
    @Autowired
    private lateinit var bookCategoryRepository: BookCategoryRepository

    private val bookCategoryFactory = BookCategoryFactory()

    override fun findPage() {
        val findAll: Page<BookCategory> = bookCategoryRepository.findAll(PageRequest.of(1, 20))
    }

    override fun findById(id: String): BookCategory? {
        return bookCategoryRepository.findById(id).orElse(null)
    }

    override fun convertFactory(): BookCategoryFactory {
        return bookCategoryFactory
    }

}