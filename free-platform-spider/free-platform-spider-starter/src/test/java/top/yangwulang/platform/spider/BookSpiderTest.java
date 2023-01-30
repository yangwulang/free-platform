package top.yangwulang.platform.spider;

import com.alibaba.druid.pool.DruidDataSource;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import org.babyfish.jimmer.sql.JSqlClient;
import org.babyfish.jimmer.sql.ast.mutation.SimpleSaveResult;
import org.babyfish.jimmer.sql.runtime.ConnectionManager;
import org.babyfish.jimmer.sql.runtime.DefaultExecutor;
import org.babyfish.jimmer.sql.runtime.Executor;
import top.yangwulang.platform.entity.book.*;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataTable;
import top.yangwulang.platform.utils.SnowflakeKey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookSpiderTest {

    public static void main(String[] args) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/jeesite?serverTimezone=UTC");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("tq26556570");
        JSqlClient jSqlClient = JSqlClient.newBuilder()
                .setConnectionManager(ConnectionManager.simpleConnectionManager(druidDataSource))
                .setIdGenerator(SnowflakeKey.INSTANCE)
                .setExecutor(Executor.log(DefaultExecutor.INSTANCE))
                .build();
        List<BookInfo> execute = jSqlClient.createQuery(BookInfoTable.$).select(BookInfoTable.$).execute();
        System.out.println(execute);


        List<DictData> dictDatas = jSqlClient.createQuery(DictDataTable.$).select(DictDataTable.$).execute();
        System.out.println(dictDatas);

        Observable.create((@NonNull ObservableEmitter<SimpleSaveResult<BookInfo>> emitter) -> {
                    SimpleSaveResult<BookInfo> result = jSqlClient.getEntities().save(
                            BookInfoDraft.$.produce(info -> info.setBookFrom("sdaf")
                                    .setId(SnowflakeKey.INSTANCE.generate(BookInfo.class))
                                    .setBookName("sadf")
                                    .setStatus("0")
                                    .setAuthor("tyi"))
                    );
                    emitter.onNext(result);
                })
                .flatMap((Function<SimpleSaveResult<BookInfo>, ObservableSource<SimpleSaveResult<BookChapter>>>) bookInfoSimpleSaveResult -> {
                    SimpleSaveResult<BookChapter> result = jSqlClient.getEntities().save(BookChapterDraft.$.produce(chatper -> {
                        chatper.setId(SnowflakeKey.INSTANCE.generate(BookInfo.class))
                                .setChapterTitle("gtrft")
                                .setBook(bookInfoSimpleSaveResult.getModifiedEntity());
                    }));
                    return observer -> observer.onNext(result);
                })
                .subscribe(bookChapterSimpleSaveResult -> System.out.println(bookChapterSimpleSaveResult.getModifiedEntity()))
                .dispose();

        /*jSqlClient.getEntities().save(
                BookChapterDraft.$.produce(chatper -> {
                    chatper.setId(SnowflakeKey.INSTANCE.generate(BookInfo.class))
                            .setChapterTitle("gtrft")
                            .setBook(BookInfoDraft.$.produce(info -> info.setBookFrom("sdaf")
                                    .setId(SnowflakeKey.INSTANCE.generate(BookInfo.class))
                                    .setBookName("sadf")
                                    .setStatus("0")
                                    .setAuthor("tyi")
                            ));
                }), true
        );*/

    }

}
