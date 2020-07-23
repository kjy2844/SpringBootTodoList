package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class MockTodoControllerTest {

    private MockMvc mockMvc;

    public MockTodoControllerTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

//    @MockBean
//    TodoController todoController;

//    @BeforeEach
//    public void setup() {
//        mockMvc = MockMvcBuilders.standaloneSetup(todoController).build();
//    }

    @Test
    public void getTodoTest() throws Exception {
        mockMvc.perform(get("/todos"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }

}
