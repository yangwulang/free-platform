package top.yangwulang.platform.entity.book.dto

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable


@ApiModel("小说信息Dto")
class BookInfoDto : Serializable {
    @ApiModelProperty("小说主键")
    var id: String? = null

    @ApiModelProperty("小说名称")
    var bookName: String? = null

    @ApiModelProperty("作者")
    var author: String? = null

    @ApiModelProperty("小说描述")
    var describe: String? = null

    @ApiModelProperty("小说状态")
    var status: String? = null

    @ApiModelProperty("小说封面地址")
    var bookImgPath: String? = null

    @ApiModelProperty("小说类型")
    var category: String? = null
}