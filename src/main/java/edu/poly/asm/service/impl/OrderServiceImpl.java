package edu.poly.asm.service.impl;

import edu.poly.asm.domain.Order;
import edu.poly.asm.repository.OrderRepository;
import edu.poly.asm.service.OrderService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

//    @Override
//    public List<Order> findById(String name) {
//        return orderRepository.findById(name);
//    }
//
//    @Override
//    public Page<Order> findAll(Pageable pageable) {
//        return orderRepository.findAll(pageable);
//    }

    @Override
    public void deleteAll() {
        orderRepository.deleteAll();
    }

    @Override
    public void deleteAllInBatch(Iterable<Order> entities) {
        orderRepository.deleteAllInBatch(entities);
    }

    @Override
    public <S extends Order> List<S> saveAll(Iterable<S> entities) {
        return orderRepository.saveAll(entities);
    }

    @Override
    public <S extends Order> S save(S entity) {
        return orderRepository.save(entity);
    }

    @Override
    public <S extends Order> List<S> findAll(Example<S> example, Sort sort) {
        return orderRepository.findAll(example, sort);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Order> entities) {
        orderRepository.deleteInBatch(entities);
    }

    @Override
    public boolean existsById(Long aLong) {
        return orderRepository.existsById(aLong);
    }

    @Override
    public void deleteAllInBatch() {
        orderRepository.deleteAllInBatch();
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        orderRepository.deleteAllById(longs);
    }

    @Override
    public Optional<Order> findById(Long aLong) {
        return orderRepository.findById(aLong);
    }

    @Override
    public <S extends Order> Page<S> findAll(Example<S> example, Pageable pageable) {
        return orderRepository.findAll(example, pageable);
    }

    @Override
    public void deleteAll(Iterable<? extends Order> entities) {
        orderRepository.deleteAll(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        orderRepository.deleteAllByIdInBatch(longs);
    }

//    @Override
//    public Page<Order> findById(String name, Pageable pageable) {
//        return orderRepository.findById(name, pageable);
//    }

    @Override
    @Deprecated
    public Order getById(Long aLong) {
        return orderRepository.getById(aLong);
    }

    @Override
    public long count() {
        return orderRepository.count();
    }

    @Override
    public <S extends Order> boolean exists(Example<S> example) {
        return orderRepository.exists(example);
    }

    @Override
    public void flush() {
        orderRepository.flush();
    }

    @Override
    public void deleteById(Long aLong) {
        orderRepository.deleteById(aLong);
    }

    @Override
    @Deprecated
    public Order getOne(Long aLong) {
        return orderRepository.getOne(aLong);
    }

    @Override
    public <S extends Order> long count(Example<S> example) {
        return orderRepository.count(example);
    }

    @Override
    public void delete(Order entity) {
        orderRepository.delete(entity);
    }

    @Override
    public List<Order> findAllById(Iterable<Long> longs) {
        return orderRepository.findAllById(longs);
    }

    @Override
    public <S extends Order> Optional<S> findOne(Example<S> example) {
        return orderRepository.findOne(example);
    }

    @Override
    public <S extends Order> List<S> saveAllAndFlush(Iterable<S> entities) {
        return orderRepository.saveAllAndFlush(entities);
    }

    @Override
    public Order getReferenceById(Long aLong) {
        return orderRepository.getReferenceById(aLong);
    }

    @Override
    public <S extends Order> S saveAndFlush(S entity) {
        return orderRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Order> List<S> findAll(Example<S> example) {
        return orderRepository.findAll(example);
    }

    @Override
    public List<Order> findAll(Sort sort) {
        return orderRepository.findAll(sort);
    }

    @Override
    public <S extends Order, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return orderRepository.findBy(example, queryFunction);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}
