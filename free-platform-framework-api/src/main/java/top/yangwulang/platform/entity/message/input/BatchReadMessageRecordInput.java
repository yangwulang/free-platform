package top.yangwulang.platform.entity.message.input;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author yangwulang
 */
@Schema(description = "批量阅读消息")
@Data
public class BatchReadMessageRecordInput {
    @Schema(description = "消息ids")
    @NotNull
    private List<String> recordIds;
}
