package _05_AccessModified_and_Static_in_Java.baitap.AccessModified;

private class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.1415926 * radius * radius;
    }
}
