//package com.example.demo;

//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.when;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//public class RandomPortTodoControllerTest {
//
//    @Autowired
//    TestRestTemplate testRestTemplate;
//
//    @MockBean
//    TodoService mockTodoService;
//
//    @Test
//    public void getTodoTest() {
//        TodoItem todoItem1 = new TodoItem("i", "2", false, false);
//        List<TodoItem> todoItemList = new ArrayList<>();
//        todoItemList.add(todoItem1);
//
//        when(mockTodoService.findAll()).thenReturn(todoItemList);
//
//        List<TodoItem> result = testRestTemplate.getForObject("/todos", List<TodoItem>);
//        Assertions.assertThat(result).isEqualTo(todoItemList);
//
//    }
//}
