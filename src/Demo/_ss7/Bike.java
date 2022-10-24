package Demo._ss7;

public abstract class Bike {
    public abstract void run();
}

class Honda4 extends Bike {
    public void run() {
        System.out.println("running safely..");
    }

    public static void main(String[] args) {
        Bike bike = new Honda4();
        bike.run();
    }
}
