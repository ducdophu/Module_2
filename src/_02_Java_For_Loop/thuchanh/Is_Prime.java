package _02_Java_For_Loop.thuchanh;

import java.util.Scanner;

public class Is_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số Nguyên cần kiểm tra: ");
        int number = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count += 1;
            }
        }

        if (count == 2) {
            System.out.println("Số " + number + " là số Nguyên tố!");
        } else {
            System.out.println("Số " + number + " KHÔNG phải là số Nguyên tố!");
        }
    }
}
