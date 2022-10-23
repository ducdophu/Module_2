package _06_Inheritance_in_Java.baitap.Circle_Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());

        cylinder = new Cylinder(3, "white", 5);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
