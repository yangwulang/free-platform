package top.yangwulang.platform.services

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import top.yangwulang.platform.entity.book.BookCategory
import top.yangwulang.platform.entity.book.dto.BookCategoryDto

/**
 * service层顶级的通用查询接口
 * @author yangwulang
 */
interface QueryService<T, ID, DTO> {
    /**
     * 根据实体构建一个默认的查询List数据
     *
     * @return 根据条件查询出的实体数据
     */
    fun findList(
        dto: DTO
    ): List<T>

    /**
     * 自定义调价查询实体数据
     *
     * @return 根据条件查询出的实体数据
     */
    fun findList(
        spec: Specification<T>
    ): List<T>

    /**
     * 自定义调价查询实体分页数据
     *
     *  @return 根据条件查询出的实体分页数据
     */
    fun findPage(
        dto: DTO,
        pageable: Pageable
    ): Page<T>

    /**
     * 通过主键查询实体信息
     *
     * @return 实体信息
     */
    fun findById(id: ID): T?

}