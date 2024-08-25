package edu.poly.asm.service;

import edu.poly.asm.domain.Product;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface ProductService {

    Page<Product> findByNameContaining(String name, Pageable pageable);

    List<Product> findByNameContaining(String name);

    void flush();

    <S extends Product> List<S> findAll(Example<S> example, Sort sort);

    void deleteAllById(Iterable<? extends Long> longs);

    <S extends Product> S save(S entity);

    <S extends Product> List<S> saveAllAndFlush(Iterable<S> entities);

    <S extends Product> List<S> findAll(Example<S> example);

    Page<Product> findAll(Pageable pageable);

    <S extends Product> S saveAndFlush(S entity);

    void deleteAll(Iterable<? extends Product> entities);

    void deleteById(Long aLong);

    <S extends Product> Optional<S> findOne(Example<S> example);

    void deleteAllInBatch(Iterable<Product> entities);

    @Deprecated
    void deleteInBatch(Iterable<Product> entities);

    void delete(Product entity);

    @Deprecated
    Product getOne(Long aLong);

    <S extends Product> boolean exists(Example<S> example);

    void deleteAllInBatch();

    List<Product> findAllById(Iterable<Long> longs);

    long count();

    List<Product> findAll();

    <S extends Product, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    List<Product> findAll(Sort sort);

    Optional<Product> findById(Long aLong);

    <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable);

    Product getReferenceById(Long aLong);

    <S extends Product> List<S> saveAll(Iterable<S> entities);

    void deleteAll();

    boolean existsById(Long aLong);

    @Deprecated
    Product getById(Long aLong);

    <S extends Product> long count(Example<S> example);
}
