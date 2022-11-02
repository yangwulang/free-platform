package top.yangwulang.platform.services.book

import top.yangwulang.platform.entity.book.BookCategory
import top.yangwulang.platform.entity.book.dto.BookCategoryDto
import top.yangwulang.platform.factory.BookCategoryFactory
import top.yangwulang.platform.services.QueryService
import top.yangwulang.platform.services.UpdateService

interface BookCategoryService :
    QueryService<BookCategory, String, BookCategoryDto>,
    UpdateService<BookCategory, String, BookCategoryDto> {

    fun convertFactory(): BookCategoryFactory;

}