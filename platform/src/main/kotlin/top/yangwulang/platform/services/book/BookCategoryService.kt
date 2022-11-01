package top.yangwulang.platform.services.book

import top.yangwulang.platform.entity.book.BookCategory
import top.yangwulang.platform.entity.book.dto.BookCategoryDto
import top.yangwulang.platform.factory.BookCategoryFactory
import top.yangwulang.platform.services.QueryService

interface BookCategoryService : QueryService<BookCategory, String, BookCategoryDto> {

    fun convertFactory(): BookCategoryFactory;

}