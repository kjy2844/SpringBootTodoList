package com.example.demo;

import com.example.demo.model.TodoItem;
import com.example.demo.service.TodoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class WebTestClientTodoControllerTest {

    @Autowired
    WebTestClient webTestClient;

    @MockBean
    TodoService mockTodoService;

    @Test
    public void hello() {
        TodoItem todoItem1 = new TodoItem("i", "2", false, false);
        List<TodoItem> todoItemList = new ArrayList<>();
        todoItemList.add(todoItem1);

        when(mockTodoService.findAll()).thenReturn(todoItemList);
        webTestClient.get().uri("/todos").exchange()
                .expectStatus().isOk();
//                .returnResult(todoItemList.getClass())
//                .getResponseBodyContent();
//        String text = new String(content, StandardCharsets.UTF_8);
//        System.out.println(text);
    }

}
