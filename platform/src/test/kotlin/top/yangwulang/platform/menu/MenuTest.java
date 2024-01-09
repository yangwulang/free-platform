package top.yangwulang.platform.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.yangwulang.platform.repository.sys.MenuRepository;
import top.yangwulang.platform.services.MenuService;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MenuTest {
    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private MenuService menuService;


}
