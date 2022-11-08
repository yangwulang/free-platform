package top.yangwulang.platform.entity.book.vo

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable

@ApiModel("小说信息Vo")
data class BookInfoVo(
    @ApiModelProperty("小说信息id")
    var id: String? = null,
    @ApiModelProperty("小说名称")
    var bookName: String? = null,
    @ApiModelProperty("小说作者")
    var author: String? = null,
    @ApiModelProperty("小说描述")
    var describe: String? = null,
    @ApiModelProperty("小说状态")
    var status: String? = null,
    @ApiModelProperty("小说封面")
    var bookImgPath: String? = null,
    @ApiModelProperty("小说分类")
    var category: String? = null,
    @ApiModelProperty("小说信息来源")
    var bookFrom: String? = null
) : Serializable