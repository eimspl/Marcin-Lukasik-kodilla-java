package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final static String DRIVING_TASK = "DRIVINGTASK";
    public final static String SHOPPING_TASK = "SHOPPINGTASK";
    public final static String PAINTING_TASK = "PAINTNGTASK";


    public final Task generateTask(final String newTask) {

        switch (newTask) {
            case DRIVING_TASK:
                return new DrivingTask("Trip", "Abudabi", "Airplane");
            case SHOPPING_TASK:
                return new ShoppingTask("Buy", "drill", 2.5);
            case PAINTING_TASK:
                return new PaintingTask("Painting", "yellow", "car");
            default:
                throw new IllegalArgumentException("Wrong name!");
        }
    }
}