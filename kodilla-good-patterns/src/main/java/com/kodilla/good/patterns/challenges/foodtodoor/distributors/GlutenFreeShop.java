package com.kodilla.good.patterns.challenges.foodtodoor.distributors;

import com.kodilla.good.patterns.challenges.foodtodoor.Order;
import com.kodilla.good.patterns.challenges.foodtodoor.OrderDTO;

import java.util.Random;

public class GlutenFreeShop implements FoodDistributor {
    private static final String NAME = "Gluten Free Shop";

    @Override
    public OrderDTO process(Order order) {
        boolean isOrdered = new Random().nextInt(2)>0;

        if (isOrdered) {
            System.out.println("Order number " + order.getOrderNumber() + " sended!");
            return new OrderDTO(true,
                    order.getOrderTime(),
                    order.getFoodDistributor(),
                    order.getProduct(),
                    order.getQuantity());
        } else {
            System.out.println("Zamówienie " + order.getOrderNumber() + " nie zostało zrealizowane. Skontaktuj się z glutenfreeshop@gmail.com\n");
            return new OrderDTO(false,
                    order.getOrderTime(),
                    order.getFoodDistributor(),
                    order.getProduct(),
                    order.getQuantity());
        }
    }

    @Override
    public String getDistributorName() {
        return NAME;
    }
}
