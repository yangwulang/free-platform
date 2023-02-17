package top.yangwulang.platform.role;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.input.RoleInput;
import top.yangwulang.platform.repository.sys.RoleRepository;

import java.math.BigDecimal;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RoleTest {

    @Autowired
    private RoleRepository roleRepository;

    public static Role createDefault() {
        RoleInput roleInput = new RoleInput();
        roleInput.setRoleName("测试");
        roleInput.setRoleType("高管");
        roleInput.setRoleSort(BigDecimal.valueOf(30));
        roleInput.setUserType("employee");
        roleInput.setSys(true);
        return roleInput.toEntity();
    }

    @Test
    public void saveRole() {
        roleRepository.save(createDefault());
    }
}
