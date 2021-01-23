package com.kodilla.good.patterns.challenges.foodtodoor;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrdersSample {
    private ArrayList<OrderDTO> ordersList = new ArrayList<>();

    public ArrayList<OrderDTO> retrieve() {



        Product beer = new Product("Piwo");
        Product vodka = new Product("Wódka");;

        ordersList.add(new OrderDTO( true, LocalDateTime.of(2020,10,22,12,22,34),
                DistributorFactory.EXTRA_FOOD_SHOP, beer, 200));
        ordersList.add(new OrderDTO(true, LocalDateTime.of(2020,10,22,12,31,11),
                DistributorFactory.GLUTEN_FREE_SHOP, vodka, 100));

        return new ArrayList<>(ordersList);
    }
}
