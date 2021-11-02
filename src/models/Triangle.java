package models;

public class Triangle extends Shape {
    private Integer x1, y1, x2, y2, x3, y3;

    public Triangle(String color, Integer x1, Integer y1, Integer x2, Integer y2, Integer x3, Integer y3) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }


    @Override
    public void draw() {
        System.out.println("Draw " + this);
    }

    @Override
    public Double calcArea() {
        return (double)(1 / 2 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)));
    }

    @Override
    public String toString()
    {
        return getShapeColor() + " triangle (" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ", " + x3 + ", " + y3 + ")";
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

    public Integer getX3() {
        return x3;
    }

    public void setX3(Integer x3) {
        this.x3 = x3;
    }

    public Integer getY3() {
        return y3;
    }

    public void setY3(Integer y3) {
        this.y3 = y3;
    }
}
