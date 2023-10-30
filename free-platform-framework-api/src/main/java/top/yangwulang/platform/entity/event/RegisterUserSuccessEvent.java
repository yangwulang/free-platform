package top.yangwulang.platform.entity.event;

import org.springframework.context.ApplicationEvent;
import top.yangwulang.platform.entity.sys.User;

/**
 * 注册用户成功事件
 *
 * @author yangwulang
 */
public class RegisterUserSuccessEvent extends ApplicationEvent {
    public RegisterUserSuccessEvent(User source) {
        super(source);
    }
}
