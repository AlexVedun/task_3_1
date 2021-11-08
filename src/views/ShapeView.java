package views;

import classes.Shape;

public class ShapeView {
    public void showModels(Shape[] shapes) {
        for (Shape shape : shapes) {
            if (shape != null) {
                System.out.println(shape);
            }
        }
    }

    public void showResult(String message, Integer result) {
        System.out.println(message + " " + result);
    }

    public void showResult(String message, Double result) {
        System.out.println(message + " " + result);
    }
}
