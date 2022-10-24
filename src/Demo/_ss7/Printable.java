package Demo._ss7;

public interface Printable {
    void print();
}

interface ShowAble {
    void show();
}

class A6 implements Printable,ShowAble {
    @Override
    public void print() {
        System.out.println("Hello..");
    }

    @Override
    public void show() {
        System.out.println("Welcome...");
    }

    public static void main(String[] args) {
        A6 a6 = new A6();
        a6.print();
        a6.show();
    }
}