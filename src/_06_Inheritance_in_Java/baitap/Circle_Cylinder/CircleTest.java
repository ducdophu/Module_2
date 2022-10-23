package _06_Inheritance_in_Java.baitap.Circle_Cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println(circle.getArea());

        circle = new Circle(2, "yellow");
        System.out.println(circle);
        System.out.println(circle.getArea());
    }
}
