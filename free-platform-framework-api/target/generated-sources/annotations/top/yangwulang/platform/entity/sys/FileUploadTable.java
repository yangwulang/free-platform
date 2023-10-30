package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = FileUpload.class
)
public class FileUploadTable extends AbstractTypedTable<FileUpload> implements FileUploadProps {
    public static final FileUploadTable $ = new FileUploadTable();

    public FileUploadTable() {
        super(FileUpload.class);
    }

    public FileUploadTable(AbstractTypedTable.DelayedOperation<FileUpload> delayedOperation) {
        super(FileUpload.class, delayedOperation);
    }

    public FileUploadTable(TableImplementor<FileUpload> table) {
        super(table);
    }

    protected FileUploadTable(FileUploadTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return get("id");
    }

    @Override
    public FileEntityTable fileEntity() {
        __beforeJoin();
        if (raw != null) {
            return new FileEntityTable(raw.joinImplementor("fileEntity"));
        }
        return new FileEntityTable(joinOperation("fileEntity"));
    }

    @Override
    public FileEntityTable fileEntity(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new FileEntityTable(raw.joinImplementor("fileEntity", joinType));
        }
        return new FileEntityTable(joinOperation("fileEntity", joinType));
    }

    @Override
    public PropExpression.Str fileEntityId() {
        return get("fileEntityId");
    }

    @Override
    public PropExpression.Str fileName() {
        return get("fileName");
    }

    @Override
    public PropExpression.Str fileType() {
        return get("fileType");
    }

    @Override
    public PropExpression.Str bizKey() {
        return get("bizKey");
    }

    @Override
    public PropExpression.Str bizType() {
        return get("bizType");
    }

    @Override
    public FileUploadTableEx asTableEx() {
        return new FileUploadTableEx(this, null);
    }

    @Override
    public FileUploadTable __disableJoin(String reason) {
        return new FileUploadTable(this, reason);
    }

    public static class Remote extends AbstractTypedTable<FileUpload> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(FileUpload.class, delayedOperation);
        }

        public Remote(TableImplementor<FileUpload> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return get("id");
        }

        @Override
        @Deprecated
        public TableEx<FileUpload> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
