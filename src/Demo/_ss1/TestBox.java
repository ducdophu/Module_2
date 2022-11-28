package Demo._ss1;

import Demo._ss1.Box;

public class TestBox {
    public static void main(String[] args) {
        Box box = new Box<Integer>(15);
        System.out.println("Gia tri: " + box.getValue());

        Box box1 = new Box<String>("hello");
        System.out.println("Gia tri: " + box1.getValue());

    }
}
