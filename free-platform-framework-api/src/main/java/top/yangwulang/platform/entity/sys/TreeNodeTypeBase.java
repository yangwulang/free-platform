/*
package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.*;

import org.jetbrains.annotations.NotNull;;
import jakarta.annotation.Nullable;
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
    @Nullable T parent();

    @OneToMany(mappedBy = "parent")
    @NotNull
    List<T> children();


    */
/**
     * 所有父级编号
     *//*

    @Nullable String parentCodes();

    */
/**
     * 本级排序号（升序）
     *//*

    @Nullable BigDecimal treeSort();

    */
/**
     * 所有级别排序号
     *//*

    @Nullable String treeSorts();

    */
/**
     * 是否最末级
     *//*

    @Nullable String treeLeaf();

    */
/**
     * 层次级别
     *//*

    @Nullable BigDecimal treeLevel();

    */
/**
     * 全节点名
     *//*

    @Nullable String treeNames();

}
*/
