package edu.poly.asm.service;

import edu.poly.asm.domain.Category;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Page<Category> findByNameContaining(String name, Pageable pageable);

    List<Category> findByNameContaining(String name);

    void flush();

    Page<Category> findAll(Pageable pageable);

    List<Category> findAll(Sort sort);

    void deleteAll();

    void deleteAll(Iterable<? extends Category> entities);

    void deleteAllById(Iterable<? extends Long> longs);

    void delete(Category entity);

    void deleteById(Long aLong);

    long count();

    boolean existsById(Long aLong);

    Optional<Category> findById(Long aLong);

    <S extends Category> S save(S entity);

    List<Category> findAllById(Iterable<Long> longs);

    List<Category> findAll();

    <S extends Category> List<S> saveAll(Iterable<S> entities);

    <S extends Category> List<S> findAll(Example<S> example, Sort sort);

    <S extends Category> List<S> findAll(Example<S> example);

    Category getReferenceById(Long aLong);

    void deleteAllInBatch();

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch(Iterable<Category> entities);

    <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities);

    <S extends Category> S saveAndFlush(S entity);

    @Deprecated
    Category getById(Long aLong);

    @Deprecated
    Category getOne(Long aLong);
}
