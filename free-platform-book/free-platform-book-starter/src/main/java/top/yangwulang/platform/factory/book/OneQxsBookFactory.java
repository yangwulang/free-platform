package top.yangwulang.platform.factory.book;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.entity.book.BookInfoDraft;

public class OneQxsBookFactory extends AbstractBookFactory {
    public static final String WEB_SITE = "https://www.1qxs.com";

    public Observable<BookInfo> parseBookInfo(String html) {
        return Observable
                .create((ObservableEmitter<Element> emitter) -> {
                    Document parse = Jsoup.parse(html);
                    Elements bookInfoDom = parse.select("body > div.main > div.list > ul > li");
                    for (Element element : bookInfoDom) {
//                        super.logger.debug("解析 bookInfo li >>> {}", element);
                        emitter.onNext(element);
                    }
                    emitter.onComplete();
                })
                .flatMap((Function<Element, ObservableSource<BookInfo>>) element -> {
                    Elements imageA = element.select("div.image > a");
                    Elements img = imageA.select("img");
                    String author = element.select("div.book > div.tags > div.author.line_1").text();
                    Elements msgDom = element.select("div.book > div.tags > div.msg");
                    BookInfo bookInfo = BookInfoDraft.$.produce(book -> {
                        book.setBookImgPath(WEB_SITE + img.attr("data-original"));
                        book.setBookName(img.attr("alt"));
                        book.setBookFrom(WEB_SITE + imageA.attr("href"));
                        book.setAuthor(author);
                        book.setStatus(msgDom.select("span.serial").text());
                        book.setCategory(msgDom.select("span.type").text());
                    });
                    super.logger.debug("第一步解析 bookInfo 的信息 >>> {}", bookInfo);
                    return observer -> observer.onNext(bookInfo);
                })
                .subscribeOn(Schedulers.io())
                .flatMap((Function<BookInfo, ObservableSource<BookInfo>>) bookInfo -> {
                    super.logger.info("开始第二部解析");
                    Request request = super.baseRequestBuild
                            .get()
                            .url(bookInfo.bookFrom())
                            .build();
                    try (Response execute = OneQxsBookFactory.super.client.newCall(request).execute()) {
                        ResponseBody body = execute.body();
                        assert body != null;
                        String html1 = body.string();
                        String description = Jsoup.parse(html1)
                                .select("body > div.main > div.bookinfo > div.desc.panel > div.description")
                                .html();
                        bookInfo = BookInfoDraft.$.produce(bookInfo, draft -> draft.setDescribe(description));
                    } catch (Exception e) {
                        return Observable.error(e);
                    }
                    return Observable.just(bookInfo);
                });
    }


}
