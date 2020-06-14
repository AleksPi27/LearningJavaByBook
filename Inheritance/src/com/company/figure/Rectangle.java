package com.company.figure;

public class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    public double area() {
        System.out.println("В области четырехугольника");
        return dim1 * dim2;
    }
}
