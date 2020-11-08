package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.*;

@Configuration
public class BoardConfig {



    @Bean
    public Board getBoard(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        return new Board(toDoList, inProgressList, doneList);
    }
    @Bean                          //(name="toDoList")
    public TaskList toDoList() {
        return new TaskList();
    }
    @Bean
    public TaskList inProgressList() {
        return new TaskList();
    }
    @Bean
    public TaskList doneList() {
        return new TaskList();
    }
}