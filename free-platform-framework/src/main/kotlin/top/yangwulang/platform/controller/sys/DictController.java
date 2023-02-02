package top.yangwulang.platform.controller.sys;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import top.yangwulang.platform.entity.PageHttpRequest;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeFetcher;
import top.yangwulang.platform.entity.sys.input.DictTypeInput;
import top.yangwulang.platform.repository.sys.DictTypeRepository;

/**
 * @author yangwulang
 */
@RestController
@Tags(value = {
        @Tag(name = "系统模块"),
        @Tag(name = "字典管理"),
})
@RequestMapping("${adminPath}/sys/dict")
public class DictController {

    @Autowired
    private DictTypeRepository dictTypeRepository;

    private final DictTypeFetcher dictTypeFetcher = DictTypeFetcher.$
            .allTableFields();


    @GetMapping("/dictType/{id}")
    @Operation(summary = "获取字典数据")
    public DictType getType(@PathVariable("id") String id) {
        return dictTypeRepository.findById(id).orElse(null);
    }

    @PostMapping("/dictType")
    @Operation(summary = "获取字典列表")
    public Page<DictType> listData(HttpServletRequest httpServletRequest, @RequestBody DictTypeInput dictTypeInput) {
        return dictTypeRepository.findAll(PageHttpRequest.of(httpServletRequest).toPage(), dictTypeFetcher, dictTypeInput);
    }

}
