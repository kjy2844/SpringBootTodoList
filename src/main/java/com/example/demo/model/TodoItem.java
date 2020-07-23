package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "Todos")
public class TodoItem {

    @Id
    @Getter @Setter
    private String id;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private boolean completed;
    @Getter @Setter
    private boolean editing;

    public TodoItem() {
    }

    public TodoItem(String id, String title, boolean completed, boolean editing) {
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.editing = editing;
    }

    public TodoItem(String title, boolean completed, boolean editing) {
        this.title = title;
        this.completed = completed;
        this.editing = editing;
    }

}
