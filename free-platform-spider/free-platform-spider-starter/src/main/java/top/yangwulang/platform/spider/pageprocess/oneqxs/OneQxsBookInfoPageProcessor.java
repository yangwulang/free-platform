package top.yangwulang.platform.spider.pageprocess.oneqxs;

import org.jsoup.nodes.Document;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * 1qxs的书籍信息页面处理器
 *
 * @author yangwulang
 */
public class OneQxsBookInfoPageProcessor implements PageProcessor {
    private final Site site = Site.me()
            .setRetrySleepTime(2000)
            .setRetryTimes(2000);

    @Override
    public void process(Page page) {
        Document document = page.getHtml().getDocument();
    }

    @Override
    public Site getSite() {
        return site;
    }
}
