package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator = new Calculator(3, 5);
        int resultAdd = calculator.add();
        int resultSubtract = calculator.subtract();

        if (resultAdd == 8){
            System.out.println("test Add OK");
        } else {
            System.out.println("Error! - Bad Add");
        }

        if (resultSubtract == -2){
            System.out.println("test Subtract OK");
        } else {
            System.out.println("Error! - Bad Subtract");
        }
    }
}
