package top.yangwulang.platform.spider;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author yangwulang
 */
public class VideoSpiderTest {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient.Builder().build();
        Request request = new Request.Builder()
                .url("https://ycge15.xyz/play/id/1085757.html")
                .get()
                .build();
        try (Response execute = client.newCall(request).execute()){
            Document parse = Jsoup.parse(execute.body().string());
            System.out.println(parse.select("script").get(4));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
