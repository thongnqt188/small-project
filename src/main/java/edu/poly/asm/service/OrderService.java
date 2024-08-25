package edu.poly.asm.service;

import edu.poly.asm.domain.Order;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface OrderService {

//    List<Order> findById(String name);
//
//    Page<Order> findAll(Pageable pageable);

    void deleteAll();

    void deleteAllInBatch(Iterable<Order> entities);

    <S extends Order> List<S> saveAll(Iterable<S> entities);

    <S extends Order> S save(S entity);

    <S extends Order> List<S> findAll(Example<S> example, Sort sort);

    @Deprecated
    void deleteInBatch(Iterable<Order> entities);

    boolean existsById(Long aLong);

    void deleteAllInBatch();

    void deleteAllById(Iterable<? extends Long> longs);

    Optional<Order> findById(Long aLong);

    <S extends Order> Page<S> findAll(Example<S> example, Pageable pageable);

    void deleteAll(Iterable<? extends Order> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

//    Page<Order> findById(String name, Pageable pageable);

    @Deprecated
    Order getById(Long aLong);

    long count();

    <S extends Order> boolean exists(Example<S> example);

    void flush();

    void deleteById(Long aLong);

    @Deprecated
    Order getOne(Long aLong);

    <S extends Order> long count(Example<S> example);

    void delete(Order entity);

    List<Order> findAllById(Iterable<Long> longs);

    <S extends Order> Optional<S> findOne(Example<S> example);

    <S extends Order> List<S> saveAllAndFlush(Iterable<S> entities);

    Order getReferenceById(Long aLong);

    <S extends Order> S saveAndFlush(S entity);

    <S extends Order> List<S> findAll(Example<S> example);

    List<Order> findAll(Sort sort);

    <S extends Order, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);

    List<Order> findAll();
}
