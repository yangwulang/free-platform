package top.yangwulang.platform.menu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.input.MenuInput;
import top.yangwulang.platform.repository.sys.MenuRepository;
import top.yangwulang.platform.role.RoleTest;
import top.yangwulang.platform.services.MenuService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MenuTest {
    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private MenuService menuService;

    @Test
    public void testSaveMenu() {
        List<Role> roles = new ArrayList<>();
        roles.add(RoleTest.createDefault());
        MenuInput menuInput = new MenuInput();
        menuInput.setMenuName("测试");
        menuInput.setParent(new MenuInput("0"));
        menuInput.setMenuType("1");
        menuInput.setParentCodes("0,");
        menuInput.setTreeSort(BigDecimal.valueOf(30));
        menuInput.setTreeSorts("30,");
        menuInput.setTreeLeaf("1");
        menuInput.setTreeLevel(BigDecimal.valueOf(30));
        menuInput.setTreeNames("测试");
        menuInput.setMenuHref("/sdaf");
        menuInput.setMenuComponent("ddd");
        menuInput.setWeight(BigDecimal.valueOf(1));
        menuInput.setSysCode("default");
        menuInput.setShow(true);
        menuRepository.save(MenuDraft.$.produce(menuInput.toEntity(), d -> d.setRoles(roles).setParent(MenuDraft.$.produce(df -> df.setId("0")))));
        List<Menu> all = menuRepository.findAll();
        System.out.println(all);
    }

}
