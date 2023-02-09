package top.yangwulang.platform.factory.book;

import okhttp3.Call;
import okhttp3.Callback;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public abstract class AbstractSuccessCallback implements Callback {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onFailure(@NotNull Call call, @NotNull IOException e) {
        logger.error("请求异常", e);
    }
}
