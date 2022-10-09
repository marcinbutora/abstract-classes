package org.example;

public class Square extends Figure {
    public double a;
    public static final double SQUARE_FIELDS = 4;
    public double Area() {
        return a * a;
    }
    public double Perimeter() {
        return SQUARE_FIELDS * a;
    }
}
