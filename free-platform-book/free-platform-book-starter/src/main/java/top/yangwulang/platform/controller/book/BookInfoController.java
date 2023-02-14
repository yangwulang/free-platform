package top.yangwulang.platform.controller.book;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import top.yangwulang.platform.entity.PageHttpRequest;
import top.yangwulang.platform.entity.book.BookChapter;
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.entity.book.BookInfoFetcher;
import top.yangwulang.platform.entity.book.dto.BookInfoInput;
import top.yangwulang.platform.repository.book.BookInfoRepository;
import top.yangwulang.platform.services.book.impl.BookServiceImpl;

/**
 * @author yangwulang
 */
@Tags(value = {
        @Tag(name = "书籍模块"),
        @Tag(name = "书籍信息管理"),
})
@RestController
@RequestMapping("${adminPath}/book/info")
public class BookInfoController {

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    public BookInfoRepository bookInfoRepository;


    @PostMapping("/")
    public Page<BookInfo> listData(HttpServletRequest httpServletRequest, BookInfoInput bookInfoInput) {
        return bookInfoRepository.findAll(PageHttpRequest.of(httpServletRequest).toPage(), BookInfoFetcher.$.allScalarFields(), bookInfoInput);
    }

    @GetMapping("/{id}")
    @Operation(summary = "获取书籍信息")
    public BookInfo get(@PathVariable("id") String id) {
        return bookInfoRepository.findById(id).orElse(null);
    }

    @GetMapping("/parse")
    public Void test() {
        bookService.parse();
        return null;
    }

    @PostMapping("/asyncChapter")
    public Void asyncChapter(@RequestBody BookInfo bookInfo) {
        bookService.spiderChapter(bookInfo);
        return null;
    }

    @PostMapping("/spiderContent")
    @Operation(summary = "同步书籍信息")
    public Void spiderContent(@RequestBody BookChapter chapter) {
        bookService.spiderContent(chapter);
        return null;
    }

}
