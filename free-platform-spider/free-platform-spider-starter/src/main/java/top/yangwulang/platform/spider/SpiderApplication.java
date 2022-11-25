package top.yangwulang.platform.spider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.yangwulang.platform.spider.pageprocess.oneqxs.OneQxsBookInfoPageProcessor;
import us.codecraft.webmagic.Spider;

@SpringBootApplication
public class SpiderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiderApplication.class, args);
    }

}
