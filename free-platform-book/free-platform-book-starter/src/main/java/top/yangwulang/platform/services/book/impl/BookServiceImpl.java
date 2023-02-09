package top.yangwulang.platform.services.book.impl;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
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
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.exception.ServiceException;
import top.yangwulang.platform.factory.book.AbstractSuccessCallback;
import top.yangwulang.platform.factory.book.OneQxsBookFactory;
import top.yangwulang.platform.repository.book.BookChapterRepository;
import top.yangwulang.platform.repository.book.BookInfoRepository;
import top.yangwulang.platform.services.book.BookInfoService;

import java.io.IOException;


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

    public void parse() {
        Call call = oneQxsBookFactory.getClient().newCall(
                oneQxsBookFactory.getBaseRequestBuild().url("https://www.1qxs.com/all/0_0_2_0_0_1.html").get().build()
        );
        Observable.create((ObservableOnSubscribe<String>) emitter -> {
                    call.enqueue(new AbstractSuccessCallback() {
                        @Override
                        public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                            ResponseBody body = response.body();
                            if (body == null) {
                                throw new ServiceException("请求内容为null");
                            }
                            emitter.onNext(body.string());
                            emitter.onComplete();
                        }
                    });
                })
                .observeOn(new IoScheduler())
                .flatMap((Function<String, ObservableSource<BookInfo>>) oneQxsBookFactory::parseBookInfo)
                .doOnError(throwable -> logger.error("Observable 中发生异常", throwable))
                .subscribe(bookInfo -> bookInfoRepository.save(bookInfo));
        /*if (!elasticsearchClient.indices().exists(r -> r.index(INDEX_NAME)).value()) {
            elasticsearchClient.indices().create(r -> r.index(INDEX_NAME));
        }
        IndexResponse index = elasticsearchClient.index(r -> r.index(INDEX_NAME).document(bookInfo));
        logger.info("== response: {}, responseStatus: {}", index, index.result());*/

    }
}
