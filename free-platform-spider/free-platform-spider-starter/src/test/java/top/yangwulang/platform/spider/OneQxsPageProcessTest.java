package top.yangwulang.platform.spider;

import org.junit.jupiter.api.Test;
import top.yangwulang.platform.spider.pageprocess.oneqxs.OneQxsBookInfoPageProcessor;
import us.codecraft.webmagic.Spider;

public class OneQxsPageProcessTest {

    @Test
    public void testSpider() {
        Spider.create(new OneQxsBookInfoPageProcessor())
                .addUrl("https://www.1qxs.com/")
                .thread(5)
                .run();
    }
}
