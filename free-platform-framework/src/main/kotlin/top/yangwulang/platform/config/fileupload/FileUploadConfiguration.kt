package top.yangwulang.platform.config.fileupload

import io.minio.MinioClient
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import top.yangwulang.platform.services.OssFileUploadService
import top.yangwulang.platform.services.impl.LocalFileUploadServiceImpl
import top.yangwulang.platform.services.impl.MinioClientOption
import top.yangwulang.platform.services.impl.MinioFileUploadServiceImpl
import top.yangwulang.platform.utils.PropertiesUtils

@Configuration
@EnableConfigurationProperties(FileUploadProperties::class)
open class FileUploadConfiguration {

    @Autowired
    private lateinit var fileUploadProperties: FileUploadProperties;


/*    @Bean
    @ConditionalOnMissingBean
    open fun fileUploadServiceImpl(
        repository: FileUploadRepository,
        fileEntityService: FileEntityService,
        ossFileUploadService: OssFileUploadService
    ): FileUploadService {
        return FileUploadServiceImpl(repository, ossFileUploadService,fileEntityService, fileUploadProperties)
    }*/

    @Bean
    @ConditionalOnMissingBean
    open fun ossFileUploadService(): OssFileUploadService {
        PropertiesUtils.getInstance();
/*        MinioClientOption(
            MinioClient.Builder()
                .endpoint("http://120.48.57.68:9000")
                .credentials("zSyivC57Bb3gEOo1", "fhBGjV3JhRGiFdl25JScH4puzMnz5zKE")
                .build()
        )*/
        return when(fileUploadProperties.mode!!) {
            FileUploadMode.AUTO -> buildAutoFileUploadService()
            FileUploadMode.LOCAL -> buildLocalFileUploadService()
            FileUploadMode.OSS -> buildMinioFileUploadService()
        }
    }

    private fun buildAutoFileUploadService() : OssFileUploadService {
        return if (fileUploadProperties.url.toHttpUrlOrNull() == null) {
            buildLocalFileUploadService()
        } else{
            buildMinioFileUploadService()
        }
    }

    private fun buildLocalFileUploadService() : OssFileUploadService {
        return LocalFileUploadServiceImpl(fileUploadProperties)
    }

    private fun buildMinioFileUploadService() : OssFileUploadService {
        val option = MinioClientOption(
            MinioClient.Builder()
                .endpoint(fileUploadProperties.url)
                .credentials(fileUploadProperties.accessKey, fileUploadProperties.secretKey)
                .build()
        )
        return MinioFileUploadServiceImpl(option)
    }

}