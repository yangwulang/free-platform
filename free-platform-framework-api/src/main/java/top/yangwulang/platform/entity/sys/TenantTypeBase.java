package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.MappedSuperclass;

@MappedSuperclass
public interface TenantTypeBase {
    String tenant();
}
