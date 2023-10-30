package top.yangwulang.platform.security.datascope;

import org.babyfish.jimmer.sql.ast.query.MutableRootQuery;
import org.babyfish.jimmer.sql.ast.table.Table;

/**
 * 数据权限过滤链，必须指定过滤的是哪个table的链，
 * 例如用户的过滤链: <br/>
 * <code>
 * public class DemoUserDataScopeChain implement DataScopeChain&lt;UserTable&gt; {
 * public boolean filter(MutableRootQuery&lt;UserTable&gt; rootQuery) {
 * rootQuery.where(xxxx);
 * return true;
 * }
 * }
 * </code>
 * 形式
 *
 * @param <T> 指定某个数据权限的table接口
 * @author yangwulang
 */
public interface DataScopeChain<T extends Table<?>> {

    /**
     * 数据权限过滤方式，当其返回false时后续权限不会过滤
     *
     * @param rootQuery table顶级查询接口
     * @return 是否继续过滤权限
     */
    boolean filter(MutableRootQuery<T> rootQuery);
}
