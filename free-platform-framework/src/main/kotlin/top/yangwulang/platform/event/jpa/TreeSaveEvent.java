package top.yangwulang.platform.event.jpa;

import cn.hutool.core.util.ReflectUtil;
import org.apache.commons.lang3.StringUtils;
import top.yangwulang.platform.entity.BaseTreeEntity;

import javax.persistence.PrePersist;
import java.util.List;

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
        for (int i = 1; i <= children.size(); i++) {
            T child = children.get(i - 1);
            child.setTreeSort((child.getTreeSort() == null ? 30 : child.getTreeSort()) * i);
            preSave(child);
        }
    }

}
