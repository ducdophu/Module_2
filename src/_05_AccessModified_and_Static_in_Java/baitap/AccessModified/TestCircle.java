package _05_AccessModified_and_Static_in_Java.baitap.AccessModified;

import _05_AccessModified_and_Static_in_Java.baitap.WriteOnlyClass.Test;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(7);

        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());

        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
    }
}
