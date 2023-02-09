package top.yangwulang.platform.factory.video;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.schedulers.IoScheduler;
import okhttp3.Request;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import top.yangwulang.platform.entity.video.VideoCategory;
import top.yangwulang.platform.entity.video.VideoCategoryDraft;
import top.yangwulang.platform.entity.video.VideoInfo;
import top.yangwulang.platform.entity.video.VideoInfoDraft;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author yangwulang
 */
public class YcgeVideoFactory extends AbstractVideoFactory {
    private final Pattern M3u8Pattern = Pattern.compile("http.*\\.m3u8");


    public List<VideoCategory> parseCategory(String html) {
        Document parse = Jsoup.parse(html);
        Elements select = parse.select("#youmu > div > dl > dd > a");
        return select.stream()
                .map(e ->
                        VideoCategoryDraft.$.produce(category -> category.setCategoryName(e.text()))
                )
                .collect(Collectors.toList());
    }

    public Observable<VideoInfo> parseVideoInfo(String html, String website) {
        return Observable.create((ObservableEmitter<VideoInfo> emitter) -> {
                    Document parse = Jsoup.parse(html);
                    Elements imageInfo = parse.select(
                            "body > div > div > div > div.container > div > div > div.detail.clearfix > div.detail-poster > a > img"
                    );
                    String imgPath = imageInfo.attr("src");
                    String title = imageInfo.attr("alt");
                    String href = parse.select("#detail-tab > li:nth-child(2) > a").attr("href");
                    emitter.onNext(
                            VideoInfoDraft.$.produce(info ->
                                    info.setPlayUrl(website + href)
                                            .setImgSrc(imgPath)
                                            .setDesc(title)
                            )
                    );
                    emitter.onComplete();
                })
                .observeOn(new IoScheduler())
                .flatMap((Function<VideoInfo, ObservableSource<VideoInfo>>) videoInfo ->
                        observer -> VideoInfoDraft.$.produce(videoInfo, info -> {
                            Request request = new Request.Builder().url(videoInfo.playUrl()).get().build();
                            try (Response body = super.client.newCall(request).execute()) {
                                String m3u8 = "";
                                Document parse = Jsoup.parse(body.body().string());
                                String script = parse.select("script").get(4).html();
                                Matcher matcher = M3u8Pattern.matcher(script);
                                while (matcher.find()) {
                                    m3u8 = matcher.group();
                                }
                                info.setPath(m3u8);
                            } catch (IOException e) {
                                observer.onError(e);
                            }
                        })
                );
    }

}
