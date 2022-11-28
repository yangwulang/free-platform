package top.yangwulang.platform.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;
import java.util.Date;

@MappedSuperclass
public class DataEntity<T extends DataEntity<T>> extends BaseEntity<T> {

    @Column(name = "status")
    @ApiModelProperty("状态")
    private String status;

    @Size(max = 64)
    //@NotNull
    @Column(name = "create_by", nullable = false, length = 64)
    @ApiModelProperty("创建人")
    private String createBy;

    //@NotNull
    @Column(name = "create_date", nullable = false)
    @ApiModelProperty("创建时间")
    private Date createDate;

    @Size(max = 64)
    //@NotNull
    @Column(name = "update_by", nullable = false, length = 64)
    @ApiModelProperty("修改人")
    private String updateBy;

    //@NotNull
    @Column(name = "update_date", nullable = false)
    @ApiModelProperty("修改时间")
    private Date updateDate;

    @Size(max = 500)
    @Column(name = "remarks", length = 500)
    @ApiModelProperty("备注")
    private String remarks;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
