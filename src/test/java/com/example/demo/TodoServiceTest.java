package com.example.demo;

import com.example.demo.repo.TodoRepo;
import com.example.demo.service.TodoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TodoServiceTest {
    @Test
//    @InlineData(0)
//    @InlineData(1)
//    @InlineData(2)
//    @InlineData(100)
    void findAll()
    {
        TodoRepo repo = new FixedTodoRepo(3);
        TodoServiceImpl service = new TodoServiceImpl(repo);
        assert(service.findAll().size() == 3);
    }
}
