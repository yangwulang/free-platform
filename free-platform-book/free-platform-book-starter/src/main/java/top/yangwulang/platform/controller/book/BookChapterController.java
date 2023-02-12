package top.yangwulang.platform.controller.book;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yangwulang.platform.entity.PageHttpRequest;
import top.yangwulang.platform.entity.book.BookChapter;
import top.yangwulang.platform.entity.book.BookChapterFetcher;
import top.yangwulang.platform.entity.book.dto.BookChapterInput;
import top.yangwulang.platform.repository.book.BookChapterRepository;

/**
 * @author yangwulang
 */
@Tags(value = {
        @Tag(name = "书籍模块"),
        @Tag(name = "书籍章节管理"),
})
@RestController
@RequestMapping("${adminPath}/book/info")
public class BookChapterController {
    @Autowired
    private BookChapterRepository bookChapterRepository;



    @Operation(summary = "获取书籍章节列表书籍")
    @PostMapping("/")
    public Page<BookChapter> listData(HttpServletRequest httpServletRequest, @RequestBody BookChapterInput chapter) {
        return bookChapterRepository.findAll(PageHttpRequest.of(httpServletRequest).toPage(), BookChapterFetcher.$.allScalarFields(), chapter);
    }

}
