package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.internal.GeneratedBy;
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
        return __get(FileUploadProps.ID.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> status() {
        return __get(FileUploadProps.STATUS.unwrap());
    }

    @Override
    public PropExpression.Str createBy() {
        return __get(FileUploadProps.CREATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return __get(FileUploadProps.CREATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str updateBy() {
        return __get(FileUploadProps.UPDATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> updateDate() {
        return __get(FileUploadProps.UPDATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str remarks() {
        return __get(FileUploadProps.REMARKS.unwrap());
    }

    @Override
    public FileEntityTable fileEntity() {
        __beforeJoin();
        if (raw != null) {
            return new FileEntityTable(raw.joinImplementor(FileUploadProps.FILE_ENTITY.unwrap()));
        }
        return new FileEntityTable(joinOperation(FileUploadProps.FILE_ENTITY.unwrap()));
    }

    @Override
    public FileEntityTable fileEntity(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new FileEntityTable(raw.joinImplementor(FileUploadProps.FILE_ENTITY.unwrap(), joinType));
        }
        return new FileEntityTable(joinOperation(FileUploadProps.FILE_ENTITY.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str fileEntityId() {
        return __getAssociatedId(FileUploadProps.FILE_ENTITY.unwrap());
    }

    @Override
    public PropExpression.Str fileName() {
        return __get(FileUploadProps.FILE_NAME.unwrap());
    }

    @Override
    public PropExpression.Str fileType() {
        return __get(FileUploadProps.FILE_TYPE.unwrap());
    }

    @Override
    public PropExpression.Str bizKey() {
        return __get(FileUploadProps.BIZ_KEY.unwrap());
    }

    @Override
    public PropExpression.Str bizType() {
        return __get(FileUploadProps.BIZ_TYPE.unwrap());
    }

    @Override
    public FileUploadTableEx asTableEx() {
        return new FileUploadTableEx(this, null);
    }

    @Override
    public FileUploadTable __disableJoin(String reason) {
        return new FileUploadTable(this, reason);
    }

    @GeneratedBy(
            type = FileUpload.class
    )
    public static class Remote extends AbstractTypedTable<FileUpload> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(FileUpload.class, delayedOperation);
        }

        public Remote(TableImplementor<FileUpload> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(FileUploadProps.ID.unwrap());
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
