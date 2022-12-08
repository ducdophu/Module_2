package Demo._ss19.Vidu;

import java.io.IOException;

class TestThrows1 extends Exception {

    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome");
    }

    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
