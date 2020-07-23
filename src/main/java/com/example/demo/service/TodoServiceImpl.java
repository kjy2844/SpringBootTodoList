package com.example.demo.service;

import com.example.demo.model.TodoItem;
import com.example.demo.repo.TodoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepo todoRepo;
    public TodoServiceImpl(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }

    @Override
    public TodoItem save(TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @Override
    public void delete(String id){
        todoRepo.deleteById(id);
    }

    @Override
    public boolean updateCheckAll(Map<String, Boolean> param){
        todoRepo.findAll().forEach(todoItem -> {
            todoItem.setCompleted(param.get("checked"));
            todoRepo.save(todoItem);
        });
        return param.get("checked");
    }

    @Override
    public void deleteCompleted(){
        todoRepo.findByCompleted(true).forEach(todoItem -> {
            todoRepo.delete(todoItem);
        });
    }
}
