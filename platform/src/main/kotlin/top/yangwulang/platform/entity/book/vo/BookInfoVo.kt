package top.yangwulang.platform.entity.book.vo

import java.io.Serializable

data class BookInfoVo(
    var id: String? = null,
    var bookName: String? = null,
    var author: String? = null,
    var describe: String? = null,
    var status: String? = null,
    var bookImgPath: String? = null,
    var category: String? = null,
    var bookFrom: String? = null
) : Serializable