package top.yangwulang.platform.sys;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;
import top.yangwulang.platform.repository.sys.UserRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SysUserTest {

    @Autowired
    private UserRepository repository;

    private User systemAdmin;

    private final Logger logger = LoggerFactory.getLogger(SysUserTest.class);


    @BeforeEach
    public void buildSystemAdmin() {
        systemAdmin = UserDraft.$.produce(p -> {
            p.setUserName("系统管理员")
                    .setLoginCode("system")
                    .setUserType("")
                    .setSex("1")
                    .setUserType("1")
                    .setEmail("102@qq.com")
                    .setUserWeight(1);
        });
    }

    @Test
    public void testSaveUser() {
        User save = repository.save(systemAdmin);
        logger.info("保存后 {}", save);
    }

}
