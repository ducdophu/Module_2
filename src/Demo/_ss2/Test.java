package Demo._ss2;//package Demo._ss2;
//
//class Test {
//    static void validate(int age) {
//        try {
//            if (age < 18)
//                throw new ArrayIndexOutOfBoundsException("dm loi roi kia mi");
//            else
//                System.out.println("welcome");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void main(String[] args) {
////        long t1 = System.currentTimeMillis();
////
////        for (int i = 0; i < 1000000; i++) {
////            System.out.println("Test");
////        }
////
////        long t2 = System.currentTimeMillis();
////        System.out.println("Truoc khi chay for: " + t1);
////        System.out.println("Sau khi chay for: " + t2);
////        System.out.println("Thoi gian: " + (t2 - t1) + " mls");
////        System.out.println("Sau khi chay for: " + (t2 - t1) / 1000 + " s");
//
//        validate(16);
//        System.out.println("rest of the code...");
//
//    }
//}

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Test {
    void method() throws IOException {
        throw new IOException("Thiet bi");
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}

class TestThrows2 {
    public static void main(String args[]) throws IOException {
        Test m = new Test();
        m.method();
        System.out.println("Luong binh thuong...");

        List list = new ArrayList();

    }


}
