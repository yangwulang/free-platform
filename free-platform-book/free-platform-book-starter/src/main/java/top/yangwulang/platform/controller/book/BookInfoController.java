package top.yangwulang.platform.controller.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
