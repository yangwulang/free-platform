package top.yangwulang.platform.entity.sys.input;

import lombok.Data;
import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.User;

@Data
public class UserInput implements Input<User> {

    private static final UserInput.Converter CONVERTER = Mappers.getMapper(UserInput.Converter.class);

    private String userName;

    @Override
    public User toEntity() {
        return CONVERTER.toUser(this);
    }

    @Mapper
    interface Converter {

        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        User toUser(UserInput input);

    }
}
