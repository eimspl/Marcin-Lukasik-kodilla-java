package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testThinCrustTomatoSauceHamMushroomsPizzaGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaThinCrustDecorator(theOrder);
        theOrder = new PizzaTomatoSauceDecorator(theOrder);
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaHamDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(30), calculatedCost);
        System.out.println("Ordered pizza price: " + calculatedCost);
    }

    @Test
    public void testThinCrustTomatoSauceCheeseHamMushroomsPizzaGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaThinCrustDecorator(theOrder);
        theOrder = new PizzaTomatoSauceDecorator(theOrder);
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaHamDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Summary ordered pizza description:\n" +
                "*thin crust\n" +
                "*tomato sauce\n" +
                "*cheese\n" +
                "*ham\n" +
                "*mushrooms\n", description);
        System.out.println(description);
    }

    @Test
    public void testThickCrustTomatoSauceCheeseHamMushroomsCornPizzaGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaThickCrustDecorator(theOrder);
        theOrder = new PizzaTomatoSauceDecorator(theOrder);
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaHamDecorator(theOrder);
        theOrder = new PizzaMushroomsDecorator(theOrder);
        theOrder = new PizzaCornDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(31), calculatedCost);
        System.out.println("Summary ordered pizza description: " + calculatedCost);
    }

    @Test
    public void testThickCrustTomatoSauceCheeseCheeseHamMushroomsOnionPizzaGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaThickCrustDecorator(theOrder);
        theOrder = new PizzaTomatoSauceDecorator(theOrder);
        theOrder = new PizzaCheeseDecorator(theOrder);
        theOrder = new PizzaHamDecorator(theOrder);
        theOrder = new PizzaCornDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Summary ordered pizza description:\n" +
                "*thick crust\n" +
                "*tomato sauce\n" +
                "*cheese\n" +
                "*ham\n" +
                "*corn\n", description);
        System.out.println(description);
    }
}