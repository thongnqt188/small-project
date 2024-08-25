package edu.poly.asm.service;

import edu.poly.asm.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;


public interface CustomerService {

    List<Customer> findByNameContaining(String name);

    Page<Customer> findByNameContaining(String name, Pageable pageable);

    @Deprecated
    void deleteInBatch(Iterable<Customer> entities);

    void flush();

    <S extends Customer> S saveAndFlush(S entity);

    <S extends Customer> List<S> saveAllAndFlush(Iterable<S> entities);

    void deleteAllInBatch(Iterable<Customer> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    Customer getOne(Long aLong);

    @Deprecated
    Customer getById(Long aLong);

    Customer getReferenceById(Long aLong);

    <S extends Customer> List<S> saveAll(Iterable<S> entities);

    List<Customer> findAll();

    List<Customer> findAllById(Iterable<Long> longs);

    <S extends Customer> S save(S entity);

    Optional<Customer> findById(Long aLong);

    boolean existsById(Long aLong);

    long count();

    void deleteById(Long aLong);

    void delete(Customer entity);

    void deleteAllById(Iterable<? extends Long> longs);

    void deleteAll(Iterable<? extends Customer> entities);

    void deleteAll();

    List<Customer> findAll(Sort sort);

    Page<Customer> findAll(Pageable pageable);
}
