package top.yangwulang.platform.services.book

import top.yangwulang.platform.entity.book.ChapterContent
import top.yangwulang.platform.services.QueryService
import top.yangwulang.platform.services.UpdateService

interface ChapterContentService :
    QueryService<ChapterContent, String, ChapterContent>,
    UpdateService<ChapterContent, String, ChapterContent> {

    fun findByChapterId(chapterId : String) : ChapterContent?

    fun syncRemoteByChapterId(chapterId: String)


}