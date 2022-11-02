package top.yangwulang.platform.entity.book.dto

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable


@ApiModel("小说章节Dto")
class BookChapterDto : Serializable {
    @ApiModelProperty("小说章节主键")
    var id: String? = null

    @ApiModelProperty("小说章节标题")
    var chapterTitle: String? = null

    @ApiModelProperty(value = "小说书籍主键", required = true)
    var bookId: String? = null
}