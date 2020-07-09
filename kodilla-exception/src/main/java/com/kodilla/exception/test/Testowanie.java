package com.kodilla.exception.test;

import java.io.*;
import java.util.*;

class Testowanie {
    public static void main(String[] args)
    {

        // Declaring the tree map of Integer and String 
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

        // assigning the values in the tree map 
        // using put() 
        treemap.put(2, "two");
        treemap.put(7, "seven");
        treemap.put(3, "three");
        treemap.put(6, "six");
        treemap.put(9, "nine");

        // Use of containsKey 
        // returns true if mapping for the number is present
        if(treemap.containsKey(2) && treemap.containsValue("elf")) {
            System.out.println("jak było?");
        }
        System.out.println("tak było");
    }

}
