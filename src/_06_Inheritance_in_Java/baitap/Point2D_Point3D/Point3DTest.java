package _06_Inheritance_in_Java.baitap.Point2D_Point3D;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1, 1, 1);
        System.out.println(point3D);

        point3D.setXYZ(2, 3, 4);
        System.out.println(Arrays.toString(point3D.getXYZ()));

        System.out.println(point3D);
    }
}
