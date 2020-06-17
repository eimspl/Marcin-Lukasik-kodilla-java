//Exercise 6.3
package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.lang.*;
import java.util.List;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> listOfEvenNumbers = new ArrayList<Integer>();
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                listOfEvenNumbers.add(i);
            }
        }
        return listOfEvenNumbers;
    }
}