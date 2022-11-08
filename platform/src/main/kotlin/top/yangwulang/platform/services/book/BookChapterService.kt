package top.yangwulang.platform.services.book

import top.yangwulang.platform.entity.book.BookChapter
import top.yangwulang.platform.entity.book.dto.BookChapterDto
import top.yangwulang.platform.factory.BookChapterFactory
import top.yangwulang.platform.services.QueryService
import top.yangwulang.platform.services.UpdateService

interface BookChapterService :
    QueryService<BookChapter, String, BookChapterDto>,
    UpdateService<BookChapter, String, BookChapterDto> {
    fun convertFactory(): BookChapterFactory

    fun existsById(id: String): Boolean

}