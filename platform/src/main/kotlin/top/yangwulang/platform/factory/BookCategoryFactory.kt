package top.yangwulang.platform.factory

import top.yangwulang.platform.entity.book.BookCategory
import top.yangwulang.platform.entity.book.vo.BookCategoryVo

class BookCategoryFactory {

    fun convertVo(bookCategory: BookCategory?): BookCategoryVo? {
        if(bookCategory == null) {
            return null;
        }
        return BookCategoryVo(bookCategory.id, bookCategory.categoryName)
    }

}