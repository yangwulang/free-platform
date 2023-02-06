package top.yangwulang.platform.entity.sys.input;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.client.ExportFields;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeDraft;

/**
 * @author yangwulang
 */
@ExportFields
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(name = "字典类型输入实体")
public class DictTypeInput implements Input<DictType> {
    private String id;

    private String dictName;

    private String dictType;

    private boolean sys;

    @NotNull
    @Override
    public DictType toEntity() {
        return DictTypeDraft.$.produce(type -> {
            type.setId(this.id);
            type.setDictType(this.dictType);
            type.setDictName(this.dictName);
            type.setSys(this.sys);
        });
    }

    @NotNull
    @Override
    public DictType toEntity(DictType base) {
        return DictTypeDraft.$.produce(base, type -> {
            type.setId(this.id);
            type.setDictType(this.dictType);
            type.setDictName(this.dictName);
            type.setSys(this.sys);
        });
    }
}
