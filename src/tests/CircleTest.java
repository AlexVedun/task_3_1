package tests;

import classes.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    private final Circle circle = new Circle("black", 0, 1, 2.0);

    @Test
    void testCalcArea() {
        assertEquals(circle.calcArea(), Math.PI * 2.0 * 2.0);
    }
    @Test
    void testGetX() {
        assertEquals(circle.getX(), 0);
    }
    @Test
    void testGetY() {
        assertEquals(circle.getY(), 1);
    }
    @Test
    void testGetR() {
        assertEquals(circle.getR(), 2.0);
    }
    @Test
    void testToString() {
        assertEquals(circle.toString(), "black circle (0, 1, 2.0)");
    }
    @Test
    void testGetShapeColor() {
        assertEquals(circle.getShapeColor(), "black");
    }
}
