package top.yangwulang.platform.services.book

import top.yangwulang.platform.entity.book.BookInfo
import top.yangwulang.platform.entity.book.dto.BookInfoDto
import top.yangwulang.platform.factory.BookInfoFactory
import top.yangwulang.platform.services.QueryService

interface BookInfoService : QueryService<BookInfo, String, BookInfoDto> {

    fun convertFactory(): BookInfoFactory
}