package top.yangwulang.platform.event.jpa;

import cn.hutool.core.util.ReflectUtil;
import org.apache.commons.lang3.StringUtils;
import top.yangwulang.platform.entity.BaseTreeEntity;
import top.yangwulang.platform.entity.DataTreeEntity;

import javax.persistence.PrePersist;
import java.util.List;

/**
 * 树实体保存事件，在保存之前自动配置 treeSorts treeNames treeLevel treeSort parentCodes parentCode数据
 * <br/>
 * <span style="color: red">
 *  注：实体类一定包含一个为String类型的有参构造函数，在实例化时会自动传入一个 "0" 的参数作为所有树的根节点的编码（id）
 * </span>
 *
 * @author yangwulang
 */
public class TreeSaveEvent {

    @PrePersist
    public void preInsert(BaseTreeEntity<?> baseTreeEntity) {
        this.preSave(baseTreeEntity);
    }

    private <T extends BaseTreeEntity<T>> void preSave(BaseTreeEntity<T> baseTreeEntity) {
        if (baseTreeEntity.getParent() != null
                && !StringUtils.isBlank(baseTreeEntity.getParent().getId())
                && !"0".equals(baseTreeEntity.getParent().getId())
        ) {
            //TODO:这里再去数据库查询下，暂时未找到查询方法
        }

        if (baseTreeEntity.getParent() == null) {
            T parent = (T) ReflectUtil.newInstance(baseTreeEntity.getClass(), "0");
            parent.setParentCodes("");
            parent.setTreeSorts("");
            baseTreeEntity.setParent(parent);
        }
        baseTreeEntity.setParentCodes(baseTreeEntity.getParent().getParentCodes() + baseTreeEntity.getParent().getId() + ",");

        if (baseTreeEntity.getTreeSort() == null) {
            baseTreeEntity.setTreeSort(30);
        }

        String treeSorts = baseTreeEntity.getParent().getTreeSorts() +
                StringUtils.leftPad(baseTreeEntity.getTreeSort().toString(), 10, "0") +
                ",";
        baseTreeEntity.setTreeSorts(treeSorts);
        baseTreeEntity.setTreeLevel(baseTreeEntity.getParentCodes().replaceAll("[^,]", "").length() - 1);


        if (StringUtils.isNotBlank(baseTreeEntity.getParent().getTreeNames())) {
            baseTreeEntity.setTreeNames(baseTreeEntity.getParent().getTreeNames() + "," + baseTreeEntity.getTreeName());

        } else {
            baseTreeEntity.setTreeNames(baseTreeEntity.getTreeName());
        }

        List<T> children = baseTreeEntity.getChildren();
        if(children.isEmpty()) {
            // 如果当前节点没有下级节点，那么当前节点为叶子节点
            baseTreeEntity.setTreeLeaf("1");
        } else {
            baseTreeEntity.setTreeLeaf("0");
        }
        if (baseTreeEntity instanceof DataTreeEntity) {
            DataTreeEntity<?> dataTreeEntity = (DataTreeEntity<?>) baseTreeEntity;
            dataTreeEntity.setStatus(StringUtils.defaultString(dataTreeEntity.getStatus(), "0"));
        }
        for (int i = 1; i <= children.size(); i++) {
            T child = children.get(i - 1);
            child.setTreeSort((child.getTreeSort() == null ? 30 : child.getTreeSort()) * i);
            preSave(child);
        }
    }

}
