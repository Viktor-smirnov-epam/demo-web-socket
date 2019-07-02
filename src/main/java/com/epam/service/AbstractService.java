package com.epam.service;

import com.epam.dao.AbstractRepository;

public abstract class AbstractService<T, ID> implements Service<T, ID> {

    private final AbstractRepository<T, ID> abstractRepository;

    public AbstractService(AbstractRepository<T, ID> abstractRepository) {
        this.abstractRepository = abstractRepository;
    }

    @Override
    public T create(T t) {
        return abstractRepository.save(t);
    }

    @Override
    public T get(ID id) {
        return abstractRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Iterable<T> getAll() {
        return abstractRepository.findAll();
    }

    @Override
    public void delete(ID id) {
        abstractRepository.deleteById(id);
    }
}
