package com.kodilla.spring.calculator;


import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double adding = calculator.add(1,1);
        double subbing = calculator.sub(1,1);
        double muling = calculator.mul(1,1);
        double diving = calculator.div(1,1);
        //Then
        Assert.assertEquals(2.0, adding, 0.0);
        Assert.assertEquals(0.0, subbing, 0.0);
        Assert.assertEquals(1.0, muling, 0.0);
        Assert.assertEquals(1.0, diving, 0.0);
    }
}