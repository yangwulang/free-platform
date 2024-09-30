package top.yangwulang.platform.entity.message;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserTable;

@GeneratedBy(
        type = MessageRecordUser.class
)
public class MessageRecordUserFetcher extends AbstractTypedFetcher<MessageRecordUser, MessageRecordUserFetcher> {
    public static final MessageRecordUserFetcher $ = new MessageRecordUserFetcher(null);

    private MessageRecordUserFetcher(FetcherImpl<MessageRecordUser> base) {
        super(MessageRecordUser.class, base);
    }

    private MessageRecordUserFetcher(MessageRecordUserFetcher prev, ImmutableProp prop,
            boolean negative, IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private MessageRecordUserFetcher(MessageRecordUserFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static MessageRecordUserFetcher $from(Fetcher<MessageRecordUser> base) {
        return base instanceof MessageRecordUserFetcher ? 
        	(MessageRecordUserFetcher)base : 
        	new MessageRecordUserFetcher((FetcherImpl<MessageRecordUser>)base);
    }

    @NewChain
    public MessageRecordUserFetcher record() {
        return add("record");
    }

    @NewChain
    public MessageRecordUserFetcher record(boolean enabled) {
        return enabled ? add("record") : remove("record");
    }

    @NewChain
    public MessageRecordUserFetcher record(Fetcher<MessageRecord> childFetcher) {
        return add("record", childFetcher);
    }

    @NewChain
    public MessageRecordUserFetcher record(Fetcher<MessageRecord> childFetcher,
            Consumer<FieldConfig<MessageRecord, MessageRecordTable>> fieldConfig) {
        return add("record", childFetcher, fieldConfig);
    }

    @NewChain
    public MessageRecordUserFetcher record(IdOnlyFetchType idOnlyFetchType) {
        return add("record", idOnlyFetchType);
    }

    @NewChain
    public MessageRecordUserFetcher user() {
        return add("user");
    }

    @NewChain
    public MessageRecordUserFetcher user(boolean enabled) {
        return enabled ? add("user") : remove("user");
    }

    @NewChain
    public MessageRecordUserFetcher user(Fetcher<User> childFetcher) {
        return add("user", childFetcher);
    }

    @NewChain
    public MessageRecordUserFetcher user(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("user", childFetcher, fieldConfig);
    }

    @NewChain
    public MessageRecordUserFetcher user(IdOnlyFetchType idOnlyFetchType) {
        return add("user", idOnlyFetchType);
    }

    @NewChain
    public MessageRecordUserFetcher readStatus() {
        return add("readStatus");
    }

    @NewChain
    public MessageRecordUserFetcher readStatus(boolean enabled) {
        return enabled ? add("readStatus") : remove("readStatus");
    }

    @Override
    protected MessageRecordUserFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new MessageRecordUserFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected MessageRecordUserFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new MessageRecordUserFetcher(this, prop, fieldConfig);
    }
}
