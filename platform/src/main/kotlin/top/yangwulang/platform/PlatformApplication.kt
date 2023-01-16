package top.yangwulang.platform

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class PlatformApplication

fun main(args: Array<String>) {
    SpringApplication.run(PlatformApplication::class.java, *args)
}
