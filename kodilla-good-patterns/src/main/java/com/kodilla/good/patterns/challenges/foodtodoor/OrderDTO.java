package com.kodilla.good.patterns.challenges.foodtodoor;


import com.kodilla.good.patterns.challenges.foodtodoor.distributors.FoodDistributor;

import java.time.LocalDateTime;

public class OrderDTO {
    private boolean isOrdered;
    private LocalDateTime orderTime;
    private String foodDistributor;
    private Product product;
    private int quantity;

    public OrderDTO(final boolean isOrdered,
                    final LocalDateTime orderTime,
                    final String foodDistributor,
                    final Product product,
                    final int quantity) {
        this.isOrdered = isOrdered;
        this.orderTime = orderTime;
        this.foodDistributor = foodDistributor;
        this.product = product;
        this.quantity = quantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public String getFoodDistributor() {
        return foodDistributor;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}