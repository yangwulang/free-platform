package top.yangwulang.platform.jimmer.filter;

import org.babyfish.jimmer.sql.filter.Filter;
import org.babyfish.jimmer.sql.filter.FilterArgs;
import top.yangwulang.platform.entity.TenantTypeBaseProps;
import top.yangwulang.platform.jimmer.JimmerException;

public class TenantFilter implements Filter<TenantTypeBaseProps> {
    protected final TenantProvider tenantProvider;

    public TenantFilter(TenantProvider tenantProvider) {
        if (tenantProvider == null) {
            throw new JimmerException("TenantFilter 的 TenantProvider 不能为 null");
        }
        this.tenantProvider = tenantProvider;
    }

    @Override
    public void filter(FilterArgs<TenantTypeBaseProps> args) {
        String tenant = tenantProvider.get();
        if (tenant != null) {
            args.where(args.getTable().tenant().eq(tenant));
        }
    }
}
