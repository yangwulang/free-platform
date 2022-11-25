package top.yangwulang.platform.entity.sys.vo

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable

@ApiModel("用户Vo")
data class UserVo(
    @ApiModelProperty("用户编码")
    var id: String?,

    @ApiModelProperty("登录码,账号")
    var loginCode: String?,

    @ApiModelProperty("用户名")
    var userName: String?,

    @ApiModelProperty("邮箱")
    var email: String?,
    @ApiModelProperty("手机号")
    var mobile: String?,

    @ApiModelProperty("性别")
    var sex: Char?,

    @ApiModelProperty("签名")
    var sign: String?,

    @ApiModelProperty("状态")
    var status: Char?

) : Serializable
