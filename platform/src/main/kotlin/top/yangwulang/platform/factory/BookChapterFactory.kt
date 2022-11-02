package top.yangwulang.platform.factory

import org.springframework.beans.BeanUtils
import top.yangwulang.platform.entity.book.BookChapter
import top.yangwulang.platform.entity.book.BookInfo
import top.yangwulang.platform.entity.book.dto.BookChapterDto
import top.yangwulang.platform.entity.book.vo.BookChapterVo

class BookChapterFactory {
    fun convertVo(bookChapter: BookChapter?): BookChapterVo? {
        return if (bookChapter == null) {
            null
        } else {
            val vo = BookChapterVo()
            BeanUtils.copyProperties(bookChapter, vo)
            vo
        }
    }

    fun convertDtoToBo(bookChapterDto: BookChapterDto?): BookChapter {
        val bookChapter = BookChapter()
        return if (bookChapterDto == null) {
            bookChapter
        } else {
            bookChapter.chapterTitle = bookChapterDto.chapterTitle
            bookChapter.id = bookChapterDto.id
            val bookInfo = BookInfo()
            bookInfo.id = bookChapterDto.bookId
            bookChapter.book = bookInfo
            bookChapter
        }
    }
}