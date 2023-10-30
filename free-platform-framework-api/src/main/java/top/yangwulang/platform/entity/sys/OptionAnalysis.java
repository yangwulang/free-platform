package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.*;
import top.yangwulang.platform.entity.TypeBase;

import javax.validation.constraints.Null;
import java.util.Date;

@Entity
@Table(name = "sys_option_analysis")
@Schema(description = "系统操作分析")
public interface OptionAnalysis extends TypeBase {
    @Schema(description = "事件名称")
    String eventName();

    @Key
    @Schema(description = "事件编码")
    String eventCode();

    /**
     * 操作用户，可以为空（存在游客的可能）
     *
     * @return 操作的用户
     */
    @ManyToOne
    @JoinColumn(name = "option_user_id")
    @Schema(description = "操作人，如果没有就是游客")
    @Key
    @Null User optionUser();

    /**
     * ip地址
     *
     * @return ip地址,这里的ip地址一定不为空
     */
    @Schema(description = "ip地址")
    String ipAddress();

    @Schema(description = "创建时间")
    @Key
    Date createDate();

    @Schema(description = "元数据存取某些相关分析数据json")
    @Null String meta();
}
