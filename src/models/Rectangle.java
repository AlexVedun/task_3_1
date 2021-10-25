package models;

public class Rectangle extends Shape {
    private Integer x1, y1, x2, y2;

    public Rectangle(String color, Integer x1, Integer y1, Integer x2, Integer y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        System.out.println("Draw " + this);
    }

    @Override
    Double calcArea() {
        double a = Math.abs(x1 - x2);
        double b = Math.abs(y1 - y2);

        return (a * b);
    }

    @Override
    public String toString() {
        return getShapeColor() + " rectangle (" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ")";
    }

    public Integer getX1() {
        return x1;
    }

    public void setX1(Integer x1) {
        this.x1 = x1;
    }

    public Integer getY1() {
        return y1;
    }

    public void setY1(Integer y1) {
        this.y1 = y1;
    }

    public Integer getX2() {
        return x2;
    }

    public void setX2(Integer x2) {
        this.x2 = x2;
    }

    public Integer getY2() {
        return y2;
    }

    public void setY2(Integer y2) {
        this.y2 = y2;
    }
}
