package top.yangwulang.platform.services.book

import top.yangwulang.platform.entity.book.BookCategory
import top.yangwulang.platform.factory.BookCategoryFactory

interface BookCategoryService {
    fun findPage(): Unit


    fun findById(id: String): BookCategory?

    fun convertFactory(): BookCategoryFactory;

}