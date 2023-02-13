package top.yangwulang.platform.factory;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.text.Regex;
import okhttp3.Call;
import okhttp3.Callback;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.http.GET;
import retrofit2.http.Url;
import top.yangwulang.platform.entity.book.BookChapter;
import top.yangwulang.platform.entity.book.BookInfoDraft;
import top.yangwulang.platform.factory.book.OneQxsBookFactory;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

public class OneQxsBookFactoryTest {

    interface TN {

        @GET
        Observable<Response<String>> g(@Url String url);
    }

    public static void main(String[] args) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://www.baidu.com")
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create()).build();
        TN tn = retrofit.create(TN.class);
        Observable<Response<String>> g = tn.g("/");
        g.subscribe(s -> {
            System.out.println(s.body());
        });
        Regex regex = new Regex(Pattern.compile("(\\d).html"));
        String replace = regex.replace("https://www.1qxs.com/xs/228.html", "$1/1.html");
        System.out.println(replace);

       /* OneQxsBookFactory oneQxsBookFactory = new OneQxsBookFactory();

        oneQxsBookFactory
                .parseChapters(BookInfoDraft.$.produce(b -> b.setBookFrom("https://www.1qxs.com/xs/228.html")))
                .doOnError(Throwable::printStackTrace)
                .subscribe(new Consumer<List<BookChapter>>() {
                    @Override
                    public void accept(List<BookChapter> bookChapters) throws Throwable {
                        System.out.println(bookChapters);
                    }
                });
*/
        /*Call call = oneQxsBookFactory.client.newCall(
                oneQxsBookFactory.baseRequestBuild.url("https://www.1qxs.com/all/0_0_2_0_0_1.html").get() .build()
        );
        System.out.println("--------------启动");
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String string = response.body().string();
                System.out.println("--------------请求完成 ");
                oneQxsBookFactory.parseBookInfo(string)
                        .doOnError(Throwable::printStackTrace)
                        .subscribe(bookInfo -> {
                            System.out.println(bookInfo);
                        });
            }
        });*/



    }
}
