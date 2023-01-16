package top.yangwulang.platform.utils;

import cn.hutool.core.util.IdUtil;
import org.babyfish.jimmer.sql.meta.UserIdGenerator;

/**
 * @author yangwulang
 */
public class SnowflakeKey implements UserIdGenerator<String> {
    @Override
    public String generate(Class<?> entityType) {
        return IdUtil.getSnowflake().nextIdStr();
    }
}
