package models;

import interfaces.Drawable;

public abstract class Shape implements Drawable {
    private String shapeColor;

    protected Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    abstract Double calcArea();

    @Override
    public String toString() {
        return null;
    }
}
