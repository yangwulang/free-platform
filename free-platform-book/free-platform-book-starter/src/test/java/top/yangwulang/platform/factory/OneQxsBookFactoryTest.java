package top.yangwulang.platform.factory;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.factory.book.OneQxsBookFactory;

import java.io.IOException;

public class OneQxsBookFactoryTest {
    public static void main(String[] args) {
        OneQxsBookFactory oneQxsBookFactory = new OneQxsBookFactory();
        Call call = oneQxsBookFactory.client.newCall(
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
        });

    }
}
