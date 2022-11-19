package top.yangwulang.platform.config

import okhttp3.OkHttpClient
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.io.IOException
import java.net.*

@Configuration
class OkHttpClientConfiguration {
    val logger = LoggerFactory.getLogger(OkHttpClientConfiguration::class.java)!!

    /**
     * 注入okhttp的client，全局
     */
    @Bean
    fun okhttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor {
                val request = it.request().newBuilder()
                    .header(
                        "User-Agent",
                        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36 Edg/107.0.1418.42"
                    )
                    .header("Host", "www.1qxs.com")
                    .header(
                        "sec-ch-ua",
                        "\"Microsoft Edge\";v=\"107\", \"Chromium\";v=\"107\", \"Not=A?Brand\";v=\"24\""
                    )
                    .header(
                        "Accept",
                        "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"
                    )
                    .header("sec-ch-ua-platform", "\"Windows\"")
                    .header("Upgrade-Insecure-Requests", "1")
                    .header("Referer", "https://www.1qxs.com/")
                    .build()
                it.proceed(request)
            }
            /*.proxySelector(object : ProxySelector() {
                override fun select(uri: URI?): MutableList<Proxy> {
                    return arrayListOf(
                        Proxy(Proxy.Type.HTTP, InetSocketAddress("52.81.83.216", 	3128)),
                        Proxy(Proxy.Type.HTTP, InetSocketAddress("52.81.42.185", 	3128)),
                        Proxy(Proxy.Type.HTTP, InetSocketAddress("183.173.124.7", 	4780))
                    )
                }

                override fun connectFailed(uri: URI?, sa: SocketAddress?, ioe: IOException?) {
                    logger.error("连接失败 ${uri?.path} $sa", ioe)
                }

            })*/
            .build()
    }

}