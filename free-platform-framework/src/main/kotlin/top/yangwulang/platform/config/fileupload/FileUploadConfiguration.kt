package top.yangwulang.platform.config.fileupload

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(FileUploadProperties::class)
open class FileUploadConfiguration {
}