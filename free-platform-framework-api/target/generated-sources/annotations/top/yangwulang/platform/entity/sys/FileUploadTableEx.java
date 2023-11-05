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
        type = FileUpload.class
)
public class FileUploadTableEx extends FileUploadTable implements TableEx<FileUpload> {
    public static final FileUploadTableEx $ = new FileUploadTableEx(FileUploadTable.$, null);

    public FileUploadTableEx() {
        super();
    }

    public FileUploadTableEx(AbstractTypedTable.DelayedOperation<FileUpload> delayedOperation) {
        super(delayedOperation);
    }

    public FileUploadTableEx(TableImplementor<FileUpload> table) {
        super(table);
    }

    protected FileUploadTableEx(FileUploadTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public FileEntityTableEx fileEntity() {
        __beforeJoin();
        if (raw != null) {
            return new FileEntityTableEx(raw.joinImplementor(FileUploadProps.FILE_ENTITY.unwrap()));
        }
        return new FileEntityTableEx(joinOperation(FileUploadProps.FILE_ENTITY.unwrap()));
    }

    public FileEntityTableEx fileEntity(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new FileEntityTableEx(raw.joinImplementor(FileUploadProps.FILE_ENTITY.unwrap(), joinType));
        }
        return new FileEntityTableEx(joinOperation(FileUploadProps.FILE_ENTITY.unwrap(), joinType));
    }

    @Override
    public FileUploadTableEx asTableEx() {
        return this;
    }

    @Override
    public FileUploadTableEx __disableJoin(String reason) {
        return new FileUploadTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<FileUploadTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<FileUploadTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
