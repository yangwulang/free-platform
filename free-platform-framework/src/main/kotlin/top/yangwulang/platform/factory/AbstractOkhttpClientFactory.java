package top.yangwulang.platform.factory;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractOkhttpClientFactory {
    protected final OkHttpClient client;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected final Request.Builder baseRequestBuild;

    public AbstractOkhttpClientFactory() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        configClient(builder);
        client = builder.build();

        baseRequestBuild = new Request.Builder();
        configRequestBuild(baseRequestBuild);
    }

    protected void configRequestBuild(Request.Builder baseRequestBuild) {
        baseRequestBuild.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36 Edg/109.0.1518.70");
    }

    protected void configClient(OkHttpClient.Builder builder) {
    }
}
