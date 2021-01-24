package com.kodilla.patterns2.observer.homework;

public class Master implements MasterObserver {
    private final String name;
    private int updateCount;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void notifyAboutNewTask(StudentTasks studentTasks) {
        updateCount++;
        System.out.println("Dear Master, " + name + "! Your student " + studentTasks.getStudent().getName() +
                " send task to you: " + studentTasks.getExercises().peekLast() +
                ". Total tasks from him: " + studentTasks.getExercises().size() +
                ". All tasks on your account: " + updateCount);
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}