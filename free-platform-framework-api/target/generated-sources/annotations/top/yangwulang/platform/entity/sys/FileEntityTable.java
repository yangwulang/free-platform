package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = FileEntity.class
)
public class FileEntityTable extends AbstractTypedTable<FileEntity> implements FileEntityProps {
    public static final FileEntityTable $ = new FileEntityTable();

    public FileEntityTable() {
        super(FileEntity.class);
    }

    public FileEntityTable(AbstractTypedTable.DelayedOperation<FileEntity> delayedOperation) {
        super(FileEntity.class, delayedOperation);
    }

    public FileEntityTable(TableImplementor<FileEntity> table) {
        super(table);
    }

    protected FileEntityTable(FileEntityTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return get("id");
    }

    @Override
    public PropExpression.Str fileMd5() {
        return get("fileMd5");
    }

    @Override
    public PropExpression.Str filePath() {
        return get("filePath");
    }

    @Override
    public PropExpression.Str fileContentType() {
        return get("fileContentType");
    }

    @Override
    public PropExpression.Str fileMeta() {
        return get("fileMeta");
    }

    @Override
    public FileEntityTableEx asTableEx() {
        return new FileEntityTableEx(this, null);
    }

    @Override
    public FileEntityTable __disableJoin(String reason) {
        return new FileEntityTable(this, reason);
    }

    public static class Remote extends AbstractTypedTable<FileEntity> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(FileEntity.class, delayedOperation);
        }

        public Remote(TableImplementor<FileEntity> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return get("id");
        }

        @Override
        @Deprecated
        public TableEx<FileEntity> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
