package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TaskDao extends CrudRepository<Task, Integer> {

    List<Task> findByDuration(int duration);
}