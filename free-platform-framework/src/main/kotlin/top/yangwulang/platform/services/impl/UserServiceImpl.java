package top.yangwulang.platform.services.impl;

import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.extra.spring.SpringUtil;
import org.apache.commons.lang3.StringUtils;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.spring.repository.support.JRepositoryImpl;
import org.babyfish.jimmer.sql.JSqlClient;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.yangwulang.platform.entity.Fetchers;
import top.yangwulang.platform.entity.Tables;
import top.yangwulang.platform.entity.event.RegisterUserSuccessEvent;
import top.yangwulang.platform.entity.sys.*;
import top.yangwulang.platform.exception.ServiceException;
import top.yangwulang.platform.exception.SystemError;
import top.yangwulang.platform.repository.sys.UserRepository;
import top.yangwulang.platform.services.UserService;
import top.yangwulang.platform.utils.ConfigUtils;
import top.yangwulang.platform.utils.UserUtils;

import java.rmi.server.ServerCloneException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author yangwulang
 */
@Service
public class UserServiceImpl
        extends BaseServiceImpl<User, String, UserRepository>
        implements UserService {

    public UserServiceImpl(@Autowired UserRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void registerUser(Input<User> input) {
        if (repository.existsByLoginCode(input.toEntity().loginCode())) {
            throw new ServiceException(SystemError.LOGIN_CODE_EXISTS);
        }
        User inputEntity = UserDraft.$.produce(input.toEntity(), u -> {
            if (u.userWeight() == null) {
                u.setUserWeight(10);
            }
            if (StringUtils.isEmpty(u.mgrType())) {
                u.setMgrType(User.USER_TYPE_SIMPLE_USER);
            }
            boolean useDefaultValue = ConfigUtils.getConfigValueBoolean("sys.useDefaultPassword");
            if (useDefaultValue) {
                String configValue = ConfigUtils.getConfigValue("sys.defaultPassword");
                u.setPassword(configValue);
            }
            u.setPwdSecurityLevel(UserUtils.getPasswordLevel(u.password()));
            u.setStatus(Integer.parseInt(User.STATUS_UN_ACTIVE));
        });
        // 将用户信息写入，然后发出注册成功通知
        User success = this.save(inputEntity);
        SpringUtil.getApplicationContext().publishEvent(new RegisterUserSuccessEvent(success));
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void activeUser(String userId) {
        User user = super.findById(userId)
                .orElseThrow(() -> new ServiceException(SystemError.USER_NOT_FOUND));
        if (user.status() == Integer.parseInt(User.STATUS_UN_ACTIVE)) {
            this.repository.sql()
                    .createUpdate(UserTable.$)
                    .set(UserTable.$.status(), Integer.parseInt(User.STATUS_ACTIVE))
                    .execute();
        }
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void deleteById(@NotNull String id) {
        User user = super.findNullable(id);
        if (user == null) {
            return;
        }
        if (User.USER_TYPE_SUPER_ADMIN.equals(user.userType())) {
            throw new ServiceException(SystemError.CANT_DELETE_SUPER_ADMIN);
        }
        super.deleteById(id);
    }

    @Override
    public String encryptPassword(String password) {
        return UserUtils.encryptPassword(password);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void adminResetPassword(String id) {
        User user = this.findById(id).orElseThrow(() -> new ServiceException("未找到 id为:" + id + "的用户"));
        String configValue = ConfigUtils.getConfigValue("sys.defaultPassword");
        this.update(UserDraft.$.produce(it ->
                it.setPassword(this.encryptPassword(configValue))
                        .setUserCode(user.userCode())
        ));
    }

    @Override
    public List<String> getPermissionString(String id) {
        return this.repository().sql()
                .createQuery(Tables.MENU_TABLE)
                .where(Predicate.and(
                        MenuTableEx.$.roles().users().userCode().eq(id),
                        Tables.MENU_TABLE.permission().ne("")
                ))
                .select(Tables.MENU_TABLE.fetch(
                        Fetchers.MENU_FETCHER.permission()
                ))
                .execute()
                .stream()
                .map(Menu::permission)
                .flatMap((Function<String, Stream<String>>) s -> {
                    if (s.contains(",")) {
                        return Arrays.stream(s.split(","));
                    }
                    return Stream.of(s);
                })
                .toList();
    }

}
