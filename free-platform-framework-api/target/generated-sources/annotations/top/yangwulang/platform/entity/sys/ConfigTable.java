package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.internal.GeneratedBy;
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
        return __get(ConfigProps.ID.unwrap());
    }

    @Override
    public PropExpression.Str createBy() {
        return __get(ConfigProps.CREATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return __get(ConfigProps.CREATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str updateBy() {
        return __get(ConfigProps.UPDATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> updateDate() {
        return __get(ConfigProps.UPDATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str remarks() {
        return __get(ConfigProps.REMARKS.unwrap());
    }

    @Override
    public PropExpression.Str configName() {
        return __get(ConfigProps.CONFIG_NAME.unwrap());
    }

    @Override
    public PropExpression.Str configKey() {
        return __get(ConfigProps.CONFIG_KEY.unwrap());
    }

    @Override
    public PropExpression.Str configValue() {
        return __get(ConfigProps.CONFIG_VALUE.unwrap());
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
            return __get(ConfigProps.ID.unwrap());
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
