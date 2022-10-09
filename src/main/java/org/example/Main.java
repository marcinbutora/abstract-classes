package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.a = 10.0;
        System.out.println("Area of the square is: " + square.Area());
        System.out.println("Perimeter of the square is: " + square.Perimeter());

        Triangle triangle = new Triangle();
        triangle.a = 5;
        triangle.b = 5;
        triangle.c = 5;
        triangle.h = 5;
        System.out.println("Area of the triangle is: " + triangle.Area());
        System.out.println("Perimeter of the triangle is: " + triangle.Perimeter());

        Square square1 = new Square();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku kwadratu:");
        square1.a = Double.parseDouble(scanner.next());
        System.out.println("Area of the square is: " + square1.Area());
        System.out.println("Perimeter of the square is: " + square1.Perimeter());
    }
}