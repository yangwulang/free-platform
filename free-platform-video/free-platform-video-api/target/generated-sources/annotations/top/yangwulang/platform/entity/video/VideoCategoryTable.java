package top.yangwulang.platform.entity.video;

import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

public class VideoCategoryTable extends AbstractTypedTable<VideoCategory> implements VideoCategoryProps {
    public static final VideoCategoryTable $ = new VideoCategoryTable();

    public VideoCategoryTable() {
        super(VideoCategory.class);
    }

    public VideoCategoryTable(AbstractTypedTable.DelayedOperation<VideoCategory> delayedOperation) {
        super(VideoCategory.class, delayedOperation);
    }

    public VideoCategoryTable(TableImplementor<VideoCategory> table) {
        super(table);
    }

    protected VideoCategoryTable(VideoCategoryTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return get("id");
    }

    @Override
    public PropExpression.Str categoryName() {
        return get("categoryName");
    }

    @Override
    public VideoCategoryTableEx asTableEx() {
        return new VideoCategoryTableEx(this, null);
    }

    @Override
    public VideoCategoryTable __disableJoin(String reason) {
        return new VideoCategoryTable(this, reason);
    }
}
