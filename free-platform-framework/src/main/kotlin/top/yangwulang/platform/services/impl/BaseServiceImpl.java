package top.yangwulang.platform.services.impl;

import cn.hutool.core.lang.TypeReference;
import cn.hutool.extra.spring.SpringUtil;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.sql.ast.mutation.*;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ResolvableType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import top.yangwulang.platform.exception.ServiceException;
import top.yangwulang.platform.security.datascope.DataScopeManager;
import top.yangwulang.platform.services.BaseService;

import java.util.List;
import java.util.Map;

public abstract class BaseServiceImpl<E, ID, P extends JRepository<E, ID>>
        implements BaseService<E, ID, P> {
    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    protected final P repository;
    protected JdbcTemplate jdbcTemplate;

    protected BaseServiceImpl(P repository) {
        this.repository = repository;
    }

    public BaseServiceImpl(P repository, JdbcTemplate jdbcTemplate) {
        this.repository = repository;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public P repository() {
        return repository;
    }

    @Override
    public JRepository.Pager pager(Pageable pageable) {
        return repository.pager(pageable);
    }

    @Override
    public JRepository.Pager pager(int pageIndex, int pageSize) {
        return repository.pager(pageIndex, pageSize);
    }

    @Override
    public E findNullable(ID id) {
        return repository.findNullable(id);
    }

    @Override
    public E findNullable(ID id, Fetcher<E> fetcher) {
        return repository.findNullable(id, fetcher);
    }

    @Override
    public List<E> findByIds(Iterable<ID> ids) {
        return repository.findByIds(ids);
    }

    @Override
    public List<E> findByIds(Iterable<ID> ids, Fetcher<E> fetcher) {
        return repository.findByIds(ids, fetcher);
    }

    @Override
    public Map<ID, E> findMapByIds(Iterable<ID> ids) {
        return repository.findMapByIds(ids);
    }

    @Override
    public Map<ID, E> findMapByIds(Iterable<ID> ids, Fetcher<E> fetcher) {
        return repository.findMapByIds(ids, fetcher);
    }

    @Override
    @NotNull
    public List<E> findAll() {
        return repository.findAll();
    }

    @Override
    public List<E> findAll(TypedProp.Scalar<?, ?>... sortedProps) {
        return repository.findAll(sortedProps);
    }

    @Override
    public List<E> findAll(Fetcher<E> fetcher, TypedProp.Scalar<?, ?>... sortedProps) {
        return repository.findAll(fetcher, sortedProps);
    }

    @Override
    @NotNull
    public List<E> findAll(@NotNull Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public List<E> findAll(Fetcher<E> fetcher, Sort sort) {
        return repository.findAll(fetcher, sort);
    }

    @Override
    public Page<E> findAll(int pageIndex, int pageSize) {
        return repository.findAll(pageIndex, pageSize);
    }

    @Override
    public Page<E> findAll(int pageIndex, int pageSize, Fetcher<E> fetcher) {
        return repository.findAll(pageIndex, pageSize, fetcher);
    }

    @Override
    public Page<E> findAll(int pageIndex, int pageSize, TypedProp.Scalar<?, ?>... sortedProps) {
        return repository.findAll(pageIndex, pageSize, sortedProps);
    }

    @Override
    public Page<E> findAll(int pageIndex, int pageSize, Fetcher<E> fetcher, TypedProp.Scalar<?, ?>... sortedProps) {
        return repository.findAll(pageIndex, pageSize, fetcher, sortedProps);
    }

    @Override
    public Page<E> findAll(int pageIndex, int pageSize, Sort sort) {
        return repository.findAll(PageRequest.of(pageIndex, pageSize, sort), null);
    }

    @Override
    public Page<E> findAll(int pageIndex, int pageSize, Fetcher<E> fetcher, Sort sort) {
        return repository.findAll(pageIndex, pageSize, fetcher, sort);
    }

    @Override
    @NotNull
    public Page<E> findAll(@NotNull Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<E> findAll(Pageable pageable, Fetcher<E> fetcher) {
        return repository.findAll(pageable, fetcher);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    @NotNull
    public <S extends E> SimpleSaveResult<S> save(@NotNull S entity, SaveMode mode) {
        return repository.save(entity, mode);
    }

    @Override
    @NotNull
    public SimpleEntitySaveCommand<E> saveCommand(@NotNull Input<E> input) {
        return repository.saveCommand(input);
    }

    @NotNull
    public <S extends E> SimpleEntitySaveCommand<S> saveCommand(@NotNull S entity) {
        return repository.saveCommand(entity);
    }

    @NotNull
    public <S extends E> BatchSaveResult<S> saveAll(@NotNull Iterable<S> entities, SaveMode mode) {
        return repository.saveAll(entities, mode);
    }

    @NotNull
    public <S extends E> BatchEntitySaveCommand<S> saveAllCommand(@NotNull Iterable<S> entities) {
        return repository.saveAllCommand(entities);
    }

    @Override
    public int delete(@NotNull E entity, DeleteMode mode) {
        return repository.delete(entity, mode);
    }

    @Override
    public int deleteAll(@NotNull Iterable<? extends E> entities, DeleteMode mode) {
        return repository.deleteAll(entities, mode);
    }

    @Override
    public int deleteById(@NotNull ID id, DeleteMode mode) {
        return repository.deleteById(id, mode);
    }

    @Override
    public int deleteByIds(Iterable<? extends ID> ids, DeleteMode mode) {
        return repository.deleteByIds(ids, mode);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }


    public <T extends Table<?>> DataScopeManager<T> dataScopeManager(T... table) {
        try {
            String[] beanNamesForType = SpringUtil
                    .getBeanFactory()
                    .getBeanNamesForType(
                            ResolvableType.forClassWithGenerics(DataScopeManager.class, table.getClass().getComponentType())
                    );
            return SpringUtil.getBean(beanNamesForType[0], DataScopeManager.class);
        } catch (Exception e) {
            log.error("获取数据管理器错误", e);
            throw new ServiceException("当前没有数据权限管理器，请在spring中注入，或者在 " + this.getClass().getName() + " 中重写此方法");
        }
    }

}
