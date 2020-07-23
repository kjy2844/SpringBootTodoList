package com.example.demo;

import com.example.demo.model.TodoItem;
import com.example.demo.repo.TodoRepo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FixedTodoRepo implements TodoRepo {
    private int count;

    public FixedTodoRepo(int count)
    {

        this.count = count;
    }
    @Override
    public List<TodoItem> findByCompleted(boolean completed) {
        return null;
    }

    @Override
    public <S extends TodoItem> S save(S entity) {
        return null;
    }

    @Override
    public <S extends TodoItem> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TodoItem> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<TodoItem> findAll() {
        List<TodoItem> list = new ArrayList<>();
        for (int i = 0;  i < this.count; i++)
        {
            list.add(new TodoItem(String.valueOf(i), "2", false, false));
        }
        return list;
    }

    @Override
    public Iterable<TodoItem> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(TodoItem entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends TodoItem> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<TodoItem> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TodoItem> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TodoItem> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends TodoItem> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends TodoItem> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TodoItem> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TodoItem> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TodoItem> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TodoItem> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TodoItem> boolean exists(Example<S> example) {
        return false;
    }
}
