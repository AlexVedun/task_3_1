package com.alexeyefr.main;

import classes.Circle;
import classes.Rectangle;
import classes.Triangle;
import controllers.ShapeController;
import models.ShapeModel;
import views.ShapeView;

public class Main {

    public static void main(String[] args) {
        ShapeModel shapeModel = new ShapeModel();
        ShapeView shapeView = new ShapeView();
        ShapeController shapeController = new ShapeController(shapeModel, shapeView);

        System.out.println("Models after creation:");
        shapeController.showModels();
        System.out.println();

        System.out.println("Generate shapes array:");
        shapeController.generateShapes();
        System.out.println();

        shapeController.getTotalArea();
        System.out.println();

        shapeController.getTotalArea(Rectangle.class);
        System.out.println();

        shapeController.getTotalArea(Triangle.class);
        System.out.println();

        shapeController.getTotalArea(Circle.class);
        System.out.println();

        System.out.println("Sort shapes in growing area order:");
        shapeController.sortByArea();
        System.out.println();

        System.out.println("Sort shapes by color:");
        shapeController.sortByColor();
        System.out.println();
    }
}
