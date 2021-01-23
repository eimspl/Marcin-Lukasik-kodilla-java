package com.kodilla.good.patterns.challenges.foodtodoor;

import com.kodilla.good.patterns.challenges.foodtodoor.distributors.FoodDistributor;

import java.time.format.DateTimeFormatter;

public class Food2Door {
    public boolean order(OrderDTO orderDTO) {
        FoodDistributor distributor = DistributorFactory.getDistributor(orderDTO.getFoodDistributor());
        OrderDTO result = distributor.process(orderDTO);
        if (result.isOrdered()) {
            System.out.println("INFO O ZAMÓWIENIU:"
                    + "\ndata: " + result.getOrderTime().format(DateTimeFormatter.ISO_DATE)
                    + ", godzina: " + result.getOrderTime().format(DateTimeFormatter.ISO_TIME)
                    + "\ntowar: " + result.getProduct().getProductName()
                    + "\nilość: " + result.getQuantity()
                    + "\ndostawca: " + result.getFoodDistributor() + "\n");
        }
        return result.isOrdered();
    }
}
