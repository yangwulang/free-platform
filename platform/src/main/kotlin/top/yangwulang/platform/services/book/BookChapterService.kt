package top.yangwulang.platform.services.book

import top.yangwulang.platform.entity.book.BookChapter
import top.yangwulang.platform.factory.BookChapterFactory
import top.yangwulang.platform.services.QueryService
import top.yangwulang.platform.services.UpdateService

interface BookChapterService :
    QueryService<BookChapter, String, BookChapter>,
    UpdateService<BookChapter, String, BookChapter> {
    fun convertFactory(): BookChapterFactory

    fun existsById(id: String): Boolean

}