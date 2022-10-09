package org.example;

public class Triangle extends Figure {
    public double a, b, c;
    public double h;
    public final static double TRIANGLE_HIGH = 1.2;

    @Override
    double Area() {
        return TRIANGLE_HIGH * a * h;
    }

    @Override
    double Perimeter() {
        return a + b + c;
    }
}
