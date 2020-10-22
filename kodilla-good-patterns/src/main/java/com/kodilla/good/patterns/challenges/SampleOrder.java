package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SampleOrder {

    public Order retrieve() {

        User sampleUser = new User("testowy", "Stanislaw", "Testowy");
        Product sampleProduct = new Product("Vacuum Cleaner");
        LocalDateTime sampleOrderTime = LocalDateTime.of(2020, 10, 22, 12, 8, 00);

        return new Order(sampleUser, sampleProduct, sampleOrderTime);

    }

}