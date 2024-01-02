package top.yangwulang.platform.entity.sys;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = FileEntity.class
)
public class FileEntityTableEx extends FileEntityTable implements TableEx<FileEntity> {
    public static final FileEntityTableEx $ = new FileEntityTableEx(FileEntityTable.$, null);

    public FileEntityTableEx() {
        super();
    }

    public FileEntityTableEx(AbstractTypedTable.DelayedOperation<FileEntity> delayedOperation) {
        super(delayedOperation);
    }

    public FileEntityTableEx(TableImplementor<FileEntity> table) {
        super(table);
    }

    protected FileEntityTableEx(FileEntityTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public FileEntityTableEx asTableEx() {
        return this;
    }

    @Override
    public FileEntityTableEx __disableJoin(String reason) {
        return new FileEntityTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<FileEntityTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<FileEntityTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
