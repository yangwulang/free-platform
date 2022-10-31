package top.yangwulang.platform.utils;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author 10214
 */
public class DataSourceHolder extends AbstractRoutingDataSource {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();
    @Override
    protected Object determineCurrentLookupKey() {
        return CONTEXT_HOLDER.get();
    }

    public static void setDataSource(String dataSource) {
        CONTEXT_HOLDER.set(dataSource);
    }

    public static String getDataSource() {
        return CONTEXT_HOLDER.get();
    }

    public static void clean() {
        CONTEXT_HOLDER.remove();
    }
}
