package com.kodilla.good.patterns.challenges.foodtodoor;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        OrdersSample ordersList = new OrdersSample();
        ArrayList<OrderDTO> orders = ordersList.retrieve();
        Food2Door food2Door = new Food2Door();
        for (OrderDTO order: orders) {
            food2Door.order(order);

        }
    }
}