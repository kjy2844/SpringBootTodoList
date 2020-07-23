package com.example.demo.service;

import com.example.demo.model.TodoItem;

import java.util.List;
import java.util.Map;

public interface TodoService {
    List<TodoItem> findAll();

    TodoItem save(TodoItem todoItem);

    void delete(String id);

    boolean updateCheckAll(Map<String, Boolean> param);

    void deleteCompleted();
}
