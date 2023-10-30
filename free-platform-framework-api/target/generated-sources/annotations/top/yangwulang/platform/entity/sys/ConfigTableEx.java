package top.yangwulang.platform.entity.sys;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Config.class
)
public class ConfigTableEx extends ConfigTable implements TableEx<Config> {
    public static final ConfigTableEx $ = new ConfigTableEx(ConfigTable.$, null);

    public ConfigTableEx() {
        super();
    }

    public ConfigTableEx(AbstractTypedTable.DelayedOperation<Config> delayedOperation) {
        super(delayedOperation);
    }

    public ConfigTableEx(TableImplementor<Config> table) {
        super(table);
    }

    protected ConfigTableEx(ConfigTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public ConfigTableEx asTableEx() {
        return this;
    }

    @Override
    public ConfigTableEx __disableJoin(String reason) {
        return new ConfigTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<ConfigTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<ConfigTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
