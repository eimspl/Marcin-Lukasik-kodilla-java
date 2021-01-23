package com.kodilla.good.patterns.challenges.foodtodoor.distributors;

import com.kodilla.good.patterns.challenges.foodtodoor.OrderDTO;

public interface FoodDistributor {

    OrderDTO process(OrderDTO order);
    String getDistributorName();

}