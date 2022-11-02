package top.yangwulang.platform.factory

import top.yangwulang.platform.entity.book.BookInfo
import top.yangwulang.platform.entity.book.dto.BookInfoDto

class BookInfoFactory {

    fun convertDtoToBo(bookInfoDto: BookInfoDto?): BookInfo {
        val bookInfo = BookInfo()
        return if (bookInfoDto == null) {
            bookInfo;
        } else {
            bookInfo.id = bookInfoDto.id
            bookInfo.bookName = bookInfoDto.bookName
            bookInfo.author = bookInfoDto.author
            bookInfo.category = bookInfoDto.category
            bookInfo.bookImgPath = bookInfoDto.bookImgPath
            bookInfo.describe = bookInfoDto.describe
            bookInfo.status = bookInfoDto.status
            bookInfo
        }
    }

}