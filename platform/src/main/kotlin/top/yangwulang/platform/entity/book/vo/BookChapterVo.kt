package top.yangwulang.platform.entity.book.vo

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable

@ApiModel("小说章节Vo")
data class BookChapterVo(
    @ApiModelProperty("小说章节主键")
    var id: String? = null,
    @ApiModelProperty("小说章节标题")
    var chapterTitle: String? = null,
    @ApiModelProperty("小说信息")
    var book: BookInfoVo? = null,
    @ApiModelProperty("章节来源")
    var fromPath: String? = null
) : Serializable
