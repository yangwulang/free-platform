package top.yangwulang.platform.entity.sys.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-07T16:33:47+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
class UserInput$ConverterImpl implements UserInput.Converter {

    @Override
    public User toUser(UserInput input) {
        if ( input == null ) {
            return null;
        }

        UserDraft.MapStruct user = new UserDraft.MapStruct();

        user.userName( input.getUserName() );

        return user.build();
    }
}
