package com.kodilla.good.patterns.challenges;

public class OrderWarehouseService {
    public void createOrder(User user, Item item) {
        System.out.println("Ordered item: " + item.getItemName() + " for user : " + user.getNickName() + " sent to warehouse");

    }
}