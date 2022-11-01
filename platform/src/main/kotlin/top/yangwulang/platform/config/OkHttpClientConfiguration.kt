package top.yangwulang.platform.config

import okhttp3.OkHttpClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OkHttpClientConfiguration {

    /**
     * 注入okhttp的client，全局
     */
    @Bean
    fun okhttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

}