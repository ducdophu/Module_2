package Demo._ss11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MyArrayList {
/*
*
    static int factorial(int n) {
        if (n == 1)
            return 1;
        else{
            System.out.println("helloo");
            return (n * factorial(n - 1));
        }
    }*/
    public static void main(String[] args) {
        //System.out.println("Giai thừa của 5 là: " + factorial(5));

        /*
        *
         List list = new ArrayList<>();
         list.add(2);
         list.add(new Integer(4));
         System.out.println(list.get(4));
         for (Object i : list) {
             System.out.println(i);
         }
         */
        String s1 = "nguyen van a";
        String s2 = new String("nguyen van a");

        System.out.println(s1 == s2);
    }
}
