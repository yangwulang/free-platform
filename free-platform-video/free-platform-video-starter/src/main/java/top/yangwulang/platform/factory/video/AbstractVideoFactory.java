package top.yangwulang.platform.factory.video;

import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractVideoFactory {
    protected final OkHttpClient client;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public AbstractVideoFactory() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        configClient(builder);
        client = builder.build();
    }

    protected void configClient(OkHttpClient.Builder builder) {

    }
}
