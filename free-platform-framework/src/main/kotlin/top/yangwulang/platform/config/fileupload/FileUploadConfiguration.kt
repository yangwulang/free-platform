package top.yangwulang.platform.config.fileupload

import io.minio.MinioClient
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import top.yangwulang.platform.services.FileUploadService
import top.yangwulang.platform.services.impl.MinioClientOption
import top.yangwulang.platform.services.impl.MinioFileUploadServiceImpl

@Configuration
@EnableConfigurationProperties(FileUploadProperties::class)
open class FileUploadConfiguration {

    @Bean
    @ConditionalOnMissingBean
    open fun fileUploadService(): FileUploadService {
        return MinioFileUploadServiceImpl(
            MinioClientOption(
                MinioClient.Builder()
                    .endpoint("http://127.0.0.1:9000")
                    .credentials("12345678", "12345678")
                    .build()
            )
        )
    }

}