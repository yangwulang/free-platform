package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.MappedSuperclass;

import java.io.Serializable;

@MappedSuperclass
public interface TenantTypeBase extends Serializable {
    String tenant();
}
