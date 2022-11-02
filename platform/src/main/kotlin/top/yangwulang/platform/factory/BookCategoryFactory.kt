package top.yangwulang.platform.factory

import org.apache.commons.lang3.StringUtils
import top.yangwulang.platform.entity.book.BookCategory
import top.yangwulang.platform.entity.book.dto.BookCategoryDto
import top.yangwulang.platform.entity.book.vo.BookCategoryVo

class BookCategoryFactory {

    fun convertVo(bookCategory: BookCategory?): BookCategoryVo? {
        if (bookCategory == null) {
            return null;
        }
        return BookCategoryVo(bookCategory.id, bookCategory.categoryName)
    }

    fun convertDtoToBo(bookCategoryDto: BookCategoryDto?): BookCategory {
        val bookCategory = BookCategory()
        if (bookCategoryDto == null) {
            return bookCategory;
        }
        if (StringUtils.isNoneBlank(bookCategoryDto.id)) {
            bookCategory.id = bookCategory.id
        }
        bookCategory.categoryName = bookCategoryDto.categoryName
        return bookCategory
    }

}