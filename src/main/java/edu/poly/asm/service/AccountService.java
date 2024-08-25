package edu.poly.asm.service;

import edu.poly.asm.domain.Account;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface AccountService {
    Account login(String username, String password);

    void flush();

    void deleteAllByIdInBatch(Iterable<String> strings);

    <S extends Account> Page<S> findAll(Example<S> example, Pageable pageable);

    Optional<Account> findById(String s);

    void deleteAllInBatch(Iterable<Account> entities);

    <S extends Account> List<S> saveAll(Iterable<S> entities);

    void deleteAll();

    void deleteAllInBatch();

    List<Account> findAllById(Iterable<String> strings);

    List<Account> findAll();

    List<Account> findAll(Sort sort);

    @Deprecated
    Account getOne(String s);

    Page<Account> findAll(Pageable pageable);

    <S extends Account> boolean exists(Example<S> example);

    <S extends Account> long count(Example<S> example);

    @Deprecated
    Account getById(String s);

    boolean existsById(String s);

    <S extends Account> S saveAndFlush(S entity);

    <S extends Account> List<S> findAll(Example<S> example);

    <S extends Account> Optional<S> findOne(Example<S> example);

    Account getReferenceById(String s);

    void deleteById(String s);

    <S extends Account> List<S> saveAllAndFlush(Iterable<S> entities);

    long count();

    <S extends Account, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);

    void deleteAll(Iterable<? extends Account> entities);

    <S extends Account> S save(S entity);

    void deleteAllById(Iterable<? extends String> strings);

    <S extends Account> List<S> findAll(Example<S> example, Sort sort);

    @Deprecated
    void deleteInBatch(Iterable<Account> entities);

    void delete(Account entity);
}
