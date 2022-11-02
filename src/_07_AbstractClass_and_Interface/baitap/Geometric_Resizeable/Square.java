package _07_AbstractClass_and_Interface.baitap.Geometric_Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public double getSide() {
        return super.getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side= " + getSide() +
                ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area before resizing: " + super.getArea());
        System.out.println("Area after resizing: " + super.getArea() * (100 + percent) / 100);
    }
}
