package top.yangwulang.platform.factory

import org.springframework.beans.BeanUtils
import top.yangwulang.platform.entity.book.BookChapter
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
}