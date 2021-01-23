package com.kodilla.good.patterns.challenges.foodtodoor;

import com.kodilla.good.patterns.challenges.foodtodoor.distributors.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.foodtodoor.distributors.FoodDistributor;
import com.kodilla.good.patterns.challenges.foodtodoor.distributors.GlutenFreeShop;

public class DistributorFactory {
    public static final String EXTRA_FOOD_SHOP = "ExtraFoodShop";
    public static final String GLUTEN_FREE_SHOP = "GlutenFreeShop";

    public static FoodDistributor getDistributor(String foodDistributor) {

        if(foodDistributor.equals(EXTRA_FOOD_SHOP))
            return new ExtraFoodShop();
        else if (foodDistributor.equals(GLUTEN_FREE_SHOP))
            return  new GlutenFreeShop();
        else
            return null;
    }
}
