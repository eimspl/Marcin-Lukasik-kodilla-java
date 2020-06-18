//Exercise 6.3
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
        //given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator listOfNumbers = new OddNumbersExterminator();
        listOfNumbers.exterminate(numbers);
        //when
        ArrayList<Integer> listEven = listOfNumbers.exterminate(numbers);
        //then
        Assert.assertTrue(numbers.isEmpty());                                 //Assert.assertEquals(numbers.isEmpty(), listEven.isEmpty()); propozycja zamiany od mentora
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(11);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(numbers);
        //when
        ArrayList<Integer> listOfEvenNumbers = oddNumbersExterminator.exterminate(numbers);
        //then
        for(int i : listOfEvenNumbers) {
            int temporary = i % 2;
            Assert.assertEquals(temporary, 0);
        }
    }
}