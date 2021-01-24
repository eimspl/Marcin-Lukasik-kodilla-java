package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MasterTestSuite {
    @Test
    public void notifyAboutNewTask() {
        // Given
        StudentTasks walterWhiteTasks = new StudentTasks(new Student("Walter White"));
        StudentTasks jessiePinkmanTasks = new StudentTasks(new Student("Jessie Pinkman"));
        StudentTasks saulGoodmanTasks = new StudentTasks(new Student("Saul Goodman"));
        StudentTasks lauraFoxTasks = new StudentTasks(new Student("Laura Fox"));

        Master billGates = new Master("Bill Gates");
        Master steveJobs = new Master("Steve Jobs");

        walterWhiteTasks.registerObserver(steveJobs);
        jessiePinkmanTasks.registerObserver(billGates);
        saulGoodmanTasks.registerObserver(billGates);
        lauraFoxTasks.registerObserver(steveJobs);

        //When
        walterWhiteTasks.addTaskToQueue("Task X");
        walterWhiteTasks.addTaskToQueue("Task U");
        saulGoodmanTasks.addTaskToQueue("Task Y");
        walterWhiteTasks.addTaskToQueue("Task X");
        walterWhiteTasks.addTaskToQueue("Task A");
        jessiePinkmanTasks.addTaskToQueue("Task C");
        saulGoodmanTasks.addTaskToQueue("Task W");
        lauraFoxTasks.addTaskToQueue("Task O");

        // Then
        assertEquals(3, billGates.getUpdateCount());
        assertEquals(5, steveJobs.getUpdateCount());

        assertEquals(1, jessiePinkmanTasks.getExercises().size());
        assertEquals(2, saulGoodmanTasks.getExercises().size());
        assertEquals(4, walterWhiteTasks.getExercises().size());
        assertEquals(1, lauraFoxTasks.getExercises().size());

    }
}