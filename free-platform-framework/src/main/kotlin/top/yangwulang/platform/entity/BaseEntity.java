package top.yangwulang.platform.entity;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 所有查询实体基类，自动生成一个雪花id
 *
 * @author yangwulang
 */
@MappedSuperclass
public class BaseEntity<T extends BaseEntity<T>> extends AbstractAggregateRoot<BaseEntity<T>> implements Serializable {
    public BaseEntity() {
    }

    public BaseEntity(String id) {
        this.setId(id);
    }

    @Id
    @Size(max = 64)
    @Column(name = "id", nullable = false, length = 64)
    @GeneratedValue(generator = "snowflake")
    @GenericGenerator(name = "snowflake", strategy = "top.yangwulang.platform.utils.SnowflakeGenerator")
    @ApiModelProperty("主键")
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
