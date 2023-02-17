package top.yangwulang.platform.controller.sys;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import top.yangwulang.platform.entity.PageHttpRequest;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuFetcher;
import top.yangwulang.platform.entity.sys.input.MenuInput;
import top.yangwulang.platform.repository.sys.MenuRepository;
import top.yangwulang.platform.services.MenuService;

/**
 * @author yangwulang
 */
@RestController
@Tags(value = {
        @Tag(name = "系统模块"),
        @Tag(name = "菜单管理"),
})
@RequestMapping("${adminPath}/sys/menu")
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private MenuService menuService;

    private final MenuFetcher menuFetcher = MenuFetcher.$
            .allScalarFields()
            .children();

    @PostMapping
    @Operation(summary = "获取菜单列表")
    public Page<Menu> listData(HttpServletRequest httpServletRequest) {
        return menuRepository.findAll(PageHttpRequest.of(httpServletRequest).toPage(), menuFetcher);
    }

    @PutMapping
    @Operation(summary = "修改或新增菜单")
    public Menu save(@RequestBody MenuInput menu) {
        return menuService.save(menu);
    }
}
