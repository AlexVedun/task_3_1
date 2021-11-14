package tests;

import classes.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    private final Rectangle rectangle = new Rectangle("white", 2, 1, 5, 10);

    @Test
    void testCalcArea() {
        assertEquals(rectangle.calcArea(), (5 - 2) * (10 - 1));
    }
    @Test
    void testGetX1() {
        assertEquals(rectangle.getX1(), 2);
    }
    @Test
    void testGetX2() {
        assertEquals(rectangle.getX2(), 5);
    }
    @Test
    void testGetY1() {
        assertEquals(rectangle.getY1(), 1);
    }
    @Test
    void testGetY2() {
        assertEquals(rectangle.getY2(), 10);
    }
    @Test
    void testToString() {
        assertEquals(rectangle.toString(), "white rectangle (2, 1, 5, 10)");
    }
    @Test
    void testGetShapeColor() {
        assertEquals(rectangle.getShapeColor(), "white");
    }
}
