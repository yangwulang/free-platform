package top.yangwulang.platform.entity.sys.input;

import lombok.Data;
import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.User;

@Data
public class LoginInput implements Input<User> {

    private static final LoginInput.Converter CONVERTER = Mappers.getMapper(LoginInput.Converter.class);

    private String loginCode;
    private String password;

    @Override
    public User toEntity() {
        return CONVERTER.toUser(this);
    }

    @Mapper
    interface Converter {

        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        User toUser(LoginInput input);

    }
}
