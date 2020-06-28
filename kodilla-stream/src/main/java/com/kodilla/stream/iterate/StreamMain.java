package com.kodilla.stream.iterate;

import com.kodilla.stream.beautifier.MyBeautyfier;
import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}