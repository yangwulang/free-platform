package top.yangwulang.platform.services

import org.apache.commons.lang3.StringUtils
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import top.yangwulang.platform.entity.BaseTreeEntity
import top.yangwulang.platform.event.jpa.TreeSaveEvent
import top.yangwulang.platform.exception.ServiceException

abstract class BaseTreeServiceImpl<T, ID, DTO, REPO> : BaseServiceImpl<T, ID, DTO, REPO>()
        where REPO : JpaRepository<T, ID>, REPO : JpaSpecificationExecutor<T> {

    protected val treeSaveEvent =  TreeSaveEvent()

    protected fun preSave(dto: T) {
        if (dto is BaseTreeEntity<*>) {
            if (dto.getParent() != null && !StringUtils.isBlank(dto.getParent().getId())
                && "0" != dto.getParent().getId()
            ) {
                val parent = repository.findById(dto.getParent().getId() as ID?).orElseThrow{
                    ServiceException("")
                }
                dto.setParent(parent as Nothing?)
            }
            treeSaveEvent.preInsert(dto)
        }
    }
}