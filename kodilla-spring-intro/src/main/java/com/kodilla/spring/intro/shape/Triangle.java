
package com.kodilla.spring.intro.shape;
//dziedziczenie z Figure
/*
public class Triangle extends Figure {
    @Override
    public void draw() {
        System.out.println("This is a triangle");
    }
}
*/
//implementacja z Shape
public class Triangle implements Shape {
    @Override
    public String draw() {
        System.out.println("This is a triangle");
        return "This is a triangle";
    }
}