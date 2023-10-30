package top.yangwulang.platform.security.datascope;

import org.babyfish.jimmer.sql.ast.query.MutableRootQuery;
import org.babyfish.jimmer.sql.ast.table.Table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 数据权限管理器，对数据权限进行过滤管理，在spring注入时,权限列表不是必须的,例如：<br/>
 *
 * <code>
 * &#064;Bean<br/>
 * public DataScopeManager&lt;UserTable&gt; userDataScopeManager(
 * <br/>&#064;Autowired(required  = false) List&lt;DataScopeChain&lt;UserTable&gt;&gt; userDataScopeChain<br/>
 * ) { <br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;DataScopeManager<UserTable> dataScopeManager = new DataScopeManager<>(); <br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;for (DataScopeChain<UserTable> chain : userDataScopeChain) {<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;dataScopeManager.addDataScopeChain(chain);<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;}<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;return dataScopeManager;<br/>
 * }
 * </code>
 *
 * @author yangwulang
 */
public class DataScopeManager<T extends Table<?>> {

    private final List<DataScopeChain<T>> chains = new ArrayList<>();

    /**
     * 增加单一数据权限过滤器
     *
     * @param dataScopeChain 数据权限某个链节点
     * @return 当前管理器
     */
    public DataScopeManager<T> addDataScopeChain(DataScopeChain<T> dataScopeChain) {
        chains.add(dataScopeChain);
        return this;
    }

    /**
     * 增加一系列数据权限过滤器
     *
     * @param chains 数据权限某一系列链节点
     * @return 当前管理器
     */
    public DataScopeManager<T> addAll(Collection<DataScopeChain<T>> chains) {
        this.chains.addAll(chains);
        return this;
    }


    /**
     * 执行数据过滤链路
     *
     * @param rootQuery 顶级查询
     */
    public void filter(MutableRootQuery<T> rootQuery) {
        for (DataScopeChain<T> chain : chains) {
            if (!chain.filter(rootQuery)) {
                break;
            }
        }
    }
}
