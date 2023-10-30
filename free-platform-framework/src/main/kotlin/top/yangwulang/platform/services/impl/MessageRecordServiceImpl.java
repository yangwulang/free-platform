package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.yangwulang.platform.entity.message.MessageRecord;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.repository.message.MessageRecordRepository;
import top.yangwulang.platform.services.MessageRecordService;
import top.yangwulang.platform.utils.UserUtils;

import java.util.HashMap;
import java.util.List;

/**
 * @author yangwulang
 */
@Service
public class MessageRecordServiceImpl
        extends BaseServiceImpl<MessageRecord, String, MessageRecordRepository>
        implements MessageRecordService {


    protected MessageRecordServiceImpl(@Autowired MessageRecordRepository repository, @Autowired JdbcTemplate jdbcTemplate) {
        super(repository, jdbcTemplate);
    }


    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void readMessageBatch(List<String> recordIds) {
        User currentUser = UserUtils.getCurrentUser();
        this.readMessageBatch(currentUser.userCode(), recordIds);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void readMessageBatch(String userId, List<String> recordIds) {
        // TODO: 由于jimmer不支持操作中间表的非关联字段，此处只能另外使用例如jdbcTemplate工具进行操作
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
        template.update(
                """
                update sys_message_record_user set is_read = :isRead where user_id = :userId and record_id in (:recordIds)
                """,
                new HashMap<>() {{
                    put("isRead", MessageRecord.IS_READ_READ);
                    put("userId", userId);
                    put("recordIds", recordIds);
                }}
        );
    }
}
