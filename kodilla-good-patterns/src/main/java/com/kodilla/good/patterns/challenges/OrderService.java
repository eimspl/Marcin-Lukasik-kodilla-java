package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {
    boolean createOrder(User user, Product product, LocalDateTime orderTime);
}