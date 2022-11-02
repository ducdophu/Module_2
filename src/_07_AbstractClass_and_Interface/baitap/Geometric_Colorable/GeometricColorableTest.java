package _07_AbstractClass_and_Interface.baitap.Geometric_Colorable;

public class GeometricColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new Square();
        shapes[2] = new Square(3.3);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            if (shapes[i] instanceof Square) ((Square) shapes[i]).howToColor();
        }
    }
}
