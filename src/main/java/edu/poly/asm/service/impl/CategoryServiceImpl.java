package edu.poly.asm.service.impl;

import edu.poly.asm.domain.Category;
import edu.poly.asm.repository.CategoryRepository;
import edu.poly.asm.service.CategoryService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Page<Category> findByNameContaining(String name, Pageable pageable) {
        return categoryRepository.findByNameContaining(name, pageable);
    }

    @Override
    public List<Category> findByNameContaining(String name) {
        return categoryRepository.findByNameContaining(name);
    }

    @Override
    public void flush() {
        categoryRepository.flush();
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public List<Category> findAll(Sort sort) {
        return categoryRepository.findAll(sort);
    }

    @Override
    public void deleteAll() {
        categoryRepository.deleteAll();
    }

    @Override
    public void deleteAll(Iterable<? extends Category> entities) {
        categoryRepository.deleteAll(entities);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        categoryRepository.deleteAllById(longs);
    }

    @Override
    public void delete(Category entity) {
        categoryRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) {
        categoryRepository.deleteById(aLong);
    }

    @Override
    public long count() {
        return categoryRepository.count();
    }

    @Override
    public boolean existsById(Long aLong) {
        return categoryRepository.existsById(aLong);
    }

    @Override
    public Optional<Category> findById(Long aLong) {
        return categoryRepository.findById(aLong);
    }

    @Override
    public <S extends Category> S save(S entity) {

        return categoryRepository.save(entity);
    }

    @Override
    public List<Category> findAllById(Iterable<Long> longs) {
        return categoryRepository.findAllById(longs);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public <S extends Category> List<S> saveAll(Iterable<S> entities) {
        return categoryRepository.saveAll(entities);
    }

    @Override
    public <S extends Category> List<S> findAll(Example<S> example, Sort sort) {
        return categoryRepository.findAll(example, sort);
    }

    @Override
    public <S extends Category> List<S> findAll(Example<S> example) {
        return categoryRepository.findAll(example);
    }

    @Override
    public Category getReferenceById(Long aLong) {
        return categoryRepository.getReferenceById(aLong);
    }

    @Override
    public void deleteAllInBatch() {
        categoryRepository.deleteAllInBatch();
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        categoryRepository.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch(Iterable<Category> entities) {
        categoryRepository.deleteAllInBatch(entities);
    }

    @Override
    public <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities) {
        return categoryRepository.saveAllAndFlush(entities);
    }

    @Override
    public <S extends Category> S saveAndFlush(S entity) {
        return categoryRepository.saveAndFlush(entity);
    }

    @Override
    @Deprecated
    public Category getById(Long aLong) {
        return categoryRepository.getById(aLong);
    }

    @Override
    @Deprecated
    public Category getOne(Long aLong) {
        return categoryRepository.getOne(aLong);
    }
}
