package top.yangwulang.platform.entity.book.vo

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable

@ApiModel("小说分类Vo")
data class BookCategoryVo(
    @ApiModelProperty("小说分类id")
    var id: String?,
    @ApiModelProperty("小说分类名称")
    var categoryName: String?
) : Serializable
