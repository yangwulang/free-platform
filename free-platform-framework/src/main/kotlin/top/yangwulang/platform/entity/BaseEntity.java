package top.yangwulang.platform.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity<T extends BaseEntity<T>> extends AbstractAggregateRoot<BaseEntity<T>>  implements Serializable {

    @Id
    @Size(max = 64)
    @Column(name = "id", nullable = false, length = 64)
    @GeneratedValue(generator = "snowflake")
    @GenericGenerator(name = "snowflake", strategy = "top.yangwulang.platform.utils.SnowflakeGenerator")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
