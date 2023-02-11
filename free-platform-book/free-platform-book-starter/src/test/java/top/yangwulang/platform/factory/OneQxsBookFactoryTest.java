package top.yangwulang.platform.factory;

import io.reactivex.rxjava3.functions.Consumer;
import kotlin.text.Regex;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.book.BookChapter;
import top.yangwulang.platform.entity.book.BookInfoDraft;
import top.yangwulang.platform.factory.book.OneQxsBookFactory;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

public class OneQxsBookFactoryTest {
    public static void main(String[] args) {

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
