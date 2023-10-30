package top.yangwulang.platform.event;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.ApplicationListener;
import top.yangwulang.platform.entity.event.RegisterUserSuccessEvent;
import top.yangwulang.platform.entity.sys.User;

/**
 * 用户注册成功后发送邮件进行激活监听器
 */
@Slf4j
public class UserRegisterSuccessSendEmailListener implements ApplicationListener<RegisterUserSuccessEvent> {

    @Override
    public void onApplicationEvent(@NotNull RegisterUserSuccessEvent event) {
        User registerUser = (User) event.getSource();
        String email = registerUser.email();
        if (StringUtils.isEmpty(email)) {
            log.debug("用户ID: {} 用户: {}，没有填写邮件未发送激活邮件", registerUser.userCode(), registerUser.userName());
            return;
        }

    }
}
