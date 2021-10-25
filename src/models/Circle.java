package models;

public class Circle extends Shape {
    private Integer x, y;
    private Double r;

    protected Circle(String color, Integer x, Integer y, Double r) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Draw " + this);
    }

    @Override
    Double calcArea() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return getShapeColor() + " circle (" + x + ", " + y + ", " + r + ")";
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }
}
