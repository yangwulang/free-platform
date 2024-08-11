package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.nustaq.serialization.annotations.Serialize;

/**
 * @author yangwulang
 */
@Data
@Serialize
@Schema(description = "菜单路由元数据")
public class Meta {
    @Schema(description = "隐藏菜单")
    private boolean hideMenu = false;
    @Schema(description = "图标")
    private String icon;
    @Schema(description = "标题")
    private String title;
    @Schema(description = "菜单颜色")
    private String color;
    @Schema(description = "是否一定需要授权")
    private boolean requiresAuth = false;
}
