package top.yangwulang.platform.factory.book;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import top.yangwulang.platform.entity.book.BookChapter;
import top.yangwulang.platform.entity.book.BookChapterDraft;
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.entity.book.BookInfoDraft;
import top.yangwulang.platform.exception.ServiceException;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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


    public Observable<List<BookChapter>> parseChapters(BookInfo bookInfo) {
        String bookFrom = bookInfo.bookFrom();
        String realChapterUrl = bookFrom.replaceAll("/xs/", "/list/");
        return Observable
                .create((ObservableEmitter<String> emitter) -> {
                    Request request = super.baseRequestBuild.get().url(realChapterUrl).build();
                    super.client.newCall(request).enqueue(new AbstractSuccessCallback() {
                        @Override
                        public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                            ResponseBody body = response.body();
                            if (body == null) {
                                throw new ServiceException("请求获取的数据为 null url: " + call.request().url());
                            }
                            emitter.onNext(body.string());
                            emitter.onComplete();
                        }
                    });
                })
                .flatMap((Function<String, ObservableSource<List<BookChapter>>>) html -> {
                    Elements select = Jsoup.parse(html).select("body > div.main > div.catalog > div > ul > ul > li > a");
                    return Observable.just(
                            select.stream()
                                    .map(e ->
                                            BookChapterDraft.$.produce(b ->
                                                    b.setChapterTitle(e.text())
                                                            .setBook(BookInfoDraft.$.produce(info -> info.setId(bookInfo.id())))
                                                            .setFromPath(WEB_SITE + e.attr("href"))
                                            )
                                    )
                                    .collect(Collectors.toList())
                    );
                });
    }


}
