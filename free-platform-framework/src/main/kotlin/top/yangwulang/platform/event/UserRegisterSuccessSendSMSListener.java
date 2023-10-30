package top.yangwulang.platform.event;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.ApplicationListener;
import top.yangwulang.platform.entity.event.RegisterUserSuccessEvent;
import top.yangwulang.platform.entity.sys.User;

/**
 * @author yangwulang
 */
@Slf4j
public class UserRegisterSuccessSendSMSListener implements ApplicationListener<RegisterUserSuccessEvent> {
    @Override
    public void onApplicationEvent(@NotNull RegisterUserSuccessEvent event) {
        User registerUser = (User) event.getSource();
        if (StringUtils.isEmpty(registerUser.phone()) || StringUtils.isEmpty(registerUser.mobile())) {
            log.debug(
                    "用户ID: {} 用户: {}，没有填写电话或者手机未发送激活短信",
                    registerUser.userCode(), registerUser.userName()
            );
            return;
        }
    }
}
