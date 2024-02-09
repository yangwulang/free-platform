package top.yangwulang.platform.services;

import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.CollectionUtils;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.spring.repository.support.Utils;
import org.babyfish.jimmer.sql.ast.mutation.*;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.annotation.AliasFor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import top.yangwulang.platform.entity.sys.AreaTable;
import top.yangwulang.platform.security.datascope.DataScopeManager;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public interface BaseService<E, ID, P extends JRepository<E, ID>> {
    P repository();

    JRepository.Pager pager(Pageable pageable);

    JRepository.Pager pager(int pageIndex, int pageSize);

    /*
     * For consumer
     */

    E findNullable(ID id);

    E findNullable(ID id, Fetcher<E> fetcher);

    @NotNull
    default Optional<E> findById(@NotNull ID id) {
        return Optional.ofNullable(findNullable(id));
    }

    @NotNull
    default Optional<E> findById(ID id, Fetcher<E> fetcher) {
        return Optional.ofNullable(findNullable(id, fetcher));
    }

    @AliasFor("findAllById")
    List<E> findByIds(Iterable<ID> ids);

    @AliasFor("findByIds")
    @NotNull
    default List<E> findAllById(@NotNull Iterable<ID> ids) {
        return findByIds(ids);
    }

    List<E> findByIds(Iterable<ID> ids, Fetcher<E> fetcher);

    Map<ID, E> findMapByIds(Iterable<ID> ids);

    Map<ID, E> findMapByIds(Iterable<ID> ids, Fetcher<E> fetcher);

    @NotNull
    List<E> findAll();

    @SuppressWarnings("unchecked")
    List<E> findAll(TypedProp.Scalar<?, ?> ... sortedProps);

    @SuppressWarnings("unchecked")
    List<E> findAll(Fetcher<E> fetcher, TypedProp.Scalar<?, ?> ... sortedProps);

    @NotNull
    List<E> findAll(@NotNull Sort sort);

    List<E> findAll(Fetcher<E> fetcher, Sort sort);

    Page<E> findAll(int pageIndex, int pageSize);

    Page<E> findAll(int pageIndex, int pageSize, Fetcher<E> fetcher);

    @SuppressWarnings("unchecked")
    Page<E> findAll(int pageIndex, int pageSize, TypedProp.Scalar<?, ?> ... sortedProps);

    @SuppressWarnings("unchecked")
    Page<E> findAll(int pageIndex, int pageSize, Fetcher<E> fetcher, TypedProp.Scalar<?, ?> ... sortedProps);

    Page<E> findAll(int pageIndex, int pageSize, Sort sort);

    Page<E> findAll(int pageIndex, int pageSize, Fetcher<E> fetcher, Sort sort);

    @NotNull
    Page<E> findAll(@NotNull Pageable pageable);

    Page<E> findAll(Pageable pageable, Fetcher<E> fetcher);

    default boolean existsById(@NotNull ID id) {
        return findNullable(id) != null;
    }

    long count();

    @NotNull
    default E insert(@NotNull E entity) {
        return save(entity, SaveMode.INSERT_ONLY).getModifiedEntity();
    }

    @NotNull
    default E insert(@NotNull Input<E> input) {
        return save(input.toEntity(), SaveMode.INSERT_ONLY).getModifiedEntity();
    }

    @NotNull
    default E update(@NotNull E entity) {
        return save(entity, SaveMode.UPDATE_ONLY).getModifiedEntity();
    }

    @NotNull
    default E update(@NotNull Input<E> input) {
        return save(input.toEntity(), SaveMode.UPDATE_ONLY).getModifiedEntity();
    }

    @NotNull
    default <S extends E> S save(@NotNull S entity) {
        return saveCommand(entity).execute().getModifiedEntity();
    }

    @NotNull
    default E save(@NotNull Input<E> input) {
        return saveCommand(input.toEntity()).execute().getModifiedEntity();
    }

    @NotNull
    default <S extends E> SimpleSaveResult<S> save(@NotNull S entity, SaveMode mode) {
        return saveCommand(entity).setMode(mode).execute();
    }

    @NotNull
    default SimpleSaveResult<E> save(@NotNull Input<E> input, SaveMode mode) {
        return saveCommand(input.toEntity()).setMode(mode).execute();
    }

    /**
     * Unlike save, merge is significantly different,
     * only the insert and update operations will be executed,
     * dissociation operations will never be executed.
     *
     * <p>Note: The 'merge' of 'Jimmer' and the 'merge' of 'JPA' are completely different concepts!</p>
     */
    default <S extends E> SimpleSaveResult<S> merge(@NotNull S entity) {
        return saveCommand(entity).setMergeMode().execute();
    }

    /**
     * Unlike save, merge is significantly different,
     * only the insert and update operations will be executed,
     * dissociation operations will never be executed.
     *
     * <p>Note: The 'merge' of 'Jimmer' and the 'merge' of 'JPA' are completely different concepts!</p>
     */
    default SimpleSaveResult<E> merge(@NotNull Input<E> input) {
        return saveCommand(input.toEntity()).setMergeMode().execute();
    }

    /**
     * Unlike save, merge is significantly different,
     * only the insert and update operations will be executed,
     * dissociation operations will never be executed.
     *
     * <p>Note: The 'merge' of 'Jimmer' and the 'merge' of 'JPA' are completely different concepts!</p>
     */
    default <S extends E> SimpleSaveResult<S> merge(@NotNull S entity, SaveMode mode) {
        return saveCommand(entity).setMergeMode().setMode(mode).execute();
    }

    /**
     * Unlike save, merge is significantly different,
     * only the insert and update operations will be executed,
     * dissociation operations will never be executed.
     *
     * <p>Note: The 'merge' of 'Jimmer' and the 'merge' of 'JPA' are completely different concepts!</p>
     */
    default SimpleSaveResult<E> merge(@NotNull Input<E> input, SaveMode mode) {
        return saveCommand(input.toEntity()).setMergeMode().setMode(mode).execute();
    }

    @NotNull
    SimpleEntitySaveCommand<E> saveCommand(@NotNull Input<E> input);

    @NotNull
    <S extends E> SimpleEntitySaveCommand<S> saveCommand(@NotNull S entity);

    /**
     * Replaced by saveEntities, will be removed in 1.0
     */
    @Deprecated
    default <S extends E> Iterable<S> saveAll(Iterable<S> entities) {
        return saveEntities(entities);
    }

    @NotNull
    default <S extends E> Iterable<S> saveEntities(@NotNull Iterable<S> entities) {
        return saveEntitiesCommand(Utils.toCollection(entities))
                .execute()
                .getSimpleResults()
                .stream()
                .map(SimpleSaveResult::getModifiedEntity)
                .collect(Collectors.toList());
    }

    @NotNull
    default <S extends E> BatchSaveResult<S> saveEntities(@NotNull Iterable<S> entities, SaveMode mode) {
        return saveEntitiesCommand(Utils.toCollection(entities))
                .setMode(mode)
                .execute();
    }

    @NotNull
    <S extends E> BatchEntitySaveCommand<S> saveEntitiesCommand(@NotNull Iterable<S> entities);

    @NotNull
    default <S extends E> BatchEntitySaveCommand<S> saveInputsCommand(@NotNull Iterable<Input<S>> inputs) {
        return saveEntitiesCommand(CollectionUtils.map(inputs, Input::toEntity));
    }

    default void delete(@NotNull E entity) {
        delete(entity, DeleteMode.AUTO);
    }

    int delete(@NotNull E entity, DeleteMode mode);

    default void deleteAll(@NotNull Iterable<? extends E> entities) {
        deleteAll(entities, DeleteMode.AUTO);
    }

    int deleteAll(@NotNull Iterable<? extends E> entities, DeleteMode mode);

    default void deleteById(@NotNull ID id) {
        deleteById(id, DeleteMode.AUTO);
    }

    int deleteById(@NotNull ID id, DeleteMode mode);

    @AliasFor("deleteAllById")
    default void deleteByIds(Iterable<? extends ID> ids) {
        deleteByIds(ids, DeleteMode.AUTO);
    }

    @AliasFor("deleteByIds")
    default void deleteAllById(@NotNull Iterable<? extends ID> ids) {
        deleteByIds(ids, DeleteMode.AUTO);
    }

    @AliasFor("deleteAllById")
    int deleteByIds(Iterable<? extends ID> ids, DeleteMode mode);


    void deleteAll();

    /**
     * 获取数据权限管理器,^V^,T泛型参数不需要传递,但是需要在调用此处的方法前用钻石符指定table,使用方法:
     * <br/>
     * <code>
     *     xxxService.&lt;xxxTable&gt;dataScopeManager().filter(rootQuery)
     * </code>
     *
     * @param table 泛型table
     * @param <T>   泛型表
     * @return 数据权限管理器
     */
    <T extends Table<?>> DataScopeManager<T> dataScopeManager(T... table);
}
