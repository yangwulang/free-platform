package top.yangwulang.platform.entity;

import cn.hutool.core.lang.tree.TreeNode;

/**
 * @author yangwulang
 */
public class TreeNodeString<T> extends TreeNode<T> {
    private String name;

    public TreeNodeString() {
    }

    /**
     * 构造
     *
     * @param id       ID
     * @param parentId 父节点ID
     * @param name     名称
     * @param weight   权重
     */
    public TreeNodeString(T id, T parentId, String name, Comparable<?> weight) {
        super(id, parentId, name, weight);
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
