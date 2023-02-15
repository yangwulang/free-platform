package top.yangwulang.platform.services.book.impl;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.BoolQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.HighlightField;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.schedulers.IoScheduler;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.yangwulang.platform.entity.book.BookChapter;
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.entity.book.dto.BookInfoInput;
import top.yangwulang.platform.exception.ServiceException;
import top.yangwulang.platform.factory.book.AbstractSuccessCallback;
import top.yangwulang.platform.factory.book.OneQxsBookFactory;
import top.yangwulang.platform.repository.book.BookCategoryRepository;
import top.yangwulang.platform.repository.book.BookChapterRepository;
import top.yangwulang.platform.repository.book.BookInfoRepository;
import top.yangwulang.platform.repository.book.ChapterContentRepository;
import top.yangwulang.platform.services.book.BookInfoService;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


/**
 * 书籍信息防腐层
 *
 * @author yangwulang
 */
@Service
public class BookServiceImpl implements BookInfoService {
    @Autowired
    private BookInfoRepository bookInfoRepository;

    @Autowired
    private BookChapterRepository bookChapterRepository;

    @Autowired
    private ElasticsearchClient elasticsearchClient;

    private final OneQxsBookFactory oneQxsBookFactory = new OneQxsBookFactory();

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final String INDEX_NAME = "book_info";
    @Autowired
    private BookCategoryRepository bookCategoryRepository;
    @Autowired
    private ChapterContentRepository chapterContentRepository;

    public List<BookInfoInput> findByEsAll(String searchInfo) {
        try {
            BoolQuery boolQuery = QueryBuilders.bool().should(
                            QueryBuilders.match(t -> t.field("bookName").query(searchInfo)),
                            QueryBuilders.match(t -> t.field("describe").query(searchInfo)),
                            QueryBuilders.match(t -> t.field("author").query(searchInfo))
                    )
                    .build();
            SearchResponse<Object> search = elasticsearchClient.search(s -> s.index(INDEX_NAME)
                            .query(q -> q.bool(boolQuery))
                            .highlight(h -> h.highlightQuery(q -> q.bool(boolQuery))
                                    //如果该属性中有多个关键字 则都高亮
                                    .requireFieldMatch(true)
                                    .fields("bookName", HighlightField.of(f -> f.preTags("<span style=\"color: red\">").postTags("</span>")))
                                    .fields("describe", HighlightField.of(f -> f.preTags("<span style=\"color: red\">").postTags("</span>")))
                                    .fields("author", HighlightField.of(f -> f.preTags("<span style=\"color: red\">").postTags("</span>")))
                            ),
                    Object.class
            );
            return search.hits().hits().stream().map(h -> {
                Map<String, List<String>> highlight = h.highlight();
                JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(h.source()));
                // 替换jsonObject中的高亮字段，jsonObject原本没有高亮，highlight是高亮集合
                highlight.forEach((k, v) -> {
                    String fieldValue = String.join("", v);
                    jsonObject.put(k, fieldValue);
                });
                jsonObject.put("id", h.id());
                return jsonObject.toJavaObject(BookInfoInput.class);
            }).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void parse() {
        Call call = oneQxsBookFactory.getClient().newCall(
                oneQxsBookFactory.getBaseRequestBuild().url("https://www.1qxs.com/all/0_0_2_0_0_1.html").get().build()
        );
        // TODO: 这里只针对第一页进行读取，没有读取所有条目
        Observable.create((ObservableOnSubscribe<String>) emitter -> call.enqueue(new AbstractSuccessCallback() {
                    @Override
                    public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                        ResponseBody body = response.body();
                        if (body == null) {
                            throw new ServiceException("请求内容为null");
                        }
                        emitter.onNext(body.string());
                        emitter.onComplete();
                    }
                }))
                .observeOn(new IoScheduler())
                .flatMap((Function<String, ObservableSource<BookInfo>>) oneQxsBookFactory::parseBookInfo)
                .doOnError(throwable -> logger.error("Observable 中发生异常", throwable))
                .flatMap(bookInfo -> Observable.just(bookInfoRepository.save(bookInfo)))
                .subscribe(bookInfo -> {
                    // 将书籍信息存入ElasticSearch中
                    if (!elasticsearchClient.indices().exists(r -> r.index(INDEX_NAME)).value()) {
                        elasticsearchClient.indices().create(r -> r.index(INDEX_NAME));
                    }
                    IndexResponse index = elasticsearchClient.index(r -> r.index(INDEX_NAME).document(bookInfo).id(bookInfo.id()));
                    logger.info("== response: {}, responseStatus: {}", index, index.result());
                });
    }

    @Transactional(rollbackFor = Exception.class)
    public void spiderChapter(BookInfo bookInfo) {
        BookInfo queryBook = bookInfoRepository.findById(bookInfo.id()).orElseThrow(() -> new ServiceException("未找到id为" + bookInfo.id() + "的书籍信息!"));
        oneQxsBookFactory.parseChapters(queryBook)
                .doOnError(Throwable::printStackTrace)
                .subscribe(bookChapters -> bookChapterRepository.saveAll(bookChapters));
    }

    @Transactional(rollbackFor = Exception.class)
    public void spiderContent(BookChapter bookChapter) {
        oneQxsBookFactory.parseChapterContent(bookChapter)
                .repeat()
                .doOnError(Throwable::printStackTrace)
                .doOnNext(content -> logger.info("获取到 {}", content))
                // TODO: 暂未接入FileUpload
                .subscribe(chapterContent -> chapterContentRepository.save(chapterContent));
    }
}
