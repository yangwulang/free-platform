package top.yangwulang.platform.repository.message;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.message.MessageRecord;

@Repository
public interface MessageRecordRepository extends JRepository<MessageRecord, String> {

}
