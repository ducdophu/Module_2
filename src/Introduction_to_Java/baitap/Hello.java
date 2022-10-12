package Introduction_to_Java.baitap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
