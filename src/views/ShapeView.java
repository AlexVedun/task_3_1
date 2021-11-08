package views;

import classes.Shape;

public class ShapeView {
    public void showModels(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    public void showResult(String message, Integer result) {
        System.out.println(message + " " + result);
    }

    public void showResult(String message, Double result) {
        System.out.println(message + " " + result);
    }
}
