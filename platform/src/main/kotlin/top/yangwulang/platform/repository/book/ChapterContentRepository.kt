package top.yangwulang.platform.repository.book;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import top.yangwulang.platform.entity.book.ChapterContent

interface ChapterContentRepository : JpaRepository<ChapterContent, String>, JpaSpecificationExecutor<ChapterContent> {
    fun findByChapterId(chapterId: String): ChapterContent?


    fun existsByChapterId(chapterId: String): Boolean
}