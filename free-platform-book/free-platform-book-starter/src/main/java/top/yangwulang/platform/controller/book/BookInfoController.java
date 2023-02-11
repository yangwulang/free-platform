package top.yangwulang.platform.controller.book;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.yangwulang.platform.entity.book.BookChapter;
import top.yangwulang.platform.entity.book.BookInfo;
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


    @GetMapping("/")
    public Void test() {
        bookService.parse();
        return null;
    }

    @PostMapping("/g")
    public Void getsd(@RequestBody BookInfo bookInfo) {
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
