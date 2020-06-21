package com.kodilla.testing.shape;

class Triangle implements Shape {

    private Double sideA;
    private Double heightH;

    public Triangle(Double sideA, Double heightH) {
        this.sideA = sideA;
        this.heightH = heightH;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public Double getField() {
        return 0.5 * sideA * heightH;
    }
}
