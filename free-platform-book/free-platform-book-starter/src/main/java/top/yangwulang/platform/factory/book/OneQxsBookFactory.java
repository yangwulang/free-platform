package top.yangwulang.platform.factory.book;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.schedulers.ComputationScheduler;
import io.reactivex.rxjava3.internal.schedulers.IoScheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.text.Regex;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import top.yangwulang.platform.entity.book.*;
import top.yangwulang.platform.exception.ServiceException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class OneQxsBookFactory extends AbstractBookFactory {
    public static final String WEB_SITE = "https://www.1qxs.com";

    private final Pattern mathEndHtmlPattern = Pattern.compile("(\\d).html");

    /**
     * 解析html中的书籍信息，返回一个{@link Observable<BookInfo>}对象，此对象是rxjava的发布对象，
     * 可以添加一个监听对象对其进行监听
     *
     * @param html 书籍列表页
     * @return rxjava的发布对象
     */
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
                    final BookInfo info = bookInfo;
                    return Observable.create(emitter -> {
                        Request request = super.baseRequestBuild.get().url(info.bookFrom()).build();
                        OneQxsBookFactory.super.client.newCall(request).enqueue(new AbstractSuccessCallback() {
                            @Override
                            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                                ResponseBody body = response.body();
                                assert body != null;
                                String html1 = body.string();
                                String description = Jsoup.parse(html1)
                                        .select("body > div.main > div.bookinfo > div.desc.panel > div.description")
                                        .html();
                                emitter.onNext(BookInfoDraft.$.produce(info, draft -> draft.setDescribe(description)));
                            }
                        });
                    });
                });
    }

    /**
     * 从书籍信息中解析出这本书的所有章节信息，并返回所有章节信息，通过书籍信息中的 bookFrom 字段进行请求获取书籍。
     *
     * @param bookInfo 书籍信息
     * @return 所有章节信息
     */
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

    /**
     * 解析章节信息中的所有小说章节内容，1qxs中将一章拆分成了几段，需要将这几段进行拼合
     *
     * @param chapter 章节信息
     * @return 章节内容
     */
    public Observable<ChapterContent> parseChapterContent(BookChapter chapter) {
        return Observable
                .create((ObservableEmitter<Map<String, Object>> emitter) -> {
                    Request request = super.baseRequestBuild.get().url(chapter.fromPath()).build();
                    super.client.newCall(request).enqueue(new AbstractSuccessCallback() {
                        @Override
                        public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                            ResponseBody body = response.body();
                            assert body != null : "请求 url " + call.request().url() + " 获得的内容为 null";
                            Elements bodyElements = Jsoup.parse(body.string()).select("body");
                            Map<String, Object> map = new HashMap<>();
                            map.put("currentPageIndex", Integer.parseInt(bodyElements.attr("pg")));
                            map.put("totalPage", Integer.parseInt(bodyElements.attr("tpg")));
                            Elements select = bodyElements.select("div.main > div > div.read > div.content > p");
                            select.removeIf(e -> e.text().contains("未完") || e.text().contains("一七小说"));
                            map.put("body_1", select.html());
                            emitter.onNext(map);
                            emitter.onComplete();
                        }
                    });
                })
                .observeOn(new IoScheduler())
                .flatMap((Function<Map<String, Object>, ObservableSource<Map<String, Object>>>) map ->
                        Observable.create((ObservableOnSubscribe<Map<String, Object>>) emitter -> {
                            Integer currentPageIndex = (Integer) map.get("currentPageIndex");
                            Integer totalPage = (Integer) map.get("totalPage");
                            Regex regex = new Regex(mathEndHtmlPattern);
                            CountDownLatch countDownLatch = new CountDownLatch(totalPage - currentPageIndex);
                            for (Integer i = currentPageIndex; i <= totalPage; i++) {
                                if (i == 1) {
                                    // 如果是第一页，则不对这一页进行请求，应为在上面那个发射器已经读取过一次第一页的内容
                                    continue;
                                }
                                // 这里睡眠0.8s是防止请求太快导致对方服务器502，此处应该能通过代理的ip地址池进行绕过
                                Thread.sleep(800);
                                Request request = super.baseRequestBuild.get()
                                        .url(regex.replace(chapter.fromPath(), "$1/" + i + ".html"))
                                        .build();
                                super.client.newCall(request).enqueue(new ParamSuccessCallback<>(new int[]{i, totalPage}) {
                                    @Override
                                    public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                                        ResponseBody body = response.body();
                                        assert body != null : "请求 url " + call.request().url() + " 获得的内容为 null";
                                        Elements bodyElements = Jsoup.parse(body.string()).select("body");
                                        Elements select = bodyElements.select("div.main > div > div.read > div.content > p");
                                        select.removeIf(e -> e.text().contains("未完") || e.text().contains("一七小说"));
                                        map.put("body_" + getParam()[0], select.html());
                                        countDownLatch.countDown();
                                        // 如果当前页和总页相等，则表示到达最后页面，然后进行发射
                                        // TODO: 此处极端情况下会有线程BUG，例如有 2、3、4页需要请求 2请求送后睡了0.8s 再发送3的请求再次睡0.8s发送4的请求
                                        //  但是当网络出现抖动时，2和4已经完成，3还在请求中，4已经是结尾了，通过了这个if，所以当3请求完成后这时把书籍内容存放在
                                        //  map中已经晚了，4的结尾页已经发射这个信号，并将这个信号已经保存了，这个BUG只在极端情况下发生，要想彻底去除这个BUG，只能损失
                                        //  性能，每请求完成一次存一次map，并将这个map发射到下一个Observable中，或者用CountdownLatch进行计数，计数的代码写的不太优雅。
                                        /*if (getParam()[0] == getParam()[1]) {
                                            emitter.onNext(map);
                                        }*/
                                    }
                                });
                            }
                            countDownLatch.await();
                            emitter.onNext(map);
                        })
                )
                .observeOn(new ComputationScheduler())
                .flatMap((Function<Map<String, Object>, ObservableSource<ChapterContent>>) map ->
                        Observable.just(
                                ChapterContentDraft.$.produce(content -> {
                                    List<String> bodys = map.keySet()
                                            .stream()
                                            .filter(k -> k.startsWith("body_"))
                                            .sorted((o1, o2) -> {
                                                int one = Integer.parseInt(o1.split("_")[1]);
                                                int two = Integer.parseInt(o2.split("_")[1]);
                                                return one - two;
                                            }).toList();
                                    // 根据body_1 body_2的后缀从小到大排序
                                    StringBuilder builder = new StringBuilder();
                                    for (String body : bodys) {
                                        builder.append(map.get(body));
                                    }
                                    content.setChapter(c -> c.setId(chapter.id()))
                                            .setChapterContent(builder.toString());
                                })
                        )
                );
    }


}
