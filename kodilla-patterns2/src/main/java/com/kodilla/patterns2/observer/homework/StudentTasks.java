package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class StudentTasks implements QueueObservable {
    private final Student student;
    private final Deque<String> exercises;
    private final List<MasterObserver> observers;

    public StudentTasks(Student student) {
        this.student = student;
        exercises = new ArrayDeque<>();
        observers = new ArrayList<>();
    }

    public void addTaskToQueue(String task) {
        exercises.offerLast(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(MasterObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (MasterObserver observer : observers) {
            observer.notifyAboutNewTask(this);
        }
    }

    @Override
    public void removeObserver(MasterObserver observer) {
        observers.remove(observer);
    }

    public Student getStudent() {
        return student;
    }

    public Deque<String> getExercises() {
        return exercises;
    }
}