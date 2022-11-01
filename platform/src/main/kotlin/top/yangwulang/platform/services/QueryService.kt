package top.yangwulang.platform.services

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import top.yangwulang.platform.entity.book.BookCategory
import top.yangwulang.platform.entity.book.dto.BookCategoryDto

interface QueryService<T, ID, DTO> {

    fun findList(
        dto: DTO
    ): List<T>

    fun findPage(
        dto: DTO,
        pageable: Pageable
    ): Page<T>

    fun findById(id: ID): T?

}