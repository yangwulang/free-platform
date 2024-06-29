package top.yangwulang.platform.services;

import org.babyfish.jimmer.Input;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.event.RegisterUserSuccessEvent;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.repository.sys.UserRepository;

import jakarta.validation.constraints.NotEmpty;

import java.util.List;

/**
 * @author yangwulang
 */
public interface UserService extends BaseService<User, String, UserRepository> {

    /**
     * 注册用户
     * <p></p>
     * <br/>
     * 可能会抛出以下业务异常信息
     * <li color="red">如果传入的登录编码在系统中不存在时：{@link top.yangwulang.platform.exception.SystemError#LOGIN_CODE_EXISTS}</li>
     * <p>
     * <br/>
     * 如果一切顺利，则向spring中发送一条{@link RegisterUserSuccessEvent}通知
     *
     * @param input 用户数据
     */
    void registerUser(Input<User> input);

    /**
     * 激活用户,如果用户状态不是{@link User#STATUS_UN_ACTIVE},则什么都不会发生,只有指定状态下才激活用户
     * <p></p>
     * <br/>
     * 可能会抛出以下业务异常信息
     * <li color="red">如果传入的userId在系统中不存在时：{@link top.yangwulang.platform.exception.SystemError#USER_NOT_FOUND}</li>
     *
     * @param userId 用户id
     */
    void activeUser(String userId);

    /**
     * 通过id删除用户，其中用户不能是
     *
     * @param id 用户id
     */
    void deleteById(@NotNull String id);

    /**
     * 加密密码
     *
     * @param password 密码铭文
     * @return 密码密文
     */
    String encryptPassword(String password);

    /**
     * 管理员重置用户密码
     *
     * @param id 用户id
     */
    void adminResetPassword(@NotEmpty(message = "用户id不能为空") String id);

    /**
     * 获取菜单权限数据，如果为超管，则直接返回 [*]
     * <br/>
     * 可能会抛出以下业务异常信息
     * <li color="red">如果传入的userId在系统中不存在时：{@link top.yangwulang.platform.exception.SystemError#USER_NOT_FOUND}</li>
     *
     * @param id 用户id
     * @return 菜单权限
     */
    List<String> getPermissionString(@NotEmpty(message = "用户id不能为空") String id);
}
