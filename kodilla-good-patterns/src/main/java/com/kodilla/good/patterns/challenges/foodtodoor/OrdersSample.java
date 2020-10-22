package com.kodilla.good.patterns.challenges.foodtodoor;

import com.kodilla.good.patterns.challenges.foodtodoor.distributors.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrdersSample {
    private ArrayList<Order> ordersList = new ArrayList<>();

    public ArrayList<Order> retrieve() {

        FoodDistributor extraFoodShop = new ExtraFoodShop();
        FoodDistributor glutenFreeShop = new GlutenFreeShop();

        Product beer = new Product("Piwo");
        Product vodka = new Product("Wódka");;

        ordersList.add(new Order(10051, LocalDateTime.of(2020,10,22,12,22,34),
                extraFoodShop, beer, 200));
        ordersList.add(new Order(10052, LocalDateTime.of(2020,10,22,12,31,11),
                glutenFreeShop, vodka, 100));

        return new ArrayList<>(ordersList);
    }
}
