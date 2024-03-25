package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.*;
import top.yangwulang.platform.entity.DataTypeBase;

import javax.validation.constraints.Null;
import java.util.List;

/**
 * 区域表
 */
@Entity
@Table(name = "sys_area")
@Schema(description = "区域实体")
public interface Area extends DataTypeBase {

    /**
     * 国家 (暂未取值)
     */
    String AREA_TYPE_COUNTRY = "";
    /**
     * 省
     */
    String AREA_TYPE_PROVINCE = "1";
    /**
     * 地市
     */
    String AREA_TYPE_CITY = "2";
    /**
     * 区县
     */
    String AREA_TYPE_COUNTY = "3";

    @Key
    @ManyToOne
    @JoinColumn(name = "pid")
    @Schema(description = "父级区域")
    @OnDissociate(DissociateAction.DELETE)
    @Null Area parent();

    /**
     * 父级编号
     */
    @IdView
    @Schema(description = "父级id")
    @Null String parentId();

    @OneToMany(mappedBy = "parent")
    @Schema(description = "子级区域")
    List<Area> children();

    /**
     * 名称
     */
    @Schema(description = "区域名称")
    String areaName();

    /**
     * 排序
     */
    @Schema(description = "排序")
    @Null Long sort();

    /**
     * 区域类型
     */
    @Schema(description = "地区类型(1：省份、直辖市；2：地市；3：区县)")
    @Null String areaType();
}

