package models;

import classes.Helper;
import classes.Shape;

public class ShapeModel {
    private static final int SHAPES_COUNT = 10;
    private final String[] colors = {"black", "red", "blue", "yellow", "cyan", "white"};
    private Shape[] shapes;

    public ShapeModel() {
        shapes = new Shape[SHAPES_COUNT];
    }

    public String[] getColors() {
        return colors;
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Shape getShape(int index) {
        return this.shapes[index];
    }

    public void setShape(int index, Shape shape) {
        this.shapes[index] = shape;
    }

    public String getRandomColor() {
        return colors[Helper.getRandomInt(0, colors.length - 1)];
    }

    public int getShapesCount() {
        return SHAPES_COUNT;
    }
}
