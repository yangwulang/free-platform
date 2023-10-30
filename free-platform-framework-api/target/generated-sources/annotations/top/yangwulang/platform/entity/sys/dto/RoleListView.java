package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;
import top.yangwulang.platform.entity.sys.RoleFetcher;
import top.yangwulang.platform.entity.sys.RoleProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Role.dto"
)
@Data
public class RoleListView implements View<Role> {
    public static final ViewMetadata<Role, RoleListView> METADATA = 
        new ViewMetadata<Role, RoleListView>(
            RoleFetcher.$
                .status()
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .roleCode()
                .roleName()
                .roleType()
                .roleSort()
                .isSys()
                .userType()
                .dataScope()
                .bizScope(),
            RoleListView::new
    );

    @NotNull
    private String id;

    @Schema(
            description = "状态"
    )
    private int status;

    @NotNull
    private String createBy;

    @NotNull
    private Date createDate;

    @NotNull
    private String updateBy;

    @NotNull
    private Date updateDate;

    @Null
    private String remarks;

    @Schema(
            description = "角色编码"
    )
    @org.jetbrains.annotations.NotNull
    private String roleCode;

    @Schema(
            description = "角色名称"
    )
    @org.jetbrains.annotations.NotNull
    private String roleName;

    @Schema(
            description = "角色类型"
    )
    @Null
    private String roleType;

    @Schema(
            description = "角色排序"
    )
    @Null
    private BigDecimal roleSort;

    @Schema(
            description = "系统内置 1是 0否"
    )
    @Nullable
    private Boolean isSys;

    @Schema(
            description = "用户类型"
    )
    @Null
    private String userType;

    @Schema(
            description = "数据范围设置"
    )
    @Null
    private String dataScope;

    @Schema(
            description = "适应业务范围"
    )
    @Null
    private String bizScope;

    public RoleListView() {
    }

    public RoleListView(@org.jetbrains.annotations.NotNull Role base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = spi.__isLoaded(RoleProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
        this.roleCode = base.roleCode();
        this.roleName = base.roleName();
        this.roleType = spi.__isLoaded(RoleProps.ROLE_TYPE.unwrap().getId()) ? base.roleType() : null;
        this.roleSort = spi.__isLoaded(RoleProps.ROLE_SORT.unwrap().getId()) ? base.roleSort() : null;
        this.isSys = spi.__isLoaded(RoleProps.IS_SYS.unwrap().getId()) ? base.isSys() : null;
        this.userType = spi.__isLoaded(RoleProps.USER_TYPE.unwrap().getId()) ? base.userType() : null;
        this.dataScope = spi.__isLoaded(RoleProps.DATA_SCOPE.unwrap().getId()) ? base.dataScope() : null;
        this.bizScope = spi.__isLoaded(RoleProps.BIZ_SCOPE.unwrap().getId()) ? base.bizScope() : null;
    }

    public static RoleListView of(@org.jetbrains.annotations.NotNull Role base) {
        return new RoleListView(base);
    }

    @Override
    public Role toEntity() {
        return RoleDraft.$.produce(draft -> {
            draft.setId(id);
            draft.setStatus(status);
            draft.setCreateBy(createBy);
            draft.setCreateDate(createDate);
            draft.setUpdateBy(updateBy);
            draft.setUpdateDate(updateDate);
            draft.setRemarks(remarks);
            draft.setRoleCode(roleCode);
            draft.setRoleName(roleName);
            draft.setRoleType(roleType);
            draft.setRoleSort(roleSort);
            draft.setIsSys(isSys);
            draft.setUserType(userType);
            draft.setDataScope(dataScope);
            draft.setBizScope(bizScope);
        });
    }
}
