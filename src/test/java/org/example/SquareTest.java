package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SquareTest {
    public Square square = new Square();
    @Before
    public void setUp() {
        square.a = 10;
    }

    @Test
    public void shouldReturnAreaOfSquare() {
        double area = square.Area();
        assertEquals(100, area, 0);
    }

    @Test
    public void shouldNotReturnCorrectAreaOfSquare() {
        double area = square.Area();
        assertNotEquals(99, area, 0);
    }

    @Test
    public void shouldReturnPerimeterOfSquare() {
        double perimeter = square.Perimeter();
        assertEquals(40, perimeter, 0);
    }

}