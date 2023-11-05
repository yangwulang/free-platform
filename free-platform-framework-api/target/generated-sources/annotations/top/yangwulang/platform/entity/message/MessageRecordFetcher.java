package top.yangwulang.platform.entity.message;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.ListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserTable;

@GeneratedBy(
        type = MessageRecord.class
)
public class MessageRecordFetcher extends AbstractTypedFetcher<MessageRecord, MessageRecordFetcher> {
    public static final MessageRecordFetcher $ = new MessageRecordFetcher(null);

    private MessageRecordFetcher(FetcherImpl<MessageRecord> base) {
        super(MessageRecord.class, base);
    }

    private MessageRecordFetcher(MessageRecordFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private MessageRecordFetcher(MessageRecordFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static MessageRecordFetcher $from(Fetcher<MessageRecord> base) {
        return base instanceof MessageRecordFetcher ? 
        	(MessageRecordFetcher)base : 
        	new MessageRecordFetcher((FetcherImpl<MessageRecord>)base);
    }

    @NewChain
    public MessageRecordFetcher status() {
        return add("status");
    }

    @NewChain
    public MessageRecordFetcher status(boolean enabled) {
        return enabled ? add("status") : remove("status");
    }

    @NewChain
    public MessageRecordFetcher type() {
        return add("type");
    }

    @NewChain
    public MessageRecordFetcher type(boolean enabled) {
        return enabled ? add("type") : remove("type");
    }

    @NewChain
    public MessageRecordFetcher title() {
        return add("title");
    }

    @NewChain
    public MessageRecordFetcher title(boolean enabled) {
        return enabled ? add("title") : remove("title");
    }

    @NewChain
    public MessageRecordFetcher subTitle() {
        return add("subTitle");
    }

    @NewChain
    public MessageRecordFetcher subTitle(boolean enabled) {
        return enabled ? add("subTitle") : remove("subTitle");
    }

    @NewChain
    public MessageRecordFetcher avatar() {
        return add("avatar");
    }

    @NewChain
    public MessageRecordFetcher avatar(boolean enabled) {
        return enabled ? add("avatar") : remove("avatar");
    }

    @NewChain
    public MessageRecordFetcher content() {
        return add("content");
    }

    @NewChain
    public MessageRecordFetcher content(boolean enabled) {
        return enabled ? add("content") : remove("content");
    }

    @NewChain
    public MessageRecordFetcher messageType() {
        return add("messageType");
    }

    @NewChain
    public MessageRecordFetcher messageType(boolean enabled) {
        return enabled ? add("messageType") : remove("messageType");
    }

    @NewChain
    public MessageRecordFetcher targetUsers() {
        return add("targetUsers");
    }

    @NewChain
    public MessageRecordFetcher targetUsers(boolean enabled) {
        return enabled ? add("targetUsers") : remove("targetUsers");
    }

    @NewChain
    public MessageRecordFetcher targetUsers(Fetcher<User> childFetcher) {
        return add("targetUsers", childFetcher);
    }

    @NewChain
    public MessageRecordFetcher targetUsers(Fetcher<User> childFetcher,
            Consumer<ListFieldConfig<User, UserTable>> fieldConfig) {
        return add("targetUsers", childFetcher, fieldConfig);
    }

    @NewChain
    public MessageRecordFetcher targetUsers(IdOnlyFetchType idOnlyFetchType) {
        return add("targetUsers", idOnlyFetchType);
    }

    @NewChain
    public MessageRecordFetcher messageRecordUsers() {
        return add("messageRecordUsers");
    }

    @NewChain
    public MessageRecordFetcher messageRecordUsers(boolean enabled) {
        return enabled ? add("messageRecordUsers") : remove("messageRecordUsers");
    }

    @NewChain
    public MessageRecordFetcher messageRecordUsers(Fetcher<MessageRecordUser> childFetcher) {
        return add("messageRecordUsers", childFetcher);
    }

    @NewChain
    public MessageRecordFetcher messageRecordUsers(Fetcher<MessageRecordUser> childFetcher,
            Consumer<ListFieldConfig<MessageRecordUser, MessageRecordUserTable>> fieldConfig) {
        return add("messageRecordUsers", childFetcher, fieldConfig);
    }

    @Override
    protected MessageRecordFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new MessageRecordFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected MessageRecordFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new MessageRecordFetcher(this, prop, fieldConfig);
    }
}
