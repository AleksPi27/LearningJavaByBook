package com.company.figure;

public class Triangle extends Figure {
    public Triangle(double a, double b) {
        super(a, b);
    }

    public double area() {
        System.out.println("В области треугольника");
        return dim1 * dim2 / 2;
    }

}
