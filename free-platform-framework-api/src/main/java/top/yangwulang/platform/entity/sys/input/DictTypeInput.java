package top.yangwulang.platform.entity.sys.input;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.babyfish.jimmer.ImmutableConverter;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.client.ExportFields;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.sys.DictType;

/**
 * @author yangwulang
 */
@ExportFields
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(name = "字典类型输入实体")
public class DictTypeInput implements Input<DictType> {

    private static final ImmutableConverter<DictType, DictTypeInput> CONVERTER =
            ImmutableConverter.forFields(DictType.class, DictTypeInput.class).build();

    @NotNull
    @Override
    public DictType toEntity() {
        return CONVERTER.convert(this);
    }
}
