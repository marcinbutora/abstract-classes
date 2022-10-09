package org.example;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    public Triangle triangle = new Triangle();

    @Before
    public void setUp() {
        triangle.a = 5;
        triangle.b = 5;
        triangle.c = 5;
        triangle.h = 5;
    }

    @Test
    public void shouldReturnAreaOfTriangle() {
        double area = triangle.Area();
        assertEquals(30, area,  0);
    }

    @Test
    public void shouldReturnPerimeterOfTriangle() {
        double perimeter = triangle.Perimeter();
        assertEquals(15, perimeter, 0);
    }
}