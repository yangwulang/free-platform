package top.yangwulang.platform.controller.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.services.book.impl.BookServiceImpl;

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

}
