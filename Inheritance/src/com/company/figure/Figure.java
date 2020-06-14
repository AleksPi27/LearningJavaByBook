package com.company.figure;

abstract public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract public double area();
}
