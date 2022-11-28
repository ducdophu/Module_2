package _01_IntroductiontoJava.baitap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        //goi phuong thuc createArray
        int[] arr = createArray(5);
        //in ra mang vua tao tu phuong thuc createArray
        System.out.println("Array 2D has been entered: ");
        for (int x : arr) {
            System.out.print(x + "  ");
        }

    }

    public static int[] createArray(int size) {
        Scanner scanner = new Scanner(System.in);
        do {
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }


}
