package top.yangwulang.platform.services;

import top.yangwulang.platform.entity.message.MessageRecord;
import top.yangwulang.platform.repository.message.MessageRecordRepository;

import java.util.List;

/**
 * 消息记录服务层
 */
public interface MessageRecordService extends BaseService<MessageRecord, String, MessageRecordRepository> {
    /**
     * 将指定的消息记录id数据转成已读（当前用户下的未读消息记录）
     *
     * @param recordIds 消息记录ids
     */
    void readMessageBatch(List<String> recordIds);

    /**
     * 将指定的消息记录id数据转成已读（指定用户下的未读消息记录）
     *
     * @param userId    用户id
     * @param recordIds 消息记录ids
     */
    void readMessageBatch(String userId, List<String> recordIds);
}
