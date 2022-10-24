package Demo._ss7;

interface A {
    void print();
}

interface B {
    void print();
}

class TestInterface1 implements A, B {
    public void print() {
        System.out.println("Hello...");
    }

    public static void main(String[] args) {
        TestInterface1 obj = new TestInterface1();
        obj.print();
    }
}