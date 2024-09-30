package top.yangwulang.platform.controller.message

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import lombok.extern.slf4j.Slf4j
import org.babyfish.jimmer.sql.ast.Predicate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import top.yangwulang.platform.entity.message.MessageRecord
import top.yangwulang.platform.entity.message.MessageRecordTable
import top.yangwulang.platform.entity.message.dto.MessageRecordListView
import top.yangwulang.platform.entity.message.input.BatchReadMessageRecordInput
import top.yangwulang.platform.services.MessageRecordService
import top.yangwulang.platform.utils.UserUtils

/**
 * @author yangwulang
 */
@Tags(Tag(name = "消息管理"), Tag(name = "消息记录"))
@Slf4j
@RestController
@RequestMapping("\${adminPath}/message")
class MessageRecordController {
    @Autowired
    lateinit var messageRecordService: MessageRecordService

    @PostMapping("/list")
    @Operation(summary = "获取当前用户消息")
    fun getCurrentUserMessageRecord(): List<MessageRecordListView> {
        val user = UserUtils.getCurrentUser()
        val table = MessageRecordTable.`$`
        // 查询当前用户下未读的消息
        return messageRecordService.repository().sql()
            .createQuery(table)
            .where(
                Predicate.and(
                    table.asTableEx().targetUsers().userCode().eq(user.userCode()),
                    table.asTableEx().messageRecordUsers().readStatus().eq(MessageRecord.IS_READ_UN_READ)
                )
            )
            .select(table.fetch(MessageRecordListView::class.java))
            .execute()
    }

    @Operation(summary = "已读当前用户指定的消息")
    @PostMapping("/read")
    fun readMessageRecord(@RequestBody @Validated readMessageRecordInput: BatchReadMessageRecordInput) {
        messageRecordService.readMessageBatch(readMessageRecordInput.recordIds)
    }
}
