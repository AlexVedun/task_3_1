package controllers;

import models.Circle;
import models.Rectangle;
import models.Shape;
import models.Triangle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShapeController {
    private static final int SHAPES_COUNT = 15;
    private final String[] colors = {"black", "red", "blue", "yellow", "cyan", "white"};
    private Shape[] shapes;

    ShapeController() {
        shapes = new Shape[SHAPES_COUNT];
    }

    public void generateShapes() {
        for (int i = 0; i < SHAPES_COUNT; i++) {
            switch (getRandomInt(1, 3)) {
                case 1 -> shapes[i] = new Rectangle(
                        getRandomColor(),
                        getRandomInt(0, 5),
                        getRandomInt(0, 5),
                        getRandomInt(6, 10),
                        getRandomInt(6, 10)
                );
                case 2 -> shapes[i] = new Triangle(
                        getRandomColor(),
                        getRandomInt(0, 10),
                        getRandomInt(0, 10),
                        getRandomInt(0, 10),
                        getRandomInt(0, 10),
                        getRandomInt(0, 10),
                        getRandomInt(0, 10)
                );
                case 3 -> shapes[i] = new Circle(
                        getRandomColor(),
                        getRandomInt(0, 10),
                        getRandomInt(0, 10),
                        (double) getRandomInt(0, 10)
                );
            }
        }
    }

    public double getTotalArea() {
        double totalArea = 0;

        for (Shape item : shapes) {
            totalArea += item.calcArea();
        }

        return totalArea;
    }

    public double getTotalArea(Class<?> shapeClass) {
        double totalArea = 0;

        for (Shape item : shapes) {
            if (item.getClass() == shapeClass ) {
                totalArea += item.calcArea();
            }
        }

        return totalArea;
    }

    public void sortByArea() {
        Arrays.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.calcArea(), o2.calcArea());
            }
        });
    }

    public void sortByColor() {
        Arrays.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                List<String> colorList = Arrays.asList(colors);
                int index1 = colorList.indexOf(o1.getShapeColor());
                int index2 = colorList.indexOf(o2.getShapeColor());

                return Integer.compare(index1, index2);
            }
        });
    }

    private int getRandomInt(int a, int b) {
        return (a + (int) (Math.random() * b));
    }

    private String getRandomColor() {
        return colors[getRandomInt(0, colors.length - 1)];
    }

    public Shape[] getShapes() {
        return shapes;
    }
}
