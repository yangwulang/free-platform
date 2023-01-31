package top.yangwulang.platform.entity.video;

import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

public class VideoInfoTable extends AbstractTypedTable<VideoInfo> implements VideoInfoProps {
    public static final VideoInfoTable $ = new VideoInfoTable();

    public VideoInfoTable() {
        super(VideoInfo.class);
    }

    public VideoInfoTable(AbstractTypedTable.DelayedOperation<VideoInfo> delayedOperation) {
        super(VideoInfo.class, delayedOperation);
    }

    public VideoInfoTable(TableImplementor<VideoInfo> table) {
        super(table);
    }

    protected VideoInfoTable(VideoInfoTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return get("id");
    }

    @Override
    public VideoCategoryTable category() {
        __beforeJoin();
        if (raw != null) {
            return new VideoCategoryTable(raw.joinImplementor("category"));
        }
        return new VideoCategoryTable(joinOperation("category"));
    }

    @Override
    public VideoCategoryTable category(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new VideoCategoryTable(raw.joinImplementor("category", joinType));
        }
        return new VideoCategoryTable(joinOperation("category", joinType));
    }

    @Override
    public PropExpression.Str playUrl() {
        return get("playUrl");
    }

    @Override
    public PropExpression.Str imgSrc() {
        return get("imgSrc");
    }

    @Override
    public PropExpression.Str desc() {
        return get("desc");
    }

    @Override
    public PropExpression.Str path() {
        return get("path");
    }

    @Override
    public VideoInfoTableEx asTableEx() {
        return new VideoInfoTableEx(this, null);
    }

    @Override
    public VideoInfoTable __disableJoin(String reason) {
        return new VideoInfoTable(this, reason);
    }
}
