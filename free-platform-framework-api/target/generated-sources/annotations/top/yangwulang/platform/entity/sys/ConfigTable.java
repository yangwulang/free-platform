package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Config.class
)
public class ConfigTable extends AbstractTypedTable<Config> implements ConfigProps {
    public static final ConfigTable $ = new ConfigTable();

    public ConfigTable() {
        super(Config.class);
    }

    public ConfigTable(AbstractTypedTable.DelayedOperation<Config> delayedOperation) {
        super(Config.class, delayedOperation);
    }

    public ConfigTable(TableImplementor<Config> table) {
        super(table);
    }

    protected ConfigTable(ConfigTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return get("id");
    }

    @Override
    public PropExpression.Str createBy() {
        return get("createBy");
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return get("createDate");
    }

    @Override
    public PropExpression.Str updateBy() {
        return get("updateBy");
    }

    @Override
    public PropExpression.Cmp<Date> updateDate() {
        return get("updateDate");
    }

    @Override
    public PropExpression.Str remarks() {
        return get("remarks");
    }

    @Override
    public PropExpression.Str configName() {
        return get("configName");
    }

    @Override
    public PropExpression.Str configKey() {
        return get("configKey");
    }

    @Override
    public PropExpression.Str configValue() {
        return get("configValue");
    }

    @Override
    public ConfigTableEx asTableEx() {
        return new ConfigTableEx(this, null);
    }

    @Override
    public ConfigTable __disableJoin(String reason) {
        return new ConfigTable(this, reason);
    }

    public static class Remote extends AbstractTypedTable<Config> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Config.class, delayedOperation);
        }

        public Remote(TableImplementor<Config> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return get("id");
        }

        @Override
        @Deprecated
        public TableEx<Config> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
