package top.yangwulang.platform.config;

import org.apache.commons.lang3.StringUtils;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.Location;
import org.flywaydb.core.api.callback.Callback;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
import top.yangwulang.platform.exception.ServiceException;

/**
 * 抽象flyway分模块构建，必须配置模块名和数据库类型，
 * 必须在classpath目录下创建db/migration/${module}/${dbType}文件夹，
 * 其文件夹中存在的是各自系统的sql升级信息，其名称遵循flyway约束
 *
 * @author yangwulang
 */
public abstract class AbstractFlywayConfiguration {
    /**
     * 模块名，在项目中唯一
     *
     * @return 模块名
     */
    protected abstract String module();

    /**
     * 数据库类型，通过此标示执行不同目录下的脚本
     *
     * @return 数据库类型
     */
    protected abstract String dbType();

    /**
     * 构建sql脚本路径，需要模块和数据库类型支持
     *
     * @param module 模块名
     * @param dbType 数据库类型
     * @return 构建的路径
     */
    protected String buildLocations(String module, String dbType) {
        if (StringUtils.isEmpty(module)) {
            throw new ServiceException("构建flyway遇上未知模块");
        }
        if (StringUtils.isEmpty(dbType)) {
            dbType = "mysql";
        }
        return "classpath:db/migration/" + module + "/" + dbType;
    }

    /**
     * 构建模块版本升级表名
     *
     * @return 模块版本升级表名
     */
    protected String buildTable() {
        return "module_" + module() + "_flyway_schema_history";
    }

    /**
     * 构建flyway
     *
     * @param flywayProperties spring的flyway配置类,由spring构造
     * @return flyway实例
     */
    protected Flyway buildFlyway(FlywayProperties flywayProperties) {
        return Flyway.configure()
                .locations(new Location(buildLocations(module(), dbType())))
                .table(buildTable())
                .baselineOnMigrate(true)
                .installedBy(flywayProperties.getInstalledBy())
                .defaultSchema(flywayProperties.getDefaultSchema())
                .baselineVersion(flywayProperties.getBaselineVersion())
//                .batch(flywayProperties.getBatch() != null && flywayProperties.getBatch())
                .baselineOnMigrate(flywayProperties.isBaselineOnMigrate())
                .baselineDescription(flywayProperties.getBaselineDescription())
                .dataSource(flywayProperties.getUrl(), flywayProperties.getUser(), flywayProperties.getPassword())
                .callbacks(callbacks())
                .load();
    }

    protected Callback[] callbacks() {
        return new Callback[]{};
    }
}
