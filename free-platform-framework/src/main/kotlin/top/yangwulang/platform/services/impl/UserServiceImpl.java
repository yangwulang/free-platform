package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yangwulang.platform.repository.sys.UserRepository;
import top.yangwulang.platform.services.UserService;

/**
 * @author yangwulang
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


}
