package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.entities.Todo;
import com.example.demo.repositories.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {
    
    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todoindex")
    public String displayTodos(Model model){
        model.addAttribute("todos", todoRepository.findAll());
        return "todoindex";
    }

    @GetMapping("/addtodo")
    public String showTodo(Todo todo){
        return "addtodo";
    }

    @PostMapping("/newtodo")
    public String addNewTodo(@Valid Todo todo, BindingResult result, Model model){
        System.out.println(result);
        if (result.hasErrors()){
            return "addtodo";
        }

        todoRepository.save(todo);
        return "redirect:/todoindex";
    }

    @GetMapping("/edittodo/{todo.id}")
    public String showUpdateTodo(@PathVariable("todo.id") long todoId, Model model){
        Todo todo = todoRepository.findById(todoId)
            .orElseThrow(() -> new IllegalArgumentException("No such todo with a following ID: " + todoId));
        model.addAttribute("todo", todo);
        
        return "updatetodo";
    }

    @PostMapping("/updatetodo/{todo.id}")
    public String updateTodo(@PathVariable("todo.id") long todoId, @Valid Todo todo, BindingResult result, Model model){
        if (result.hasErrors()){
            return "updatetodo";
        }

        todoRepository.save(todo);

        return "redirect:/todoindex";
    }

    @GetMapping("/deletetodo/{todo.id}")
    public String deleteTodo(@PathVariable("todo.id") long todoId, Model model){
        Todo todo = todoRepository.findById(todoId)
            .orElseThrow(() -> new IllegalArgumentException("No such todo with a following ID: " + todoId));

        todoRepository.delete(todo);

        return "redirect:/todoindex";
    }
}
