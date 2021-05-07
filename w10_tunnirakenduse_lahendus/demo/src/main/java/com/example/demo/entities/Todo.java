package com.example.demo.entities;

/*import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;



@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoId;

    @NotBlank(message = "To-do description is required!")
    private String description;

    /*@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;*/

    private String date;

    public Todo(){}

    public Todo(String description, String date) {
        this.description = description;
        this.date = date;
    }

    public void setId(long todoId) {
        this.todoId = todoId;
    }
    
    public long getId() {
        return todoId;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Todo{" + "id=" + todoId + ", description=" + description + ", date=" + date + '}';
    }
}
