package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite {
    public int[] generateArray(int n) {
        Random randomNumbers = new Random();
        int listNumbers[] = new int[n];

        for (int i = 0; i < n; i++) {
            int number = randomNumbers.nextInt(10);
            listNumbers[i] = number;
        }
        return listNumbers;
    }
    @Test
    public void testGetAverage() {
        //given
        double sum = 0.0;
        int numbers[] = generateArray(30);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        //when
        double expectedAverage = sum/numbers.length;
        double actualAverage = ArrayOperations.getAverage(numbers);
        //then
        Assert.assertEquals(expectedAverage,actualAverage,0);
    }
}