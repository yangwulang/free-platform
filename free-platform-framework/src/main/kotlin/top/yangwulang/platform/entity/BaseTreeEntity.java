package top.yangwulang.platform.entity;


import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 所有树实体的基类
 *
 * @author yangwulang
 */
@MappedSuperclass
public class BaseTreeEntity<T extends BaseTreeEntity<T>> extends BaseEntity<T> implements Serializable {

    public BaseTreeEntity() {
    }

    public BaseTreeEntity(String id) {
        super(id);
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pid")
    @ApiModelProperty("父级节点")
    protected T parent;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "pid")
    @ApiModelProperty("子级节点")
    protected List<T> children = new ArrayList<>();


    @Size(max = 1000)
    @Column(name = "parent_codes", nullable = false, length = 1000)
    @ApiModelProperty("父级所有节点")
    protected String parentCodes;

    @Column(name = "tree_sort", nullable = false, precision = 10)
    @ApiModelProperty("树排序")
    protected Integer treeSort;

    @Size(max = 1000)
    @Column(name = "tree_sorts", nullable = false, length = 1000)
    @ApiModelProperty("树排序所有的")
    protected String treeSorts;

    @Column(name = "tree_leaf", nullable = false)
    @ApiModelProperty("是否叶子节点")
    /**
     * 是否叶子节点，这个只能通过前端进行判断了,jpa中暂时没有高效的判断方法
     */
    protected String treeLeaf;

    @Column(name = "tree_level", nullable = false, precision = 4)
    @ApiModelProperty("树层级")
    protected Integer treeLevel;

    @Size(max = 1000)
    @Column(name = "tree_names", nullable = false, length = 1000)
    @ApiModelProperty("树名称")
    protected String treeNames;


    @Transient
    @ApiModelProperty("树名字")
    protected String treeName;

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public String getParentCodes() {
        return parentCodes;
    }

    public void setParentCodes(String parentCodes) {
        this.parentCodes = parentCodes;
    }

    public Integer getTreeSort() {
        return treeSort;
    }

    public void setTreeSort(Integer treeSort) {
        this.treeSort = treeSort;
    }

    public String getTreeSorts() {
        return treeSorts;
    }

    public void setTreeSorts(String treeSorts) {
        this.treeSorts = treeSorts;
    }

    public String getTreeLeaf() {
        return treeLeaf;
    }

    public void setTreeLeaf(String treeLeaf) {
        this.treeLeaf = treeLeaf;
    }

    public Integer getTreeLevel() {
        if (this.treeLeaf != null && this.treeLevel == null) {
            Integer level = null;
            if (this.parentCodes != null) {
                level = this.parentCodes.replaceAll("[^,]", "").length() - 1;
            }
            this.treeLevel = level;
        }
        return this.treeLevel;
    }

    public void setTreeLevel(Integer treeLevel) {
        this.treeLevel = treeLevel;
    }

    public String getTreeNames() {
        return treeNames;
    }

    public void setTreeNames(String treeNames) {
        this.treeNames = treeNames;
    }

    public T getParent() {
        return parent;
    }

    public void setParent(T parent) {
        this.parent = parent;
    }

    public List<T> getChildren() {
        return children;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }
}
