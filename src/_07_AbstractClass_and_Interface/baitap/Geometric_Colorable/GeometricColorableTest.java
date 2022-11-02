package _07_AbstractClass_and_Interface.baitap.Geometric_Colorable;

import _07_AbstractClass_and_Interface.baitap.Geometric_Resizeable.Shape;
import _07_AbstractClass_and_Interface.baitap.Geometric_Resizeable.Square;

public class GeometricColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square();
        shapes[1] = new Square(3.3);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            if (shapes[i] instanceof Square) ((Square) shapes[i]).howToColor();
        }
    }
}
