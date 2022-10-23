package _06_Inheritance_in_Java.baitap.Point2D_Point3D;

import java.sql.Array;
import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(1, 2);
        System.out.println(point2D);

        point2D.setXY(2, 4);
        System.out.println(Arrays.toString(point2D.getXY()));

        System.out.println(point2D);
    }
}
