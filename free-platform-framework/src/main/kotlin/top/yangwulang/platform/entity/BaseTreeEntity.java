package top.yangwulang.platform.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public class BaseTreeEntity<T extends BaseTreeEntity<T>> extends BaseEntity<T> implements Serializable {

    @Size(max = 64)
    @NotNull
    @Column(name = "pid", nullable = false, length = 64)
    private String pid;

    @ManyToOne
    @JoinColumn(name = "pid")
    private BaseTreeEntity<T> parent;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "pid")
    private List<BaseTreeEntity<T>> children = new ArrayList<>();


    @Size(max = 1000)
    @NotNull
    @Column(name = "parent_codes", nullable = false, length = 1000)
    private String parentCodes;

    @NotNull
    @Column(name = "tree_sort", nullable = false, precision = 10)
    private BigDecimal treeSort;

    @Size(max = 1000)
    @NotNull
    @Column(name = "tree_sorts", nullable = false, length = 1000)
    private String treeSorts;

    @NotNull
    @Column(name = "tree_leaf", nullable = false)
    private String treeLeaf;

    @NotNull
    @Column(name = "tree_level", nullable = false, precision = 4)
    private BigDecimal treeLevel;

    @Size(max = 1000)
    @NotNull
    @Column(name = "tree_names", nullable = false, length = 1000)
    private String treeNames;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getParentCodes() {
        return parentCodes;
    }

    public void setParentCodes(String parentCodes) {
        this.parentCodes = parentCodes;
    }

    public BigDecimal getTreeSort() {
        return treeSort;
    }

    public void setTreeSort(BigDecimal treeSort) {
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

    public BigDecimal getTreeLevel() {
        return treeLevel;
    }

    public void setTreeLevel(BigDecimal treeLevel) {
        this.treeLevel = treeLevel;
    }

    public String getTreeNames() {
        return treeNames;
    }

    public void setTreeNames(String treeNames) {
        this.treeNames = treeNames;
    }

    public BaseTreeEntity<T> getParent() {
        return parent;
    }

    public void setParent(BaseTreeEntity<T> parent) {
        this.parent = parent;
    }

    public List<BaseTreeEntity<T>> getChildren() {
        return children;
    }

    public void setChildren(List<BaseTreeEntity<T>> children) {
        this.children = children;
    }
}
