package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {
    private static int numberCollection;

    @Before
    public void before() {
        System.out.println("Start test " + numberCollection);
    }
    @After
    public void after() {
        System.out.println("End test " + numberCollection);
        numberCollection++;
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator listOfNumbers = new OddNumbersExterminator();
        listOfNumbers.exterminate(numbers);
        ArrayList<Integer> listEven = listOfNumbers.exterminate(numbers);
        Assert.assertEquals(numbers.isEmpty(), listEven.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(11);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(numbers);
        ArrayList<Integer> listOfEvenNumbers = oddNumbersExterminator.exterminate(numbers);
    }
}