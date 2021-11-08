package controllers;

import classes.*;
import models.ShapeModel;
import views.ShapeView;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShapeController {
    private ShapeView view;
    private ShapeModel model;

    public ShapeController(ShapeModel model, ShapeView view) {
        this.view = view;
        this.model = model;
    }

    public void generateShapes() {
        Shape shape;

        for (int i = 0; i < model.getShapesCount(); i++) {
            switch (Helper.getRandomInt(1, 3)) {
                case 1 -> shape = new Rectangle(
                        model.getRandomColor(),
                        Helper.getRandomInt(0, 5),
                        Helper.getRandomInt(0, 5),
                        Helper.getRandomInt(6, 10),
                        Helper.getRandomInt(6, 10)
                );
                case 2 -> shape = new Triangle(
                        model.getRandomColor(),
                        Helper.getRandomInt(0, 10),
                        Helper.getRandomInt(0, 10),
                        Helper.getRandomInt(0, 10),
                        Helper.getRandomInt(0, 10),
                        Helper.getRandomInt(0, 10),
                        Helper.getRandomInt(0, 10)
                );
                default -> shape = new Circle(
                        model.getRandomColor(),
                        Helper.getRandomInt(0, 10),
                        Helper.getRandomInt(0, 10),
                        (double) Helper.getRandomInt(0, 10)
                );
            }
            model.setShape(i, shape);
        }

        view.showModels(model.getShapes());
    }

    public void getTotalArea() {
        double totalArea = 0;

        for (Shape item : model.getShapes()) {
            totalArea += item.calcArea();
        }

        view.showResult("Total area for shapes:", totalArea);
    }

    public void getTotalArea(Class<?> shapeClass) {
        double totalArea = 0;

        for (Shape item : model.getShapes()) {
            if (item.getClass() == shapeClass ) {
                totalArea += item.calcArea();
            }
        }

        view.showResult("Total area for shapes of class " + shapeClass.getName() + ":", totalArea);
    }

    public void sortByArea() {
        Arrays.sort(model.getShapes(), new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.calcArea(), o2.calcArea());
            }
        });

        view.showModels(model.getShapes());
    }

    public void sortByColor() {
        Arrays.sort(model.getShapes(), new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                List<String> colorList = Arrays.asList(model.getColors());
                int index1 = colorList.indexOf(o1.getShapeColor());
                int index2 = colorList.indexOf(o2.getShapeColor());

                return Integer.compare(index1, index2);
            }
        });

        view.showModels(model.getShapes());
    }

    public void showModels() {
        view.showModels(model.getShapes());
    }
}
