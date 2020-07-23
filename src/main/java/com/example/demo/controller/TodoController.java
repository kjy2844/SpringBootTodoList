package com.example.demo.controller;

import com.example.demo.model.TodoItem;
import com.example.demo.service.TodoService;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class TodoController {

    private final TodoService todoService;
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @CrossOrigin
    @GetMapping(value = "/todos")
    public List<TodoItem> findAll(){
        return todoService.findAll();
    }

    @CrossOrigin
    @PostMapping(value = "/todos")
    public TodoItem save(@NotNull @RequestBody TodoItem todoItem){
        return todoService.save(todoItem);
    }

    @CrossOrigin
    @PatchMapping(value = "/todos/{id}")
    public TodoItem update(@NotNull @RequestBody TodoItem todoItem){
        return todoService.save(todoItem);
    }

    @CrossOrigin
    @DeleteMapping(value = "/todos/{id}")
    public void delete(@PathVariable String id){
        todoService.delete(id);
    }

    @CrossOrigin
    @PatchMapping(value = "/todosCheckAll")
    public boolean updateCheckAll(@NotNull @RequestBody Map<String,Boolean> param){
        return todoService.updateCheckAll(param);
    }

    @CrossOrigin
    @DeleteMapping(value = "/todosDeleteCompleted")
    public void deleteCompleted(){
        todoService.deleteCompleted();
    }
}
