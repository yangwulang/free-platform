package top.yangwulang.platform.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.repository.sys.UserRepository;
import top.yangwulang.platform.services.UserService;

import java.util.Optional;

/**
 * @author yangwulang
 */
//@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User get(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public void findPage() {
        userRepository.findAll(PageRequest.of(1, 20));
    }


}
