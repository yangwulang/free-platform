package top.yangwulang.platform.entity.book.vo

import java.io.Serializable

data class BookChapterVo(
    var id: String? = null,
    var chapterTitle: String? = null,
    var book: BookInfoVo? = null,
    var fromPath: String? = null
) : Serializable
