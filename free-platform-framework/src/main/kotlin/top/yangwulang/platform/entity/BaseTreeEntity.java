package top.yangwulang.platform.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public class BaseTreeEntity<T extends BaseTreeEntity<T>> extends BaseEntity<T> implements Serializable {

    public BaseTreeEntity() {
    }

    public BaseTreeEntity(String id) {
        super(id);
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pid")
    protected T parent;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "pid")
    protected List<T> children = new ArrayList<>();


    @Size(max = 1000)
    @NotNull
    @Column(name = "parent_codes", nullable = false, length = 1000)
    protected String parentCodes;

    @NotNull
    @Column(name = "tree_sort", nullable = false, precision = 10)
    protected Integer treeSort;

    @Size(max = 1000)
    @NotNull
    @Column(name = "tree_sorts", nullable = false, length = 1000)
    protected String treeSorts;

    @NotNull
    @Column(name = "tree_leaf", nullable = false)
    protected String treeLeaf;

    @NotNull
    @Column(name = "tree_level", nullable = false, precision = 4)
    protected Integer treeLevel;

    @Size(max = 1000)
    @NotNull
    @Column(name = "tree_names", nullable = false, length = 1000)
    protected String treeNames;


    @Transient
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
