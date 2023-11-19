package top.yangwulang.platform.entity.sys.input.user;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-18T16:51:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
class UserSaveInput$ConverterImpl implements UserSaveInput.Converter {

    @Override
    public User toUser(UserSaveInput input) {
        if ( input == null ) {
            return null;
        }

        UserDraft.MapStruct user = new UserDraft.MapStruct();

        user.userCode( input.getUserCode() );
        user.loginCode( input.getLoginCode() );
        user.userName( input.getUserName() );
        user.email( input.getEmail() );
        user.mobile( input.getMobile() );
        user.sex( input.getSex() );
        user.sign( input.getSign() );
        user.userType( input.getUserType() );
        user.mgrType( input.getMgrType() );
        user.userWeight( input.getUserWeight() );

        return user.build();
    }
}
