package com.kodilla.testing.shape;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;


public class ShapeCollectorTestSuite {
    private static int numberOfTest = 1;

    @Before
    public void Before() {
        System.out.println("Start test number: " + numberOfTest);
    }

    @After
    public void After() {
        System.out.println("Stop test number: " + numberOfTest);
        numberOfTest++;
    }

    @Test
    public void testAddFigure() {
        //given
        ShapeCollector objShapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(2.0, 5.0);
        //when
        boolean result = objShapeCollector.addFigure(triangle);
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testRemoveFigureIfExist() {
        //given
        ShapeCollector ShapeCollector = new ShapeCollector();
        Shape square = new Square(2.0);
        ShapeCollector.addFigure(square);
        //when
        boolean result = ShapeCollector.removeFigure(square);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, ShapeCollector.shapesListSize());
    }

    @Test
    public void testRemoveFigureObjectIfNotExist() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(2.0);
        Shape triangle = new Triangle(5.0, 5.0);
        Shape square = new Square(3.4);
        shapeCollector.addFigure(circle);
        //when
        boolean result = shapeCollector.removeFigure(triangle);
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigureOutOfRangeIndex() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(2.0);
        shapeCollector.addFigure(circle);
        //when
        Shape expectedFigure = shapeCollector.getFigure(-1);
        //then
        Assert.assertEquals(null, expectedFigure);
    }

    @Test
    public void testShowFigures() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(2.0);
        shapeCollector.addFigure(circle);
        //when
        //then
        Assert.assertEquals(1, shapeCollector.shapesListSize());
    }
}

