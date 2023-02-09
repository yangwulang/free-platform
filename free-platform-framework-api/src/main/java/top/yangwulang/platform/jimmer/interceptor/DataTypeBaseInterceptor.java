package top.yangwulang.platform.jimmer.interceptor;

import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.sql.DraftInterceptor;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.sys.DataTypeBaseDraft;
import top.yangwulang.platform.entity.sys.DataTypeBaseProps;

import java.time.LocalDateTime;

public class DataTypeBaseInterceptor implements DraftInterceptor<DataTypeBaseDraft> {
    @Override
    public void beforeSave(@NotNull DataTypeBaseDraft draft, boolean isNew) {
        if (!ImmutableObjects.isLoaded(draft, DataTypeBaseProps.UPDATE_DATE)) {
            draft.setUpdateDate(LocalDateTime.now());
        }
        if (isNew) {
            draft.setCreateDate(LocalDateTime.now());
            draft.setStatus("0");
            draft.setCreateBy("system");
            draft.setUpdateBy("system");
        }
    }
}
