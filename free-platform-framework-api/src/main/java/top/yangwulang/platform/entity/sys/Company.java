package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.Null;

import top.yangwulang.platform.entity.TypeBase;

import java.util.List;

/**
 * 公司
 * @author yangwulang
 */
@Entity
@Table(name = "sys_company")
@Schema(description = "公司实体")
public interface Company extends TypeBase {

    /**
     * 父级id
     */
    @Key
    @ManyToOne
    @JoinColumn(name = "pid")
    @Schema(description = "父级公司")
    @OnDissociate(DissociateAction.DELETE)
    @Null Company parent();

    /**
     * 父级编号
     */
    @IdView
    @Schema(description = "父级id")
    @Null String parentId();

    /**
     * 子级公司
     *
     * @return 子级公司
     */
    @OneToMany(mappedBy = "parent")
    @Schema(description = "子级公司")
    List<Company> children();

    @OneToMany(mappedBy = "company")
    List<Employee> employees();

    /**
     * 公司编码
     */
    @Key
    @Schema(description = "公司编码")
    String companyCode();

    /**
     * 公司名称
     */
    @Key
    @Schema(description = "公司名称")
    String companyName();

    /**
     * 公司全名
     */
    @Schema(description = "公司全名")
    @Null String companyFullName();

    @Null String corpCode();

    @Null String corpName();
}

