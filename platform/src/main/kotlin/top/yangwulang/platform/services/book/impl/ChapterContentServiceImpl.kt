package top.yangwulang.platform.services.book.impl

import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import okhttp3.*
import okio.IOException
import org.dom4j.Node
import org.jsoup.select.NodeFilter
import org.jsoup.Jsoup
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.Modifying
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import top.yangwulang.platform.entity.book.ChapterContent
import top.yangwulang.platform.exception.ServiceException
import top.yangwulang.platform.repository.book.ChapterContentRepository
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.book.BookChapterService
import top.yangwulang.platform.services.book.ChapterContentService
import java.lang.StringBuilder
import java.util.concurrent.CompletableFuture
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Service
class ChapterContentServiceImpl :
    BaseServiceImpl<ChapterContent, String, ChapterContent, ChapterContentRepository>(),
    ChapterContentService {

    @Autowired
    private lateinit var bookChapterService: BookChapterService

    @Autowired
    private lateinit var okHttpClient: OkHttpClient

    override fun where(
        dto: ChapterContent,
        root: Root<ChapterContent>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {
        TODO("Not yet implemented")
    }

    override fun findByChapterId(chapterId: String): ChapterContent? {
        return repository.findByChapterId(chapterId)
    }

    @Modifying
    @Transactional
    override fun syncRemoteByChapterId(chapterId: String) {
        if (!bookChapterService.existsById(chapterId)) {
            throw ServiceException("章节信息不存在，id $chapterId")
        }
        val bookChapter = bookChapterService.findById(chapterId)
        val fromPath = bookChapter!!.fromPath ?: throw ServiceException("暂未获取到章节地址，请联系管理员")
        var chapterContent = repository.findByChapterId(chapterId)
        if (chapterContent == null) {
            chapterContent = ChapterContent()
            chapterContent.chapter = bookChapter
        }
        val contents = requestRemote(fromPath)
        chapterContent.chapterContent = contents
        this.save(chapterContent)
    }

    protected fun requestRemote(fromPath: String): String {
        return runBlocking {
            val job = async {
                val request = Request.Builder().url(fromPath).get().build()
                val response: Response = okHttpClient.newCall(request).execute()
                val dom = Jsoup.parse(response.body!!.string())
                val totalPage = dom.body().attr("tpg").toInt()
                val id = dom.body().attr("id")
                val cid = dom.body().attr("cid")
                val pages = ArrayList<String>()
                for (index in 1..totalPage) {
                    pages.add("https://www.1qxs.com/xs/$id/$cid/$index.html")
                }
                return@async pages
            }
            val contents = StringBuilder()
            val pages = job.await()
            var index = 1
            pages.forEach {
                val s = async {
                    val request = Request.Builder().url(it).get().build()
                    val response: Response = okHttpClient.newCall(request).execute()
                    val dom = Jsoup.parse(response.body!!.string())
                    val contentPlv = dom.body().select(".main>.wrap>.read>.content>p")
                    contentPlv.removeIf { e ->
                        e.text().contains("本章未完，点击") || e.text().contains("小说免费阅读")
                    }
                    contentPlv.forEach { e ->
                        e.attr("id", "$index")
                        index++
                        contents.append(e)
                    }
                }
                s.await()
            }
            logger.info("章节内容链接 {}", pages)
            return@runBlocking contents.toString()
        }
    }


    override fun save(dto: ChapterContent): ChapterContent {
        return repository.save(dto)
    }
}