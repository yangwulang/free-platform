package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.Null;
import java.util.List;

/**
 * 员工
 */
@Entity
@Table(name = "sys_employee")
@Schema(description = "员工")
public interface Employee {
    /**
     * 员工编码
     */
    @Id
    @Schema(description = "员工编码")
    String empCode();

    @OneToOne
    @Key
    @JoinColumn(name = "USER_CODE")
    @Schema(description = "用户")
    @Null User user();

    @ManyToOne
    @Schema(description = "公司")
    @Null Company company();

    /**
     * 公司主键
     */
    @IdView
    @Null String companyId();


    /**
     * 员工姓名
     */
    @Schema(description = "员工名称")
    @Null String empName();

    /**
     * 员工拥有的岗位
     *
     * @return 岗位
     */
    @ManyToMany
    @JoinTable(
            name = "SYS_EMPLOYEE_POST",
            joinColumnName = "EMP_CODE",
            inverseJoinColumnName = "POST_ID"
    )
    List<Post> posts();
}

