package com.example.demo;

import com.example.demo.model.TodoItem;
import com.example.demo.repo.TodoRepo;
import com.example.demo.service.TodoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;

@SpringBootTest
public class TodoServiceMockTest {

    @Mock
    private TodoRepo todoRepo;

    @InjectMocks
    private TodoServiceImpl todoServiceImpl;

    @Test
    @DisplayName("mockito repository test")
    void mockTodoRepositoryTest() {
        //given
        TodoItem todoItem1 = new TodoItem("i", "2", false, false);
        List<TodoItem> todoItemList = new ArrayList<>();
        todoItemList.add(todoItem1);

        given(todoRepo.findAll()).willReturn(todoItemList);

        //when
        List<TodoItem> findTodoItems = todoRepo.findAll();
        System.out.println("findTodoItems = " + findTodoItems);

        //then
        Assertions.assertEquals(1, findTodoItems.size());
        Assertions.assertEquals(todoItem1.getId(), findTodoItems.get(0).getId());
    }

    @Test
    @DisplayName("mockito service test")
    void mockTodoServiceTest() {
        //given
        TodoItem todoItem1 = new TodoItem("i", "2", false, false);
        List<TodoItem> todoItemList = new ArrayList<>();
        todoItemList.add(todoItem1);

        given(todoRepo.findAll()).willReturn(todoItemList);

        //when
        List<TodoItem> findTodoItems = todoServiceImpl.findAll();
        System.out.println("findTodoItems = " + findTodoItems);

        //then
        Assertions.assertEquals(1, findTodoItems.size());
        Assertions.assertEquals(todoItem1.getId(), findTodoItems.get(0).getId());
    }
}
