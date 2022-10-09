package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {
    public Square square = new Square();
    @Before
    public void setUp() {
        square.a = 10;
    }

    @Test
    public void shouldReturnAreaOfSquare() {
        double area = square.Area();
        Assert.assertEquals(100, area, 0);
    }

    @Test
    public void shouldNotReturnCorrectAreaOfSquare() {
        double area = square.Area();
        Assert.assertNotEquals(99, area, 0);
    }

    @Test
    public void shouldReturnPerimeterOfSquare() {
        double perimeter = square.Perimeter();
        Assert.assertEquals(40, perimeter, 0);
    }

}