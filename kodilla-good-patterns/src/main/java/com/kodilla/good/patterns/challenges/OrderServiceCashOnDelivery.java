package com.kodilla.good.patterns.challenge;
import com.kodilla.good.patterns.challenges.OrderService;
import com.kodilla.good.patterns.challenges.Product;
import com.kodilla.good.patterns.challenges.User;

import java.time.LocalDateTime;

public class OrderServiceCashOnDelivery implements OrderService {
    @Override
    public boolean createOrder(User user, Product product, LocalDateTime orderTime){
        System.out.println("ORDER SERVICE\nproduct: " + product.getProductName() + "\ncustomer: " + user.getNickname()
                + "\ndate of order: " + orderTime + "\nchosen payment method: CoD\n");
        return true;
    }
}