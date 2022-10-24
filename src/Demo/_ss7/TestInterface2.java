package Demo._ss7;

interface PrintAble {
    void print();
}

interface D {
    void a();
    abstract void b();
    public void c();
    public abstract void d();
}

interface Showable extends PrintAble {
    void show();
}

class TestInterface2 implements Showable {

    public void print() {
        System.out.println("Hello.");
    }

    public void show() {
        System.out.println("Welcome..");
    }

    public static void main(String[] args) {
        TestInterface2 obj = new TestInterface2();
        obj.print();
        obj.show();
    }
}