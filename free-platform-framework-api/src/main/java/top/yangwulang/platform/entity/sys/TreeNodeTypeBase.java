/*
package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.util.List;

*/
/**
 * @author yangwulang
 *//*

@MappedSuperclass
public interface TreeNodeTypeBase<T extends TreeNodeTypeBase<T>> extends DataTypeBase {


    */
/**
     * 父级编号
     *
     * @return 父级
     *//*

    @Key
    @ManyToOne
    @JoinColumn(name = "pid")
    @OnDissociate(DissociateAction.DELETE)
    @Null T parent();

    @OneToMany(mappedBy = "parent")
    @NotNull
    List<T> children();


    */
/**
     * 所有父级编号
     *//*

    @Null String parentCodes();

    */
/**
     * 本级排序号（升序）
     *//*

    @Null BigDecimal treeSort();

    */
/**
     * 所有级别排序号
     *//*

    @Null String treeSorts();

    */
/**
     * 是否最末级
     *//*

    @Null String treeLeaf();

    */
/**
     * 层次级别
     *//*

    @Null BigDecimal treeLevel();

    */
/**
     * 全节点名
     *//*

    @Null String treeNames();

}
*/
