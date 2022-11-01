package top.yangwulang.platform.services.book

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import top.yangwulang.platform.entity.book.BookCategory
import top.yangwulang.platform.entity.book.dto.BookCategoryDto
import top.yangwulang.platform.factory.BookCategoryFactory

interface BookCategoryService {
    fun findPage(
        bookCategoryDto: BookCategoryDto,
        pageable: Pageable
    ): Page<BookCategory>


    fun findById(id: String): BookCategory?

    fun convertFactory(): BookCategoryFactory;

}