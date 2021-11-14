package tests;

import classes.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    private final Triangle triangle = new Triangle("green", 1, 1, 2, 5, 5, 2);

    @Test
    void testCalcArea() {
        assertEquals(triangle.calcArea(), 7.5);
    }
    @Test
    void testGetX1() {
        assertEquals(triangle.getX1(), 1);
    }
    @Test
    void testGetX2() {
        assertEquals(triangle.getX2(), 2);
    }
    @Test
    void testGetX3() {
        assertEquals(triangle.getX3(), 5);
    }
    @Test
    void testGetY1() {
        assertEquals(triangle.getY1(), 1);
    }
    @Test
    void testGetY2() {
        assertEquals(triangle.getY2(), 5);
    }
    @Test
    void testGetY3() {
        assertEquals(triangle.getY3(), 2);
    }
    @Test
    void testToString() {
        assertEquals(triangle.toString(), "green triangle (1, 1, 2, 5, 5, 2)");
    }
    @Test
    void testGetShapeColor() {
        assertEquals(triangle.getShapeColor(), "green");
    }
}
