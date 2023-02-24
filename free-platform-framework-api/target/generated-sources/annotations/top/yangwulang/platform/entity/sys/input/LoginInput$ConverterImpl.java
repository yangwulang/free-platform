package top.yangwulang.platform.entity.sys.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-24T16:52:01+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
class LoginInput$ConverterImpl implements LoginInput.Converter {

    @Override
    public User toUser(LoginInput input) {
        if ( input == null ) {
            return null;
        }

        UserDraft.MapStruct user = new UserDraft.MapStruct();

        user.loginCode( input.getLoginCode() );
        user.password( input.getPassword() );

        return user.build();
    }
}
