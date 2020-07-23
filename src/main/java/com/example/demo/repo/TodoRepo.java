package com.example.demo.repo;

import com.example.demo.model.TodoItem;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepo extends MongoRepository<TodoItem, String> {
    public List<TodoItem> findByCompleted(boolean completed);
}
