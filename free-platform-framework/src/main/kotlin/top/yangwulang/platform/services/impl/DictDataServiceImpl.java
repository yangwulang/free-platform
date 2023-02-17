package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;
import top.yangwulang.platform.entity.sys.input.DictDataInput;
import top.yangwulang.platform.repository.sys.DictDataRepository;
import top.yangwulang.platform.services.DictDataService;

@Service
public class DictDataServiceImpl implements DictDataService {

    @Autowired
    private DictDataRepository dictDataRepository;

    @Override
    public DictData save(DictDataInput dictDataInput) {
        DictData parent;
        if (dictDataInput.getParentId() != null) {
            parent = DictDataDraft.$.produce(df -> df.setId(dictDataInput.getParentId()));
        } else if (dictDataInput.getParent() != null) {
            parent = DictDataDraft.$.produce(df -> df.setId(dictDataInput.getParent().getId()));
        } else {
            parent = DictDataRepository.ROOT;
        }
        return dictDataRepository.save(DictDataDraft.$.produce(dictDataInput.toEntity(), d -> d.setParent(parent)));
    }
}
