package top.yangwulang.platform.entity;

import org.babyfish.jimmer.sql.MappedSuperclass;

import java.io.Serializable;

@MappedSuperclass
public interface TenantTypeBase extends Serializable {
    String tenant();
}
